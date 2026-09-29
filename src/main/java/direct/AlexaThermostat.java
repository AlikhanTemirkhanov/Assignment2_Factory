package smarthome.direct;

public class AlexaThermostat {

    public void setTemperature(int temperature) {
        System.out.println(
                "Alexa thermostat set to "
                        + temperature
                        + " degrees"
        );
    }
}