package com.testproj;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Text;

public class Form2 {
	
	public static final String ID = "com.sqilsoft.testproject.form2";

	protected Shell shlSwtApplication;
	ArrayList<String> listName = new ArrayList<String>();
	private String [] listNameStr = new String[3];
	private Text textEditForm2;
	private Text textAddForm2;
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Form1 window = new Form1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSwtApplication.open();
		shlSwtApplication.layout();
		while (!shlSwtApplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		
		listName.add("Fury");
		listName.add("Alex");
		listName.add("Jenny");
		
		shlSwtApplication = new Shell();
		shlSwtApplication.setSize(886, 520);
		shlSwtApplication.setText("Form 2");
		
		ListViewer listViewer = new ListViewer(shlSwtApplication, SWT.BORDER | SWT.V_SCROLL);
		org.eclipse.swt.widgets.List listForm2 = listViewer.getList();
		listForm2.setBounds(10, 71, 274, 236);
		
		for (int i=0; i<listName.size(); i++){
			listForm2.setItems(listName.get(i));
			listNameStr[i] = listName.get(i);
			}
		listForm2.setItems(listNameStr);
		
		Button sortingForm2 = new Button(shlSwtApplication, SWT.NONE);
		sortingForm2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Collections.sort(listName);
				for (int i=0; i<listName.size(); i++){
				listForm2.setItems(listName.get(i));
				listNameStr[i] = listName.get(i);
				}
				listForm2.setItems(listNameStr);	
			}
		});
		sortingForm2.setBounds(10, 10, 133, 30);
		sortingForm2.setText("Sort by Name");	
		
		Button editForm2 = new Button(shlSwtApplication, SWT.NONE);
		editForm2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		editForm2.setText("Edit");
		editForm2.setBounds(329, 71, 90, 30);
		
		Button addForm2 = new Button(shlSwtApplication, SWT.NONE);
		addForm2.setText("Add");
		addForm2.setBounds(329, 181, 90, 30);
		
		Button deleteForm2 = new Button(shlSwtApplication, SWT.NONE);
		deleteForm2.setText("Delete");
		deleteForm2.setBounds(329, 278, 90, 30);
		
		textEditForm2 = new Text(shlSwtApplication, SWT.BORDER);
		textEditForm2.setBounds(581, 73, 232, 49);
		
		textAddForm2 = new Text(shlSwtApplication, SWT.BORDER);
		textAddForm2.setBounds(581, 183, 232, 60);
	}
}
