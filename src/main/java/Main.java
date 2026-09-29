package smarthome;

import smarthome.direct.*;

public class Main {

    public static void main(String[] args) {

        String family = "alexa";

        if (family.equals("homekit")) {

            HomeKitLight light = new HomeKitLight();
            HomeKitThermostat thermostat = new HomeKitThermostat();
            HomeKitCamera camera = new HomeKitCamera();

            light.turnOn();
            thermostat.setTemperature(22);
            camera.startMonitoring();

        } else if (family.equals("google")) {

            GoogleLight light = new GoogleLight();
            GoogleThermostat thermostat = new GoogleThermostat();
            GoogleCamera camera = new GoogleCamera();

            light.turnOn();
            thermostat.setTemperature(22);
            camera.startMonitoring();

        } else if (family.equals("alexa")) {

            AlexaLight light = new AlexaLight();
            AlexaThermostat thermostat = new AlexaThermostat();
            AlexaCamera camera = new AlexaCamera();

            light.turnOn();
            thermostat.setTemperature(22);
            camera.startMonitoring();
        }
    }
}

