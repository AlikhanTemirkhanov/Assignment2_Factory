package direct;

import smarthome.products.SecurityCamera;

public class HomeKitCamera implements SecurityCamera {

    public void startMonitoring() {
        System.out.println("HomeKit camera started monitoring");
    }
}