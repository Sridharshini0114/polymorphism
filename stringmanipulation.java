
public class stringmanipulation {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = new String ("Welcomelivewire");
		System.out.println("without instance:"+s1);
		System.out.println("with instance:"+s2);
		System.out.println("with instance:"+s2.charAt(0));
		System.out.println("with instance:"+s2.indexOf('e'));
		System.out.println("with instance:"+s2.concat(s1));
		System.out.println("with instance:"+s2.compareTo(s1));
		System.out.println("with instance:"+s1.equals("hai"));
		System.out.println("with instance:"+s2.split(s2));
		System.out.println("with instance:"+s2.substring(4));
		System.out.println("with instance:"+s2.lastIndexOf(0));


	}

}
