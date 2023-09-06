import java.util.Scanner;

public class Main {

    public static void main(String[]args){
       PetShop petShop = new PetShop();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("escolha uma opçao");
            System.out.println("1- criar animal");
            System.out.println("2- listar");
            System.out.println("3- atualizar animal");
            System.out.println("4-excluir animal");

             int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("inserir o nome do dono ");
                String nome = scanner.next();

                System.out.println("inserir o contato");
                String contato = scanner.next();

                System.out.println("qual o nome do animal");
                String nome_animal = scanner.next();

                System.out.println("qual a especie");
                String especie = scanner.next();

                System.out.println("qual a raça");
                String raca = scanner.next();

                System.out.println("qual o serviço que voce deseja");
                String servico = scanner.next();

                System.out.println("valor total");
                double preco = scanner.nextDouble();


                petShop.criarAnimal(nome,contato,nome_animal,especie,raca,servico,preco);

                break;

            case 2:
                petShop.listarAnimais();
                break;

            case 3:
                System.out.println("digiter o id do animal novo");
                int idAtualizacao = scanner.nextInt();

                System.out.println("inserir novo nome");
                String nomeN = scanner.next();

                System.out.println("inserir novo contato");
                String contatoN = scanner.next();

                System.out.println("inserir a novo especie");
                String especieN = scanner.next();

                System.out.println("digiter novo nome do animal");
                String nome_animalN = scanner.next();

                System.out.println("digiter o novo valor");
                double precoN = scanner.nextDouble();

                System.out.println("digiter nova raça");
                String racaN= scanner.next();

                System.out.println("o novo serviço");
                String servicoN = scanner.next();

                petShop.atualizarAnimal(idAtualizacao,nomeN,contatoN,especieN,nome_animalN,precoN,racaN,servicoN);

                break;

            case 4:
                System.out.println("id do animal a ser excluido");
                int idEclusao = scanner.nextInt();

                petShop.excluirAnimal(idEclusao);
                break;
        }




        }

    }

}
