package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanScheme;

public class ListLoanSchemeRequest<T> implements IRpcRequest<T> {

	@Override
	public String getName() {
		return "listloanschemes";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@SuppressWarnings("unchecked")
	@Override
	public RpcResponse<T> parse(JsonObject obj) {
		List<LoanScheme> data = new ArrayList<LoanScheme>();
		obj.get("results").getAsJsonArray().forEach(ele -> {
			data.add(new LoanScheme(ele.getAsJsonObject().get("id").getAsString(),
					ele.getAsJsonObject().get("mincolratio").getAsBigDecimal(),
					ele.getAsJsonObject().get("interestrate").getAsBigDecimal())
							.setDefault(ele.getAsJsonObject().get("default").getAsBoolean()));
		});

		return new RpcResponse<>((T)data, 0);
	}

}
