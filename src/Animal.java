public class Animal {

    private int id;
    private String nome;
    private String contato;
    private String raca;
    private String especie;
    private String nome_animal;
    private double preco;
    private String servico;

    public Animal(int id,String nome,String contato,String nome_animal,String especie,String raca,String servico,double preco){
        this.setId(id);
        this.setNome(nome);
        this.setContato(contato);
        this.setRaca(raca);
        this.setEspecie(especie);
        this.setNome_animal(nome_animal);
        this.setServico(servico);
        this.setPreco(preco);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcontato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }


}
