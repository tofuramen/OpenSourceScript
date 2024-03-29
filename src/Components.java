import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Components {

    Gui gui;

    public Components(Gui gui) {
        this.gui = gui;             //gives you access to everything in Gui class file.
    }

    public static JButton newFile() {
        JButton newFile = new JButton("New File");
        ImageIcon newICon = new ImageIcon("src/Images/new.png");
        newFile.setIcon(newICon);

        newFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null, "Would you like to save your work?", "Save", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    save().doClick();
                } else if (reply == JOptionPane.NO_OPTION) {
                    Gui.textDoc.setText("");
                }
            }
        });

        return newFile;
    }

    public static JButton open() {
        JButton open = new JButton("Open");
        ImageIcon openIcon = new ImageIcon("src/Images/open.png");
        open.setIcon(openIcon);

        open.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int reply = JOptionPane.showConfirmDialog(null, "Would you like to save your work?", "Save", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    save().doClick();
                }

                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showOpenDialog(open()) == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();


                }
            }
        });
        return open;
    }


    public static JButton save() {
        JButton save = new JButton("Save");
        ImageIcon saveIcon = new ImageIcon("src/Images/save.png");
        save.setIcon(saveIcon);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showSaveDialog(save()) == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();


                }
            }
        });

        return save;
    }

    public static JButton exit() {
        JButton exit = new JButton("Exit");
        ImageIcon exitIcon = new ImageIcon("src/Images/exit.png");
        exit.setIcon(exitIcon);
        return exit;
    }

    public static JButton export() {
        JButton export = new JButton("Export");
        ImageIcon exportIcon = new ImageIcon("src/Images/pdf.png");
        export.setIcon(exportIcon);
        return export;
    }

    public static JButton scene() {
        JButton scene = new JButton("Scene");
        ImageIcon sceneIcon = new ImageIcon("src/Images/scene.png");
        scene.setIcon(sceneIcon);
        return scene;
    }

    public static JButton action() {
        JButton action = new JButton("Action");
        ImageIcon actionIcon = new ImageIcon("src/Images/action.png");
        action.setIcon(actionIcon);
        return action;
    }

    public static JButton character() {
        JButton character = new JButton("Character");
        ImageIcon charIcon = new ImageIcon("src/Images/character.png");
        character.setIcon(charIcon);

        return character;
    }

    public static JButton paren() {
        JButton parentheses = new JButton("Paren");
        ImageIcon parenIcon = new ImageIcon("src/Images/paren.png");
        parentheses.setIcon(parenIcon);
        return parentheses;
    }

    public static JButton dialogue() {
        JButton dialogue = new JButton("Dialogue");
        ImageIcon dialogueIcon = new ImageIcon("src/Images/dialogue.png");
        dialogue.setIcon(dialogueIcon);
        return dialogue;
    }

    public static JButton transition() {
        JButton transition = new JButton("Transition");
        ImageIcon transIcon = new ImageIcon("src.Images/transition.png");
        transition.setIcon(transIcon);
        return transition;
    }




}
