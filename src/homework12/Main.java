package homework12;

public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author troepolsky = new Author("Гавриил", "Троепольский");

        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1969);
        Book whiteBimBlackEar = new Book("Белый Бим Черное ухо", troepolsky, 1971);

        masterAndMargarita.printInfo();

        whiteBimBlackEar.printInfo();

        masterAndMargarita.setYearOfPublication(1990);
        masterAndMargarita.printInfo();


    }
}
