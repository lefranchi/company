package br.com.lefranchi.company;

import org.apache.camel.dataformat.bindy.annotation.BindyConverter;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@FixedLengthRecord(length=1200, paddingChar = ' ')
public class Company {

    @DataField(pos = 1, length=1, trim = true)
    private int tipoRegistro;

    @DataField(pos = 2, length=1, trim = true)
    private String indicadorFormaEnvio;

    @DataField(pos = 3, length=1, trim = true)
    private String tipoAtualizacao;

    @Id
    @DataField(pos = 4, length=14, trim = true)
    private String cnpj;

    @DataField(pos = 5, length=1, trim = true)
    private int matrizFilial;

    @DataField(pos = 6, length=150, trim = true, align = "B")
    private String razaoSocial;

    @DataField(pos = 7, length=55, trim = true, align = "B")
    private String nomeFantasia;

    @DataField(pos = 8, length=2, trim = true)
    private int situacaoCadastral;

    @DataField(pos = 9, length=8, trim = true)
    @BindyConverter(CustomDateConverter.class)
    private Date dataSituacaoCadastral;

    @DataField(pos = 10, length=2, trim = true)
    private String motivoSituacaoCadastral;

    @DataField(pos = 11, length=55, trim = true)
    private String nomeCidadeExterior;

    @DataField(pos = 12, length=3, trim = true)
    private String codigoPais;

    @DataField(pos = 13, length=70, trim = true)
    private String nomePais;

    @DataField(pos = 14, length=4, trim = true)
    private int codigoNatuezaJuridica;

    @DataField(pos = 15, length=8, trim = true)
    @BindyConverter(CustomDateConverter.class)
    private Date dataInicioAtividade;

    @DataField(pos = 16, length=7, trim = true)
    private int cnaeFiscal;

    @DataField(pos = 17, length=20, trim = true, align = "B")
    private String tipoLogradouro;

    @DataField(pos = 18, length=60, trim = true, align = "B")
    private String logradouro;

    @DataField(pos = 19, length=6, trim = true, align = "B")
    private String numero;

    @DataField(pos = 20, length=156, trim = true, align = "B")
    private String complemento;

    @DataField(pos = 21, length=50, trim = true, align = "B")
    private String bairro;

    @DataField(pos = 22, length=8, trim = true)
    private String cep;

    @DataField(pos = 23, length=2, trim = true)
    private String uf;

    @DataField(pos = 24, length=4, trim = true)
    private String codigoMunicipio;

    @DataField(pos = 25, length=50, trim = true, align = "B")
    private String municipio;

    @DataField(pos = 26, length=4, trim = true)
    private String telefoneDdd1;

    @DataField(pos = 27, length=8, trim = true)
    private String telefone1;

    @DataField(pos = 28, length=4, trim = true)
    private String telefoneDdd2;

    @DataField(pos = 29, length=8, trim = true)
    private String telefone2;

    @DataField(pos = 32, length=4, trim = true, align = "B")
    private String faxDddNumero;

    @DataField(pos = 33, length=8, trim = true)
    private String fax;

    @DataField(pos = 34, length=115, trim = true, align = "B")
    private String correioEletronico;

    @DataField(pos = 35, length=2, trim = true, align = "B")
    private int qualificacaoResponsavel;

    @DataField(pos = 36, length=14, trim = true)
    private long capitalSocial;

    @DataField(pos = 37, length=2, trim = true)
    private String porteEmpresa;

    @DataField(pos = 38, length=1, trim = true)
    private String opcaoPeloSimples;

    @DataField(pos = 39, length=8, trim = true)
    @BindyConverter(CustomDateConverter.class)
    private Date dataOpacaoPeloSimples;

    @DataField(pos = 40, length=8, trim = true)
    @BindyConverter(CustomDateConverter.class)
    private Date dataExclusaoOpcaoPeloSimples;

    @DataField(pos = 41, length=1, trim = true)
    private String opcaoPeloMei;

    @DataField(pos = 42, length=23, trim = true)
    private String situacaoEspecial;

    @DataField(pos = 43, length=8, trim = true)
    @BindyConverter(CustomDateConverter.class)
    private Date dataSituacaoEspecial;

    @DataField(pos = 44, length=243, trim = true)
    private String filler;

    @DataField(pos = 45, length=1, trim = true)
    private String fimRegistro;

