package net.kloudspace.defichain.jellyfish.apicore.categories.governance.model;

public enum ListProposalStatus {
	
	VOTING("voting"), REJECTED("rejected"), COMPLETED("completed"), ALL("all");

	private final String id;

	private ListProposalStatus(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}
