import factory.*;

public class Main {

    public static void main(String[] args) {

        String family;

        if (args.length > 0) {
            family = args[0];
        } else {
            family = "homekit";
        }

        SmartHomeFactory factory;

        switch (family.toLowerCase()) {

            case "homekit":
                factory = new HomeKitFactory();
                break;

            case "google":
                factory = new GoogleFactory();
                break;

            case "alexa":
                factory = new AlexaFactory();
                break;

            case "samsung":
                factory = new SamsungFactory();
                break;

            default:
                throw new IllegalArgumentException(
                        "Unknown family: " + family
                );
        }

        SmartHomeSystem system =
                new SmartHomeSystem(factory);

        System.out.println("Selected family: " + family);

        System.out.println("\n=== Activate Home ===");
        system.activateHome();

        System.out.println("\n=== Night Mode ===");
        system.nightMode();

        System.out.println("\n=== Away Mode ===");
        system.awayMode();
    }
}