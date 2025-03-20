/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notanegociacao;

/**
 *
 * @author 202208878202
 */
public interface NotaNegociacaoBuilder {
    void buildCabecalho();
    void buildOperacoes();
    void buildSumario();
    NotaNegociacao getNota();
    
}
