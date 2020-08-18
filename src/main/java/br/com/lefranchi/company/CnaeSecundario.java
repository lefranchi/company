package br.com.lefranchi.company;


import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@FixedLengthRecord(length=1200, paddingChar = ' ')
public class CnaeSecundario {

    @DataField(pos = 1, length=1, trim = true)
    private int tipoRegistro;

    @DataField(pos = 2, length=1, trim = true)
    private int idicadorFormaEnvio;

    @DataField(pos = 3, length=1, trim = true)
    private int tipoAtualizacao;

    @Id
    @DataField(pos = 4, length=14, trim = true)
    private String cnpj;

    @DataField(pos = 5, length=7, trim = true)
    private int cnaeSecundaria;

    @DataField(pos = 6, length=489, trim = true)
    private String filler;

    @DataField(pos = 7, length=1, trim = true)
    private String fimRegistro;

    public int getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(int tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public int getIdicadorFormaEnvio() {
        return idicadorFormaEnvio;
    }

    public void setIdicadorFormaEnvio(int idicadorFormaEnvio) {
        this.idicadorFormaEnvio = idicadorFormaEnvio;
    }

    public int getTipoAtualizacao() {
        return tipoAtualizacao;
    }

    public void setTipoAtualizacao(int tipoAtualizacao) {
        this.tipoAtualizacao = tipoAtualizacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getCnaeSecundaria() {
        return cnaeSecundaria;
    }

    public void setCnaeSecundaria(int cnaeSecundaria) {
        this.cnaeSecundaria = cnaeSecundaria;
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
