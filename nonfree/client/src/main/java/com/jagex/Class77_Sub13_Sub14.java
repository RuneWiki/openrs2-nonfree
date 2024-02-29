package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqv")
public class Class77_Sub13_Sub14 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqv", name = "y", descriptor = "B")
	byte aByte82;

	@OriginalMember(owner = "client!aqv", name = "w", descriptor = "B")
	byte aByte83;

	@OriginalMember(owner = "client!aqv", name = "l", descriptor = "Z")
	boolean aBoolean493;

	@OriginalMember(owner = "client!aqv", name = "q", descriptor = "B")
	byte aByte84;

	@OriginalMember(owner = "client!aqv", name = "t", descriptor = "B")
	byte aByte85;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqv", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqv", name = "<init>", descriptor = "(Lclient!km;)V", line = 232)
	Class77_Sub13_Sub14(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aqv", name = "p", descriptor = "(Lclient!akv;I)V", line = 235)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aBoolean493 = arg0.method22478() == 1;
		this.aByte82 = arg0.method22481();
		this.aByte83 = arg0.method22481();
		this.aByte85 = arg0.method22481();
		this.aByte84 = arg0.method22481();
	}

	@OriginalMember(owner = "client!aqv", name = "v", descriptor = "(Lclient!akv;)V", line = 235)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aBoolean493 = arg0.method22478() == 1;
		this.aByte82 = arg0.method22481();
		this.aByte83 = arg0.method22481();
		this.aByte85 = arg0.method22481();
		this.aByte84 = arg0.method22481();
	}

	@OriginalMember(owner = "client!aqv", name = "l", descriptor = "(Lclient!kw;)V", line = 243)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.aBoolean726 = this.aBoolean493;
		arg0.aByte151 = this.aByte82;
		arg0.aByte152 = this.aByte83;
		arg0.aByte150 = this.aByte85;
		arg0.aByte153 = this.aByte84;
	}

	@OriginalMember(owner = "client!aqv", name = "c", descriptor = "(Lclient!kw;B)V", line = 243)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.aBoolean726 = this.aBoolean493;
		arg0.aByte151 = this.aByte82;
		arg0.aByte152 = this.aByte83;
		arg0.aByte150 = this.aByte85;
		arg0.aByte153 = this.aByte84;
	}

	@OriginalMember(owner = "client!aqv", name = "w", descriptor = "(Lclient!kw;)V", line = 243)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.aBoolean726 = this.aBoolean493;
		arg0.aByte151 = this.aByte82;
		arg0.aByte152 = this.aByte83;
		arg0.aByte150 = this.aByte85;
		arg0.aByte153 = this.aByte84;
	}

	@OriginalMember(owner = "client!aqv", name = "y", descriptor = "(Lclient!kw;)V", line = 243)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.aBoolean726 = this.aBoolean493;
		arg0.aByte151 = this.aByte82;
		arg0.aByte152 = this.aByte83;
		arg0.aByte150 = this.aByte85;
		arg0.aByte153 = this.aByte84;
	}

	@OriginalMember(owner = "client!aqv", name = "abe", descriptor = "(Lclient!yf;I)V", line = 9461)
	static final void method21768(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local23 + local13;
	}
}
