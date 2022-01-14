package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanScheme;

public class GetLoanSchemeRequest implements IRpcRequest<LoanScheme> {

	private final String loanschemeid;

	public GetLoanSchemeRequest(String id) {
		this.loanschemeid = id;
	}

	@Override
	public String getName() {
		return "getloanscheme";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.loanschemeid + "\"]";
	}

	@Override
	public RpcResponse<LoanScheme> parse(JsonObject obj) {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), LoanScheme.class), 0);
	}

}
