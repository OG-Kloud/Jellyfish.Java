package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanInfo;

public class GetLoanInfoRequest implements IRpcRequest<LoanInfo> {

	@Override
	public String getName() {
		return "getloaninfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<LoanInfo> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), LoanInfo.class), 0);
	}

}
