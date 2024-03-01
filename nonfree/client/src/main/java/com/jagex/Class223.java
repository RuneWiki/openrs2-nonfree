package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public class Class223 {

	@OriginalMember(owner = "client!hi", name = "jg", descriptor = "Lclient!ahb;")
	public static Class3_Sub41 aClass3_Sub41_17;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Lclient!hi;")
	public static final Class223 aClass223_1 = new Class223(0);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Lclient!hi;")
	public static final Class223 aClass223_2 = new Class223(1);

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	int anInt3731;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V", line = 8)
	Class223(@OriginalArg(0) int arg0) {
		this.anInt3731 = arg0 * -1152572693;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Lclient!hi;", line = 13)
	public static Class223 method24435(@OriginalArg(0) int arg0) {
		if (aClass223_1.anInt3731 * 228292035 == arg0) {
			return aClass223_1;
		} else if (arg0 == aClass223_2.anInt3731 * 228292035) {
			return aClass223_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)Lclient!hi;", line = 13)
	public static Class223 method24436(@OriginalArg(0) int arg0) {
		if (aClass223_1.anInt3731 * 228292035 == arg0) {
			return aClass223_1;
		} else if (arg0 == aClass223_2.anInt3731 * 228292035) {
			return aClass223_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)Lclient!hi;", line = 13)
	public static Class223 method24437(@OriginalArg(0) int arg0) {
		if (aClass223_1.anInt3731 * 228292035 == arg0) {
			return aClass223_1;
		} else if (arg0 == aClass223_2.anInt3731 * 228292035) {
			return aClass223_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "(I)Lclient!hi;", line = 13)
	public static Class223 method24438(@OriginalArg(0) int arg0) {
		if (aClass223_1.anInt3731 * 228292035 == arg0) {
			return aClass223_1;
		} else if (arg0 == aClass223_2.anInt3731 * 228292035) {
			return aClass223_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "(I)Lclient!hi;", line = 13)
	public static Class223 method24439(@OriginalArg(0) int arg0) {
		if (aClass223_1.anInt3731 * 228292035 == arg0) {
			return aClass223_1;
		} else if (arg0 == aClass223_2.anInt3731 * 228292035) {
			return aClass223_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Lclient!afw;", line = 19)
	static Class53_Sub6 method24444() {
		@Pc(4) Class53_Sub6 local4 = (Class53_Sub6) Class53_Sub6.aClass559_3.method32832();
		if (local4 == null) {
			return new Class53_Sub6();
		} else {
			Class53_Sub6.anInt1228 -= -1785386157;
			return local4;
		}
	}

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "(Lclient!vs;B)V", line = 3941)
	static final void method24443(@OriginalArg(0) Class536 arg0) {
		@Pc(9) Class11 local9 = (Class11) arg0.aClass3_Sub1_Sub6_2.anObjectArray4[arg0.anInt5318 * -2140198955];
		@Pc(30) Interface6 local30 = (Interface6) (arg0.anIntArray497[arg0.anInt5318 * -2140198955] == 0 ? arg0.aMap15.get(local9.aClass43_3) : arg0.aMap16.get(local9.aClass43_3));
		@Pc(35) Class342 local35 = local9.aClass339_3.method26428();
		if (Class342.aClass342_5 == local35) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local30.method32385(local9);
		} else if (local35 == Class342.aClass342_2) {
			arg0.aLongArray18[(arg0.anInt5316 += 2125691367) * 196643287 - 1] = local30.method32393(local9);
		} else if (Class342.aClass342_3 == local35) {
			try {
				@Pc(88) String local88 = (String) local30.method32408(local9);
				if (local88 == null) {
					local88 = "null";
				}
				arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local88;
			} catch (@Pc(109) Exception local109) {
				throw new RuntimeException(local109);
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hi", name = "ba", descriptor = "(Lclient!vs;I)V", line = 4278)
	static final void method24440(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 == null) {
			return;
		}
		@Pc(29) int local29;
		for (local29 = 0; local29 < Class220.anIntArray393.length; local29++) {
			if (Class220.anIntArray393[local29] == local13) {
				Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1.method29195(local29, local23, Class585.aClass228_2);
				return;
			}
		}
		for (local29 = 0; local29 < Class220.anIntArray394.length; local29++) {
			if (local13 == Class220.anIntArray394[local29]) {
				Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1.method29195(local29, local23, Class585.aClass228_2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "of", descriptor = "(Lclient!vs;B)V", line = 6693)
	static final void method24441(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class472.method28778(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!hi", name = "wu", descriptor = "(Lclient!vs;B)V", line = 8097)
	static final void method24445(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3115 * 2077649275;
	}

	@OriginalMember(owner = "client!hi", name = "ls", descriptor = "(Lclient!fo;I)V", line = 11135)
	public static void method24442(@OriginalArg(0) Class178 arg0) {
		if (arg0.anInt3582 * 2131604787 == client.anInt3155 * -589639885) {
			client.aBooleanArray19[arg0.anInt3581 * -1900524041] = true;
		}
	}
}
