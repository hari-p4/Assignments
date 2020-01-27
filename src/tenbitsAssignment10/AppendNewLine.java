package com.company.tenbitsAssignment10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AppendNewLine
{
    public static void newline()
    {
        BufferedReader reader = null;

        BufferedWriter writer = null;
        ArrayList<String> lines = new ArrayList<>();
        try
        {
            reader = new BufferedReader(new FileReader("src/com/company/tenbitsAssignment10/names.txt"));
            String currentLine = reader.readLine();
            String LineBreak = currentLine.replaceAll("(.{20})", "$1\r");
           // String LineBreak = currentLine.replaceAll("(.{20})", "");

            while (LineBreak != null)
            {
                lines.add(LineBreak);
                LineBreak = reader.readLine();
            }
                  Collections.sort(lines);
            writer = new BufferedWriter(new FileWriter("src/com/company/tenbitsAssignment10/NewLineAt20.txt"));

            for (String line : lines)
            {
                writer.write(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
                if(writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}