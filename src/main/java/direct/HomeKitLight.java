package direct;

import smarthome.products.SmartLight;

public class HomeKitLight implements SmartLight {

    public void turnOn() {
        System.out.println("HomeKit light is ON");
    }

    public void turnOff() {
        System.out.println("HomeKit light is OFF");
    }
}