package factory;

import direct.GoogleLight;
import smarthome.products.SmartLight;

public class GoogleLightCreator extends LightCreator {

    @Override
    public SmartLight createLight() {
        return new GoogleLight();
    }
}