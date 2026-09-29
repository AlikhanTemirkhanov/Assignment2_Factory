package direct;

import smarthome.products.SecurityCamera;

public class SamsungCamera implements SecurityCamera {

    public void startMonitoring() {
        System.out.println("Samsung camera started monitoring");
    }
}