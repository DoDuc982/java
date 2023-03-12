public class Magic {
    public static void main(String args[]){
        System.out.println(magic1(10, 20));
        System.out.println(magic2(1.5f, 2.8f, 6.7f));
        System.out.println(magic3("Do tuan duc", "cntt62a"));
    }

    /**
     * Ham tim so lon hon trong 2 so
     * @param iA la so nguyen thu nhat
     * @param iB la so nguyen thu hai
     * @return so nguyen lon hon trong 2 so
     */
    static int magic1(int iA, int iB){
        if (iA > iB)
            return iA;
        else return iB;
    }
    /**
     * Ham tinh trung binh con 3 so
     * @param fA la so thuc thu nhat
     * @param fB la so thuc thu nhat
     * @param fC la so thuc thu nhat
     * @return trung binh cong 3 so
     */
    static float magic2(float fA, float fB, float fC){
        return (fA + fB + fC)/3;
    }

    /**
     * Ham tra ve tong so ki tu cua 2 chuoi
     * @param sA la chuoi thu nhat
     * @param sB la chuoi thu hai
     * @return tong so ki tu cua 2 chuoi
     */
    static int magic3(String sA, String sB){
        return sA.length() + sB.length();
    }

}
