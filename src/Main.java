//class Person {
//    private String name;
//    private int age;
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Mobil {

    public Mobil(int year, String color, int door) {
        this.year = year;
        this.color = color;
        this.door = door;
    }

    private int year;
    private String color;
    private int door;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Year : " + year + " Color " + color + " Door : " + door;
    }
}
//
//public class Main {
//
//
//    public static void main(String[] args) {
////        System.out.println("Hello, World");
////
////        Car car1 = new Car(2000, "blue", 4);
////
////        switchCaseJava(10);
////        switchCaseJava(1);
////        switchCaseJava(2);
//
//        nullPointer();
//    }
//
//    public String checkLebihBesar(int a, int b) {
//        if (a < b) {
//            return "A lebih kecil daripada B";
//        } else {
//            return "A lebih besar daripada B";
//        }
//    }
//
//    public static void switchCaseJava(int a) {
//
//        switch (a) {
//            case 1 :
//                System.out.println("Satu");
//                break;
//            case 2 :
//                System.out.println("Dua");
//                break;
//            case 3 :
//                System.out.println("Tiga");
//                break;
//            case 4 :
//                System.out.println("Empat");
//                break;
//            default :
//                System.out.println("Lebih dari empat");
//                break;
//        }
//    }
//
//    private static Mobil buatMobil() {
//        return null;
//    }
//
//
//    public static void nullPointer() {
//        String budi = "Ini ibu budi";
//        String joni = null;
//
//        Mobil mobil1 = new Mobil();
//        mobil1.setColor("Blue");
//
//        showWarnaMobil(buatMobil());
//    }
//
//    private static void showWarnaMobil(Mobil mobil) {
//        System.out.println(mobil.getColor());
//    }
//}




public class Main {


    public static void main(String[] args) {

        List<Mobil> listMobil = new ArrayList<Mobil>();


        listMobil.add(new Mobil(2001, "white", 4));
        listMobil.add(new Mobil(2002, "blue", 2));
        listMobil.add(new Mobil(2003, "red", 6));


        Comparator<Mobil> comparatorYear = new Comparator<Mobil>() {
            @Override
            public int compare(Mobil mobil1, Mobil mobil2) {
                return mobil1.getYear() - mobil2.getYear();
            }
        };

        Comparator<Mobil> comparatorDoor = new Comparator<Mobil>() {
            @Override
            public int compare(Mobil mobil1, Mobil mobil2) {
                return mobil1.getDoor() - mobil2.getDoor();
            }
        };

        listMobil.sort(comparatorYear);


        System.out.println(listMobil);
    }


}








