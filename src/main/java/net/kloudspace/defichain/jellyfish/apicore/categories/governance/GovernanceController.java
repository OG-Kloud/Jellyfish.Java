package net.kloudspace.defichain.jellyfish.apicore.categories.governance;

import java.io.IOException;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.governance.model.ProposalInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.governance.options.CFPData;
import net.kloudspace.defichain.jellyfish.apicore.categories.governance.requests.CreateCFPRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.governance.requests.CreateVocRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.governance.requests.GetProposalRequest;
/**
 * 
 * @author Kloudspace
 *
 *WIP
 *Governance API methods not implemented fully in Jellyfish RPC
 *
 */
public class GovernanceController {
	
	private RpcClient client;
	
	public GovernanceController(RpcClient client) {
		this.client = client;
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> createCFP(CFPData options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new CreateCFPRequest(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<ProposalInfo> getProposal(String proposalId) throws IOException, ApiError {
		return (RpcResponse<ProposalInfo>) client.call(new GetProposalRequest(proposalId));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> createVoc(String title) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new CreateVocRequest(title));
	}
	
	
	
	/**
	 * TODO:
	 * 	1. createcfp
	 * 	2. getproposal
	 * 	3. createvoc
	 * 	4. listproposals
	 * 	5. vote
	 * 	6. listvotes
	 */

}
