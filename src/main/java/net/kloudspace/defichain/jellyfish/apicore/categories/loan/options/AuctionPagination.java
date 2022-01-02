package net.kloudspace.defichain.jellyfish.apicore.categories.loan.options;

import net.kloudspace.defichain.jellyfish.model.Pagination;

public class AuctionPagination extends Pagination<AuctionPaginationStart> {
	
	public AuctionPagination(AuctionPaginationStart start) {
		super(start);
	}
	
	public AuctionPagination(AuctionPaginationStart start, boolean inclusive, Number limit) {
		super(start, inclusive, limit);
	}
	
	public AuctionPagination() {
		
	}

}
