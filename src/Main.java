public class Main {
    public static void main(String[] args) {
        String regex = "[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}";
        System.out.println("1c1a3de4-c711-4e9c-bed2-e75fd69ce920".matches(regex));
        System.out.println("ad9e03f0-4bd4-46db-k79e-94ca17d4b74f".matches(regex));
        System.out.println("f087d9fc-xyz3-4a3f-93e0-bdb8d9b68268".matches(regex));
        System.out.println("92ae7a-94f-40c-a22-de4b42dd13".matches(regex));
        System.out.println("f66024c3_50f8_442e_9387_28746581f472".matches(regex));
    }
}
