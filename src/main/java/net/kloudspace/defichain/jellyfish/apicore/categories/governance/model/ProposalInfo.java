package net.kloudspace.defichain.jellyfish.apicore.categories.governance.model;

import java.math.BigDecimal;

public class ProposalInfo {

	private String proposalId;
	private String title;
	private ProposalType type;
	private ProposalStatus status;
	private BigDecimal amount;
	private Number cycles;
	private Number totalCycles;
	private Number finalizeAfter;
	private String payoutAddress;

	public String getProposalId() {
		return proposalId;
	}

	public String getTitle() {
		return title;
	}

	public ProposalType getType() {
		return type;
	}

	public ProposalStatus getStatus() {
		return status;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Number getCycles() {
		return cycles;
	}

	public Number getTotalCycles() {
		return totalCycles;
	}

	public Number getFinalizeAfter() {
		return finalizeAfter;
	}

	public String getPayoutAddress() {
		return payoutAddress;
	}

	public static enum ProposalType {
		COMMUNITY_FUND_REQUEST("CommunityFundRequest"), BLOCK_REWARD_RELLOCATION("BlockRewardRellocation"),
		VOTE_OF_CONFIDENCE("VoteOfConfidence");

		private final String id;

		private ProposalType(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

	}

	public static enum ProposalStatus {
		VOTING("Voting"), REJECTED("Rejected"), COMPLETED("Completed");

		private final String id;

		private ProposalStatus(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

	}

}
