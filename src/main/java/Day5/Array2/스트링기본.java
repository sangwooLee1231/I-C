package Day5.Array2;

public class 스트링기본 {
    public static void main(String[] args) {
        String s = "나는! 프로그래머야"; //index를 가지고 있음. 나는 0번!
        String s2 = "진짜!!!!";
        System.out.println(s+s2);
        String sum = s.concat(s2);
        System.out.println(sum);
        char c = s.charAt(0); //s스트링에 들어있는 것중 0번 index에 있는 char를 추출!
        System.out.println(c);
        char c2 = s2.charAt(2);
        System.out.println(s2.endsWith("!")); //True or false
        System.out.println(s2.contains("!"));  //True or false
    }
}
