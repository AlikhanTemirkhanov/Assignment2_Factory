package factory;

import smarthome.products.*;

public interface SmartHomeFactory {

    SmartLight createLight();

    SmartThermostat createThermostat();

    SecurityCamera createCamera();
}