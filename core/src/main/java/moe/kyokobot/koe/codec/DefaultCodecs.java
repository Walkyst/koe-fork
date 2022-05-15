package moe.kyokobot.koe.codec;

import java.util.HashMap;
import java.util.Map;

// todo: migrate to codec registry or something
public class DefaultCodecs {
    private DefaultCodecs() {
        //
    }

    public static final Map<String, Codec> audioCodecs;
    public static final Map<String, Codec> videoCodecs;

    static {
        audioCodecs = new HashMap<String, Codec>() {{
            put("opus", OpusCodec.INSTANCE);
        }};

        videoCodecs = new HashMap<String, Codec>() {{
            put("H264", H264Codec.INSTANCE);
            put("VP8", VP8Codec.INSTANCE);
            put("VP9", VP9Codec.INSTANCE);
        }};
    }
}
