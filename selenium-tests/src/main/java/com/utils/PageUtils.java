package com.utils;

import com.annotations.ElementDesc;
import com.models.Blog;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.text.WordUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PageUtils {

    public static Object getObjectFromPage(Class<?> clazz, WebDriver driver) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Object object = clazz.getDeclaredConstructor().newInstance();

        for (Field field : getFieldsWithSpecificAnnotation(clazz, ElementDesc.class)) {

            String value = getElementValueAsString(field.getAnnotation(ElementDesc.class), driver);


        }


        return object;
    }

    private static List<Field> getFieldsWithSpecificAnnotation(Class clazz, Class<? extends Annotation> annotationClass) {
        return Arrays.stream(clazz.getDeclaredFields())
                .filter(field -> field.getAnnotation(annotationClass) != null)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Blog blog = new Blog();

        System.out.println("Fields " + PageUtils.getFieldsWithSpecificAnnotation(Blog.class, ElementDesc.class));
    }

    private static String getElementValueAsString(ElementDesc elementDesc, WebDriver driver) {

        String xPath = elementDesc.xPath();

        WebElement element = driver.findElement(By.xpath(xPath));

        String result;

        switch (elementDesc.elementType()) {
            case FREE_TEXT:
                result = element.getText();
                break;

            default:
                throw new NotImplementedException("Not implemented yet for type " + elementDesc.elementType());
        }

        return result;
    }


    private static void setValueToField(Object object, Field field, String value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method setter = object.getClass().getMethod("set" + WordUtils.capitalize(field.getName()));

        if (setter.getReturnType() == Boolean.class) {
            setter.invoke(ConvertUtils.convertStringToBool(value));
        }
    }

}
