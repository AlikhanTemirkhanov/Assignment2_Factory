package factory;

import direct.*;
import smarthome.products.*;

public class SamsungFactory implements SmartHomeFactory {

    public SmartLight createLight() {
        return new SamsungLight();
    }

    public SmartThermostat createThermostat() {
        return new SamsungThermostat();
    }

    public SecurityCamera createCamera() {
        return new SamsungCamera();
    }
}