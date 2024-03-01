package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public class Class308 {

	@OriginalMember(owner = "client!lu", name = "hy", descriptor = "Lclient!zy;")
	public static Class70_Sub2 aClass70_Sub2_3;

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_4 = new Class308(7);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_9 = new Class308(10);

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_2 = new Class308(9);

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_1 = new Class308(8);

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_8 = new Class308(18);

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_6 = new Class308(5);

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_7 = new Class308(3);

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_3 = new Class308(-1);

	@OriginalMember(owner = "client!lu", name = "y", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_5 = new Class308(7);

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_10 = new Class308(-1);

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_11 = new Class308(7);

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_12 = new Class308(5);

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_13 = new Class308(21);

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_14 = new Class308(2);

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "Lclient!lu;")
	public static final Class308 aClass308_15 = new Class308(6);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()[Lclient!lu;", line = 22)
	public static Class308[] method25750() {
		return new Class308[] { aClass308_4, aClass308_9, aClass308_2, aClass308_1, aClass308_8, aClass308_6, aClass308_7, aClass308_3, aClass308_5, aClass308_10, aClass308_11, aClass308_12, aClass308_13, aClass308_14, aClass308_15 };
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(I)V", line = 25)
	Class308(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ny;II)Lclient!co;", line = 88)
	public static Class6 method25753(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class6 local5 = (Class6) Class227.aClass161_26.method23219((long) arg1);
		if (local5 == null) {
			if (Class85.aBoolean534) {
				local5 = Class613.aClass21_13.method17089(Class137.method22937(arg0, arg1), true);
			} else {
				local5 = Class107.method21920(arg0.method26705(arg1));
			}
			Class227.aClass161_26.method23222(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!lu", name = "qr", descriptor = "(Lclient!vs;I)V", line = 7078)
	static final void method25755(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class341.method26460(local16, arg0);
	}

	@OriginalMember(owner = "client!lu", name = "uc", descriptor = "(Lclient!vs;I)V", line = 7746)
	static final void method25752(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class633.method33876(local13, local23, false);
	}

	@OriginalMember(owner = "client!lu", name = "vj", descriptor = "(Lclient!vs;I)V", line = 7991)
	static final void method25754(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class469.aClass530_2.method33765();
	}

	@OriginalMember(owner = "client!lu", name = "aby", descriptor = "(Lclient!vs;I)V", line = 9031)
	static final void method25751(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		arg0.anInt5319 -= 624249098;
		@Pc(27) int local27 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(37) int local37 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local13.substring(local27, local37);
	}
}
