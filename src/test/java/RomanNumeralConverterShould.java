import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralConverterShould {
    private RomanNumeralConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new RomanNumeralConverter();
    }

    @Test
    public void zeroReturnsEmptyString() {
        assertEquals("", converter.convert(0));
    }

    @Test
    public void returnsIfor1(){
        assertEquals("I", converter.convert(1));
    }
//
    @Test
    public void returnsIIfor2() {
        assertEquals("II", converter.convert(2));
    }

    @Test
    public void returnsIIIfor3(){
        assertEquals("III", converter.convert(3));
    }

    @Test
    public void returnsVIfor6(){
        assertEquals("VI", converter.convert(6));
    }

    @Test
    public void returnsVIIfor7(){
        assertEquals("VII", converter.convert(7));
    }

    @Test
    public void returnsXfor10(){
        assertEquals("X", converter.convert(10));
    }

    @Test
    public void returnsXXfor20(){
        assertEquals("XX", converter.convert(20));
    }

    @Test
    public void returnsXXIIIfor23(){
        assertEquals("XXIII", converter.convert(23));
    }

    @Test
    public void returnsCfor100(){
        assertEquals("C", converter.convert(100));
    }

    @Test
    public void returnsXCfor90(){
        converter.convert(150);
        assertEquals("XC", converter.convert(90));
    }

//
////    @Test
////    public void returnsVfor5(){
////        assertEquals("V", converter.convert(5));
////    }
//
//    @Test
//    public void returnsVIfor6(){
//        assertEquals("VI", converter.convert(6));
//    }
//
////    @Test
////    public void returnsVIIfor7(){
////        assertEquals("VII", converter.convert(7));
////    }
////
////    @Test
////    public void returnsVIIIfor8(){
////        assertEquals("VIII", converter.convert(8));
////    }
}