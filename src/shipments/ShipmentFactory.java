package shipments;

public interface ShipmentFactory {
    Shipment getShipment(String type);
}
