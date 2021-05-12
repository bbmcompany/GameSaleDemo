package gameIntro.entities.concretes;

import gameIntro.entities.abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private float price;
	
	private String publisher;
	private String developer;
	private String releaseDate;
	
	public Game() {
		
	}

	public Game(int id, String name, float price, String publisher, String developer, String releaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.publisher = publisher;
		this.developer = developer;
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
}
