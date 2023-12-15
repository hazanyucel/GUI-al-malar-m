  
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedBlockStackGUI {

    private JFrame frame;
    private JTextField nameField;
    private JButton enterButton;
    private JPanel stackPanel;
    private Stack stack;
    private String name;
    private int currentIndex;

    public AnimatedBlockStackGUI() {
        stack = new Stack();
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Animated Block Stack");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        nameField = new JTextField(20);
        enterButton = new JButton("Enter");
        stackPanel = new JPanel();
        stackPanel.setLayout(new BoxLayout(stackPanel, BoxLayout.Y_AXIS));

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nameField.getText();
                currentIndex = 0;
                enterButton.setEnabled(false);
                stackPanel.removeAll();
                animateStack();
            }
        });

        frame.add(nameField);
        frame.add(enterButton);
        frame.add(stackPanel);
        frame.setSize(300, 500);
        frame.setVisible(true);
    }

    private void animateStack() {
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentIndex < name.length()) {
                    char ch = name.charAt(currentIndex++);
                    stack.push(ch);
                    JPanel block = createBlock(ch);
                    stackPanel.add(block, 0);
                    frame.revalidate();
                } else {
                    ((Timer) e.getSource()).stop();
                    enterButton.setEnabled(true);
                }
            }
        });
        timer.start();
    }

    private JPanel createBlock(char ch) {
        JPanel block = new JPanel();
        block.setBackground(Color.LIGHT_GRAY);
        block.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        block.add(new JLabel(String.valueOf(ch)));
        block.setMaximumSize(new Dimension(50, 50));
        block.setAlignmentX(Component.CENTER_ALIGNMENT);
        return block;
    }

    private static class Stack {

        private Node top;

        public void push(char ch) {
            Node node = new Node(ch);
            node.next = top;
            top = node;
        }
    }

    private static class Node {

        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnimatedBlockStackGUI();
            }
        });
    }
}
