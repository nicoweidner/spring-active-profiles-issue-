package com.example.springactiveprofilesissue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;

@ActiveProfiles("additionalProfile")
@SpringBootTest(properties = {"spring.profiles.active=default"})
class SpringActiveProfilesIssueApplicationTests {

    @Autowired
    private Environment environment;

    @Test
    public void showActiveProfiles() {
        // prints [additionalProfile, default] if using 2.5.6 or lower
        // prints [default] if using 2.5.7 or higher
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
    }

}
