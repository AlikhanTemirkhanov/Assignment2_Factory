package factory;

import smarthome.products.SmartLight;

public abstract class LightCreator {

    public abstract SmartLight createLight();

    public void turnOnLight() {
        SmartLight light = createLight();

        light.turnOn();

        System.out.println("Light was created and turned on successfully.");
    }

    public void turnOffLight() {
        SmartLight light = createLight();

        light.turnOff();

        System.out.println("Light was turned off successfully.");
    }
}