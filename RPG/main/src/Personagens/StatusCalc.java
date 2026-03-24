package Personagens;
public interface StatusCalc {
    public int calcLife(int m);
    public int calcStreght(int m);
    public int calcLuck(int m);
    public int calcAim(int m);
    public int calcSpeed(int m);
    public int calcMana(int m);
    public int calcStamina(int m);
    public void levelUp(int xp);
}
