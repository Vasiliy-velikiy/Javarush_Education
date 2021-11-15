package JavaRushLevel16;

public class MultiThreadingTest23_hard {
    public static void main(String[] args) {
        try {


            ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
            System.out.println(reader);


        }
        catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Неизвестный тип картинки");
        }
    }
}


class ImageReaderFactory  {

    // private static IllegalArgumentException IllegalArgumentException;


    public static ImageReader getImageReader(ImageTypes imageTypes) {



        if(imageTypes==ImageTypes.JPG) return new JpgReader();
        else  if(imageTypes==ImageTypes.PNG) return new PngReader();
        else if(imageTypes==ImageTypes.BMP) return new BmpReader();

        else
            throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}



class BmpReader implements ImageReader {
}
class PngReader  implements ImageReader{
}
class JpgReader implements ImageReader {
        }

 interface ImageReader {
}
enum ImageTypes {
    BMP,
    JPG,
    PNG
}
