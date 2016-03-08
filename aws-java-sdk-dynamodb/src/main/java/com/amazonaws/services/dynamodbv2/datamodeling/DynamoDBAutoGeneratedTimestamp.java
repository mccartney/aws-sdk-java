/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for marking a property as auto-generatable.
 *
 * Please note, only {@code java.util.Calendar}, {@code java.util.Date} and
 * {@code java.lang.Long} are supported for now. Primitives such as {@code long}
 * are not supported since the unset (or null) state can't be detected.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBAutoGeneratedTimestamp {

    /**
     * The auto-generation strategy; default is {@code ALWAYS}.
     * @see DynamoDBAutoGenerateStrategy.ALWAYS
     */
    DynamoDBAutoGenerateStrategy strategy() default DynamoDBAutoGenerateStrategy.ALWAYS;

}
