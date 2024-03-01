package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public class Class134 {

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!ny;")
	static Class359 aClass359_34;

	@OriginalMember(owner = "client!ds", name = "ot", descriptor = "I")
	public static int anInt3382;

	@OriginalMember(owner = "client!ds", name = "ab", descriptor = "I")
	static int anInt3383;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	int anInt3381;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "[Lclient!dp;")
	Class133[] aClass133Array1;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ny;)V", line = 14)
	public Class134(@OriginalArg(0) Class359 arg0) {
		this.anInt3381 = arg0.method26682(0) * 786674399;
		this.aClass133Array1 = new Class133[this.anInt3381 * -758347489];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3381 * -758347489; local18++) {
			@Pc(33) Class3_Sub41 local33 = new Class3_Sub41(arg0.method26713(0, local18));
			if (local33.aByteArray51 == null) {
				this.aClass133Array1[local18] = null;
			} else {
				try {
					@Pc(46) Class133 local46 = new Class133();
					@Pc(50) int local50 = local33.method20269();
					if (local50 == 0) {
						local46.anInt3355 = 451001664;
					} else if (local50 == 1) {
						local46.anInt3355 = 902003328;
					} else if (local50 == 2) {
						local46.anInt3355 = 1804006656;
					} else if (local50 == 3) {
						local46.anInt3355 = -686953984;
					} else if (local50 == 4) {
						local46.anInt3355 = -1373907968;
					}
					@Pc(87) int local87 = local33.method20275();
					if ((local87 & 0x1) != 0) {
						local46.anInt3351 = local33.method20271() * 2021532473;
						local33.method20269();
					}
					@Pc(116) int local116;
					if ((local87 & 0x1000) != 0) {
						local46.anIntArray329 = new int[6];
						local46.aByteArray61 = new byte[6];
						for (local116 = 0; local116 < 6; local116++) {
							local46.anIntArray329[local116] = local33.method20271();
							local46.aByteArray61[local116] = (byte) local33.method20269();
						}
					}
					if ((local87 & 0x2) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x4) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x8) != 0) {
						local33.method20271();
					}
					if ((local87 & 0x10) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x20) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x40) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x80) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x100) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x200) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x400) != 0) {
						local33.method20271();
						local33.method20269();
					}
					if ((local87 & 0x800) != 0) {
						local33.method20271();
						local33.method20269();
					}
					local116 = local33.method20269();
					local46.aByte112 = (byte) (local116 & 0xF);
					local46.aByte116 = (byte) (local116 >> 4 & 0xF);
					@Pc(292) int local292 = local33.method20275();
					if ((local292 & 0x10) != 0) {
						local33.method20448();
						local33.method20448();
					}
					if ((local292 & 0x20) != 0) {
						local33.method20275();
					}
					if ((local292 & 0x40) != 0) {
						local33.method20275();
					}
					if ((local292 & 0x80) != 0) {
						local33.method20275();
					}
					if ((local292 & 0x100) != 0) {
						local33.method20275();
					}
					if ((local292 & 0x200) != 0) {
						local33.method20275();
					}
					local46.aBoolean618 = local33.method20269() == 1;
					Class356.method26649(Class57.method12278(), local33.method20269());
					Class356.method26649(Class351.method26585(), local33.method20269());
					local46.aClass458_2 = (Class458) Class356.method26649(Class175.method23410(), local33.method20269());
					if (Class458.aClass458_3 == local46.aClass458_2) {
						local46.aByte115 = (byte) local33.method20269();
					}
					@Pc(396) int local396 = local33.method20269();
					if ((local396 & 0x1) != 0) {
						local46.aByte113 = (byte) local33.method20269();
					}
					if ((local396 & 0x2) != 0) {
						local46.aByte117 = (byte) local33.method20269();
					}
					if ((local396 & 0x4) != 0) {
						local33.method20269();
					}
					if ((local396 & 0x8) != 0) {
						local33.method20269();
					}
					if (local33.method20269() == 1) {
						local46.aByte118 = (byte) local33.method20269();
						local46.aByte119 = (byte) local33.method20269();
						local46.anInt3371 = local33.method20275() * 67529767;
						local46.aByte114 = (byte) local33.method20269();
						local33.method20269();
						local46.aByte111 = (byte) local33.method20269();
						local46.aBoolean619 = local33.method20269() == 1;
						local46.aBoolean620 = local33.method20269() == 1;
						local46.aByte121 = (byte) local33.method20269();
						local46.aByte120 = (byte) local33.method20269();
						local46.aShort160 = (short) local33.method20271();
					}
					this.aClass133Array1[local18] = local46;
				} catch (@Pc(519) Exception local519) {
					this.aClass133Array1[local18] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "(Lclient!de;B)V", line = 65)
	public static void method22909(@OriginalArg(0) Class21 arg0) {
		Class418.aClass14_11 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, Class568.anInt5378 * 1732591297, true, true);
		Class568.aClass611_12 = Class379.aClass312_1.method25786(client.anInterface34_1, Class568.anInt5378 * 1732591297);
		Class454.aClass14_12 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, Class568.anInt5372 * -349930659, true, true);
		Class222.aClass611_7 = Class379.aClass312_1.method25786(client.anInterface34_1, Class568.anInt5372 * -349930659);
		Class568.aClass14_13 = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, Class568.anInt5373 * -779866773, true, true);
		Class224.aClass611_8 = Class379.aClass312_1.method25786(client.anInterface34_1, Class568.anInt5373 * -779866773);
	}

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "(II)Lclient!dp;", line = 146)
	public Class133 method22906(@OriginalArg(0) int arg0) {
		return this.aClass133Array1[arg0];
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lclient!dp;", line = 146)
	public Class133 method22907(@OriginalArg(0) int arg0) {
		return this.aClass133Array1[arg0];
	}

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)Lclient!dp;", line = 146)
	public Class133 method22908(@OriginalArg(0) int arg0) {
		return this.aClass133Array1[arg0];
	}

	@OriginalMember(owner = "client!ds", name = "aas", descriptor = "(Lclient!vs;I)V", line = 8828)
	static final void method22910(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (local13 & 0x1 << local23) == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ds", name = "ato", descriptor = "(Lclient!vs;B)V", line = 12435)
	static final void method22911(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (Class613.aClass21_13.method17031()) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub27_1.method14599(local12);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 3;
		}
	}
}
