package games1;
public class Outdoor{
	String football[] = new String[3];

	  public Outdoor(String p,String q,String r){
		football[0] = p;
		football[1] = q;
		football[2] = r;
	}
	public void display(){
		System.out.println("1"+football[0]+"\t1"+"2"+football[1]+"\t2"+"3"+football[2]);
	}
}