import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0){
            String[] song1Data = sc.nextLine().split(" ", 3);
            String[] song2Data = sc.nextLine().split(" ", 3);

            Song song1 = new Song(song1Data[0], song1Data[1], Integer.parseInt(song1Data[2]));
            Song song2 = new Song(song2Data[0], song2Data[1], Integer.parseInt(song2Data[2]));

            System.out.println(song1.equals(song2));
        }
    }
}