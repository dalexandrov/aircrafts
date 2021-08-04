package io.helidon.demo;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

import java.util.HashMap;
import java.util.Map;

public class AircraftService implements Service {

    private Map<String, Aircraft> aircrafts;

    public AircraftService() {
        aircrafts = new HashMap<>();
        aircrafts.put("LZ-001", new PassengerJet("LZ-001", 120));
        aircrafts.put("LZ-CGP", new CargoPlane("LZ-CGP", 75000));
    }

    @Override
    public void update(Routing.Rules rules) {
        rules.get("/{reg}", this::getAircraftInfo);
    }

    private void getAircraftInfo(ServerRequest request,
                                 ServerResponse response) {
        String reg = request.path().param("reg");
        Aircraft aircraft = aircrafts.get(reg);
        String info = getInfo(aircraft);
        response.send(info);
    }

    private String getInfo(Object o){
        return switch(o){
            case CargoPlane cargoPlane      ->  String.format("Cargo plane with registration %s and max load of %d with max range of %d",
                    cargoPlane.getRegistration(), cargoPlane.getMaxLoad(), cargoPlane.maxRange());
            case PassengerJet passengerJet  ->  String.format("Passenger jet with registration %s and max PAX capacity of %d with max range of %d",
                    passengerJet.getRegistration(), passengerJet.getPaxNumber(), passengerJet.maxRange());
            case null                       ->  "Unknown aircraft";
            default                         ->  "No information submitted";
        };
    }
}
