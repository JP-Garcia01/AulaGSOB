import static javax.swing.JOptionPane.showMessageDialog; //out
import static javax.swing.JOptionPane.showInputDialog; //in
import static java.lang.Integer.parseInt; //String --> int
import static java.lang.Float.parseFloat; //String --> float
import static java.lang.String.valueOf; //??? --> String

public class NumerosFavoritos{
    
    //funçao principal executável
    public static void main(String[] args) {
        
        //criando array de 1D
        int[] numFav =  new int[7];
        //como acessar um elemento do array
        //numFav[5] = 2;
        
        //preencher o array
        for (int cont = 0; cont < numFav.length; cont++) {
            numFav[cont] = receberInt(
                "Digite o " + cont + "º  favorito"
            );
        }
        
        //var aux
        String mensagem = "";
        
        //acessar os elementos do array
        for (int cont = 0; cont < numFav.length; cont++) {
            mensagem +=
               "Num Fav " + (cont + 1) + 
               ": " + numFav[cont] + "\n";
        }
        exibir(mensagem);

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