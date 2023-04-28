package com.portal.api.dto2;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder  // Permite que eu crie um novo Objeto CarPostDTO com qualquer quantidade de atributos necessários
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
public class CarPostDTO {
    private String model;
    private String brand;
    private String price;
    private String description;
    private String engineVersion;
    private String city;
    private String createdDate;
    private Long ownerId;
    private String ownerName;
    private String ownerType;
    private String contact;
}
