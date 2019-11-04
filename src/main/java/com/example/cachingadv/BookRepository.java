package com.example.cachingadv;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
