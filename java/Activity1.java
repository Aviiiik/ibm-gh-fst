package fst;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Car auto = new Car();
          auto.color="green";
          auto.transmission="manual";
          auto.make=2002;
          auto.displayCharacteristics();
          auto.accelerate();
          auto.brake();
	}

}
 class Car{
	static String color;
   static String transmission;
   static int make;
    static int tyres;
    static int doors;
    
    public Car(){
    	tyres=4;
    	doors=4;
    }
    public static void displayCharacteristics() {
    	System.out.println("Color : "+color);
    	System.out.println("transmission : "+transmission);
    	System.out.println("make : "+make);
    	System.out.println("tyres : "+tyres);
    	System.out.println("tyres : "+doors);
    	
    }
    public static void accelerate() {
    	System.out.println("Car is moving forward");
    }
    public static void brake() {
    	System.out.println("Car has stopped");
    }
}
