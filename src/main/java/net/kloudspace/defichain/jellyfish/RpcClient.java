package net.kloudspace.defichain.jellyfish;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.kloudspace.defichain.jellyfish.apicore.ApiClient;
import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcError;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.AccountController;
import net.kloudspace.defichain.jellyfish.apicore.categories.blockchain.Blockchain;
import net.kloudspace.defichain.jellyfish.apicore.categories.governance.GovernanceController;
import net.kloudspace.defichain.jellyfish.apicore.categories.loan.LoanController;
import net.kloudspace.defichain.jellyfish.apicore.categories.mining.MiningController;
import net.kloudspace.defichain.jellyfish.apicore.categories.net.NetworkController;
import net.kloudspace.defichain.jellyfish.apicore.categories.poolpair.PoolPairController;
import net.kloudspace.defichain.jellyfish.apicore.categories.server.Server;
import net.kloudspace.defichain.jellyfish.apicore.categories.token.TokenController;

public class RpcClient extends ApiClient {

	@SuppressWarnings("unused")
	private final String daemonUrl;
	@SuppressWarnings("unused")
	private final String rpcUsername;
	@SuppressWarnings("unused")
	private final String rpcPassword;
	private final Number rpcRequestTimeout;

	public static final String DUMMY_ADDRESS = "dZpek97RbpjTrNNEianYfgkws6xdahpnu9";

	private final AccountController accountController = new AccountController(this);
	private final Blockchain blockchain = new Blockchain(this);
	private final LoanController loanController = new LoanController(this);
	private final MiningController mining = new MiningController(this);
	private final PoolPairController poolpairController = new PoolPairController(this);
	private final TokenController tokenController = new TokenController(this);
	private final NetworkController network = new NetworkController(this);
	private final Server server = new Server(this);
	private final GovernanceController governance = new GovernanceController(this);
//	private final ICXOrderBook ixcorderbook;
//	private final MasternodeController masternode;
//	private final OracleController oracle;
//	private final RawTxController rawtx;
//	private final SPVController spv;
//	private final WalletController wallet;

	public static boolean isLoading = true;

	public RpcClient(String url, String username, String password, Number timeout) {
		this.daemonUrl = url;
		this.rpcUsername = username;
		this.rpcPassword = password;
		this.rpcRequestTimeout = timeout;
		System.out.println("Client Constructed");

	}

	public AccountController getAccountController() {
		return this.accountController;
	}

	public Blockchain getBlockchain() {
		return this.blockchain;
	}
	
	public GovernanceController getGovernanceController() {
		return this.governance;
	}
	
	public LoanController getLoanController() {
		return this.loanController;
	}

	public MiningController getMiningController() {
		return this.mining;
	}
	
	public NetworkController getNetworkController() {
		return this.network;
	}

	public PoolPairController getPoolController() {
		return this.poolpairController;
	}
	
	public Server getServer() {
		return this.server;
	}

	public TokenController getTokenController() {
		return this.tokenController;
	}

	public RpcResponse<?> call(final IRpcRequest<?> irr) throws IOException, ApiError {
		URL url = new URL(daemonUrl);

		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setRequestMethod("POST");
		http.setDoOutput(true);
		http.setRequestProperty("Authorization", "Basic " + encodeAuthToBase64());
		http.setRequestProperty("Content-Type", "application/json");
		http.setConnectTimeout((int) rpcRequestTimeout);
		System.out.println(irr.getParameters().toString());
		String data = "{\n  \"jsonrpc\":1.0,\n  \"id\":1,\n  \"method\":\"" + irr.getName() + "\",\n  \"params\":"
				+ irr.getParameters() + "\n}";// TODO:
		// implement
		// params
		System.out.println(data);
		byte[] out = data.getBytes(StandardCharsets.UTF_8);

		OutputStream stream = http.getOutputStream();
		stream.write(out);

		System.out.println(http.getResponseCode() + " " + http.getResponseMessage() + " : " + irr.getName());
		if (http.getResponseCode() != 200)
			return new RpcResponse<>(new RpcError(http.getResponseCode(), http.getResponseMessage()), -1);

		InputStream is = http.getInputStream();
		JsonObject obj = JsonParser.parseReader(new InputStreamReader(is)).getAsJsonObject();

		System.out.println(obj.toString());

		is.close();
		http.disconnect();

		try {
			return irr.parse(obj);
		} catch (ApiError e) {
			return new RpcResponse<>(obj, -2, new RpcError(-2, ""));
		}

	}

	public String encodeAuthToBase64() {
		return Base64.getEncoder().encodeToString((rpcUsername + ":" + rpcPassword).getBytes());
	}
	
	@SuppressWarnings("serial")
	public static class ApiError extends Exception {
		
		public ApiError(String message) {
			super(message);
		}
	}
}
