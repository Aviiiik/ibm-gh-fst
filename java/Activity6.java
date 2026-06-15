package fst;
import java.util.*;
class Plane {
    public List<String> passengers;
    public int maxPassengers;
    public Date lastTimeTookOf;
    public Date lastTimeLanded;
    public Plane(int maxPassengers) {
    	this.maxPassengers=maxPassengers;
    	passengers=new ArrayList<>();
   
    }
    public void onboard(String passenger) {
    	if(passengers.size() <= maxPassengers) {
    		passengers.add(passenger);
    	}else System.out.println("No Space");
    		
    }
    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
public class Activity6 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
       Plane plane=new Plane(10);
       plane.onboard("Avik");
       plane.onboard("Avi");
       plane.onboard("Av");
       System.out.println("Takeoff time : "+ plane.takeOff());
       System.out.println("Passengers List : ");
       System.out.println(plane.getPassengers());
       Thread.sleep(5000);
       plane.land();
       System.out.println("Plane landed at : "+plane.getLastTimeLanded());
       
	}

}
