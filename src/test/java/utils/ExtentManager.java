package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("target/ExtentReport.html");

            spark.config().setReportName("Automation Test Results");
            spark.config().setDocumentTitle("Selenium Cucumber Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);
        }

        return extent;
        //target/ExtentReport.html   --- use this command to generate extent report
    }
}