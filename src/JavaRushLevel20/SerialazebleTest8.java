package Stream;

/*Запрети сериализацию класса SubSolution используя NotSerializableException.
Сигнатуры классов менять нельзя.*/

import java.io.*;

public class SerialazebleTest8 implements Serializable {
    static NotSerializableException exception=new NotSerializableException();

    public static class SubSolution extends SerialazebleTest8 {

        /*Причем, даже если нам нужно все таки задать поведение сериализации, мы можем не использовать Externalizable,
        а так же реализовать Serializable, добавив (не переопределив) в него методы writeObject() и readObject().
        Но для того, чтобы они «работали» нужно точно соблюсти их сигнатуру.*/


        private void writeObject(ObjectOutputStream stream) throws IOException {
            throw exception;
        }
        private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
            throw exception;

        }
    }

        public static void main(String[] args) throws IOException {



            }


}



