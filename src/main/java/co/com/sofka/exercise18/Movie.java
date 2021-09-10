package co.com.sofka.exercise18;



public class Movie {
    private static void completingSeries(Serie[] series){
        series[0] = new Serie("La casa de papel", 12, "Suspenso", "Álex Pina");
        series[1] = new Serie("Loki", 8, "Accion", "Michael Waldron");
        series[2] = new Serie("Castlevania", 10, "Fantasía", "Castlevania");
        series[3] = new Serie("Anne with an E", 15, "Drama"," Lucy Maud Montgomery, Moira Walley");
        series[4] = new Serie("Élite", 3, "Drama", " Carlos Montero, Darío Madrona");
    }
    private static void completingGames(VideoGame[] videojuegos){
        videojuegos[0] = new VideoGame("league of Legends", 60, "Fantasia", "Riot Games");
        videojuegos[1] = new VideoGame("Age Of Empires II: DE", 21, "Estrategia", "Microsoft");
        videojuegos[2] = new VideoGame("Warcraft III", 20, "Estrategia", "Blizzard");
        videojuegos[3] = new VideoGame("World Of Warcraft", 100, "Fantasia", "Blizzard");
        videojuegos[4] = new VideoGame("Call of Dutty",80,"Estrategia", "Infinity Ward,Treyarch");
    }

    private static void deliverSeries(Serie[] series){
        series[0].deliver();
        series[3].deliver();
        series[4].deliver();
    }

    private static void deliverGames(VideoGame[] videoGames){
        videoGames[1].deliver();
        videoGames[4].deliver();
    }

    private static void countSeriesDelivered(Serie[] series){
        int numberSeries = 0;
        for(Serie serie : series){
            if(serie.isDelivered()){
                numberSeries++;
                serie.returnMovie();
            }
        }
        System.out.println("Hay " + numberSeries + " series entregadas");
    }

    private static void countSeriesDelivered(VideoGame[] videoGames){
        int numberGames = 0;

        for(VideoGame game : videoGames){
            if(game.isDelivered()){
                numberGames++;
                game.returnMovie();
            }
        }
        System.out.println("Hay " + numberGames + " videojuegos entregados");
    }

    private static void seriesAndSeason(Serie[] series){
        Serie seriesAndSeason = new Serie("temporal", 0, "temporal", "temporal");

        for(int i = 0; i < series.length; i++){
            if(series[i].compareTo(seriesAndSeason)){
                seriesAndSeason = series[i];
            }
        }
        System.out.println("La serie con mas horas estimadas es: ");
        System.out.println(seriesAndSeason);
    }

    private static void hoursGame(VideoGame[] videojuegos){
        VideoGame hoursGame = new VideoGame("Temporal", 0);

        for(VideoGame juego : videojuegos){
            if(juego.compareTo(hoursGame)){
                hoursGame = juego;
            }
        }
        System.out.println("El video juego con mas horas estimadas es: "+ hoursGame);

    }

    public static void main(String[] args) {

        Serie[]     series      = new Serie[5];
        VideoGame[] videojuegos = new VideoGame[5];

        completingSeries(series);
        completingGames(videojuegos);

        deliverSeries(series);
        deliverGames(videojuegos);


        countSeriesDelivered(series);
        countSeriesDelivered(videojuegos);
        seriesAndSeason(series);
        hoursGame(videojuegos);
    }
}
