public class BinaryCalculation {
    public String binary;
    BinaryCalculation(String bin){
        this.binary = bin;
    }
    String[] binaryConvert(){
        String[] convertedValue = new String[4];
        convertedValue[0] = this.binary;
        convertedValue[1] = Integer.toOctalString(Integer.parseInt(this.binary));
        convertedValue[2] = Integer.toHexString(Integer.parseInt(this.binary));
        convertedValue[3] = String.valueOf(Integer.parseInt(this.binary,2));
        System.out.println(convertedValue[3]);
        return convertedValue;
    }
}
