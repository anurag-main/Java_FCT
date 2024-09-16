package InheritanceProject;

public class BookStore {

	
	    public static void main(String[] args) {
	    	
	    
	    	Ebook ebook = new Ebook("Java Programming", "John Doe", 500, 2.5, "PDF", "English");
	        ebook.displayDetails();
	        ebook.download();
	        ebook.read();
	        ebook.Languages();
	        
	        System.out.println("------------------------------------------------------");


	        AudioBook audioBook = new AudioBook("Mazi Janmathep", "Swatantrya Veer Savarkar ", 357, 10.5, "Vidya Patil", "Marathi");
	        audioBook.displayDetails();
	        audioBook.play();
	        audioBook.read(); 
	        audioBook.Languages();
	        
	        System.out.println("------------------------------------------------------");


	        
	       Physical_Book  physical_book = new Physical_Book ("Learning Python", "Mark Lutz", 1600,1234,  54.99, "5th Edition","English");
	       physical_book.openBook();
	       physical_book.read();
	       physical_book.Languages();
	       physical_book.closeBook();
	       physical_book.displayDetails();
	       
	       System.out.println("------------------------------------------------------");

	       Physical_Book  physical_book2 = new Physical_Book ("Chhava", "Shivaji Sawant", 232 ,1234,  54.99, "5th Edition","Marathi");
	       physical_book2.openBook();
	       physical_book2.read();
	       physical_book2.Languages();
	       physical_book2.closeBook();
	       physical_book2.displayDetails();

	}}

class Language{
	
   String Language;

	public Language(String language) {
		super();
		Language = language;
	}
	
	public void showLanguage() {
		System.out.println("Languages is: " + Language);
	}
	

}

class Book {
 private String title;
 private String author;
  private int totalPages;
  
  Language languages1;
  //Languages languages2 = new Languages("Hindi");
  //Languages languages3 = new Languages("English");

 
 public Book(String title, String author, int totalPages , String languageType) {
     this.title = title;
     this.author = author;
     this.totalPages = totalPages;
     this.languages1 = new Language(languageType);
 }

 
 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Total Pages: " + totalPages);
 }

 public void read() {
     System.out.println("Reading the book...");
 }
}


class Ebook extends Book {
 private double fileSize; // in MB
 private String format;   // e.g., PDF, EPUB

 public Ebook(String title, String author, int totalPages, double fileSize, String format,String languageType) {
     super(title, author, totalPages, languageType); // Call parent constructor
     this.fileSize = fileSize;
     this.format = format;
 }

 
 public void download() {
     System.out.println("Downloading the ebook... File size: " + fileSize + " MB");
 }

 public void read() {
     System.out.println("Reading the ebook on a device in " + format + " format.");
 }

 
 public void Languages () {
	 languages1.showLanguage();

 }
 
}

class AudioBook extends Book {
 private double length;  // in hours
 private String narrator;

 public AudioBook(String title, String author, int totalPages, double length, String narrator,String languageType) {
     super(title, author, totalPages,languageType); // Call parent constructor
     this.length = length;
     this.narrator = narrator;
 }

 
 public void play() {
     System.out.println("Playing the audiobook narrated by " + narrator + ".");
 }

 
 public void read() {
     System.out.println("Listening to the audiobook. Total duration: " + length + " hours.");
 }
 
 public void Languages () {
	 languages1.showLanguage();

 }
}


class Physical_Book extends Book {
	 private int isbn_Number;  // in hours
	 private double price;
     private String edition;
	 

	 
	 public Physical_Book(String title, String author, int totalPages, int isbn_Number, double price, String edition,String languageType) {
		super(title, author, totalPages,languageType);
		this.isbn_Number = isbn_Number;
		this.price = price;
		this.edition = edition;
	}


	 
	public void openBook() {
	     System.out.println("Opeing book which has ISBN Number : " + isbn_Number + ", Price : " + price + ", Edition : " + edition);
	 }

	 
	 public void read() {
	     System.out.println("Rading a physical book...");
	 }
	 
	 public void Languages () {
		 languages1.showLanguage();
	    

	 }
	 
	 public void closeBook() {
	        System.out.println("Closing a book...");
	    }
	 
	 
} 



