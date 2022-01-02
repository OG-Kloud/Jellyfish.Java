package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

public class VaultLiquidation extends Vault {
	
	private Number liquidationHeight;
	private Number batchCount;
	private BigDecimal liquidationPenalty;
	private VaultLiquidationBatch[] batches;
	
	@Override
	public void print() {
		System.out.println("\nVault:\nVault ID: " + this.vaultId + "\nCollateral Value: " + "\n");
	}

	public Number getLiquidationHeight() {
		return liquidationHeight;
	}

	public Number getBatchCount() {
		return batchCount;
	}

	public BigDecimal getLiquidationPenalty() {
		return liquidationPenalty;
	}

	public VaultLiquidationBatch[] getBatches() {
		return batches;
	}
	
	

}
