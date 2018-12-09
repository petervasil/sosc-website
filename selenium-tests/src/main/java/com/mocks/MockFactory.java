package com.mocks;

import com.models.*;

public class MockFactory {

    public static Footer getFooter() {
        return new Footer("GitHub", "Instagram", "LinkedIn",
                "Community Guidelines", "Code of Conduct", "Sahyadri Open-Source Community");
    }

    public static Navbar getNavbar() {
        return new Navbar("SOSC", "Home", "Events", "Blogs", "Team");
    }

    public static HomePage getHomePage() {
        return new HomePage("Sahyadri\nOpen Source Community",
                "A community driven by tech enthusiasts and open-source contributors, to help young students to be part of the open-source ecosystem by providing training and skill development.",
                "Explore clubs and Activities",
                "SOSC is a conglomeration of clubs and individuals who contribute to the community by helping us conduct events and activities. there are numerous clubs and experts who help shape the community to be pro-active. Mozilla Campus Clubs, Developer Students clubs, and the GitHub Campus Expert are to name a few.",
                "Get Trained by Experts",
                "SOSC is all about helping each other to learn and improve, we conduct workshops and trainings led by speakers from other technical communities, and student experts. Keeping up to date with latest technologies and learning new things is what most of love. Here is your chance to attend workshops, training and even host non-profit events to help others.",
                "Get Connected !",
                "Meet people with similar interest to work together on projects and host events to build a better collaborative environment. We are more than 100 members with interests on various fields of technology here to know each other and get connected. Meet our members to know more about us and build something cool!");
    }

    public static Event getEvent() {
        return new Event("Introduction to Data Manipulation and Data Visualization",
                "17-Nov-2018",
                "iWave Lab",
                "As people progress in their journeys on becoming a data scientist, they often overlook a crucial ascpect of it. Basics of data analysis. With this workshop, we hope to be able to convey the basics of understanding certain patterns in data while pre-processing and also the simple manipulations that one can perform on them.",
                "Time: 2:00 PM IST");
    }

    public static Blog getBlog() {
        return new Blog("Lessons from hosting a hackathon for complete beginners, and why they liked it.",
                "Musthaq Ahamad",
                "29-Oct-2018",
                "For years hackathons have been known for huge cash prizes for winners. Sometimes the numbers are just humungous. Having a huge cash prize means, attracting more hackers, giving rise to a complete competitive enviroment."
        );
    }
}
