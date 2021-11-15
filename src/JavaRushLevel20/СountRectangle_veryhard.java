package JavaRushLevel20;

import java.util.ArrayList;
import java.util.List;

/*1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
2. Различные прямоугольники не соприкасаются и не накладываются.
3. Внутри прямоугольник весь заполнен 1.
4. В массиве:
4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
4.2) a[i, j] = 0, в противном случае
5. getRectangleCount должен возвращать количество прямоугольников.
6. Метод main не участвует в тестировании*/
public class СountRectangle_veryhard {

    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        /*
        int vertical=0;
        int gorizontal=0;
        int middle;

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {       //нашел верхний левый край элемента
                                         //создаю еще цикл(лучше не for) для перебора в выбранном направлении пока c индекса верхнего края прямоугольника
                                        //   не найду ноль-это будет конец одной стороны
                    for (int k = 0; k <a.length ; k++) {  //ищу значение индекса строки или стобца, перебирая в выбранном
                                                            // напралении все значения элементов начиная с индекса первой единицы до момента пока не найду 0
                        if (a[i][k]==0){
                            gorizontal=k-1;  //как только нашел 0 от индекса отнимаю 1 -это будет конец одной второны прямоугльника
                        }

                    }

                    for (int k = 0; k <a.length ; k++) {     //создаю еще один цикл , и если в предшествующем искал ноль в строке -то в тут ищу ноль в столбце-
                                                               //это будет координата нижнего левого угла
                        if(a[k][j]==0){
                            vertical=k-1;
                        }

            }
                    count++;
                    a[vertical][gorizontal]=0;



                    /*
                 if (j != 0 && i != 0) {
                        if (a[i - 1][j] != 1 && a[i][j - 1] != 1) {
                            count = count + 1;

                    } else {
                            if (i == 0 && j == 0) {
                                count = count + 1;
                            }

                             else {
                                   if (i==0){
                                     if (a[0][j-1]==0){
                                        count=count+1;
                                   }
                                }
                        if(j==0){
                            if(a[i-1][0]==0){
                                count=count+1;
                            }
                        }
                    }




 */
/*
        int count = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //если нашли первую единицу-то это вершина правого угла прямоугольника
                if (!list.contains(i + " " + j)) {
                    count++;
                }
                for (int k = i; (a[k][j] == 1 && k + 1 < a.length); k++) {
                    for (int l = j; (a[k][l] == 1 && l + 1 < a[i].length); l++) {
                        String s = k + " " + l;
                        if (list.contains(s)) {
                            break;
                        } else list.add(s);

                    }

                    if (a[i][j] == 1) {
                    }

                }


                return count;
            }



 */
        return 0;
        }
    }
