
package JavaCanBan;

public class PhanSo {
    private int tuSo = 0;
    private int mauSo = 1;

    public PhanSo(int tu, int mau) {
        if (mau == 0) {
            System.out.println("Mau so khong hop le!"); 
            return; 
        }
        this.tuSo = tu;
        this.mauSo = mau; 
    } 

    public PhanSo(int tu) {
        this.tuSo = tu;
        this.mauSo = 1; 
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong hop le!"); 
            return; 
        }
        this.mauSo = mauSo;
    }

    public void hienThi() {
        System.out.printf("%d/%d \t", this.tuSo, this.mauSo);
    }

    public PhanSo cong(PhanSo b) {
        int tu = this.tuSo * b.mauSo + this.mauSo * b.tuSo; 
        int mau = this.mauSo * b.mauSo; 
        return new PhanSo(tu, mau).rutGon(); 
    }

    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a; 
        } else {
            return UCLN(b, a % b); 
        }
    }
    public PhanSo rutGon() {
        int ucln = UCLN(this.tuSo, this.mauSo); 
        int tu = this.tuSo / ucln; 
        int mau = this.mauSo / ucln; 
        return new PhanSo(tu, mau); 
    }

    public int soSanh(PhanSo b) {
        double giaTriA = (double)this.tuSo / this.mauSo; 
        double giaTriB = (double)b.tuSo / b.mauSo; 
        return Double.compare(giaTriA, giaTriB); 
    }
}
