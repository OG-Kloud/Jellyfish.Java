package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.model;

import com.google.gson.GsonBuilder;

public class MasternodeInfo {

	private String ownerAuthAddress;
	private String operatorAuthAddress;
	private String resignTx;
	private String banTx;
	private String state;
	private boolean ownerIsMine;
	private boolean operatorIsMine;
	private boolean localMasternode;
	private Number creationHeight;
	private Number resignHeight;
	private Number banHeight;
	private Number mintedBlocks;
	
	public void print() {
		System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(this));
	}

	public String getOwnerAuthAddress() {
		return ownerAuthAddress;
	}

	public String getOperatorAuthAddress() {
		return operatorAuthAddress;
	}

	public String getResignTx() {
		return resignTx;
	}

	public String getBanTx() {
		return banTx;
	}

	public String getState() {
		return state;
	}

	public boolean isOwnerIsMine() {
		return ownerIsMine;
	}

	public boolean isOperatorIsMine() {
		return operatorIsMine;
	}

	public boolean isLocalMasternode() {
		return localMasternode;
	}

	public Number getCreationHeight() {
		return creationHeight;
	}

	public Number getResignHeight() {
		return resignHeight;
	}

	public Number getBanHeight() {
		return banHeight;
	}

	public Number getMintedBlocks() {
		return mintedBlocks;
	}

}
