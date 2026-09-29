package direct;

import smarthome.products.SmartLight;

public class GoogleLight implements SmartLight {

    public void turnOn() {
        System.out.println("Google light is ON");
    }

    public void turnOff() {
        System.out.println("Google light is OFF");
    }
}