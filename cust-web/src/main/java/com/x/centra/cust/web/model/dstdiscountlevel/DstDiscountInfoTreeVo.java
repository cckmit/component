package com.x.centra.cust.web.model.dstdiscountlevel;

import java.io.Serializable;

public class DstDiscountInfoTreeVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6406851631997151770L;
	private String id;
	private String pId;
	private String name;
	private String type;
	private Boolean open;
	private Boolean checked = false;
	private Boolean hidden = false;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

}
