import java.util.HashMap;
import java.util.Map;

public class Gerenciador {

    private HashMap<String, Integer> listaEstoque;

    public Gerenciador(){
        listaEstoque = new HashMap<String, Integer>();
    }

    public String adicionarOuAtualizar(final String produto, final Integer quantidade){
        if (quantidade <= 0) {
            return "Quantidade inválida! Adicione uma qualidade positiva";
        }
        if (listaEstoque.containsKey(produto)){
            listaEstoque.put(produto, listaEstoque.get(produto) + quantidade);
            return "Produto " +produto+ " atualizado com sucesso!";
        } else {
            listaEstoque.put(produto, quantidade);
            return "Produto adicionado ao estoque";
        }
    }

    public void exibirTodosProdutos() {
        for (Map.Entry<String, Integer> entry : listaEstoque.entrySet()){
            System.out.println("Produto: "+entry.getKey()+"\n" +
                    "Quantidade: "+entry.getValue());
        }
    }

    public void consultarProduto(final String produto) {
        if (listaEstoque.containsKey(produto)) {
            Integer qtdProduto = listaEstoque.get(produto);
            System.out.println("Produto: "+produto+"\n" +
                    "Quantiade: "+qtdProduto);
        } else {
            System.out.println("Produto não encontrado no estoque");
        }
    }

    public String removerProduto(final String produto) {
        if (listaEstoque.remove(produto) != null) {
            return "Produto "+produto+" foi removido!";
        } else {
            return "Produto não encontrado no estoque";
        }
    }

}