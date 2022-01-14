package net.kloudspace.defichain.jellyfish.apicore.categories.account;

import java.io.IOException;
import java.util.List;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountAmount;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountHistory;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountOwner;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.AccountResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.BurnHistory;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.BurnInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.CommunityBalanceData;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.options.AccountHistoryOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.options.BalanceTransferOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.options.BurnHistoryOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.AccountHistoryCountRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.AccountToAccountRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.AccountToUtxosRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.GetAccountRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.GetBurnInfoRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.GetTokenBalancesRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.ListAccountHistoryRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.ListAccountsRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.ListBurnHistoryRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.ListCommunityBalancesRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.requests.UtxoToAccountRequest;

public class AccountController {

	private final RpcClient client;

	public AccountController(RpcClient client) {
		this.client = client;
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<AccountResult<AccountOwner, AccountAmount>[]> listAccounts() throws IOException, ApiError {
		return (RpcResponse<AccountResult<AccountOwner, AccountAmount>[]>) client.call(new ListAccountsRequest());
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<BurnInfo> getBurnInfo() throws IOException, ApiError {
		return (RpcResponse<BurnInfo>) client.call(new GetBurnInfoRequest<>());
	}

	@SuppressWarnings("unchecked")
	public RpcResponse<AccountAmount> getAccount(String accountAddress) throws IOException, ApiError {
		return (RpcResponse<AccountAmount>) client.call(new GetAccountRequest(accountAddress));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<AccountAmount> getTokenBalances() throws IOException, ApiError {
		return (RpcResponse<AccountAmount>) client.call(new GetTokenBalancesRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> utxosToAccount(BalanceTransferOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new UtxoToAccountRequest(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> accountToAccount(String from, BalanceTransferOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new AccountToAccountRequest(from, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> accountToUtxos(String from, BalanceTransferOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new AccountToUtxosRequest(from, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<AccountHistory[]> listAccountHistory(String address, AccountHistoryOptions options) throws IOException, ApiError {
		return (RpcResponse<AccountHistory[]>) client.call(new ListAccountHistoryRequest(address, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<Number> accountHistoryCount(String address) throws IOException, ApiError {
		return (RpcResponse<Number>)client.call(new AccountHistoryCountRequest(address));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<CommunityBalanceData> listCommunityBlanaces() throws IOException, ApiError {
		return (RpcResponse<CommunityBalanceData>) client.call(new ListCommunityBalancesRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<BurnHistory[]> listBurnHistory(BurnHistoryOptions options) throws IOException, ApiError {
		return (RpcResponse<BurnHistory[]>) client.call(new ListBurnHistoryRequest(options));
	}
	
	
	
	
	/**
	 * TODO:
	 * 	1. gettokenbalance			-DONE
	 * 	2. utxostoaccount			-NEED TO TEST
	 * 	3. accounttoaccount			-NEED TO TEST
	 * 	4. accounttoutxos			-NEED TO TEST
	 * 	5. listaccounthistory		-DONE
	 * 	6. historycount				-DONE
	 * 	7. sendtokenstoaddress
	 * 	8. listcommunitybalances	-DONE
	 * 	9. listburnhistory			-DONE
	 */
}
