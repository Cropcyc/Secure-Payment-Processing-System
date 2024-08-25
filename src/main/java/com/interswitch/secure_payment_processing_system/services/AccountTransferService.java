package com.interswitch.secure_payment_processing_system.services;

import com.interswitch.secure_payment_processing_system.dtos.requests.AccountTransferRequest;
import com.interswitch.secure_payment_processing_system.dtos.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AccountTransferService {

    private final MockPaymentGatewayService mockPaymentGatewayService;

    public ApiResponse makeBankTransfer(AccountTransferRequest request){
        //TODO
        //Get current balance
        //Confirm that current balance is sufficient to be debited of the requested amount

        log.info("AccountTransferRequest received is {}", request);

        BigDecimal currentBalance = new BigDecimal("100,000");
        BigDecimal transferAmount = new BigDecimal(request.getAmount());

        BigDecimal newBalance = currentBalance.subtract(transferAmount);

        //TODO
        //Make a call to repository where ACID transaction are to actually take place

        mockPaymentGatewayService.mockAccountTransfer();
        return ApiResponse.builder().status("000").description("Success").data("Your new account balance is " + newBalance.toString()).build();
    }
}
