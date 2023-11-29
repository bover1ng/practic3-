import java.util.ArrayList;
import java.util.List;

public class Max {
    public static void createMaxBuild() {
        List<Processor> processors = new ArrayList<>();
        List<Mainboard> mainboards = new ArrayList<>();
        List<PowerSupply> powerSupplies = new ArrayList<>();
        List<VideoCards> graphicsCards = new ArrayList<>();
        List<SSD> ssdDrives = new ArrayList<>();
        List<SoundCards> soundCards = new ArrayList<>();

        processors.add(new Processor(TypeProcessor.AMD, "AMD Ryzen 9 7950X3D", 4.2, 744.0));
        processors.add(new Processor(TypeProcessor.Intel, "Intel Core i9-14900KF", 3.2, 165.0));
        processors.add(new Processor(TypeProcessor.Intel, "Intel Core i5-12400F", 2.5, 120.0));
        processors.add(new Processor(TypeProcessor.AMD, "Ryzen 5 5600", 3.0, 130.0));


        mainboards.add(new Mainboard("Prime H510M-K", "ASUS", 173.0));
        mainboards.add(new Mainboard("Mini ITX", "MSI", 115.0));
        mainboards.add(new Mainboard("Micro ATX", "Gigabyte", 146.0));

        powerSupplies.add(new PowerSupply("500W", "GameMax", 35.0));
        powerSupplies.add(new PowerSupply("650W", "MSI", 70.0));
        powerSupplies.add(new PowerSupply("750W", "MSI", 100.0));
        powerSupplies.add(new PowerSupply("850W", "Gigabyte", 113.0));


        graphicsCards.add(new VideoCards("NVIDIA", "RTX 2060 Super", 350.0));
        graphicsCards.add(new VideoCards("NVIDIA", "RTX 3090", 1000.0));
        graphicsCards.add(new VideoCards("NVIDIA", "RTX 4090", 2400.0));
        graphicsCards.add(new VideoCards("NVIDIA", "RTX 3060", 400.0));
        graphicsCards.add(new VideoCards("AMD", "RX 6800 XT", 600.0));
        graphicsCards.add(new VideoCards("AMD", "RX 7900 XT", 1100.0));

        ssdDrives.add(new SSD("256GB", "SanDisk", 80.0));
        ssdDrives.add(new SSD("1TB", "Kingston", 150.0));
        ssdDrives.add(new SSD("4TB", "Seagate", 420.0));

        soundCards.add(new SoundCards("7.1", "Acer", 80.0));
        soundCards.add(new SoundCards("5.1", "MSI", 100.0));
        soundCards.add(new SoundCards("2.1", "Corsair", 75.0));
        soundCards.add(new SoundCards("5.1", "Sony", 110.0));

        createBuild(processors, mainboards, graphicsCards, powerSupplies, ssdDrives, soundCards);
    }

    private static void createBuild(List<Processor> processors,
                                    List<Mainboard> motherboards,
                                    List<VideoCards> graphicsCards,
                                    List<PowerSupply> powerSupplies,
                                    List<SSD> ssdDrives,
                                    List<SoundCards> soundCards) {
        Build build = new Build();

        for (Component type : Component.values()) {
            DisplayComponents.displayComponents(type, processors, motherboards, graphicsCards,
                    powerSupplies, ssdDrives, soundCards);

            int choice = Select.getUserChoice(type);

            if (choice > 0) {
                switch (type) {
                    case PROCESSOR:
                        build.addCustomComponent(processors.get(choice - 1));
                        break;
                    case MOTHERBOARD:
                        build.addCustomComponent(motherboards.get(choice - 1));
                        break;
                    case GRAPHICS_CARD:
                        build.addCustomComponent(graphicsCards.get(choice - 1));
                        break;
                    case POWER_SUPPLY:
                        build.addCustomComponent(powerSupplies.get(choice - 1));
                        break;
                    case SSD_DRIVE:
                        build.addCustomComponent(ssdDrives.get(choice - 1));
                        break;
                    case SOUND_CARD:
                        build.addCustomComponent(soundCards.get(choice - 1));
                        break;
                }
            }
        }

        double totalPrice = build.calculateTotalPrice();

        System.out.println("\nВаша обрана конфігурація ПК:");
        build.displayCustomConfiguration();
        System.out.println("Загальна сума: $" + totalPrice);
    }
}