    public int getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(int tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getIndicadorFormaEnvio() {
        return indicadorFormaEnvio;
    }

    public void setIndicadorFormaEnvio(String indicadorFormaEnvio) {
        this.indicadorFormaEnvio = indicadorFormaEnvio;
    }

    public String getTipoAtualizacao() {
        return tipoAtualizacao;
    }

    public void setTipoAtualizacao(String tipoAtualizacao) {
        this.tipoAtualizacao = tipoAtualizacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getMatrizFilial() {
        return matrizFilial;
    }

    public void setMatrizFilial(int matrizFilial) {
        this.matrizFilial = matrizFilial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(int situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public Date getDataSituacaoCadastral() {
        return dataSituacaoCadastral;
    }

    public void setDataSituacaoCadastral(Date dataSituacaoCadastral) {
        this.dataSituacaoCadastral = dataSituacaoCadastral;
    }

    public String getMotivoSituacaoCadastral() {
        return motivoSituacaoCadastral;
    }

    public void setMotivoSituacaoCadastral(String motivoSituacaoCadastral) {
        this.motivoSituacaoCadastral = motivoSituacaoCadastral;
    }

    public String getNomeCidadeExterior() {
        return nomeCidadeExterior;
    }

    public void setNomeCidadeExterior(String nomeCidadeExterior) {
        this.nomeCidadeExterior = nomeCidadeExterior;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public int getCodigoNatuezaJuridica() {
        return codigoNatuezaJuridica;
    }

    public void setCodigoNatuezaJuridica(int codigoNatuezaJuridica) {
        this.codigoNatuezaJuridica = codigoNatuezaJuridica;
    }

    public Date getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    public void setDataInicioAtividade(Date dataInicioAtividade) {
        this.dataInicioAtividade = dataInicioAtividade;
    }

    public int getCnaeFiscal() {
        return cnaeFiscal;
    }

    public void setCnaeFiscal(int cnaeFiscal) {
        this.cnaeFiscal = cnaeFiscal;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefoneDdd1() {
        return telefoneDdd1;
    }

    public void setTelefoneDdd1(String telefoneDdd1) {
        this.telefoneDdd1 = telefoneDdd1;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefoneDdd2() {
        return telefoneDdd2;
    }

    public void setTelefoneDdd2(String telefoneDdd2) {
        this.telefoneDdd2 = telefoneDdd2;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getFaxDddNumero() {
        return faxDddNumero;
    }

    public void setFaxDddNumero(String faxDddNumero) {
        this.faxDddNumero = faxDddNumero;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCorreioEletronico() {
        return correioEletronico;
    }

    public void setCorreioEletronico(String correioEletronico) {
        this.correioEletronico = correioEletronico;
    }

    public int getQualificacaoResponsavel() {
        return qualificacaoResponsavel;
    }

    public void setQualificacaoResponsavel(int qualificacaoResponsavel) {
        this.qualificacaoResponsavel = qualificacaoResponsavel;
    }

    public long getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(long capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public String getPorteEmpresa() {
        return porteEmpresa;
    }

    public void setPorteEmpresa(String porteEmpresa) {
        this.porteEmpresa = porteEmpresa;
    }

    public String getOpcaoPeloSimples() {
        return opcaoPeloSimples;
    }

    public void setOpcaoPeloSimples(String opcaoPeloSimples) {
        this.opcaoPeloSimples = opcaoPeloSimples;
    }

    public Date getDataOpacaoPeloSimples() {
        return dataOpacaoPeloSimples;
    }

    public void setDataOpacaoPeloSimples(Date dataOpacaoPeloSimples) {
        this.dataOpacaoPeloSimples = dataOpacaoPeloSimples;
    }

    public Date getDataExclusaoOpcaoPeloSimples() {
        return dataExclusaoOpcaoPeloSimples;
    }

    public void setDataExclusaoOpcaoPeloSimples(Date dataExclusaoOpcaoPeloSimples) {
        this.dataExclusaoOpcaoPeloSimples = dataExclusaoOpcaoPeloSimples;
    }

    public String getOpcaoPeloMei() {
        return opcaoPeloMei;
    }

    public void setOpcaoPeloMei(String opcaoPeloMei) {
        this.opcaoPeloMei = opcaoPeloMei;
    }

    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public Date getDataSituacaoEspecial() {
        return dataSituacaoEspecial;
    }

    public void setDataSituacaoEspecial(Date dataSituacaoEspecial) {
        this.dataSituacaoEspecial = dataSituacaoEspecial;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public String getFimRegistro() {
        return fimRegistro;
    }

    public void setFimRegistro(String fimRegistro) {
        this.fimRegistro = fimRegistro;
    }
}
