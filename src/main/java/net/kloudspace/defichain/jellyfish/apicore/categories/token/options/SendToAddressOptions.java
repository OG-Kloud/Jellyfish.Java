package net.kloudspace.defichain.jellyfish.apicore.categories.token.options;

import net.kloudspace.defichain.jellyfish.Options;

public class SendToAddressOptions extends Options {

	private String comment;
	private String commentTo;
	private boolean subtractFeeFromAmount;
	private boolean replaceable;
	private Number confTarget;
	private String estimateMode;
	private boolean avoidReuse;

	public String getComment() {
		return comment;
	}

	public SendToAddressOptions setComment(String comment) {
		this.comment = comment;
		return this;
	}

	public String getCommentTo() {
		return commentTo;
	}

	public SendToAddressOptions setCommentTo(String commentTo) {
		this.commentTo = commentTo;
		return this;
	}

	public boolean isSubtractFeeFromAmount() {
		return subtractFeeFromAmount;
	}

	public SendToAddressOptions setSubtractFeeFromAmount(boolean subtractFeeFromAmount) {
		this.subtractFeeFromAmount = subtractFeeFromAmount;
		return this;
	}

	public boolean isReplaceable() {
		return replaceable;
	}

	public SendToAddressOptions setReplaceable(boolean replaceable) {
		this.replaceable = replaceable;
		return this;
	}

	public Number getConfTarget() {
		return confTarget;
	}

	public SendToAddressOptions setConfTarget(Number confTarget) {
		this.confTarget = confTarget;
		return this;
	}

	public String getEstimateMode() {
		return estimateMode;
	}

	public SendToAddressOptions setEstimateMode(String estimateMode) {
		this.estimateMode = estimateMode;
		return this;
	}

	public boolean isAvoidReuse() {
		return avoidReuse;
	}

	public SendToAddressOptions setAvoidReuse(boolean avoidReuse) {
		this.avoidReuse = avoidReuse;
		return this;
	}

}
