package co.com.sofka.exercise18;

public class VideoGame implements Deliver {

    private static int DEFAULT_HOURS = 10;
    private static boolean DEFAULT_SUBMITTED = false;
    private String tittle;
    private int estimatedHours;
    private boolean submitted;
    private String genreGame;
    private String company;


    public VideoGame(String tittle, int hours, String genreGame, String company){
        this(tittle, hours);
        this.genreGame = genreGame;
        this.company = company;
    }

    public VideoGame(String tittle, int hours){
        this();
        this.tittle = tittle;
        this.estimatedHours = hours;
    }

    public VideoGame(){
        this.tittle = "";
        this.estimatedHours = DEFAULT_HOURS;
        this.submitted = DEFAULT_SUBMITTED;
        this.genreGame = "";
        this.company = "";
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getGenreGame() {
        return genreGame;
    }

    public void setGenreGame(String genreGame) {
        this.genreGame = genreGame;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return " Titulo del video juego: '" + tittle + '\'' +
                "\n Horas Estimadas: " + estimatedHours +
                "\n Entregado: " + submitted +
                "\n Genero: '" + genreGame + '\'' +
                ",\n Compañia: '" + company + '\'';
    }

    @Override
    public void deliver() {
        this.submitted = true;
    }
    @Override
    public void returnMovie() {
        this.submitted = false;
    }

    @Override
    public boolean isDelivered() {
        return submitted;
    }

    @Override
    public boolean compareTo(Object a) {
        boolean returnValue;

        if(this.estimatedHours > ((VideoGame)a).estimatedHours){
            returnValue = true;
        }else{
            returnValue = false;
        }
        return returnValue;
    }
}


