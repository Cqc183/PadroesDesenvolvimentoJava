/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notanegociacao;

/**
 *
 * @author 202208878202
 */
public class NotaNegociacao {
        private StringBuilder conteudo;
        
        public NotaNegociacao(){
            this.conteudo= new StringBuilder();
        }
        public void adicionarConteudo(String parte){
            conteudo.append(parte).append("\n");
        }
        public String getConteudo(){
            return conteudo.toString();
        }


}

