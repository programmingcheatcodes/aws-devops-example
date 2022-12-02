package com.devops.aws.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class BookDao {

	public List<Book> getBookss() {
		return Stream.of(
				new Book(17, "Why Nation Fails", "Daron Acemoglu"),
				new Book(10, "Discourse on Method", "Rene Descartes"), 
				new Book(5, "As A Man Thinketh", "James Allen"),
				new Book(4, "Thinking Architecturally", "Nathaniel Schutta"),
				new Book(1, "As We May Think", " Vannevar Bush")).
				
				
				collect(Collectors.toList());
	}
}
