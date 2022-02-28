package de.exxcellent.challenge;

/**
 * Class that represents an Weather Object
 */
public class Weather {

    // Data Day, MxT, MnT, AvT, AvDP, 1HrP TPcpn,PDir,AvSp,Dir,MxS,SkyC,MxR,Mn,R AvSLP
    private int Day;
    private int MxT;
    private int MnT;
    private int AvT;
    private float AvDP;
    private int HrPTPcpn; // 1HrP TPcpn
    private float PDir;
    private float AvSp; 
    private int Dir;
    private int MxS;
    private float SkyC;
    private int MxR;
    private int Mn;
    private float RAvSLP; // R AvSLP

    // Calculated Data
    private int spread;

    /**
     * Classic Constructor
     * @param t_Day
     * @param t_MxT
     * @param t_MnT
     * @param t_AvT
     * @param t_AvDP
     * @param t_HrPTPcpn
     * @param t_PDir
     * @param t_AvSp
     * @param t_Dir
     * @param t_MxS
     * @param t_SkyC
     * @param t_MxR
     * @param t_Mn
     * @param t_RAvSLP
     */
    public Weather(int t_Day, int t_MxT, int t_MnT, int t_AvT, float t_AvDP, int t_HrPTPcpn, float t_PDir,float  t_AvSp, int t_Dir, int t_MxS, float t_SkyC, int t_MxR, int t_Mn, float t_RAvSLP){
        this.Day = t_Day;
        this.MxT = t_MxT;
        this.MnT = t_MnT;
        this.AvT = t_AvT;
        this.AvDP = t_AvDP;
        this.HrPTPcpn = t_HrPTPcpn;
        this.PDir = t_PDir;
        this.AvSp = t_AvSp;
        this.Dir = t_Dir;
        this.MxS = t_MxS;
        this.SkyC = t_SkyC;
        this.MxR = t_MxR;
        this.Mn = t_Mn;
        this.RAvSLP = t_RAvSLP;
        calculateSpread();
    }

    /**
     * Constructor for an weather object
     * @param args an Array of Type String that gets the data as Day, MxT, MnT, AvT, AvDP, 1HrP TPcpn,PDir,AvSp,Dir,MxS,SkyC,MxR,Mn,R AvSLP
     */
    public Weather(String[] args){
        this.Day = Integer.parseInt(args[0]);
        this.MxT = Integer.parseInt(args[1]);
        this.MnT = Integer.parseInt(args[2]);
        this.AvT = Integer.parseInt(args[3]);
        this.AvDP = Float.parseFloat(args[4]);
        this.HrPTPcpn = Integer.parseInt(args[5]);
        this.PDir = Float.parseFloat(args[6]);
        this.AvSp = Float.parseFloat(args[7]);
        this.Dir = Integer.parseInt(args[8]);
        this.MxS = Integer.parseInt(args[9]);
        this.SkyC = Float.parseFloat(args[10]);
        this.MxR = Integer.parseInt(args[11]);
        this.Mn = Integer.parseInt(args[12]);
        this.RAvSLP = Float.parseFloat(args[13]);
        calculateSpread();
    }

    /**
     * Empty Constructor
     */
    public Weather(){}

    /**
     * Calculates the spread of the weather object
     */
    private void calculateSpread(){
        this.spread = this.MxT - this.MnT;
    }

    /**
     * Geter method for the spread
     * @return the spread as an integer
     */
    public int getSpread(){
        return this.spread;
    }

    /**
     * Returns the data of the weather object as a string.
     * The method only returns the Day at the moment because of the requirements of the task
     */
    public String toString(){
        String output = "";
        output += "Day: "+ this.Day;
        return output;
    } 
}
