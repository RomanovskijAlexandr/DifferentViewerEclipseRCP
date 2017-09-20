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

public class Form1 {
	
	public static final String ID = "com.sqilsoft.testproject.form1";

	protected Shell shlSwtApplication;
	ArrayList<String> listName = new ArrayList<String>();
	private String [] listNameStr = new String[3];
	private Text textEditForm1;
	private Text textAddForm1;
	

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
	 */
	protected void createContents() {
		
		listName.add("Jury");
		listName.add("Eric");
		listName.add("Max");
		
		shlSwtApplication = new Shell();
		shlSwtApplication.setSize(886, 520);
		shlSwtApplication.setText("Form 1");
		
		ListViewer listViewer = new ListViewer(shlSwtApplication, SWT.BORDER | SWT.V_SCROLL);
		org.eclipse.swt.widgets.List listForm1 = listViewer.getList();
		listForm1.setBounds(10, 71, 274, 236);
		
		for (int i=0; i<listName.size(); i++){
			listForm1.setItems(listName.get(i));
			listNameStr[i] = listName.get(i);
			}
		listForm1.setItems(listNameStr);
		
		Button sortingForm1 = new Button(shlSwtApplication, SWT.NONE);
		sortingForm1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Collections.sort(listName);
				for (int i=0; i<listName.size(); i++){
				listForm1.setItems(listName.get(i));
				listNameStr[i] = listName.get(i);
				}
				listForm1.setItems(listNameStr);	
			}
		});
		sortingForm1.setBounds(10, 10, 133, 30);
		sortingForm1.setText("Sort by Name");	
		
		textEditForm1 = new Text(shlSwtApplication, SWT.BORDER);
		textEditForm1.setBounds(594, 72, 232, 49);
		
		Button editForm1 = new Button(shlSwtApplication, SWT.NONE);
		editForm1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		editForm1.setBounds(342, 70, 90, 30);
		editForm1.setText("Edit");
		
		Button deleteForm1 = new Button(shlSwtApplication, SWT.NONE);
		deleteForm1.setBounds(342, 277, 90, 30);
		deleteForm1.setText("Delete");
		
		Button addForm1 = new Button(shlSwtApplication, SWT.NONE);
		addForm1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		addForm1.setBounds(342, 180, 90, 30);
		addForm1.setText("Add");
		
		textAddForm1 = new Text(shlSwtApplication, SWT.BORDER);
		textAddForm1.setBounds(594, 182, 232, 60);
	}
}
