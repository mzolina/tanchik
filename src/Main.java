public class Main {
    public static void main(String[] args) {
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
//создали "большую кошку"
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
//создали "маленькую кошку"
        bigCat.weight += 100; //обратились к полю "вес" большой кошки
        smallCat.weight += 1000;
        System.out.println("Вес большой кошки = " + bigCat.weight);
        System.out.println("Вес маленькой кошки = " + smallCat.weight);
        System.out.println("Вес большой кошки = " + bigCat.weight);
        System.out.println("Вес большой кошки = " + bigCat.weight);
    }
}