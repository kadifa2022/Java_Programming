package day_InterviewQuestions.mentorsInterviewQuestions;

public class Fighter {

    public String name;
    public int health;
    public int damagePerAttack;

    public void setInfo(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        do {
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health -= fighter1.damagePerAttack;
                firstAttacker = fighter2.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                firstAttacker = fighter1.name;
            }
        }while (fighter1.health > 0 && fighter2.health > 0) ;
            if (fighter2.health > 0) {
                return fighter2.name + "wins";
            } else {
                return fighter1.name + "wins";
            }

        }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setInfo("Tom ", 10,2);
        Fighter fighter2 = new Fighter();
        fighter2.setInfo("Harry ", 5,4);

        System.out.println(declareWinner(fighter1,fighter2,"Tom"));
    }

    }