package exerciciomanha;

import java.util.ArrayList;
import java.util.List;

public class Distribuidor {

    public static void main(String[] args) {

        Produto pereciveis = new Pereciveis("danup",12,1);
        Produto nPereciveis = new NaoPereciveis("biscoito",4.50,"consumivel");

        List<Produto> produtos = new ArrayList<>();

        produtos.add(pereciveis);
        produtos.add(nPereciveis);

        System.out.println(pereciveis.toString());
        System.out.println(pereciveis.calcularProduto(1));

        System.out.println(nPereciveis.toString());
        System.out.println(nPereciveis.calcularProduto(1));
    }


}
