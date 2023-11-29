import java.util.List;
import java.util.ArrayList;
public class getComponent {
    public static List<? extends Configurе> getComponentsByType(Component type,
                                                                List<Processor> processors, List<Mainboard> motherboards,
                                                                List<VideoCards> graphicsCards, List<PowerSupply> powerSupplies, List<SSD> ssdDrives,
                                                                List<SoundCards> soundCards) {
        switch (type) {
            case PROCESSOR:
                return processors;
            case MOTHERBOARD:
                return motherboards;
            case GRAPHICS_CARD:
                return graphicsCards;
            case POWER_SUPPLY:
                return powerSupplies;
            case SSD_DRIVE:
                return ssdDrives;
            case SOUND_CARD:
                return soundCards;
            default:
                return new ArrayList<>();
        }
    }
}
