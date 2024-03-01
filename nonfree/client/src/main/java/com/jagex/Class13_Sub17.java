package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acr")
public class Class13_Sub17 extends Class13 {

	@OriginalMember(owner = "client!acr", name = "am", descriptor = "I")
	public static int anInt685;

	@OriginalMember(owner = "client!acr", name = "a", descriptor = "I")
	final int anInt684;

	@OriginalMember(owner = "client!acr", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 9)
	Class13_Sub17(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt684 = arg0.method20271() * -1139511357;
	}

	@OriginalMember(owner = "client!acr", name = "a", descriptor = "(I)V", line = 14)
	@Override
	public void method16888() {
		Class131.aClass163Array1[this.anInt684 * -467765013].method23276();
	}

	@OriginalMember(owner = "client!acr", name = "h", descriptor = "()V", line = 14)
	@Override
	public void method16896() {
		Class131.aClass163Array1[this.anInt684 * -467765013].method23276();
	}

	@OriginalMember(owner = "client!acr", name = "eh", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4945)
	static final void method6701(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean643 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!acr", name = "sm", descriptor = "(Lclient!vs;B)V", line = 7451)
	static final void method6700(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(29) int local29 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(30) int local30 = local29 - 1;
		if (local16.aStringArray11 == null || local30 >= local16.aStringArray11.length || local16.aStringArray11[local30] == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local16.aStringArray11[local30];
		}
	}
}
