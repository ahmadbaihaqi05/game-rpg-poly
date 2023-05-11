package GameRPG5;

public class App {
    public static void main(String[] args) {
        //Static polymorphism pada class Hero
        Hero h = new Hero();
        h.move();
        h.move("kearah enemy");
        System.out.println();

        //static polymorphism pada class Enemy
        Enemy e = new Enemy();
        e.move();
        e.move(3);
        System.out.println();
        
        //Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character ch1 = new Hero();
        ch1.move(); 
        Character ch2 = new Enemy();
        ch2.move(); 
        Character ch3 = new Witch();
        ch3.move(); 
        Character ch4 = new Fighter();
        ch4.move(); 
        System.out.println();

        //Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Character ch = (Character) new Witch();
        ch.move(); 
        ch = new Fighter();
        ch.move();

        

    }
}
