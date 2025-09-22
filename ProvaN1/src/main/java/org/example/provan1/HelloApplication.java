package org.example.provan1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public class SistemaCadastro {
        private static ArrayList<Jogos> jogos = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int opcao;
            do {
                System.out.println("1 - Cadastrar Jogos");
                System.out.println("2 - Listar Jogos");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1 -> cadastrarJogo();
                    case 2 -> listarJogos();
                    case 0 -> System.out.println("Encerrando o sistema...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
        }

        private static void cadastrarJogo() {
            System.out.print("Digite o ID do Jogos: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o nome do jogo: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a categoria do jogo: ");
            String categoria = scanner.nextLine();

            Jogos jogo = new Jogos(id, nome, categoria);
            jogos.add(jogo);

            System.out.println("Jogos cadastrado com sucesso!");
        }

        private static void listarJogos() {
            if (jogos.isEmpty()) {
                System.out.println("Nenhum jogo cadastrado.");
            } else {
                System.out.println("\n Lista de jogo cadastrados:");
                Jogos[] Jogos;
                for (Jogos jogo : jogos) {
                    System.out.println(jogo);
                }
            }
        }
    }
}