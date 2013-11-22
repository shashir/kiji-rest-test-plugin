/**
 * (c) Copyright 2013 WibiData, Inc.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kiji.rest.testplugin;

import com.yammer.dropwizard.config.Environment;

import org.kiji.rest.KijiClient;
import org.kiji.rest.KijiRESTConfiguration;
import org.kiji.rest.plugins.KijiRestPlugin;


/**
 * Installs default KijiREST endpoints into the Dropwizard environment.
 */
public class TestPlugin implements KijiRestPlugin {

  @Override
  public void install(
      final KijiClient kijiClient,
      final KijiRESTConfiguration configuration,
      final Environment environment) {

    // Adds resources.
    environment.addResource(new TestResource());
  }
}
