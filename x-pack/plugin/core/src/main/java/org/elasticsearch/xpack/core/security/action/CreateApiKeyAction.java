/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.core.security.action;

import org.elasticsearch.action.Action;
import org.elasticsearch.common.io.stream.Writeable;

/**
 * Action for the creation of an API key
 */
public final class CreateApiKeyAction extends Action<CreateApiKeyResponse> {

    public static final String NAME = "cluster:admin/xpack/security/api_key/create";
    public static final CreateApiKeyAction INSTANCE = new CreateApiKeyAction();

    private CreateApiKeyAction() {
        super(NAME);
    }

    @Override
    public CreateApiKeyResponse newResponse() {
        throw new UnsupportedOperationException("usage of Streamable is to be replaced by Writeable");
    }

    @Override
    public Writeable.Reader<CreateApiKeyResponse> getResponseReader() {
        return CreateApiKeyResponse::new;
    }
}
