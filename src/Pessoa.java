public class Pessoa {
    public String nome;
    public String endereco;
    public String telefone;
    public String dataNascimento;
    public String CEP;
    public void mostrarDados(){
        System.out.println("Dados: "+ nome + "\n" + endereco +
                "\n" +telefone + "\n" +dataNascimento +
                "\n" + CEP);
    }

}
