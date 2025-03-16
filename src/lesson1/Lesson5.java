package lesson1;

public class Lesson5 {

    int summa(int a, int b, int c){
        int result=a+b+c;
        return result;
    }
}

    class Test21{

    public static void main(String[] args) {
        Lesson5 t = new Lesson5();
        int summaTrexChisel = t.summa(1,2,3);
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(5, 10, 15));
    }
    }

    class Car {

     String color;
     String engine;
     int speed;

     int qaz(int skorast){
         speed += skorast;
         return speed;
     }
    void showInfo(){
       System.out.println("cvet" + color + "  motor  " + engine + "  skorost" + speed);}

    }

    class CarTest{
        public static void main (String[] args){
            Car c1 = new Car();
            c1.color = "white";
            c1.engine = "v6";
            c1.speed = 60;

            c1.showInfo();
            c1.qaz(20);
            c1.showInfo();
        }
    }