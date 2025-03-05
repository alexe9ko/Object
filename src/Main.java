public class Main {
    public static void main(String[] args) {
        Author nikolaiGogol = new Author("Николай", "Гоголь");

        Author fetAfonasiy = new Author("Фет", " Афонасий");

        Book viy = new Book( " Вий ", 1833, nikolaiGogol);
        Book vecher = new Book("Вечер",1855, fetAfonasiy);

        System.out.println(nikolaiGogol.hashCode());
        System.out.println(fetAfonasiy.hashCode());

        System.out.println(nikolaiGogol.equals(fetAfonasiy));

        viy.setPublicationYear(1834);

        System.out.println(viy.toString());
        System.out.println(viy.getAuthor().toString());
        System.out.println(vecher.toString());

    }
}