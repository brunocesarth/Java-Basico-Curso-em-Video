package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Math.round;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension resolucaoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print("A resolução da minha tela é ");
        System.out.println(round(resolucaoDaTela.getWidth())+" x "+ round(resolucaoDaTela.getHeight()));
    }
}
