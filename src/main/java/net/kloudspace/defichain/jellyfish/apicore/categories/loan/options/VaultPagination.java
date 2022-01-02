package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import net.kloudspace.defichain.jellyfish.model.Pagination;

public class VaultPagination extends Pagination<String> {
	
	public VaultPagination(String start, boolean inclusive, Number limit) {
		super(start, inclusive, limit);
	}
	
	public VaultPagination() {
	
	}

}
