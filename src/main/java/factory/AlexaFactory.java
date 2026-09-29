package factory;

import direct.*;
import smarthome.products.*;

public class AlexaFactory implements SmartHomeFactory {

    public SmartLight createLight() {
        return new AlexaLight();
    }

    public SmartThermostat createThermostat() {
        return new AlexaThermostat();
    }

    public SecurityCamera createCamera() {
        return new AlexaCamera();
    }
}