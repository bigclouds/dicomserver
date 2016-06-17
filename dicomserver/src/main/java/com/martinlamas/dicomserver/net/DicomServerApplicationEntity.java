/* ***** BEGIN LICENSE BLOCK *****
 * The MIT License (MIT)
 * 
 * Copyright (c) 2016 Martín Lamas
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * ***** END LICENSE BLOCK ***** */

package com.martinlamas.dicomserver.net;

import java.io.File;

import org.dcm4che3.net.ApplicationEntity;

@SuppressWarnings("serial")
public class DicomServerApplicationEntity extends ApplicationEntity {
	private File storageDirectory;
	
	public DicomServerApplicationEntity(String aeTitle, File storageDirectory) {
		super(aeTitle);
		this.storageDirectory = storageDirectory;
	}

	public File getStorageDirectory() {
		return storageDirectory;
	}

	public void setStorageDirectory(File storageDirectory) {
		this.storageDirectory = storageDirectory;
	}
}
