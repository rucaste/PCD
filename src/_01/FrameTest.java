import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrameTest {
    private JFrame frame;

    public FrameTest() {
        frame = new JFrame("Test");

        // para que o botao de fechar a janela termine a aplicacao
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // conteudo em sequencia da esquerda para a direita
        frame.setLayout(new FlowLayout());

        addFrameContent();

        // para que a janela se redimensione de forma a ter todo o seu conteudo visivel
        frame.pack();
    }

    public void open() {
        // para abrir a janela (torna-la visivel)
        frame.setVisible(true);
    }

    private void addFrameContent() {


        frame.setLayout(new GridLayout(4,2));
		
		
		/* para organizar o conteudo em grelha (linhas x colunas)
		se um dos valores for zero, o numero de linhas ou colunas (respetivamente) fica indefinido,
		e estas sao acrescentadas automaticamente */

        JLabel labelTitle = new JLabel("title");
        frame.add(labelTitle);

        JTextField textTitle = new JTextField("Hello");
        frame.add(textTitle);


        JLabel labelWidth = new JLabel("width");
        frame.add(labelWidth);

        JTextField textWidth = new JTextField("300");
        frame.add(textWidth);


        JLabel labelHeight = new JLabel("height");
        frame.add(labelHeight);

        JTextField textHeight = new JTextField("150");
        frame.add(textHeight);


        JCheckBox check = new JCheckBox("check");
        frame.add(check);

        JButton button = new JButton("button");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String title = textTitle.getText();
                int width, height;

                try {
                    width = Integer.parseInt(textWidth.getText());
                    height = Integer.parseInt(textHeight.getText());
                }
                catch (Exception ex)  {
                    width = 200;
                    height = 100;
                }


                if(check.isSelected()) {
                    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                    int x = (int)dimension.getWidth();
                    int y = (int)dimension.getHeight();
                    frame.setLocation((x / 2), (y / 2));

                }
                frame.setTitle(title);
                frame.setSize(width, height);
                frame.validate();
            }
        });

        frame.add(button);
    }

    public static void main(String[] args) {
        FrameTest window = new FrameTest();
        window.open();
    }
}