package net.kloudspace.defichain.jellyfish.apicore.categories.wallet.options;

import net.kloudspace.defichain.jellyfish.Options;

public class SendManyOptions extends Options {

	private String comment;
	private boolean replaceable;
	private Number confTarget;
	private Mode estimateMode;

	public String getComment() {
		return comment;
	}

	public SendManyOptions setComment(String comment) {
		this.comment = comment;
		return this;
	}

	public boolean isReplaceable() {
		return replaceable;
	}

	public SendManyOptions setReplaceable(boolean replaceable) {
		this.replaceable = replaceable;
		return this;
	}

	public Number getConfTarget() {
		return confTarget;
	}

	public SendManyOptions setConfTarget(Number confTarget) {
		this.confTarget = confTarget;
		return this;
	}

	public Mode getEstimateMode() {
		return estimateMode;
	}

	public SendManyOptions setEstimateMode(Mode estimateMode) {
		this.estimateMode = estimateMode;
		return this;
	}

	public static enum Mode {
		UNSET("UNSET"), ECONOMICAL("ECONOMICAL"), CONSERVATIVE("CONSERVATIVE");

		private final String ID;

		private Mode(String id) {
			this.ID = id;
		}

		public String getID() {
			return ID;
		}

	}

}
