public class main {
    public static void main(String[] args){
        int num1 = 10;
        num1 = 50;

        final int num2 = 10;
        /* num2 = 50;  初期化以降定数の値は変更できないためエラーが出る */
        
        System.out.println(num1);
        System.out.println(num2);
    }
}
