import java.util.Scanner;

public class EventGenerator {
    EnvironmentData data = new EnvironmentData();
    Interactions I = new Interactions();



    public void reelingInTheYears() {
        String info;
        I.out("What year did the following event occur");
        switch (data.getCurrentYear()) {
            case 1805:
                info = "1805: Joseph Smith was born";
                break;
            case 1820:
                info = "1820: God the Father and His Son, Jesus Christ, appeared to Joseph Smith.\n";
                break;
            case 1823:
                info = "1823: The angel Moroni first appeared to Joseph Smith.";
                break;
            case 1827:
                info = "1827: Joseph Smith received the golden plates.";
                break;
            case 1829:
                info = "1829: Joseph Smith completed the Book of Mormon translation and the Aaronic and Melchizedek Priesthoods were restored.";
                break;
            case 1830:
                info = "1830: The Book of Mormon was published and the Church was organized.";
                break;
            case 1831:
                info = "1831: Kirtland, Ohio, became a gathering place for the Saints";
                break;
            case 1833:
                info = "1833: The Lord designated Independence, Missouri, as the place for the city of Zion.";
                break;
            case 1834:
                info = "1834: Joseph Smith led the camp of Israel (Zion’s Camp) from Ohio to Missouri.";
                break;
            case 1835:
                info = "1835: The Quorum of the Twelve Apostles and the First Quorum of the Seventy were organized.";
                break;
            case 1836:
                info = "1836: The Kirtland Temple was dedicated and priesthood keys were committed to Joseph Smith and Oliver Cowdery in the Kirtland Temple.";
                break;
            case 1838:
                info = "1838: Joseph Smith and other Church leaders moved to Far West, Missouri and Joseph Smith was imprisoned in Liberty Jail.";
                break;
            case 1839:
                info = "1839: The Saints in Missouri were forced to leave the state and Joseph Smith joined the Saints in Illinois and helped establish Nauvoo.";
                break;
            case 1840:
                info = "1840: Joseph Smith began teaching about baptisms for the dead.";
                break;
            case 1842:
                info = "1842: The Relief Society was organized and Joseph Smith presented the endowment ordinance in Nauvoo.";
                break;
            case 1843:
                info = "1843: Revelation on eternal marriage and plural wives (D&C 132) was recorded.";
                break;
            case 1844:
                info = "1844: Joseph and Hyrum Smith were assassinated and The Quorum of the Twelve Apostles was sustained to lead the Church.";
                break;
            case 1846:
                info = "1846: Many Saints began their journey to the Salt Lake Valley and the Nauvoo Temple was dedicated.";
                break;

            default:
                //Not a year that I manage so we re-run it
                info = "No Info";
                if (data.getCurrentYear() > 1846) {
                    info = "You have finished the game!";
                } else {
                    data.incrementCurrentYear();
                    reelingInTheYears();
                }
                break;
        }
    }

    public void generalEvent(){

    }
    public void testEvent() {
        String info = "Sorry, forgot to set it for this year";

        switch (data.getCurrentYear()) {
            case 1805:
                info = "Joseph Smith was born";
                break;
            case 1820:
                info = "God the Father and His Son, Jesus Christ, appeared to Joseph Smith.\n";
                break;
            case 1823:
                info = "The angel Moroni first appeared to Joseph Smith.";
                break;
            case 1827:
                info = "Joseph Smith received the golden plates.";
                break;
            case 1829:
                info = "Joseph Smith completed the Book of Mormon translation and the Aaronic and Melchizedek Priesthoods were restored.";
                break;
            case 1830:
                info = "The Book of Mormon was published and the Church was organized.";
                break;
            case 1831:
                info = "Kirtland, Ohio, became a gathering place for the Saints";
                break;
            case 1833:
                info = "The Lord designated Independence, Missouri, as the place for the city of Zion.";
                break;
            case 1834:
                info = "Joseph Smith led the camp of Israel (Zion’s Camp) from Ohio to Missouri.";
                break;
            case 1835:
                info = "The Quorum of the Twelve Apostles and the First Quorum of the Seventy were organized.";
                break;
            case 1836:
                info = "The Kirtland Temple was dedicated and priesthood keys were committed to Joseph Smith and Oliver Cowdery in the Kirtland Temple.";
                break;
            case 1838:
                info = "Joseph Smith and other Church leaders moved to Far West, Missouri and Joseph Smith was imprisoned in Liberty Jail.";
                break;
            case 1839:
                info = "The Saints in Missouri were forced to leave the state and Joseph Smith joined the Saints in Illinois and helped establish Nauvoo.";
                break;
            case 1840:
                info = "Joseph Smith began teaching about baptisms for the dead.";
                break;
            case 1842:
                info = "The Relief Society was organized and Joseph Smith presented the endowment ordinance in Nauvoo.";
                break;
            case 1843:
                info = "Revelation on eternal marriage and plural wives (D&C 132) was recorded.";
                break;
            case 1844:
                info = "Joseph and Hyrum Smith were assassinated and The Quorum of the Twelve Apostles was sustained to lead the Church.";
                break;
            case 1846:
                info = "Many Saints began their journey to the Salt Lake Valley and the Nauvoo Temple was dedicated.";
                break;

            default:
                //Not a year that I manage so we re-run it
                info = "No Info";
                if (data.getCurrentYear() > 1846){
                    info = "You have finished the game!";
                }
                else {
                    data.incrementCurrentYear();
                    testEvent();
                }
                break;
        }

        //Write out the info and
        if(info.compareToIgnoreCase("No Info")!=0){
            I.out(info);
        }
        Scanner myScanner = new Scanner(System.in);
        int guess = myScanner.nextInt();
        if (guess== data.getCurrentYear()){

        }

        data.incrementCurrentYear();

    }
//        info = "Many Saints began their journey to the Salt Lake Valley and the Nauvoo Temple was dedicated.";
//        info = "Joseph and Hyrum Smith were assassinated and The Quorum of the Twelve Apostles was sustained to lead the Church.";
//        info = "Revelation on eternal marriage and plural wives (D&C 132) was recorded.";
//        info = "The Relief Society was organized and Joseph Smith presented the endowment ordinance in Nauvoo.";
//        info = "Joseph Smith began teaching about baptisms for the dead.";
//        info = "The Saints in Missouri were forced to leave the state and Joseph Smith joined the Saints in Illinois and helped establish Nauvoo.";
//

    public void actionEvent(){

    }


}
