package net.kloudspace.defichain.jellyfish.apicore.categories.poolpair;

import java.io.IOException;
import java.util.List;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model.PoolPairResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model.PoolShareResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.options.AddPoolLiquiditySourceOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.options.PoolSwapOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests.AddPoolLiquidityRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests.CompositeSwapRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests.GetPoolPairRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests.ListPoolPairsRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests.ListPoolShareRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests.PoolSwapRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests.RemovePoolLiquidityRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.requests.TestPoolSwapRequest;

public class PoolPairController {

	private RpcClient client;

	public PoolPairController(RpcClient client) {
		this.client = client;
	}

	@SuppressWarnings("unchecked") // ???????????????????
	public RpcResponse<PoolPairResult> listPoolPairs() throws IOException, ApiError {
		return (RpcResponse<PoolPairResult>) client.call(new ListPoolPairsRequest());
	}

	@SuppressWarnings("unchecked") // ?????????????????????
	public RpcResponse<PoolPairResult> getPoolPair(int id) throws IOException, ApiError {
		return (RpcResponse<PoolPairResult>) client.call(new GetPoolPairRequest(id));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<PoolShareResult> listPoolShares() throws IOException, ApiError {
		return (RpcResponse<PoolShareResult>) client.call(new ListPoolShareRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> addPoolLiquidity(AddPoolLiquiditySourceOptions options, String shareAddress) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new AddPoolLiquidityRequest(options, shareAddress));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> poolSwap(PoolSwapOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new PoolSwapRequest(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> compositeSwap(PoolSwapOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new CompositeSwapRequest(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> testPoolSwap(PoolSwapOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new TestPoolSwapRequest(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> removePoolLiquidity(String address, String amount) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new RemovePoolLiquidityRequest(address, amount));
	}
	
	
	/**
	 * 	TODO:
	 * 	DONE 1. listpoolpairs
	 *  DONE 2. getpoolpair
	 *  3. addpoolliquidity	-DONE
	 *  4. listpoolshares	-DONE
	 *  5. poolswap			-DONE
	 *  6. compositeswap	-DONE
	 *  7. testpoolswap		-DONE
	 *  8. removepoolliquidity -DONE
	 */

}
