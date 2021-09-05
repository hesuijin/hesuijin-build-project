package com.example.build.utils;

import java.util.Collection;

/**
 * @Description:校验字符串、数组、集合是否为空
 * @Author HeSuiJin
 * @Date 2021/9/5
 */
public class ValidateUtils {


    /**
     * 校验字符串是否为空，为空为true，反之为false
     */
    public static boolean  isBlank(Object... str) {
        for (Object obj : str) {
            if (obj == null || "".equals(obj) || "null".equals(obj) || "(null)".equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 校验字符串是否为空，为空为true，反之为false
     */
    public static boolean isNotBlank(Object... str) {
        for (Object obj : str) {
            if (obj == null || "".equals(obj) || "null".equals(obj) || "(null)".equals(obj)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 校验数组是否为空，为空为true，反之为false
     */
    public static boolean isEmptyForArray(Object... args) {
        if (args != null && args.length > 0) {
            return false;
        }
        return true;
    }


    /**
     * 校验集合是否为空，为空为true，反之为false
     */
    @SuppressWarnings("rawtypes")
    public static boolean isEmptyForCollection(Collection list) {
        if (list != null && list.size() > 0) {
            return false;
        }
        return true;
    }
}
