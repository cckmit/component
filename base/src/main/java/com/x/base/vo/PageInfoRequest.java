package com.x.base.vo;

/**
 * 分页查询请求对象, 继承BaseInfo.<br>
 * 分页查询接口入参继承此类
 */
public class PageInfoRequest extends BaseInfo {
	private static final long serialVersionUID = 1L;

	/**
	 * 请求查询的页码
	 */
	private Integer pageNo = 1;

	/**
	 * 每页显示条数
	 */
	private Integer pageSize = 5;

	/**
	 * 总条数
	 */
//	private int count = 0;

	/**
	 * 总页数
	 */
//	private int pageCount;
	private int startRowIndex;
    private int endRowIndex;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

//	public int getCount() {
//		return count;
//	}

//	public void setCount(int count) {
//		this.count = count;
//	}

	/**
	 * 获取开始行
	 */
	public int getStartRowIndex() {
		startRowIndex = (this.getPageNo() - 1) * this.getPageSize();
		return startRowIndex;
	}

	/**
	 * 获取结束行
	 */
	public int getEndRowIndex() {
		endRowIndex = this.getPageNo() * this.getPageSize();
		return endRowIndex;
	}

	@Deprecated
	public void setStartRowIndex(int startRowIndex) {
		this.startRowIndex = startRowIndex;
	}

	@Deprecated
	public void setEndRowIndex(int endRowIndex) {
		this.endRowIndex = endRowIndex;
	}

	/**
	 * 获取最大页数
	 */
//	public int getPageCount() {
//		int quotient = this.getCount() / this.getPageSize();
//		int remainder = this.getCount() % this.getPageSize();
//		pageCount = quotient;
//		return remainder > 0 ? ++pageCount : pageCount;
//	}

//	public void setPageCount(int pageCount) {
//		this.pageCount = pageCount;
//	}
}
