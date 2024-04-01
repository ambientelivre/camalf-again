/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.camunda.bpm.extension.alfresco.createdirectory;

import java.util.List;
import javax.mail.Message;
import org.camunda.connect.impl.AbstractRequestInvocation;
import org.camunda.connect.spi.ConnectorRequestInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateDirectoryInvocation extends AbstractRequestInvocation<Message> {

  private static final Logger LOGGER = LoggerFactory.getLogger(CreateDirectoryInvocation.class);

  public CreateDirectoryInvocation(
      Message message,
      CreateDirectoryRequest request,
      List<ConnectorRequestInterceptor> requestInterceptors) {
    super(message, request, requestInterceptors);
  }

  @Override
  public Object invokeTarget() throws Exception {
    Message message = target;
    // LOGGER.debug("send '{}'", Mail.from(message));
    return null;
  }
}
