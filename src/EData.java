import java.util.HashMap;
import java.util.Map;

public class EData {
    public static int faith = 0; //Will probably be from 0-100, start at 30
    public static String characterName = "notSetYet";
    public static int currentYear; //Year when the game is at
    public static int money; //0-100

    public static boolean wait = false;

    static final int startYear = 1804; //Joseph smith is born (1 year before)

    static final int [] validYears = new int []{1805, 1820, 1823, 1827, 1829,1831,1833,1834,1836,1838,1839,1840,1842,1843,1844,1846};

    public static Map<Integer, String> hashMap = new HashMap<Integer, String>()
    {{
        put(1805, "Joseph Smith was born");
        put(1820, "God the Father and His Son, Jesus Christ, appeared to Joseph Smith.");
        put(1823, "The angel Moroni first appeared to Joseph Smith.");
        put(1827, "Joseph Smith received the golden plates.");
        put(1829, "Joseph Smith completed the Book of Mormon translation and the Aaronic and Melchizedek Priesthoods were restored.");
        put(1830, "The Book of Mormon was published and the Church was organized.");
        put(1831, "Kirtland, Ohio, became a gathering place for the Saints");
        put(1833, "The Lord designated Independence, Missouri, as the place for the city of Zion.");
        put(1835, "The Quorum of the Twelve Apostles and the First Quorum of the Seventy were organized.");
        put(1836, "Joseph Smith led the camp of Israel (Zion’s Camp) from Ohio to Missouri.");
        put(1838, "Joseph Smith and other Church leaders moved to Far West, Missouri and Joseph Smith was imprisoned in Liberty Jail.");
        put(1839, "The Saints in Missouri were forced to leave the state and Joseph Smith joined the Saints in Illinois and helped establish Nauvoo.");
        put(1840, "Joseph Smith began teaching about baptisms for the dead.");
        put(1842, "The Relief Society was organized and Joseph Smith presented the endowment ordinance in Nauvoo.");
        put(1843, "Revelation on eternal marriage and plural wives (D&C 132) was recorded.");
        put(1844, "Joseph and Hyrum Smith were assassinated and The Quorum of the Twelve Apostles was sustained to lead the Church.");
        put(1846, "Many Saints began their journey to the Salt Lake Valley and the Nauvoo Temple was dedicated.");
    }};

    public EData(){}

    public static void setUp(){
        faith = 30;
        money = 30;
        currentYear = startYear;
    }

    // Getter setters
}
