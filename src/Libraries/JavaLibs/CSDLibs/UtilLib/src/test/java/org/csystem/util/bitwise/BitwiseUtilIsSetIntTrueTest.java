package org.csystem.util.bitwise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class BitwiseUtilIsSetIntTrueTest {
    private final DataInfo m_dataInfo;

    private static class DataInfo {
        int value;
        int k;

        DataInfo(int value, int k)
        {
            this.value = value;
            this.k = k;
        }
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> provideData()
    {
        return Arrays.asList(new DataInfo(0b00101110, 2),
                new DataInfo(0b00101010, 3),
                new DataInfo(0b10101110, 7));
    }

    public BitwiseUtilIsSetIntTrueTest(DataInfo dataInfo)
    {
        m_dataInfo = dataInfo;
    }

    @Test
    public void givenValueAndBitIndex_whenValueIsInt_thenReturnTrue()
    {
        assertTrue(BitwiseUtil.isSet(m_dataInfo.value, m_dataInfo.k));
    }
}
