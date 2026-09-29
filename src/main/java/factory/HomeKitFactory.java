package factory;

import direct.*;
import smarthome.products.*;

public class HomeKitFactory implements SmartHomeFactory {

    public SmartLight createLight() {
        return new HomeKitLight();
    }

    public SmartThermostat createThermostat() {
        return new HomeKitThermostat();
    }

    public SecurityCamera createCamera() {
        return new HomeKitCamera();
    }
}