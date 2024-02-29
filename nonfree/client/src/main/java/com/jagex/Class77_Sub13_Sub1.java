package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqb")
public class Class77_Sub13_Sub1 extends Class77_Sub13 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqb", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqb", name = "l", descriptor = "J")
	long aLong129;

	@OriginalMember(owner = "client!aqb", name = "y", descriptor = "Ljava/lang/String;")
	String aString87;

	@OriginalMember(owner = "client!aqb", name = "<init>", descriptor = "(Lclient!km;)V", line = 181)
	Class77_Sub13_Sub1(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
		this.aLong129 = -6741299966315390615L;
		this.aString87 = null;
	}

	@OriginalMember(owner = "client!aqb", name = "p", descriptor = "(Lclient!akv;I)V", line = 184)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			this.aLong129 = arg0.method22510() * 6741299966315390615L;
		}
		this.aString87 = arg0.method22520();
	}

	@OriginalMember(owner = "client!aqb", name = "v", descriptor = "(Lclient!akv;)V", line = 184)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			this.aLong129 = arg0.method22510() * 6741299966315390615L;
		}
		this.aString87 = arg0.method22520();
	}

	@OriginalMember(owner = "client!aqb", name = "y", descriptor = "(Lclient!kw;)V", line = 192)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28189(this.aLong129 * -9215466229278901977L, this.aString87);
	}

	@OriginalMember(owner = "client!aqb", name = "c", descriptor = "(Lclient!kw;B)V", line = 192)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28189(this.aLong129 * -9215466229278901977L, this.aString87);
	}

	@OriginalMember(owner = "client!aqb", name = "l", descriptor = "(Lclient!kw;)V", line = 192)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28189(this.aLong129 * -9215466229278901977L, this.aString87);
	}

	@OriginalMember(owner = "client!aqb", name = "w", descriptor = "(Lclient!kw;)V", line = 192)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28189(this.aLong129 * -9215466229278901977L, this.aString87);
	}
}
