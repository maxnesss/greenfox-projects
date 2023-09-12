package carrier;

public class Main {
    public static void main(String[] args) {
        Aircraft f16 = new F16();
        f16.refillAmmo(40);
        F35 jednicka = new F35();
        F35 dvojka = new F35();
        F35 trojka = new F35();
        F35 ctyrka = new F35();
        F35 petka = new F35();


        Carrier ussLincoln = new Carrier(500,1000);

        ussLincoln.add(jednicka);
        ussLincoln.add(dvojka);

        ussLincoln.fill();
        ussLincoln.getStatus();

        Carrier ussBismark = new Carrier(400,800);
        ussBismark.add(trojka);
        ussBismark.add(ctyrka);
        ussBismark.add(petka);
        ussBismark.fill();

        ussLincoln.fight(ussLincoln);
        ussLincoln.getStatus();







    }




}
