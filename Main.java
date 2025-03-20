/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 202208878202
 */
public class Main {
    public static void main(String[] args) {
        //Exportacao para PDF
        NotaNegociacaoBuilder pdfBuilder = new PdfNotaNegociacaoBuilder();
        NotaNegociacaoDirector director = new NotaNegociacaoDirector(pdfBuilder);
        director.contruirNota();
        NotaNegociacao notaPdf = pdfBuilder.getNota();
        System.out.println("Nota em PDF");
        System.out.println(notaPdf.getConteudo());
        
        //Exportação para XML
        NotaNegociacaoBuilder xmlBuilder = new XmlNotaNegociacaoBuilder();
        director = new NotaNegociacaoDirector(xmlBuilder);
        director.contruirNota();
        NotaNegociacao notaXml = xmlBuilder.getNota();
        System.out.println("Nota em XML:");
        System.out.println(notaXml.getConteudo());
        
        //Exportação para XLS
        NotaNegociacaoBuilder xlsBuilder = new XlsNotaNegociacaoBuilder();
        director = new NotaNegociacaoDirector(xlsBuilder);
        NotaNegociacao notaXls = xlsBuilder.getNota();
        System.out.println("Nota em XLS:");
        System.out.println(notaXls.getConteudo());
    }
    
}
