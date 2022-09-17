package Question_2;

public class Main {
    public static void main(String[] args){
//create an array of Animal class with size 3
//initialise all 3 elements of this Animal class with
//Dog, Cat and Tiger class object.
//call the all methods (eat,walk,makeNoise) from all
//the 3 objects.

        Animal [] arr = new Animal[3];
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Tiger t1 = new Tiger();
        arr[0] = d1;
        arr[1] = c1;
        arr[2] = t1;
        for (Animal i: arr) {
            i.eat();
            i.walk();
            i.makeNoise();
        }
    }

}
