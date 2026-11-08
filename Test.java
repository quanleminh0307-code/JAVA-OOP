package JavaCanBan;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] agrs) { 
        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(3, 4);
        PhanSo p3 = new PhanSo(-5,8);
        PhanSo p4 = new PhanSo(7,-8); 
        
        PhanSo[] a = {p1, p2, p3, p4};

        //hien thi cac phan so 
        System.out.println("Cac phan so vua nhap la: ");
        Stream.of(a).forEach(PhanSo::hienThi);
        System.out.println();

        // tinh tong cac phan so
        PhanSo tong = new PhanSo(0,1);
        tong = Stream.of(a).reduce(tong,(x,y) -> x.cong(y));
        System.out.println("Tong cac phan so la: ");
        tong.hienThi();


        // so lon nhat 
        PhanSo max = a[0]; 
        Stream.of(a).max((x, y) -> x.soSanh(y)).get();
        System.out.println("\nPhan so lon nhat la: ");
        max.hienThi();
    }
}
