/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.x.platform.common.supcan.treelist;

import java.util.List;

import com.x.platform.common.supcan.annotation.common.fonts.SupFont;
import com.x.platform.common.supcan.annotation.treelist.SupTreeList;
import com.x.platform.common.supcan.common.Common;
import com.x.platform.common.supcan.common.fonts.Font;
import com.x.platform.common.supcan.common.properties.Properties;
import com.google.common.collect.Lists;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.x.platform.common.supcan.annotation.common.fonts.SupFont;
import com.x.platform.common.supcan.annotation.treelist.SupTreeList;
import com.x.platform.common.supcan.common.properties.Properties;

/**
 * 硕正TreeList
 * @author bonc
 * @version 2013-11-04
 */
@XStreamAlias("TreeList")
public class TreeList extends Common {

	/**
	 * 列集合
	 */
	@XStreamAlias("Cols")
	private List<Object> cols;

	public TreeList() {
		super();
	}
	
	public TreeList(Properties properties) {
		this();
		this.properties = properties;
	}
	
	public TreeList(SupTreeList supTreeList) {
		this();
		if (supTreeList != null){
			if (supTreeList.properties() != null){
				this.properties = new Properties(supTreeList.properties());
			}
			if (supTreeList.fonts() != null){
				for (SupFont supFont : supTreeList.fonts()){
					if (this.fonts == null){
						this.fonts = Lists.newArrayList();
					}
					this.fonts.add(new Font(supFont));
				}
			}
		}
	}
	
	public List<Object> getCols() {
		if (cols == null){
			cols = Lists.newArrayList();
		}
		return cols;
	}

	public void setCols(List<Object> cols) {
		this.cols = cols;
	}

}
