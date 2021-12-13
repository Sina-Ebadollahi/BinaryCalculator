public class OctalCalculation {
    public String octal;
    OctalCalculation(String oct){
        this.octal = oct;
    }
    String[] octalConvert(){
        // textArea = 0:binary 1: octal 2: hex 3: decimal
        int decimalValue = Integer.parseInt(this.octal,8);
        String[] convertedValue = new String[4];
        convertedValue[0] = Integer.toBinaryString(decimalValue);
        convertedValue[1] = this.octal;
        convertedValue[2] = String.valueOf(Integer.toHexString(decimalValue));
        convertedValue[3] = String.valueOf(decimalValue);
        return convertedValue;
    }
}
