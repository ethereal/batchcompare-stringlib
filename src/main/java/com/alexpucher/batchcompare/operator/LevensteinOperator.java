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

import com.wcohen.ss.Levenstein;

/**
 * String operator based on Levenstein's algorithm.
 * 
 * @author Alexander Pucher
 *
 */
public class LevensteinOperator extends AbstractStringOperator {
    
    private Levenstein levenstein = new Levenstein();

    @Override
    public int stringDifference(String base, String candidate) {
        return Math.abs((int)levenstein.score(base, candidate));
    }

}
