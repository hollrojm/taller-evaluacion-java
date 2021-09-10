package co.com.sofka.exercise18;



public class Movie {
    public static void completingSeries(Serie[] series){
        series[0] = new Serie("La casa de papel", 12, "Suspenso", "Álex Pina");
        series[1] = new Serie("Loki", 8, "Accion", "Michael Waldron");
        series[2] = new Serie("Castlevania", 10, "Fantasía", "Castlevania");
        series[3] = new Serie("Anne with an E", 15, "Drama"," Lucy Maud Montgomery, Moira Walley");
        series[4] = new Serie("Élite", 3, "Drama", " Carlos Montero, Darío Madrona");
    }
    public static void completingGames(Serie[] videojuegos){
        videojuegos[0] = new Serie("league of Legends", 60, "Fantasia", "Riot Games");
        videojuegos[1] = new Serie("Age Of Empires II: DE", 21, "Estrategia", "Microsoft");
        videojuegos[2] = new Serie("Warcraft III", 20, "Estrategia", "Blizzard");
        videojuegos[3] = new Serie("World Of Warcraft", 100, "Fantasia", "Blizzard");
        videojuegos[4] = new Serie("Call of Dutty",80,"Estrategia", "Infinity Ward,Treyarch");
    }

    public static void deliverSeries(Serie[] series){
        series[0].deliver();
        series[3].deliver();
        series[4].deliver();
    }

    public static void deliverGames(Serie[] videoGames){
        videoGames[1].deliver();
        videoGames[4].deliver();
    }

    public static void countSeriesDelivered(Serie[] series){
        int numberSeries = 0;
        for(Serie serie : series){
            if(serie.isDelivered()){
                numberSeries++;
                serie.returnMovie();
            }
        }
        System.out.println("Hay " + numberSeries + " series entregadas");
    }

    public static void countSeriesDelivered(VideoGame[] videoGames){
        int numberGames = 0;

        for(VideoGame game : videoGames){
            if(game.isDelivered()){
                numberGames++;
                game.returnMovie();
            }
        }
        System.out.println("Hay " + numberGames + " videojuegos entregados");
    }

    public static void seriesAndSeason(Serie[] series){
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


    }

    public void seriesAndSeason() {
    }

    public void hoursGame() {
    }
}
