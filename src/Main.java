public class Main {
    public static void main(String[] args) {

        //havlayan kopek
        System.out.println("havlayan köpek");
        boolean result = shouldWakeUp(true, 1);
        System.out.println(result);

        boolean result2 = shouldWakeUp(false, 2);
        System.out.println(result2);

        boolean result3 = shouldWakeUp(true, 8);
        System.out.println(result3);

        boolean result4 = shouldWakeUp(true, -1);
        System.out.println(result4);

        //yas tespiti
        System.out.println("yaş tespiti");
        boolean result5 = hasTeen(9,99,19);
        System.out.println(result5);

        boolean result6 = hasTeen(23,15,42);
        System.out.println(result6);

        boolean result7 = hasTeen(22,23,34);
        System.out.println(result7);

        //oyuncu kedi
        System.out.println("oyuncu kedi");
        boolean result8 = isCatPlaying(true,10);
        System.out.println(result8);

        boolean result9 = isCatPlaying(false,36);
        System.out.println(result9);

        boolean result10 = isCatPlaying(false,35);
        System.out.println(result10);

        // Dikdörtgen Alan Hesaplama
        System.out.println(" Dikdörtgen Alan Hesaplama");
        double result11 = area(5.0,4.0);
        System.out.println(result11);
        double result14 = area(-1.0, 4.0);
        System.out.println(result14);

        // Daire Alan Hesaplama
        System.out.println("Daire Alan Hesaplama");
        double result12 = circleArea(5.0);
        System.out.println(result12);

        double result13 = circleArea(-1);
        System.out.println(result13);

    }


    // havlayan kopek
    public static boolean shouldWakeUp (boolean isBarking, int value) {
           if(!isBarking){
               return false;
           } else if ((value < 0 || value > 23)) {
            return false;
           } else if ((value < 8 || value >= 22)) {
            return true;
           } else {
               return false;
           }
    }

    // yas tespiti

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    // oyuncu kedi

    public static boolean isCatPlaying (boolean season, int temp) {
        if(season && (temp>=25 && temp<=45)){
            return true;
        } else if (!season && (temp>=25 && temp<=35)) {
            return true;
        } else {
            return false;
        }
    }

    // dikdörtgen alan hesabı

    public static double area(double num1, double num2) {
       if( num1<0 || num2<0){
           return -1;
       }
       else {
           return num1*num2;
       }
    }
    // daire alanı

    public static double circleArea(double radius) {
        if(radius<0){
            return -1;
        }
        else {
            return radius*radius*Math.PI;
        }
    }
    }