package io.helidon.demo;

public final class PassengerJet extends Aircraft implements FlightRange{

    private final int paxNumber;

    public PassengerJet(String registration, int paxNumber) {
        super(registration);
        this.paxNumber = paxNumber;
    }

    public int getPaxNumber() {
        return paxNumber;
    }

    @Override
    public int maxRange(){
        return 12000;
    }
}
