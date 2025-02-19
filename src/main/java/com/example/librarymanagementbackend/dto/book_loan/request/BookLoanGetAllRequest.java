package com.example.librarymanagementbackend.dto.book_loan.request;

import com.example.librarymanagementbackend.constants.BookLoanStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookLoanGetAllRequest {
    String bookTitle;
    BookLoanStatus status;
    String userId;
    Integer skipCount;
    Integer maxResultCount;
}