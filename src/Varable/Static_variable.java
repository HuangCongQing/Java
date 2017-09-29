package Varable;

// 静态变量
//类变量也称为静态变量，在类中以static关键字声明
//静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量
//静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量
//与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
//静态变量可以通过：ClassName.VariableName的方式访问。

//类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。
//如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。
public class Static_variable {
    //salary是静态的私有变量
    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";
    public static void main(String args[]){
    salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary);
    }
}