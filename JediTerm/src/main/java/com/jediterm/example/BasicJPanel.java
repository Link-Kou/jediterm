package com.jediterm.example;

import javax.swing.*;
import java.awt.*;

/**
 * A <code>BasicJPanel</code> Class
 *
 * @author lk
 * @version 1.0
 * <p><b>date: 2023/7/27 17:20</b></p>
 */
public class BasicJPanel extends JPanel {

  public BasicJPanel(LayoutManager layout, boolean isDoubleBuffered) {
    super(layout, isDoubleBuffered);
  }

  public BasicJPanel(LayoutManager layout) {
    super(layout);
  }

  public BasicJPanel(boolean isDoubleBuffered) {
    super(isDoubleBuffered);
  }

  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g.create();
    int width = getWidth();
    int height = getHeight();
    g2d.setColor(new Color(255, 0, 0, 255));
    g2d.fillRoundRect(0, 0, width, height, 0, 0);
    g2d.dispose();
  }
}
