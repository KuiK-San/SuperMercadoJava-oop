package utils;

import java.util.Scanner;
import models.Atendente;
import models.Cliente;
import services.AtendenteService;
import services.ClienteService;

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
            ClienteService servico = new ClienteService();
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
                        
                        System.out.println("Qual o id do cliente?");
                                String id = scanner.nextLine();
                        
                        System.out.println("Qual o cpf do cliente?");
                        String cpf = scanner.nextLine();
                        
                        System.out.println("Qual o nome do cliente?");
                        String nome = scanner.nextLine();
                        
                        Cliente cliente = new Cliente(id, nome, cpf);
                        
                        servico.adicionarCliente(cliente);
                    }
                    case 2 -> {
                        System.out.println("Qual o id do cliente buscado?");
                        String id = scanner.nextLine();
                        
                        Cliente cliente = servico.buscarCliente(id);
                        
                        if(cliente != null){
                            System.out.println("Nome do cliente = " + cliente.getNome());
                            System.out.println("Cpf do cliente = " + cliente.getCpf());
                        }else {
                            System.out.println("Cliente não encontrado!");
                        }
                    
                        
                        
                    }
                    case 3 -> {
                        System.out.println("Qual o id do cliente para atualizar?");
                        String id = scanner.nextLine();
                        
                        System.out.println("Qual o cpf atualizado do cliente?");
                        String cpf = scanner.nextLine();
                        
                        System.out.println("Qual o nome atualizado do cliente?");
                        String nome = scanner.nextLine();
                        
                        Cliente cliente = new Cliente(id, nome, cpf);
                        
                        servico.atualizarCliente(id, cliente);
                    }
                    case 4 -> {
                        System.out.println("Qual o id do cliente excluido?");
                        String id = scanner.nextLine();
                        
                        servico.removerCliente(id);
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
            AtendenteService servico = new AtendenteService();
            
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
                        
                        System.out.println("Qual o id do atendente?");
                                String id = scanner.nextLine();
                        
                        System.out.println("Qual o cpf do atendente?");
                        String cpf = scanner.nextLine();
                        
                        System.out.println("Qual o nome do atendente?");
                        String nome = scanner.nextLine();
                        
                        Atendente atendente = new Atendente(id, nome, cpf);
                        
                        servico.adicionarAtendente(atendente);
                    }
                    case 2 -> {
                        System.out.println("Qual o id do atendente buscado?");
                        String id = scanner.nextLine();
                        
                        Atendente atendente = servico.buscarAtendente(id);
                        
                        if(atendente != null){
                            System.out.println("Nome do atendente = " + atendente.getNome());
                            System.out.println("Cpf do atendente = " + atendente.getCpf());
                        }else {
                            System.out.println("Atendente não encontrado!");
                        }
                    
                        
                        
                    }
                    case 3 -> {
                        System.out.println("Qual o id do atendente para atualizar?");
                        String id = scanner.nextLine();
                        
                        System.out.println("Qual o cpf atualizado do atendente?");
                        String cpf = scanner.nextLine();
                        
                        System.out.println("Qual o nome atualizado do atendente?");
                        String nome = scanner.nextLine();
                        
                        Atendente atendente = new Atendente(id, nome, cpf);
                        
                        servico.atualizarAtendente(id, atendente);
                    }
                    case 4 -> {
                        System.out.println("Qual o id do atendente excluido?");
                        String id = scanner.nextLine();
                        
                        servico.removerAtendente(id);
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