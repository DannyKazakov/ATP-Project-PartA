package algorithms.mazeGenerators;

public class main{

//I wish is working!!
    public static void main(String[] args) {
        int row=5, col=5;
        //MyMazeGenerator m = new MyMazeGenerator();
        SimpleMazeGenerator mm=new SimpleMazeGenerator();
        //System.out.println("************************MyMazeGenerator***********************");
        //m.generate(row, col).print();
        //long n=m.measureAlgorithmTimeMillis(row,col);
        //System.out.println("***Time_MyMazeGenerator: "+n+"***");
        //System.out.println("/////////////////////////////////////////////////////////////////////////////////");

        System.out.println("************************SimpleMazeGenerator***********************");
        mm.generate(row,col).print();
        long nn=mm.measureAlgorithmTimeMillis(row,col);
        System.out.println("***Time_SimpleMazeGenerator: "+nn+"***");





    }

}
