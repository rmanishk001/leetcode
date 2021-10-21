  public boolean repeatedSubstringPattern(String s) {
        int p=0;
        if (s.length()%2==0){
            p=s.length()/2;
        }else {
            p=(s.length()/2)+1;
        }
        p=p/2;
        for (int i=1;i<s.length();i++){
            String val="";
            for (int k=0;k<=i;k++){
                val=val+""+s.charAt(k);

            }
            System.out.println(val);

            if (i<p){
                String valu2="";
                for (int k=i+1;k<=k+i;k++){
                    valu2=valu2+""+s.charAt(k);
                }
                if (val.equals(valu2)){
                    return true;
                }
                System.out.println(valu2);
            }else {
                break;
            }
        }
        return false;

    }
}
