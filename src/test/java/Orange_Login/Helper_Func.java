package Orange_Login;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Helper_Func {

    public String[][]  readDatavalid (String paramsvalid,String Sheet) throws IOException {
        File inputStream = new File(paramsvalid);
        DataFormatter df=new DataFormatter();
        FileInputStream fis = new FileInputStream(inputStream);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(Sheet);
        int numberrows = sheet.getPhysicalNumberOfRows();
        int numbercols = sheet.getRow(0).getLastCellNum();
        String ARR[][] = new String[numberrows][numbercols];
        for (int i = 0; i < numberrows; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < numbercols; j++) {
                XSSFCell cell  =row.getCell(j);
                String value =df.formatCellValue(cell);
                ARR[i][j]=value.trim();
            }
        }
        return ARR;
    }




    public  static void  screenshoot(String Path) throws IOException {
        File screenshotFile = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile  , new File(Path));
    }




}
