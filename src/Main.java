public class Main {
    public static void main(String[] args) {
        AVLNode<Integer> scottAge = new AVLNode<>(37);
        AVLNode<Integer> kaylaAge = new AVLNode<>(31);
        scottAge.setLeft(kaylaAge);
        AVLNode<Integer> janelleAge = new AVLNode<>(39);
        scottAge.setRight(janelleAge);
        AVLNode<Integer> JudyAge = new AVLNode<>(63);
        janelleAge.setRight(JudyAge);
        AVLNode<Integer> RandyAge = new AVLNode<>(70);
        JudyAge.setRight(RandyAge);
        AVLNode<Integer> JesseAge = new AVLNode<>(28);
        kaylaAge.setLeft(JesseAge);
        System.out.println("hey");


    }
}
