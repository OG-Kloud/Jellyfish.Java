package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanInfo;

public class GetLoanInfoRequest<T> implements IRpcRequest<T> {

	@Override
	public String getName() {
		return "getloaninfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		JsonObject result = obj.get("result").getAsJsonObject();
		JsonObject defaults = result.get("defaults").getAsJsonObject();
		JsonObject totals = result.get("totals").getAsJsonObject();
		return new RpcResponse<>(((T) new LoanInfo(result.get("currentPriceBlock").getAsInt(),
				result.get("nextPriceBlock").getAsInt(), defaults.get("scheme").getAsString(),
				defaults.get("maxPriceDeviationPct").getAsBigDecimal(), defaults.get("minOraclesPerPrice").getAsInt(),
				defaults.get("fixedIntervalBlocks").getAsInt(), totals.get("schemes").getAsInt(),
				totals.get("collateralTokens").getAsInt(), totals.get("collateralValue").getAsBigDecimal(),
				totals.get("loanTokens").getAsInt(), totals.get("loanValue").getAsBigDecimal(),
				totals.get("openVaults").getAsInt(), totals.get("openAuctions").getAsInt())), 0);
	}

}
