package algorithms.mazeGenerators;
//tests
public class EmptyMazeGenerator extends AMazeGenerator{
    @Override
    public Maze generate(int row, int col) {
        Maze maze=new Maze(row,col);
        maze.setStartPosition(0,0);
        maze.setGoalPosition(row-1,col-1);
        return maze;
    }


}
