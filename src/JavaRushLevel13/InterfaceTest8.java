package JavaRushLevel13;
/*Добавь интерфейсы Secretary и Boss к классам Manager и Subordinate. По одному на каждый.
Подумай, кому какой.
Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и HasManagementPotential так,
чтобы все методы у классов Manager и Subordinate были объявлены в каком-то интерфейсе.*/
public class InterfaceTest8 {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential extends Person {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person  {
    }

    interface Boss extends HasManagementPotential,Person  {
    }

    class Manager  implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary  {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }

}
