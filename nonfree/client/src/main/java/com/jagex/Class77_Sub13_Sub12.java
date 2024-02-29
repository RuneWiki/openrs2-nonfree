package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqt")
public class Class77_Sub13_Sub12 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqt", name = "hj", descriptor = "Lclient!aoz;")
	public static Class35_Sub22 aClass35_Sub22_1;

	@OriginalMember(owner = "client!aqt", name = "y", descriptor = "I")
	int anInt2995;

	@OriginalMember(owner = "client!aqt", name = "l", descriptor = "I")
	int anInt2996;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqt", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqt", name = "<init>", descriptor = "(Lclient!km;)V", line = 255)
	Class77_Sub13_Sub12(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aqt", name = "p", descriptor = "(Lclient!akv;I)V", line = 258)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2996 = arg0.method22500() * 2043729681;
		this.anInt2995 = arg0.method22500() * -851094623;
	}

	@OriginalMember(owner = "client!aqt", name = "v", descriptor = "(Lclient!akv;)V", line = 258)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2996 = arg0.method22500() * 2043729681;
		this.anInt2995 = arg0.method22500() * -851094623;
	}

	@OriginalMember(owner = "client!aqt", name = "y", descriptor = "(Lclient!kw;)V", line = 263)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28207(this.anInt2996 * -640222735, this.anInt2995 * -671526815);
	}

	@OriginalMember(owner = "client!aqt", name = "l", descriptor = "(Lclient!kw;)V", line = 263)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28207(this.anInt2996 * -640222735, this.anInt2995 * -671526815);
	}

	@OriginalMember(owner = "client!aqt", name = "w", descriptor = "(Lclient!kw;)V", line = 263)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28207(this.anInt2996 * -640222735, this.anInt2995 * -671526815);
	}

	@OriginalMember(owner = "client!aqt", name = "c", descriptor = "(Lclient!kw;B)V", line = 263)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28207(this.anInt2996 * -640222735, this.anInt2995 * -671526815);
	}
}
