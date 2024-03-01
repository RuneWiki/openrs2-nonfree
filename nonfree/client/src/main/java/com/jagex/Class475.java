package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public class Class475 {

	@OriginalMember(owner = "client!tc", name = "fy", descriptor = "Lclient!ny;")
	public static Class359 aClass359_86;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Lclient!tc;")
	static final Class475 aClass475_1 = new Class475(0);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!tc;")
	static final Class475 aClass475_2 = new Class475(1);

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!tc;")
	public static final Class475 aClass475_3 = new Class475(2);

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I)V", line = 29)
	Class475(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "gh", descriptor = "(Lclient!vs;I)V", line = 5197)
	static final void method28792(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class26_Sub1_Sub2_Sub1.method9769(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "lk", descriptor = "(Lclient!vs;I)V", line = 6134)
	static final void method28791(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class421.method27847(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "ug", descriptor = "(Lclient!vs;B)V", line = 7812)
	static final void method28790(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local12 >> 14 & 0x3FFF;
	}

	@OriginalMember(owner = "client!tc", name = "vp", descriptor = "(Lclient!vs;I)V", line = 7930)
	static final void method28789(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3041 * -1578833007;
	}

	@OriginalMember(owner = "client!tc", name = "adr", descriptor = "(Lclient!vs;I)V", line = 9281)
	static final void method28787(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (local28.method33850()) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class110.aClass436_1.method27999(local13).method28228(local23, local28.aString248);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class110.aClass436_1.method27999(local13).method28223(local23, local28.anInt5585 * 100041865);
		}
	}

	@OriginalMember(owner = "client!tc", name = "ago", descriptor = "(Lclient!vs;I)V", line = 10015)
	static final void method28788(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) Class546 local33 = Class58.method12391(local13 >> 14 & 0x3FFF, local13 & 0x3FFF);
		@Pc(35) boolean local35 = false;
		for (@Pc(40) Class3_Sub1_Sub4 local40 = (Class3_Sub1_Sub4) local33.method32623(); local40 != null; local40 = (Class3_Sub1_Sub4) local33.method32645()) {
			if (local40.anInt2649 * 75245013 == local23) {
				local35 = true;
				break;
			}
		}
		if (local35) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}
}
