package com.models;

import com.annotations.ElementDesc;
import com.enums.ElementType;
import lombok.Data;

@Data
public class Event {

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div/div[2]/div[2]/h2[1]")
    private String title;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div/div[2]/div[1]/span[1]")
    private String date;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div/div[2]/div[1]/span[2]")
    private String place;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div/div[2]/div[2]/p[1]")
    private String description;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div/div/div/div[2]/div[2]/h3")
    private String time;

    public Event() {
    }

    public Event(String title, String date, String place, String description, String time) {
        this.title = title;
        this.date = date;
        this.place = place;
        this.description = description;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
