package com.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CompareUtils {

    public static boolean compareObjects(Object object1, Object object2) {

        try {
            for (String fieldName : Arrays.stream(object1.getClass().getDeclaredFields()).map(Field::getName).collect(Collectors.toList())) {

                String value1 = getValueAsString(object1, fieldName);
                String value2 = getValueAsString(object2, fieldName);

                if (!value1.equals(value2)) {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    private static String getValueAsString(Object object, String fieldName) throws InvocationTargetException, IllegalAccessException {
        Method getter = Arrays.stream(object.getClass().getMethods())
                .filter(method -> method.getName().equalsIgnoreCase("get" + fieldName))
                .findFirst().get();

        return (String) getter.invoke(object);
    }
}
