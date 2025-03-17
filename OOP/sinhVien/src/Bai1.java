import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] arr =  new SinhVien[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
            arr[i].chuanHoa();
            arr[i].chuanHoaNgaySinh();
        }
        Arrays.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGPA() != o2.getGPA()){
                    if (o1.getGPA() < o2.getGPA())
                        return 1;
                    else
                        return -1;
                }
                else
                    return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
            }
        });
        for (SinhVien x : arr)
            System.out.println(x);
    }
}
