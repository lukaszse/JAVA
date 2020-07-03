package lukaszse;

import java.util.Arrays;

public class StosString {
    private String[] stos = null;

    public StosString(int wielkoscStosu) {
        stos = new String[wielkoscStosu];
    }

    public void naStos(String tekst){
        if(stos[0] == null)
            stos[0]=tekst;
        else{
            if(stos[stos.length-1] == null){
                String[] temp = new String[stos.length];

                for (int i = 0; i < stos.length - 1; i++)
                    temp[i + 1] = stos[i];
                stos = temp;
                temp[0] = tekst;
            }else{
                throw new ArrayIndexOutOfBoundsException("przepelnienie");
            }
        }
    }

    public String zeStosu(){
        if(stos[0] != null) {
            String temp = stos[0];
            String tempT[] = new String[stos.length];

            for (int i = 0; i < stos.length - 1; i++)
                tempT[i] = stos[i + 1];

            stos = tempT;
            return temp;
        }else{
            throw new IndexOutOfBoundsException("stos pusty");
        }
    }

    public void piszStos(){
        System.out.println(Arrays.toString(stos));
    }

}
