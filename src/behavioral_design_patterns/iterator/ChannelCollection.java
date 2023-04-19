package behavioral_design_patterns.iterator;

import behavioral_design_patterns.iterator.domain.Channel;
import behavioral_design_patterns.iterator.domain.ChannelTypeEnum;

public interface ChannelCollection {
    void addChannel(Channel c);

    void removeChannel(Channel c);

    ChannelIterator iterator(ChannelTypeEnum type);
}
