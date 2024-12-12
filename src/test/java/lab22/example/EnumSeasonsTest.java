package lab22.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumSeasonsTest {

    @Test
    void testSeasonTypeDescriptions() {
        assertEquals("Весна: Цветение", EnumSeasons.SeasonType.SPRING.getDescription());
        assertEquals("Лето: Пляжный отдых", EnumSeasons.SeasonType.SUMMER.getDescription());
        assertEquals("Осень: Золотое время", EnumSeasons.SeasonType.AUTUMN.getDescription());
        assertEquals("Зима: Снежные ландшафты", EnumSeasons.SeasonType.WINTER.getDescription());
    }

    @Test
    void testWinterSeasonOutput() {
        EnumSeasons.SeasonType currentSeason = EnumSeasons.SeasonType.WINTER;
        assertEquals("Зима: Снежные ландшафты", currentSeason.getDescription());
    }

    @Test
    void testToStringMethod() {
        assertEquals("Весна", EnumSeasons.SeasonType.SPRING.toString());
        assertEquals("Лето", EnumSeasons.SeasonType.SUMMER.toString());
        assertEquals("Осень", EnumSeasons.SeasonType.AUTUMN.toString());
        assertEquals("Зима", EnumSeasons.SeasonType.WINTER.toString());
    }

    @Test
    void testEnumValuesCount() {
        assertEquals(4, EnumSeasons.SeasonType.values().length, "The number of seasons should be 4.");
    }

    @Test
    void testAllSeasonsOutput() {
        StringBuilder descriptions = new StringBuilder();
        for (EnumSeasons.SeasonType season : EnumSeasons.SeasonType.values()) {
            descriptions.append(season.getDescription()).append("\n");
        }
        String expectedOutput = """
                Весна: Цветение
                Лето: Пляжный отдых
                Осень: Золотое время
                Зима: Снежные ландшафты
                """;
        assertEquals(expectedOutput.strip(), descriptions.toString().strip());
    }
}
