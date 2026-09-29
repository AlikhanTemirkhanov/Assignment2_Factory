package direct;

import smarthome.products.SecurityCamera;

public class GoogleCamera implements SecurityCamera {

    public void startMonitoring() {
        System.out.println("Google camera started monitoring");
    }
}