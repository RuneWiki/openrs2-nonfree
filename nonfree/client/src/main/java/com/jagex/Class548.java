package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public class Class548 {

	@OriginalMember(owner = "client!we", name = "s", descriptor = "[I")
	static int[] anIntArray498;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
	static int[] anIntArray499;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "[[[B")
	static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!we", name = "ht", descriptor = "Lclient!cz;")
	public static Interface9 anInterface9_4;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	static int anInt5328 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	static int anInt5329 = 0;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	static int anInt5330 = 0;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "[[B")
	static byte[][] aByteArrayArray26 = new byte[1000][];

	@OriginalMember(owner = "client!we", name = "h", descriptor = "[[B")
	static byte[][] aByteArrayArray25 = new byte[250][];

	@OriginalMember(owner = "client!we", name = "x", descriptor = "[[B")
	static byte[][] aByteArrayArray27 = new byte[50][];

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 14)
	Class548() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "([I[I)V", line = 19)
	public static void method32657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			anIntArray498 = null;
			anIntArray499 = null;
			aByteArrayArrayArray14 = null;
			return;
		}
		anIntArray498 = arg0;
		anIntArray499 = new int[arg0.length];
		aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < anIntArray498.length; local25++) {
			aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!we", name = "x", descriptor = "([I[I)V", line = 19)
	public static void method32659(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			anIntArray498 = null;
			anIntArray499 = null;
			aByteArrayArrayArray14 = null;
			return;
		}
		anIntArray498 = arg0;
		anIntArray499 = new int[arg0.length];
		aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < anIntArray498.length; local25++) {
			aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZI)[B", line = 35)
	public static synchronized byte[] method32658(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(21) byte[] local21;
		if ((arg0 == 100 || arg0 < 100 && arg1) && anInt5328 * -2061578253 > 0) {
			local21 = aByteArrayArray26[(anInt5328 -= 1211719995) * -2061578253];
			aByteArrayArray26[anInt5328 * -2061578253] = null;
			return local21;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && anInt5329 * 178143985 > 0) {
			local21 = aByteArrayArray25[(anInt5329 -= -497390063) * 178143985];
			aByteArrayArray25[anInt5329 * 178143985] = null;
			return local21;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && anInt5330 * 1103194679 > 0) {
			local21 = aByteArrayArray27[(anInt5330 -= 1665428359) * 1103194679];
			aByteArrayArray27[anInt5330 * 1103194679] = null;
			return local21;
		} else {
			@Pc(93) int local93;
			if (aByteArrayArrayArray14 != null) {
				for (local93 = 0; local93 < anIntArray498.length; local93++) {
					if ((arg0 == anIntArray498[local93] || arg0 < anIntArray498[local93] && arg1) && anIntArray499[local93] > 0) {
						@Pc(126) byte[] local126 = aByteArrayArrayArray14[local93][--anIntArray499[local93]];
						aByteArrayArrayArray14[local93][anIntArray499[local93]] = null;
						return local126;
					}
				}
			}
			if (arg1 && anIntArray498 != null) {
				for (local93 = 0; local93 < anIntArray498.length; local93++) {
					if (arg0 <= anIntArray498[local93] && anIntArray499[local93] < aByteArrayArrayArray14[local93].length) {
						return new byte[anIntArray498[local93]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "(II)[B", line = 72)
	public static synchronized byte[] method32656(@OriginalArg(0) int arg0) {
		return method32658(arg0, false);
	}

	@OriginalMember(owner = "client!we", name = "l", descriptor = "([BI)V", line = 76)
	public static synchronized void method32655(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt5328 * -2061578253 < 1000) {
			aByteArrayArray26[(anInt5328 += 1211719995) * -2061578253 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5329 * 178143985 < 250) {
			aByteArrayArray25[(anInt5329 += -497390063) * 178143985 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5330 * 1103194679 < 50) {
			aByteArrayArray27[(anInt5330 += 1665428359) * 1103194679 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(69) int local69 = 0; local69 < anIntArray498.length; local69++) {
				if (arg0.length == anIntArray498[local69] && anIntArray499[local69] < aByteArrayArrayArray14[local69].length) {
					aByteArrayArrayArray14[local69][anIntArray499[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "s", descriptor = "([B)V", line = 76)
	public static synchronized void method32660(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt5328 * -2061578253 < 1000) {
			aByteArrayArray26[(anInt5328 += 1211719995) * -2061578253 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5329 * 178143985 < 250) {
			aByteArrayArray25[(anInt5329 += -497390063) * 178143985 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5330 * 1103194679 < 50) {
			aByteArrayArray27[(anInt5330 += 1665428359) * 1103194679 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(69) int local69 = 0; local69 < anIntArray498.length; local69++) {
				if (arg0.length == anIntArray498[local69] && anIntArray499[local69] < aByteArrayArrayArray14[local69].length) {
					aByteArrayArrayArray14[local69][anIntArray499[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "j", descriptor = "(I)Lclient!wd;", line = 141)
	public static Class547 method32662() {
		return Class415.aClass547_1 == null ? Class547.aClass547_6 : Class415.aClass547_1;
	}

	@OriginalMember(owner = "client!we", name = "amc", descriptor = "(Lclient!vs;B)V", line = 11205)
	static final void method32661(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3082 * 277198609;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3056 * -116258853;
	}
}
