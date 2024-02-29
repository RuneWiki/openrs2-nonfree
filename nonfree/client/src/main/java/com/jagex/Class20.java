package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aau")
public class Class20 {

	@OriginalMember(owner = "client!aau", name = "c", descriptor = "I")
	static final int anInt110 = 1;

	@OriginalMember(owner = "client!aau", name = "v", descriptor = "I")
	static final int anInt111 = 2;

	@OriginalMember(owner = "client!aau", name = "y", descriptor = "I")
	static final int anInt112 = 8;

	@OriginalMember(owner = "client!aau", name = "p", descriptor = "I")
	static final int anInt113 = 2;

	@OriginalMember(owner = "client!aau", name = "l", descriptor = "I")
	static final int anInt114 = 4;

	@OriginalMember(owner = "client!aau", name = "w", descriptor = "[I")
	public int[] anIntArray10 = new int[3];

	@OriginalMember(owner = "client!aau", name = "t", descriptor = "[I")
	public int[] anIntArray8 = new int[3];

	@OriginalMember(owner = "client!aau", name = "q", descriptor = "[I")
	public int[] anIntArray9 = new int[2];

	@OriginalMember(owner = "client!aau", name = "x", descriptor = "[I")
	public int[] anIntArray11 = new int[2];

	@OriginalMember(owner = "client!aau", name = "d", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!aau", name = "s", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!aau", name = "<init>", descriptor = "(Lclient!aas;)V", line = 18)
	Class20(@OriginalArg(0) Class18 arg0) {
		this.anIntArray10[0] = arg0.anInt74 * -297379063;
		this.anIntArray10[1] = arg0.anInt75 * 384637321;
		this.anIntArray10[2] = arg0.anInt78 * -1908318299;
		this.anIntArray8[0] = arg0.anInt87 * 383860379;
		this.anIntArray8[1] = arg0.anInt77 * 1184936625;
		this.anIntArray8[2] = arg0.anInt79 * 914690775;
		this.anIntArray9[0] = arg0.anInt83 * 2038736063;
		this.anIntArray9[1] = arg0.anInt84 * 331707609;
		this.anIntArray11[0] = arg0.anInt85 * -912813653;
		this.anIntArray11[1] = arg0.anInt86 * -1648499137;
		if (arg0.aShortArray1 != null) {
			this.aShortArray7 = new short[arg0.aShortArray1.length];
			System.arraycopy(arg0.aShortArray1, 0, this.aShortArray7, 0, this.aShortArray7.length);
		}
		if (arg0.aShortArray3 != null) {
			this.aShortArray6 = new short[arg0.aShortArray3.length];
			System.arraycopy(arg0.aShortArray3, 0, this.aShortArray6, 0, this.aShortArray6.length);
		}
	}

