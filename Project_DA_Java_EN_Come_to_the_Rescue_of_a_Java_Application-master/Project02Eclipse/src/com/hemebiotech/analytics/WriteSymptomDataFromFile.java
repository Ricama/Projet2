package com.hemebiotech.analytics;
import java.io.*;
import java.util.List;

public class WriteSymptomDataFromFile implements ISymptomWriter  {

    @Override
    public void pullSymptoms() {
        try(BufferedWriter writer = new BufferedWriter (new FileWriter("result.out"))) {
            List listSymptoms = new AnalyticsCounter().count();
            for (int i = 0; i != listSymptoms.size(); i++) {
                String test = (String) listSymptoms.get(i);
                writer.write(test);
                writer.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
