package com.models;

import com.annotations.ElementDesc;
import com.enums.ElementType;

public class Footer {

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/footer/div[1]/div/div[1]/a[1]")
    private String githubText;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/footer/div[1]/div/div[1]/a[2]")
    private String instagramText;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/footer/div[1]/div/div[1]/a[3]")
    private String linkedinText;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/footer/div[1]/div/div[2]/a[1]")
    private String guidelinesText;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/footer/div[1]/div/div[2]/a[2]")
    private String codeOfConductText;

    @ElementDesc(elementType = ElementType.FREE_TEXT, xPath = "//*[@id=\"flexContainer\"]/footer/div[1]/div/div[3]/p/strong")
    private String name;

    public Footer() {
    }

    public Footer(String githubText, String instagramText, String linkedinText, String guidelinesText, String codeOfConductText, String name) {
        this.githubText = githubText;
        this.instagramText = instagramText;
        this.linkedinText = linkedinText;
        this.guidelinesText = guidelinesText;
        this.codeOfConductText = codeOfConductText;
        this.name = name;
    }

    public String getGithubText() {
        return githubText;
    }

    public void setGithubText(String githubText) {
        this.githubText = githubText;
    }

    public String getInstagramText() {
        return instagramText;
    }

    public void setInstagramText(String instagramText) {
        this.instagramText = instagramText;
    }

    public String getLinkedinText() {
        return linkedinText;
    }

    public void setLinkedinText(String linkedinText) {
        this.linkedinText = linkedinText;
    }

    public String getGuidelinesText() {
        return guidelinesText;
    }

    public void setGuidelinesText(String guidelinesText) {
        this.guidelinesText = guidelinesText;
    }

    public String getCodeOfConductText() {
        return codeOfConductText;
    }

    public void setCodeOfConductText(String codeOfConductText) {
        this.codeOfConductText = codeOfConductText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
