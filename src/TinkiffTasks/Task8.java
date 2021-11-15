package TinkiffTasks;
/*Миша сидел в переговорке и решил нарисовать ее план на листке бумаги. Когда он закончил рисовать план переговорки,
он положил лист с планом на пол переговорки. Теперь ему стало интересно: а есть ли на плане точка, которая лежит ровно
на том месте пола, за которое она отвечает?

Помогите ему найти эту точку.


Формат входных данных

Переговорка и ее план имеют форму прямоугольника. Первая строка входного файла содержит два вещественных числа:
координаты X и Y переговорки (1 <= X <= 1000 , 1<= Y <= 1000)/
 Координаты углов переговорки равны (0,0), (X,0), (X,Y), (0,Y)

Во второй строке файла даются восемь вещественных чисел, описывающих положение углов плана переговорки.
Сначала вводятся координаты того угла плана, который соответствует углу переговорки с координатами (0,0),
 затем — (X,0),(X,Y) наконец, (0,Y) Гарантируется, что входные данные корректны, то есть план является прямоугольником,
 линейные размеры которого соответ- ствуют размерам переговорки, а также он не выходит за границы перегородки.

Все числа во входном файле вещественные, заданы с точностью

5 знаков после десятичной точки. План выполнен в масштабе не менее 0,0001 и строго менее 1.


Формат выходных данных

Выведите два вещественных числа — координаты неподвижной точки в координатах переговорки. Выводить число нужно с точностью
не менее четырех знаков после запятой.


Замечание

Заметьте, что для читаемости условий входные данные в примере даются с меньшим количеством десятичных знаков. В реальных
тестовых данных в координатах будут дополнительные нули на конце.

Примеры данных
Пример 1
10  5
вывод:
2.5000  2.0833
Пример 2
3.0  2.5  1.0  2.5  1.0  1.5  3.0  1.5

Решение

В этой задаче существует формульное решение, которое требует некоторого количества математических знаний и внимательности в
 работе с формулами. Для начала с помощью обратных
тригонометрических величин найдем угол поворота прямоугольника φ. Далее выразим глобальные
координаты искомой точки (X, Y ) через угол, коэффициент подобия прямоугольников k и координатой точки с относительными
 координатами (0, 0) для второго прямоугольника (x, y):
X = x + kX cos φ + kY sin φ
Y = y + kY sin φ − kX cos φ
X =(x + kY sin φ)/1 − cos φ
Y =((y − k)*((x+kY sin φ)/1−cos φ)*cos φ) / 1 − k sin φ

*/
public class Task8 {
}
