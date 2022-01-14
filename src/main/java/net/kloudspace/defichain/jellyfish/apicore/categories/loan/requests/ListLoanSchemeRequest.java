package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanScheme;

public class ListLoanSchemeRequest implements IRpcRequest<LoanScheme[]> {

	@Override
	public String getName() {
		return "listloanschemes";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<LoanScheme[]> parse(JsonObject obj) {
		JsonObject results = obj.get("result").getAsJsonObject();
		List<LoanScheme> list = new ArrayList<>();
		Set<String> keys = results.keySet();
		keys.forEach(key ->{
			list.add(new Gson().fromJson(results.get(key).getAsJsonObject(), LoanScheme.class));
		});
		return new RpcResponse<>(list.toArray(new LoanScheme[list.size()]), 0);
	}

}
