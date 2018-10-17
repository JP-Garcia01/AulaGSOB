import static javax.swing.JOptionPane.showMessageDialog; //out
import static javax.swing.JOptionPane.showInputDialog; //in
import static java.lang.Integer.parseInt; //String --> int
import static java.lang.Float.parseFloat; //String --> float

public class FuncoesPart2{
    
    //funçao principal executável
    public static void main(String[] args) {
        
        int numFav01 = receberInt("Digite seu 1º num fav"),
            numFav02 = receberInt("Digite seu 2º num fav"),
            numFav03 = receberInt("Digite seu 3º num fav"),
            numFav04 = receberInt("Digite seu 4º num fav"),
            numFav05 = receberInt("Digite seu 5º num fav"),
            numFav06 = receberInt("Digite seu 6º num fav"),
            numFav07 = receberInt("Digite seu 7º num fav");
        
        exibir(
               "Num Fav 1: " + numFav01 + "\n" + 
               "Num Fav 2: " + numFav02 + "\n" + 
               "Num Fav 3: " + numFav03 + "\n" + 
               "Num Fav 4: " + numFav04 + "\n" + 
               "Num Fav 5: " + numFav05 + "\n" + 
               "Num Fav 6: " + numFav06 + "\n" + 
               "Num Fav 7: " + numFav07 
        );
            
    }// fim main
    
    public static int receberInt(String mensagemProUsuario){
        try {
            //codigo normal :)
            return parseInt(showInputDialog(mensagemProUsuario));
        } catch (Exception e) {
            // se deu errado :(
        }
        return 0;
    }
    
    public static void exibir(String mensagemProUsuario){
        showMessageDialog(null, mensagemProUsuario);
    }
}//fim class