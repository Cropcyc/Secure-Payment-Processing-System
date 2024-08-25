package com.interswitch.secure_payment_processing_system.controllers;

import com.interswitch.secure_payment_processing_system.dtos.requests.AccountTransferRequest;
import com.interswitch.secure_payment_processing_system.dtos.responses.ApiResponse;
import com.interswitch.secure_payment_processing_system.services.AccountTransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spps")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AccountTransferController {
    private final AccountTransferService accountTransferService;

    @PostMapping("/transfer")
    public ResponseEntity<ApiResponse> doTransfer(@RequestBody AccountTransferRequest accountTransferRequest) {

        log.info("::: Inside doTransfer :::");
        return new ResponseEntity<>(accountTransferService.makeBankTransfer(accountTransferRequest), HttpStatus.OK);
    }
}
