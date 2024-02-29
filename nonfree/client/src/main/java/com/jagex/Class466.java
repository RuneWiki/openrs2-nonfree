package com.jagex;

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public class Class466 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "Lclient!pw;")
	static Class478 aClass478_124;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	final int anInt4980;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	final int anInt4979;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
	final int anInt4981;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[B")
	final byte[] aByteArray85;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "(IB)Z", line = 52)
	static boolean method29557(@OriginalArg(0) int arg0) {
		return arg0 >= Class593.aClass593_7.anInt5501 * 847393323 && arg0 <= Class593.aClass593_11.anInt5501 * 847393323;
	}

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "(JIZB)Ljava/lang/String;", line = 59)
	static String method29558(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class397.method28437(arg0);
			local5 = Class61.aCalendar1;
		} else {
			Class694.method36377(arg0);
			local5 = Class61.aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "(Lclient!dx;I)V", line = 95)
	static void method29559(@OriginalArg(0) Class86 arg0) {
		if (Class156.anInt3238 * 1936210931 != Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 && client.aClass517_1.method30435() != null) {
			Class280.method26667();
			if (Class405.method28534(arg0, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100)) {
				Class156.anInt3238 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 * -1312565957;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIII[B)V", line = 122)
	Class466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		this.anInt4980 = arg0 * 776443663;
		this.anInt4979 = arg1 * -2001319615;
		this.anInt4981 = arg2 * 1507583945;
		this.aByteArray85 = arg4;
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(II)V", line = 716)
	public static void method29560(@OriginalArg(0) int arg0) {
		Class277.aClass232_74.method25847(arg0);
		Class277.aClass232_72.method25847(arg0);
		Class277.aClass232_73.method25847(arg0);
		Class277.aClass232_71.method25847(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "fe", descriptor = "(Lclient!yf;I)V", line = 5437)
	static final void method29561(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class670.method33195(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!pj", name = "aty", descriptor = "(Lclient!yf;B)V", line = 12884)
	static final void method29562(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class303.method27192(9, local13, local23, "");
	}
}
