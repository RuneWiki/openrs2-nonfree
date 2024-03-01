package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yo")
public class Class605 {

	@OriginalMember(owner = "client!yo", name = "a", descriptor = "I")
	static final int anInt5527 = 2;

	@OriginalMember(owner = "client!yo", name = "l", descriptor = "I")
	static final int anInt5528 = 8;

	@OriginalMember(owner = "client!yo", name = "g", descriptor = "I")
	static final int anInt5529 = 4;

	@OriginalMember(owner = "client!yo", name = "p", descriptor = "I")
	static final int anInt5530 = 1;

	@OriginalMember(owner = "client!yo", name = "qb", descriptor = "I")
	static int anInt5531;

	@OriginalMember(owner = "client!yo", name = "h", descriptor = "[I")
	public int[] anIntArray521 = new int[3];

	@OriginalMember(owner = "client!yo", name = "x", descriptor = "[I")
	public int[] anIntArray522 = new int[3];

	@OriginalMember(owner = "client!yo", name = "s", descriptor = "[I")
	public int[] anIntArray523 = new int[2];

	@OriginalMember(owner = "client!yo", name = "u", descriptor = "[I")
	public int[] anIntArray524 = new int[2];

	@OriginalMember(owner = "client!yo", name = "y", descriptor = "[S")
	public short[] aShortArray139;

	@OriginalMember(owner = "client!yo", name = "b", descriptor = "[S")
	public short[] aShortArray140;

	@OriginalMember(owner = "client!yo", name = "<init>", descriptor = "(Lclient!ya;)V", line = 17)
	Class605(@OriginalArg(0) Class594 arg0) {
		this.anIntArray521[0] = arg0.anInt5481 * -1411021813;
		this.anIntArray521[1] = arg0.anInt5482 * 457019623;
		this.anIntArray521[2] = arg0.anInt5485 * 1159698617;
		this.anIntArray522[0] = arg0.anInt5511 * -1185747057;
		this.anIntArray522[1] = arg0.anInt5484 * -142090397;
		this.anIntArray522[2] = arg0.anInt5499 * -323024195;
		this.anIntArray523[0] = arg0.anInt5491 * -1995753663;
		this.anIntArray523[1] = arg0.anInt5480 * -159642721;
		this.anIntArray524[0] = arg0.anInt5492 * 1345700659;
		this.anIntArray524[1] = arg0.anInt5479 * -264196485;
		if (arg0.aShortArray136 != null) {
			this.aShortArray139 = new short[arg0.aShortArray136.length];
			System.arraycopy(arg0.aShortArray136, 0, this.aShortArray139, 0, this.aShortArray139.length);
		}
		if (arg0.aShortArray138 != null) {
			this.aShortArray140 = new short[arg0.aShortArray138.length];
			System.arraycopy(arg0.aShortArray138, 0, this.aShortArray140, 0, this.aShortArray140.length);
		}
	}

