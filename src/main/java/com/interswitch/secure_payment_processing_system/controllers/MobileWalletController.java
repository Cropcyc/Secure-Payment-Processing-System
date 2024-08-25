package com.interswitch.secure_payment_processing_system.controllers;

import com.interswitch.secure_payment_processing_system.dtos.requests.AccountTransferRequest;
import com.interswitch.secure_payment_processing_system.dtos.responses.ApiResponse;
import com.interswitch.secure_payment_processing_system.services.CreditCardService;
import com.interswitch.secure_payment_processing_system.services.MobileWalletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spps")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MobileWalletController {

    private final MobileWalletService mobileWalletService;

    @PostMapping("/mobile-wallet")
    public ResponseEntity<ApiResponse> doMobileWalletOperation(@RequestBody AccountTransferRequest accountTransferRequest) {

        log.info("::: Inside doMobileWalletOperation :::");
        return new ResponseEntity<>(mobileWalletService.callGateway(), HttpStatus.OK);
    }
}
