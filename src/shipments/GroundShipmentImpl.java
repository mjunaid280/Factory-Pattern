package shipments;

public class GroundShipmentImpl implements Shipment{
    @Override
    public Boolean prepare() {
        System.out.println("preparing ground shipment");
        return true;
    }

    @Override
    public void dispatch() {
        System.out.println("Dispatching ground shipment");
    }
}
