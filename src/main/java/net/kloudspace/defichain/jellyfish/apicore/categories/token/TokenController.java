package net.kloudspace.defichain.jellyfish.apicore.categories.token;

import java.io.IOException;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.TokenResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.options.CreateTokenOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.options.UpdateTokenOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.requests.GetTokenRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.requests.ListTokenRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.requests.MintTokensRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.requests.UpdateTokenRequest;

public class TokenController {

	private RpcClient client;

	public TokenController(RpcClient client) {
		this.client = client;
	}

	@SuppressWarnings("unchecked") // ??????????????????
	public RpcResponse<TokenResult> listTokens() throws IOException, ApiError {
		return ((RpcResponse<TokenResult>) client.call(new ListTokenRequest()));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> createToken(CreateTokenOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new CreateTokenRequest(options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<TokenResult> getToken(int id) throws IOException, ApiError {
		return ((RpcResponse<TokenResult>) client.call(new GetTokenRequest(id)));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> mintTokens(String amount) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new MintTokensRequest(amount));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> updateToken(UpdateTokenOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new UpdateTokenRequest(options));
	}

	/**
	 * TODO: 1. createtoken 2. updatetoken DONE 3. listtokens DONE 4. gettoken 5.
	 * minttoken
	 */

}
