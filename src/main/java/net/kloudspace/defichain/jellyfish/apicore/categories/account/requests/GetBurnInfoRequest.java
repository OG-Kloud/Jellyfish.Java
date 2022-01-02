package net.kloudspace.defichain.jellyfish.apicore.categories.account.requests;

import com.google.gson.JsonObject;

import net.kloudspace.defichain.jellyfish.apicore.IRpcRequest;
import net.kloudspace.defichain.jellyfish.apicore.RpcResponse;
import net.kloudspace.defichain.jellyfish.apicore.categories.account.model.BurnInfo;

public class GetBurnInfoRequest<T> implements IRpcRequest<T> {
	
	private BurnInfo burninfo = new BurnInfo();

	@Override
	public String getName() {
		return "getburninfo";
	}

	@Override
	public String getParameters() {
		return "[]";
	}

	@SuppressWarnings("unchecked")//Not unchecked ????
	@Override
	public RpcResponse<T> parse(JsonObject obj) {
		JsonObject result_obj = obj.get("result").getAsJsonObject();
		float amount = result_obj.get("amount").getAsFloat();
		float fee = result_obj.get("feeburn").getAsFloat();
		float emission = result_obj.get("emissionburn").getAsFloat();
		burninfo.setAMOUNT(amount);
		burninfo.setFEEBURN(fee);
		burninfo.setEMISSIONBURN(emission);
		return new RpcResponse<T>((T)burninfo, obj.get("id").getAsInt());
	}

}
