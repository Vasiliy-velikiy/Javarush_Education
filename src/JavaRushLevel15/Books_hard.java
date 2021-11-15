package JavaRushLevel15;

import java.util.LinkedList;
import java.util.List;

/*Давай напишем программу, которая будет определять жанр книги, или автора, который ее написал.
Для этого:
Создай public static класс MarkTwainBook, который наследуется от Book. Имя автора — [Mark Twain].
Параметр конструктора — название книги (title).
В классе MarkTwainBook реализуй все абстрактные методы.
Для метода getBook измени тип возвращаемого значения на более подходящий.
Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
agathaChristieOutput — для книг Агаты Кристи;
markTwainOutput — для книг Марка Твена.*/
public class Books_hard {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {

        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();//тип этого метода должен быть Book тогда в методе getOutputByBookType() отобразится .getTitle()

        public abstract String getTitle();


        //метод getBook()-возвращает объект  типа AgathaChristieBook  или MarkTwainBook, и к нему прикрепляет метод getTitle() соответсвубщий и возвращает название книги
        private String getOutputByBookType() {// тоесть вместо getBook()-мы понимаем объект MarkTwainBook или др, но так как у нас нет параметра текущего чтобы через точечную
            // нотацию вызвать getTitle(), то getBook().getTitle()-идеальный вариант
            String agathaChristieOutput = author + ": " +getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;
        if(this.getBook() instanceof AgathaChristieBook){
    return agathaChristieOutput;}
    if (this.getBook() instanceof MarkTwainBook){ return markTwainOutput;}

           String output = "output";

            //Add your code here

           return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book{
       private String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title=title;

        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }


    public static class AgathaChristieBook extends Book{
        private String title;


        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title=title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
}

