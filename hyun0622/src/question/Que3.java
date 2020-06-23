package question;

/*아래의 규칙을 따르는 수열의 20번째 숫자를 프로그램을 만들어 찾으시오. 개미수열
        1, 11, 12, 1121, 122111, 112213
        첫 번째 수열 : 1
        두 번째 수열 : 1이 1개 = 11
        세 번째 수열 : 1이 2개 = 12
        네 번째 수열 1이 1개, 2가 1개 = 1121
        다섯 번째 수열 : 1이 2개, 2가 1개, 1이 1개 = 122111
        여섯 번째 수열 : 1이 1개, 2가 2개 1이 3개 = 112213 */

public class Que3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        int count=1;
        int num=1;
        int p=0;

        if(arr[0]==1)
            arr[1]=1;


        for(int i=0;i<arr.length-1;i++){ //0부터 8까지
            if(arr[i]==arr[i+1]){ //두 수가 같으면
                count++;        //갯수 추가
                arr[i] = num; //0자리에 숫자입력
                arr[i+1] = count; //2입력
            }
            else if(arr[i]!=arr[i+1]){
                arr[i]=num; //0자리에 숫자입력
                arr[i+2]=arr[i+1]; //2자리에 2입력
                arr[i+1]=count;//1자리에 갯수1입력
                arr[i+3]=count;

            }
        }


        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]);

    }
}
