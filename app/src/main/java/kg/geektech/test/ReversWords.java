package kg.geektech.test;

public class ReversWords {
    //
    /*public String reversString(String words) {
        String[] reversWords = words.split(" ");
        return reversWords[1] + " " + reversWords[0];
    }*/

  /*  public static String reversString(String str){
        String words[]=str.split("\\s");
        String reversWords="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reversWords+=sb.toString()+" ";
        }
        return reversWords.trim();
    }*/

    public String reversString(String message) {
        String[] strings = message.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i] + " ");
        }
        return sb.toString().trim();
    }


}
