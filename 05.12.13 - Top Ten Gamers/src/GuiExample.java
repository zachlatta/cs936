import javax.swing.*;
import java.awt.*;

public class GuiExample implements Runnable
{
    @Override
    public void run()
    {
        JFrame f = new JFrame("Top Ten Gamers");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        GuiExample app = new GuiExample();
        SwingUtilities.invokeLater(app);
    }
}
