package top.cardone.controller.vx.configuration;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yht
 */
@Log4j2
@Controller("top.cardone.controller.vx.configuration.DictionaryController")
@RequestMapping("/vx/configuration/dictionary")
public class DictionaryController {
    /**
     * /c0001.json begin
     **xx/
     @RequestMapping("/c0001.json")
     @ResponseBody public Object c0001Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> {
     Map<String, Object> readOne = Maps.newHashMap();

     readOne.put("dictionaryCode", MapUtils.getString(input, "dictionaryCode"));

     int count = ApplicationContextHolder.getBean(DictionaryService.class).readOne(Integer.class, readOne);

     if (count > 0) {
     throw new CodeException("dictionaryCode already exists", "字典编号已经存在");
     }

     return ApplicationContextHolder.getBean(DictionaryService.class).insertByNotExistsCache(input);
     });
     }
     /** /c0001.json end **/

    /**
     * /c0002.json begin
     **xx/
     @RequestMapping("/c0002.json")
     @ResponseBody public Object c0002Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).insertByNotExistsCache(input));
     }
     /** /c0002.json end **/

    /**
     * /c0003.json begin
     **xx/
     @RequestMapping("/c0003.json")
     @ResponseBody public Object c0003Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).insertByNotExistsCache(input));
     }
     /** /c0003.json end **/

    /**
     * /c0004.json begin
     **xx/
     @RequestMapping("/c0004.json")
     @ResponseBody public Object c0004Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).insertByNotExistsCache(input));
     }
     /** /c0004.json end **/

    /**
     * /d0001.json begin
     **xx/
     @RequestMapping("/d0001.json")
     @ResponseBody public Object d0001Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).updateListCache((List) MapUtils.getObject(input, "dictionaryIds")));
     }
     /** /d0001.json end **/

    /**
     * /d0002.json begin
     **xx/
     @RequestMapping("/d0002.json")
     @ResponseBody public Object d0002Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).deleteListCache((List) MapUtils.getObject(input, "dictionaryIds")));
     }
     /** /d0002.json end **/

    /**
     * /d0003.json begin
     **xx/
     @RequestMapping("/d0003.json")
     @ResponseBody public Object d0003Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).updateListCache((List) MapUtils.getObject(input, "dictionaryIds")));
     }
     /** /d0003.json end **/

    /**
     * /d0004.json begin
     **xx/
     @RequestMapping("/d0004.json")
     @ResponseBody public Object d0004Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).updateListCache((List) MapUtils.getObject(input, "dictionaryIds")));
     }
     /** /d0004.json end **/

    /**
     * /m0001.json begin
     **xx/
     @RequestMapping("/m0001.json")
     @ResponseBody public Object m0001Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).findOne(input));
     }
     /** /m0001.json end **/

    /**
     * /m0002.json begin
     **xx/
     @RequestMapping("/m0002.json")
     @ResponseBody public Object m0002Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).findOne(input));
     }
     /** /m0002.json end **/

    /**
     * /m0003.json begin
     **xx/
     @RequestMapping("/m0003.json")
     @ResponseBody public Object m0003Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).findOne(input));
     }
     /** /m0003.json end **/


    //@Value("file:upload")
    //private String uploadPath;

    /**
     * /m0004.json begin
     **xx/
     @RequestMapping("/m0004.json")
     @ResponseBody public Object m0004Json(HttpServletRequest request, HttpServletResponse response) throws Exception {
     ApplicationContextHolder.getBean(WebSupport.class).importExcel(request, response,
     (Func1<Object, List<Map<String, Object>>>) inputList -> ApplicationContextHolder.getBean(DictionaryService.class).insertListByNotExistsCache(Lists.newArrayList(inputList)));
     }
     /** /m0004.json end **/

    /**
     * /r0001.json begin
     **xx/
     @RequestMapping("/r0001.json")
     @ResponseBody public Object r0001Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).page(input));
     }
     /** /r0001.json end **/

    /**
     * /r0002.json begin
     **xx/
     @RequestMapping("/r0002.json")
     @ResponseBody public Object r0002Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).findListByKeyword(input));
     }
     /** /r0002.json end **/

    /**
     * /r0003.json begin
     **xx/
     @RequestMapping("/r0003.json")
     @ResponseBody public Object r0003Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).page(input));
     }
     /** /r0003.json end **/

    /**
     * /r0004.json begin
     **xx/
     @RequestMapping("/r0004.json")
     @ResponseBody public Object r0004Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).page(input));
     }
     /** /r0004.json end **/

    /**
     * /u0001.json begin
     **xx/
     @RequestMapping("/u0001.json")
     @ResponseBody public Object u0001Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> {
     Map<String, Object> readOne = Maps.newHashMap();

     readOne.put("dictionaryCode", MapUtils.getString(input, "dictionaryCode"));
     readOne.put("object_id", "dictionaryId");

     String dbDictionaryId = ApplicationContextHolder.getBean(DictionaryService.class).readOne(String.class, readOne);

     if (dbDictionaryId != null) {
     String dictionaryId = MapUtils.getString(input, "dictionaryId");

     if (!StringUtils.equals(dbDictionaryId, dictionaryId)) {
     throw new CodeException("dictionaryCode already exists", "字典编号已经存在");
     }
     }

     return ApplicationContextHolder.getBean(DictionaryService.class).updateCache(input);
     });
     }
     /** /u0001.json end **/

    /**
     * /u0002.json begin
     **xx/
     @RequestMapping("/u0002.json")
     @ResponseBody public Object u0002Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).updateCache(input));
     }
     /** /u0002.json end **/

    /**
     * /u0003.json begin
     **xx/
     @RequestMapping("/u0003.json")
     @ResponseBody public Object u0003Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).updateCache(input));
     }
     /** /u0003.json end **/

    /**
     * /u0004.json begin
     **xx/
     @RequestMapping("/u0004.json")
     @ResponseBody public Object u0004Json(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).updateCache(input));
     }
     /** /u0004.json end **/

    /**
     * /addModal.json begin
     **xx/
     @RequestMapping("/addModal.json")
     @ResponseBody public Object addModalJson(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).findOneByDictionaryId(input));
     }
     /** /addModal.json end **/

    /**
     * /modifyModal.json begin
     **xx/
     @RequestMapping("/modifyModal.json")
     @ResponseBody public Object modifyModalJson(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).findOneByDictionaryId(input));
     }
     /** /modifyModal.json end **/

    /**
     * /index.json begin
     **xx/
     @RequestMapping("/index.json")
     @ResponseBody public Object indexJson(HttpServletRequest request) {
     return ApplicationContextHolder.getBean(WebSupport.class).func(request,
     (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(DictionaryService.class).findOneByDictionaryId(input));
     }
     /** /index.json end **/
}