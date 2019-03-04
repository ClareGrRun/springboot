/*
package com.example.demo.controller;

import com.example.demo.pojo.Book;
import com.example.demo.pojo.Books;
import com.example.demo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {
    @Autowired
    BooksService booksService;

    @GetMapping("/findAll")
    public void findAll(){
        PageRequest pageRequest = PageRequest.of(0,3);
        Page<Books> page = booksService.getBookByPage(pageRequest);
        System.out.println("总页数:"+page.getTotalPages());
        System.out.println("总记录数:"+page.getTotalElements());
        System.out.println("查询结果:"+page.getContent());
        System.out.println("当前页数:"+(page.getNumber()+1));
        System.out.println("当前记录数:"+page.getNumberOfElements());
        System.out.println("每页记录数:"+page.getSize());
    }

    @GetMapping("/search")
    public void search(){
        List<Books> books1 = booksService.getBookByIdAndAuthor("鲁迅",1);
        List<Books> books2 = booksService.getBooksByAuthorStartingWith("鲁");
        List<Books> books3 = booksService.getBooksByIdAndName("呐",3);
        List<Books> books4 = booksService.getBooksByPriceGreaterThan(23F);
        Books books = booksService.getMaxIdBook();
        System.out.println("books1:"+books1);
        System.out.println("books2:"+books2);
        System.out.println("books3:"+books3);
        System.out.println("books4:"+books4);
        System.out.println("books:"+books);
    }

    @GetMapping("/save")
    public void save(){
        Books books = new Books();
        books.setAuthor("鲁迅");
        books.setName("呐喊");
        books.setPrice(23F);
        booksService.addBook(books);
    }
}
*/
