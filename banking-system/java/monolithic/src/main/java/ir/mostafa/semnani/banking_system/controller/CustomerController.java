package ir.mostafa.semnani.banking_system.controller;

import ir.mostafa.semnani.banking_system.dto.request.CustomerSaveRequestDTO;
import ir.mostafa.semnani.banking_system.dto.response.CustomerSaveResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    @PostMapping
    public CustomerSaveResponseDTO save(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO) {
        log.info("customer save rest api called with requestDTO: {}", customerSaveRequestDTO);
        var response = new CustomerSaveResponseDTO();
        log.info("customer saved api success with response : {}", response);
        return response;
    }

}
