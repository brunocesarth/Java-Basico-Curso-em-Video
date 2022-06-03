package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1.equals(nome3))?"Igual":"diferente";
        System.out.println(res);
    }   
}