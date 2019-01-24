package oopImtiaz;

public class Zoo {

	public static void main(String[] args) {
		
		Animals zebra = new Animals( "Zebra" , "Zebi" , 8 , "Africa" , 180 , "Grass");
		Animals zebra2 = new Animals( "Zebra" , "Line" , 3 , "Africa" , 190 , "Grass");
		Animals zebra3 = new Animals( "Zebra" , "Prety" , 5 , "Africa" , 120 , "Grass");
				
		Animals elephant = new Animals( "Elephant" , "Tobi" , 7 , "India" , 500 , "Grass");
		
		Animals antilop = new Animals( "Antilop" , "Speedy" , 3 , "Africa" , 170 , "Grass");
		
		Animals lion = new Animals( "Lion" , "Leo" , 6 , "Africa", 325, "Meat"  );
		
		Birds eagle = new Birds( "Eagle", "Strongy", "Brown", "Meat", "USA", 3, 24, 245 );
		Birds sparow = new Birds ("Sparrow", "Jack", "Brown", "Seeds", "Europe", 2, 1, 12);
		
		Fish golden = new Fish("Golden", "Goldy", "Yellow", "Australia", 1, 1);
		Fish piranha = new Fish("piranha", "Notty", "green", "Brasil", 2, 1);
		
		
		zebra.about();
		zebra2.about();
		zebra3.about();
		lion.about();
		elephant.about();
		antilop.about();
		eagle.info();
		sparow.info();
		golden.info();
		piranha.info();
		

	}

}
