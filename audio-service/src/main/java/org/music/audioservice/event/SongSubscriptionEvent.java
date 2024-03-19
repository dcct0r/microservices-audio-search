package org.music.audioservice.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongSubscriptionEvent {
    private String message;
    private String status;
}
