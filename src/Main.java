public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int ticketCost = 35000; //руб
        int bonusMile = 20; //руб
        int totalBonusMiles = ticketCost / bonusMile;

        System.out.println("За попкупку этого билета Вам будут начислены бонусные мили в размере:" + totalBonusMiles);


    }
}
