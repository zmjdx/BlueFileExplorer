package com.ivt.fileexplorer;

import android.app.Application;
import android.content.Intent;

public class FileExplorerApp extends Application {

	public static final int THEME_BLACK = R.style.Theme_FileExplorer;
	public static final int THEME_WHITE = R.style.Theme_FileExplorer_Light;
	public static final int THEME_WHITE_BLACK = android.R.style.Theme_Holo_Light_DarkActionBar;
	
	
	public static final String ACTION_OPEN_BOOKMARK = "com.ivt.fileexplorer.action.OPEN_BOOKMARKS";
	public static final String ACTION_OPEN_FOLDER = "com.ivt.fileexplorer.action.OPEN_FOLDER";
	public static final String EXTRA_IS_PICKER = "com.ivt.fileexplorer.extra.IS_PICKER";
	public static final int REQ_PICK_FILE = 10;
	public static final int REQ_PICK_BOOKMARK = 11;
	public static final String EXTRA_SELECTED_BOOKMARK = "com.ivt.fileexplorer.extra.SELECTED_BOOKMARK";
	public static final String EXTRA_FOLDER = "com.ivt.fileexplorer.extra.FOLDER";
	
	private Intent fileAttachIntent;

	public Intent getFileAttachIntent() {
		return fileAttachIntent;
	}

	public void setFileAttachIntent(Intent fileAttachIntent) {
		this.fileAttachIntent = fileAttachIntent;
	}
	
	

}
