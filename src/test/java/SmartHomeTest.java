import factory.*;
import direct.*;
import smarthome.products.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartHomeTest {

    // 1. HomeKit factory creates HomeKit Light
    @Test
    void homeKitCreatesHomeKitLight() {
        SmartHomeFactory factory = new HomeKitFactory();

        SmartLight light = factory.createLight();

        assertInstanceOf(HomeKitLight.class, light);
    }

    // 2. Google factory creates Google Light
    @Test
    void googleCreatesGoogleLight() {
        SmartHomeFactory factory = new GoogleFactory();

        SmartLight light = factory.createLight();

        assertInstanceOf(GoogleLight.class, light);
    }

    // 3. Alexa factory creates Alexa Light
    @Test
    void alexaCreatesAlexaLight() {
        SmartHomeFactory factory = new AlexaFactory();

        SmartLight light = factory.createLight();

        assertInstanceOf(AlexaLight.class, light);
    }

    // 4. HomeKit thermostat
    @Test
    void homeKitCreatesThermostat() {
        SmartHomeFactory factory = new HomeKitFactory();

        SmartThermostat thermostat = factory.createThermostat();

        assertInstanceOf(HomeKitThermostat.class, thermostat);
    }

    // 5. Google thermostat
    @Test
    void googleCreatesThermostat() {
        SmartHomeFactory factory = new GoogleFactory();

        SmartThermostat thermostat = factory.createThermostat();

        assertInstanceOf(GoogleThermostat.class, thermostat);
    }

    // 6. Alexa thermostat
    @Test
    void alexaCreatesThermostat() {
        SmartHomeFactory factory = new AlexaFactory();

        SmartThermostat thermostat = factory.createThermostat();

        assertInstanceOf(AlexaThermostat.class, thermostat);
    }

    // 7. HomeKit camera
    @Test
    void homeKitCreatesCamera() {
        SmartHomeFactory factory = new HomeKitFactory();

        SecurityCamera camera = factory.createCamera();

        assertInstanceOf(HomeKitCamera.class, camera);
    }

    // 8. Google camera
    @Test
    void googleCreatesCamera() {
        SmartHomeFactory factory = new GoogleFactory();

        SecurityCamera camera = factory.createCamera();

        assertInstanceOf(GoogleCamera.class, camera);
    }

    // 9. Alexa camera
    @Test
    void alexaCreatesCamera() {
        SmartHomeFactory factory = new AlexaFactory();

        SecurityCamera camera = factory.createCamera();

        assertInstanceOf(AlexaCamera.class, camera);
    }

    // 10. Samsung family creates all products
    @Test
    void samsungCreatesAllProducts() {
        SmartHomeFactory factory = new SamsungFactory();

        assertInstanceOf(SamsungLight.class, factory.createLight());
        assertInstanceOf(SamsungThermostat.class, factory.createThermostat());
        assertInstanceOf(SamsungCamera.class, factory.createCamera());
    }

    // 11. Products implement abstractions
    @Test
    void productsUseInterfaces() {
        SmartHomeFactory factory = new HomeKitFactory();

        SmartLight light = factory.createLight();
        SmartThermostat thermostat = factory.createThermostat();
        SecurityCamera camera = factory.createCamera();

        assertNotNull(light);
        assertNotNull(thermostat);
        assertNotNull(camera);
    }

    // 12. SmartHomeSystem accepts factory abstraction
    @Test
    void systemUsesFactoryAbstraction() {
        SmartHomeFactory factory = new GoogleFactory();

        SmartHomeSystem system = new SmartHomeSystem(factory);

        assertNotNull(system);
    }

    // 13. Night mode can execute
    @Test
    void nightModeWorks() {
        SmartHomeFactory factory = new AlexaFactory();

        SmartHomeSystem system = new SmartHomeSystem(factory);

        assertDoesNotThrow(system::nightMode);
    }

    // 14. Away mode can execute
    @Test
    void awayModeWorks() {
        SmartHomeFactory factory = new HomeKitFactory();

        SmartHomeSystem system = new SmartHomeSystem(factory);

        assertDoesNotThrow(system::awayMode);
    }

    // 15. Activate home can execute
    @Test
    void activateHomeWorks() {
        SmartHomeFactory factory = new SamsungFactory();

        SmartHomeSystem system = new SmartHomeSystem(factory);

        assertDoesNotThrow(system::activateHome);
    }

    // 16. Factory must not be null
    @Test
    void factoryCannotBeNull() {
        assertThrows(
                NullPointerException.class,
                () -> new SmartHomeSystem(null)
        );
    }

    // 17. Samsung products are correct family
    @Test
    void samsungProductsAreCompatible() {
        SmartHomeFactory factory = new SamsungFactory();

        assertTrue(factory.createLight() instanceof SamsungLight);
        assertTrue(factory.createThermostat() instanceof SamsungThermostat);
        assertTrue(factory.createCamera() instanceof SamsungCamera);
    }
}