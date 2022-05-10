package 面向对象三大特性.继承.Test02;

public class Sub extends Base {
    public Sub(String name, int age) {
        //1. 调用父类的无参构造器,如下或者什么都不写,默认就是调用super
//      super();//父类的无参构造器
        //2. 调用父类的 Base(String name) 构造器
//      super("hsp");
        //3. 调用父类的 Base(String name, int age) 构造器
//      super("king", 20);

        //细节: super 在使用时,必须放在构造器第一行
        //细节: super() 和 this() 都只能放在构造器的第一行,因此这两个方法不能共存在一个构造器, this() 不能再使用了
//      this();
        System.out.println("子类 Sub(String name, int age) 构造器被调用");
    }

    public Sub() {
//      super();//默认调用父类的无参构造器
        super("smith", 10);
        System.out.println("子类 Sub() 构造器被调用");
    }

    //当创建子类对象时,不管使用子类的哪个构造器,默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        super("tom", 30);
        System.out.println("子类 Sub(String name) 构造器被调用");
    }

    //子类方法
    public void sayOk() {
        //非私有的属性和方法可以在子类中直接访问
        //但是私有属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
//        test400();//错误
        //要通过父类提供的公共方法去访问
        System.out.println("n4 = " + getN4());
        callTest400();
    }

}
















