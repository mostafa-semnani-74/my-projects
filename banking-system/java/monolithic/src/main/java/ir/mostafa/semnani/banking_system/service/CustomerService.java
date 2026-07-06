package ir.mostafa.semnani.banking_system.service;

import ir.mostafa.semnani.banking_system.dto.request.CustomerSaveRequestDTO;
import ir.mostafa.semnani.banking_system.dto.response.CustomerSaveResponseDTO;
import ir.mostafa.semnani.banking_system.entity.mongodb.Customer;
import ir.mostafa.semnani.banking_system.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerSaveResponseDTO save(CustomerSaveRequestDTO requestDTO) {
        try {

            log.info("saving customer in save in CustomerService requestDTO: {}", requestDTO);

            // TODO add mapstruct

            var customer = Customer.builder()
                    .firstName(requestDTO.firstName())
                    .lastName(requestDTO.lastName())
                    .build();

            customerRepository.save(customer);
            log.info("customer saved in save in CustomerService with id : {}", customer.getId());

            return CustomerSaveResponseDTO.builder()
                    .id(customer.getId())
                    .firstName(customer.getFirstName())
                    .lastName(customer.getLastName())
                    .build();

        } catch (Exception e) {
            log.error("error in saving customer in save in CustomerService", e);
            // TODO throw app system exception
            throw e;
        }
    }

}
