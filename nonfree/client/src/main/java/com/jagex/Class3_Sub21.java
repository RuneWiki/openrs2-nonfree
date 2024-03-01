package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agf")
public class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!agf", name = "l", descriptor = "I")
	public int anInt1285;

	@OriginalMember(owner = "client!agf", name = "<init>", descriptor = "(I)V", line = 6)
	public Class3_Sub21(@OriginalArg(0) int arg0) {
		this.anInt1285 = arg0 * -191193651;
	}

	@OriginalMember(owner = "client!agf", name = "dc", descriptor = "(IIII)V", line = 688)
	static void method11424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1008) {
			Class291.method25543(Class634.aClass634_3, arg1, arg2);
		} else if (arg0 == 1009) {
			Class291.method25543(Class634.aClass634_13, arg1, arg2);
		} else if (arg0 == 1010) {
			Class291.method25543(Class634.aClass634_4, arg1, arg2);
		} else if (arg0 == 1011) {
			Class291.method25543(Class634.aClass634_5, arg1, arg2);
		} else if (arg0 == 1012) {
			Class291.method25543(Class634.aClass634_6, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agf", name = "du", descriptor = "(Lclient!vs;I)V", line = 4751)
	static final void method11426(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class277.method25402(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!agf", name = "acy", descriptor = "(Lclient!vs;I)V", line = 9091)
	static final void method11425(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class318.method25854(local14, local25);
	}
}
