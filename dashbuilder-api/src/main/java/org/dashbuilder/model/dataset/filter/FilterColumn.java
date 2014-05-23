/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.model.dataset.filter;

import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * Base class for defining a filter over a data set column.
 */
public abstract class FilterColumn {

    protected String columnId = null;

    public FilterColumn() {
    }

    public FilterColumn(String columnId) {
        this.columnId = columnId;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public boolean equals(Object obj) {
        try {
            FilterColumn other = (FilterColumn) obj;
            if (columnId != null && !columnId.equals(other.columnId)) return false;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }
}