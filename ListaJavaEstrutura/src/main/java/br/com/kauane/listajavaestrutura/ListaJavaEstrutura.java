/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.kauane.listajavaestrutura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author kauan
 */
public class ListaJavaEstrutura {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Principal:");
            System.out.println("1 - Exercicio 01");
            System.out.println("2 - Exercicio 02");
            System.out.println("3 - Exercicio 03");
            System.out.println("4 - Exercicio 04");
            System.out.println("5 - Exercicio 05");
            
            System.out.print("Escolha uma opção: ");
            int opcaoPrincipal = s.nextInt();
            
            switch (opcaoPrincipal) {
                case 1:
                    exercicio01(s);
                    break;
                case 2:
                    exercicio02(s);
                    break;
                case 3:
                    exercicio03(s);
                    break;
                case 4:
                    exercicio04(s);
                case 5:
                    exercicio05(s);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    public static void exercicio01(Scanner s){
        //EXERCICIO 01
//        
        Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        final int LIMITE_PACIENTES = 20; // Limite de pacientes na fila

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Chamar próximo paciente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    if (fila.size() < LIMITE_PACIENTES) {
                        System.out.print("Informe o nome do paciente: ");
                        String nome = scanner.nextLine();
                        fila.add(nome);
                        System.out.println("Paciente " + nome + " adicionado à fila.");
                    } else {
                        System.out.println("A fila está cheia. Não é possível adicionar mais pacientes.");
                    }
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        String proximoPaciente = fila.poll();
                        System.out.println("Próximo paciente: " + proximoPaciente);
                    } else {
                        System.out.println("A fila está vazia.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
        
     public static void exercicio02 (Scanner s){
        //EXERCICIO 02
        
         Queue<Cliente> filaPrioritaria = new LinkedList<>();
        Queue<Cliente> filaNormal = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int clientesAtendidos = 0; // Contador de clientes prioritários atendidos

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Chamar próximo cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe o ano de nascimento do cliente: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); 

                    Cliente cliente = new Cliente(filaPrioritaria.size() + filaNormal.size() + 1, nome, idade);
                    if (idade >= 65) {
                        filaPrioritaria.add(cliente);
                        System.out.println("Cliente " + nome + " adicionado à fila prioritária.");
                    } else {
                        filaNormal.add(cliente);
                        System.out.println("Cliente " + nome + " adicionado à fila normal.");
                    }
                    break;
                case 2:
                    if (!filaPrioritaria.isEmpty()) {
                        System.out.println("Próximo cliente prioritário: " + filaPrioritaria.poll().nome);
                        clientesAtendidos++;
                        if (clientesAtendidos % 2 == 0 && !filaNormal.isEmpty()) {
                            System.out.println("Chamando próximo cliente normal: " + filaNormal.poll().nome);
                        }
                    } else if (!filaNormal.isEmpty()) {
                        System.out.println("Próximo cliente normal: " + filaNormal.poll().nome);
                    } else {
                        System.out.println("As filas estão vazias.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
     }
     
      public static void exercicio03(Scanner s){
        //EXERCICIO 03
        
        Stack<Livro> pilhaDeLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Retirar livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Informe o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Informe o autor do livro: ");
                    String autor = scanner.nextLine();
                    Livro livro = new Livro(titulo, autor);
                    pilhaDeLivros.push(livro);
                    System.out.println("Livro adicionado à pilha.");
                    break;
                case 2:
                    if (!pilhaDeLivros.isEmpty()) {
                        System.out.println("Livros na pilha:");
                        for (Livro l : pilhaDeLivros) {
                            System.out.println(l);
                        }
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case 3:
                    if (!pilhaDeLivros.isEmpty()) {
                        Livro livroRemovido = pilhaDeLivros.pop();
                        System.out.println("Livro removido: " + livroRemovido);
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
      }
        
       public static void exercicio04(Scanner s){
        //EXERCICIO 04 
        
        Stack<Produto> pilhaDeProdutos = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos na pilha");
            System.out.println("3 - Retirar produto da pilha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Informe o código do produto: ");
                    int codProduto = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Informe a descrição do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Informe a data de entrada do produto: ");
                    String dataEntrada = scanner.nextLine();
                    System.out.print("Informe a UF de origem do produto: ");
                    String ufOrigem = scanner.nextLine();
                    System.out.print("Informe a UF de destino do produto: ");
                    String ufDestino = scanner.nextLine();

                    Produto produto = new Produto(codProduto, descricao, dataEntrada, ufOrigem, ufDestino);
                    pilhaDeProdutos.push(produto);
                    System.out.println("Produto adicionado à pilha.");
                    break;
                case 2:
                    if (!pilhaDeProdutos.isEmpty()) {
                        System.out.println("Produtos na pilha:");
                        for (Produto p : pilhaDeProdutos) {
                            System.out.println(p);
                        }
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case 3:
                    if (!pilhaDeProdutos.isEmpty()) {
                        Produto produtoRemovido = pilhaDeProdutos.pop();
                        System.out.println("Produto removido: " + produtoRemovido);
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
       }
        
        public static void exercicio05(Scanner s){
        //EXERCICIO 05
       
        List<Stack<Produto>> pilhas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            pilhas.add(new Stack<>());
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos nas pilhas");
            System.out.println("3 - Retirar produto de uma pilha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Informe o código do produto: ");
                    int codProduto = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Informe a descrição do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Informe a data de entrada do produto: ");
                    String dataEntrada = scanner.nextLine();
                    System.out.print("Informe a UF de origem do produto: ");
                    String ufOrigem = scanner.nextLine();
                    System.out.print("Informe a UF de destino do produto: ");
                    String ufDestino = scanner.nextLine();

                    Produto produto = new Produto(codProduto, descricao, dataEntrada, ufOrigem, ufDestino);
                    System.out.print("Informe o número da pilha (0 a 4): ");
                    int numPilha = scanner.nextInt();
                    pilhas.get(numPilha).push(produto);
                    System.out.println("Produto adicionado à pilha " + numPilha + ".");
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Produtos na pilha " + i + ":");
                        if (!pilhas.get(i).isEmpty()) {
                            for (Produto p : pilhas.get(i)) {
                                System.out.println(p);
                            }
                        } else {
                            System.out.println("A pilha está vazia.");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Informe o número da pilha (0 a 4): ");
                    int pilhaRetirada = scanner.nextInt();
                    if (!pilhas.get(pilhaRetirada).isEmpty()) {
                        Produto produtoRemovido = pilhas.get(pilhaRetirada).pop();
                        System.out.println("Produto removido da pilha " + pilhaRetirada + ": " + produtoRemovido);
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
