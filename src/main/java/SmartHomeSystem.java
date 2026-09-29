import factory.SmartHomeFactory;
import smarthome.products.*;

public class SmartHomeSystem {

    private final SmartLight light;
    private final SmartThermostat thermostat;
    private final SecurityCamera camera;

    public SmartHomeSystem(SmartHomeFactory factory) {
        this.light = factory.createLight();
        this.thermostat = factory.createThermostat();
        this.camera = factory.createCamera();
    }

    public void activateHome() {
        light.turnOn();
        thermostat.setTemperature(22);
        camera.startMonitoring();
        System.out.println("Home activated.");
    }

    public void nightMode() {
        light.turnOff();
        thermostat.setTemperature(19);
        camera.startMonitoring();
        System.out.println("Night mode activated.");
    }

    public void awayMode() {
        light.turnOff();
        thermostat.setTemperature(18);
        camera.startMonitoring();
        System.out.println("Away mode activated.");
    }
}