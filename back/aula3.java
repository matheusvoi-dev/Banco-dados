import java.util.HashMap;
public class aula3{
    public static void main(String[] args) {
       HashMap<Integer, String> produtos = new HashMap<>();
        produtos.put(101, "Notebook");
        produtos.put(102, "Mouse");
        produtos.put(103, "Teclado");
        produtos.put(108, "Base de carregamento");
        produtos.put(300, "Mousepad");
        produtos.put(100, "Webcam");
        produtos.put(240, "Fone");
        produtos.put(250, "Action figure");
        System.out.println(produtos);
        System.out.println("Produto 102 é o: " + produtos.get(102));
        System.out.println("Produto 100 é o: " + produtos.get(100));
           if (produtos.containsKey(400)) {
        System.out.println("Produto: " + produtos.get(400));
        } else {
        System.out.println("Produto não encontrado!");
        }
        produtos.remove(300);
        System.out.println("Depois de remover: " + produtos);
    }
}