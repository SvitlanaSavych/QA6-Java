package lesson9;

public class Aquarium {
//    3) Создать класс Aquarium, в нем три поля типа int (length, width, height),
//    а также поле Типа String c названием фирмы данного аквариума. Сделать все поля класса приватными.
//    Сделать геттеры и сеттеры для данных полей. Создать метод выводящий в консоль информацию о данном аквариуме.*/

    private int length;
    private int width;
    private int height;
    private String name;

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Длина аквариума " + length);
        System.out.println("Ширина аквариума " + width);
        System.out.println("Высота аквариума " + height);
        System.out.println("Название аквариума " + name);
    }
}
