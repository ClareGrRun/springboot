/*
package com.example.demo.dao;

import com.example.demo.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int addBook(Book book){
        return jdbcTemplate.update("insert into book(name,author) values (?,?)",book.getName(),book.getAuthor());
    }
}
*/
