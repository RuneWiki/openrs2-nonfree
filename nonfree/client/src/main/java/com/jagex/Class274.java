package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public class Class274 {

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_4 = new Class274(1);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_1 = new Class274(2);

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_2 = new Class274(2);

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_3 = new Class274(2);

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_8 = new Class274(1);

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_5 = new Class274(1);

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_6 = new Class274(1);

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_7 = new Class274(2);

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_11 = new Class274(1);

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_9 = new Class274(2);

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!ke;")
	public static final Class274 aClass274_10 = new Class274(1);

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
	public final int anInt4320;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "()[Lclient!ke;", line = 19)
	public static Class274[] method25351() {
		return new Class274[] { aClass274_4, aClass274_1, aClass274_2, aClass274_3, aClass274_8, aClass274_5, aClass274_6, aClass274_7, aClass274_11, aClass274_9, aClass274_10 };
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V", line = 22)
	Class274(@OriginalArg(0) int arg0) {
		this.anInt4320 = arg0 * 477305035;
	}

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "(Lclient!ny;B)V", line = 42)
	public static void method25354(@OriginalArg(0) Class359 arg0) {
		Class568.anInt5378 = arg0.method26687("p11_full") * 311447873;
		Class568.anInt5372 = arg0.method26687("p12_full") * -1208045323;
		Class568.anInt5373 = arg0.method26687("b12_full") * -1269131453;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Z", line = 223)
	static boolean method25355() {
		Class190.anInt3670 = 1709881008;
		Class615.aClass82_3 = client.aClass82_2;
		if (client.aByteArray57 != null) {
			@Pc(11) Class3_Sub41 local11 = new Class3_Sub41(client.aByteArray57);
			Class190.aLong241 = local11.method20371() * 8189732161531925055L;
			Class190.aLong242 = local11.method20371() * 2016401035969746977L;
		}
		if (Class190.aLong241 * -7592338111309603393L < 0L) {
			Class43.method9493(35);
			return false;
		} else {
			return Class65.method13153(false, true, "", "", Class190.aLong241 * -7592338111309603393L);
		}
	}

	@OriginalMember(owner = "client!ke", name = "dg", descriptor = "(II)V", line = 533)
	static void method25356(@OriginalArg(0) int arg0) {
		@Pc(3) byte local3;
		if (arg0 == 0) {
			local3 = 0;
		} else if (arg0 == 1) {
			local3 = 1;
		} else if (arg0 == 2) {
			local3 = 2;
		} else {
			return;
		}
		@Pc(24) byte local24;
		if ((double) Class58_Sub1.aFloat148 == 3.0D) {
			local24 = 0;
		} else if ((double) Class58_Sub1.aFloat148 == 4.0D) {
			local24 = 1;
		} else if ((double) Class58_Sub1.aFloat148 == 6.0D) {
			local24 = 2;
		} else if ((double) Class58_Sub1.aFloat148 >= 8.0D) {
			local24 = 3;
		} else {
			return;
		}
		Class3_Sub3.aClass14_5 = Class58_Sub1.aClass14ArrayArray1[local3][local24];
		Class340.aClass611_10 = Class58_Sub1.aClass611ArrayArray1[local3][local24];
	}

	@OriginalMember(owner = "client!ke", name = "qo", descriptor = "(Lclient!vs;I)V", line = 7128)
	static final void method25352(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class385.method27334(local16, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "zl", descriptor = "(Lclient!vs;I)V", line = 8673)
	static final void method25353(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = arg0.aClass3_Sub30_3.aClass238Array1[local12].aString192;
	}
}
