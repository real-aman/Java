public class ShortestPath{

    public static void calculateShortest(int x,int y){
        double shortest=Math.sqrt((double)((x*x)+(y*y)));
        System.out.println("Shortest distance is: "+shortest);
        return;
    }


    public static void main(String[] args) {
      String path="WNEENESENNN";
      
      int x=0,y=0;
      for(int i=0;i<path.length();i++){
        char dir=path.charAt(i);

        if(dir=='W'){
            x--;
        }
        else if(dir=='N'){
            y++;
        }
        else if(dir=='E'){
            x++;
        }
        else if(dir=='S'){
            y--;
        }

        
      }

      calculateShortest(x,y);
      



    }
}