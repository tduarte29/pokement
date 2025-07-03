package ifsp.bra.com.poke.regiao.pokement;

public class RegiaoDTO {
    private Long id;
    private String nome;
    private String descricao;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public static RegiaoDTO toDTO(Regiao regiao) {
        if (regiao == null) return null;
        RegiaoDTO dto = new RegiaoDTO();
        dto.setId(regiao.getId());
        dto.setNome(regiao.getNome());
        dto.setDescricao(regiao.getDescricao());
        return dto;
    }
}
