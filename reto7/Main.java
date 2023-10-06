package edu.diego.arzate.torres.modulo2.reto7;

import edu.diego.arzate.torres.modulo2.reto7.process.SorterFactory;
import edu.diego.arzate.torres.modulo2.reto7.utils.PerformanceTesting;
import edu.diego.arzate.torres.modulo2.reto7.utils.Sorter;

public class Main {
    public static void main(String[] args) {
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.SELECTION));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.BUBBLE));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.INSERTION));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.SHELL));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.MERGE));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.QUICK));
         PerformanceTesting.testPerformance(SorterFactory.getSorter(Sorter.SorterMethods.HEAP));


    }

}
