package top.cardone.configuration.utils;

import lombok.NonNull;
import org.springframework.util.StringUtils;
import top.cardone.cache.Cache;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;

import java.util.List;
import java.util.Map;

public class DictionaryUtils {
    public static Map<String, Object> findOneCache(Object findOne) {
        return ApplicationContextHolder.getBean(Cache.class).get(DictionaryService.class.getName(), findOne,
                () -> ApplicationContextHolder.getBean(DictionaryService.class)
                        .findOne(findOne));
    }

    public static <P> P findOneCache(Class<P> mappedClass, Object findOne) {
        String key = StringUtils.arrayToCommaDelimitedString(new Object[]{mappedClass, findOne});

        return ApplicationContextHolder.getBean(Cache.class).get(DictionaryService.class.getName(), key,
                () -> ApplicationContextHolder.getBean(DictionaryService.class)
                        .findOne(mappedClass, findOne));
    }

    public static <R> R readOneCache(@NonNull Class<R> requiredType, Object readOne) {
        String key = StringUtils.arrayToCommaDelimitedString(new Object[]{requiredType, readOne});

        return ApplicationContextHolder.getBean(Cache.class).get(DictionaryService.class.getName(), key,
                () -> ApplicationContextHolder.getBean(DictionaryService.class)
                        .readOne(requiredType, readOne));
    }

    public static Object readOneByDictionaryTypeCodesCache(Map<String, Object> readOne) {
        return ApplicationContextHolder.getBean(Cache.class).get(DictionaryService.class.getName(), readOne,
                () -> ApplicationContextHolder.getBean(DictionaryService.class)
                        .readOneByDictionaryTypeCodes(readOne));
    }

    public static List<Map<String, Object>> findListByDictionaryTypeCodesCache(String dictionaryTypeCodes) {
        return ApplicationContextHolder.getBean(Cache.class).get(DictionaryService.class.getName(), dictionaryTypeCodes,
                () -> ApplicationContextHolder.getBean(DictionaryService.class)
                        .findListByDictionaryTypeCodes(dictionaryTypeCodes));
    }

    public static String readOneValueByCodeCache(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        String key = StringUtils.arrayToCommaDelimitedString(new String[]{dictionaryTypeCode, dictionaryCode});

        return ApplicationContextHolder.getBean(Cache.class).get(DictionaryService.class.getName(), key,
                () -> ApplicationContextHolder.getBean(DictionaryService.class)
                        .readOneValueByCode(dictionaryTypeCode, dictionaryCode, defaultValue));
    }

    public static List<Map<String, Object>> findListByDictionaryTypeCodeCache(String dictionaryTypeCode) {
        return ApplicationContextHolder.getBean(Cache.class).get(DictionaryService.class.getName(), dictionaryTypeCode,
                () -> ApplicationContextHolder.getBean(DictionaryService.class)
                        .findListByDictionaryTypeCode(dictionaryTypeCode));
    }
}
