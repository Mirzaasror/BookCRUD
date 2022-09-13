package com.example.bookcrud.dao;

import com.example.bookcrud.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;
@Component

public class BookDao {
/*
//    public static Connection getConnection() {
//        String url = "jdbc:postgresql://localhost:5432/crud11";
//        String password = "123";
//        String userName = "postgres";
//        try {
//            Class.forName("org.postgresql.Driver");
//            Connection connection = DriverManager.getConnection(url, userName, password);
//            return connection;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static List<Book> getAllStudent() {
//
//        Connection connection = getConnection();
//        List<Book> books = new ArrayList<>();
//        try (PreparedStatement preparedStatement = connection.prepareStatement("select * from student ;")) {
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                Book book = Book.builder().id(resultSet.getInt(1))
//                        .bookName(resultSet.getString(2))
//                        .avtor(resultSet.getString(3))
//                        .bookLanguage(resultSet.getString(4))
//                        .price(resultSet.getInt(5))
//                        .build();
//                books.add(book);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return books;
//
//    }
//
//    public static Book getBookById(int id) {
//        Book book = new Book();
//
//        Connection connection = getConnection();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from book where id=?;");
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            book.setId(resultSet.getInt(1));
//            book.setBookName(resultSet.getString(2));
//            book.setAvtor(resultSet.getString(3));
//            book.setBookLanguage(resultSet.getString(4));
//            book.setPrice(resultSet.getInt(5));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return book;
//    }
//
//    public static int deleteBookByid(int id) {
//        int status = 0;
//        Connection connection = getConnection();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("delete from book where id=?;");
//            preparedStatement.setInt(1, id);
//            status = preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return status;
//    }
//
//    public static int addBook(Book book) {
//        int status = 0;
//        Connection connection = getConnection();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into book(book_name,avtor,book_language,book_price) values (?,?,?,?)");
//            preparedStatement.setString(1, book.getBookName());
//            preparedStatement.setString(2, book.getAvtor());
//            preparedStatement.setString(3, book.getBookLanguage());
//            preparedStatement.setInt(4, book.getPrice());
//            status = preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return status;
//    }
//
//    public static int updateBook(Book book) throws SQLException {
//        int status = 0;
//
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement("update book set book_name=?,avtor=?,book_language=?,book_price=? where id=?;");
//        return status;
//    }*/
    @Autowired
    JdbcTemplate jdbcTemplate;
public void addBook(Book book){
String sql="insert into books ( name, author, price ,janr, image) values('"+book.getName()+"','"+book.getAuthor()+"',"+book.getPrice()+",'"+book.getJanr()+"','"+book.getImage()+"') ";
}


}
