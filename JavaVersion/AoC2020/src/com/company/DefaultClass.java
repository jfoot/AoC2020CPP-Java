package com.company;

public class DefaultClass {

    public String FileName;
    public FileReader fr;
    private long Start = System.nanoTime();

    public DefaultClass(int day, boolean ContainsFile)
    {
        if(ContainsFile) {
            FileNameCalc(day);
            fr = new FileReader(FileName);
        }
        System.out.println("\nDay "+day + " Class running");
    }

    private void FileNameCalc(int n)
    {
        FileName = "InputFiles/input"+n+".txt";
    }

    public void ResetClock()
    {
        Start = System.nanoTime();
    }

    public void TimeClock()
    {
        System.out.println(System.nanoTime()-Start + " nanoseconds : " + ((double)(System.nanoTime()-Start)/100000) + " milliseconds");
    }

    public void TimeResetClock()
    {
        TimeClock();
        ResetClock();
    }

}
