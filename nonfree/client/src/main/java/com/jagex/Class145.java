package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public class Class145 {

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "[Lclient!co;")
	static Class6[] aClass6Array11;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Lclient!ee;")
	static final Class145 aClass145_4 = new Class145();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ee;")
	static final Class145 aClass145_3 = new Class145();

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!ee;")
	static final Class145 aClass145_2 = new Class145();

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 9)
	Class145() {
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(IIIIIIB)I", line = 43)
	public static int method23073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 7 - arg0 - (arg3 - 1);
		} else {
			return 7 - arg1 - (arg4 - 1);
		}
	}

	@OriginalMember(owner = "client!ee", name = "ax", descriptor = "(Lclient!vs;I)V", line = 4054)
	static final void method23071(@OriginalArg(0) Class536 arg0) {
		@Pc(7) int local7 = arg0.anIntArray497[arg0.anInt5318 * -2140198955];
		arg0.anInt5315 -= local7 * 790013775;
		@Pc(25) String local25 = Class500.method29442(arg0.anObjectArray42, arg0.anInt5315 * 996806575, local7);
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local25;
	}

	@OriginalMember(owner = "client!ee", name = "op", descriptor = "(Lclient!vs;I)V", line = 6732)
	static final void method23074(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class56.method12594(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "st", descriptor = "(Lclient!vs;I)V", line = 7509)
	static final void method23072(@OriginalArg(0) Class536 arg0) {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_110, client.aClass82_2.aClass577_2);
		client.aClass82_2.method21601(local5);
	}
}
