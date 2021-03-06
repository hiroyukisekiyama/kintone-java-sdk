/**
 * MIT License
 *
 * Copyright (c) 2018 Cybozu
 * https://github.com/kintone/kintone-java-sdk/blob/master/LICENSE
 */

package com.cybozu.kintone.client.model.app.form.field.system;

import com.cybozu.kintone.client.model.app.form.FieldType;

public class RecordNumberField extends AbstractSystemInfoField {
    /**
     * @param code
     */
    public RecordNumberField(String code) {
        this.code = code;
        this.type = FieldType.RECORD_NUMBER;
    }
}
