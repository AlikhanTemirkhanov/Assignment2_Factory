package direct;

import smarthome.products.SmartThermostat;

public class HomeKitThermostat implements SmartThermostat {

    public void setTemperature(int temperature) {
        System.out.println(
                "HomeKit thermostat set to "
                        + temperature
                        + " degrees"
        );
    }
}