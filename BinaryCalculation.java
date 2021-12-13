public class BinaryCalculation {
    public String binary;
    BinaryCalculation(String bin){
        this.binary = bin;
    }
    String[] binaryConvert(){
        int decimalValue = Integer.parseInt(this.binary,2);
        String[] convertedValue = new String[4];
        convertedValue[0] = this.binary;
        convertedValue[1] = String.valueOf(Integer.toOctalString(decimalValue));
        convertedValue[2] = String.valueOf(Integer.toHexString(decimalValue));
        convertedValue[3] = String.valueOf(decimalValue);
        return convertedValue;
    }
}
