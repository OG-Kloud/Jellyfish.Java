package net.kloudspace.defichain.jellyfish.apicore.categories.wallet;

import java.io.IOException;
import java.math.BigDecimal;

import net.kloudspace.defichain.jellyfish.RpcClient;
import net.kloudspace.defichain.jellyfish.RpcClient.ApiError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.options.SendToAddressOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.AddressInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.CreateWalletResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.InWalletTransaction;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.UTXO;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.ValidateAddressResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.WalletBalances;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.WalletFlagResult;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.model.WalletInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.CreateWalletOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.ListUnspentOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.SendManyOptions;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.CreateWalletRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.DumpPrivKeyRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.GetAddressInfo;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.GetBalanceRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.GetBalancesRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.GetNewAddressRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.GetTransactionRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.GetUnconfirmedBalanceRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.GetWalletInfoRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.ImportPrivKeyRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.ListUnspentRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.SendToAddressRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.SetWalletFlagRequest;
import net.kloudspace.defichain.jellyfish.apicore.categories.wallet.requests.ValidateAddressRequest;

public class WalletController {
	
	
	private RpcClient client;
	
	public WalletController(RpcClient client) {
		this.client = client;
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<BigDecimal> getBalance() throws IOException, ApiError {
		return (RpcResponse<BigDecimal>) client.call(new GetBalanceRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<BigDecimal> getUnconfirmedBalance() throws IOException, ApiError {
		return (RpcResponse<BigDecimal>) client.call(new GetUnconfirmedBalanceRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<WalletBalances> getBalances() throws IOException, ApiError {
		return (RpcResponse<WalletBalances>)client.call(new GetBalancesRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<UTXO[]>	listUnspent(ListUnspentOptions options) throws IOException, ApiError {
		return (RpcResponse<UTXO[]>) client.call(new ListUnspentRequest(options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<CreateWalletResult> createWallet(String walletName, boolean disablePrivateKeys, CreateWalletOptions options) throws IOException, ApiError {
		return (RpcResponse<CreateWalletResult>) client.call(new CreateWalletRequest(walletName, disablePrivateKeys, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<InWalletTransaction> getTransaction(String txid) throws IOException, ApiError {
		return (RpcResponse<InWalletTransaction>) client.call(new GetTransactionRequest(txid));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<WalletInfo> getWalletInfo() throws IOException, ApiError {
		return (RpcResponse<WalletInfo>) client.call(new GetWalletInfoRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<WalletFlagResult> setWalletFlag(String flag, boolean flagstate) throws IOException, ApiError {
		return (RpcResponse<WalletFlagResult>) client.call(new SetWalletFlagRequest(flag, flagstate));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> getNewAddress(String label) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new GetNewAddressRequest(label));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<ValidateAddressResult> validateAddress(String address) throws IOException, ApiError {
		return (RpcResponse<ValidateAddressResult>) client.call(new ValidateAddressRequest(address));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<AddressInfo> getAddressInfo(String address) throws IOException, ApiError {
		return (RpcResponse<AddressInfo>) client.call(new GetAddressInfo(address));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> sentToAddress(String address, BigDecimal amount, SendToAddressOptions options) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new SendToAddressRequest(address, amount, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> sendMany(net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options.Record amounts, String[] subtractFeeFrom, SendManyOptions options) throws IOException, ApiError { 
		return (RpcResponse<String>) client.call(new SendManyRequest(amounts, subtractFeeFrom, options));
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> dumpPrivKey() throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new DumpPrivKeyRequest());
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse<String> importPrivKey(String privkey, String label, boolean rescan) throws IOException, ApiError {
		return (RpcResponse<String>) client.call(new ImportPrivKeyRequest(privkey, label, rescan));
	}
	
	/**
	 * 	TODO:
	 *  1. getbalance				-Done
	 *  2. getunconfirmedbalance	-Done
	 *  3. getbalances				-Done
	 *  4. listunspent				-Done
	 *  5. createwallet				-Done	
	 *  6. gettransaction			-Done
	 *  7. getwalletinfo			-Done
	 *  8. setwalletflag			-Done
	 *  9. getnewaddress			-Done
	 * 10. validateaddress			-Done
	 * 11. getaddressinfo			-Done
	 * 12. sendtoaddress			-Done
	 * 13. listaddressgroupings			-NEED IMPLEMENTATION
	 * 14. sendmany					-Done
	 * 15. dumpprivkey				-Done
	 * 16. importprivkey			-Done
	 */

}
