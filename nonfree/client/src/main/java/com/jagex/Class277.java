package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public class Class277 {

	@OriginalMember(owner = "client!kh", name = "br", descriptor = "Lclient!co;")
	public static Class6 aClass6_26;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "Lclient!kh;")
	static final Class277 aClass277_10 = new Class277();

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!kh;")
	static final Class277 aClass277_11 = new Class277();

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!kh;")
	static final Class277 aClass277_9 = new Class277();

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 15)
	Class277() {
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(II)I", line = 18)
	public int method25391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class128.anInt3317 * 2037417253 > arg1 ? Class128.anInt3317 * 2037417253 : arg1;
		if (aClass277_10 == this) {
			return 0;
		} else if (aClass277_9 == this) {
			return local10 - arg0;
		} else if (aClass277_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(II)I", line = 18)
	public int method25392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class128.anInt3317 * 2037417253 > arg1 ? Class128.anInt3317 * 2037417253 : arg1;
		if (aClass277_10 == this) {
			return 0;
		} else if (aClass277_9 == this) {
			return local10 - arg0;
		} else if (aClass277_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "(II)I", line = 18)
	public int method25393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class128.anInt3317 * 2037417253 > arg1 ? Class128.anInt3317 * 2037417253 : arg1;
		if (aClass277_10 == this) {
			return 0;
		} else if (aClass277_9 == this) {
			return local10 - arg0;
		} else if (aClass277_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)I", line = 18)
	public int method25394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class128.anInt3317 * 2037417253 > arg1 ? Class128.anInt3317 * 2037417253 : arg1;
		if (aClass277_10 == this) {
			return 0;
		} else if (aClass277_9 == this) {
			return local10 - arg0;
		} else if (aClass277_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "(II)I", line = 18)
	public int method25395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class128.anInt3317 * 2037417253 > arg1 ? Class128.anInt3317 * 2037417253 : arg1;
		if (aClass277_10 == this) {
			return 0;
		} else if (aClass277_9 == this) {
			return local10 - arg0;
		} else if (aClass277_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "dw", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4734)
	static final void method25402(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= -1173721806;
		arg0.aBoolean637 = true;
		arg0.anInt3536 = Math.max(Math.min(arg2.anIntArray496[arg2.anInt5319 * 960738381], 2816), 0) * -2011882241;
		arg0.anInt3534 = Math.max(Math.min(arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1], 2816), 0) * -147890377;
		arg0.anInt3535 = Math.max(Math.min(arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2], 2816), 0) * 256603849;
		@Pc(71) int local71 = Math.max(Math.min(arg2.anIntArray496[arg2.anInt5319 * 960738381 + 3], 255), 0);
		@Pc(85) int local85 = Math.max(Math.min(arg2.anIntArray496[arg2.anInt5319 * 960738381 + 4], 255), 0);
		@Pc(99) int local99 = Math.max(Math.min(arg2.anIntArray496[arg2.anInt5319 * 960738381 + 5], 255), 0);
		arg0.anInt3537 = (local71 << 16 | local85 << 8 | local99) * -1370113781;
		arg0.anInt3531 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 6] * 1852359759;
		arg0.anInt3579 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 7] * 1055522159;
		arg0.anInt3533 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 8] * -990781867;
		arg0.anInt3538 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 9] * -1429585751;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "abh", descriptor = "(Lclient!vs;I)V", line = 8880)
	static final void method25396(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 > local23 ? local13 : local23;
	}

	@OriginalMember(owner = "client!kh", name = "acj", descriptor = "(Lclient!vs;B)V", line = 9174)
	static final void method25397(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class44_Sub3.aClass596_1.method33435(local12).anInt5478 * 375641167;
	}

	@OriginalMember(owner = "client!kh", name = "aia", descriptor = "(Lclient!vs;I)V", line = 10492)
	static final void method25401(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= -1924925971;
		Class13_Sub4.method5626((String) arg0.anObjectArray42[arg0.anInt5315 * 996806575], (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1], (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 2], arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1, true);
	}

	@OriginalMember(owner = "client!kh", name = "mz", descriptor = "(Ljava/lang/String;I)V", line = 11547)
	public static final void method25400(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(8) String local8 = Class65_Sub1.method13183(arg0, Class141.aClass623_1);
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < client.anInt3042 * -1645830611; local13++) {
			@Pc(22) Class313 local22 = client.aClass313Array1[local13];
			@Pc(25) String local25 = local22.aString202;
			@Pc(30) String local30 = Class65_Sub1.method13183(local25, Class141.aClass623_1);
			if (Class574.method33111(arg0, local8, local25, local30)) {
				client.anInt3042 -= -884907611;
				for (@Pc(43) int local43 = local13; local43 < client.anInt3042 * -1645830611; local43++) {
					client.aClass313Array1[local43] = client.aClass313Array1[local43 + 1];
				}
				client.anInt3052 = client.anInt3138 * 1482989417;
				@Pc(65) Class82 local65 = Class406.method27657();
				@Pc(71) Class3_Sub23 local71 = Class269.method25284(Class311.aClass311_41, local65.aClass577_2);
				local71.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0));
				local71.aClass3_Sub41_Sub1_1.method20260(arg0);
				local65.method21601(local71);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "ats", descriptor = "(Lclient!vs;I)V", line = 12406)
	static final void method25399(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13484() ? 1 : 0;
	}

	@OriginalMember(owner = "client!kh", name = "auf", descriptor = "(Lclient!vs;B)V", line = 12610)
	static final void method25398(@OriginalArg(0) Class536 arg0) {
		@Pc(17) Class178 local17 = arg0.aClass26_Sub1_Sub1_Sub1_4.aClass186_3.method23917(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		local17.aClass178Array5 = null;
		local17.aClass178Array6 = null;
		Class223.method24442(local17);
	}
}
