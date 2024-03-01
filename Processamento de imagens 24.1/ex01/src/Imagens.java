import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Imagens {
    public static void main(String[] args) throws Exception {
        BufferedImage imagem = ImageIO.read(new File("C:\\Users\\luanl\\OneDrive\\Documentos\\GitHub\\java\\java\\Teoria dos Grafos\\ex05\\src\\transferir.jpg"));
        int w = imagem.getWidth();
        int h = imagem.getHeight();
        int pixels = w * h;

        System.out.println("Largura da imagem: " + w + " pixels");
        System.out.println("Altura da imagem: " + h + " pixels");
        System.out.println("Total de pixels: " + pixels);
    }
}
