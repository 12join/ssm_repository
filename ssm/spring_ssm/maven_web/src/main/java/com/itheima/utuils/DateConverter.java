package com.itheima.utuils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        if(source==null){
            throw new RuntimeException("请输入你想输的参数");
        }
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sd.parse(source);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("请你输入正确的参数");
        }
    }
}
