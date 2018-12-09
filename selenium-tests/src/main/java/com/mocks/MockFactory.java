package com.mocks;

import com.models.Footer;

public class MockFactory {

    public static Footer getFooter() {
        return new Footer("GitHub", "Instagram", "LinkedIn",
                "Community Guidelines", "Code of Conduct", "Sahyadri Open-Source Community");
    }
}
