package top.cardone.controller;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.CharEncoding;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MessageUtils;
import top.cardone.core.CodeException;

import java.io.Writer;
import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/1/5.
 */
@ControllerAdvice
@Log4j2
public class AdviceController {
    /**
     * 500页面或500json数据
     *
     * @param ex
     * @param request
     * @param response
     * @return
     */
    @ExceptionHandler({Throwable.class})
    public String exception(Throwable ex, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
        log.error(ex.getMessage(), ex);

        String servletPath = request.getServletPath();

        if (!StringUtils.endsWithIgnoreCase(servletPath, "json")) {
            return "error";
        }

        response.setCharacterEncoding(CharEncoding.UTF_8);
        response.setContentType("application/json");

        try (Writer out = response.getWriter()) {
            Map<String, String> errorInfo = Maps.newHashMap();

            errorInfo.put("url", servletPath);

            if (ex instanceof CodeException) {
                CodeException codeException = (CodeException) ex;

                errorInfo.put("errorCode", codeException.getCode());
                errorInfo.put("error", MessageUtils.getMessage(codeException.getCode(), codeException.getArgs(), codeException.getCode()));
            } else {
                errorInfo.put("errorCode", "000000");
                errorInfo.put("error", ex.getMessage());
            }

            String json = ApplicationContextHolder.func(Gson.class, gson -> gson.toJson(errorInfo));

            out.write(json);

            out.flush();
        } catch (java.io.IOException e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}