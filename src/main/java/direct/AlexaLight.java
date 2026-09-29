package direct;

import smarthome.products.SmartLight;

public class AlexaLight implements SmartLight {

    public void turnOn() {
        System.out.println("Alexa light is ON");
    }

    public void turnOff() {
        System.out.println("Alexa light is OFF");
    }
}