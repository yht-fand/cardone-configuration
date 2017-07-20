package top.cardone.controller.vx.configuration

import top.cardone.configuration.service.I18nInfoService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import top.cardone.context.ApplicationContextHolder
import top.cardone.web.support.WebSupport

import javax.servlet.http.HttpServletRequest

/**
 * Created by yht
 */
@Controller("top.cardone.controller.vx.configuration.I18nInfoController")
@RequestMapping("/vx/configuration/i18nInfo")
class I18nInfoController {
    /**
     * /c0001.json begin
     **xx/
    @RequestMapping("/c0001.json")
    @ResponseBody
    Object c0001Json(HttpServletRequest request) {
        ApplicationContextHolder.getBean(WebSupport.class).func(request, { input -> ApplicationContextHolder.getBean(I18nInfoService.class).insertByNotExistsCache(input) })
    }
    /** /c0001.json end **/
}