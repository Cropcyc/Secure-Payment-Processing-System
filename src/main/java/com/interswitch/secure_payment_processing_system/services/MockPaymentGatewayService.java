package com.interswitch.secure_payment_processing_system.services;


import com.interswitch.secure_payment_processing_system.dtos.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MockPaymentGatewayService {

    private ApiResponse mockResponse = ApiResponse.builder().status("000").description("Success").data("Transaction was successful").build();

    public ApiResponse mockAccountTransfer(){
        log.info("::: Inside mockAccountTransfer :::");
        return mockResponse;
    }

    public ApiResponse mockCreditCardTransaction(){
        log.info("::: Inside mockCreditCardTransaction :::");
        return mockResponse;
    }

    public ApiResponse mockMobileWalletOperation(){
        log.info("::: Inside mockMobileWalletOperation :::");
        return mockResponse;
    }
}
