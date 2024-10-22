public class localVariables {

    int x = 5, y = 5;
    int myNum = 10;

    public int add_Values(int x, int y){
        int myNum = 0;
        myNum = x + y;
        return myNum;
    }
      
      public static void main(String[] args) {
    
    localVariables lv = new localVariables();
    
    int myNum = 5;               
    float myFloatNum = 5.99f;    

    lv.add_Values(myNum, (int) myFloatNum);
    
  }
}