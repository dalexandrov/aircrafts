package io.helidon.demo;

public final class CargoPlane extends Aircraft implements FlightRange{

    private final int maxLoad;

    public CargoPlane(String registration, int maxLoad) {
        super(registration);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }
}
