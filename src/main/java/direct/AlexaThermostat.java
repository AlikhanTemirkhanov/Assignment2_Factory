package direct;

import smarthome.products.SmartThermostat;

public class AlexaThermostat implements SmartThermostat {

    public void setTemperature(int temperature) {
        System.out.println(
                "Alexa thermostat set to "
                        + temperature
                        + " degrees"
        );
    }
}