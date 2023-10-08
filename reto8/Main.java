package edu.diego.arzate.torres.modulo2.reto8;

import edu.diego.arzate.torres.modulo2.reto8.utils.SorterFactory;
import edu.diego.arzate.torres.modulo2.reto8.utils.PerformanceTesting;
import edu.diego.arzate.torres.modulo2.reto8.utils.Sorter;

public class Main {
    public static void main(String[] args) {
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.MERGE));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.QUICK));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.HEAP));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.SECUENCIAL));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.BINARIA));


    }

}
