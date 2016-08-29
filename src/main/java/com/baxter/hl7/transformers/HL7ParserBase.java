package com.baxter.hl7.transformers;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;

/**
 * Created by jayson on 8/28/16.
 */
public class HL7ParserBase implements HL7Parser {
    @Override
    public Message parseMessage(String message) throws HL7Exception {
        HapiContext context = new DefaultHapiContext();

        Parser parser = context.getGenericParser();

        //Convert newlines to carriage returns
        message = message.replaceAll("\n","\r");
        return parser.parse(message);
    }
}
