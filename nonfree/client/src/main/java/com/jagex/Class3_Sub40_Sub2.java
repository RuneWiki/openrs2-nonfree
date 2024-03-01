package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alw")
public class Class3_Sub40_Sub2 extends Class3_Sub40 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!alw", name = "this$0", descriptor = "Lclient!im;")
	final Class239 this$0;

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "I")
	int anInt2614;

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(Lclient!im;)V", line = 83)
	Class3_Sub40_Sub2(@OriginalArg(0) Class239 arg0) {
		this.this$0 = arg0;
		this.anInt2614 = 1518338101;
	}

	@OriginalMember(owner = "client!alw", name = "p", descriptor = "(Lclient!ahb;S)V", line = 86)
	@Override
	void method19099(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2614 = arg0.method20271() * -1518338101;
		arg0.method20269();
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			arg0.method20371();
		}
	}

	@OriginalMember(owner = "client!alw", name = "g", descriptor = "(Lclient!ahb;)V", line = 86)
	@Override
	void method19098(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2614 = arg0.method20271() * -1518338101;
		arg0.method20269();
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			arg0.method20371();
		}
	}

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "(Lclient!ahb;)V", line = 86)
	@Override
	void method19101(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2614 = arg0.method20271() * -1518338101;
		arg0.method20269();
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			arg0.method20371();
		}
	}

	@OriginalMember(owner = "client!alw", name = "a", descriptor = "(Lclient!ago;B)V", line = 95)
	@Override
	void method19100(@OriginalArg(0) Class3_Sub30 arg0) {
		arg0.method11622(this.anInt2614 * -1033064989);
	}

	@OriginalMember(owner = "client!alw", name = "h", descriptor = "(Lclient!ago;)V", line = 95)
	@Override
	void method19102(@OriginalArg(0) Class3_Sub30 arg0) {
		arg0.method11622(this.anInt2614 * -1033064989);
	}
}
