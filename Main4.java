public class Main4 {
    public static void main(String[] args) {
        CapsulationPractice cp = new CapsulationPractice();
        cp.setPrivateData(200);
        System.out.println("CapslationData = " + cp.getPrivateData());
    }
}

// CapsulationPracticeクラス（同じファイルに追加）
class CapsulationPractice {
    private int privateData = 100;
    
     // privateDataを返却するgetPrivateDataメソッド
    public int getPrivateData() {
        return privateData;
    }
    
    // privateDataに値をセットするsetPrivateDataメソッド
    public void setPrivateData(int value) {
        privateData = value;
    }
}
