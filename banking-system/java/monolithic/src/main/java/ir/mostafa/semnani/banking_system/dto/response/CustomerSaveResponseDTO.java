package ir.mostafa.semnani.banking_system.dto.response;

import lombok.Builder;

@Builder
public record CustomerSaveResponseDTO(

        String id,
        String firstName,
        String lastName

) {
}
