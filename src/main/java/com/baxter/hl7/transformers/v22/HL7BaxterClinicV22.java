package com.baxter.hl7.transformers.v22;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v22.message.ORU_R01;
import com.baxter.hl7.transformers.HL7Customizer;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

/**
 * Created by jayson on 8/28/16.
 */
@MessageEndpoint
public class HL7BaxterClinicV22 implements HL7Customizer<Message> {

    @Override
    @Transformer
    public Message customizeHL7(Message hl7message) {
        System.out.println("Customizing an HL7 version 2.2 message.");
        ORU_R01 oruMessage = (ORU_R01) hl7message;
        try {
            //Here's where the magic happens.
            oruMessage.getMSH().getMsh6_ReceivingFacility().setValue("Baxter Healthcare Corp.");
        } catch (DataTypeException e) {
            e.printStackTrace();
        }

        return oruMessage;
    }
}
