import java.util.List;
public class DisplayComponents {
    public static void displayComponents(Component type, List<Processor> processors, List<Mainboard> motherboards, List<VideoCards> graphicsCards, List<PowerSupply> powerSupplies, List<SSD> ssdDrives, List<SoundCards> soundCards) {
        System.out.println("Доступні " + type.toString() + " компоненти:");
        List<? extends Configurе> components = getComponent.getComponentsByType(type, processors, motherboards, graphicsCards, powerSupplies, ssdDrives, soundCards);

        for (int i = 0; i < components.size(); i++) {
            System.out.println((i + 1) + ". " + components.get(i).getDescription() + " - Ціна: $" + components.get(i).getPrice());
        }
    }
}
