package JavaRushLevel25;

import JavaRushLevel24.MarkerInterfaceTest3;

/*Используя возможности enum-а реализуй метод getLetterPosition, который должен возвращать позицию буквы.
Позиция буквы A - 1.*/
public class EnumTest1 {
    public static void main(String[] args) {
        System.out.println(Alphabet.A.getLetterPosition());
    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;

        int getLetterPosition() {
            return ordinal()+1;
        }
    }


}
