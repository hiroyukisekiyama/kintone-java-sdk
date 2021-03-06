/**
 * MIT License
 *
 * Copyright (c) 2018 Cybozu
 * https://github.com/kintone/kintone-java-sdk/blob/master/LICENSE
 */

package com.cybozu.kintone.client.model.record;

public class UpdateRecordResponse {

	private Integer revision;

	/**
	 * Get revision number of record
	 * @return
	 */
	public Integer getRevision() {
		return this.revision;
	}

	/**
	 * Set revision number of record
	 * @param revision
	 */
	public void setRevision(Integer revision) {
		this.revision = revision;
	}

}
