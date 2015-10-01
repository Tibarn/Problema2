package problema1;

/**
 * Created by Feliu on 30/09/2015.
 */
public class AppConstructors {
    public static void main(String[] args) {
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5, "Pino");

        for (Tree t : arboles)
            System.out.println(t);
    }
}