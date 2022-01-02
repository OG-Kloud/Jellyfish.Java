package net.kloudspace.defichain.jellyfish.apicore.categories.loan.model;

import java.math.BigDecimal;

public class GetLoanInfoResult {

	private Number currentPriceBlock;
	private Number nextPriceBlock;
	private LoanConfig defaults;
	private LoanSummary totals;

	public Number getCurrentPriceBlock() {
		return currentPriceBlock;
	}

	public Number getNextPriceBlock() {
		return nextPriceBlock;
	}

	public LoanConfig getDefaults() {
		return defaults;
	}

	public LoanSummary getTotals() {
		return totals;
	}

	public static class LoanConfig {
		private Number fixedIntervalBlocks;
		private BigDecimal maxPriceDeviationPct;
		private Number minOraclesPerPrice;
		private String scheme;

		public Number getFixedIntervalBlocks() {
			return fixedIntervalBlocks;
		}

		public BigDecimal getMaxPriceDeviationPct() {
			return maxPriceDeviationPct;
		}

		public Number getMinOraclesPerPrice() {
			return minOraclesPerPrice;
		}

		public String getScheme() {
			return scheme;
		}

	}

	public static class LoanSummary {
		private BigDecimal collateralTokens;
		private BigDecimal collateralValue;
		private BigDecimal loanTokens;
		private BigDecimal loanValue;
		private Number openAuctions;
		private Number openVaults;
		private Number schemes;

		public BigDecimal getCollateralTokens() {
			return collateralTokens;
		}

		public BigDecimal getCollateralValue() {
			return collateralValue;
		}

		public BigDecimal getLoanTokens() {
			return loanTokens;
		}

		public BigDecimal getLoanValue() {
			return loanValue;
		}

		public Number getOpenAuctions() {
			return openAuctions;
		}

		public Number getOpenVaults() {
			return openVaults;
		}

		public Number getSchemes() {
			return schemes;
		}

	}

}
