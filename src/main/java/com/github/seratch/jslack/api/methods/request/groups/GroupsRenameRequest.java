package com.github.seratch.jslack.api.methods.request.groups;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GroupsRenameRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String name;
}