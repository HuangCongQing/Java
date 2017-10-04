package Control_Statement;

public class branch_if {
	public static void main(String args){
		double d = Math.random();
		int e = 1+ (int)(d*6);
		System.out.print(e);
		if(e>3){
			System.out.println("大数");
		}else{
			System.out.println("小数---");
			
		}
	}

}
