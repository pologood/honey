package org.teasoft.honey.osql.core;

import java.util.List;

/**
 * @author Kingstar
 * @since 1.0
 */
class SqlValueWrap {
	private String sql;
	private List<PreparedValue> list;
	private StringBuffer valueBuffer;

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public List<PreparedValue> getList() {
		return list;
	}

	public void setList(List<PreparedValue> list) {
		this.list = list;
	}

	public StringBuffer getValueBuffer() {
		return valueBuffer;
	}

	public void setValueBuffer(StringBuffer valueBuffer) {
		this.valueBuffer = valueBuffer;
	}
}
