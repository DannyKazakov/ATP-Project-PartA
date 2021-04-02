package algorithms.search;

import java.util.ArrayList;
//
public class Solution {
    private ArrayList<AState> solutionPath;

    public Solution(ArrayList<AState> solutionPath) {
        this.solutionPath = solutionPath;
    }
    public Solution(Solution otherSolution){
        this.solutionPath = otherSolution.solutionPath;
    }
    public ArrayList<AState> getSolutionPath(){return this.solutionPath;}
}
