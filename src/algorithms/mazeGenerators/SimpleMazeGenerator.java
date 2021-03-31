//import java.util.*;
package algorithms.mazeGenerators;


import java.util.Random;

public class SimpleMazeGenerator extends AMazeGenerator{
    @Override
    public Maze generate(int row, int col)
    {
        Maze simpleMaze = new Maze(row,col);
        Random randRow = new Random();
        Random randCol = new Random();
        simpleMaze.setStartPosition(0,0);
        simpleMaze.setGoalPosition(randRow.nextInt(row),col-1);
        Position start = simpleMaze.getStartPosition();
        Position goal = simpleMaze.getGoalPosition();
        for(int numOfWalls=0; numOfWalls<(simpleMaze.getMap().length * simpleMaze.getMap()[0].length)/3;numOfWalls++)
        {
            int rw = randRow.nextInt(row);
            int rc = randCol.nextInt(col);
            if( (start.getRowIndex()!=rw || start.getColumnIndex()!=rc )
                    && (goal.getRowIndex()!=rw || goal.getColumnIndex()!=rc ) )

            { simpleMaze.SetValue(rw,rc,1); }
        }
        return simpleMaze;
    }

}
