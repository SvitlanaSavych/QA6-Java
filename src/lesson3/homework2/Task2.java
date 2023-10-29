package lesson3.homework2;

public class Task2 {
    public static void main(String[] args) {
//        2)
//        Создать строку string = "Testing, is my favourite job".
//        Вывести на экран отдельно каждое слово и длину этого слова в след виде:
//        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
//        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
//        и т.д.
//        Вывести на консоль true, если первое слово длиннее остальных, в
//        противном случае вывести false.

        String string = "Testing, is my favourite job";
        String [] resultWords = string.split("\\s");
        String word1 = resultWords [0];
        String word2 = resultWords [1];
        String word3 = resultWords [2];
        String word4 = resultWords [3];
        String word5 = resultWords [4];
        System.out.println("Слово 1 = " + word1.replace(","," "));
        System.out.println("Длина этого слова = " + (word1.length()-1));
        System.out.println("Слово 2 = " + word2);
        System.out.println("Длина этого слова = " + word2.length());
        System.out.println("Слово 3 = " + word3);
        System.out.println("Длина этого слова = " + word3.length());
        System.out.println("Слово 4 = " + word4);
        System.out.println("Длина этого слова = " + word4.length());
        System.out.println("Слово 5 = " + word5);
        System.out.println("Длина этого слова = " + word5.length());
        System.out.println(word1.length() > word2.length() && word1.length() > word3.length()
                && word1.length() > word4.length() && word1.length() > word5.length());
    }
}
