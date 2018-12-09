package com.models;

import com.annotations.ElementDesc;
import com.enums.ElementType;
import lombok.Data;

@Data
public class Navbar {

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/div/div/div/span")
    private String name;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/div/div/div/ul/li[1]/a")
    private String homeText;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/div/div/div/ul/li[2]/a")
    private String eventsText;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/div/div/div/ul/li[3]/a")
    private String blogsText;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/div/div/div/ul/li[4]/a")
    private String teamText;

    public Navbar() {
    }

    public Navbar(String name, String homeText, String eventsText, String blogsText, String teamText) {
        this.name = name;
        this.homeText = homeText;
        this.eventsText = eventsText;
        this.blogsText = blogsText;
        this.teamText = teamText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeText() {
        return homeText;
    }

    public void setHomeText(String homeText) {
        this.homeText = homeText;
    }

    public String getEventsText() {
        return eventsText;
    }

    public void setEventsText(String eventsText) {
        this.eventsText = eventsText;
    }

    public String getBlogsText() {
        return blogsText;
    }

    public void setBlogsText(String blogsText) {
        this.blogsText = blogsText;
    }

    public String getTeamText() {
        return teamText;
    }

    public void setTeamText(String teamText) {
        this.teamText = teamText;
    }
}
