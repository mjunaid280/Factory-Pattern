import shipments.Shipment;
import shipments.ShipmentFactory;
import shipments.ShipmentFactoryImpl;

// Factory design pattern
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       String type = "GROUND";
        ShipmentFactory shipmentFactory = new ShipmentFactoryImpl();
        Shipment shipment = shipmentFactory.getShipment(type);
        shipment.prepare();
        shipment.dispatch();
    }
}