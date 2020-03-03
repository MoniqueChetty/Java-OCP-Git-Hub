package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        playWithAnimal(s);
        
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();
        playWithAnimal(a);
        
        Fish f = new Fish();
        f.setName("Flownder");
        f.eat();
        f.walk();
        f.play();
        playWithAnimal(f);
        
        Cat c1 = new Cat();
        System.out.println("Original cat name: " + c1.getName());
        
        Cat c = new Cat("Sofie");
        System.out.println(" New cat name: " + c.getName());
        c.eat();
        c.play();
        c.walk();
        playWithAnimal(c);
             
        
    }
    
    public static void playWithAnimal(Animal a) {
        // completed in practice
        if (a instanceof Pet){
            Pet p = (Pet)a;
            p.play();
        }else{
            System.out.println("Danger! Wild Animal");
        }
    }
    
}