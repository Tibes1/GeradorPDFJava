package br.com.blsoft.relatoriospdf;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.PrimeiroPDF;
import br.com.blsoft.relatoriospdf.relatorios.Relatorio;
import br.com.blsoft.relatoriospdf.relatorios.RelatorioPDF;
import br.com.blsoft.relatoriospdf.vendas.Produto;
import br.com.blsoft.relatoriospdf.vendas.Venda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Venda venda = new Venda("Cliente1", new ArrayList<Produto>());
        venda.addProdutoAoCarrinho(new Produto("Produto1", 2, 7));
        venda.addProdutoAoCarrinho(new Produto("Produto2", 1, 3));
        venda.addProdutoAoCarrinho(new Produto("Produto3", 2, 5));

        Relatorio relatorioPdf = new RelatorioPDF(venda);
        relatorioPdf.gerarCabecalho();
        relatorioPdf.gerarCorpo();
        relatorioPdf.gerarRodape();
        relatorioPdf.gerarRecibo();
        relatorioPdf.imprimir();
    }
}
