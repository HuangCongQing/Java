package Control_Statement;

public class branch_switch02 {
	public static void main(String args){
		String a = "黄重庆";
		
		switch(a){//JDK新特性，表达式结果可以是字符串
		case "重":
			System.out.println("输入重");
			break;
		case "黄重庆":
			System.out.println("输入黄重庆");
			break;
		default:
			System.out.println("输入出default");
			break;
		}
	}
}
