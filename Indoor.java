package games1;
public class Indoor{
	String carrom[] = new String[3];

	  public Indoor(String p,String q,String r){
		carrom[0] = p;
		carrom[1] = q;
		carrom[2 ] = r;
	}
	  public void display(){
		System.out.println("1"+carrom[0]+"\t1"+"2"+carrom[1]+"\t2"+"3"+carrom[2]);
	}
}