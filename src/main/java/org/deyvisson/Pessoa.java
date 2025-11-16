package org.deyvisson;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.panache.common.Parameters;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "pessoa")
public class Pessoa extends PanacheEntity {

    public String nome;
    public int anoNascimento;

    public static List<Pessoa> findByAnoNascimento(int anoNascimento){
        return find("anoNascimento = :ano", Parameters.with("ano", anoNascimento)).list();

    }
}
