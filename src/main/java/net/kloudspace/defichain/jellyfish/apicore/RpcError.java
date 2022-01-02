package net.kloudspace.defichain.jellyfish.apicore;

public class RpcError {
	
	private final int CODE;
	private final String MESSAGE;

	public RpcError(int code, String msg) {
		System.out.println("RpcError Creation");
		this.CODE = code;
		this.MESSAGE = msg;
	}
	
	public int getCODE() {
		return CODE;
	}
	
	public String getMESSAGE() {
		return MESSAGE;
	}
	
}
