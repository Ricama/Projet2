package com.hemebiotech.analytics;
import java.io.*;
import java.util.List;

public class WriteSymptomDataToFile implements ISymptomWriter  {

    @Override
    public void pullSymptoms() {
        try(BufferedWriter writer = new BufferedWriter (new FileWriter("result.out"))) {
            List<String> listSymptoms = AnalyticsCounter.count();
            for (int i = 0; i != listSymptoms.size(); i++) {
                String test = listSymptoms.get(i);
                writer.write(test);
                writer.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
