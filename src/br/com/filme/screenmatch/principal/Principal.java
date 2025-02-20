package br.com.filme.screenmatch.principal;

import br.com.filme.screenmatch.calculos.CalculadoraDeTempo;
import br.com.filme.screenmatch.calculos.FiltroRecomendacao;
import br.com.filme.screenmatch.modelos.Episodio;
import br.com.filme.screenmatch.modelos.Filme;
import br.com.filme.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Tipo por referência
        Filme filme = new Filme("Coraline", 2009);
        //filme.setNome("Coraline");
        //filme.setAnoDeLancamento(2009);
        filme.setDuracaoEmMinutos(187);
        System.out.println("Duração em minutos de coraline: " + filme.getDuracaoEmMinutos());

        filme.exibeFichaTecnica();

        filme.avalia(10);
        filme.avalia(9);
        filme.avalia(10);

        System.out.println(filme.obterMedia());
        System.out.println( "Total de avaliações: "+filme.getTotalDeAvaliacoes());

        Serie serie = new Serie("Braking Bad", 2008);
//        serie.setNome("Braking Bad");
//        serie.setAnoDeLancamento(2008);
        serie.exibeFichaTecnica();
        serie.setTemporadas(5);
        serie.setEpisodioPorTemporada(20);
        serie.setMinutosPorEpisodio(48);
        System.out.println("Duração para maratonar Braking Bad: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Harry Potter e a Pedra Filosofal", 2005);
        /*
        outroFilme .setNome("Harry Potter e a Pedra Filosofal");
        outroFilme .setAnoDeLancamento(2005);
        */
        outroFilme .setDuracaoEmMinutos(152);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(serie);
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);

//     var =   Inferência do tipo declarado
        var meuFilme = new Filme("Cume da Esperança", 2024);
        //meuFilme.setNome("Cume da Esperança");
        //meuFilme.setDuracaoEmMinutos(220);
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.avalia(10);

//        Array list
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        meuFilme.toString();



    }
}
