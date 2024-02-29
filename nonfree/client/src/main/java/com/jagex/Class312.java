package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hy")
public class Class312 {

	@OriginalMember(owner = "client!hy", name = "p", descriptor = "Lclient!hy;")
	static final Class312 aClass312_2 = new Class312(0);

	@OriginalMember(owner = "client!hy", name = "c", descriptor = "Lclient!hy;")
	static final Class312 aClass312_3 = new Class312(1);

	@OriginalMember(owner = "client!hy", name = "v", descriptor = "Lclient!hy;")
	static final Class312 aClass312_4 = new Class312(2);

	@OriginalMember(owner = "client!hy", name = "l", descriptor = "Lclient!hy;")
	public static final Class312 aClass312_5 = new Class312(3);

	@OriginalMember(owner = "client!hy", name = "y", descriptor = "Lclient!hy;")
	public static final Class312 aClass312_6 = new Class312(4);

	@OriginalMember(owner = "client!hy", name = "w", descriptor = "Lclient!hy;")
	public static final Class312 aClass312_7 = new Class312(5);

	@OriginalMember(owner = "client!hy", name = "t", descriptor = "I")
	int anInt4062;

	@OriginalMember(owner = "client!hy", name = "<init>", descriptor = "(I)V", line = 12)
	Class312(@OriginalArg(0) int arg0) {
		this.anInt4062 = arg0 * 1260126601;
	}

	@OriginalMember(owner = "client!hy", name = "q", descriptor = "(Lclient!akv;I)Lclient!mq;", line = 16)
	public static Class118 method27300(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22500();
		@Pc(11) int local11 = arg0.method22500();
		return new Class118_Sub3(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11);
	}

	@OriginalMember(owner = "client!hy", name = "c", descriptor = "(I)Lclient!hy;", line = 17)
	public static Class312 method27301(@OriginalArg(0) int arg0) {
		if (arg0 == aClass312_2.anInt4062 * -1821981511) {
			return aClass312_2;
		} else if (aClass312_3.anInt4062 * -1821981511 == arg0) {
			return aClass312_3;
		} else if (arg0 == aClass312_4.anInt4062 * -1821981511) {
			return aClass312_4;
		} else if (arg0 == aClass312_5.anInt4062 * -1821981511) {
			return aClass312_5;
		} else if (aClass312_6.anInt4062 * -1821981511 == arg0) {
			return aClass312_6;
		} else if (aClass312_7.anInt4062 * -1821981511 == arg0) {
			return aClass312_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hy", name = "v", descriptor = "(I)Lclient!hy;", line = 17)
	public static Class312 method27302(@OriginalArg(0) int arg0) {
		if (arg0 == aClass312_2.anInt4062 * -1821981511) {
			return aClass312_2;
		} else if (aClass312_3.anInt4062 * -1821981511 == arg0) {
			return aClass312_3;
		} else if (arg0 == aClass312_4.anInt4062 * -1821981511) {
			return aClass312_4;
		} else if (arg0 == aClass312_5.anInt4062 * -1821981511) {
			return aClass312_5;
		} else if (aClass312_6.anInt4062 * -1821981511 == arg0) {
			return aClass312_6;
		} else if (aClass312_7.anInt4062 * -1821981511 == arg0) {
			return aClass312_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hy", name = "z", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 213)
	static boolean method27303(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Class675.anInt5802 = 268768563;
		Class589.aClass82_3 = client.aClass82_1;
		return Class591.method31826(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!hy", name = "ex", descriptor = "(IIII)I", line = 917)
	public static int method27304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class136_Sub1.anInt1702 * -1857977261 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - Class136_Sub1.anInt1674;
		@Pc(18) int local18 = arg2 - Class136_Sub1.anInt1675;
		for (@Pc(23) Class77_Sub30 local23 = (Class77_Sub30) Class136_Sub1.aClass695_23.method36395(); local23 != null; local23 = (Class77_Sub30) Class136_Sub1.aClass695_23.method36406()) {
			if (local23.anInt1635 * 1592054281 == arg0) {
				@Pc(38) int local38 = local23.anInt1638 * 1412374331;
				@Pc(43) int local43 = local23.anInt1636 * -958626707;
				@Pc(53) int local53 = Class136_Sub1.anInt1674 + local38 << 14 | local43 + Class136_Sub1.anInt1675;
				@Pc(69) int local69 = (local18 - local43) * (local18 - local43) + (local14 - local38) * (local14 - local38);
				if (local8 < 0 || local69 < local10) {
					local8 = local53;
					local10 = local69;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!hy", name = "up", descriptor = "(Lclient!yf;B)V", line = 8177)
	static final void method27305(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		Class94_Sub4.aClass261_1.method26354(arg0.anIntArray536[arg0.anInt5784 * 2088438307], 255);
	}

	@OriginalMember(owner = "client!hy", name = "xb", descriptor = "(Lclient!yf;I)V", line = 8638)
	static final void method27306(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3474 * 851750459;
	}

	@OriginalMember(owner = "client!hy", name = "afg", descriptor = "(Lclient!yf;B)V", line = 10398)
	static final void method27307(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class77_Sub38_Sub2.method22788(local13);
	}
}
