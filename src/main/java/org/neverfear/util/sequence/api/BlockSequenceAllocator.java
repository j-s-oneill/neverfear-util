/*
 * Copyright 2014 doug@neverfear.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neverfear.util.sequence.api;

import org.neverfear.util.sequence.AllocationException;

/**
 * @author doug@neverfear.org
 * 
 */
public interface BlockSequenceAllocator {

	/**
	 * 
	 * @return the range of sequences allocated
	 * @throws AllocationException TODO
	 */
	RangeSequence allocate() throws AllocationException;

}