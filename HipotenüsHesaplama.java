public static void  main(String[] args){
    double a,b,c,ckare;

    Scanner input = new Scanner(System.in);
    System.out.print("a Kenarının uzunluğunu giriniz: ");
    a= input.nextDouble();
    System.out.print("b Kenarının uzunluğunu giriniz: ");
    b= input.nextDouble();
    ckare=Math.pow(a,2)+Math.pow(b,2);
     c=Math.sqrt(ckare);
    /*boolean kosul = fiyat>=0&&fiyat<=1000;
    boolean kosul1=fiyat<0;
    boolean karar =  kosul==true;
    kdvorani=karar ? 0.18:0.08;
    kdvlifiyat=fiyat*(1+kdvorani);
    kdvtutari=fiyat*kdvorani;*/
    System.out.println("a Kenarı: "+a );
    System.out.println("b Kenarı: "+b);
    System.out.println("Hipotenüs: "+c);
}

}
