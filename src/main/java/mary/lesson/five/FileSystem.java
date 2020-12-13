package mary.lesson.five;

import mary.lesson.four.PhoneBook;
import java.io.*;
import java.util.Arrays;

public class FileSystem {
    private static String[] header;
    private static int[][] data = {{1,2,3},{3,2,1}};

    /**
     * write data to file
     *
     * @param dataSet String to write in file
     * @throws IOException Exception
     */
    public static void WriteDataToFile(String dataSet) throws IOException
    {
        File file = new File("PhoneBookData.txt");

        try (FileOutputStream out = new FileOutputStream(file)) {
            byte[] outData = dataSet.getBytes();

            out.write(outData);

            System.out.println("Success write data to PhoneBookData.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadDataFromFile(String fileName) throws IOException
    {
        String line = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Data of file " + fileName);

            Integer i = 0;
            while ((line = reader.readLine()) != null) {
                String[] dataSet = line.split(";");

                if (i == 0){
                    header = dataSet;
                }
                else{
                    for (int j = 0; j < dataSet.length; j++) {
                        data[i-1][j] = Integer.parseInt(dataSet[j]);
                    }
                }
                i++;
            }
            System.out.println(Arrays.toString(header));
            System.out.println(Arrays.toString(data[0]));
            System.out.println(Arrays.toString(data[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
