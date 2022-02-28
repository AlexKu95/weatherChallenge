package de.exxcellent.challenge;

public class Football {
    
    // Data Team,Games,Wins,Losses,Draws,Goals,Goals Allowed,Points
    private String Team;
    private int Games;
    private int Win;
    private int Losses;
    private int Draws;
    private int Goals; // 1HrP TPcpn
    private int GoalsAllowed;
    private int Points; 
 

    // Calculated Data
    private int goalDifference;

    /**
     * Constructor for an football object
     * @param args an Array of Type String that gets the data as Team,Games,Wins,Losses,Draws,Goals,Goals Allowed,Points
     */
    public Football(String[] args){
        this.Team = args[0];
        this.Games = Integer.parseInt(args[1]);
        this.Win = Integer.parseInt(args[2]);
        this.Losses = Integer.parseInt(args[3]);
        this.Draws = Integer.parseInt(args[4]);
        this.Goals = Integer.parseInt(args[5]);
        this.GoalsAllowed = Integer.parseInt(args[6]);
        this.Points = Integer.parseInt(args[7]);
        calculateGoalDifference();
    }

    /**
     * Empty Constructor
     */
    public Football(){}

    /**
     * Calculates the Goal Difference of the football object
     */
    private void calculateGoalDifference(){
        this.goalDifference = this.Goals - this.GoalsAllowed;
    }

    /**
     * Geter method for the Goal Difference
     * @return the Goal Difference as an integer
     */
    public int getGoals(){
        return this.goalDifference;
    }

    /**
     * Returns the data of the football object as a string.
     * The method only returns the Tean at the moment because of the requirements of the task
     */
    public String toString(){
        String output = "";
        output += "Tean: "+ this.Team;
        return output;
    } 
}
