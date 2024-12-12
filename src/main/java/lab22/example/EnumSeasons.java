package lab22.example;

public class EnumSeasons {
    public static void main(String[] args) {
        SeasonType currentSeason = SeasonType.WINTER;

        System.out.println("Сейчас зима, пошли играть в снежки");

        for (SeasonType season : SeasonType.values()) {
            System.out.println("Season: " + season + " - " + season.getDescription());
        }

        switch (currentSeason) {
            case SPRING, SUMMER, AUTUMN, WINTER ->
                    System.out.println("Currently: " + currentSeason.getDescription());
            default ->
                    System.out.println("Unknown season.");
        }
    }

    public enum SeasonType {
        SPRING("Весна", "Цветение"),
        SUMMER("Лето", "Пляжный отдых"),
        AUTUMN("Осень", "Золотое время"),
        WINTER("Зима", "Снежные ландшафты");

        private final String name;
        private final String description;

        SeasonType(String name, String description) {
            this.name = name;
            this.description = description;
        }

        /**
         * Отримати повний опис сезону.
         */
        public String getDescription() {
            return name + ": " + description;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
