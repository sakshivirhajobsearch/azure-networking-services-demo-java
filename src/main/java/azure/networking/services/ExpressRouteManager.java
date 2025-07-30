package azure.networking.services;

public class ExpressRouteManager {
	
	public String createExpressRouteConnection(String name, String peeringLocation, String bandwidth) {
		return String.format("ExpressRoute '%s' created with %s bandwidth at %s.", name, bandwidth, peeringLocation);
	}
}