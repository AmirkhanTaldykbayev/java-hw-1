package hw6.Technique;

import java.util.Objects;

public class Laptop {
    public int id;
    public String name;
    public float diagonal; // Используется float т.к. занимает меньше места в памяти (4 байта)
    public String cpu;
    public short ram; // Сначала хотел использовать byte, но вспомнил что уже делают 128gb памяти
    public short memory; // Используется тип short, т.к. нет смысла брать int
    public String videoCard;
    public String os;

    public String color;

    public Laptop(int id, String name, float diagonal, String cpu, short ram, short memory, String videoCard, String os, String color) {
        this.id = id;
        this.name = name;
        this.diagonal = diagonal;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.videoCard = videoCard;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Название модели: " + name +
                "\nДиагональ: " + diagonal +
                "\nПроцессор: " + cpu +
                "\nРазмер оперативной памяти: " + ram + "GB" +
                "\nПостоянная память: " + memory + "GB" +
                "\nВидеокарта: " + videoCard +
                "\nЦвет: " + color;
        // Здесь на вывод не вывожу ID товара, т.к. эта информация не важна для пользовательской стороны
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) System.out.println("Это та же самая модель");
        Laptop nb = (Laptop) obj;
        return name == nb.name && diagonal == nb.diagonal && cpu == nb.cpu && videoCard == nb.videoCard;
        // Здесь в сравнение не добавляю значение оперативной и постоянной памяти, так как технически их можно заменить
        // а также операционную систему и цвет, в большинстве случаев он не играет особо важной роли.
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, diagonal, cpu, ram, memory, os, color);
    }
}
