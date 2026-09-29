package direct;

import smarthome.products.SmartThermostat;

public class GoogleThermostat implements SmartThermostat {

    public void setTemperature(int temperature) {
        System.out.println(
                "Google thermostat set to "
                        + temperature
                        + " degrees"
        );
    }
}