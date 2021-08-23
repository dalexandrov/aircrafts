package io.helidon.demo;


public abstract sealed class Aircraft permits PassengerJet, CargoPlane {

    protected final String registration;

    public Aircraft(String registration) {
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }
}
