package Day_32;

public class StringWrapper {
    String text;
    public StringWrapper(String text){
        this.text = text;
    }

    public String getVowels(){
        String result = "";

        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                result +=c;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
