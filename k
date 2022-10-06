public class Power {
    public static void main(String args[]){
        int numero = 5;
        int exponente = 3;
        int res = calculatePower(numero,exponente);
        System.out.println(numero+"^"+exponente+"="+res);
    }
    
    static int calculatePower(int num, int power){
        int answer = 1;
        if(num > 0 && power==0){
            return answer;
        }
        else if(num == 0 && power>=1){
            return 0;
        } 

        else{
            for(int i = 1; i<= power; i++){
                answer = answer*num;
            }
            return answer;
        }
    }
}
