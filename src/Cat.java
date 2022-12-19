public class Cat {
        //Поля класса
        double weight;
        String name;
        int age;
        String color;

    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //Методы класса
        void meow() {
        System.out.println("Meow");
        }

        void pee() {
        weight -= 20;
        }

        void eat() {
        weight += 50;
        }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
