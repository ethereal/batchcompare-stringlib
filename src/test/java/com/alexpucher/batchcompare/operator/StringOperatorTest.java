/**
 *    Copyright 2011 Alexander Pucher
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.alexpucher.batchcompare.operator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.alexpucher.batchcompare.Pair;
import com.alexpucher.batchcompare.processor.PairImpl;

/**
 * Test suite for StringOperator implementations.
 * NOTE: StringOperatorTest aims at testing the correctness of the adapter
 * implementation rather than the correctness of the underlying algorithm.
 * 
 * @author Alexander Pucher
 * 
 */
public class StringOperatorTest {
    
    private static final String stringBase = "base string";
    private static final String stringCandidate = "candidate string";
    
    private Pair pairEqual;
    private Pair pairDifferent;

    @Before
    public void setUp() throws Exception {
        pairEqual = new PairImpl(stringBase, stringBase);
        pairDifferent = new PairImpl(stringBase, stringCandidate);
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void levensteinTest() {
        AbstractStringOperator operator = new LevensteinOperator();
        
        assertEquals(0, operator.execute(pairEqual).getDifference());
        assertTrue(0 < operator.execute(pairDifferent).getDifference());
    }
    

}
