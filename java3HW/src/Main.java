import Human.*;
import Animal.*;
import IMath.*;
import Money.*;
import ISort.*;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("Jamshut",23);
        Sailor sailor= new Sailor("Gleb",30);
        Pilot pilot = new Pilot("Artur",32);

        System.out.println(builder.getName());
        System.out.println(builder.work());

        System.out.println(sailor.getName());
        System.out.println(sailor.work());

        System.out.println(pilot.getName());
        System.out.println(pilot.work());


        //--------------------------
        Tiger tiger = new Tiger("Murka",130);
        System.out.println(tiger.getInfo());

        Crocodile crocodile = new Crocodile("Gena", 40);
        System.out.println(crocodile.getInfo());

        Kangaroo kangaroo = new Kangaroo("John", 70);
        System.out.println(kangaroo.getInfo());

        Money money = new Money(12,2);
        Product product = new Product("name",money);
        System.out.println(product.getPrice());
        //--------------------------



        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Array test = new Array(array);

        System.out.println("\nMax: " + test.Max());
        System.out.println("\nMin: " + test.Min());
        System.out.println("\nAvg: " + test.Avg());
        //--------------------------


        Integer[] arr = { 10, 2, 34, 5, 67, 21, 8, 6, 10 };
        Array2 test1 = new Array2(arr);
        System.out.println("\nWithout sort: " + test1.toString());
        test1.SortAsc();
        System.out.println("\nSortAsc: " + test1.toString());
        test1.SortDesc();
        System.out.println("\nSortDesc: " + test1.toString());
    }
}