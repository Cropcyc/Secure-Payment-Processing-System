package com.interswitch.secure_payment_processing_system.services;

import com.interswitch.secure_payment_processing_system.dtos.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MobileWalletService {

    private final MockPaymentGatewayService mockPaymentGatewayService;

    public ApiResponse callGateway(){
        return mockPaymentGatewayService.mockMobileWalletOperation();
    }
}
