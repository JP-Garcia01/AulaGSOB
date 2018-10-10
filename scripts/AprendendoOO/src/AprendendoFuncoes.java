//exibir mensagens
import static javax.swing.JOptionPane.showMessageDialog;

//receber dados do usuário
import static javax.swing.JOptionPane.showInputDialog;

//converter String -> int
import static java.lang.Integer.parseInt;

//converter String -> float
import static java.lang.Float.parseFloat;

public class AprendendoFuncoes{
    public static void main(String[] args) {
       int n1 = parseInt(showInputDialog("Digite n1"));
       int n2 = parseInt(showInputDialog("Digite n2"));
       int resultado = calculaSoma(n1, n2);
       showMessageDialog(null, resultado);
    }//main
    
    //somar 2 numeros [int]: [int]
    public static int calculaSoma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    }
}
