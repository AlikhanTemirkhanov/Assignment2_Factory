package direct;

import smarthome.products.SmartThermostat;

public class SamsungThermostat implements SmartThermostat {

    public void setTemperature(int temperature) {
        System.out.println("Samsung thermostat set to " + temperature + " degrees");
    }
}