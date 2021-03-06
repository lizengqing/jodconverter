/*
 * Copyright 2004 - 2012 Mirko Nasato and contributors
 *           2016 - 2019 Simon Braconnier and contributors
 *
 * This file is part of JODConverter - Java OpenDocument Converter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jodconverter.task;

import org.jodconverter.job.SourceDocumentSpecs;

/**
 * Base class for all online office tasks implementation.
 *
 * @see org.jodconverter.task.OfficeTask
 */
public abstract class AbstractOnlineOfficeTask extends AbstractOfficeTask {

  /**
   * Creates a new task with the specified source document.
   *
   * @param source The source specifications of the document.
   */
  public AbstractOnlineOfficeTask(final SourceDocumentSpecs source) {
    super(source);
  }
}
