/**
 * MIT License
 *
 * Copyright (c) 2018 Cybozu
 * https://github.com/kintone/kintone-java-sdk/blob/master/LICENSE
 */

package com.cybozu.kintone.client.model.comment;

public class AddCommentResponse {
    private Integer id;

    /**
     * Get record id
     * @return
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set rocord id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
