import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class DayOne {

  /**
   * a + b = targetSum
   * targetSum - a = b
   */
  int findProductOfTwoEntriesWhereSumEquals(int targetSum, List<Integer> expenseReport) {
    Set<Integer> expenseReportSet = new HashSet<>(expenseReport);
    return expenseReport.stream()
        .filter(item -> expenseReportSet.contains(targetSum - item))
        .map(item -> item * targetSum - item)
        .findFirst().orElseThrow(() -> new RuntimeException("Could not find two entries which match conditions."));
  }

  /**
   * a + b + c = targetSum
   * targetSum - a = b + c
   */
  int findProductOfThreeEntriesWhereSumEquals(int targetSum, List<Integer> expenseReport) {

    for (Integer a : expenseReport) {
      int targetInnerSum = targetSum - a;

      Set<Integer> expenseReportSet = new HashSet<>(expenseReport);
      expenseReportSet.remove(a);
      Optional<Integer> bAndCProduct = expenseReport.stream()
          .filter(b -> expenseReportSet.contains(targetInnerSum - b))
          .map(b -> b * targetInnerSum - b)
          .findFirst();

      if (bAndCProduct.isPresent()) {
        return bAndCProduct.get() * a;
      }
    }
    throw new RuntimeException("Could not find three entries which match conditions.");
  }

  List<Integer> getInput() {
    return Arrays.asList(
        1150,
        1579,
        1361,
        1319,
        1201,
        1253,
        1806,
        1783,
        1164,
        1772,
        1920,
        1428,
        1918,
        245,
        1504,
        1952,
        1057,
        1977,
        704,
        1119,
        1971,
        1200,
        1650,
        1795,
        1877,
        1932,
        1811,
        1981,
        1803,
        1366,
        1580,
        1986,
        1976,
        1063,
        1895,
        1143,
        1991,
        1061,
        1855,
        1947,
        1134,
        1800,
        1898,
        1778,
        1964,
        1949,
        1103,
        1770,
        1321,
        2005,
        1758,
        1181,
        1140,
        1873,
        1946,
        1540,
        1909,
        1710,
        1705,
        1313,
        1196,
        1084,
        1870,
        1610,
        1708,
        1810,
        1133,
        1375,
        1264,
        1921,
        1624,
        41,
        1899,
        1226,
        1757,
        1978,
        1485,
        1385,
        1526,
        1653,
        1130,
        1223,
        1577,
        1912,
        1894,
        276,
        954,
        1269,
        1769,
        1924,
        93,
        1165,
        1812,
        1092,
        1402,
        1284,
        1903,
        1884,
        1581,
        1887,
        1963,
        1983,
        1233,
        1445,
        1974,
        1956,
        1691,
        1954,
        2000,
        1469,
        1875,
        955,
        1334,
        1116,
        1700,
        1818,
        1790,
        1704,
        1901,
        1072,
        1848,
        1990,
        1724,
        1719,
        1638,
        1311,
        1474,
        1837,
        1801,
        1929,
        1791,
        1317,
        1643,
        1632,
        1813,
        1488,
        1129,
        1998,
        1771,
        1793,
        1074,
        1826,
        1935,
        1462,
        1230,
        1797,
        1878,
        1751,
        1993,
        1437,
        1967,
        1844,
        1438,
        1969,
        1175,
        1823,
        1124,
        1922,
        154,
        936,
        1117,
        1145,
        1308,
        1320,
        1767,
        1850,
        1809,
        1350,
        1820,
        1082,
        1597,
        1913,
        1766,
        1701,
        1294,
        1556,
        2006,
        1480,
        1953,
        1104,
        1861,
        1966,
        1248,
        1671,
        1955,
        1863,
        1202,
        1356,
        1842,
        2010,
        1288,
        1067,
        1576,
        1295,
        1760,
        1888,
        1639,
        1282,
        1633,
        1619
    );
  }

}
