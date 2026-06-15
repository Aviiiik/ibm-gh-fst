
package fst;
interface movement{
	public void walking();
	public void talking();
}

class human implements movement{
	static int count=0;
	public human() {
		count++;
		
	}
	public void walking() {
		System.out.println("Humans are walking");
	}
	public void talking()
	{
		System.out.println("Humans are talking");
	}
	
}
class boy extends human{
	public boy() {
		super();
	}
	public void walking() {
		System.out.println("Boy is walking");
	}
	public void talking()
	{
		System.out.println("Boy is talking");
	}
	
}
class girl extends human{
	public girl() {
		super();
	}
	public void walking() {
		System.out.println("Girl is walking");
	}
	public void talking()
	{
		System.out.println("Girl is talking");
	}
}
class robot{
static	int count1=0;
	public robot() {
		count1++;
	}
	public void walking() {
		System.out.println("Robot is walking");
	}
	public void talking()
	{
		System.out.println("Robot is talking");
	}
	
}
public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          boy obj1=new boy();
          boy obj2=new boy();
          boy obj3=new boy();
          obj1.walking();
          obj2.walking();
          obj3.walking();
          obj1.talking();
          obj2.talking();
          obj3.talking();
          girl gbj1=new girl();
          girl gbj2=new girl();
          girl gbj3=new girl();
          gbj1.walking();
          gbj2.walking();
          gbj3.walking();
          gbj1.talking();
          gbj2.talking();
          gbj3.talking();
          robot rbj1=new robot();
          robot rbj2=new robot();
          robot rbj3=new robot();
          rbj1.walking();
          rbj2.talking();
          
          System.out.println("Human Population : "+human.count);
          System.out.println("robot Population : "+robot.count1);
          
          
	}

}
