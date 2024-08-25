package com.interswitch.secure_payment_processing_system.dtos.responses;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse {
    private String status;
    private String description;
    private String data;

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
