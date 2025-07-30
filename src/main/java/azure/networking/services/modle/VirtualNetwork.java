package azure.networking.services.modle;

public class VirtualNetwork {
	
	private final String name;
	private final String region;
	private final String addressSpace;

	public VirtualNetwork(String name, String region, String addressSpace) {
		
		this.name = name;
		this.region = region;
		this.addressSpace = addressSpace;
	}

	public String getName() {
		return name;
	}

	public String getRegion() {
		return region;
	}

	public String getAddressSpace() {
		return addressSpace;
	}

	@Override
	public String toString() {
		return String.format("VNet{name='%s', region='%s', addressSpace='%s'}", name, region, addressSpace);
	}
}