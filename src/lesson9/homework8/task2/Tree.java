package lesson9.homework8.task2;

public class Tree {
//    2)
//    Создать класс Tree с перегруженными конструкторами.
//    В классе Tree есть поля:
//    String type; int height, int coutOfsticks, String colour;
//
//    Конструктор1 принимающий в параметры String type; int height
//    и присваивающий значение полям coutOfsticks значение 13,
//    colour "Зеленый".
//
//    Конструктор2 принимающий в параметры int height, int coutOfsticks,
//    String colour и присваивающий значение полю type "пихта".
//
//    Констуктор3, который присваивает height = 350, coutOfsticks = 29,
//    сolour = "Желтый".
//
//    Конструктор4 который принимает в параметры String type,
//    и вызывает внутри себя конструктор 3.
//
//    Создать в отдельном классе main  4 объекта класса Tree используя 4 созданных конструктора.

    private String type;
    private int height;
    private int coutOfsticks;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCoutOfsticks() {
        return coutOfsticks;
    }

    public void setCoutOfsticks(int coutOfsticks) {
        this.coutOfsticks = coutOfsticks;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tree(String type, int height){
        this.type = type;
        this.height = height;
        this.coutOfsticks = 13;
        this.color = "зеленый";
    }
    public Tree(int height, int coutOfsticks, String color){
        this.type = "пихта";
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.color = color;
    }
    public Tree(){
        this.height = 350;
        this.coutOfsticks = 29;
        this.color = "желтый";
    }
    public Tree(String type){
        this();
        this.type = type;
    }


//               ДЛЯ ПРОВЕРКИ:

//    @Override
//    public String toString() {
//        return "Tree{" +
//                "type='" + type + '\'' +
//                ", height=" + height +
//                ", coutOfsticks=" + coutOfsticks +
//                ", color='" + color + '\'' +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        Tree tree = new Tree("сосна",30);
//        Tree tree1 = new Tree(20, 10, "желтый");
//        Tree tree2 = new Tree();
//        Tree tree3 = new Tree("береза");
//        System.out.println(tree);
//        System.out.println(tree1);
//        System.out.println(tree2);
//        System.out.println(tree3);
//    }
}
