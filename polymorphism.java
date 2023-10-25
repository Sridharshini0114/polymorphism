class Demo{
	void get1(int pid,String pname) {
		System.out.println("your pid is:"+pid +"your pname is:"+pname);
	}
	void get1(int cid) {
		System.out.println("your cid is:"+cid);
	}
}
public class polymorphism {

	public static void main(String[] args) {
		Demo f1=new Demo();
		f1.get1(1001,"sri");
		f1.get1(2001);
	

	}

}
