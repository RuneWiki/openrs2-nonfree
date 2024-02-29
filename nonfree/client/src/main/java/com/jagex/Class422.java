package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public class Class422 {

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "Lclient!nl;")
	public static final Class422 aClass422_10 = new Class422(14, 0);

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Lclient!nl;")
	public static final Class422 aClass422_2 = new Class422(15, -1);

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "Lclient!nl;")
	public static final Class422 aClass422_3 = new Class422(16, -2);

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "Lclient!nl;")
	public static final Class422 aClass422_4 = new Class422(19, -2);

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "Lclient!nl;")
	static final Class422 aClass422_7 = new Class422(23, 4);

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "Lclient!nl;")
	static final Class422 aClass422_1 = new Class422(24, -1);

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "Lclient!nl;")
	public static final Class422 aClass422_5 = new Class422(26, 0);

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "Lclient!nl;")
	static final Class422 aClass422_6 = new Class422(27, 0);

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "Lclient!nl;")
	public static final Class422 aClass422_8 = new Class422(28, -2);

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Lclient!nl;")
	public static final Class422 aClass422_9 = new Class422(29, -2);

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "Lclient!nl;")
	public static final Class422 aClass422_12 = new Class422(30, -2);

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "Lclient!nl;")
	static final Class422 aClass422_11 = new Class422(31, 4);

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "[Lclient!nl;")
	static final Class422[] aClass422Array1 = new Class422[32];

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public final int anInt4805;

	static {
		@Pc(77) Class422[] local77 = Class50.method753();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass422Array1[local77[local79].anInt4805 * -100453045] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "(IIIB)I", line = 27)
	public static int method28707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "()[Lclient!nl;", line = 28)
	static Class422[] method28708() {
		return new Class422[] { aClass422_6, aClass422_7, aClass422_4, aClass422_8, aClass422_3, aClass422_5, aClass422_12, aClass422_9, aClass422_11, aClass422_10, aClass422_2, aClass422_1 };
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(II)V", line = 31)
	Class422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4805 = arg0 * -967005085;
	}

	@OriginalMember(owner = "client!nl", name = "ao", descriptor = "(I)V", line = 1104)
	static void method28709() {
		Class589.aClass82_3.method1999();
		Class589.aClass82_3.aClass77_Sub39_Sub1_1.anInt3089 = 0;
		Class589.aClass82_3.aClass418_1 = null;
		Class589.aClass82_3.aClass418_4 = null;
		Class589.aClass82_3.aClass418_3 = null;
		Class589.aClass82_3.aClass418_2 = null;
		Class589.aClass82_3.anInt327 = 0;
		Class589.aClass82_3.anInt323 = 0;
		client.anInt3481 = 0;
		Class494.method30053();
		Class208.method25579();
		@Pc(32) int local32;
		for (local32 = 0; local32 < 2048; local32++) {
			client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local32] = null;
		}
		Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 = null;
		for (local32 = 0; local32 < client.anInt3438 * 759971875; local32++) {
			@Pc(56) Class104_Sub1_Sub1_Sub1 local56 = (Class104_Sub1_Sub1_Sub1) client.aClass77_Sub6Array1[local32].anObject5;
			if (local56 != null) {
				local56.anInt2880 = -776069067;
			}
		}
		Class681.method36081();
		Class264.method26451(Class96_Sub6.method7162());
		Class668.method33179(16);
		for (local32 = 0; local32 < 108; local32++) {
			client.aBooleanArray17[local32] = true;
		}
		Class47.method744(Class589.aClass82_3);
		Class39.aClass639_3 = null;
		Class265.aLong250 = 0L;
		Class96_Sub11.method19914();
		Class56.aClass93_Sub1_1.method6428();
	}
}
