package homework12;

public class Book {
    private final String title;
    private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void printInfo() {
        System.out.println(
                "Название книги: " + title + ", " +
                "Год публикации: " + yearOfPublication + ", " +
                "Автор: " + author.getName() + " " + author.getSurname()
        );
    }
}


