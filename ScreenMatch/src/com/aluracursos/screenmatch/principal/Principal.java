package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Scarface", 1983);
        miPelicula.setDuracionEnMinutos(130);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evalua(10);
        miPelicula.evalua(10);

        miPelicula.muestraFichaTecnica();
        System.out.println("Total de votos: "+ miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de evaluación de la pelicula: " + miPelicula.calculaMedia());
        System.out.println("**********************");

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        otraPelicula.evalua(9);
        otraPelicula.evalua(8);
        otraPelicula.evalua(9.8);

        otraPelicula.muestraFichaTecnica();
        System.out.println("Total de votos: " + otraPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Média de evaluaciones de la película: " +otraPelicula.calculaMedia());
        System.out.println("**********************");

        Pelicula tercerPelicula = new Pelicula("La familia del futuro", 2007);
        tercerPelicula.setDuracionEnMinutos(95);

        tercerPelicula.evalua(10);
        tercerPelicula.evalua(10);
        tercerPelicula.evalua(7.8);
        tercerPelicula.evalua(6.8);

        tercerPelicula.muestraFichaTecnica();
        System.out.println("Total de votos: " + tercerPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Média de evaluaciones de la película: " + tercerPelicula.calculaMedia());
        System.out.println("**********************");

        Serie casaDragon = new Serie("La casa del dragón" , 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        // ARRAYLIST DE PELICULAS
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());

    }
}