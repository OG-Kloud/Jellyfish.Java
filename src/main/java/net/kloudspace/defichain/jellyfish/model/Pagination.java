package net.kloudspace.defichain.jellyfish.model;

import com.google.gson.Gson;

public class Pagination<T> {

	private T start = null;
	private boolean including_start=true;
	private Number limit=100;
	
	protected Pagination(T start, boolean inclusive, Number limit) {
		this.start = start;
		this.including_start = inclusive;
		this.limit = limit;
	}
	
	public Pagination(T start) {
		this.start = start;
	}
		
	public Pagination() {
		
	}
	
	public Pagination<T> setLimit(Number limit) {this.limit = limit;return this;}
	public Pagination<T> setInclusivity(boolean inclusive) {this.including_start = inclusive;return this;}

	public T getStart() {
		return start;
	}

	public boolean isIncludingStart() {
		return including_start;
	}

	public Number getLimit() {
		return limit;
	}
	
	public String getAsParameter() {
		return new Gson().toJson(this);
	}
	
	
}
