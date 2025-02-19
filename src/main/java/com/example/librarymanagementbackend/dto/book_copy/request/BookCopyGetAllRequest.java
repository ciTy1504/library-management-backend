package com.example.librarymanagementbackend.dto.book_copy.request;

import com.example.librarymanagementbackend.constants.BookCopyStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookCopyGetAllRequest {
    String bookId;
    String bookTitle;
    BookCopyStatus status;
    Integer skipCount;
    Integer maxResultCount;
}