	@OriginalMember(owner = "client!aau", name = "v", descriptor = "(Lclient!aas;Lclient!akv;)Lclient!aau;", line = 44)
	public static Class20 method409(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		return Class551.method30996(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!aau", name = "y", descriptor = "(Lclient!aas;Lclient!akv;)Lclient!aau;", line = 44)
	public static Class20 method410(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		return Class551.method30996(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!aau", name = "l", descriptor = "(Lclient!aas;Lclient!akv;)Lclient!aau;", line = 44)
	public static Class20 method411(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		return Class551.method30996(arg0, arg1, 2);
	}

	@OriginalMember(owner = "client!aau", name = "t", descriptor = "(Lclient!aas;Lclient!akv;I)Lclient!aau;", line = 48)
	static Class20 method412(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class20 local4 = new Class20(arg0);
		@Pc(8) int local8 = arg1.method22478();
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(24) boolean local24 = (local8 & 0x2) != 0;
		@Pc(33) boolean local33 = (local8 & 0x4) != 0;
		@Pc(42) boolean local42 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray10[0] = arg1.method22483();
				local4.anIntArray8[0] = arg1.method22483();
			} else {
				local4.anIntArray10[0] = arg1.method22549();
				local4.anIntArray8[0] = arg1.method22549();
			}
			if (arg0.anInt75 * 384637321 != -1 || arg0.anInt77 * 1184936625 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray10[1] = arg1.method22483();
					local4.anIntArray8[1] = arg1.method22483();
				} else {
					local4.anIntArray10[1] = arg1.method22549();
					local4.anIntArray8[1] = arg1.method22549();
				}
			}
			if (arg0.anInt78 * -1908318299 != -1 || arg0.anInt79 * 914690775 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray10[2] = arg1.method22483();
					local4.anIntArray8[2] = arg1.method22483();
				} else {
					local4.anIntArray10[2] = arg1.method22549();
					local4.anIntArray8[2] = arg1.method22549();
				}
			}
		}
		if (local24) {
			if (arg2 <= 1) {
				local4.anIntArray9[0] = arg1.method22483();
				local4.anIntArray11[0] = arg1.method22483();
			} else {
				local4.anIntArray9[0] = arg1.method22549();
				local4.anIntArray11[0] = arg1.method22549();
			}
			if (arg0.anInt84 * 331707609 != -1 || arg0.anInt86 * -1648499137 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray9[1] = arg1.method22483();
					local4.anIntArray11[1] = arg1.method22483();
				} else {
					local4.anIntArray9[1] = arg1.method22549();
					local4.anIntArray11[1] = arg1.method22549();
				}
			}
		}
		@Pc(248) int local248;
		@Pc(251) int[] local251;
		@Pc(283) int local283;
		if (local33) {
			local248 = arg1.method22483();
			local251 = new int[] { local248 & 0xF, local248 >> 4 & 0xF, local248 >> 8 & 0xF, local248 >> 12 & 0xF };
			for (local283 = 0; local283 < 4; local283++) {
				if (local251[local283] != 15) {
					local4.aShortArray7[local251[local283]] = (short) arg1.method22483();
				}
			}
		}
		if (local42) {
			local248 = arg1.method22478();
			local251 = new int[] { local248 & 0xF, local248 >> 4 & 0xF };
			for (local283 = 0; local283 < 2; local283++) {
				if (local251[local283] != 15) {
					local4.aShortArray6[local251[local283]] = (short) arg1.method22483();
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aau", name = "w", descriptor = "(Lclient!aas;Lclient!akv;I)Lclient!aau;", line = 48)
	static Class20 method413(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class20 local4 = new Class20(arg0);
		@Pc(8) int local8 = arg1.method22478();
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(24) boolean local24 = (local8 & 0x2) != 0;
		@Pc(33) boolean local33 = (local8 & 0x4) != 0;
		@Pc(42) boolean local42 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray10[0] = arg1.method22483();
				local4.anIntArray8[0] = arg1.method22483();
			} else {
				local4.anIntArray10[0] = arg1.method22549();
				local4.anIntArray8[0] = arg1.method22549();
			}
			if (arg0.anInt75 * 384637321 != -1 || arg0.anInt77 * 1184936625 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray10[1] = arg1.method22483();
					local4.anIntArray8[1] = arg1.method22483();
				} else {
					local4.anIntArray10[1] = arg1.method22549();
					local4.anIntArray8[1] = arg1.method22549();
				}
			}
			if (arg0.anInt78 * -1908318299 != -1 || arg0.anInt79 * 914690775 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray10[2] = arg1.method22483();
					local4.anIntArray8[2] = arg1.method22483();
				} else {
					local4.anIntArray10[2] = arg1.method22549();
					local4.anIntArray8[2] = arg1.method22549();
				}
			}
		}
		if (local24) {
			if (arg2 <= 1) {
				local4.anIntArray9[0] = arg1.method22483();
				local4.anIntArray11[0] = arg1.method22483();
			} else {
				local4.anIntArray9[0] = arg1.method22549();
				local4.anIntArray11[0] = arg1.method22549();
			}
			if (arg0.anInt84 * 331707609 != -1 || arg0.anInt86 * -1648499137 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray9[1] = arg1.method22483();
					local4.anIntArray11[1] = arg1.method22483();
				} else {
					local4.anIntArray9[1] = arg1.method22549();
					local4.anIntArray11[1] = arg1.method22549();
				}
			}
		}
		@Pc(248) int local248;
		@Pc(251) int[] local251;
		@Pc(283) int local283;
		if (local33) {
			local248 = arg1.method22483();
			local251 = new int[] { local248 & 0xF, local248 >> 4 & 0xF, local248 >> 8 & 0xF, local248 >> 12 & 0xF };
			for (local283 = 0; local283 < 4; local283++) {
				if (local251[local283] != 15) {
					local4.aShortArray7[local251[local283]] = (short) arg1.method22483();
				}
			}
		}
		if (local42) {
			local248 = arg1.method22478();
			local251 = new int[] { local248 & 0xF, local248 >> 4 & 0xF };
			for (local283 = 0; local283 < 2; local283++) {
				if (local251[local283] != 15) {
					local4.aShortArray6[local251[local283]] = (short) arg1.method22483();
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aau", name = "t", descriptor = "(B)V", line = 151)
	public static void method414() {
		if (Class589.anInt5485 * 1114067909 == 106) {
			Class589.anInt5485 = 1218165706;
		}
	}

	@OriginalMember(owner = "client!aau", name = "bv", descriptor = "(Lclient!yf;B)V", line = 4630)
	static final void method415(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5782 -= -2111195934;
		if (arg0.aLongArray28[arg0.anInt5782 * 1572578961] > arg0.aLongArray28[arg0.anInt5782 * 1572578961 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!aau", name = "jn", descriptor = "(Lclient!alc;IZZI)V", line = 6240)
	static final void method416(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(37) int local37;
		@Pc(46) int local46;
		if (arg0 instanceof Class104_Sub1_Sub1 && arg0 instanceof Interface61) {
			@Pc(8) Class104_Sub1_Sub1 local8 = (Class104_Sub1_Sub1) arg0;
			@Pc(18) int local18 = local8.aShort129 - local8.aShort131 + 1 << 9;
			@Pc(28) int local28 = local8.aShort130 - local8.aShort132 + 1 << 9;
			local37 = local18 / 2 + (local8.aShort131 << 9);
			local46 = (local8.aShort132 << 9) + local28 / 2;
		} else {
			@Pc(51) Class447 local51 = arg0.method24085().aClass447_61;
			local37 = (int) local51.aFloat277;
			local46 = (int) local51.aFloat278;
		}
		Class196.method25466(arg0.aByte100, local37, local46, 0, arg1, arg2, arg3);
	}
}
