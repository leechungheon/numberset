//3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
//X, Y는 0으로 시작하지 않습니다.
//X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
class Solution {
    String answer = "";
    public String solution(String X, String Y) {
        String[] array1=X.split("");
        String[] array2=Y.split("");
        String[] array3;
        int token=0;
        if(array1.length>=array2.length){
            array3=new String[array2.length];
            for(int i=0; i<array1.length; i++){
                for(int j=0; j<array2.length; j++){
                    if(array1[i]!=null&&array2[j]!=null&&array1[i].equals(array2[j])){
                        array3[token++]=array1[i];
                        array1[i]=null;
                        array2[j]=null;
                    }

                }
            }
        }else{
            array3=new String[array1.length];
            for(int i=0; i<array2.length; i++){
                for(int j=0; j<array1.length; j++){

                    if(array1[j]!=null&&array2[i]!=null&&array2[i].equals(array1[j])){
                        array3[token++]=array2[i];//3021
                        array2[i]=null;
                        array1[j]=null;
                    }

                }
            }
        }
        //array3 의 요소들을 정수형 변환 후 최대 숫자 answer 구하기
        int[] array_int=new int[10];
        for(int i=0; i<array3.length; i++){
            if(array3[i]!=null) {
                int num = Integer.parseInt(array3[i]);
                array_int[num]++;//0010021000
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean zero_checker=true;
        for(int i=9; i>=0; i--){
            for(int j=0; j<array_int[i]; j++) {
                sb.append(i);
                if(i!=0)zero_checker=false;
            }
        }
        answer = sb.toString();
        if(answer.isEmpty())return "-1";
        else if (zero_checker) {
            return "0";
        } else{
            return answer;
        }
    }
}