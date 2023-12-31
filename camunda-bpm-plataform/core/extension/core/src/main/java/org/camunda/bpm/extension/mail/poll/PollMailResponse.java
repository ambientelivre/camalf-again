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
package org.camunda.bpm.extension.mail.poll;

import java.util.List;
import java.util.Map;
import org.camunda.bpm.extension.mail.dto.Mail;
import org.camunda.connect.impl.AbstractConnectorResponse;

public class PollMailResponse extends AbstractConnectorResponse {

  public static final String PARAM_MAILS = "mails";
  protected final List<Mail> messages;

  public PollMailResponse(List<Mail> messages) {
    this.messages = messages;
  }

  @Override
  protected void collectResponseParameters(Map<String, Object> responseParameters) {

    responseParameters.put(PARAM_MAILS, messages);
  }

  public List<Mail> getMails() {
    return getResponseParameter(PARAM_MAILS);
  }

  @Override
  public String toString() {
    return "PollMailResponse [messages=" + messages + "]";
  }
}
