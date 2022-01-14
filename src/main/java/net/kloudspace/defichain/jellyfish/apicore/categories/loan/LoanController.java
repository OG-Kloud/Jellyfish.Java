package net.kloudspace.defichain.jellyfish.apicore.categories.loan;

import java.io.IOException;
import java.util.List;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.CollateralTokenDetail;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.DepositToVaultOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.Interest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanScheme;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanTokenResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.Vault;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.VaultLiquidation;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.AuctionPagination;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.CloseVaultOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.ListVaultOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.PaybackLoanOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.PlaceAuctionBidOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.TakeLoanOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.UpdateVaultOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.VaultPagination;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.options.WithdrawFromVaultOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.CloseVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.CreateVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.DepositToVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.GetCollateralTokenRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.GetInterestRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.GetLoanInfoRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.GetLoanSchemeRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.GetVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.ListAuctionRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.ListCollateralTokenRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.ListLoanSchemeRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.ListLoanTokenRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.ListVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.PaybackLoanRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.PlaceAuctionBidRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.TakeLoanRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.UpdateVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.WithdrawFromVaultRequest;

public class LoanController {

	private RpcClient client;

	public LoanController(RpcClient client) {
		this.client = client;
	}

	/**
	 * NOTE: not implemented in rpc yet!! DO NOT USE
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ApiError
	 * 
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<String> createLoanScheme(IRpcRequest<String> request) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(request);
	}

	/**
	 * 
	 * @param request An {@link IRpcRequest}
	 * @return An array of CollateralTokenDetail
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<CollateralTokenDetail[]> listCollateralTokens(IRpcRequest<CollateralTokenDetail[]> request)
			throws IOException, ApiError {
		return (RpcResponse<CollateralTokenDetail[]>) client.call(request);
	}

	/**
	 * 
	 * Obtain an array of {@link CollateralTokenDetail}'s
	 * 
	 * @return An array of CollateralTokenDetail
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<CollateralTokenDetail[]> listCollateralTokens() throws IOException, ApiError {
		return (RpcResponse<CollateralTokenDetail[]>) client.call(new ListCollateralTokenRequest());
	}

	/**
	 * 
	 * @param tokenid The token id to request detail for
	 * @return The {@link CollateralTokenDetail} for the requested id
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<CollateralTokenDetail> getCollateralTokens(String tokenid) throws IOException, ApiError {
		return (RpcResponse<CollateralTokenDetail>) client.call(new GetCollateralTokenRequest(tokenid));
	}

	/**
	 * 
	 * Obtain an array of {@link LoanScheme}'s
	 * 
	 * @return An array of LoanScheme
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<LoanScheme[]> listLoanSchemes() throws IOException, ApiError {
		return (RpcResponse<LoanScheme[]>) client.call(new ListLoanSchemeRequest());
	}

	/**
	 * 
	 * @param loanschemeid The Loan Scheme id to request detail for
	 * @return The {@link LoanScheme} for the requested id
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<LoanScheme> getLoanSchemes(String loanschemeid) throws IOException, ApiError {
		return (RpcResponse<LoanScheme>) client.call(new GetLoanSchemeRequest(loanschemeid));
	}
	/**
	 * 
	 * Obtain an array of {@link LoanTokenResult}'s
	 * 
	 * @return An array of LoanTokenResult
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<LoanTokenResult[]> listLoanTokens() throws IOException, ApiError {
		return (RpcResponse<LoanTokenResult[]>) client.call(new ListLoanTokenRequest());
	}
	/**
	 * 
	 * @return {@link LoanInfo}
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<LoanInfo> getLoanInfo() throws IOException, ApiError {
		return (RpcResponse<LoanInfo>) client.call(new GetLoanInfoRequest());
	}
	/**
	 * 
	 * @param schemeId The Loan Scheme id to request detail for
	 * @return The {@link Interest} for the requested id
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings({ "unchecked" })
	public RpcResponse<Interest> getInterest(String schemeId) throws IOException, ApiError {
		return (RpcResponse<Interest>) client.call(new GetInterestRequest(schemeId));
	}
	/**
	 * 
	 * @param address The address of the owner of the new vault
	 * @return	- A string representation of this transaction
	 * @throws IOException
	 * @throws ApiError
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<String> createVault(String address) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new CreateVaultRequest(address));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> updateVault(String vaultid, UpdateVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new UpdateVaultRequest(vaultid, options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<Vault> getVault(String vaultid) throws IOException, ApiError {
		return (RpcResponse<Vault>) client.call(new GetVaultRequest(vaultid));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<Vault[]> listVaults(ListVaultOptions options, VaultPagination pagination)
			throws IOException, ApiError {
		return (RpcResponse<Vault[]>) client.call(new ListVaultRequest(options, pagination));
	}

	/**
	 * 
	 * Obtain an array of {@link Vault}'s
	 * @param options The {@link ListVaultOptions} for the list request
	 * @return An array of LoanTokenResult
	 * @throws IOException - If unable to establish connection with node
	 * @throws ApiError    - If unable to parse the RPC response
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<Vault[]> listVaults(ListVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<Vault[]>) client.call(new ListVaultRequest(options, null));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<Vault[]> closeVault(CloseVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<Vault[]>) client.call(new CloseVaultRequest(options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<String> depositToVault(DepositToVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new DepositToVaultRequest(options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<String> withdrawFromVault(WithdrawFromVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new WithdrawFromVaultRequest(options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<String> takeLoan(TakeLoanOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new TakeLoanRequest(options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<String> paybackLoan(PaybackLoanOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new PaybackLoanRequest(options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<String> placeAuctionBid(PlaceAuctionBidOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new PlaceAuctionBidRequest(options));
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<List<VaultLiquidation>> listAuctions(AuctionPagination pagination) throws IOException, ApiError {
		return (RpcResponse<List<VaultLiquidation>>) client.call(new ListAuctionRequest(pagination));
	}

}
