package com.example.bookcrud.ctrl;


import com.example.bookcrud.book.Book;
import com.example.bookcrud.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller

public class Controller {
    @Autowired
    BookDao bookDao;

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/addbook")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "addbook";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestAttribute("book") Book book) {
        bookDao.addBook(book);
        return "redirect:/viewemp";
    }
}
