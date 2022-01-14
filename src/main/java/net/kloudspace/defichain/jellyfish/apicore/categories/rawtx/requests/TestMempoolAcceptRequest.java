package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.requests;

import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.model.TestMempoolAcceptResult;

public class TestMempoolAcceptRequest implements IRpcRequest<TestMempoolAcceptResult> {

	private final String txid;
	private final BigDecimal maxFeeRate;

	public TestMempoolAcceptRequest(String txid, BigDecimal maxFeeRate) {
		this.txid = txid;
		this.maxFeeRate = maxFeeRate;
	}

	@Override
	public String getName() {
		return "testmempoolaccept";
	}

	@Override
	public String getParameters() {
		return "[\""+this.txid+"\","+this.maxFeeRate+"]";
	}

	@Override
	public RpcResponse<TestMempoolAcceptResult> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), TestMempoolAcceptResult.class), 0);
	}

}
