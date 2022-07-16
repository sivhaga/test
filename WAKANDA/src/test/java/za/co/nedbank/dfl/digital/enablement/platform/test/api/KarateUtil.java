package za.co.nedbank.dfl.digital.enablement.platform.test.api;

import com.intuit.karate.cucumber.CucumberRunner;
import com.intuit.karate.cucumber.KarateStats;
import cucumber.api.CucumberOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import za.co.nedbank.eqa.digital.utils.commonUtilities.DateTime;


import static org.junit.Assert.*;


@CucumberOptions()
public class KarateUtil {
    @BeforeClass
    public static void beforeClass() throws Exception {
    }

    @Test
    public void testParallel() throws Exception{
        String karateOutputPath = "target/surefire-reports";
        KarateStats stats = CucumberRunner.parallel(getClass(), 5, karateOutputPath);
        generateReport(karateOutputPath, "testParallel");
        assertTrue("there are scenario failures", stats.getFailCount() == 0);
    }

    public static void generateReport(String karateOutputPath, String runnerName) {
        DateTime dt = new DateTime();
        String reportFolderLocation = "./Reports/"+runnerName+"_"+dt.getFormatedTimeStamp();
        try{
            File reportFolder =  new File(reportFolderLocation);
            if(reportFolder.exists()){
                System.out.println("Report folder located :::::::::  Going on without recreating the folder");
            }
            else {
                reportFolder.mkdir();
            }

            Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[] {"json"}, true);
            List<String> jsonPaths = new ArrayList(jsonFiles.size());
            jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
            Configuration config = new Configuration(new File(reportFolderLocation), "DFL_DHBJ");
//            config.setBuildNumber("1233");
            ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
            reportBuilder.generateReports();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getMethodName(){
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public void saveIds(String appId, String fileSource) {
        try {
            /**     Creating file if not exist      */
            File f = new File(fileSource);
            if(!f.exists()){
                f.listFiles();
                f.createNewFile();
            }else{
                System.out.println("File already exists");
            }

            /**     Creating file if not exist      */
            FileOutputStream fileOS = new FileOutputStream(fileSource);
            fileOS.write(appId.getBytes());
            fileOS.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}