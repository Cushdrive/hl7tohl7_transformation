package com.baxter.hl7.transformers.v22;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import com.baxter.hl7.transformers.HL7ParserBase;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

/**
 * Created by jayson on 8/28/16.
 */
@MessageEndpoint
public class HL7ParserV22 extends HL7ParserBase {
    @Override
    @Transformer
    public Message parseMessage(String message) throws HL7Exception {
        return super.parseMessage(message);
    }
}
