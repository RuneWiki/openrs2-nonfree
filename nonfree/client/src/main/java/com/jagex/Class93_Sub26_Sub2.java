package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arb")
public class Class93_Sub26_Sub2 extends Class93_Sub26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!arb", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!arb", name = "k", descriptor = "I")
	int anInt2997;

	@OriginalMember(owner = "client!arb", name = "<init>", descriptor = "(Lclient!kd;)V", line = 199)
	Class93_Sub26_Sub2(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
		this.anInt2997 = -1470702081;
	}

	@OriginalMember(owner = "client!arb", name = "m", descriptor = "(Lclient!alw;)V", line = 202)
	@Override
	void method21993(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt2997 = arg0.method22415() * 1470702081;
	}

	@OriginalMember(owner = "client!arb", name = "e", descriptor = "(Lclient!alw;B)V", line = 202)
	@Override
	void method21991(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt2997 = arg0.method22415() * 1470702081;
	}

	@OriginalMember(owner = "client!arb", name = "f", descriptor = "(Lclient!kr;)V", line = 206)
	@Override
	void method21990(@OriginalArg(0) Class386 arg0) {
		arg0.method28175(this.anInt2997 * 148561409);
	}

	@OriginalMember(owner = "client!arb", name = "n", descriptor = "(Lclient!kr;I)V", line = 206)
	@Override
	void method21992(@OriginalArg(0) Class386 arg0) {
		arg0.method28175(this.anInt2997 * 148561409);
	}

	@OriginalMember(owner = "client!arb", name = "k", descriptor = "(Lclient!kr;)V", line = 206)
	@Override
	void method21994(@OriginalArg(0) Class386 arg0) {
		arg0.method28175(this.anInt2997 * 148561409);
	}

	@OriginalMember(owner = "client!arb", name = "w", descriptor = "(Lclient!kr;)V", line = 206)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28175(this.anInt2997 * 148561409);
	}
}
