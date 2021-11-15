package JavaRushLevel15;
/*Чтобы решить эту задачу:
Создай 4 конструктора с разными модификаторами доступа в классе Solution.
В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private)*/
public class Solution {
    public Solution(String s) {
    }

    private Solution(Integer i) {
    }

     Solution(char ch) {
    }

    protected Solution() {
    }

    public static void main(String[] args) {

    }


}
class SubSolution extends Solution{
    public SubSolution() {
    }

    protected SubSolution(String s) {
        super(s);
    }

     SubSolution(char ch) {
        super(ch);
    }

}
