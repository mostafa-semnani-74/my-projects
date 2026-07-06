package ir.mostafa.semnani.banking_system.controller;

import ir.mostafa.semnani.banking_system.dto.request.CustomerSaveRequestDTO;
import ir.mostafa.semnani.banking_system.dto.response.CustomerSaveResponseDTO;
import ir.mostafa.semnani.banking_system.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public CustomerSaveResponseDTO save(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO) {
        log.info("customer save rest api called with requestDTO: {}", customerSaveRequestDTO);
        var response = customerService.save(customerSaveRequestDTO);
        log.info("customer saved api success with response : {}", response);
        return response;
    }

}
