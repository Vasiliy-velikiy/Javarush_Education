package JavaRushLevel21;
/*Класс Plant не должен реализовывать интерфейс Cloneable
Реализуй механизм глубокого клонирования для Tree.*/
public class CloneTest3_epic {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone =(Tree) tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
//глубокое копирование применяется когда все объекты будут с новыми ссылками
            //1. даем новую ссылку на обьект
            //2 создаем новую переменную обьекта
            //3 поочередно вручную все элементы
            //4 присвоить переменной  новую ссылку ??
            Tree tree= (Tree)super.clone(); //1
            String[] branchescopy=new String[branches.length];//2

            for (int i = 0; i <branches.length ; i++) {//3
                branchescopy[i]=branches[i];
            }
tree.branches=branchescopy;//4
            return tree;
        }
    }

}

