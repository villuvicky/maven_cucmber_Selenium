package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporsClass {
public	static ExtentReports extent;

	public static ExtentReports ExtentReportsreports() {
		extent = new ExtentReports();
		ExtentSparkReporter	htmlReporter= new ExtentSparkReporter("ExtentHtmlReports.html");
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setReportName("Login HRM");
		htmlReporter.config().setDocumentTitle("Test Results");
		htmlReporter.config().setAutoCreateRelativePathMedia(true);
		htmlReporter.config().setCSS("css-string");
		htmlReporter.config().setDocumentTitle("Login Function");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setJS("js-string");
		htmlReporter.config().setProtocol(Protocol.HTTPS);
		htmlReporter.config().setReportName("build name");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
		return extent;
	}
	
	
}
