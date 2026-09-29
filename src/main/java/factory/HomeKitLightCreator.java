package factory;

import direct.HomeKitLight;
import smarthome.products.SmartLight;

public class HomeKitLightCreator extends LightCreator {

    @Override
    public SmartLight createLight() {
        return new HomeKitLight();
    }
}