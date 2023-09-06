import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Animal> animais = new ArrayList<>();
        private int nextid = 1;

        public void criarAnimal(String nome,String contato,String nome_animal,String especie,String raca,String servico,double preco){
            Animal animal = new Animal(nextid++,nome,contato,nome_animal,especie,raca,servico,preco);
            animais.add(animal);
            System.out.println("criado com sucesso");
            System.out.println("-------------------------------------------------------");
        }

        // listar animal
        public void listarAnimais(){
            for (Animal animal : animais){
                System.out.println("id: " + animal.getId() +"\n nome: " + animal.getNome()+ " \n contato: "+ animal.getcontato()  +"\n nome_animal: "+ animal.getNome_animal()+"\n especie: "+ animal.getEspecie()+"\n raca: "+animal.getRaca()+"\n servico: " + animal.getServico() + " \n preco: "+ animal.getPreco());
                System.out.println("-----------------------------------------------------------");
            }
        }



        //metodos para atualizar
        public void atualizarAnimal(int id, String nome,String contato, String especie,String nome_animal,double preco, String raca, String servico){
            for (Animal animal : animais){
                if (animal.getId() == id){
                    animal.setNome(nome);
                    animal.setContato(contato);
                    animal.setEspecie(especie);
                    animal.setNome_animal(nome_animal);
                    animal.setPreco(preco);
                    animal.setRaca(raca);
                    animal.setServico(servico);

                    System.out.println("animal atualizado com sucesso");
                       System.out.println("----------------------------------------------------");
                        return;
                }
            }
            System.out.println("animal nao encontrado");
            System.out.println("----------------------------------------------------------");
        }

        // metodo para excluir um animal
        public void excluirAnimal(int id){
            for (Animal animal : animais){
                if (animal.getId() == id){
                animais.remove(animal);
                System.out.println("animal excluido");
                System.out.println("-----------------------------------------------------");
                    return;
                    }
                }
            }


        }

