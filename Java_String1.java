public class Java_String1 {
    public static void shortestPath(String str) {
        // Center Of The Coordinates
        int x = 0, y = 0;
        int x1 = 0, y1 = 0;
        for (int i = 0; i < str.length(); i++) {
            // East
            if (str.charAt(i) == 'E') {
                x = x + 1;
                // West
            } else if (str.charAt(i) == 'W') {
                x = x - 1;
                // North
            } else if (str.charAt(i) == 'N') {
                y = y + 1;
                // South
            } else if (str.charAt(i) == 'S') {
                y = y - 1;
            }
        }
        int Result1 = (int) Math.pow(x - x1, 2);
        int Result2 = (int) Math.pow(y - y1, 2);

        double Shortest_Distance = Math.sqrt(Result1 + Result2);
        System.out.println(Shortest_Distance);

        // System.out.println(x + "," + y);
    }

    public static void main(String[] args) {
        String path = "NS";
        shortestPath(path);
    }
}
