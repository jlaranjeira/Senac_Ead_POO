public class Principal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Pessoa P = new Pessoa();

        P.setNome("Albert");
        P.setCPF(1112223334);
        P.setEmail("albert@senac.com.br");

        System.out.println("O CPF inserido foi: " + P.getCPF());
        System.out.println("O nome inserido foi: " + P.getNome());
        System.out.println("O email inserido foi: " + P.getEmail());
    }
    }

