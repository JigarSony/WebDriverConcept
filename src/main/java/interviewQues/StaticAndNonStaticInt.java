package interviewQues;

public class StaticAndNonStaticInt {
	
	static int i = 0;
	int j = 0;
	
	public static void main(String[] args) {
		
		StaticAndNonStaticInt a1 = new StaticAndNonStaticInt();
		StaticAndNonStaticInt a2 = new StaticAndNonStaticInt();
		StaticAndNonStaticInt a3 = new StaticAndNonStaticInt();
		
		a1.abc();
		a2.abc();
		a3.abc();
		System.out.println(i);
		System.out.println(a3.i);
		System.out.println(a3.j);
		
		
	}
	
	public void abc() {
		i++;
		j++;
	}
	

}
