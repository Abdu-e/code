public class OOP1
{
    public static void main(String[] args)
    {
        System.out.println("Bitch!");
        
        Staff x = new Staff();
        x.setn("Abdu-Raziq");
        x.sets("Esau");
        x.setag("21");
        x.setr("coloured");

        System.out.println(x.getn());
        System.out.println(x.gets());
        System.out.println(x.getag());
        System.out.println(x.getr());
    }
}