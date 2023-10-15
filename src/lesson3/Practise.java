package lesson3;

public class Practise {
    public static void main(String[] args) {
//   1) Создать пять любых переменных типа String ( word1, word2, word3 и т.д. ).
//      Создать также переменную типа String result1 и result2.
//      Поместить в result1 все слова word1 - word5 используя метод concat.
//      Поместить в result2 все слова word1 - word5 используя оператор +.
//      Вывести result1 и result2 в консоль.
//
        String word1 = "home";
        String word2 = "home1";
        String word3 = "home2";
        String word4 = "home3";
        String word5 = "home4";
        String result1 = word1.concat(" ").concat(word2).concat(word3).concat(word4).concat(word5);
        String result2 = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
        System.out.println(result1);
        System.out.println(result2);

//   2) Создать переменную text типа String и разместить в нее произвольный текст.
//      Пусть в консоль выводится сообщение "Is the length of the String more than 100 characters?",
//      а после выводится true, если количество символов в данном тексте превышает 100,
//      В противном случае пусть выводится false.


        String text = "Hello World";
        boolean someResult = text.length() > 100;
        System.out.println("Is the length of the String more than 100 characters? " + (text.length() > 100));


//   3) Создать переменную sentence типа String и разместить в нее следующий текст:
//     "С другVXYой стороны, дальнейшее развитие различных форм деятелFZSьности создаёт предпосылки для новых принципов формирования матеXFриально-технической и кадровой базы.".
//      Вывести в конслоь true, если в данном тескте содержиться слово "новых", или если длина строки равна 123 символам. Также расставить в значении переменной sentence символ
//      экранирования таким образом, чтобы при выводе в консоль она отображалась следующим образом:
//           "С другой стороны, дальнейшее развитие различных форм
//           деятельности создаёт предпосылки для новых принципов
//           формирования материально-технической и кадровой базы".
//      Вывести переменную sentence в консоль.

        String sentense = "С другVXY\b\b\bой стороны, дальнейшее развитие различных форм\n деятелFZS\b\b\bьности создаёт предпосылки для новых принципов\n формирования матеXF\b\bриально-технической и кадровой базы.";
        boolean boo = sentense.contains("новых") || sentense.length() == 123;
        System.out.println(boo);
        System.out.println(sentense);

    }
}

//   4) Создайте строку resumeStringName со значением:
//          "Hello! My name is {NAME}.",
//       а также переменную resumeStringCity со значением:
//           "I am from {CITY}."
//
//        Создать также переменную типа String result1 и result2.
//        В result1 поместить значение resumeStringName и resumeStringCity и заменить внутри текст переменных
//        {NAME} и {CITY} на ваше имя и город используя методы concat и substring.
//        В result2 поместить значение resumeStringName и resumeStringCity и заменить внутри текст переменных
//        {NAME} и {CITY} на ваше имя и город используя метод replace.
//        Вывести в консоль сравнение на равенство двух переменных result1 и result2.


//        String resumeStringName = "Hello! My name is {NAME}.";
//        String resumeStringCity = "I am from {CITY}.";
//        String result1 = resumeStringName.substring(0, resumeStringName.length() - 7).concat("Daniel. ").concat(resumeStringCity
//                .substring(0, resumeStringCity.length() - 7).concat("Kyiv."));
//        String result2 = resumeStringName.replace("{NAME}", "Daniel") + " " + resumeStringCity.replace("{CITY}", "Kyiv");
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result1.equals(result2));
//

