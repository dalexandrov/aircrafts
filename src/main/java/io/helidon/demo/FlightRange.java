package io.helidon.demo;

public sealed interface FlightRange permits PassengerJet, CargoPlane {

    default int maxRange(){
        return 5000;
    }
}

