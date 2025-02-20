package br.com.filme.screenmatch.principal;

import br.com.filme.screenmatch.modelos.Filme;
import br.com.filme.screenmatch.modelos.Serie;
import br.com.filme.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme = new Filme("Coraline", 2009);
        filme.avalia(9);
        var meuFilme = new Filme("Cume da Esperança", 2024);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Harry Potter e a Pedra Filosofal", 2005);
        outroFilme.avalia(8);
        Serie serie = new Serie("Braking Bad", 2008);

        /*
            Essa variável faz referência ao objeto
            Variáveis de referência não transformam como variáveis primitivas
        *  Filme f1 = meuFilme;
        * */

//        ArrayList<Filme> lista = new ArrayList<>();
        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(filme);
        lista.add(outroFilme);
        lista.add(serie);

//        for-each
//        Para cada variável item dentro da lista tipo ti'tulo...
        for(Titulo item :lista){
            System.out.println(item.getNome());
            if (item instanceof Filme f && f.getClassificacao() > 2){
                System.out.println("Classificação: "+ f.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Fernanda Torres");
        buscaPorArtista.add("Christopher Nolan");
        buscaPorArtista.add("Felipe Netto");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("\n Depois da ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("\n Lista de títulos ordenados: " + lista);
        //Comparator
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\n Lista de títulos ordenados por ano: "+ lista);

    }
}
