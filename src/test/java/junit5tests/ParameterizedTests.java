package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {


    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6,1,5,6,1,5,6,1,5,6,1,5,6,1,5,6})
    void intValues(int theParam){

        System.out.println("TheParam = "+theParam);

    }

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"First String", "Second string"})
    void stringValues(String theParam){

        System.out.println("TheParam = "+theParam);

    }

    @ParameterizedTest
    @CsvSource(value = {"steve,rogers","captain,marvel","bucky,barnes"})
    void csvSource_stringString(String theParam1, String theParam2){
        System.out.println("TheParam1 = "+theParam1+", theParam2 = "+ theParam2);

    }

    @ParameterizedTest
    @CsvSource(value = {"steve,32,true","captain,21,false","bucky,5,true"})
    void csvSource_stringIntBoolean(String theParam1, int theParam2, boolean theParam3){
        System.out.println("TheParam1 = "+theParam1+", theParam2 = "+ theParam2+", theParam3 = "+ theParam3);

    }

    @ParameterizedTest
    @CsvSource(value = {"captain america,'steve,rogers'","winter soldier,'bucky,barnes'"})
    void csvSource_stringIWithComa(String theParam1, String theParam2){
        System.out.println("TheParam1 = "+theParam1+", theParam2 = "+ theParam2);

    }

    @ParameterizedTest
    @CsvSource(value = {"steve°rogers","bucky°barnes"}, delimiter = '°')
    void csvSource_stringWithDifferentDeliiter(String theParam1, String theParam2){
        System.out.println("TheParam1 = "+theParam1+", theParam2 = "+ theParam2);

    }


}
