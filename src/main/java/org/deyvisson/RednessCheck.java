package org.deyvisson;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Readiness
public class RednessCheck implements HealthCheck {

    @RestClient
    StarWarsService starWarsService;

    @Override
    public HealthCheckResponse call() {
        if(starWarsService.getStarChips().contains(StarWarsService.MSG_ERRO)){
            return HealthCheckResponse.down("ERROR");
        }
        return HealthCheckResponse.up("Liveness check");
    }
}
