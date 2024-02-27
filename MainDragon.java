public class MainDragon {
    public static void main(String[] args) {
        // Membuat objek Dragon13
        Dragon13 dragon = new Dragon13(5, 5, 10, 10);

        // Menampilkan posisi awal
        dragon.printPosition();

        // Melakukan beberapa pergerakan
        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();

        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();

        // Menimbulkan collision
        dragon.moveLeft();
        dragon.printPosition();
    }
}
