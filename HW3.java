/**
 * JAVA 2 Homework3
 *
 * @autor Oksana Ilyakova
 * @version 24.12.2021
 */
public class Homework3 {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);
    }
    public static void main(String[] args) {
        Apple apl = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        boxApple.compare(boxOrange);
    }

    public abstract class Fruit {
        private String name="Fruit";
        private static final float WEIGHT=0f;
    }

    public class Orange extends Fruit {
        private String name="Orange";
        public static final float WEIGHT=1.5f;
    }

    public class Apple extends Fruit {
        private String name="Apple";
        public static final float WEIGHT=1.0f;
    }

    public class  Box <T extends Fruit> {
        private List<T> content = new ArrayList<>();
        public void put(T fruit){
            content.add(fruit);
        }
        Box(){
            if(T instanceof Apple)
        }
        public void put(List<T> fruits){
            content.addAll(fruits);

        }
        public double getWeight(){
            if(content.size()==0) return 0;
            return content.size()*T.WEIGHT;
        }
        
        public static void main (String[] args){
            Box box1 = new Box();
            Box box2 = new Box();
            System.out.println(box1.compareTo(box2));
        }
        public boolean compare(Box box) {
            if (currentWeight == box.currentWeight)
                return true;
            return false;
        }
    }
}
