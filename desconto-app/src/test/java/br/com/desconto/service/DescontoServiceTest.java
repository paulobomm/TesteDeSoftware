package br.com.desconto.service;

import junit.framework.TestCase;
import org.junit.Test;
import br.com.desconto.model.Produto;

import java.security.Provider;


public class DescontoServiceTest extends TestCase {

    @Test
    public void testCalcularDesconto(){
        DescontoService service = new DescontoService();

        Produto produto = new Produto("Notebook",2000.0);

        double precoFinal = service.calcularDesconto(produto,10.0);

        assertEquals(1800.0,precoFinal,0.01);
    }

    @Test
    public void testDescontoZero () {
        DescontoService service = new DescontoService();

        Produto produto = new Produto("Celular",1500.0);

        double precoFinal = service.calcularDesconto(produto, 0.0);

        assertEquals(1500.0,precoFinal,0.01);
    }

    @Test
    public void testDescontoInvalido(){
        DescontoService service = new DescontoService();

        Produto produto = new Produto("Fone de Ouvido", 299.0);

        try {
            service.calcularDesconto(produto, -10.0);

        }catch (IllegalArgumentException e){

            }
        }

}