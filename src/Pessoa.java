
import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;


    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
  // define objetos identicos para serem tratados como iguais
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
    }
   // o codigo de identificacao do objeto ira depender do nome e idade
    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
   // imprime a instancia da classe
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
