package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountHistory;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.options.AccountHistoryOptions;

public class ListAccountHistoryRequest implements IRpcRequest<AccountHistory[]> {

	private final String address;
	private final AccountHistoryOptions options;
	
	public ListAccountHistoryRequest(String address, AccountHistoryOptions opts) {
		this.address = address;
		this.options = opts;
	}
	
	@Override
	public String getName() {
		return "listaccounthistory";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.address+"\","+this.options.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<AccountHistory[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<AccountHistory> list = new ArrayList<>();
		array.forEach(ele ->{
		list.add(new Gson().fromJson(ele.getAsJsonObject(), AccountHistory.class));
		});
		
		return new RpcResponse<>(list.toArray(new AccountHistory[list.size()]), 0);
		
	}

}
