package net.kloudspace.defichain.jellyfish.apicore.categories.server.model;

public class RpcInfo {

	private ActiveCommand[] active_commands;
	private String logpath;

	public ActiveCommand[] getActive_commands() {
		return active_commands;
	}

	public String getLogpath() {
		return logpath;
	}

	public class ActiveCommand {
		private String method;
		private Number duration;

		public String getMethod() {
			return method;
		}

		public Number getDuration() {
			return duration;
		}

	}

}
