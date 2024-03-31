import javax.swing.*;
import java.awt.*;

public class Gui implements Runnable  {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Gui());

    }

    public static final JTextArea textDoc = new JTextArea();
    public static JFrame frame;

        private JFrame MyFrame() {
            frame = new JFrame();        //creates a frame
            frame.setTitle("Open Source ScriptWriter");  //sets title of frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application
            frame.setResizable(true); //if set to false it'll make frame not resizable
            frame.setSize(940,820);     //sets dimensions and y-dimension of frame
            frame.setVisible(true);     //makes the frame visible
            frame.add(menuPanel(), BorderLayout.NORTH);
            frame.add(marginPanel(), BorderLayout.WEST);
            frame.add(marginPanel(), BorderLayout.EAST);
            frame.add(counterPanel(), BorderLayout.SOUTH);
            frame.add(textArea(), BorderLayout.CENTER);
            ImageIcon logo = new ImageIcon("src/Images/camera.png");
            frame.setIconImage(logo.getImage());
            //ImageIcon image = new ImageIcon("bayern.jpeg"); //create an image icon
            //frame.setIconImage(image.getImage()); //change icon of frame
            return frame;
        }



        private JPanel menuPanel()  {
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 5));
            panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            panel.setBackground(Color.lightGray);

            panel.add(Components.newFile());
            panel.add(Components.open());
            panel.add(Components.save());
            panel.add(Components.exit());
            panel.add(Components.export());
            panel.add(Components.scene());
            panel.add(Components.action());
            panel.add(Components.character());
            panel.add(Components.paren());
            panel.add(Components.dialogue());
            panel.add(Components.transition());

            return panel;
        }

        private JPanel marginPanel() {
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 5));
            panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
            panel.setBackground(Color.darkGray);

            return panel;
        }

        private JPanel counterPanel() {
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 5));
            panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            panel.setBackground(Color.lightGray);

            return panel;
        }


        public static JPanel textArea(){
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.setBorder(BorderFactory.createEmptyBorder());
            panel.setBackground(Color.white);

            textDoc.setFont(new Font("Courier", Font.PLAIN, 12));
            textDoc.setMargin(new Insets(80,80,80,80));
            JScrollPane scrollPane = new JScrollPane(textDoc, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            panel.add(scrollPane);



            return panel;
        }

    public void run() {
        MyFrame();
    }
}
