/*
 * $Id$
 *
 * Copyright 2006-2008 Alex Lin. All rights reserved.
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
package org.opoo.oqs;

import org.opoo.oqs.type.Type;

/**
 *
 * @author Alex Lin(alex@opoo.org)
 * @version 1.0
 */
public class TypedValue {
    private Object value;
    private Type type;

    public TypedValue(Object value, Type type) {
        this.value = value;
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public String toString() {
        return "[" + ((value == null) ? "null" : value.toString())
                + ", " + type.getReturnedClass().getName() + "]";
    }
}
