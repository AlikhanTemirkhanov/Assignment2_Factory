package factory;

public class FactoryProvider {

    public static SmartHomeFactory getFactory(String family) {

        if (family == null) {
            throw new IllegalArgumentException("Family cannot be null");
        }

        return switch (family.toLowerCase()) {

            case "homekit" -> new HomeKitFactory();

            case "google" -> new GoogleFactory();

            case "alexa" -> new AlexaFactory();

            case "samsung" -> new SamsungFactory();

            default -> throw new IllegalArgumentException(
                    "Unknown family: " + family
            );
        };
    }
}