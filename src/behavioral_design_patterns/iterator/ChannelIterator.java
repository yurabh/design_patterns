package behavioral_design_patterns.iterator;

import behavioral_design_patterns.iterator.domain.Channel;

public interface ChannelIterator {
    boolean hasNext();

    Channel next();
}
