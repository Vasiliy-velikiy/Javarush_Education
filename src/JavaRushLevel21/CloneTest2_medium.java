package JavaRushLevel21;
/*Обеспечь возможность клонирования объекта класса Solution используя глубокое клонирование.
Данные в карте users также должны быть клонированы.
Не забудь о методах equals и hashCode для корректного добавления элементов типа User в HashMap.

*/


import java.util.LinkedHashMap;
import java.util.Map;

public class CloneTest2_medium implements Cloneable{



    public static void main(String[] args) throws CloneNotSupportedException {
            CloneTest2_medium solution = new CloneTest2_medium();
            solution.users.put("Hubert", new User(172, "Hubert"));
            solution.users.put("Zapp", new User(41, "Zapp"));
            CloneTest2_medium clone = null;

            try {
                clone =(CloneTest2_medium) solution.clone();
                System.out.println(solution);
                System.out.println(clone);

                System.out.println(solution.users);
                System.out.println(clone.users);

            } catch (CloneNotSupportedException e) {
                e.printStackTrace(System.err);
            }



        }
    @Override
    protected Object clone() throws CloneNotSupportedException {
//глубокое копирование применяется когда все объекты будут с новыми ссылками
        //1. даем новую ссылку на обьект
        //2 создаем новую мапу
        //3 поочередно вручную всех юзеров из старой в новую мапу скопировать
        //4 насчет key неуверен - может через new String&?
        //5 присвоить переменной users новую мапу ??
        CloneTest2_medium solutioncopy=(CloneTest2_medium)super.clone();
        Map<String, User> userscopy = new LinkedHashMap<>();  //Класс LinkedHashMap расширяет HashMap и поддерживает связанный список записей на Map в том порядке, в котором они были вставлены
        for (String key:this.users.keySet()) {//keySet()Возвращает набор, который содержит ключи в вызываемой карте. Этот метод предоставляет набор ключей на вызывающей карте.
           User ucopy=users.get(key);//по стринговым ключам мы можем найти соответсвующих юзеров и их передать в новый объект для копирования
            userscopy.put(key,(User)ucopy.clone());//каждого юзера нужно копировать через метод отдельно реализованный в классе User

        }
        solutioncopy.users=userscopy;//копированному классу solution присваиваю ссылку скопированной мапы
        return solutioncopy;
    }






    protected Map<String, User> users = new LinkedHashMap<>();

        public static class User implements Cloneable {
            int age;
            String name;

            public User(int age, String name) {
                this.age = age;
                this.name = name;
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return (User) super.clone();
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object o) {
                if (!(o instanceof User))  return false;
                if(o==null)return false;
                if (o == this)return true;

                User n = (User) o;
                if (age!=n.age)return false;//если 1ое поле не равно-то обьекты уже не равны , иначе переходим к строчке ниже
                if (name!=null ? !name.equals(n.name):n.name!=null )return false;//1 вариант-если второе поле не пустое и срвнение вторыхстрок у объекта дает false(тоесть они не равны по содержанию)-возвращается false
                                                                                //2ариант если поле name пустое а поле name  объекта n не пустое-то обьекты тоже не арвны-возвращается false
                else return true;  //иначе оббъекты равны по обоим полям и возвращаетсч true
            }
        }
    }

