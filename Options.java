package net.kloudspace.defichain.jellyfish;

import com.google.gson.Gson;

public class Options {
	
	public String getAsParameter() {
		return new Gson().toJson(this);
	}

}
