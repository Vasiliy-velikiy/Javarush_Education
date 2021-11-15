package JavaRush;


import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/*Реализуй логику метода interrupt, который должен прерывать трэд предварительно закрыв используемые ресурсы.
Используй метод super-класса в блоке finally*/
public class InterruptThreadTest extends Thread {
    private static final int BUFFER_SIZE = 2000;    //2000 bytes
    private final Socket socket;
    private final InputStream in;

    public InterruptThreadTest(Socket socket) throws IOException {
        this.socket = socket;
        this.in = socket.getInputStream();
    }

    public void interrupt() {

        try {
            socket.close();
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            super.interrupt();
        }
        //implement logic here
    }

    public void run() {
        try {
            byte[] buf = new byte[BUFFER_SIZE];
            while (true) {
                int count = in.read(buf);
                if (count < 0) {
                    break;
                } else {
                    if (count > 0) {
                        //process buffer here
                    }
                }
            }
        } catch (IOException ignored) {
        }
    }

    public static void main(String[] args) {
    }
}