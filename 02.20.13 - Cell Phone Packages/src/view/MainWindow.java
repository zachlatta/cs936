package view;

import model.*;
import model.Package;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.List;

/**
 * Application main window. Allows the user to select one package, one phone, and any of the options desired. As the
 * user selects items from the menu, the prices of the items selected is shown.
 */
public class MainWindow
{
    List<CellPhonePackage> packages;
    List<Package> additionalPackages;
    List<Phone> phones;

    double subtotal;

    JFrame frame;
    JPanel pane;
    GridBagConstraints c;
    JList packagesList;
    JList additionalPackagesList;
    JList phonesList;
    JLabel subtotalLabel;

    public MainWindow(List<CellPhonePackage> packages, List<Package> additionalPackages, List<Phone> phones)
    {
        this.packages = packages;
        this.additionalPackages = additionalPackages;
        this.phones = phones;

        subtotal = 0;

        frame = new JFrame("Cell Phone Packages");
        pane = new JPanel(new GridBagLayout());
        c = new GridBagConstraints();

        packagesList = new JList(packages.toArray());
        additionalPackagesList = new JList(additionalPackages.toArray());
        phonesList = new JList(phones.toArray());

        subtotalLabel = new JLabel("Subtotal: $" + subtotal);

        packagesList.addListSelectionListener(new ItemSelectionListener());
        additionalPackagesList.addListSelectionListener(new ItemSelectionListener());
        phonesList.addListSelectionListener(new ItemSelectionListener());

        setupAndShowGUI();
    }

    private void setupAndShowGUI()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(pane);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(packagesList, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(phonesList, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(additionalPackagesList, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(subtotalLabel, c);

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Calculates a new subtotal and sets the label to reflect the new value. After setting the new value, the current
     * display is invalidated to have the window redrawn and the JList is set to read-only.
     */
    private class ItemSelectionListener implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent e)
        {
            List<Object> selected = ((JList) e.getSource()).getSelectedValuesList();

            for(Object product : selected)
            {
                subtotal += ((Product) product).PRICE;
            }

            subtotalLabel.setText("Subtotal: $" + subtotal);
            frame.invalidate();

            ((JList) e.getSource()).setEnabled(false);
        }
    }
}
