package org.com.biomob.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Acao.
 */
@Entity
@Table(name = "acao")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Acao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "data_criacao")
    private Instant dataCriacao;

    @Column(name = "usuario_criacao_acao")
    private String usuarioCriacaoAcao;

    @Column(name = "pendente")
    private Boolean pendente;

    @Column(name = "data_execucao_acao")
    private LocalDate dataExecucaoAcao;

    @Column(name = "ativa")
    private Boolean ativa;

    @Lob
    @Column(name = "foto")
    private byte[] foto;

    @Column(name = "foto_content_type")
    private String fotoContentType;

    @Column(name = "observacoes")
    private String observacoes;

    @JsonIgnoreProperties(value = { "nome", "descricao", "acao" }, allowSetters = true)
    @OneToOne
    @JoinColumn(unique = true)
    private CadastroDoacao cadastroDoacao;

    @JsonIgnoreProperties(value = { "user", "acao" }, allowSetters = true)
    @OneToOne
    @JoinColumn(unique = true)
    private CadastroUser cadastroUser;

    @ManyToOne
    @JsonIgnoreProperties(value = { "nome", "descricao" }, allowSetters = true)
    private Solicitacao solicitante;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Acao id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDataCriacao() {
        return this.dataCriacao;
    }

    public Acao dataCriacao(Instant dataCriacao) {
        this.setDataCriacao(dataCriacao);
        return this;
    }

    public void setDataCriacao(Instant dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getUsuarioCriacaoAcao() {
        return this.usuarioCriacaoAcao;
    }

    public Acao usuarioCriacaoAcao(String usuarioCriacaoAcao) {
        this.setUsuarioCriacaoAcao(usuarioCriacaoAcao);
        return this;
    }

    public void setUsuarioCriacaoAcao(String usuarioCriacaoAcao) {
        this.usuarioCriacaoAcao = usuarioCriacaoAcao;
    }

    public Boolean getPendente() {
        return this.pendente;
    }

    public Acao pendente(Boolean pendente) {
        this.setPendente(pendente);
        return this;
    }

    public void setPendente(Boolean pendente) {
        this.pendente = pendente;
    }

    public LocalDate getDataExecucaoAcao() {
        return this.dataExecucaoAcao;
    }

    public Acao dataExecucaoAcao(LocalDate dataExecucaoAcao) {
        this.setDataExecucaoAcao(dataExecucaoAcao);
        return this;
    }

    public void setDataExecucaoAcao(LocalDate dataExecucaoAcao) {
        this.dataExecucaoAcao = dataExecucaoAcao;
    }

    public Boolean getAtiva() {
        return this.ativa;
    }

    public Acao ativa(Boolean ativa) {
        this.setAtiva(ativa);
        return this;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public byte[] getFoto() {
        return this.foto;
    }

    public Acao foto(byte[] foto) {
        this.setFoto(foto);
        return this;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getFotoContentType() {
        return this.fotoContentType;
    }

    public Acao fotoContentType(String fotoContentType) {
        this.fotoContentType = fotoContentType;
        return this;
    }

    public void setFotoContentType(String fotoContentType) {
        this.fotoContentType = fotoContentType;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public Acao observacoes(String observacoes) {
        this.setObservacoes(observacoes);
        return this;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public CadastroDoacao getCadastroDoacao() {
        return this.cadastroDoacao;
    }

    public void setCadastroDoacao(CadastroDoacao cadastroDoacao) {
        this.cadastroDoacao = cadastroDoacao;
    }

    public Acao cadastroDoacao(CadastroDoacao cadastroDoacao) {
        this.setCadastroDoacao(cadastroDoacao);
        return this;
    }

    public CadastroUser getCadastroUser() {
        return this.cadastroUser;
    }

    public void setCadastroUser(CadastroUser cadastroUser) {
        this.cadastroUser = cadastroUser;
    }

    public Acao cadastroUser(CadastroUser cadastroUser) {
        this.setCadastroUser(cadastroUser);
        return this;
    }

    public Solicitacao getSolicitante() {
        return this.solicitante;
    }

    public void setSolicitante(Solicitacao solicitacao) {
        this.solicitante = solicitacao;
    }

    public Acao solicitante(Solicitacao solicitacao) {
        this.setSolicitante(solicitacao);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Acao)) {
            return false;
        }
        return id != null && id.equals(((Acao) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Acao{" +
            "id=" + getId() +
            ", dataCriacao='" + getDataCriacao() + "'" +
            ", usuarioCriacaoAcao='" + getUsuarioCriacaoAcao() + "'" +
            ", pendente='" + getPendente() + "'" +
            ", dataExecucaoAcao='" + getDataExecucaoAcao() + "'" +
            ", ativa='" + getAtiva() + "'" +
            ", foto='" + getFoto() + "'" +
            ", fotoContentType='" + getFotoContentType() + "'" +
            ", observacoes='" + getObservacoes() + "'" +
            "}";
    }
}
