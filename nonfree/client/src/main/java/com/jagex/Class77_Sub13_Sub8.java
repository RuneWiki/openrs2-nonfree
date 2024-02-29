package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqn")
public class Class77_Sub13_Sub8 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqn", name = "y", descriptor = "I")
	int anInt2988;

	@OriginalMember(owner = "client!aqn", name = "w", descriptor = "I")
	int anInt2989;

	@OriginalMember(owner = "client!aqn", name = "t", descriptor = "I")
	int anInt2990;

	@OriginalMember(owner = "client!aqn", name = "l", descriptor = "I")
	int anInt2991;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqn", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqn", name = "<init>", descriptor = "(Lclient!km;)V", line = 273)
	Class77_Sub13_Sub8(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aqn", name = "v", descriptor = "(Lclient!akv;)V", line = 276)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2991 = arg0.method22500() * -1473673695;
		this.anInt2990 = arg0.method22500() * 1526185877;
		this.anInt2988 = arg0.method22478() * -508601707;
		this.anInt2989 = arg0.method22478() * 1740739311;
	}

	@OriginalMember(owner = "client!aqn", name = "p", descriptor = "(Lclient!akv;I)V", line = 276)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2991 = arg0.method22500() * -1473673695;
		this.anInt2990 = arg0.method22500() * 1526185877;
		this.anInt2988 = arg0.method22478() * -508601707;
		this.anInt2989 = arg0.method22478() * 1740739311;
	}

	@OriginalMember(owner = "client!aqn", name = "l", descriptor = "(Lclient!kw;)V", line = 283)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28212(this.anInt2991 * -962363935, this.anInt2990 * 1652659133, this.anInt2988 * 1996071101, this.anInt2989 * -1731339249);
	}

	@OriginalMember(owner = "client!aqn", name = "y", descriptor = "(Lclient!kw;)V", line = 283)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28212(this.anInt2991 * -962363935, this.anInt2990 * 1652659133, this.anInt2988 * 1996071101, this.anInt2989 * -1731339249);
	}

	@OriginalMember(owner = "client!aqn", name = "c", descriptor = "(Lclient!kw;B)V", line = 283)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28212(this.anInt2991 * -962363935, this.anInt2990 * 1652659133, this.anInt2988 * 1996071101, this.anInt2989 * -1731339249);
	}

	@OriginalMember(owner = "client!aqn", name = "w", descriptor = "(Lclient!kw;)V", line = 283)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28212(this.anInt2991 * -962363935, this.anInt2990 * 1652659133, this.anInt2988 * 1996071101, this.anInt2989 * -1731339249);
	}
}
