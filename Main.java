public class Main {
    public static void main(String[] args) {

        Student student1= new Student();
        Student student2= new Student();

        student1.setCredits(120);
        student2.setCredits(30);

        student2.upgradeCredits(10);

        System.out.println("Student1 Credits:" + student1.getCredits());
        System.out.println("Student2 Credits:" + student2.getCredits());


        System.out.println("Student2 progress:" + student2.nextLevel());


        Rectangle rectangle1= new Rectangle(10,10);

        System.out.println(rectangle1);

        System.out.println(rectangle1.calcArea());
        System.out.println(rectangle1.calcPerimeter());
    }
}