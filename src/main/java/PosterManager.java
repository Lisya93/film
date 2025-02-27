public class PosterManager {
    private String[] movies = new String[0]; // менеджер не содержит фильмы после создания
    private int limit; // значение количества фильмов по умолчанию

    public PosterManager(int limit) { // конструктор с изменяемым количеством фильмов
        this.limit = limit;
    }

    public PosterManager() { // конструктор со значением количества фильмов по умолчанию
        this.limit = 10;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}