	@OriginalMember(owner = "client!yo", name = "a", descriptor = "(Lclient!ya;Lclient!ahb;)Lclient!yo;", line = 43)
	public static Class605 method33535(@OriginalArg(0) Class594 arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		@Pc(4) Class605 local4 = new Class605(arg0);
		@Pc(8) int local8 = arg1.method20269();
		@Pc(17) boolean local17 = (local8 & 0x1) != 0;
		@Pc(26) boolean local26 = (local8 & 0x2) != 0;
		@Pc(35) boolean local35 = (local8 & 0x4) != 0;
		@Pc(44) boolean local44 = (local8 & 0x8) != 0;
		if (local17) {
			local4.anIntArray521[0] = arg1.method20375();
			local4.anIntArray522[0] = arg1.method20375();
			if (arg0.anInt5482 * 457019623 != -1 || arg0.anInt5484 * -142090397 != -1) {
				local4.anIntArray521[1] = arg1.method20375();
				local4.anIntArray522[1] = arg1.method20375();
			}
			if (arg0.anInt5485 * 1159698617 != -1 || arg0.anInt5499 * -323024195 != -1) {
				local4.anIntArray521[2] = arg1.method20375();
				local4.anIntArray522[2] = arg1.method20375();
			}
		}
		if (local26) {
			local4.anIntArray523[0] = arg1.method20375();
			local4.anIntArray524[0] = arg1.method20375();
			if (-159642721 * arg0.anInt5480 != -1 || arg0.anInt5479 * -264196485 != -1) {
				local4.anIntArray523[1] = arg1.method20375();
				local4.anIntArray524[1] = arg1.method20375();
			}
		}
		@Pc(160) int local160;
		@Pc(163) int[] local163;
		@Pc(195) int local195;
		if (local35) {
			local160 = arg1.method20271();
			local163 = new int[] { local160 & 0xF, local160 >> 4 & 0xF, local160 >> 8 & 0xF, local160 >> 12 & 0xF };
			for (local195 = 0; local195 < 4; local195++) {
				if (local163[local195] != 15) {
					local4.aShortArray139[local163[local195]] = (short) arg1.method20271();
				}
			}
		}
		if (local44) {
			local160 = arg1.method20269();
			local163 = new int[] { local160 & 0xF, local160 >> 4 & 0xF };
			for (local195 = 0; local195 < 2; local195++) {
				if (local163[local195] != 15) {
					local4.aShortArray140[local163[local195]] = (short) arg1.method20271();
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!yo", name = "g", descriptor = "(Lclient!ya;Lclient!ahb;)Lclient!yo;", line = 43)
	public static Class605 method33536(@OriginalArg(0) Class594 arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		@Pc(4) Class605 local4 = new Class605(arg0);
		@Pc(8) int local8 = arg1.method20269();
		@Pc(17) boolean local17 = (local8 & 0x1) != 0;
		@Pc(26) boolean local26 = (local8 & 0x2) != 0;
		@Pc(35) boolean local35 = (local8 & 0x4) != 0;
		@Pc(44) boolean local44 = (local8 & 0x8) != 0;
		if (local17) {
			local4.anIntArray521[0] = arg1.method20375();
			local4.anIntArray522[0] = arg1.method20375();
			if (arg0.anInt5482 * 457019623 != -1 || arg0.anInt5484 * -142090397 != -1) {
				local4.anIntArray521[1] = arg1.method20375();
				local4.anIntArray522[1] = arg1.method20375();
			}
			if (arg0.anInt5485 * 1159698617 != -1 || arg0.anInt5499 * -323024195 != -1) {
				local4.anIntArray521[2] = arg1.method20375();
				local4.anIntArray522[2] = arg1.method20375();
			}
		}
		if (local26) {
			local4.anIntArray523[0] = arg1.method20375();
			local4.anIntArray524[0] = arg1.method20375();
			if (-159642721 * arg0.anInt5480 != -1 || arg0.anInt5479 * -264196485 != -1) {
				local4.anIntArray523[1] = arg1.method20375();
				local4.anIntArray524[1] = arg1.method20375();
			}
		}
		@Pc(160) int local160;
		@Pc(163) int[] local163;
		@Pc(195) int local195;
		if (local35) {
			local160 = arg1.method20271();
			local163 = new int[] { local160 & 0xF, local160 >> 4 & 0xF, local160 >> 8 & 0xF, local160 >> 12 & 0xF };
			for (local195 = 0; local195 < 4; local195++) {
				if (local163[local195] != 15) {
					local4.aShortArray139[local163[local195]] = (short) arg1.method20271();
				}
			}
		}
		if (local44) {
			local160 = arg1.method20269();
			local163 = new int[] { local160 & 0xF, local160 >> 4 & 0xF };
			for (local195 = 0; local195 < 2; local195++) {
				if (local163[local195] != 15) {
					local4.aShortArray140[local163[local195]] = (short) arg1.method20271();
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!yo", name = "g", descriptor = "(Lclient!and;I)V", line = 99)
	static final void method33537(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(1) int local1 = 0;
		arg0.method19824();
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(38) int local38;
		for (local6 = 0; local6 < Class52.anInt1127 * 701602229; local6++) {
			local15 = Class52.anIntArray167[local6];
			if ((Class52.aByteArray19[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
				} else {
					local38 = arg0.method19825(1);
					if (local38 == 0) {
						local1 = Class26_Sub1_Sub2_Sub1.method9770(arg0);
						Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
					} else {
						Class602.method33517(arg0, local15);
					}
				}
			}
		}
		arg0.method19826();
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method19824();
		for (local6 = 0; local6 < Class52.anInt1127 * 701602229; local6++) {
			local15 = Class52.anIntArray167[local6];
			if ((Class52.aByteArray19[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
				} else {
					local38 = arg0.method19825(1);
					if (local38 == 0) {
						local1 = Class26_Sub1_Sub2_Sub1.method9770(arg0);
						Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
					} else {
						Class602.method33517(arg0, local15);
					}
				}
			}
		}
		arg0.method19826();
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method19824();
		for (local6 = 0; local6 < Class52.anInt1130 * 2047726887; local6++) {
			local15 = Class52.anIntArray165[local6];
			if ((Class52.aByteArray19[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
				} else {
					local38 = arg0.method19825(1);
					if (local38 == 0) {
						local1 = Class26_Sub1_Sub2_Sub1.method9770(arg0);
						Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
					} else if (Class163.method23299(arg0, local15)) {
						Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
					}
				}
			}
		}
		arg0.method19826();
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method19824();
		for (local6 = 0; local6 < Class52.anInt1130 * 2047726887; local6++) {
			local15 = Class52.anIntArray165[local6];
			if ((Class52.aByteArray19[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
				} else {
					local38 = arg0.method19825(1);
					if (local38 == 0) {
						local1 = Class26_Sub1_Sub2_Sub1.method9770(arg0);
						Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
					} else if (Class163.method23299(arg0, local15)) {
						Class52.aByteArray19[local15] = (byte) (Class52.aByteArray19[local15] | 0x2);
					}
				}
			}
		}
		arg0.method19826();
		if (local1 != 0) {
			throw new RuntimeException();
		}
		Class52.anInt1127 = 0;
		Class52.anInt1130 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			Class52.aByteArray19[local6] = (byte) (Class52.aByteArray19[local6] >> 1);
			@Pc(313) Class26_Sub1_Sub1_Sub1_Sub2 local313 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local313 == null) {
				Class52.anIntArray165[(Class52.anInt1130 += 339102359) * 2047726887 - 1] = local6;
			} else {
				Class52.anIntArray167[(Class52.anInt1127 += -983085923) * 701602229 - 1] = local6;
			}
		}
	}
}
