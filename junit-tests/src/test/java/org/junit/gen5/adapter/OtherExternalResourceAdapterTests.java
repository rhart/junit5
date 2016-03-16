/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.gen5.adapter;

import org.junit.Rule;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;
import org.junit.rules.TemporaryFolder;


public class OtherExternalResourceAdapterTests {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@BeforeEach
	void setup() {
        try {
            folder.newFile("temp.txt");
        } catch (Exception exception) {

            System.out.println("exception = " + exception.getMessage());
            assert exception.getMessage().equals("the temporary folder has not yet been created");

        }
    }


    @Test
    void checkTemporaryFolder() {
    }



}