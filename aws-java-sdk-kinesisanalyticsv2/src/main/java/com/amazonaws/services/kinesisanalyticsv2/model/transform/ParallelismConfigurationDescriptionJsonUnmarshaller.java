/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalyticsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ParallelismConfigurationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParallelismConfigurationDescriptionJsonUnmarshaller implements Unmarshaller<ParallelismConfigurationDescription, JsonUnmarshallerContext> {

    public ParallelismConfigurationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ParallelismConfigurationDescription parallelismConfigurationDescription = new ParallelismConfigurationDescription();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ConfigurationType", targetDepth)) {
                    context.nextToken();
                    parallelismConfigurationDescription.setConfigurationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parallelism", targetDepth)) {
                    context.nextToken();
                    parallelismConfigurationDescription.setParallelism(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParallelismPerKPU", targetDepth)) {
                    context.nextToken();
                    parallelismConfigurationDescription.setParallelismPerKPU(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CurrentParallelism", targetDepth)) {
                    context.nextToken();
                    parallelismConfigurationDescription.setCurrentParallelism(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AutoScalingEnabled", targetDepth)) {
                    context.nextToken();
                    parallelismConfigurationDescription.setAutoScalingEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return parallelismConfigurationDescription;
    }

    private static ParallelismConfigurationDescriptionJsonUnmarshaller instance;

    public static ParallelismConfigurationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParallelismConfigurationDescriptionJsonUnmarshaller();
        return instance;
    }
}
