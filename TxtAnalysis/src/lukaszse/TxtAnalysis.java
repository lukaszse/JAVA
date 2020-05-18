package lukaszse;

public class TxtAnalysis {
    String text;

    public TxtAnalysis(String text) {
        this.text = text.toLowerCase();
    }

    public int[] txtHistogram(){
        int[] histogram = new int[26];
            for(int i=0; i<this.text.length(); i++){
                if(this.text.charAt(i) - 'a' >= 0 && this.text.charAt(i) - 'a' <= 26)
                    histogram[(this.text.charAt(i))-'a']++;
            }
        return histogram;
    }

    public void showHistogram(){
        System.out.println(             "                                         H I S T O G R A M");
        System.out.println(             "------------------------------------------------------------------------------------------------------");
        for(int i=0; i<26; i++) {
            char znak = (char) (i + 'a');
            System.out.print(znak + ":  ");
        }
        System.out.println("");
        for(int i=0; i<26; i++) {
            System.out.print(this.txtHistogram()[i] + "   ");
        }
        System.out.println("\n");
    }
}
