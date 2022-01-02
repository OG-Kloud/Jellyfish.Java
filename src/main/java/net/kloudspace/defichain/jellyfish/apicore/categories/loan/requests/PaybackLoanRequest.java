package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.PaybackLoanOptions;

public class PaybackLoanRequest<T> implements IRpcRequest<T> {
	
	private PaybackLoanOptions options;
	
	public PaybackLoanRequest(PaybackLoanOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "paybackloan";
	}

	@Override
	public String getParameters() {
		return "["+options.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<T> parse(JsonObject obj) throws ApiError {
		// TODO Auto-generated method stub
		return null;
	}

}
