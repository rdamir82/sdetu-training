package oopImtiaz;

public class Zoo {

	public static void main(String[] args) {
		
		Animals zebra = new Animals( "Zebra" , "Zebi" , 8 , "Africa" , 180 , "Grass");
		Animals zebra2 = new Animals( "Zebra" , "Line" , 3 , "Africa" , 190 , "Grass");
		Animals zebra3 = new Animals( "Zebra" , "Prety" , 5 , "Africa" , 120 , "Grass");
				
		Animals elephant = new Animals( "Elephant" , "Tobi" , 7 , "India" , 500 , "Grass");
		Animals elephant2 = new Animals("Elephant", "Brad", 4, "Africa", 465, "Grass");
		
		Animals antilop = new Animals( "Antilop" , "Speedy" , 3 , "Africa" , 170 , "Grass");
		
		Animals lion = new Animals( "Lion" , "Leo" , 6 , "Africa", 325, "Meat"  );
		Animals lion2 = new Animals ("Lion", "Lea", 3 , "Africa", 234, "Meat");
		
		Birds eagle = new Birds( "Eagle", "Strongy", 5 , "USA", 3, "meat", 245, "brown" );
		Birds sparow = new Birds ("Sparrow", "Jack", 2, "Europe", 1, "seeds", 12, "yellow");
		
		Birds pigenon = new Birds("Pigenon", "Teslas", 5, "North-America", 1, "seeds", 25, "silver");
		
		Fish golden = new Fish("Golden", "Goldy", 1 , "Australia", 1, "algas", "Yellow");
		Fish piranha = new Fish("piranha", "Notty", 2, "Brasil", 2, "Meat", "silver");
		Fish shark = new Fish("Shark", "Sharky", 10, "Caribbean", 120, "Meat", "silver");
		
		Character player = new Character("Herro", 100, 30, 20, 0);
		Character foe = new Character("Skeleton", 30, 10, 10, 0);
		
		//Animal frog = new Animal(2, "male", 2);
		Bird bird1 = new Bird(2, "Male", 2, 15);
		
		Chicken chick1 = new Chicken(2, "female", 3, 25);
		Sparrow sparrow1 = new Sparrow(5, "male", 1, 25);
		Fish2 fish1 = new Fish2( 2,"F", 10);
		
		
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
		lion2.about();
		elephant2.about();
		player.info();
		foe.info();
//		frog.eat();
		pigenon.about();
		pigenon.info();
		shark.about();
		shark.info();
//		bird1.fly();
//		frog.eat();
//		chick1.fly();
		sparrow1.move();
		fish1.move();
	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}

}
