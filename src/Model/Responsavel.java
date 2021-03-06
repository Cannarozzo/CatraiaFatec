package Model;

import Model.dao.ResponsavelDAO;
import java.sql.SQLException;

public class Responsavel {

    private Integer id;
    private String email;
    private String nome;
    private String cpf;

    public Responsavel() {
    }

    ;
    public Responsavel(String email, String nome, String cpf) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Responsavel(Integer id, String email, String nome, String cpf) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Responsavel)) 
            return false;
        
        Responsavel responsavel = (Responsavel) obj;
        return this.id == responsavel.getId() && this.nome.equals(responsavel.getNome());

    }

    public static void main(String[] args) throws SQLException {
        Responsavel r1 = new Responsavel("felipe@gmail.com", "Felipe", "123");
        Responsavel r2 = new Responsavel("felipe@gmail.com", "Felipe", "123");

        System.out.println(r1.equals(r2));
        
        
        ResponsavelDAO rdao = new ResponsavelDAO();
        rdao.inserir(r1);

    }

}
