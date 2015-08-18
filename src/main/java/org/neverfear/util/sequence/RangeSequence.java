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
package org.neverfear.util.sequence;

public final class RangeSequence
	implements Sequence {

	private final long size;
	private final long lastExclusive;

	private long cursor = 0;

	public RangeSequence(final long firstInclusive, final long lastExclusive) {
		super();
		this.lastExclusive = lastExclusive;
		this.cursor = firstInclusive;
		this.size = lastExclusive - firstInclusive;
	}

	public long remaining() {
		return this.lastExclusive - this.cursor;
	}

	public long size() {
		return this.size;
	}

	public boolean isExhausted() {
		return remaining() == 0;
	}

	@Override
	public long next() {
		if (this.cursor == this.lastExclusive) {
			throw new SequenceException("Range exhausted");
		}
		return this.cursor++;
	}
}