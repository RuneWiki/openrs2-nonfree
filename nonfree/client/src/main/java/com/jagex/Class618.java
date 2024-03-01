package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ze")
public class Class618 {

	@OriginalMember(owner = "client!ze", name = "a", descriptor = "Z")
	final boolean aBoolean850;

	@OriginalMember(owner = "client!ze", name = "p", descriptor = "[Lclient!zp;")
	final Class626[] aClass626Array1;

	@OriginalMember(owner = "client!ze", name = "<init>", descriptor = "(Z[Lclient!zp;)V", line = 153)
	Class618(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class626[] arg1) {
		this.aBoolean850 = arg0;
		this.aClass626Array1 = arg1;
	}

	@OriginalMember(owner = "client!ze", name = "an", descriptor = "([Lclient!co;I)V", line = 940)
	public static void method33710(@OriginalArg(0) Class6[] arg0) {
		Class578.anInt5441 = arg0.length * -326131521;
		Class354.aClass6Array13 = new Class6[Class578.anInt5441 * -1466708161 + 10];
		Class43.anIntArray163 = new int[Class578.anInt5441 * -1466708161 + 10];
		System.arraycopy(arg0, 0, Class354.aClass6Array13, 0, Class578.anInt5441 * -1466708161);
		@Pc(28) int local28;
		for (local28 = 0; local28 < Class578.anInt5441 * -1466708161; local28++) {
			Class43.anIntArray163[local28] = Class354.aClass6Array13[local28].method16779();
		}
		for (local28 = Class578.anInt5441 * -1466708161; local28 < Class354.aClass6Array13.length; local28++) {
			Class43.anIntArray163[local28] = 12;
		}
	}

	@OriginalMember(owner = "client!ze", name = "fi", descriptor = "(Lclient!vs;I)V", line = 5116)
	static final void method33709(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class399.method27567(local16, local22, arg0);
	}
}
