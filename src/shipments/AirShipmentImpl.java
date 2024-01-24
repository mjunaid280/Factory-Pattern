package shipments;

public class AirShipmentImpl implements Shipment{
    @Override
    public Boolean prepare() {
        System.out.println("preparing air shipment");
        return Boolean.TRUE;
    }

    @Override
    public void dispatch() {
        System.out.println("Dispatching air shipment");
    }
}
