package JavaRushLevel8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м
*/
public class VowelsAndConsonants {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
   // public static char[] consonants = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н','п','р','с','т','ф','х','ц','ч','ш','щ',',','.','!',':',};

    public static void main(String[] args) throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        ArrayList<Character> vowels=new ArrayList<>();
        ArrayList<Character> consonants=new ArrayList<>();

        for (int i = 0; i <s.length() ; i++) {
//проверка на наличие пробелов( они не нужны при сортировки в листы букв) поэтому i++=пропускаем пробел и счет в строке на след символ
            if (s.charAt(i)==' '){
                i++;
            }
            if(isVowel(s.charAt(i))==true){
                vowels.add(s.charAt(i));
            }
            else {
                consonants.add(s.charAt(i));
            }
        }

        for (Character ch:vowels){
            System.out.print(ch+" ");
        }
        System.out.println();
        for (Character ch:consonants){
            System.out.print(ch+" ");
        }



        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
