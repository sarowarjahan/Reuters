package dataToSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by sarowar on 1/16/17.
 */
public class ItemToBeSearched {

    DataReader dr = new DataReader();
    public String [] getData()throws IOException {
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }


}
