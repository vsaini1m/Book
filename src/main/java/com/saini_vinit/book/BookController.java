package com.saini_vinit.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
@Autowired
private BookService bookService;
	
	@GetMapping(("/all"))
	public List<Book> getAll() {
		
		return bookService.getAllBooks();
	}
	

}
