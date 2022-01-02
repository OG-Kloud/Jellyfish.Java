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
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.model.LoanTokenDetail;
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
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.ListLoanSchemeRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.ListLoanTokenRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.ListVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.PaybackLoanRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.PlaceAuctionBidRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.TakeLoanRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.UpdateVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.requests.WithdrawFromVaultRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.model.Token;

public class LoanController {

	private RpcClient client;

	public LoanController(RpcClient client) {
		this.client = client;
	}
	
	/**
	 * NOTE: not implemented in rpc yet!! 
	 * DO NOT USE
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ApiError
	 * 
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<String> createLoanScheme(IRpcRequest<LoanScheme> request) throws IOException, ApiError{
		return (RpcResponse<String>)client.call(request);
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<CollateralTokenDetail[]> listCollateralTokens(IRpcRequest<Token> request) throws IOException, ApiError {
		return (RpcResponse<CollateralTokenDetail[]>)client.call(request);
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<CollateralTokenDetail> getCollateralTokens(String tokenid) throws IOException, ApiError {
		return (RpcResponse<CollateralTokenDetail>)client.call(new GetCollateralTokenRequest(tokenid));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<List<LoanScheme>> listLoanSchemes() throws IOException, ApiError {
		return (RpcResponse<List<LoanScheme>>)client.call(new ListLoanSchemeRequest<>());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<LoanScheme> getLoanSchemes(String loanschemeid) throws IOException, ApiError {
		return (RpcResponse<LoanScheme>)client.call(new GetLoanSchemeRequest<>(loanschemeid));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<LoanTokenResult[]> listLoanTokens() throws IOException, ApiError {
		return (RpcResponse<LoanTokenResult[]>)client.call(new ListLoanTokenRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<LoanInfo> getLoanInfo() throws IOException, ApiError {
		return (RpcResponse<LoanInfo>)client.call(new GetLoanInfoRequest<>());
	}
	
	@SuppressWarnings({"unchecked" })
	public RpcResponse<Interest> getInterest(String schemeId) throws IOException, ApiError {
		return (RpcResponse<Interest>)client.call(new GetInterestRequest<>(schemeId));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> createVault(String address) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new CreateVaultRequest<>(address));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> updateVault(String vaultid, UpdateVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new UpdateVaultRequest<>(vaultid, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<Vault> getVault(String vaultid) throws IOException, ApiError {
		return (RpcResponse<Vault>)client.call(new GetVaultRequest<>(vaultid));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<List<Vault>> listVaults(ListVaultOptions options, VaultPagination pagination) throws IOException, ApiError {
		return (RpcResponse<List<Vault>>)client.call(new ListVaultRequest<>(options, pagination));
	}
	/**
	 * 
	 * @param options The Vault Options to include
	 * @return A List of Vaults wrapped as an RpcResponse
	 * @throws IOException
	 * @throws ApiError
	 */
	@SuppressWarnings("unchecked")
	public RpcResponse<List<Vault>> listVaults(ListVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<List<Vault>>)client.call(new ListVaultRequest<>(options, null));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<List<Vault>> closeVault(CloseVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<List<Vault>>)client.call(new CloseVaultRequest<>(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> depositToVault(DepositToVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new DepositToVaultRequest<>(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> withdrawFromVault(WithdrawFromVaultOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new WithdrawFromVaultRequest<>(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> takeLoan(TakeLoanOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new TakeLoanRequest<>(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> paybackLoan(PaybackLoanOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new PaybackLoanRequest<>(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> placeAuctionBid(PlaceAuctionBidOptions options) throws IOException, ApiError {
		return (RpcResponse<String>)client.call(new PlaceAuctionBidRequest(options));
	}
	

	@SuppressWarnings("unchecked")
	public RpcResponse<List<VaultLiquidation>> listAuctions(AuctionPagination pagination) throws IOException, ApiError {
		return (RpcResponse<List<VaultLiquidation>>)client.call(new ListAuctionRequest(pagination));
	}
	
	
	
	/**
	 *  1. createloanscheme			-STARTED
	 *  2. updateloanscheme			-NOT IMPLEMENTED	
	 *  3. listloanschemes			-DONE
	 *  4. getloanscheme			-DONE
	 * 27. setdefaultloanscheme		-NOT IMPLEMENTED
	 *  5. destroyloanscheme		-NOT IMPLEMENTED
	 *  6. setcollateraltoken		-NOT IMPLEMENTED
	 *  7. listcollateraltokens		-DONE
	 *  8. getcollateraltoken		-DONE
	 *  9. getloaninfo				-DONE
	 * 10. setloantoken				-NOT IMPLEMENTED
	 * 11. updateloantoken			-NOT IMPLEMENTED	example --  "params":["TSLA",{"token":{"symbol":"tsla","name":"tesla","fixedIntervalPriceId":0}}]
	 * 12. getinterest				-DONE
	 * 13. getloantoken				
	 * 14. listloantokens			-DONE
	 * 15. createvault				-partial need to test
	 * 16. updatevault				-partial need to test
	 * 17. getvault					-DONE
	 * 18. listvaults				-DONE
	 * 19. closevault				-NEEDS TESTED	
	 * 20. deposittovault			-NEEDS TESTED
	 * 21. withdrawfromvault		-NEEDS TESTED
	 * 22. takeloan					-NEEDS TESTED
	 * 23. paybackloan				-NEEDS TESTED
	 * 24. placeauctionbid			-NEEDS TESTED
	 * 25. listauctions				
	 * 26. listauctionhistory
	 */

}
