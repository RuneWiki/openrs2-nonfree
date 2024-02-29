package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ix")
public class Class334 {

	@OriginalMember(owner = "client!ix", name = "p", descriptor = "Lclient!ix;")
	static final Class334 aClass334_3 = new Class334(0);

	@OriginalMember(owner = "client!ix", name = "c", descriptor = "Lclient!ix;")
	public static final Class334 aClass334_4 = new Class334(1);

	@OriginalMember(owner = "client!ix", name = "v", descriptor = "I")
	public int anInt4130;

	@OriginalMember(owner = "client!ix", name = "<init>", descriptor = "(I)V", line = 8)
	Class334(@OriginalArg(0) int arg0) {
		this.anInt4130 = arg0 * -253936245;
	}

	@OriginalMember(owner = "client!ix", name = "c", descriptor = "(I)Lclient!ix;", line = 13)
	static Class334 method27662(@OriginalArg(0) int arg0) {
		if (aClass334_3.anInt4130 * 964723235 == arg0) {
			return aClass334_3;
		} else if (aClass334_4.anInt4130 * 964723235 == arg0) {
			return aClass334_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ix", name = "v", descriptor = "(I)Lclient!ix;", line = 13)
	static Class334 method27663(@OriginalArg(0) int arg0) {
		if (aClass334_3.anInt4130 * 964723235 == arg0) {
			return aClass334_3;
		} else if (aClass334_4.anInt4130 * 964723235 == arg0) {
			return aClass334_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ix", name = "l", descriptor = "(I)Lclient!ix;", line = 13)
	static Class334 method27664(@OriginalArg(0) int arg0) {
		if (aClass334_3.anInt4130 * 964723235 == arg0) {
			return aClass334_3;
		} else if (aClass334_4.anInt4130 * 964723235 == arg0) {
			return aClass334_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ix", name = "y", descriptor = "(I)Lclient!ix;", line = 13)
	static Class334 method27665(@OriginalArg(0) int arg0) {
		if (aClass334_3.anInt4130 * 964723235 == arg0) {
			return aClass334_3;
		} else if (aClass334_4.anInt4130 * 964723235 == arg0) {
			return aClass334_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ix", name = "t", descriptor = "(IIB)I", line = 167)
	public static int method27666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local3 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}

	@OriginalMember(owner = "client!ix", name = "x", descriptor = "(Lclient!apo;I)I", line = 286)
	static int method27667(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class333 local2 = arg0.aClass333_1;
		if (local2.anIntArray437 != null) {
			local2 = local2.method27642(Class55.aClass124_1, Class55.aClass124_1);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(20) int local20 = local2.anInt4119 * 1144816973;
		@Pc(24) Class570 local24 = arg0.method21105();
		@Pc(29) int local29 = arg0.aClass151_Sub1_3.method23399();
		if (local29 == -1 || arg0.aClass151_Sub1_3.aBoolean363) {
			local20 = local2.anInt4108 * 1315529581;
		} else if (local29 == local24.anInt5365 * 1074876801 || local24.anInt5356 * 421310407 == local29 || local29 == local24.anInt5358 * 541177679 || local24.anInt5357 * -921167219 == local29) {
			local20 = local2.anInt4120 * -306882215;
		} else if (local24.anInt5359 * 1846476627 == local29 || local29 == local24.anInt5362 * -63558043 || local24.anInt5370 * -1045334803 == local29 || local29 == local24.anInt5360 * 630970333) {
			local20 = local2.anInt4118 * 1912925203;
		}
		return local20;
	}

	@OriginalMember(owner = "client!ix", name = "f", descriptor = "(IB)Ljava/lang/String;", line = 622)
	static String method27668(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}
}
