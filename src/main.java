public class main {
    public static void main(String[] args) {
    /*araba no1=new araba("mavi","klar",2012);
    araba no2=new araba("sari","klar",2018);
    araba no3=new araba("sari","klar",2019);
        System.out.println(no1.getRenk());*/
        insan adam1=new insan();//constructorda basta atama gettter setterda sonrdan atama
        adam1.setName("ali");
        adam1.setAge(15);
        System.out.println(adam1.getAge()+adam1.getName());
        /*araba yeni=new araba();
        yeni.setMarka("klar");
        yeni.setRenk("sari");
        System.out.println(yeni.getRenk()+yeni.getMarka());*/

        araba yeni1=new araba("sari","klar",2013);
        int üretim1=araba.arabasayisi;
        System.out.println("üretim="+üretim1);
        araba yeni2=new araba("sari","klar",2015);
        araba yeni3=new araba("mavi","klar2",2017);
        int üretim2=araba.arabasayisi;
        System.out.println("üretim="+üretim2);


    }
}
