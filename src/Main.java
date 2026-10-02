
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Sergio", 27);
        Pessoa pessoa2 = new Pessoa("Juliano", 30);
        Pessoa pessoa3 = new Pessoa("Sergio", 27);
        Pessoa pessoa4 = new Pessoa("Fabio", 31);
        Pessoa pessoa5 = new Pessoa("Juliano", 30);



        System.out.println(pessoa1.equals(pessoa3)); // mostrando o metodo equals na classe pessoa pegando.
                                                    // o cadastro duplicado nao esta criando outro hashcode.


        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);



        for (Pessoa pessoa: pessoas){

            System.out.println(pessoa);
        }



    }
}