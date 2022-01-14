package net.kloudspace.defichain.jellyfish.apicore.categories.governance.model;

public enum ListProposalType {
	CFP("cfp"), BRP("brp"), VOC("voc"), ALL("all")

	;

	private final String id;

	private ListProposalType(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	

}
