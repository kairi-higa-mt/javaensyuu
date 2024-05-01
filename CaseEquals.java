public class CaseEquals {
    public class Question3 {
            public static void main(String[] args) {
               
                String s1 = "SeattleConsulting";
                String s2 = "SeattleConsulting";
                String s3 = "Seattle";                      
                String s4 = new String("SeattleConsulting");
                s3 = s3 + "Consulting";
               
                if(s1 == s2) {
                    System.out.println("s1とs2は等しいです。(==比較)");
                }
                if(s1 == s3) {
                    System.out.println("s1とs3は等しいです。(==比較)");
                }
                if(s1 == s4) {
                    System.out.println("s1とs4は等しいです。(==比較)");
                }
                if(s1.equals(s2)) {
                    System.out.println("s1とs2は等しいです。(.equals比較)");
                }
                if(s1.equals(s3)) {
                    System.out.println("s1とs3は等しいです。(.equals比較)");
                }
                if(s1.equals(s4)) {
                    System.out.println("s1とs4は等しいです。(.equals比較)");
                }
            }
        }
}
 
/*
 * 1,s1とs2は同じ文字列を参照しているため演算子＝＝でtrue
 * equalでもtrueとなる
 * 
 * 2,文字列を比較するequalsではs1,s3ともに同じ文字列であるためtrue
 * 演算子==で比較した場合文字列を結合しているs3と結合をしていないs1では同じオブジェクトとならないためfalseとなる
 * 
 * 3,equalsでは文字列のみをひかくするためtrue
 * s4では新しいオブジェクトとして同じ文字列を生成しているためs1とs4では同じ文字列の違うオブジェクトとなるためfalseとなる
 */
    

