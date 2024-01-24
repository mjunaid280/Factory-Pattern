package shipments;

public class ShipmentFactoryImpl implements ShipmentFactory{
    @Override
    public Shipment getShipment(String type) {

        return switch (type) {
            case "AIR" -> new AirShipmentImpl();
            case "GROUND" -> new GroundShipmentImpl();
            default -> null;
        };
    }
}
