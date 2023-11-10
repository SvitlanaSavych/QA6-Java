package lesson9.homework8.task1;

import java.util.Objects;

public class Computer {
//    1)
//    Создать класс Computer c конструктором принимающим параметры
//    Марка тип String, цена тип int, оперативная память тип int,
//    и видеокарта тип int.
//    Переопределить метод toString для вывода объекта класса в след. виде:
//           "Создан PC.
//            Имя = марка.
//            Цена = цена.
//            Видеокарта = объем видеокарты.
//            ОЗУ = Объем оперативной памяти."
//    Все поля класса Computer должны быть приватными.
//    Также создайте публичные методы для получения информации о полях класса Computer.
//    А также методы для изменения его полей.
//    Переопределите метод equals и метод hashCode для вашего класса.
//    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
//    равны значения полей марка, оперативная память и видеокарта.
//    В отдельном классе создайте объект класса компьютер, и выведите в консоль
//    информацию о вашем объекте

    private String tradeMarkOfComputer;
    private int priceOfComputer;
    private int computerRAM;
    private int videocardOfComputer;

    public String getTradeMarkOfComputer() {
        return tradeMarkOfComputer;
    }

    public void setTradeMarkOfComputer(String tradeMarkOfComputer) {
        this.tradeMarkOfComputer = tradeMarkOfComputer;
    }

    public int getPriceOfComputer() {
        return priceOfComputer;
    }

    public void setPriceOfComputer(int priceOfComputer) {
        this.priceOfComputer = priceOfComputer;
    }

    public int getComputerRAM() {
        return computerRAM;
    }

    public void setComputerRAM(int computerRAM) {
        this.computerRAM = computerRAM;
    }

    public int getVideocardOfComputer() {
        return videocardOfComputer;
    }

    public void setVideocardOfComputer(int videocardOfComputer) {
        this.videocardOfComputer = videocardOfComputer;
    }

    @Override
    public String toString() {
        return "Создан PC." + "\n" +
                "Имя = " + tradeMarkOfComputer + "." + "\n" +
                "Цена = " + priceOfComputer + "." + "\n" +
                "Видеокарта = " + videocardOfComputer + "." + "\n" +
                "ОЗУ = " + computerRAM + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return computerRAM == computer.computerRAM && videocardOfComputer == computer.videocardOfComputer && Objects.equals(tradeMarkOfComputer, computer.tradeMarkOfComputer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tradeMarkOfComputer, computerRAM, videocardOfComputer);
    }

    public Computer(String tradeMarkOfComputer, int priceOfComputer, int computerRAM, int videocardOfComputer) {
        this.tradeMarkOfComputer = tradeMarkOfComputer;
        this.priceOfComputer = priceOfComputer;
        this.computerRAM = computerRAM;
        this.videocardOfComputer = videocardOfComputer;
    }
}
