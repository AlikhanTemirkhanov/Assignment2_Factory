package direct;

import smarthome.products.SecurityCamera;

public class AlexaCamera implements SecurityCamera {

    public void startMonitoring() {
        System.out.println("Alexa camera started monitoring");
    }
}