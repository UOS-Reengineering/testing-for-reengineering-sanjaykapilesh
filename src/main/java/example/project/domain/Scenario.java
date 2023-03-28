package example.project.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * A class defining the definition of a driving scenario, which is dependent on the domain/application.
 * This must be modified and updated with class Snapshot.
 */
public class Scenario {
    String roadType;
    String weatherCondition;
    List<Float> initEgoCarPos;  // (x, y)
    List<Float> initCarInFrontPos;  // (x, y)

    public Scenario() {
        roadType = null;
        weatherCondition = null;
        initEgoCarPos = null;
        initCarInFrontPos = null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        Scenario scenario = (Scenario) obj;
        return roadType.equals(scenario.roadType)
                && weatherCondition.equals(scenario.weatherCondition)
                && initEgoCarPos.equals(scenario.initEgoCarPos)
                && initCarInFrontPos.equals(scenario.initCarInFrontPos);
    }

    public Scenario(String scenarioDescription) {
        // parse scenarioDescription and save the result to the class attributes
        // not implemented
    }
}
