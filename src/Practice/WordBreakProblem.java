package Practice;

public class WordBreakProblem {
    public static String s = "leetcode";
   public static String[]   dict = {"leet", "code"};

    public static void main(String[] args) {
     //   String eg = dict[0];
       // System.out.println(eg.length());
      //  System.out.println(s.indexOf("cod"));
        int l=0;
        int ind = 0;
       String s = "leetcode";
       StringProp[] obj = new StringProp[dict.length];
        for(int i=0;i< dict.length;i++){
            String subStr = dict[i];
             ind = s.indexOf(subStr);
            l = subStr.length();
            if(s.contains(subStr)){
           //  obj.startIndex = s.indexOf(subStr);
             obj[i] = new StringProp();
             obj[i].startIndex = ind;
             obj[i].len = l;
            }

        }

       /*
        int newStartLen = 0;
        for(int i=0; i<obj.length;i++){
            if(obj[i].startIndex==newStartLen ){
                newStartLen=obj[i].length;
            }
        }
        */

       boolean res =  rec(obj,0,"");
        System.out.println(res);
    }

    public static boolean rec(StringProp[] obj, int newStartIndex,String str){
        if((newStartIndex+str.length())==s.length()){
            return true;
        }
        for(int i=0; i<dict.length;i++){
            if(obj[i].startIndex==newStartIndex){
               return( rec(obj,newStartIndex+obj[i].len,dict[i]));
            }
        }

        return false;
    }



    public static class StringProp{
        int len;
        int startIndex;

    }
}


