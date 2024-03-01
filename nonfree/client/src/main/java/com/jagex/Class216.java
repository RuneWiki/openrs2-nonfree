package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
final class Class216 implements Interface9 {

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "(ILjava/lang/String;IB)V", line = 313)
	public static void method24299(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub1_Sub6 local5 = Class534.method32525(Class634.aClass634_12, arg0, -1);
		if (local5 == null) {
			return;
		}
		@Pc(12) Class536 local12 = Class27.method15271();
		local12.anIntArray494 = new int[local5.anInt2657 * -1110480365];
		local12.anObjectArray41 = new String[local5.anInt2656 * 1386116957];
		local12.anObjectArray41[0] = arg1;
		local12.anIntArray494[0] = arg2;
		Class60_Sub6.method12969(local5, 200000, local12);
	}

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "(Lclient!nw;IB)Lclient!cy;", line = 513)
	@Override
	public Class11 method24295(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		return ((Class70_Sub1) Class499.aMap13.get(arg0)).method14717(arg1);
	}

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "(Lclient!nw;I)Lclient!cy;", line = 513)
	@Override
	public Class11 method24297(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		return ((Class70_Sub1) Class499.aMap13.get(arg0)).method14717(arg1);
	}

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "(I)Lclient!ky;", line = 517)
	@Override
	public Class290 method24298(@OriginalArg(0) int arg0) {
		return Class308.aClass70_Sub2_3.method33886(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "(II)Lclient!ky;", line = 517)
	@Override
	public Class290 method24296(@OriginalArg(0) int arg0) {
		return Class308.aClass70_Sub2_3.method33886(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "bf", descriptor = "(Lclient!vs;I)V", line = 4195)
	static final void method24302(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class375.method27235(local13);
		Class3_Sub14.method11265(Class178.aClass186Array1[local13 >>> 16], local13 & 0xFFFF, local23, local33, arg0.aBoolean822, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "rw", descriptor = "(Lclient!vs;I)V", line = 7216)
	static final void method24300(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class282.method25443(local16, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "amj", descriptor = "(Lclient!vs;B)V", line = 11311)
	static final void method24301(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		client.aClass370_1.method26968();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
