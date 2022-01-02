package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models;

public class SoftFork {
	
	String id;
	String type;
	boolean active;
	Number height;
	
	public SoftFork(String id, String type, boolean active, Number height) {
		this.id = id;
		this.type = type;
		this.active = active;
		this.height = height;
	}

}
