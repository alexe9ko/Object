public class Main {
    public static void main(String[] args) {
        Autor nikolaiGogol = new Autor("Николай", "Гоголь");
        Autor fetAfonasiy= new Autor("Фет", " Афонасий");
        Book viy = new Book( " Вий ", 1833, nikolaiGogol);
        Book vecher = new Book("Вечер",1855, fetAfonasiy);

        viy.setPublicationYear(1834);

        System.out.println(viy.getName());
        System.out.println(viy.getPublicationYear());

    }
}