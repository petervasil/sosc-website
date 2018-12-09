package com.models;

import com.annotations.ElementDesc;
import com.enums.ElementType;

public class HomePage {

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div[1]/section/div[1]/p[1]")
    private String name;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div[1]/section/div[1]/p[2]")
    private String description;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div[2]/section/div[2]/p[1]")
    private String exploreClubsTitle;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div[2]/section/div[2]/p[2]")
    private String exploreClubsDescription;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div[3]/section/div[1]/p[1]")
    private String getTrainedTitle;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div[3]/section/div[1]/p[2]")
    private String getTrainedDescription;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div[4]/section/div[2]/p[1]")
    private String getConnectedTitle;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/main/div/div[4]/section/div[2]/p[2]")
    private String getConnectedDescription;

    public HomePage() {
    }

    public HomePage(String name, String description, String exploreClubsTitle, String exploreClubsDescription, String getTrainedTitle, String getTrainedDescription, String getConnectedTitle, String getConnectedDescription) {
        this.name = name;
        this.description = description;
        this.exploreClubsTitle = exploreClubsTitle;
        this.exploreClubsDescription = exploreClubsDescription;
        this.getTrainedTitle = getTrainedTitle;
        this.getTrainedDescription = getTrainedDescription;
        this.getConnectedTitle = getConnectedTitle;
        this.getConnectedDescription = getConnectedDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExploreClubsTitle() {
        return exploreClubsTitle;
    }

    public void setExploreClubsTitle(String exploreClubsTitle) {
        this.exploreClubsTitle = exploreClubsTitle;
    }

    public String getExploreClubsDescription() {
        return exploreClubsDescription;
    }

    public void setExploreClubsDescription(String exploreClubsDescription) {
        this.exploreClubsDescription = exploreClubsDescription;
    }

    public String getGetTrainedTitle() {
        return getTrainedTitle;
    }

    public void setGetTrainedTitle(String getTrainedTitle) {
        this.getTrainedTitle = getTrainedTitle;
    }

    public String getGetTrainedDescription() {
        return getTrainedDescription;
    }

    public void setGetTrainedDescription(String getTrainedDescription) {
        this.getTrainedDescription = getTrainedDescription;
    }

    public String getGetConnectedTitle() {
        return getConnectedTitle;
    }

    public void setGetConnectedTitle(String getConnectedTitle) {
        this.getConnectedTitle = getConnectedTitle;
    }

    public String getGetConnectedDescription() {
        return getConnectedDescription;
    }

    public void setGetConnectedDescription(String getConnectedDescription) {
        this.getConnectedDescription = getConnectedDescription;
    }
}
