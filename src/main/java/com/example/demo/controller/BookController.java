package com.example.demo.controller;

import com.example.demo.mapper.BookMapper;
import com.example.demo.mapper2.BookMapper2;
import com.example.demo.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping("/")
    /*@CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")*/
    public String addBook(String name){
        return "receive:"+name;
    }

    @DeleteMapping("/{id}")
   /* @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")*/
    public String deleteBookById(@PathVariable Long id){
        return String.valueOf(id);
    }

  /*  @Autowired
    BookService bookService;
    @GetMapping("/add")
    public void book(){
        Book book = new Book(null,"朝花夕拾","鲁迅");
        int i = bookService.addBook(book);
        System.out.println("addBook>>>>>"+i);
    }

    @GetMapping("/add2")
    public void book2(){
        Book book = new Book(null,"朝花夕拾","鲁迅");
        int i = bookService.add(book);
        System.out.println("addBook>>>>>"+i);
    }
*/
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookMapper2 bookMapper2;
    @GetMapping("/test1")
    public void test1(){
        List<Book> books1 = bookMapper.getAllBooks();
        List<Book> books2 = bookMapper2.getAllBooks();
        System.out.println("books1:"+books1);
        System.out.println("books2:"+books2);
    }
}
