package com.jagex.twitchtv;

import com.jagex.Class587;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventResult")
public class TwitchEventResult extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "result", descriptor = "I")
	public int result;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "<init>", descriptor = "(II)V", line = 15)
	public TwitchEventResult(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super(arg0);
		this.result = arg1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "y", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void y(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "w", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void w(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg0[1] = this.result;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "c", descriptor = "()Lclient!uy;", line = 25)
	@Override
	public Class587 c() {
		return Class587.aClass587_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "v", descriptor = "()Lclient!uy;", line = 25)
	@Override
	public Class587 v() {
		return Class587.aClass587_1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventResult", name = "l", descriptor = "()Lclient!uy;", line = 25)
	@Override
	public Class587 l() {
		return Class587.aClass587_1;
	}
}
