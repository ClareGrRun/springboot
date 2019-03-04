package com.example.demo.mapper2;

import com.example.demo.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper2 {
    List<Book> getAllBooks();
}
