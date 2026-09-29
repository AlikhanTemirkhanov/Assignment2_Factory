package factory;

import direct.AlexaLight;
import smarthome.products.SmartLight;

public class AlexaLightCreator extends LightCreator {

    @Override
    public SmartLight createLight() {
        return new AlexaLight();
    }
}