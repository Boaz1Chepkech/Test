// main class
class Main{
    public static void main(String[] args){
        int salary=500000;
        int yearofservice=7;
        int bonus=0;
        
        //find the bonus
        if(yearofservice>10){
            bonus=12;
        }
        else if(yearofservice>=6 && yearofservice<=10){
            bonus=10;
        }
        else{
            bonus=8;
    }
    
    //compute bonus salary
    int bonussalary=salary*bonus/100;
    //print the output bonus
    System.out.println("Your bonus salary is" +bonussalary);
}}