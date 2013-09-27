package com.example;

import java.io.File;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
 
public class Zip 
{

	
	public void create(String filePath, String zipPath)
    {
        try {
       
        	//path where zip file is
        	ZipFile zipFile = new ZipFile(zipPath);
            //csv file path
            File fileToAdd = new File(filePath);
            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
            parameters.setEncryptFiles(true);
            parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
            parameters.setPassword("karan@123");
            zipFile.addFile(fileToAdd, parameters);
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
	
    
 
}
