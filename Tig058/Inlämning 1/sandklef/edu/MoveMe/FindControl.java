package com.sandklef.edu.MoveMe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FindControl extends JPanel implements ActionListener {

    private Field f;
    private JButton recursive;
    private JButton barrier;
    private JButton cleanAll;
    private JButton cleanFoot;

    public FindControl(Field f) {
	this.f = f;
	setMinimumSize(new Dimension(2, 20));
	setVisible(true);
	setLayout(new GridLayout(3,1));

	JPanel buttonPanel = new JPanel();
	buttonPanel.setLayout(new GridBagLayout());
	GridBagLayout layout = (GridBagLayout)buttonPanel.getLayout();
	GridBagConstraints c = (GridBagConstraints) layout.getConstraints(this);
	c.gridx = 0;
	c.gridy = 1;	
	recursive = new JButton("Recursive");
	buttonPanel.add(recursive, c);

	c.gridx = 0;
	c.gridy = 2;	
	barrier = new JButton("Create barriers");
	buttonPanel.add(barrier, c);

	c.gridx = 0;
	c.gridy = 3;	
	cleanAll = new JButton("Clean all");
	buttonPanel.add(cleanAll, c);

	c.gridx = 0;
	c.gridy = 4;	
	cleanFoot = new JButton("Clean foot");
	buttonPanel.add(cleanFoot, c);

	recursive.addActionListener(this);
	barrier.addActionListener(this);
	cleanAll.addActionListener(this);
	cleanFoot.addActionListener(this);
	
	add(buttonPanel);
    }

    
    public void actionPerformed(ActionEvent e) {
	Object o = e.getSource();
	if (o==recursive) {
	    FindPath fp = new FindPath();
	    fp.init(f, f.getStart());

	    Thread t = new Thread(fp);
	    t.start();
	    
	} else if (o==barrier) {
	    f.createRandomBarriers(f.getCols()*f.getRows()/4);
	} else if (o==cleanAll) {
	    f.cleanBarriers();
	} else if (o==cleanFoot) {
	    f.cleanFoot();
	}
    }

}