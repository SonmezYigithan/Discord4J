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
package discord4j.gateway.json.dispatch;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.common.jackson.UnsignedJson;
import reactor.util.annotation.Nullable;

public class MessageReactionRemoveAll implements Dispatch {

    @JsonProperty("channel_id")
    @UnsignedJson
    private long channelId;
    @JsonProperty("message_id")
    @UnsignedJson
    private long messageId;
    @JsonProperty("guild_id")
    @Nullable
    @UnsignedJson
    private Long guildId;

    public long getChannelId() {
        return channelId;
    }

    public long getMessageId() {
        return messageId;
    }

    @Nullable
    public Long getGuildId() {
        return guildId;
    }

    @Override
    public String toString() {
        return "MessageReactionRemoveAll{" +
                "channelId=" + channelId +
                ", messageId=" + messageId +
                ", guildId=" + guildId +
                '}';
    }
}
