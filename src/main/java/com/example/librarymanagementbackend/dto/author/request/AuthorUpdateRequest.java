package com.example.librarymanagementbackend.dto.author.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthorUpdateRequest {
    int id;
    @NotBlank(message = "Name is mandatory")
    String name;
}