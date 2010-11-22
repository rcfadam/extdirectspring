/**
 * Copyright 2010 Ralph Schaer <ralphschaer@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.ralscha.extdirectspring.bean;

import java.util.Arrays;

/**
 * Class representing the request of a Ext.Direct call
 * 
 * @author mansari
 * @author Ralph Schaer
 */
public class ExtDirectRequest {

	private String action;
	private String method;
	private String type;
	private int tid;
	private Object[] data;

	public String getAction() {
		return action;
	}

	public void setAction(final String action) {
		this.action = action;
	}

	public Object[] getData() {
		return data;
	}

	public void setData(final Object[] data) {
		this.data = data;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(final String method) {
		this.method = method;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(final int tid) {
		this.tid = tid;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ExtDirectRequest [action=" + action + ", data=" + Arrays.toString(data) + ", method=" + method
				+ ", tid=" + tid + ", type=" + type + "]";
	}

}