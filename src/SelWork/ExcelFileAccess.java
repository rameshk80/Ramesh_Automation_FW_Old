package SelWork;

import sun.nio.cs.StandardCharsets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelFileAccess extends Main{
    List<TestCase> allTestCases = new ArrayList<TestCase>();

    ExcelFileAccess()
    {
    }

    public void readAllTestCases()
    {
        FileInputStream inputFile;
        String lineOfString;
        try {
            BufferedReader reader = new BufferedReader( new FileReader(config.getInputFile()));
            reader.readLine(); // read the first line and skip that since its a header

            while((lineOfString = reader.readLine()) != null)
            {
                String[] fullString = lineOfString.split(",");
                if(fullString != null)
                {
                    TestCase newTestCase = new TestCase();
                    newTestCase.assignValue(fullString);
                    allTestCases.add(newTestCase);
                    if(config.getLogLevel() == Log.DETAIL) {
                        System.out.println(newTestCase.toString());
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
