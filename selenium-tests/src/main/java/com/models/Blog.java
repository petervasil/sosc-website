package com.models;

import com.annotations.ElementDesc;
import com.enums.ElementType;
import lombok.Data;

@Data
public class Blog {

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "some_xpath")
    private String title;
}
