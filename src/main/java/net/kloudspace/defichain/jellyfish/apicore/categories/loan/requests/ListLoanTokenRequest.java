package net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanTokenResult;

public class ListLoanTokenRequest implements IRpcRequest<LoanTokenResult[]> {
	

	@Override
	public String getName() {
		return "listloantokens";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@Override
	public RpcResponse<LoanTokenResult[]> parse(JsonObject obj) {
		JsonObject results = obj.get("result").getAsJsonObject();
		List<LoanTokenResult> list = new ArrayList<>();
		Set<String> keys = results.keySet();
		keys.forEach(key ->{
			list.add(new Gson().fromJson(results.get(key).getAsJsonObject(), LoanTokenResult.class));
		});
		return new RpcResponse<>(list.toArray(new LoanTokenResult[list.size()]), 0);
	}

}
