package com.models;

import com.annotations.ElementDesc;
import com.enums.ElementType;
import lombok.Data;

@Data
public class Blog {

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div[1]/div[1]/p[2]")
    private String title;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div[1]/div[1]/div[2]/div/div[1]/a")
    private String authorName;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div[1]/div[1]/div[2]/div/div[2]")
    private String date;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div[1]/div[1]/p[3]")
    private String description;

    public Blog() {
    }

    public Blog(String title, String authorName, String date, String description) {
        this.title = title;
        this.authorName = authorName;
        this.date = date;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
