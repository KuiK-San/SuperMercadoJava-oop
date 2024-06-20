package utils;

import java.util.Scanner;

public class Menu {
    public static void verMenu(){
        try (Scanner scanner = new Scanner(System.in)) {
            int escolha;
            
            do{
                System.out.println("Menu Principal:");
                System.out.println("1. Gerenciamento Cliente");
                System.out.println("2. Gerenciamento de Atendentes de Caixa");
                System.out.println("3. Realização de Vendas");
                System.out.println("4. Histórico de Compras");
                System.out.println("5. Histórico de Vendas ");
                System.out.println("6. Gerenciamento de Estoque");
                System.out.println("7. Pedidos de Compra");
                System.out.println("8. Sair");
                System.out.print("Escolha uma opção: ");
                
                escolha = scanner.nextInt();
                scanner.nextLine();
                
                switch (escolha) {
                    case 1 -> verClienteMenu(scanner);
                    case 2 -> verCaixaMenu(scanner);
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> {
                    }
                    case 6 -> verGerenciadorEstoqueMenu(scanner);
                    case 7 -> {
                    }
                    case 8 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
                
            }while(escolha != 8);
        }
    }
    
    private static void verClienteMenu(Scanner scanner){
        try (scanner) {
            int escolha;
            
            do{
                System.out.println("Gerenciamento de Clientes:");
                System.out.println("1. Incluir novo cliente");
                System.out.println("2. Consultar Cliente");
                System.out.println("3. Atualizar Cliente");
                System.out.println("4. Excluir Cliente");
                System.out.println("5. Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                
                escolha = scanner.nextInt();
                scanner.nextLine();
                
                switch (escolha) {
                    case 1 -> {
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> verMenu();
                    default -> System.out.println("Opção inválida.");
                }
                
            }while(escolha != 5);
        }
    }
    
    private static void verCaixaMenu(Scanner scanner){
        try (scanner) {
            int escolha;
            
            do{
                System.out.println("Gerenciamento de Atendentes de Caixa:");
                System.out.println("1. Incluir novo atendente");
                System.out.println("2. Consultar atendente");
                System.out.println("3. Atualizar atendente");
                System.out.println("4. Excluir atendente");
                System.out.println("5. Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                
                escolha = scanner.nextInt();
                scanner.nextLine();
                
                switch (escolha) {
                    case 1 -> {
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> verMenu();
                    default -> System.out.println("Opção inválida.");
                }
                
            }while(escolha != 5);
        }
    }
    private static void verGerenciadorEstoqueMenu(Scanner scanner){
        try (scanner) {
            int escolha;
            
            do{
                System.out.println("Gerenciamento de Eestoque:");
                System.out.println("1. Incluir novo produto");
                System.out.println("2. Consultar estoque produto");
                System.out.println("3. Atualizar estoque de produto");
                System.out.println("4. Excluir Produto");
                System.out.println("5. Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                
                escolha = scanner.nextInt();
                scanner.nextLine();
                
                switch (escolha) {
                    case 1 -> {
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> verMenu();
                    default -> System.out.println("Opção inválida.");
                }
                
            }while(escolha != 5);
        }
    }
}