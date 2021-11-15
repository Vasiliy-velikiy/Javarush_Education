package Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*Используй класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.*/
    public class AdapterFileOutputStream implements AmigoStringWriter {
private  FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream=fileOutputStream;

    }

    @Override
    public void writeString(String s) throws IOException {
        this.fileOutputStream.write(s.getBytes());//тк строка может быть больше 1го символа-(набор байт) нам нужно сохдать буфер из байт (getBytes()) и потом его записать
    }

    @Override
    public void close() throws IOException {
        this.fileOutputStream.close();

    }

    @Override
    public void flush() throws IOException {
        this.fileOutputStream.flush();

    }

    public static void main(String[] args) {

        }


    }

interface AmigoStringWriter {
    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}