package 面向对象三大特性.继承.Test01;

//父类,是 Pupil 和 Graduate 的父类
public class Student {

    //共有属性
    public String name;
    public int age;
    private double score;//成绩

    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名 = " + name + ", 年龄 = " + age + ", 成绩 = " + score);
    }

}
