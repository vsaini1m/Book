package com.saini_vinit.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class BookService {

	private static List<Book> list=new ArrayList<>();

	static {
		list.add(new Book(100, "Complete java refrence", "Vinit Saini"));
		list.add(new Book(101, "Complete python refrence", "Vinit Kumar"));

	}
	
	public List<Book> getAllBooks() {
		System.out.println(list);
		return list;
	}
}
