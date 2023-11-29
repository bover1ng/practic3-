import java.util.ArrayList;
import java.util.List;

class Build {
    private List<Configurе> customComponents = new ArrayList<>();

    public void addCustomComponent(Configurе customComponent) {
        customComponents.add(customComponent);
    }

    public double calculateTotalPrice() {
        double customTotalPrice = 0;
        for (Configurе customComponent : customComponents) {
            customTotalPrice += customComponent.getPrice();
        }
        return customTotalPrice;
    }

    public void displayCustomConfiguration() {
        System.out.println("Комплектація ПК:");
        for (int i = 0; i < customComponents.size(); i++) {
            System.out.println((i + 1) + ". " + customComponents.get(i).getDescription() + " - Ціна: $" + customComponents.get(i).getPrice());
        }
    }
}