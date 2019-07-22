package com.aditya;

import java.io.File;
import java.io.FilenameFilter;

public class HtmlFileFilter implements FilenameFilter {
    @Override
    public boolean accept(File file, String s) {
        return false;
    }
}
