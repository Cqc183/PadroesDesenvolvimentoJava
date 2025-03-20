/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notanegociacao;

/**
 *
 * @author 202208878202
 */
public class NotaNegociacaoDirector {
        private  NotaNegociacaoBuilder builder;
        
        public NotaNegociacaoDirector(NotaNegociacaoBuilder builder){
            this.builder = builder;
        }
        public void contruirNota(){
            builder.buildCabecalho();
            builder.buildOperacoes();
            builder.buildSumario();
        }

    
}
