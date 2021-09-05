package com.example.build.common;

import com.example.build.utils.ValidateUtils;

/**
 * @Description:
 * @Author HeSuiJin
 * @Date 2021/9/5
 */
public class CommonTest {

    public static void main(String[] args) {
        String stringIsBlank = "";
        if(ValidateUtils.isBlank(stringIsBlank)){
            System.out.println("stringIsBlank" +"为空字符串");
        }

        String stringIsNotBlank = "我不是空字符串";
        if(ValidateUtils.isNotBlank(stringIsNotBlank)){
            System.out.println("stringIsNotBlank" +"不为空字符串");
        }

    }

}
