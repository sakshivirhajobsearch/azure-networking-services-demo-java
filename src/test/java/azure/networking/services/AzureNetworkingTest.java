package azure.networking.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import azure.networking.services.modle.VirtualNetwork;

class AzureNetworkingTest {

	@Test
	void testVirtualNetworkCreation() {
		AzureVirtualNetworkManager vnetManager = new AzureVirtualNetworkManager();
		VirtualNetwork vnet = vnetManager.createVirtualNetwork("TestVNet", "East US", "10.0.0.0/16");

		assertEquals("TestVNet", vnet.getName());
		assertEquals("East US", vnet.getRegion());
		assertEquals("10.0.0.0/16", vnet.getAddressSpace());
	}

	@Test
	void testExpressRouteCreation() {
		ExpressRouteManager routeManager = new ExpressRouteManager();
		String result = routeManager.createExpressRouteConnection("MyExpressRoute", "Mumbai", "1Gbps");

		assertTrue(result.contains("MyExpressRoute"));
		assertTrue(result.contains("Mumbai"));
		assertTrue(result.contains("1Gbps"));
	}
}