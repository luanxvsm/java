import java.awt.Color;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Color {
    public static void main(String[] args) throws Exception {
        int width = 100;
        int height = 100;
        BufferedImage imagem = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
Color BLUE = new Color(0, 0, 255);

        imagem.setRGB(0, 0,Color.BLUE.getRGB());
    }
}
