package direct;

import smarthome.products.SmartLight;

public class SamsungLight implements SmartLight {

    public void turnOn() {
        System.out.println("Samsung light is ON");
    }

    public void turnOff() {
        System.out.println("Samsung light is OFF");
    }
}