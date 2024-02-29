package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public class Class554 {

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	static final int anInt5233 = 1;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "I")
	static final int anInt5234 = 8;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	static final int anInt5235 = 2;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	static final int anInt5236 = 16;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "I")
	static final int anInt5237 = 62;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	static final int anInt5238 = 63;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 11)
	Class554() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!th", name = "l", descriptor = "(ILjava/lang/String;I)V", line = 34)
	public static void method31068(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class302.method27128(arg0, 0, "", "", "", arg1, null);
	}

	@OriginalMember(owner = "client!th", name = "bm", descriptor = "(Lclient!yf;I)V", line = 4763)
	static final void method31069(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 != null) {
			Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1.method32551(local13, local23);
		}
	}

	@OriginalMember(owner = "client!th", name = "ph", descriptor = "(Lclient!yf;I)V", line = 7363)
	static final void method31070(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class212.method25612(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!th", name = "ts", descriptor = "(Lclient!yf;I)V", line = 8108)
	static final void method31071(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class698.method36475(local13, new Class77_Sub38(local23, 3), null, true);
	}

	@OriginalMember(owner = "client!th", name = "ayn", descriptor = "(Lclient!yf;I)V", line = 13675)
	static final void method31072(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21131().method31901();
	}
}
