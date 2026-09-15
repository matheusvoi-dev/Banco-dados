import java.util.ArrayList;
public class aula{
    public static void main(String[] args) {
    ArrayList<String> carrinho = new ArrayList<>();
        carrinho.add("Notebook");
        carrinho.add("Mouse");
        carrinho.add("Teclado");
        carrinho.add("Monitor");
        carrinho.add("Fone");
        System.out.println("Primeiro produto " + carrinho.get(0));
        System.out.println("Segundo produto: " + carrinho.get(1));
        System.out.println("Terceiro produto: " + carrinho.get(2));
        System.out.println("Quarto produto: " + carrinho.get(3));
        System.out.println("Quinto produto: " + carrinho.get(4));
        carrinho.remove("Mouse");
        System.out.println("Depois de remover: " + carrinho);
        System.out.println("Você tem " + carrinho.size() + " itens no carrinho");
     
    }
}
        