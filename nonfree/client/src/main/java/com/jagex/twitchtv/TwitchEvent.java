package com.jagex.twitchtv;

import com.jagex.Class587;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEvent")
public abstract class TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "eventType", descriptor = "I")
	public int eventType;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "<init>", descriptor = "(I)V", line = 14)
	public TwitchEvent(@OriginalArg(0) int arg0) {
		this.eventType = arg0;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "c", descriptor = "()Lclient!uy;")
	public abstract Class587 c();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "v", descriptor = "()Lclient!uy;")
	public abstract Class587 v();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "l", descriptor = "()Lclient!uy;")
	public abstract Class587 l();

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "y", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void y(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "w", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void w(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEvent", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V")
	public abstract void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2);
}
