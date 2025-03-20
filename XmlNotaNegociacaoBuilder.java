/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notanegociacao;

/**
 *
 * @author 202208878202
 */
public class XmlNotaNegociacaoBuilder implements NotaNegociacaoBuilder{
    private NotaNegociacao nota;
    public XmlNotaNegociacaoBuilder(){
        this.nota = new NotaNegociacao();
    }
    @Override
    public void buildCabecalho(){
        nota.adicionarConteudo("PDF: Cabeçalho da Nota");
    }
    @Override
    public void buildOperacoes(){
        nota.adicionarConteudo("PDF: Lista de operações");
    }
    @Override
    public void buildSumario(){
        nota.adicionarConteudo("PDF: Sumário com totais e taxas");
    }
    @Override
    public NotaNegociacao getNota(){
        return nota;
    }
}
