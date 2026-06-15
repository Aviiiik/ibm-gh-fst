package fst;
interface BicyclePart{
	int tyres=2;
	int maxSpeed=40;
}
interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}
class Bicycle implements BicyclePart,BicycleOperations{
	public int gears;
	public int currentSpeed;
	public Bicycle(int gears,int currentSpeed) {
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	public void applyBrake(int decrement) {
		currentSpeed-=decrement;
		System.out.println("Current speed:"+currentSpeed);
	}
	public void speedUp(int increment) {
		currentSpeed+=increment;
		System.out.println("Current Speed :"+currentSpeed);
		
	}
	public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
    }
}
class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int gears,int currentSpeed,int seatHeight) {
		super(gears,currentSpeed);
		this.seatHeight=seatHeight;
		
	}
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}
public class Activity7 {
	 public static void main(String args[]) {
	        MountainBike obj = new MountainBike(5, 0, 35);
	        System.out.println(obj.bicycleDesc());
	        obj.speedUp(20);
	        obj.applyBrake(5);
	    }
}
