package com.interswitch.secure_payment_processing_system.dtos.requests;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class AccountTransferRequest {

    private String debitAccount;
    private String creditAccount;
    private String amount;
    private String narration;

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
