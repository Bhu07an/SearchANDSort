public class pra {
    public static void main(String[] args) {
        for(int i = -1 ; i < 9 ; i++){
            if(i % 2 == 0 || i == 1 ){
                System.out.println(i);
            }
            if(i % 2 != 0){
                System.out.println("......"+i);
            }
        }
    }
}
