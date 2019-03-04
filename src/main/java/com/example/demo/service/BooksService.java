/*
package com.example.demo.service;

import com.example.demo.dao.BooksDao;
import com.example.demo.pojo.Book;
import com.example.demo.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    BooksDao booksDao;
    public void addBook(Books book){
        booksDao.save(book);
    }
    public Page<Books> getBookByPage(Pageable pageable){
        return booksDao.findAll(pageable);
    }
    public List<Books> getBooksByAuthorStartingWith(String author){
        return booksDao.getBooksByAuthorIsStartingWith(author);
    }
    public List<Books> getBooksByPriceGreaterThan(Float price){
        return booksDao.getBooksByPriceGreaterThan(price);
    }
    public Books getMaxIdBook(){
        return booksDao.getMaxIdBook();
    }
    public List<Books> getBookByIdAndAuthor(String author,Integer id){
        return booksDao.getBookByIdAndAuthor(author,id);
    }
    public List<Books> getBooksByIdAndName(String name,Integer id){
        return booksDao.getBookByIdAndName(name,id);
    }
}
*/
