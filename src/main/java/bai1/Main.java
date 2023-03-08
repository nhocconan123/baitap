package bai1;

public class Main {
    public static void main(String[] args) {


        // Test Error
        try{
            circle htron1= new circle(3);
            System.out.println("dien tich hinh tron = "+ htron1.getArea());
            System.out.println("chu vi hinh tron = "+htron1.getCircumference());
            circle c3 = new circle(-5);
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            circle c4 = new circle(5);
            c4.setRadius(-4);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
