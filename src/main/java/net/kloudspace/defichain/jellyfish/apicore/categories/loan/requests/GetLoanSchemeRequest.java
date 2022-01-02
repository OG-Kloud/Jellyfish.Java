package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanScheme;

public class GetLoanSchemeRequest<T> implements IRpcRequest<T> {

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

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<T> parse(JsonObject obj) {
		return new RpcResponse<>((T) new LoanScheme(obj.get("result").getAsJsonObject().get("id").getAsString(),
				obj.get("result").getAsJsonObject().get("mincolratio").getAsBigDecimal(),
				obj.get("result").getAsJsonObject().get("interestrate").getAsBigDecimal()), 0);
	}

}
