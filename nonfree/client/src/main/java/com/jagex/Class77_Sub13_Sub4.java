package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqg")
public class Class77_Sub13_Sub4 extends Class77_Sub13 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqg", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqg", name = "l", descriptor = "I")
	int anInt2952;

	@OriginalMember(owner = "client!aqg", name = "<init>", descriptor = "(Lclient!km;)V", line = 114)
	Class77_Sub13_Sub4(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
		this.anInt2952 = -1559014433;
	}

	@OriginalMember(owner = "client!aqg", name = "p", descriptor = "(Lclient!akv;I)V", line = 117)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2952 = arg0.method22483() * 1559014433;
	}

	@OriginalMember(owner = "client!aqg", name = "v", descriptor = "(Lclient!akv;)V", line = 117)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2952 = arg0.method22483() * 1559014433;
	}

	@OriginalMember(owner = "client!aqg", name = "l", descriptor = "(Lclient!kw;)V", line = 121)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28182(this.anInt2952 * -1714563103);
	}

	@OriginalMember(owner = "client!aqg", name = "c", descriptor = "(Lclient!kw;B)V", line = 121)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28182(this.anInt2952 * -1714563103);
	}

	@OriginalMember(owner = "client!aqg", name = "y", descriptor = "(Lclient!kw;)V", line = 121)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28182(this.anInt2952 * -1714563103);
	}

	@OriginalMember(owner = "client!aqg", name = "w", descriptor = "(Lclient!kw;)V", line = 121)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28182(this.anInt2952 * -1714563103);
	}
}
