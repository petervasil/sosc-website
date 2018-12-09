package com.utils;

import com.annotations.ElementDesc;
import org.apache.commons.lang3.NotImplementedException;
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

    public static Object getObjectFromPage(Class<?> clazz, WebDriver driver) {

        Object object = null;

        try {
            object = clazz.getDeclaredConstructor().newInstance();

            for (Field field : getFieldsWithSpecificAnnotation(clazz, ElementDesc.class)) {

                String value = getElementValueAsString(field.getAnnotation(ElementDesc.class), driver);

                setValueToField(object, field, value);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return object;
    }

    private static List<Field> getFieldsWithSpecificAnnotation(Class clazz, Class<? extends Annotation> annotationClass) {
        return Arrays.stream(clazz.getDeclaredFields())
                .filter(field -> field.getAnnotation(annotationClass) != null)
                .collect(Collectors.toList());
    }

    private static String getElementValueAsString(ElementDesc elementDesc, WebDriver driver) {

        String xPath = elementDesc.xPath();

        WebElement element = driver.findElement(By.xpath(xPath));

        String result;

        switch (elementDesc.elementType()) {
            case FREE_TEXT:
            case EDIT_BOX:
                result = element.getText();
                break;
            default:
                throw new NotImplementedException("Not implemented yet for type " + elementDesc.elementType());
        }

        return result;
    }


    private static void setValueToField(Object object, Field field, String value) throws InvocationTargetException, IllegalAccessException {

        Method setter = Arrays.stream(object.getClass().getMethods())
                .filter(method -> method.getName().equalsIgnoreCase("set" + field.getName())).findFirst().get();

        if (setter.getReturnType() == Boolean.class) {
            setter.invoke(object, ConvertUtils.convertStringToBool(value));
        } else {
            setter.invoke(object, value);
        }
    }

}
