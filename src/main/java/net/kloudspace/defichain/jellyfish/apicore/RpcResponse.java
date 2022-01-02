package net.kloudspace.defichain.jellyfish.apicore;

public class RpcResponse<T> {
	
	private static final RpcError NO_ERROR = new RpcError(-1, "NOERROR");

	private final T data;
	private final RpcError ERROR;
	private final int ID;
	
	private final boolean isErrored;
	
	public RpcResponse(T data, int id) {
		this(data, id, NO_ERROR);
	}
	
	@SuppressWarnings("unchecked")
	public RpcResponse(RpcError error, int id) {
		this((T)error, -1, error);
	}
	
	public RpcResponse(T data, int id, RpcError error) {
		this.data = data;
		this.ID = id;
		this.ERROR = error;
		if(ERROR != NO_ERROR)this.isErrored = true;
		else this.isErrored = false;
	}
	

	public T get() {return data;}
	
	public RpcError getERROR() {
		return ERROR;
	}
	
	public int getID() {
		return ID;
	}
	
	public boolean isErrored() {return this.isErrored;}
	
	
}
