package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aak")
public class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!aak", name = "on", descriptor = "I")
	static int anInt95;

	@OriginalMember(owner = "client!aak", name = "p", descriptor = "[I")
	int[] anIntArray11;

	@OriginalMember(owner = "client!aak", name = "a", descriptor = "[I")
	int[] anIntArray12;

	@OriginalMember(owner = "client!aak", name = "<init>", descriptor = "(II[I[I)V", line = 9)
	Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray11 = arg2;
		this.anIntArray12 = arg3;
	}

	@OriginalMember(owner = "client!aak", name = "l", descriptor = "(B)V", line = 87)
	static void method752() {
		Class67.aBoolean337 = false;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!aak", name = "o", descriptor = "(Lclient!vs;I)V", line = 3976)
	static final void method750(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = arg0.aClass3_Sub1_Sub6_2.anObjectArray4[arg0.anInt5318 * -2140198955];
	}

	@OriginalMember(owner = "client!aak", name = "aay", descriptor = "(Lclient!vs;I)V", line = 8797)
	static final void method749(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1560622745;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(53) int local53 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 4];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 + (local53 - local33) * (local23 - local13) / (local43 - local33);
	}

	@OriginalMember(owner = "client!aak", name = "ahv", descriptor = "(Lclient!vs;I)V", line = 10269)
	static final void method753(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (Class552.aBoolean823) {
			@Pc(17) Class573[] local17 = Class188.method23975();
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17[local12].anInt5423 * 1081330127;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17[local12].anInt5424 * 1418262355;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!aak", name = "akl", descriptor = "(Lclient!vs;I)V", line = 11050)
	static final void method751(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		Class80.aClass23_Sub1_1.method5805((float) arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] / 1000.0F);
	}
}
