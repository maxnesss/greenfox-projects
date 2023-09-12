package carrier;

public class Aircraft {
    protected int ammo;
    protected String type;
    protected int baseDamage;
    protected int maxAmmo;
    protected boolean fillingPriority;
    Aircraft(){


    }

    public String getType(){
        return this.type;
    }

    public void refillAmmo(int ammoToRefill){
        if (ammoToRefill>=maxAmmo){
            ammo = maxAmmo;
        } else {
            ammo = ammoToRefill;
        }
    }
    public int fight(){
        int totalDamage = ammo*baseDamage;
        ammo =0;
        return totalDamage;
    }
    public String getStatus(){
        return "Type "+getType()+", Ammo: "+ammo+", Base Damage: "+baseDamage+", All Damage: "+countDamage();
    }
    public int countDamage(){

        return baseDamage*ammo;
    }


}
