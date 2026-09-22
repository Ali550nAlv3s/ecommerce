package com.tads.ecommerce.service.exception;

import com.tads.ecommerce.dto.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StanderError {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

}
