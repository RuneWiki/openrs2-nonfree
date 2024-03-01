package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public class Class293 {

	@OriginalMember(owner = "client!la", name = "ci", descriptor = "I")
	static int anInt4372;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!la;")
	public static final Class293 aClass293_2 = new Class293(14, 0);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!la;")
	public static final Class293 aClass293_3 = new Class293(15, -1);

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!la;")
	public static final Class293 aClass293_12 = new Class293(16, -2);

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!la;")
	public static final Class293 aClass293_4 = new Class293(19, -2);

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!la;")
	static final Class293 aClass293_5 = new Class293(23, 4);

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!la;")
	static final Class293 aClass293_6 = new Class293(24, -1);

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!la;")
	public static final Class293 aClass293_7 = new Class293(26, 0);

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!la;")
	static final Class293 aClass293_8 = new Class293(27, 0);

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!la;")
	public static final Class293 aClass293_1 = new Class293(28, -2);

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!la;")
	public static final Class293 aClass293_10 = new Class293(29, -2);

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!la;")
	public static final Class293 aClass293_11 = new Class293(30, -2);

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!la;")
	static final Class293 aClass293_9 = new Class293(31, 4);

	@OriginalMember(owner = "client!la", name = "n", descriptor = "[Lclient!la;")
	static final Class293[] aClass293Array1 = new Class293[32];

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public final int anInt4371;

	static {
		@Pc(77) Class293[] local77 = Class50_Sub1.method9482();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass293Array1[local77[local79].anInt4371 * 946648601] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()[Lclient!la;", line = 28)
	static Class293[] method25557() {
		return new Class293[] { aClass293_11, aClass293_12, aClass293_5, aClass293_3, aClass293_10, aClass293_7, aClass293_8, aClass293_9, aClass293_6, aClass293_4, aClass293_1, aClass293_2 };
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "()[Lclient!la;", line = 28)
	static Class293[] method25558() {
		return new Class293[] { aClass293_11, aClass293_12, aClass293_5, aClass293_3, aClass293_10, aClass293_7, aClass293_8, aClass293_9, aClass293_6, aClass293_4, aClass293_1, aClass293_2 };
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V", line = 31)
	Class293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4371 = arg0 * -2069084631;
	}

	@OriginalMember(owner = "client!la", name = "s", descriptor = "(Lclient!rh;I)V", line = 44)
	static void method25561(@OriginalArg(0) Interface47 arg0) {
		while (Class433.aLinkedList3.size() > 10) {
			Class433.aLinkedList3.remove();
		}
		Class433.aLinkedList3.add(arg0);
	}

	@OriginalMember(owner = "client!la", name = "af", descriptor = "(Lclient!vs;B)V", line = 3999)
	static final void method25559(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		if (arg0.anIntArray496[arg0.anInt5319 * 960738381] > arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}

	@OriginalMember(owner = "client!la", name = "sl", descriptor = "(Lclient!vs;I)V", line = 7460)
	static final void method25560(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		if (local16.aString170 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local16.aString170;
		}
	}

	@OriginalMember(owner = "client!la", name = "add", descriptor = "(Lclient!vs;B)V", line = 9211)
	static final void method25562(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(26) int local26 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class11_Sub2.method1217(local13, local26 == 1);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class177.anInt3474 * -908764545;
	}

	@OriginalMember(owner = "client!la", name = "ani", descriptor = "(Lclient!vs;I)V", line = 11468)
	static final void method25563(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) int local17 = Class510.aClass3_Sub45_37.aClass60_Sub33_5.method14179();
		if (local17 != local12) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub33_5, local12);
			Class26_Sub1_Sub1_Sub1.method16728();
			client.aBoolean573 = false;
		}
	}
}
