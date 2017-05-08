package Model;

public class Responsavel {

    private Integer id;
    private String nome;
    private String senha;

    public Responsavel() {
    }

    ;
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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Responsavel)) 
            return false;
        
        Responsavel responsavel = (Responsavel) obj;
        return this.id == responsavel.getId() && this.nome.equals(responsavel.getNome());

    }

    public static void main(String[] args) {
        Responsavel r1 = new Responsavel(1, "Felipe", "123");
        Responsavel r2 = new Responsavel(1, "Felipe", "123");

        System.out.println(r1.equals(r2));

    }

}
