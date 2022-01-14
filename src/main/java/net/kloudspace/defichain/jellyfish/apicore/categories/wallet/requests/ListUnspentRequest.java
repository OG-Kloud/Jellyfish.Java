package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.UTXO;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.ListUnspentOptions;

public class ListUnspentRequest implements IRpcRequest<UTXO[]> {
	
	private final ListUnspentOptions options;
	
	public ListUnspentRequest(ListUnspentOptions opts) {
		this.options = opts;
	}

	@Override
	public String getName() {
		return "listunspent";
	}

	@Override
	public String getParameters() {
		return "[" + 1 +"," + 999999 + this.options.getAddresses()+"," + this.options.isIncludeunsafe() +"," + this.options.getQueryOptions().getAsParameter()+"]";
	}

	@Override
	public RpcResponse<UTXO[]> parse(JsonObject obj) throws ApiError {
		JsonArray array = obj.get("result").getAsJsonArray();
		List<UTXO> list = new ArrayList<>();
		array.forEach(ele -> {
			list.add(new Gson().fromJson(ele.getAsJsonObject(), UTXO.class));
		});

		return new RpcResponse<>(list.toArray(new UTXO[list.size()]), 0);
	}

}
