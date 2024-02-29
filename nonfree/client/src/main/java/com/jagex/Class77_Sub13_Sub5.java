package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqi")
public class Class77_Sub13_Sub5 extends Class77_Sub13 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqi", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqi", name = "l", descriptor = "J")
	long aLong143;

	@OriginalMember(owner = "client!aqi", name = "y", descriptor = "Ljava/lang/String;")
	String aString90;

	@OriginalMember(owner = "client!aqi", name = "<init>", descriptor = "(Lclient!km;)V", line = 75)
	Class77_Sub13_Sub5(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
		this.aLong143 = -3623617814552831075L;
		this.aString90 = null;
	}

	@OriginalMember(owner = "client!aqi", name = "p", descriptor = "(Lclient!akv;I)V", line = 78)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			this.aLong143 = arg0.method22510() * 3623617814552831075L;
		}
		this.aString90 = arg0.method22520();
	}

	@OriginalMember(owner = "client!aqi", name = "v", descriptor = "(Lclient!akv;)V", line = 78)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			this.aLong143 = arg0.method22510() * 3623617814552831075L;
		}
		this.aString90 = arg0.method22520();
	}

	@OriginalMember(owner = "client!aqi", name = "y", descriptor = "(Lclient!kw;)V", line = 86)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28178(this.aLong143 * -93701641194259125L, this.aString90, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "c", descriptor = "(Lclient!kw;B)V", line = 86)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28178(this.aLong143 * -93701641194259125L, this.aString90, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "l", descriptor = "(Lclient!kw;)V", line = 86)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28178(this.aLong143 * -93701641194259125L, this.aString90, 0);
	}

	@OriginalMember(owner = "client!aqi", name = "w", descriptor = "(Lclient!kw;)V", line = 86)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28178(this.aLong143 * -93701641194259125L, this.aString90, 0);
	}
}
