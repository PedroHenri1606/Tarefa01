package Model;

import java.math.BigDecimal;

public class Materia extends Aluno{

    private String nomeMateria;
    private BigDecimal nota;

    public Materia() {
    }

    public Materia(String nomeMateria, BigDecimal nota) {
        this.nomeMateria = nomeMateria;
        this.nota = nota;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }
    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }
    public BigDecimal getNota() {
        return nota;
    }
    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
}
