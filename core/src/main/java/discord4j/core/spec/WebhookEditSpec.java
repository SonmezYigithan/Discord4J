/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.core.spec;

import discord4j.common.jackson.Possible;
import discord4j.rest.json.request.WebhookModifyRequest;

import javax.annotation.Nullable;

public class WebhookEditSpec implements AuditSpec<WebhookModifyRequest> {

    private Possible<String> name = Possible.absent();
    private Possible<String> avatar = Possible.absent();
    private String reason;

    public WebhookEditSpec setName(String name) {
        this.name = Possible.of(name);
        return this;
    }

    public WebhookEditSpec setAvatar(String avatar) {
        this.avatar = Possible.of(avatar);
        return this;
    }

    @Override
    public WebhookEditSpec setReason(final String reason) {
        this.reason = reason;
        return this;
    }

    @Nullable
    @Override
    public String getReason() {
        return reason;
    }

    @Override
    public WebhookModifyRequest asRequest() {
        return new WebhookModifyRequest(name, avatar);
    }
}
