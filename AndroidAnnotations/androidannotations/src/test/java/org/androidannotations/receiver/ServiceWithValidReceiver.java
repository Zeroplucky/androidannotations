/**
 * Copyright (C) 2010-2014 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.receiver;

import org.androidannotations.annotations.EService;
import org.androidannotations.annotations.Receiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

@EService
public class ServiceWithValidReceiver extends Service {

	@Receiver(actions = "org.androidannotations.ACTION_1")
	protected void onActionOnCreate() {

	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
}
