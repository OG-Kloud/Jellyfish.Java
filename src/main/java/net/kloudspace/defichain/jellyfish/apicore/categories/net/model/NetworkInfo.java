package net.kloudspace.defichain.jellyfish.apicore.categories.net.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NetworkInfo {
	
	private Number version;
	private String subversion;
	private Number protocolversion;
	private String localservices;
	private boolean localrelay;
	private Number timeoffset;
	private Number connections;
	private boolean networkactive;
	private Network[] networks;
	private Number relayfee;
	private Number incrementalfee;
	private LocalAddress[] localaddresses;
	private String warnings;
	
	public void print() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(this));
	}
	
	public Number getVersion() {
		return version;
	}

	public String getSubversion() {
		return subversion;
	}

	public Number getProtocolversion() {
		return protocolversion;
	}

	public String getLocalservices() {
		return localservices;
	}

	public boolean isLocalrelay() {
		return localrelay;
	}

	public Number getTimeoffset() {
		return timeoffset;
	}

	public Number getConnections() {
		return connections;
	}

	public boolean isNetworkactive() {
		return networkactive;
	}

	public Network[] getNetworks() {
		return networks;
	}

	public Number getRelayfee() {
		return relayfee;
	}

	public Number getIncrementalfee() {
		return incrementalfee;
	}

	public LocalAddress[] getLocaladdresses() {
		return localaddresses;
	}

	public String getWarnings() {
		return warnings;
	}

	public static class Network {
		private String name;
		private boolean limited;
		private boolean reachable;
		private String proxy;
		private boolean proxy_randomize_credentials;
		public String getName() {
			return name;
		}
		public boolean isLimited() {
			return limited;
		}
		public boolean isReachable() {
			return reachable;
		}
		public String getProxy() {
			return proxy;
		}
		public boolean isProxy_randomize_credentials() {
			return proxy_randomize_credentials;
		}
		
		
	}
	
	public static class LocalAddress {
		private String address;
		private Number port;
		private Number score;
		public String getAddress() {
			return address;
		}
		public Number getPort() {
			return port;
		}
		public Number getScore() {
			return score;
		}
		
		
	}

}
