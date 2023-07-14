package sample1;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ButtonExample extends JFrame {

    private JPanel contentPane;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ButtonExample frame = new ButtonExample();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ButtonExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1280, 720);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        setContentPane(cardPanel);

        JPanel homePanel = createHomePanel();
        JPanel empInfoPanel = createEmpInfoPanel();
        JPanel salaryPanel = createSalaryPanel();
        JPanel calculationPanel = createCalculationPanel();
        JPanel frontPanel = createFrontPanel();

        cardPanel.add(homePanel, "Home");
        cardPanel.add(empInfoPanel, "EmpInfo");
        cardPanel.add(salaryPanel, "Salary");
        cardPanel.add(calculationPanel, "Calculation");
        cardPanel.add(frontPanel, "Front");

        cardLayout.show(cardPanel, "Home");
    }

    private JPanel createHomePanel() {
        JPanel homePanel = new JPanel();
        // Add components and button actions for Home panel
        // ...

        return homePanel;
    }

    private JPanel createEmpInfoPanel() {
        JPanel empInfoPanel = new JPanel();
        // Add components and button actions for EmpInfo panel
        // ...

        return empInfoPanel;
    }

    private JPanel createSalaryPanel() {
        JPanel salaryPanel = new JPanel();
        // Add components and button actions for Salary panel
        // ...

        return salaryPanel;
    }

    private JPanel createCalculationPanel() {
        JPanel calculationPanel = new JPanel();
        // Add components and button actions for Calculation panel
        // ...

        return calculationPanel;
    }

    private JPanel createFrontPanel() {
        JPanel frontPanel = new JPanel();
        // Add components and button actions for Front panel
        // ...

        return frontPanel;
    }
}
