package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public class Class428 {

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "J")
	static long aLong271;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_7 = new Class428(10);

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_2 = new Class428(5);

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_3 = new Class428(6);

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_4 = new Class428(21);

	@OriginalMember(owner = "client!ns", name = "y", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_5 = new Class428(9);

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_14 = new Class428(7);

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_12 = new Class428(7);

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_8 = new Class428(-1);

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_1 = new Class428(8);

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_10 = new Class428(3);

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_11 = new Class428(2);

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_9 = new Class428(-1);

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_13 = new Class428(5);

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_6 = new Class428(18);

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "Lclient!ns;")
	public static final Class428 aClass428_15 = new Class428(7);

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "()[Lclient!ns;", line = 22)
	public static Class428[] method28801() {
		return new Class428[] { aClass428_7, aClass428_2, aClass428_3, aClass428_4, aClass428_5, aClass428_14, aClass428_12, aClass428_8, aClass428_1, aClass428_10, aClass428_11, aClass428_9, aClass428_13, aClass428_6, aClass428_15 };
	}

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "()[Lclient!ns;", line = 22)
	public static Class428[] method28802() {
		return new Class428[] { aClass428_7, aClass428_2, aClass428_3, aClass428_4, aClass428_5, aClass428_14, aClass428_12, aClass428_8, aClass428_1, aClass428_10, aClass428_11, aClass428_9, aClass428_13, aClass428_6, aClass428_15 };
	}

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "()[Lclient!ns;", line = 22)
	public static Class428[] method28803() {
		return new Class428[] { aClass428_7, aClass428_2, aClass428_3, aClass428_4, aClass428_5, aClass428_14, aClass428_12, aClass428_8, aClass428_1, aClass428_10, aClass428_11, aClass428_9, aClass428_13, aClass428_6, aClass428_15 };
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V", line = 25)
	Class428(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "(IIII)I", line = 1594)
	static final int method28804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(24) int local24 = Class80_Sub1.method1956(local3, local13);
		@Pc(31) int local31 = Class80_Sub1.method1956(local3 + 1, local13);
		@Pc(38) int local38 = Class80_Sub1.method1956(local3, local13 + 1);
		@Pc(47) int local47 = Class80_Sub1.method1956(local3 + 1, local13 + 1);
		@Pc(54) int local54 = Class26.method463(local24, local31, local9, arg2);
		@Pc(61) int local61 = Class26.method463(local38, local47, local9, arg2);
		return Class26.method463(local54, local61, local19, arg2);
	}

	@OriginalMember(owner = "client!ns", name = "da", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5060)
	static final void method28805(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean669 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "mf", descriptor = "(Lclient!yf;I)V", line = 6726)
	static final void method28806(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class118.method21258(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ns", name = "ri", descriptor = "(Lclient!yf;I)V", line = 7696)
	static final void method28807(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class326.method27534(local16, arg0);
	}

	@OriginalMember(owner = "client!ns", name = "atb", descriptor = "(Lclient!yf;I)V", line = 12891)
	static final void method28808(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class303.method27192(10, local13, local23, "");
	}

	@OriginalMember(owner = "client!ns", name = "axt", descriptor = "(Lclient!yf;I)V", line = 13469)
	static final void method28809(@OriginalArg(0) Class665 arg0) {
		Class465.method29555(arg0.aClass104_Sub1_Sub5_Sub1_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307], true);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[0];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[2];
	}
}
