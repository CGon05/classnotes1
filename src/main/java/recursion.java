
public class recursion {
    
    public static void main(String Args[]){
        
        //System.out.println(findGCD(75,125));
        //expected answer 25
        
        //System.out.println(findGCD(18,45));
        //expected answer 9
        
        multipleof5(180);
        
    }
    
    //linear
    static int findGCD(int num1, int num2){
        
        if(num1 == num2){
            
            return num1; 
            
        }
        if(num1 > num2){
            
            return findGCD(num1-num2,num2); 
            
        }
        else{
            
            return findGCD(num2,num2-num1); 
            
        }  
    }
    
    static void multipleof5(int num){
        num=num-num%5;
        System.out.println(num);
        if(num > 0 ){
            
            multipleof5(num-5);
            
        }
        
    }
}