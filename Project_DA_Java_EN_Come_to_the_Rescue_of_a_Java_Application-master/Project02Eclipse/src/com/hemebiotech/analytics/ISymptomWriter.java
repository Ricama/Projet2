package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomWriter {
   /**
    * writes to file result.out the sort list it retrieves from AnalyticsCounter
    */
   void pullSymptoms();
}
