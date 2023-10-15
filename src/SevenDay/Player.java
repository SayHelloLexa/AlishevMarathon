package SevenDay;

class Player {
    public int stamina;
    private final int max_stamina = 100;
    private final int min_stamina = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6) {
            countPlayers = 6;
        }
    }

    public void getStamina() {
        System.out.println(stamina);
    }

    public static void getCountPlayers() {
        System.out.println(countPlayers);
    }

    public void run() {
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        int difference = 6 - countPlayers;
        if (countPlayers < 6) {
            if (difference == 1){
                System.out.println("Команды неполные. На поле есть еще " + difference + " свободное место.");
            }
            if (difference == 2 || difference == 3 || difference == 4){
                System.out.println("Команды неполные. На поле есть еще " + difference + " свободных места.");
            }
        } else System.out.println("На поле нет свободных мест.");
    }

}
