package factory;

import direct.*;
import smarthome.products.SmartLight;

public abstract class LightCreator {

    public abstract SmartLight createLight();

    public void turnOnLight() {
        SmartLight light = createLight();
        light.turnOn();
        System.out.println("Light is ready for use.");
    }
}