package Control_Statement;

public class branch_switch {
	public static void main(String args){
		double d = Math.random();
		int e = 1+ (int)(d*6);
		System.out.print(e);
			
		switch(e){ // int,或自动转换为int的类型（byte,char,short）.枚举
				// JDK7可以放置字符串
		case 6:
			System.out.println("运气非常好");
			break;    //dont forget
		case 5:
			System.out.println("运气还可以5");
			break;    //dont forget
		case 4:
			System.out.println("运气非常好4");
			break;    //dont forget
		case 3:
			System.out.println("运气非常好3");
			break;    //dont forget
		case 2:
			System.out.println("运气非常好2");
			break;    //dont forget
		case 1:
			System.out.println("运气非常好1");
			break;    //dont forget
		
		}
	}
}
