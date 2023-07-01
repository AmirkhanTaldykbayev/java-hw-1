package hw6;

import hw6.Technique.Laptop;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //Создать множество ноутбуков.
        //Переопределить toString, equals и hashCode.
        //Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один экземпляр в наборе.

        Laptop hpVictus16a = new Laptop(1, "HP Victus", 16.1f, "AMD Ryzen 5 5600H", (short) 8, (short) 500, "Nvidia RTX 3060", "MS DOS", "dark-blue");
        System.out.println(hpVictus16a);
        System.out.println();
        Laptop asusK53sj = new Laptop(2, "ASUS K53SJ", 15.6f, "Intel Core i3", (short) 4, (short) 500, "Nvidia GeForce GT 520M", "Windows 7 Home Basic 64", "brown");
        System.out.println(asusK53sj);
        System.out.println();
        Laptop hpVictus16d = new Laptop(3, "HP Victus", 16.1f, "AMD Ryzen 5 5600H", (short) 16, (short) 1000, "Nvidia RTX 3060", "Windows 10 Pro x64", "black");
        System.out.println(hpVictus16d);
        System.out.println();

        HashSet<Laptop> laptops = new HashSet<>();
        laptops.add(hpVictus16a);
        laptops.add(hpVictus16d);
        laptops.add(asusK53sj);

        System.out.println("Сравнение на равенство " + hpVictus16a.name + " и " + asusK53sj.name);
        System.out.println(hpVictus16a.equals(asusK53sj));
        System.out.println();



        System.out.println("Сравнение на равенство " + hpVictus16a.name + " и " + hpVictus16d.name);
        System.out.println(hpVictus16a.equals(hpVictus16d));
        System.out.println();


        System.out.println(laptops.contains(hpVictus16a));
    }
}
