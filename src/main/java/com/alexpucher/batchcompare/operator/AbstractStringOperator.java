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

import com.alexpucher.batchcompare.Operator;
import com.alexpucher.batchcompare.Pair;

/**
 * Skeleton implementation of String operator. Override
 * {@link AbstractStringOperator#stringDifference(String, String)} to return
 * a positive difference value.
 * 
 * @author Alexander Pucher
 * 
 */
public abstract class AbstractStringOperator implements Operator {

    @Override
    public Pair execute(Pair pair) {
        String base = (String) pair.getBase();
        String candidate = (String) pair.getCandidate();

        pair.setDifference(stringDifference(base, candidate));

        return pair;
    }

    /**
     * Determine the difference of two Strings.
     * 
     * @param base
     *            base string
     * @param candidate
     *            candidate string
     * @return difference value
     */
    public abstract int stringDifference(String base, String candidate);

}
