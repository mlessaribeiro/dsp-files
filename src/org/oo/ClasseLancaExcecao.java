package org.oo;

public class ClasseLancaExcecao {

    public void naoLancaExcecao() {
        System.out.println("nao lanca excecao");
    }
    
    public void lancaExcecao(String valor) throws Exception {
        if (valor == null)
            throw new Exception("Valor esta nulo");
        
        System.out.println("Tudo certo");
    }
    
}
