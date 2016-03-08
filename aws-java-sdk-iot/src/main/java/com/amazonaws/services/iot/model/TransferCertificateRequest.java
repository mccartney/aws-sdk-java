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

package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the TransferCertificate operation.
 * </p>
 */
public class TransferCertificateRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The AWS account.
     * </p>
     */
    private String targetAwsAccount;

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * 
     * @return The ID of the certificate.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferCertificateRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The AWS account.
     * </p>
     * 
     * @param targetAwsAccount
     *        The AWS account.
     */

    public void setTargetAwsAccount(String targetAwsAccount) {
        this.targetAwsAccount = targetAwsAccount;
    }

    /**
     * <p>
     * The AWS account.
     * </p>
     * 
     * @return The AWS account.
     */

    public String getTargetAwsAccount() {
        return this.targetAwsAccount;
    }

    /**
     * <p>
     * The AWS account.
     * </p>
     * 
     * @param targetAwsAccount
     *        The AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferCertificateRequest withTargetAwsAccount(
            String targetAwsAccount) {
        setTargetAwsAccount(targetAwsAccount);
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
        if (getCertificateId() != null)
            sb.append("CertificateId: " + getCertificateId() + ",");
        if (getTargetAwsAccount() != null)
            sb.append("TargetAwsAccount: " + getTargetAwsAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferCertificateRequest == false)
            return false;
        TransferCertificateRequest other = (TransferCertificateRequest) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getTargetAwsAccount() == null
                ^ this.getTargetAwsAccount() == null)
            return false;
        if (other.getTargetAwsAccount() != null
                && other.getTargetAwsAccount().equals(
                        this.getTargetAwsAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetAwsAccount() == null) ? 0 : getTargetAwsAccount()
                        .hashCode());
        return hashCode;
    }

    @Override
    public TransferCertificateRequest clone() {
        return (TransferCertificateRequest) super.clone();
    }
}