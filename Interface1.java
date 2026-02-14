public class Interface1 {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,right,left,diagonal(All 4 Directions...)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class king implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(1 Place.....)");
    }
}
