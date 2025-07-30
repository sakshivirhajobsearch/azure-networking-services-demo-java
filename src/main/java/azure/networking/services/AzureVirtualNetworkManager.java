package azure.networking.services;

import java.util.ArrayList;
import java.util.List;

import azure.networking.services.modle.VirtualNetwork;

public class AzureVirtualNetworkManager {
	
	private final List<VirtualNetwork> vnetList = new ArrayList<>();

	public VirtualNetwork createVirtualNetwork(String name, String region, String addressSpace) {
		VirtualNetwork vnet = new VirtualNetwork(name, region, addressSpace);
		vnetList.add(vnet);
		return vnet;
	}

	public List<VirtualNetwork> listVirtualNetworks() {
		return vnetList;
	}
}