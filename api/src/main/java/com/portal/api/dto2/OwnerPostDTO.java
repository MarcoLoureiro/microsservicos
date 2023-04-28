package com.portal.api.dto2;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Builder // Permite que eu crie um novo Objeto OwnerPostDTO com qualquer quantidade de atributos necessários
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
public class OwnerPostDTO {
    private String name;
    private String type;
    private String contactNumber;

}
