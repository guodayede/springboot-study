package com.example.springboot_date.converter;

import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @author gyc
 * @title: ControllerHandler
 * @projectName app
 * @date 2019/8/1914:37
 * @description: 将时间转换类应用到接口上
 */
@ControllerAdvice
public class CourseControllerHandler {
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        GenericConversionService genericConversionService = (GenericConversionService) binder.getConversionService();
        if (genericConversionService != null) {
            genericConversionService.addConverter(new CourseDateConverter());
        }
    }
}