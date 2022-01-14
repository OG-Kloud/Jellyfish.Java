package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests;

import java.math.BigDecimal;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.options.SendToAddressOptions;

public class SendToAddressRequest implements IRpcRequest<String> {
	
	private final SendToAddressOptions options;
	private final String address;
	private final BigDecimal amount;
	
	public SendToAddressRequest(String address, BigDecimal amount, SendToAddressOptions opts) {
		this.options = opts;
		this.address = address;
		this.amount = amount;
	}

	@Override
	public String getName() {
		return "sendtoaddress";
	}

	@Override
	public String getParameters() {
		return "[\"" + this.address + "\","+this.amount+","+this.options.getAsParameter()+"]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
