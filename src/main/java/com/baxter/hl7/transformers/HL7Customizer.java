package com.baxter.hl7.transformers;

import ca.uhn.hl7v2.model.Message;

/**
 * Created by jayson on 8/28/16.
 */
public interface HL7Customizer<T> {
    T customizeHL7(T hl7message);
}
