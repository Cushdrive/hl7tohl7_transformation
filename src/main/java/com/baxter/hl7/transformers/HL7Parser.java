package com.baxter.hl7.transformers;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;

/**
 * Created by jayson on 8/28/16.
 */
public interface HL7Parser {
    Message parseMessage(String message) throws HL7Exception;
}
