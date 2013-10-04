package kataarraymaxrepeated;

import java.util.ArrayList;

public class Max_Repeated {

    public static int repeat(int[] vector) {
        ArrayList<Frequency> result = new ArrayList<>();
        if (vector.length > 0){
        result.add(new Frequency (vector[0], 1));
        }
        else{
            return -1;
        }
        for (int i : vector) {
            boolean exist = false;
            for (Frequency frequency : result) {
                if (i == frequency.getKey()) {
                    frequency.setValue(frequency.getValue() + 1);
                    exist = true;             
                }
            }
            if(exist = false){
               result.add(new Frequency(i, 1));
            }
        }
        int maxRepeated = 0;
        int repeated_Value = -1 ;
        for (Frequency frequency : result) {
            if (frequency.getValue() > maxRepeated) {
                maxRepeated = frequency.getValue();
                repeated_Value = frequency.getKey();                
            }

        }
        return repeated_Value;
    }
}
