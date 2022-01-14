package net.kloudspace.defichain.jellyfish.apicore.categories.oracle;

import java.io.IOException;
import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model.FixedIntervalPrice;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.model.OracleRawPrice;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.AppointOracleOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.OraclePriceFeed;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.OraclePriceFeedOption;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.SetOracleDataOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.options.UpdateOracleOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.AppointOracleRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.GetFixedIntervalPriceRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.GetOracleDataRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.ListFixedIntervalPrices;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.ListLatestRawPricesRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.ListOraclesRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.ListPrices;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.RemoveOracleRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.SetOracleDataRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.oracle.reqests.UpdateOracleRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.model.ListPricesData;

public class OracleController {
	
	
	private RpcClient client;
	
	public OracleController(RpcClient client) {
		this.client = client;
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> appointOracle(String address, OraclePriceFeedOption priceFeeds, AppointOracleOptions options, Number weightage) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new AppointOracleRequest(address, priceFeeds, options, weightage));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> removeOracle(String oracleId) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new RemoveOracleRequest(oracleId));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> updateOracle(String oracleId, String address, UpdateOracleOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new UpdateOracleRequest(oracleId, address, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> setOracleData(String oracleId, Number timestamp, SetOracleDataOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new SetOracleDataRequest(oracleId, timestamp, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> getOracleData(String oracleId) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new GetOracleDataRequest(oracleId));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String[]> listOracles() throws IOException, ApiError {
		return (RpcResponse<String[]>) client.call(new ListOraclesRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<OracleRawPrice[]> listLatestRawPrices(OraclePriceFeed priceFeed) throws IOException, ApiError {
		return (RpcResponse<OracleRawPrice[]>) client.call(new ListLatestRawPricesRequest(priceFeed));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<BigDecimal> getPrice(OraclePriceFeed priceFeed) throws IOException, ApiError {
		return (RpcResponse<BigDecimal>)client.call(new GetPriceRequest(priceFeed));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<FixedIntervalPrice> getFixedIntervalPrice(String id) throws IOException, ApiError {
		return (RpcResponse<FixedIntervalPrice>)client.call(new GetFixedIntervalPriceRequest(id));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<FixedIntervalPrice[]> listFixedIntervalPrices() throws IOException, ApiError {
		return (RpcResponse<FixedIntervalPrice[]>)client.call(new ListFixedIntervalPrices());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<ListPricesData[]> listPrices() throws IOException, ApiError {
		return (RpcResponse<ListPricesData[]>)client.call(new ListPrices());
	}

}
