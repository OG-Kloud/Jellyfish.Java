package net.kloudspace.defichain.jellyfish.apicore.categories.masternode.options;

import net.kloudspace.defichain.jellyfish.model.Pagination;

public class MasternodePagination extends Pagination<String> {

	public MasternodePagination() {
		super();
	}

	public MasternodePagination(String start, boolean inclusive, Number limit) {
		super(start, inclusive, limit);
	}

	public MasternodePagination(String start) {
		super(start);
	}
	
	
	
	

}
