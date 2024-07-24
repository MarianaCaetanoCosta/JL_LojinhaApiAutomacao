package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {

    //Retorna sempre um produto variando apenas o valor
    public static ProdutoPojo criarProdutoComumComOValorIgualA(double valor){
        //Criar objeto produto e setar os atributos
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Playstation 5");
        produto.setProdutoValor(valor);

        //Criar lista de cores
        List<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("rosa");

        //Adicionar cor ao produto
        produto.setProdutoCores(cores);

        produto.setProdutoUrlMock("");

        //Criar lista de componentes
        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Controle");
        componente.setComponenteQuantidade(1);

        //Adicionar a lista de componentes
        componentes.add(componente);

        //Adicionar componente ao produto
        produto.setComponentes(componentes);


        //Criar Segundo componente
        ComponentePojo segundoComponente = new ComponentePojo();
        segundoComponente.setComponenteNome("Memory card");
        segundoComponente.setComponenteQuantidade(2);
        //Adicionar a lista de componentes
        componentes.add(segundoComponente);

        return produto;
    }
}
