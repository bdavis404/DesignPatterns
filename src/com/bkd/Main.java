package com.bkd;

import com.bkd.Decorator.CloudStream;
import com.bkd.Decorator.EncryptedCloudStream;
import com.bkd.Decorator.Stream;
import com.bkd.Observer.Chart;
import com.bkd.Observer.DataSource;
import com.bkd.Observer.SpreadSheet;
import com.bkd.state.*;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreadSheet sheet1 = new SpreadSheet();
        SpreadSheet sheet2 = new SpreadSheet();
        Chart chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);


    }

}
