package com.xc.dto;

public class PageDto {
	private Integer page;
	private Integer pageSize;

	public Integer getPage() {
		if(page<1) page=1;
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
