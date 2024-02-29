package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acf")
public class Class55 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!acf", name = "dj", descriptor = "Lclient!ai;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!acf", name = "ho", descriptor = "Lclient!ady;")
	public static Class80_Sub1_Sub2 aClass80_Sub1_Sub2_1;

	@OriginalMember(owner = "client!acf", name = "uu", descriptor = "I")
	static int anInt187;

	@OriginalMember(owner = "client!acf", name = "p", descriptor = "I")
	public int anInt185 = 0;

	@OriginalMember(owner = "client!acf", name = "c", descriptor = "I")
	public int anInt184 = 0;

	@OriginalMember(owner = "client!acf", name = "v", descriptor = "I")
	public int anInt183 = 2076071936;

	@OriginalMember(owner = "client!acf", name = "l", descriptor = "I")
	public int anInt186 = 93485056;

	@OriginalMember(owner = "client!acf", name = "<init>", descriptor = "()V", line = 15)
	Class55() {
	}

	@OriginalMember(owner = "client!acf", name = "l", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method827(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!acf", name = "y", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method827(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!acf", name = "p", descriptor = "(Lclient!akv;B)V", line = 19)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method827(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!acf", name = "v", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method827(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!acf", name = "q", descriptor = "(Lclient!akv;II)V", line = 26)
	void method827(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt185 = arg0.method22478() * -1463508423;
		} else if (arg1 == 2) {
			this.anInt186 = arg0.method22483() * 2084614735;
		} else if (arg1 == 3) {
			this.anInt183 = arg0.method22483() * 1926199243;
		} else if (arg1 == 4) {
			this.anInt184 = arg0.method22487() * 1100421249;
		}
	}

	@OriginalMember(owner = "client!acf", name = "d", descriptor = "(Lclient!akv;I)V", line = 26)
	void method828(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt185 = arg0.method22478() * -1463508423;
		} else if (arg1 == 2) {
			this.anInt186 = arg0.method22483() * 2084614735;
		} else if (arg1 == 3) {
			this.anInt183 = arg0.method22483() * 1926199243;
		} else if (arg1 == 4) {
			this.anInt184 = arg0.method22487() * 1100421249;
		}
	}

	@OriginalMember(owner = "client!acf", name = "s", descriptor = "(Lclient!akv;I)V", line = 26)
	void method829(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt185 = arg0.method22478() * -1463508423;
		} else if (arg1 == 2) {
			this.anInt186 = arg0.method22483() * 2084614735;
		} else if (arg1 == 3) {
			this.anInt183 = arg0.method22483() * 1926199243;
		} else if (arg1 == 4) {
			this.anInt184 = arg0.method22487() * 1100421249;
		}
	}

	@OriginalMember(owner = "client!acf", name = "z", descriptor = "(I)V", line = 33)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!acf", name = "x", descriptor = "(II)V", line = 33)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!acf", name = "g", descriptor = "(I)V", line = 33)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!acf", name = "t", descriptor = "()V", line = 34)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!acf", name = "w", descriptor = "()V", line = 34)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!acf", name = "c", descriptor = "(I)V", line = 34)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!acf", name = "l", descriptor = "(Lclient!dx;I)V", line = 70)
	public static void method830(@OriginalArg(0) Class86 arg0) {
		Class248.aClass94_7 = (Class94) Class367.aClass415_1.method28640(client.anInterface51_1, Class611.anInt5569 * -1643399711, true, true);
		Class143_Sub8.aClass17_8 = Class367.aClass415_1.method28644(client.anInterface51_1, Class611.anInt5569 * -1643399711);
		Class128_Sub1.aClass94_5 = (Class94) Class367.aClass415_1.method28640(client.anInterface51_1, Class611.anInt5570 * -849564261, true, true);
		Class611.aClass17_13 = Class367.aClass415_1.method28644(client.anInterface51_1, Class611.anInt5570 * -849564261);
		Class260.aClass94_8 = (Class94) Class367.aClass415_1.method28640(client.anInterface51_1, Class611.anInt5571 * 973015101, true, true);
		Class346.aClass17_12 = Class367.aClass415_1.method28644(client.anInterface51_1, Class611.anInt5571 * 973015101);
	}

	@OriginalMember(owner = "client!acf", name = "i", descriptor = "(Lclient!yf;B)V", line = 80)
	static void method831(@OriginalArg(0) Class665 arg0) {
		@Pc(16) Class303 local16 = (Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anIntArray424 == null ? 0 : local16.anIntArray424.length;
	}

	@OriginalMember(owner = "client!acf", name = "ge", descriptor = "(I)V", line = 3297)
	static final void method832() {
		@Pc(1) int[] local1 = Class152.anIntArray221;
		@Pc(3) int local3;
		for (local3 = 0; local3 < Class152.anInt2399 * -1843550713; local3++) {
			@Pc(14) Class104_Sub1_Sub1_Sub1_Sub2 local14 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local1[local3]];
			if (local14 != null) {
				local14.method21112();
			}
		}
		for (local3 = 0; local3 < client.anInt3527 * -1125820437; local3++) {
			@Pc(34) long local34 = (long) client.anIntArray317[local3];
			@Pc(39) Class77_Sub6 local39 = (Class77_Sub6) client.aClass12_22.method173(local34);
			if (local39 != null) {
				((Class104_Sub1_Sub1_Sub1) local39.anObject5).method21112();
			}
		}
		if (client.anInt3443 * -1468443459 != 3) {
			return;
		}
		for (local3 = 0; local3 < Class589.aClass222Array1.length; local3++) {
			@Pc(64) Class222 local64 = Class589.aClass222Array1[local3];
			if (local64.aBoolean643) {
				local64.method25755().method21112();
			}
		}
	}
}
