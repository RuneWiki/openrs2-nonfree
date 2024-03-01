package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public class Class177 {

	@OriginalMember(owner = "client!fn", name = "tc", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!fn", name = "vo", descriptor = "I")
	public static int anInt3474;

	@OriginalMember(owner = "client!fn", name = "bz", descriptor = "I")
	static int anInt3475;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 4)
	Class177() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "(J)V", line = 9)
	public static final void method23418(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class383.method27327(arg0 - 1L);
			Class383.method27327(1L);
		} else {
			Class383.method27327(arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "(J)V", line = 9)
	public static final void method23419(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class383.method27327(arg0 - 1L);
			Class383.method27327(1L);
		} else {
			Class383.method27327(arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "(J)V", line = 9)
	public static final void method23420(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class383.method27327(arg0 - 1L);
			Class383.method27327(1L);
		} else {
			Class383.method27327(arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "(J)V", line = 9)
	public static final void method23421(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class383.method27327(arg0 - 1L);
			Class383.method27327(1L);
		} else {
			Class383.method27327(arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "(J)V", line = 9)
	public static final void method23422(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class383.method27327(arg0 - 1L);
			Class383.method27327(1L);
		} else {
			Class383.method27327(arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "(Lclient!afw;I)V", line = 28)
	static void method23426(@OriginalArg(0) Class53_Sub6 arg0) {
		arg0.aClass26_Sub1_Sub1_Sub1_1 = null;
		if (Class53_Sub6.anInt1228 * 1669222619 < 20) {
			Class53_Sub6.aClass559_3.method32819(arg0);
			Class53_Sub6.anInt1228 += -1785386157;
		}
	}

	@OriginalMember(owner = "client!fn", name = "aa", descriptor = "(B)I", line = 118)
	static int method23427() {
		return 13;
	}

	@OriginalMember(owner = "client!fn", name = "ek", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 4907)
	static final void method23423(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3511 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * -1650083787;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "iu", descriptor = "(Lclient!vs;I)V", line = 5536)
	static final void method23424(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class186.method23927(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fn", name = "ame", descriptor = "(Lclient!vs;I)V", line = 11353)
	static final void method23425(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub35_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1 ? 1 : 0);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
