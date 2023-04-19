package behavioral_design_patterns.iterator.domain;

public class Channel {
    private final double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double freq, ChannelTypeEnum type) {
        this.frequency = freq;
        this.TYPE = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Frequency: " + this.frequency + ", Type: " + this.TYPE;
    }
}
