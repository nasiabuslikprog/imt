public class Main {
    public static void main(String[] args) {
        IndexService service = new IndexService();
        double bodyMassIndex = service.index(68.4, 1.63);
        System.out.println( "Индекс массы тела " + bodyMassIndex);

    }

}
