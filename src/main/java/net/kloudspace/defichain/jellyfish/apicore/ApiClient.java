package net.kloudspace.defichain.jellyfish.apicore;

public abstract class ApiClient {

//	public abstract String call(String method, Object[] params);
//	public abstract RpcResponse<?> call(IRpcRequest<?> irr) throws IOException;

	public static class ApiException extends Exception {
		private static final long serialVersionUID = 1L;

	}

	public static class ClientApiException extends ApiException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public final String message;
		public ClientApiException(String msg) {
			super();
			this.message = msg;
		}
	}

	public static class RpcApiException extends ApiException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public final String code;
		public final String message;
		public final String method;
		public RpcApiException(String code, String msg, String meth) {
			super();
			this.code = code;
			this.message = msg;
			this.method = meth;
		}
	}

}
