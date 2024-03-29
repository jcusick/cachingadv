package com.example.cachingadv;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements  BookRepository{

    @Override
    //@Cacheable("books")
    @Cacheable("booksByIsbn")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "SomeBook");
    }

    private void simulateSlowService(){
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e){
            throw new IllegalStateException(e);
        }
    }


}
