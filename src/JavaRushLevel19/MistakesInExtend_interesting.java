package Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MistakesInExtend_interesting {
    {
        System.out.println("This is the Solution class");
    }

    public static void main(String... args) throws IOException {
        try (
                FileOutputStream outputStream = new FileOutputStream(args[0]);
                InputStream is = MistakesInExtend_interesting.class.getClassLoader().getResourceAsStream(args[1]);
        ) {
            ;
            byte[] b = new byte[is.available()];
            outputStream.write(is.read(b));

            int value = 123_456_789;
            System.out.println(value);

            Example result = null;
            String s = "a";
            switch (s) {
                case "a": {
                    result = new MistakesInExtend_interesting().new A();
                    break;
                }
                case "b": {
                    result = new MistakesInExtend_interesting().new B();
                    break;
                }
                case "c": {
                    result = new MistakesInExtend_interesting().new C();
                    break;
                }
            }

            if (result instanceof C) {// ошибка была тут result instanceof A.ЕСЛИ значение переменной будет объектом А-преобразование не выполниться и возникнет ошибка

         //объяснение
         /*
         То что  если бы это так работало, то это был бы Остров доктора Моро ) Морской тюлень бы превращался в
         колибри, анаконда в страуса и тд.
Давай рассмотрим следующий код:
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}


Иерархия понятна, суперкласс - он же парент, Animal и два чайлда - Dog и Cat.
Теперь будем пробовать делать сужения типов:
Animal animal = new Animal();
Dog barbos = (Dog) animal;

Это вариант C с = (C) result ( result = A, C extends A); с этой задачи.
Что мы получим?
java.lang.ClassCastException.

Почему? Важно понимать, мы не сжимаем/расширяем объекты! Мы не растягиваем физически собаку или сжать.
Мы сужаем/расширяем ТИП.
Тип переменной это:
Dog dog = new Dog();
Animal dog2 = new Dog();
Это два разных типа переменных. А объект ОДНОГО типа (Dog).
И преобразования доступны:
dog2 = dog; (расширение ТИПА)
dog = (Dog) dog2; (сужение ТИПА)

Это произойдет на ура. Ведь фактический объект ОДНОГО типа. А переменных - два типа и между собой конвертятся.
Рассмотрим еще пример:
Animal animal = new Animal();
Animal cat = new Cat();
animal = cat; //расширение типа, все ок.
Dog hachiko = (Dog) animal;

А здесь будет снова java.lang.ClassCastException.
Переменная animal типа Animal, теоретически мы можем сузить ТИП.
Но реальный объект, который кроется за этим животным - это КОТ.
А собака ни в природе ни в джава котом быть не может и наоборот.
Еще пример:
Dog whiteBim = new Dog();
Animal animal = new Animal();
animal = whiteBim; // расширение ТИПА
Dog blackEar = (Dog) whiteBim; //сужение ТИПА

здесь все ок.

Так что отталкиваемся от самого класса, экземпляром которого является объект. Привести мы можем либо к этому же типу(классу) либо к одному из родительских
          */
                C p = (C) result;
                System.out.println(p.getClass().getSimpleName());
            }

        } catch (IOException e) {
        }
    }

    interface Example {
    }

    class A implements Example {
        {
            System.out.println("This is the A class");
        }
    }

    class B implements Example {
        {
            System.out.println("This is the B class");
        }
    }

    class C extends A {
        {
            System.out.println("This is the C class");
        }
    }
}