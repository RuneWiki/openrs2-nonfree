package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
class Class151 implements Interface25 {

	@OriginalMember(owner = "client!ek", name = "ah", descriptor = "I")
	static int anInt3438;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ek", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ft;)V", line = 475)
	Class151(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()F", line = 477)
	@Override
	public float method23203() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_2.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "(S)F", line = 477)
	@Override
	public float method23202() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_2.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!ek", name = "aen", descriptor = "(Lclient!vs;I)V", line = 9807)
	static final void method23140(@OriginalArg(0) Class536 arg0) {
		if (Class354.aShortArray108 == null || Class21_Sub1.anInt289 * -1362105085 >= Class177.anInt3474 * -908764545) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class354.aShortArray108[(Class21_Sub1.anInt289 += -2118916693) * -1362105085 - 1] & 0xFFFF;
		}
	}

	@OriginalMember(owner = "client!ek", name = "aih", descriptor = "(Lclient!vs;I)V", line = 10566)
	static final void method23141(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1872747294;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		if (local13 >= 2) {
			throw new RuntimeException();
		}
		client.anInt3093 = local13 * -1952465969;
		@Pc(34) int local34 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local34 + 1 >= client.anIntArrayArrayArray15[client.anInt3093 * 490957615].length >> 1) {
			throw new RuntimeException();
		}
		client.anInt3049 = local34 * 1733585285;
		client.anInt3156 = 0;
		client.anInt3097 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2] * 371918389;
		client.anInt3055 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3] * 1375465371;
		@Pc(90) int local90 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4];
		if (local90 >= 2) {
			throw new RuntimeException();
		}
		client.anInt3137 = local90 * -216741911;
		@Pc(111) int local111 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 5];
		if (local111 + 1 >= client.anIntArrayArrayArray15[client.anInt3137 * -100499367].length >> 1) {
			throw new RuntimeException();
		}
		client.anInt3095 = local111 * -616761583;
		Class72.anInt2086 = 224556581;
		Class47.anInt1011 = -1801069635;
		Class449.anInt5013 = 2127832081;
	}
}
