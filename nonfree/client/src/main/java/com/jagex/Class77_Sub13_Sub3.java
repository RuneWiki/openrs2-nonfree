package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqf")
public class Class77_Sub13_Sub3 extends Class77_Sub13 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqf", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqf", name = "l", descriptor = "J")
	long aLong135;

	@OriginalMember(owner = "client!aqf", name = "y", descriptor = "Ljava/lang/String;")
	String aString88;

	@OriginalMember(owner = "client!aqf", name = "w", descriptor = "I")
	int anInt2951;

	@OriginalMember(owner = "client!aqf", name = "<init>", descriptor = "(Lclient!km;)V", line = 95)
	Class77_Sub13_Sub3(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
		this.aLong135 = -3582335655677004843L;
		this.aString88 = null;
		this.anInt2951 = 0;
	}

	@OriginalMember(owner = "client!aqf", name = "p", descriptor = "(Lclient!akv;I)V", line = 98)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			this.aLong135 = arg0.method22510() * 3582335655677004843L;
		}
		this.aString88 = arg0.method22520();
		this.anInt2951 = arg0.method22483() * 2096023419;
	}

	@OriginalMember(owner = "client!aqf", name = "v", descriptor = "(Lclient!akv;)V", line = 98)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			this.aLong135 = arg0.method22510() * 3582335655677004843L;
		}
		this.aString88 = arg0.method22520();
		this.anInt2951 = arg0.method22483() * 2096023419;
	}

	@OriginalMember(owner = "client!aqf", name = "y", descriptor = "(Lclient!kw;)V", line = 107)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28178(this.aLong135 * -6118778694071463293L, this.aString88, this.anInt2951 * -1982464077);
	}

	@OriginalMember(owner = "client!aqf", name = "c", descriptor = "(Lclient!kw;B)V", line = 107)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28178(this.aLong135 * -6118778694071463293L, this.aString88, this.anInt2951 * -1982464077);
	}

	@OriginalMember(owner = "client!aqf", name = "l", descriptor = "(Lclient!kw;)V", line = 107)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28178(this.aLong135 * -6118778694071463293L, this.aString88, this.anInt2951 * -1982464077);
	}

	@OriginalMember(owner = "client!aqf", name = "w", descriptor = "(Lclient!kw;)V", line = 107)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28178(this.aLong135 * -6118778694071463293L, this.aString88, this.anInt2951 * -1982464077);
	}
}
