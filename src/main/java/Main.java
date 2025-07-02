import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerenciador maps = new Gerenciador();
        int opcao;

        do {
            System.out.println("-------Gerenciador de Deposito-------");
            System.out.println("1. Adicionar ou Atualizar");
            System.out.println("2. Produtos cadastrados");
            System.out.println("3. Consultar Produtos");
            System.out.println("4. Remover Produto");
            System.out.println("-------Gerenciador de Deposito-------");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("Qual seu produto?");
                    String nomeProduto = scanner.nextLine();
                    System.out.println("Qual a quantidade?");
                    Integer qtdProduto = scanner.nextInt();
                    maps.adicionarOuAtualizar(nomeProduto, qtdProduto);
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    maps.exibirTodosProdutos();
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("Qual produto deseja consultar?");
                    String prodConsultar = scanner.nextLine();
                    maps.consultarProduto(prodConsultar);
                    System.out.println("-------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("Qual produto deseja remover?");
                    String prodRemover = scanner.nextLine();
                    System.out.println(maps.removerProduto(prodRemover));
                    System.out.println("-------------------------------------");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}