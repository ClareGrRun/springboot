/*
package com.example.demo.dao;

import com.example.demo.pojo.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BooksDao extends JpaRepository<Books,Integer> {
    List<Books> getBooksByAuthorIsStartingWith(String author);
    List<Books> getBooksByPriceGreaterThan(Float price);
    @Query(value = "select * from t_book where id=(select max(id) from t_book)",nativeQuery = true)
    Books getMaxIdBook();
    @Query("select b from t_book b where b.id> :id and b.author= :author")
    List<Books> getBookByIdAndAuthor(@Param("author") String author, @Param("id") Integer id);
    @Query(value = "select b from t_book b where b.id<?2 and b.name like %?1%")
    List<Books> getBookByIdAndName(String name,Integer id);
}
*/
