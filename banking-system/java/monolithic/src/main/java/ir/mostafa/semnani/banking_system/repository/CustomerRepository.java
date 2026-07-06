package ir.mostafa.semnani.banking_system.repository;

import ir.mostafa.semnani.banking_system.entity.mongodb.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
