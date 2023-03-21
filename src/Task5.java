import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class Task5
{
    public static void main(String[] args)
    {
        int[] Numbers = {11, 3, 14, 16, 7};
        int buf;
        try (FileWriter fw = new FileWriter("file.txt", false)) {

            for (int i = 0; i < Numbers.length; i++)
            {
                for (int j = 0; j < Numbers.length - 1; j++)
                {
                    if (Numbers[j] > Numbers[j + 1])
                    {
                        buf = Numbers[j];
                        Numbers[j] = Numbers[j + 1];
                        Numbers[j + 1] = buf;
                        System.out.println(Arrays.toString(Numbers));
                        fw.write(Arrays.toString(Numbers));
                        fw.append("\n");
                        fw.flush();
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());


        }
    }
}