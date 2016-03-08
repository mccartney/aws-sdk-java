/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateDocumentRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A valid JSON string. For more information about the contents of this
     * string, see <a href=
     * "http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html"
     * >SSM Document</a>.
     * </p>
     */
    private String content;
    /**
     * <p>
     * A name for the SSM document.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A valid JSON string. For more information about the contents of this
     * string, see <a href=
     * "http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html"
     * >SSM Document</a>.
     * </p>
     * 
     * @param content
     *        A valid JSON string. For more information about the contents of
     *        this string, see <a href=
     *        "http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html"
     *        >SSM Document</a>.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * A valid JSON string. For more information about the contents of this
     * string, see <a href=
     * "http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html"
     * >SSM Document</a>.
     * </p>
     * 
     * @return A valid JSON string. For more information about the contents of
     *         this string, see <a href=
     *         "http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html"
     *         >SSM Document</a>.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * A valid JSON string. For more information about the contents of this
     * string, see <a href=
     * "http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html"
     * >SSM Document</a>.
     * </p>
     * 
     * @param content
     *        A valid JSON string. For more information about the contents of
     *        this string, see <a href=
     *        "http://docs.aws.amazon.com/ssm/latest/APIReference/aws-ssm-document.html"
     *        >SSM Document</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDocumentRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A name for the SSM document.
     * </p>
     * 
     * @param name
     *        A name for the SSM document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the SSM document.
     * </p>
     * 
     * @return A name for the SSM document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the SSM document.
     * </p>
     * 
     * @param name
     *        A name for the SSM document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentRequest == false)
            return false;
        CreateDocumentRequest other = (CreateDocumentRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null
                && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateDocumentRequest clone() {
        return (CreateDocumentRequest) super.clone();
    }
}