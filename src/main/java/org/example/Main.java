package org.example;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Main {
    public static void main(String[] args) {


        // Array de valores
        double[] values = new double[] {65, 51 , 16, 11 , 6519, 191 ,0 , 98, 19854, 1, 32};

        // Instanciando DescriptiveStatistics
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

        // Adicionando os valores ao objeto de estatísticas
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }

        // Calculando as estatísticas
        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();

        // Exibindo os resultados
        System.out.println("Média: " + mean);
        System.out.println("Mediana: " + median);
        System.out.println("Desvio padrão: " + standardDeviation);
    }
}