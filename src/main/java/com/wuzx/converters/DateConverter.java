package com.wuzx.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springmvc->DateConverter
 * @description: 日期类型转换
 * @author: wuzx
 * @create: 2019-09-09 16:23
 * @version: 1.0
 **/
@Component
public class DateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        if (s!= null) {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return sd.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
