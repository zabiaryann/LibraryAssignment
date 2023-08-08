package bookdatabasePackage;

public class BookDatabase {

	public static void main(String[] args) {
		

        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println();
        
        System.out.println("Rendted? (should be false): " + example.isBorrowed());
        //example.returned();
        
        example.borrowed();
        System.out.println("Rented? (should be true): " + example.isBorrowed());
     
        example.returned();
        System.out.println("Rented? (should be false): " + example.isBorrowed());
			
	}

}
