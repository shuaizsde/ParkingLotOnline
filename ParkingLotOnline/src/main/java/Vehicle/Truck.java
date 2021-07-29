package Vehicle;

import static Vehicle.VehicleSize.Large;

public class Truck extends Vehicle{
    @Override
    public VehicleSize getSize() {
        return Large;
    }
}
