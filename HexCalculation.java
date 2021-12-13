public class HexCalculation {
    public String hex;
    HexCalculation(String hex){
        this.hex = hex;
    }
    String[] hexConvert(){
        int decimalValue = Integer.parseInt(this.hex, 16);
        String[] convertedValue = new String[4];
        // textArea = 0:binary 1: octal 2: hex 3: decimal
        convertedValue[0] = Integer.toBinaryString(decimalValue);
        convertedValue[1] = Integer.toOctalString(decimalValue);
        convertedValue[2] = this.hex;
        convertedValue[3] = String.valueOf(decimalValue);
        System.out.println(convertedValue[3]);
        return convertedValue;
    }
}
