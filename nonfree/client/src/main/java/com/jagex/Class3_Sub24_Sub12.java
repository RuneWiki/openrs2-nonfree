package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alt")
public class Class3_Sub24_Sub12 extends Class3_Sub24 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!alt", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!alt", name = "l", descriptor = "I")
	int anInt2612;

	@OriginalMember(owner = "client!alt", name = "<init>", descriptor = "(Lclient!iq;)V", line = 199)
	Class3_Sub24_Sub12(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
		this.anInt2612 = -45487449;
	}

	@OriginalMember(owner = "client!alt", name = "p", descriptor = "(Lclient!ahb;B)V", line = 202)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2612 = arg0.method20271() * 45487449;
	}

	@OriginalMember(owner = "client!alt", name = "x", descriptor = "(Lclient!ahb;)V", line = 202)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2612 = arg0.method20271() * 45487449;
	}

	@OriginalMember(owner = "client!alt", name = "g", descriptor = "(Lclient!ahb;)V", line = 202)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2612 = arg0.method20271() * 45487449;
	}

	@OriginalMember(owner = "client!alt", name = "l", descriptor = "(Lclient!ahb;)V", line = 202)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2612 = arg0.method20271() * 45487449;
	}

	@OriginalMember(owner = "client!alt", name = "h", descriptor = "(Lclient!ahb;)V", line = 202)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2612 = arg0.method20271() * 45487449;
	}

	@OriginalMember(owner = "client!alt", name = "s", descriptor = "(Lclient!iu;)V", line = 206)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24814(this.anInt2612 * 1897849577);
	}

	@OriginalMember(owner = "client!alt", name = "a", descriptor = "(Lclient!iu;I)V", line = 206)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24814(this.anInt2612 * 1897849577);
	}
}
