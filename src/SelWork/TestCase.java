package SelWork;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    String TestCaseName;
    String ExecuteMode;
    String Browser;
    List<String> keywords = new ArrayList<String>();

    TestCase() {
    }

    public TestCase(String testCaseName, String executeMode, String browser, List<String> keywords) {
        TestCaseName = testCaseName;
        ExecuteMode = executeMode;
        Browser = browser;
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "TestCases{" +
                "TestCaseName='" + TestCaseName + '\'' +
                ", ExecuteMode='" + ExecuteMode + '\'' +
                ", Browser='" + Browser + '\'' +
                ", keywords=" + keywords +
                '}';
    }

    public void assignValue(String[] fullString) {
        byte i = 3;
        try {
            this.TestCaseName = fullString[0];
            this.ExecuteMode = fullString[1];
            this.Browser = fullString[2];
            while (i <= fullString.length - 1) {
                this.keywords.add(fullString[i++]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
