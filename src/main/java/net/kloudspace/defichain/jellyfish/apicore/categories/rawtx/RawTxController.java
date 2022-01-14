package net.kloudspace.defichain.jellyfish.apicore.categories.rawtx;

import java.io.IOException;
import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.model.SignRawTxWithKeyResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.model.TestMempoolAcceptResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options.CreateRawTxIn;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options.CreateRawTxOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options.CreateRawTxOut;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.options.SignRawTxWithKeyOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.requests.CreateRawTransactionRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.requests.SignRawTxWithKeyRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.rawtx.requests.TestMempoolAcceptRequest;

public class RawTxController {
	
	
	private RpcClient client;
	
	public RawTxController(RpcClient client) {
		this.client = client;
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> createRawTransaction(CreateRawTxIn[] inputs, CreateRawTxOut[] outputs, CreateRawTxOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new CreateRawTransactionRequest(inputs, outputs, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<SignRawTxWithKeyResult> signRawTransactionWithKey(String rawTx, String[] privKeys, SignRawTxWithKeyOptions options) throws IOException, ApiError {
		return (RpcResponse<SignRawTxWithKeyResult>) client.call(new SignRawTxWithKeyRequest(rawTx, privKeys, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<TestMempoolAcceptResult> signRawTransactionWithKey(String signedTx, BigDecimal maxFeeRate) throws IOException, ApiError {
		return (RpcResponse<TestMempoolAcceptResult>) client.call(new TestMempoolAcceptRequest(signedTx, maxFeeRate));
	}
	
	/**
	 * 	TODO:
	 * 	1. createrawtransaction				-Done
	 * 	2. signrawtransactionwithkey		-Done
	 * 	3. testmempoolacceptance			-Done
	 * 	4. sendrawtransaction				
	 * 	5. getrawtransaction
	 */

}
