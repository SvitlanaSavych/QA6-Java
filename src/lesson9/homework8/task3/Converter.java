package lesson9.homework8.task3;

public class Converter {
//    3)
//    Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:

//    метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
//    При вводе boolean выводит сообщение, что введен тип boolean.
//
//    convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
//    При вводе boolean выводит сообщение, что введен тип boolean.
//
//    convertToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
//
//    У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
//    А также только один метод геттер для получения информации о названии данного конвертера.

    public String nameOfConverter;

    public String getNameOfConverter() {
        return nameOfConverter;
    }

    public Converter(String nameOfConverter) {
        this.nameOfConverter = nameOfConverter;
    }


    public int convertToInt(byte byteValue) {
        return byteValue;
    }

    public int convertToInt(short shortValue) {
        return shortValue;
    }

    public int convertToInt(int intValue) {
        return intValue;
    }

    public int convertToInt(long longValue) {
        return (int) longValue;
    }

    public int convertToInt(char charValue) {
        return charValue;
    }

    public int convertToInt(float floatValue) {
        return (int) floatValue;
    }

    public int convertToInt(double doubleValue) {
        return (int) Math.round(doubleValue);
    }

    public int convertToInt(String stringValue) {
        return (int) Integer.parseInt(stringValue);
    }

    public void convertToInt(boolean booleanValue) {
        System.out.println("Введен boolean - " + booleanValue);
    }


    public double convertToDouble(byte byteValue) {
        return byteValue;
    }

    public double convertToDouble(short shortValue) {
        return shortValue;
    }

    public double convertToDouble(int intValue) {
        return intValue;
    }

    public double convertToDouble(long longValue) {
        return longValue;
    }

    public double convertToDouble(char charValue) {
        return charValue;
    }

    public double convertToDouble(float floatValue) {
        return floatValue;
    }

    public double convertToDouble(double doubleValue) {
        return doubleValue;
    }

    public double convertToDouble(String stringValue) {
        return (double) Integer.parseInt(stringValue);
    }

    public void convertToDouble(boolean booleanValue) {
        System.out.println("Введен boolean - " + booleanValue);
    }


    public String convertToString(byte byteValue) {
        return String.valueOf(byteValue);
    }

    public String convertToString(short shortValue) {
        return String.valueOf(shortValue);
    }

    public String convertToString(int intValue) {
        return String.valueOf(intValue);
    }

    public String convertToString(long longValue) {
        return String.valueOf(longValue);
    }

    public String convertToString(char charValue) {
        return String.valueOf(charValue);
    }

    public String convertToString(boolean booleanValue) {
        return String.valueOf(booleanValue);
    }

    public String convertToString(float floatValue) {
        return String.valueOf(floatValue);
    }

    public String convertToString(double doubleValue) {
        return String.valueOf(doubleValue);
    }

    public String convertToString(String stringValue) {
        return stringValue;
    }




//    public static void main(String[] args) {
//        new Converter("Converter").convertToInt(false);
//    }

}
