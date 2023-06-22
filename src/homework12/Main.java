package homework12;

public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author troepolsky = new Author("Гавриил", "Троепольский");

        System.out.println(bulgakov.toString());
        System.out.println(troepolsky.toString());

        Book masterAndMargarita = new Book("Мастер и Маргарита", bulgakov, 1969);
        Book whiteBimBlackEar = new Book("Белый Бим Черное ухо", troepolsky, 1971);

        masterAndMargarita.setYearOfPublication(1970);
        System.out.println(masterAndMargarita.getYearOfPublication());

        System.out.println(masterAndMargarita.equals(whiteBimBlackEar));
    }
}
