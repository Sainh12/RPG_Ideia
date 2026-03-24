package Personagens;

public abstract class Status implements StatusCalc{
    private int life;
    private int streght;
    private int luck;
    private int aim;
    private int speed;
    private int mana;
    private int stamina;
    private int xp;
    private int lvl;
    private int a=0;
    public Status(int life, int streght, int luck, int aim, int speed, int mana, int stamina,int xp,int lvl) {
        this.life = life;
        this.streght = streght;
        this.luck = luck;
        this.aim = aim;
        this.speed = speed;
        this.mana = mana;
        this.stamina = stamina;
        this.xp=xp;
        this.lvl=lvl;
    }
    //=================gets and sets===================
    public int getXP(){
        return xp;
    }
    public int getLife() {
        return life;
    }
    public int getStreght() {
        return streght;
    }
    public int getLuck() {
        return luck;
    }
    public int getAim() {
        return aim;
    }
    public int getSpeed() {
        return speed;
    }
    public int getMana(){
        return mana;
    }
    public int getStamina(){
        return stamina;
    }
    public int getLvl(){
        return lvl;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public void setStreght(int streght) {
        this.streght = streght;
    }
    public void setLuck(int luck) {
        this.luck = luck;
    }
    public void setAim(int aim) {
        this.aim = aim;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public void setLvl(int lvl){
        this.lvl=lvl;
    }
    //==============================================================
    @Override
    public void levelUp(int xp){   
        if (xp%10==0){
            lvl+=1;
            a+=7;
        } 
    }
    public void upgrade(int a){
        int valorDisponivel = a;
        if (a>0){
            switch (StatusPoints){
                case LIFE->calcLife(1)a-=1:
                case STREGHT->{calcStreght(1);
                    a-=1;
                }:
                case AIM->{calcAim(1); a-=1;}:
                case STAMINA->{}:
        }
        }

    }
    @Override
    public int calcLife(int m){
        return life+m;
    }
    @Override
    public int calcAim(int m){
        return aim+m;
    }
    @Override
    public int calcSpeed(int m){
        return speed+m;
    }
    @Override
    public int calcStamina(int m){
        return stamina+m;
    }
    @Override
    public int calcStreght(int m){
        return streght+m;
    }
    @Override
    public int calcLuck(int m){
        return luck+m;
    }
    @Override
    public int calcMana(int m){
        return mana+m;
    }
}
