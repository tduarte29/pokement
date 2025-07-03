package ifsp.bra.com.poke.regiao.pokement;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Regiao")
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_regiao")
    private Long id;

    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "geracao_introduzida", nullable = false)
    private Integer geracaoIntroduzida;

    
    public Regiao() {}


    public Regiao(String nome, String descricao, Integer geracaoIntroduzida) {
        this.nome = nome;
        this.descricao = descricao;
        this.geracaoIntroduzida = geracaoIntroduzida;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Integer getGeracaoIntroduzida() { return geracaoIntroduzida; }
    public void setGeracaoIntroduzida(Integer geracaoIntroduzida) { this.geracaoIntroduzida = geracaoIntroduzida; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Regiao)) return false;
        Regiao regiao = (Regiao) o;
        return Objects.equals(id, regiao.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Regiao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", geracaoIntroduzida=" + geracaoIntroduzida +
                '}';
    }
}
