package net.kloudspace.defichain.jellyfish.apicore.categories.wallet;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.SendManyOptions;

public class SendManyRequest implements IRpcRequest<String> {

	private final net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.Record amounts;
	private final String[] subtractFeeFrom;
	private final SendManyOptions options;

	public SendManyRequest(net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.Record amounts, String[] subtractFeeFrom, SendManyOptions options) {
		this.amounts = amounts;
		this.subtractFeeFrom = subtractFeeFrom;
		this.options = options;
	}

	@Override
	public String getName() {
		return "sendmany";
	}

	@Override
	public String getParameters() {
		return "[\"\"," + this.amounts.getAsParameter() + "," + (this.subtractFeeFrom != null && this.subtractFeeFrom.length != 0 ? new Gson().toJson(this.subtractFeeFrom) : "[]");
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
