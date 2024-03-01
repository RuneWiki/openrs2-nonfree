package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public class Class203 {

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	public static final int anInt3691 = 1;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
	public static final int anInt3692 = 2;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public static final int anInt3693 = 4;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	public static final int anInt3694 = 3;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 9)
	Class203() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "(IB)Z", line = 51)
	public static boolean method24168(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "(III)I", line = 227)
	public static final int method24171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(ZI)V", line = 243)
	static void method24163(@OriginalArg(0) boolean arg0) {
		Class67.aString61 = Class67.aString61.trim();
		Class67.anInt1836 = 0;
		if (Class67.aString61.length() == 0) {
			Class67.anInt1837 = 0;
			return;
		}
		Class215.method24289("--> " + Class67.aString61);
		Class339.method26424(Class67.aString61, false, arg0);
		if (arg0) {
			Class67.anInt1837 = Class67.aString61.length() * 1751742251;
		} else {
			Class67.anInt1837 = 0;
			Class67.aString61 = "";
		}
	}

	@OriginalMember(owner = "client!gn", name = "ee", descriptor = "(I)V", line = 807)
	public static void method24169() {
		Class58_Sub1.aHashMap3.clear();
		Class58_Sub1.aHashMap4.clear();
	}

	@OriginalMember(owner = "client!gn", name = "up", descriptor = "(Lclient!vs;I)V", line = 7861)
	static final void method24164(@OriginalArg(0) Class536 arg0) {
		@Pc(3) Class464 local3 = new Class464();
		local3.method28616((Class3_Sub32) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local3.method28625();
	}

	@OriginalMember(owner = "client!gn", name = "vi", descriptor = "(Lclient!vs;I)V", line = 7968)
	static final void method24170(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean594 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gn", name = "or", descriptor = "(Lclient!vs;B)V", line = 8873)
	static final void method24165(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 < local23 ? local13 : local23;
	}

	@OriginalMember(owner = "client!gn", name = "acx", descriptor = "(Lclient!vs;B)V", line = 9112)
	static final void method24166(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class594 local28 = Class44_Sub3.aClass596_1.method33435(local13);
		if (local23 < 1 || local23 > 5 || local28.aStringArray23[local23 - 1] == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local28.aStringArray23[local23 - 1];
		}
	}

	@OriginalMember(owner = "client!gn", name = "aos", descriptor = "(Lclient!vs;I)V", line = 11599)
	static final void method24167(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub25_1.method13808();
	}
}
