/*
 * Copyright (c) 2010 Nimbits Inc.
 *
 * http://www.nimbits.com
 *
 *
 * Licensed under the GNU GENERAL PUBLIC LICENSE, Version 3.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the license is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, eitherexpress or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.user;

import com.nimbits.client.model.email.*;

/**
 * Created by bsautner
 * User: benjamin
 * Date: 3/13/11
 * Time: 12:31 PM
 */
public class NimbitsUser {
    private EmailAddress emailAddress;
    private String nimbitsSecretKey;

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public String getNimbitsSecretKey() {
        return this.nimbitsSecretKey;
    }


    private NimbitsUser() {
    }

    public NimbitsUser(final EmailAddress emailAddress, final String k) {
        this.emailAddress = emailAddress;
        this.nimbitsSecretKey = k;
    }

}
