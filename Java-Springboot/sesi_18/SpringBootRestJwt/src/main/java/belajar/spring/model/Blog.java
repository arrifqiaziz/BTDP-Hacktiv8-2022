package belajar.spring.model;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String title;
	private String content;
	private String author;

	public Blog(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
}
