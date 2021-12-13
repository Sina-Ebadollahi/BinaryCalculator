import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface implements ActionListener {
    private ImageIcon programIcon;
    JFrame frame = new JFrame();
    // decimal textarea
    TextArea textArea = new TextArea();
    // binary textarea
    TextArea textArea2 = new TextArea();
    // octal textarea
    TextArea textArea3 = new TextArea();
    // hex textarea
    TextArea textArea4 = new TextArea();
    JTextPane pane = new JTextPane();
    JButton btn = new JButton("Submit");
    JButton resetBtn = new JButton("Reset");
    JLabel labelHex = new JLabel("HexDecimal");
    JLabel labelBinary = new JLabel("Binary");
    JLabel labelDecimal = new JLabel("Decimal");
    JLabel labelOctal = new JLabel("Octal");
    JDialog n = new JDialog();



    void programBase(){
        programIcon = new ImageIcon("./icon");
    }
    void mainFrame(){
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.orange);
        frame.setLayout(null);

    }
    void addingComponents(){
        frame.add(textArea);
        frame.add(btn);
        frame.add(textArea2);
        frame.add(pane);
        frame.add(textArea3);
        frame.add(textArea4);
        frame.add(resetBtn);
    }
    void setTextArea(){

        textArea.setVisible(true);
        textArea.setBounds(100,200,100,100);

    }

    void setTextArea2() {
        textArea2.setVisible(true);
        textArea2.setBounds(100, 100, 100, 100);

    }
    void setTextArea3(){
        textArea3.setVisible(true);
        textArea3.setBounds(300,200,100,100);
        textArea3.setBackground(new Color(224, 161, 161));
    }
    void setTextArea4(){
        textArea4.setVisible(true);
        textArea4.setBounds(400,200,100,100);

    }
    void setBtn(){
        btn.setVisible(true);
        btn.setBounds(300,300,100,100);
        btn.setBackground(new Color(10,10,10));
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(this::actionPerformed);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (!textArea.getText().isEmpty()) {
                DecimalCalculation dc = new DecimalCalculation(textArea.getText().trim());
                String[] decimalResults = dc.decimalConvert();
                this.textArea.setText(decimalResults[3]);
                this.textArea2.setText(decimalResults[0]);
                this.textArea3.setText(decimalResults[1]);
                this.textArea4.setText(decimalResults[2]);
            }
            if (!textArea2.getText().isEmpty()) {
                BinaryCalculation bc = new BinaryCalculation(textArea2.getText().trim());
                String[] binaryResults = bc.binaryConvert();
                this.textArea.setText(binaryResults[3]);
                this.textArea2.setText(binaryResults[0]);
                this.textArea3.setText(binaryResults[1]);
                this.textArea4.setText(binaryResults[2]);
            }

            if(!textArea4.getText().isEmpty()){
                HexCalculation bc = new HexCalculation(textArea4.getText().trim());
                String[] hexResults = bc.hexConvert();
                this.textArea.setText(hexResults[3]);
                this.textArea2.setText(hexResults[0]);
                this.textArea3.setText(hexResults[1]);
                this.textArea4.setText(hexResults[2]);
            }
            if(!textArea3.getText().isEmpty()){
                OctalCalculation bc = new OctalCalculation(textArea3.getText().trim());
                String[] octalResults = bc.octalConvert();
                this.textArea.setText(octalResults[3]);
                this.textArea2.setText(octalResults[0]);
                this.textArea3.setText(octalResults[1]);
                this.textArea4.setText(octalResults[2]);
            }
            }catch(Exception err){
                System.out.println(err.getMessage());
            }

    }




    void setResetBtn(){
        resetBtn.setVisible(true);
        resetBtn.setBounds(100,300,100,100);
        resetBtn.setBackground(new Color(10,10,10));
        resetBtn.setBorderPainted(false);
        resetBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        resetBtn.addActionListener(this::resetButtonClickAction);

    }
    public void resetButtonClickAction(ActionEvent e){
        textAreaReset();
    }



    void textAreaReset(){
        this.textArea.setText("");
        this.textArea2.setText("");
        this.textArea3.setText("");
        this.textArea4.setText("");
    }
//    void labelAdd(){
//        labelHex.add(textArea);
//        labelHex.setVisible(true);
//
//    }

    /**
     * all of Components will called in this function
     */
    void allGetInvoked(){
        mainFrame();
        addingComponents();
        setTextArea();
        setBtn();
        setResetBtn();
        setTextArea2();
        setTextArea3();
        setTextArea4();
    }
}
