package Model;

public class Responsavel {
    private Integer id;
    private String nome;
    private String senha;

    public Responsavel(){};
    public Responsavel(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
      public Responsavel(Integer id, String nome, String senha) {
          this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

}
