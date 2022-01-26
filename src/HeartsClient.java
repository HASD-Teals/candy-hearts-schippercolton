public class HeartsClient {
    public static void main(String[] args) throws Exception {
        Heart Group1 = new Heart("red", 3, "Hi", 0, 5.0, false, 50);
        Heart Group2 = new Heart("teal", 5, "Love CS-A", 0, 4.5, false, 200);
        Heart Group3 = new Heart("green", 2, "Go Girl!", 0, 3.5, false, 75);

        Group2.adjStock(-25);
        Heart[] Store = {Group1, Group2, Group3};
        System.out.println( Heart.buyOut(Store) );
    }
}
