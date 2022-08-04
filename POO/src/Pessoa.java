public class Pessoa {
    //Atributos da Classe Pessoa
    private String nome;
    private int CPF;
    private String email;

    //Geters e Seters da Classe

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cpf) {
        if (Validar_CPF(cpf))
            CPF = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private boolean Validar_CPF(int cpf) {
        //API com o sistema da Receita Federal
        return true;
    }
}
