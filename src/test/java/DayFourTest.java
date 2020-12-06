import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayFourTest {

  private static final List<String> INPUT = Arrays.asList(
      "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd",
      "byr:1937 iyr:2017 cid:147 hgt:183cm",
      "",
      "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884",
      "hcl:#cfa07d byr:1929",
      "",
      "hcl:#ae17e1 iyr:2013",
      "eyr:2024",
      "ecl:brn pid:760753108 byr:1931",
      "hgt:179cm",
      "",
      "hcl:#cfa07d eyr:2025 pid:166559648",
      "iyr:2011 ecl:brn hgt:59in",
      "",
      "eyr:1972 cid:100",
      "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926",
      "",
      "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980",
      "hcl:#623a2f"
  );

  private DayFour dayFour;

  @BeforeEach
  void setup() {
    dayFour = new DayFour();
  }

  @Test
  void getNumberOfPassportsWithRequiredFields() {
    assertEquals(4, dayFour.getNumberOfPassportsWithRequiredFields(INPUT, Set.of(
        "ecl",
        "pid",
        "eyr",
        "hcl",
        "byr",
        "iyr",
        "hgt"
    )));
  }

  @Test
  void getNumberOfValidPassports() {
    assertEquals(3, dayFour.getNumberOfValidPassports(INPUT, Set.of(
        "ecl",
        "pid",
        "eyr",
        "hcl",
        "byr",
        "iyr",
        "hgt"
    )));
  }

}