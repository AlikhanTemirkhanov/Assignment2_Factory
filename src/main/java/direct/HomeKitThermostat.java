package smarthome.direct;

public class HomeKitThermostat {

    public void setTemperature(int temperature) {
        System.out.println(
                "HomeKit thermostat set to "
                        + temperature
                        + " degrees"
        );
    }
}