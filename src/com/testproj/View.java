package com.testproj;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {

	public static final String ID = "com.sqilsoft.testproject.view"; //$NON-NLS-1$

	public View() {
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		{
			Button openForm1 = new Button(container, SWT.NONE);
			openForm1.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Form1 window = new Form1();
					window.open();
				}
			});
			openForm1.setBounds(10, 10, 90, 30);
			openForm1.setText("Form 1");
		}
		{
			Button openForm2 = new Button(container, SWT.NONE);
			openForm2.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Form2 window = new Form2();
					window.open();
				}
			});
			openForm2.setBounds(183, 10, 90, 30);
			openForm2.setText("Form 2");
		}
		{
			Button openDifferent = new Button(container, SWT.NONE);
			openDifferent.setBounds(381, 10, 129, 30);
			openDifferent.setText("Different view");
		}

		createActions();
		initializeToolBar();
		initializeMenu();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {

	}

	@Override
	public void setFocus() {
		
	}
}
