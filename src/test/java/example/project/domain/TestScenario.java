package example.project.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestScenario {
    
    Scenario s1 = new Scenario();
    Scenario s2 = new Scenario();

    @BeforeEach
    public void init() {
        s1.roadType = "curve";
        s1.weatherCondition = "clean";
        s1.initEgoCarPos = Arrays.asList(0F, 0F);
        s1.initCarInFrontPos = Arrays.asList(0.5F, 0.5F);

        s2.roadType = "curve";
        s2.weatherCondition = "clean";
        s2.initEgoCarPos = Arrays.asList(0F, 0F);
        s2.initCarInFrontPos = Arrays.asList(0.51F, 0.51F);
    }

    @Test
    public void testEquality() {
        assertEquals(s1.roadType, s2.roadType);
        assertEquals(s1.weatherCondition, s2.weatherCondition);


        if(s1.initEgoCarPos.get(0) - s2.initEgoCarPos.get(0) < 0.05 && s1.initEgoCarPos.get(1) - s2.initEgoCarPos.get(1) < 0.05) {
            assertEquals(s1.initEgoCarPos, s2.initEgoCarPos);
        }
        else {
            fail("Ego car positions are not equal");
        }
        // delete the above line and implement this properly to test if two scenarios are equal.
        // Let's define our equality as follows:
        // (1) roadType and weatherCondition must be the same.
        // (2) If Euclidean distance between the egoCar and car-in-front is less than 0.05, then they are equal in terms of car positions.
    }
}
