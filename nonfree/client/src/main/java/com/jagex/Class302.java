package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public class Class302 {

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
	public static final int anInt4423 = 15;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	public static final int anInt4424 = 32768;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
	public static final int anInt4425 = 15;

	@OriginalMember(owner = "client!lm", name = "rb", descriptor = "Lclient!aaj;")
	public static Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 8)
	Class302() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I", line = 28)
	public static int method25670(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!lm", name = "aap", descriptor = "(Lclient!vs;I)V", line = 8735)
	static final void method25667(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(18) int local18 = client.aClass367Array1[local12].method26908();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local18 == 0 ? 1 : 0;
	}

	@OriginalMember(owner = "client!lm", name = "acg", descriptor = "(Lclient!vs;I)V", line = 9052)
	static final void method25668(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		arg0.anInt5319 -= 624249098;
		@Pc(27) int local27 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(37) int local37 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13.indexOf(local27, local37);
	}

	@OriginalMember(owner = "client!lm", name = "als", descriptor = "(Lclient!vs;B)V", line = 11179)
	static final void method25669(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		Class342.method26468(local14, local25);
	}
}
