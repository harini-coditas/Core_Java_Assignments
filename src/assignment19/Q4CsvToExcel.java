package assignment19;

import java.io.*;

public class Q4CsvToExcel {
    public static void main(String[] args) throws FileNotFoundException{
        String csvFilePath = "input.csv";
        String excelFilePath = "output.xls";

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFilePath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(excelFilePath));

            //write the excel header
            bufferedWriter.write("sep=,\n");

            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] data = line.split(",");
                for (int i = 0; i < data.length; i++) {
                    String cellData = data[i];
                    // Escape commas and quotes in the cell data
                    if (cellData.contains(",") || cellData.contains("\"")) {
                        cellData = "\"" + cellData.replaceAll("\"", "\"\"") + "\"";
                    }
                    // Write the cell data to the Excel file
                    bufferedWriter.write(cellData);
                    // Add a comma between cells
                    if (i < data.length - 1) {
                        bufferedWriter.write(",");
                    }
                }
                // Add a newline after each row
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("CSV file converted to Excel successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
