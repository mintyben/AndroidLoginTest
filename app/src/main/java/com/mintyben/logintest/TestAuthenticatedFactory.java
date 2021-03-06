package com.mintyben.logintest;

import android.content.Context;

import com.google.common.base.Preconditions;

import javax.inject.Inject;

public class TestAuthenticatedFactory extends AbstractAuthenticatedTaskFactory {

    @Inject
    protected TestAuthenticatedFactory(IdentityModel identityModel) {
        super(identityModel);
    }

    public TestTask createTestTask(Context context, String message, TestTask.Handler resultHandler) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(resultHandler);

        return this.executeWithAuthentication(new TestTask(context, message, resultHandler));
    }
}
