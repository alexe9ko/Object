public class Main {
    public static void main(String[] args) {
        Author nikolaiGogol = new Author("Николай", "Гоголь");
        Author fetAfonasiy= new Author("Фет", " Афонасий");
        Book viy = new Book( " Вий ", 1833, nikolaiGogol);
        Book vecher = new Book("Вечер",1855, fetAfonasiy);

        viy.setPublicationYear(1834);

        System.out.println(viy.toString());
        System.out.println(viy.getAuthor().toString());
        System.out.println(vecher.toString());

    }
}