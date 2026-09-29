package factory;

import direct.*;
import smarthome.products.*;

public class GoogleFactory implements SmartHomeFactory {

    public SmartLight createLight() {
        return new GoogleLight();
    }

    public SmartThermostat createThermostat() {
        return new GoogleThermostat();
    }

    public SecurityCamera createCamera() {
        return new GoogleCamera();
    }
}