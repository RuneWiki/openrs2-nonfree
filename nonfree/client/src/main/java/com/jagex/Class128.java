package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public class Class128 {

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
	public static final int anInt3316 = 8191;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
	public static int anInt3317;

	@OriginalMember(owner = "client!dk", name = "dl", descriptor = "Lclient!e;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!wh;")
	public Class551 aClass551_1 = new Class551();

	@OriginalMember(owner = "client!dk", name = "ck", descriptor = "(Lclient!vs;B)V", line = 4393)
	static final void method22882(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class245.method24865(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!dk", name = "iv", descriptor = "(Lclient!vs;I)V", line = 5658)
	static final void method22883(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class66.method13206(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!dk", name = "ads", descriptor = "(Lclient!vs;I)V", line = 9607)
	static final void method22884(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class16.method1675(local13);
	}
}
