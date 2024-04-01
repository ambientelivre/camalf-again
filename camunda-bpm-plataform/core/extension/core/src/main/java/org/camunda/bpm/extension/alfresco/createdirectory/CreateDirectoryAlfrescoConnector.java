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

import org.camunda.bpm.extension.alfresco.EmptyResponse;
import org.camunda.connect.impl.AbstractConnector;
import org.camunda.connect.spi.ConnectorResponse;

public class CreateDirectoryAlfrescoConnector
    extends AbstractConnector<CreateDirectoryRequest, EmptyResponse> {

  public static final String CONNECTOR_ID = "alfresco-create-directory";

  public CreateDirectoryAlfrescoConnector() {
    super(CONNECTOR_ID);
  }

  @Override
  public CreateDirectoryRequest createRequest() {
    return new CreateDirectoryRequest(this);
  }

  @Override
  public ConnectorResponse execute(CreateDirectoryRequest request) {

    return new EmptyResponse();
  }

  protected boolean hasContent(CreateDirectoryRequest request) {
    return request.getText() != null
        || request.getHtml() != null
        || request.getFileNames() != null && !request.getFileNames().isEmpty();
  }

  protected boolean isTextOnlyMessage(CreateDirectoryRequest request) {
    return request.getHtml() == null
        && request.getFileNames() == null
        && request.getFiles() == null;
  }
}
