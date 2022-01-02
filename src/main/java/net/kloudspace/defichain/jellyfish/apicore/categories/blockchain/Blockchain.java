package net.kloudspace.defichain.jellyfish.apicore.categories.blockchain;

import java.io.IOException;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.Block;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.BlockHeader;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.BlockchainInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.ChainTip;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.MempoolInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.MempoolTx;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.models.UTXODetails;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetBlockCountRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetBlockHashRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetBlockHeaderRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetBlockRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetBlockchainInfoRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetChainTipsRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetDifficultyRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetMempoolInfoRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetRawMempoolRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.requests.GetTxOutRequest;

public class Blockchain {

	private final RpcClient client;

	public Blockchain(RpcClient client) {
		this.client = client;
	}

	@SuppressWarnings("unchecked")//?????????????
	public	RpcResponse<BlockchainInfo> getBlockchainInfo() throws IOException, ApiError {
		RpcResponse<?> response = client.call(new GetBlockchainInfoRequest<>());
		return (RpcResponse<BlockchainInfo>) response;
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<Block> getBlock(String blockHash) throws IOException, ApiError {
		return (RpcResponse<Block>) client.call(new GetBlockRequest(blockHash));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<BlockHeader> getBlockHeader(String blockHash) throws IOException, ApiError {
		return (RpcResponse<BlockHeader>) client.call(new GetBlockHeaderRequest(blockHash));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> getBlockHash(Number height) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new GetBlockHashRequest(height));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<Number> getBlockCount() throws IOException, ApiError {
		return (RpcResponse<Number>) client.call(new GetBlockCountRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<ChainTip[]> getChainTips() throws IOException, ApiError {
		return (RpcResponse<ChainTip[]>) client.call(new GetChainTipsRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<Number> getDifficulty() throws IOException, ApiError {
		return (RpcResponse<Number>) client.call(new GetDifficultyRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<UTXODetails> getTxOut(String txId, Number n, boolean includeMempool) throws IOException, ApiError {
		return (RpcResponse<UTXODetails>) client.call(new GetTxOutRequest(txId, n, includeMempool));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<MempoolTx[]> getRawMempool() throws IOException, ApiError {
		return (RpcResponse<MempoolTx[]>) client.call(new GetRawMempoolRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<MempoolInfo> getMempoolInfo() throws IOException, ApiError {
		return (RpcResponse<MempoolInfo>) client.call(new GetMempoolInfoRequest());
	}
	
	

	/**
	 * TODO:
	 * 	1. getblock				-DONE
	 * 	2. getblockheader		-DONE
	 * 	3. getblockhash			-DONE
	 * 	4. getblockcount		-DONE
	 * 	5. getchaintips			-DONE
	 * 	6. getdifficulty		-DONE
	 * 	7. gettxout				-DONE
	 * 	8. getrawmempool		-DONE
	 * 	9. getmempoolinfo		-DONE
	 * 	10. getblockstats
	 * 	11. getbestblockhash
	 * 	12. waitfornewblock
	 * 	13. waitforblockheight
	 */
	
}