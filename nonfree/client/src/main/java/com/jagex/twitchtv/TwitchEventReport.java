package com.jagex.twitchtv;

import com.jagex.Class587;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventReport")
public class TwitchEventReport extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "message", descriptor = "Ljava/lang/String;")
	public String message;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 15)
	public TwitchEventReport(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		super(arg0);
		this.message = arg1;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "y", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void y(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "w", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void w(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "t", descriptor = "([I[J[Ljava/lang/Object;)V", line = 20)
	@Override
	public void t(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg0[0] = this.eventType;
		arg2[0] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "c", descriptor = "()Lclient!uy;", line = 25)
	@Override
	public Class587 c() {
		return Class587.aClass587_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "v", descriptor = "()Lclient!uy;", line = 25)
	@Override
	public Class587 v() {
		return Class587.aClass587_2;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventReport", name = "l", descriptor = "()Lclient!uy;", line = 25)
	@Override
	public Class587 l() {
		return Class587.aClass587_2;
	}
}
