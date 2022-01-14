package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options.CreateRawTxIn;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options.CreateRawTxOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options.CreateRawTxOut;

public class CreateRawTransactionRequest implements IRpcRequest<String> {

	private final CreateRawTxIn[] inputs;
	private final CreateRawTxOut[] outputs;
	private final CreateRawTxOptions options;

	public CreateRawTransactionRequest(CreateRawTxIn[] inputs, CreateRawTxOut[] outputs, CreateRawTxOptions options) {
		this.inputs = inputs;
		this.outputs = outputs;
		this.options = options;
	}

	@Override
	public String getName() {
		return "createrawtransaction";
	}

	@Override
	public String getParameters() {
		return "[" + new Gson().toJson(inputs) + "," + (outputs != null ? new Gson().toJson(outputs) : "{}") + ","
				+ options.getLocktime() + "," + this.options.isReplaceable() + "]";
	}

	@Override
	public RpcResponse<String> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(obj.get("result").getAsString(), 0);
	}

}
