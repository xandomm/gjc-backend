package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
public class entity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(nullable = false)
   private String nome;
   @Column(nullable = false)
   private String cpf;
   @Column(nullable = false)
   private String dataNascimento;
   public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
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
public String getDataNascimento() {
    return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
}
public String getCelular() {
    return celular;
}
public void setCelular(String celular) {
    this.celular = celular;
}
public String getTelFixo() {
    return telFixo;
}
public void setTelFixo(String telFixo) {
    this.telFixo = telFixo;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public Boolean getAlerts() {
    return alerts;
}
public void setAlerts(Boolean alerts) {
    this.alerts = alerts;
}
public String getUrlLogo() {
    return urlLogo;
}
public void setUrlLogo(String urlLogo) {
    this.urlLogo = urlLogo;
}
public String getCep() {
    return cep;
}
public void setCep(String cep) {
    this.cep = cep;
}
public String getRua() {
    return rua;
}
public void setRua(String rua) {
    this.rua = rua;
}
public Number getNumero() {
    return numero;
}
public void setNumero(Number numero) {
    this.numero = numero;
}
private String celular;
   private String telFixo;
   private String email;
   private Boolean alerts;
   private String urlLogo;
   private String cep;
   private String rua;
   private Number numero;
   private String cidade;
   private String estado;
   private String bairro;
public String getCidade() {
    return cidade;
}
public void setCidade(String cidade) {
    this.cidade = cidade;
}
public String getEstado() {
    return estado;
}
public void setEstado(String estado) {
    this.estado = estado;
}
public String getBairro() {
    return bairro;
}
public void setBairro(String bairro) {
    this.bairro = bairro;
}
}
