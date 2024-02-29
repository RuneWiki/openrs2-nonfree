package com.jagex.twitchtv;

import com.jagex.Class587;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventLiveStreams")
public class TwitchEventLiveStreams extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "streamCount", descriptor = "I")
	public int streamCount;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "channelUrls", descriptor = "[Ljava/lang/String;")
	public String[] channelUrls;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "previewUrlTemplates", descriptor = "[Ljava/lang/String;")
	public String[] previewUrlTemplates;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "streamTitles", descriptor = "[Ljava/lang/String;")
	public String[] streamTitles;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "channelDisplayNames", descriptor = "[Ljava/lang/String;")
	public String[] channelDisplayNames;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "viewerCounts", descriptor = "[I")
	public int[] viewerCounts;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "<init>", descriptor = "(II)V", line = 30)
	public TwitchEventLiveStreams(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super(arg0);
		this.streamCount = arg1;
		if (this.streamCount > 0) {
			this.channelUrls = new String[this.streamCount];
			this.previewUrlTemplates = new String[this.streamCount];
			this.streamTitles = new String[this.streamCount];
			this.channelDisplayNames = new String[this.streamCount];
			this.viewerCounts = new int[this.streamCount];
		}
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "SetStream", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 43)
	public void SetStream(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0 || arg0 >= this.streamCount) {
			return;
		}
		this.channelUrls[arg0] = arg1;
		this.previewUrlTemplates[arg0] = arg2;
		this.streamTitles[arg0] = arg3;
		this.channelDisplayNames[arg0] = arg4;
		this.viewerCounts[arg0] = arg5;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "c", descriptor = "()Lclient!uy;", line = 53)
	@Override
	public Class587 c() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "v", descriptor = "()Lclient!uy;", line = 53)
	@Override
	public Class587 v() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "l", descriptor = "()Lclient!uy;", line = 53)
	@Override
	public Class587 l() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V", line = 56)
	@Override
	public void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "y", descriptor = "([I[J[Ljava/lang/Object;)V", line = 56)
	@Override
	public void y(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "w", descriptor = "([I[J[Ljava/lang/Object;)V", line = 56)
	@Override
	public void w(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventLiveStreams", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V", line = 56)
	@Override
	public void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}
}
