package net.kloudspace.defichain.jellyfish.apicore.categories.governance.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.governance.model.ProposalInfo;

public class GetProposalRequest implements IRpcRequest<ProposalInfo> {
	
	private final String proposalId;
	
	public GetProposalRequest(String proposalId) {
		this.proposalId = proposalId;
	}

	@Override
	public String getName() {
		return "getproposal";
	}

	@Override
	public String getParameters() {
		return "[\""+this.proposalId+"\"]";
	}

	@Override
	public RpcResponse<ProposalInfo> parse(JsonObject obj) throws ApiError {
		return new RpcResponse<>(new Gson().fromJson(obj.get("result").getAsJsonObject(), ProposalInfo.class), 0);
	}

}
