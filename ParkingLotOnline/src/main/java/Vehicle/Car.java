package Vehicle;

import static Vehicle.VehicleSize.Compact;

public class Car extends Vehicle {
    @Override
    public VehicleSize getSize() {
        return Compact;
    }
}
