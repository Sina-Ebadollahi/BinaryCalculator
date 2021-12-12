import java.util.ArrayList;

public class DecimalCalculation {

    public String decimal;
    DecimalCalculation(String dec){
        this.decimal = dec;
    }
    String[] decimalConvert(){
        String[] convertedValue = new String[4];
        convertedValue[0] = Integer.toBinaryString(Integer.parseInt(this.decimal));
        convertedValue[1] = Integer.toOctalString(Integer.parseInt(this.decimal));
        convertedValue[2] = Integer.toHexString(Integer.parseInt(this.decimal));
        convertedValue[3] = this.decimal;
        return convertedValue;
    }


}
