package вопросы_к_собеседованию;

import com.sun.source.tree.TryTree;
//	Как создать папку на диске?
//	Как проверить – Есть ли определенная папка на диске?
import java.io.File;

public class Каксоздатьпапкунадиске {

    public static void main(String[] args) {
        //	Как создать папку на диске?
        File f=new File("C:\\Users\\Василий\\Documents\\тестовые_документы\\TEST");
        try {
            if (f.mkdir())//метод создания папки    f.mkdirs()-метод для создания всех указанных каталогов если их не существоволо
                System.out.println("welldone");//если такая папка уже есть -выдаст условие после else
            else System.out.println("ooshit");
        }

        catch (Exception e){
        }


        //	Как проверить – Есть ли определенная папка на диске?
        if (f.exists()){  //exists() - файл существует или нет
            System.out.println("Такая папка есть");
        } else {
            System.out.println("Такой папки нет, создаем");
            f.mkdirs();
        }
    }
}
