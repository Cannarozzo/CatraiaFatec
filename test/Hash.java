
import Model.Responsavel;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC1
 */
public class Hash {

    public static void main(String... args) {
        Set<Responsavel> responsaveis = new HashSet();

        Responsavel r = new Responsavel(3, "Fernando", "4343");
        responsaveis.add(new Responsavel(1, "felipe", "123"));
        responsaveis.add(new Responsavel(2, "Matheus", "321"));
        responsaveis.add(r);

        System.out.println(responsaveis);

        for (Responsavel rr : responsaveis) {
            System.out.println(rr.getNome());
        }

    }

}
