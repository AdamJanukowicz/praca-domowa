package sample;

public class Internal {
    private String title;
    private String author;
    private int points;
    private int grade;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Internal(String title, String author, int points, int grade) {
        this.title = title;
        this.author = author;
        this.points = points;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Internal{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", points=" + points +
                ", grade=" + grade +
                '}';
    }
}
