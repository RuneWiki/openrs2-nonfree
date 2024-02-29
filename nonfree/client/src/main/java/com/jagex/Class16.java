package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaq")
public final class Class16 {

	@OriginalMember(owner = "client!aaq", name = "v", descriptor = "I")
	static final int anInt44 = 1020;

	@OriginalMember(owner = "client!aaq", name = "c", descriptor = "I")
	static final int anInt46 = 256;

	@OriginalMember(owner = "client!aaq", name = "p", descriptor = "I")
	static final int anInt48 = 8;

	@OriginalMember(owner = "client!aaq", name = "q", descriptor = "I")
	int anInt43;

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "I")
	int anInt45;

	@OriginalMember(owner = "client!aaq", name = "t", descriptor = "I")
	int anInt47;

	@OriginalMember(owner = "client!aaq", name = "x", descriptor = "I")
	int anInt49;

	@OriginalMember(owner = "client!aaq", name = "w", descriptor = "[I")
	int[] anIntArray1 = new int[256];

	@OriginalMember(owner = "client!aaq", name = "y", descriptor = "[I")
	int[] anIntArray2 = new int[256];

	@OriginalMember(owner = "client!aaq", name = "<init>", descriptor = "([I)V", line = 14)
	public Class16(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray2[local11] = arg0[local11];
		}
		this.method275();
	}

	@OriginalMember(owner = "client!aaq", name = "p", descriptor = "(B)I", line = 24)
	public final int method266() {
		if (this.anInt45 * -1006007953 == 0) {
			this.method272();
			this.anInt45 = -1409970432;
		}
		return this.anIntArray2[(this.anInt45 -= -5507697) * -1006007953];
	}

	@OriginalMember(owner = "client!aaq", name = "c", descriptor = "(I)I", line = 32)
	public final int method267() {
		if (this.anInt45 * -1006007953 == 0) {
			this.method272();
			this.anInt45 = -1409970432;
		}
		return this.anIntArray2[this.anInt45 * -1006007953 - 1];
	}

	@OriginalMember(owner = "client!aaq", name = "y", descriptor = "()I", line = 32)
	public final int method268() {
		if (this.anInt45 * -1006007953 == 0) {
			this.method272();
			this.anInt45 = -1409970432;
		}
		return this.anIntArray2[this.anInt45 * -1006007953 - 1];
	}

	@OriginalMember(owner = "client!aaq", name = "w", descriptor = "()I", line = 32)
	public final int method269() {
		if (this.anInt45 * -1006007953 == 0) {
			this.method272();
			this.anInt45 = -1409970432;
		}
		return this.anIntArray2[this.anInt45 * -1006007953 - 1];
	}

	@OriginalMember(owner = "client!aaq", name = "d", descriptor = "()V", line = 43)
	final void method270() {
		this.anInt43 += (this.anInt49 += 629326429) * -804342311;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray1[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 13) * 1697736921;
				} else {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 6) * 1697736921;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 2) * 1697736921;
			} else {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 16) * 1697736921;
			}
			this.anInt47 += this.anIntArray1[local15 + 128 & 0xFF] * 1697736921;
			@Pc(138) int local138;
			this.anIntArray1[local15] = local138 = this.anInt43 * -1880576131 + this.anIntArray1[local23 >> 2 & 0xFF] + this.anInt47 * 1518638953;
			this.anIntArray2[local15] = (this.anInt43 = (local23 + this.anIntArray1[local138 >> 8 >> 2 & 0xFF]) * 1884848597) * -1880576131;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "t", descriptor = "()V", line = 43)
	final void method271() {
		this.anInt43 += (this.anInt49 += 629326429) * -804342311;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray1[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 13) * 1697736921;
				} else {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 6) * 1697736921;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 2) * 1697736921;
			} else {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 16) * 1697736921;
			}
			this.anInt47 += this.anIntArray1[local15 + 128 & 0xFF] * 1697736921;
			@Pc(138) int local138;
			this.anIntArray1[local15] = local138 = this.anInt43 * -1880576131 + this.anIntArray1[local23 >> 2 & 0xFF] + this.anInt47 * 1518638953;
			this.anIntArray2[local15] = (this.anInt43 = (local23 + this.anIntArray1[local138 >> 8 >> 2 & 0xFF]) * 1884848597) * -1880576131;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "v", descriptor = "(B)V", line = 43)
	final void method272() {
		this.anInt43 += (this.anInt49 += 629326429) * -804342311;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray1[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 13) * 1697736921;
				} else {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 6) * 1697736921;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 2) * 1697736921;
			} else {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 16) * 1697736921;
			}
			this.anInt47 += this.anIntArray1[local15 + 128 & 0xFF] * 1697736921;
			@Pc(138) int local138;
			this.anIntArray1[local15] = local138 = this.anInt43 * -1880576131 + this.anIntArray1[local23 >> 2 & 0xFF] + this.anInt47 * 1518638953;
			this.anIntArray2[local15] = (this.anInt43 = (local23 + this.anIntArray1[local138 >> 8 >> 2 & 0xFF]) * 1884848597) * -1880576131;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "x", descriptor = "()V", line = 43)
	final void method273() {
		this.anInt43 += (this.anInt49 += 629326429) * -804342311;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray1[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 13) * 1697736921;
				} else {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 6) * 1697736921;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 2) * 1697736921;
			} else {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 16) * 1697736921;
			}
			this.anInt47 += this.anIntArray1[local15 + 128 & 0xFF] * 1697736921;
			@Pc(138) int local138;
			this.anIntArray1[local15] = local138 = this.anInt43 * -1880576131 + this.anIntArray1[local23 >> 2 & 0xFF] + this.anInt47 * 1518638953;
			this.anIntArray2[local15] = (this.anInt43 = (local23 + this.anIntArray1[local138 >> 8 >> 2 & 0xFF]) * 1884848597) * -1880576131;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "q", descriptor = "()V", line = 43)
	final void method274() {
		this.anInt43 += (this.anInt49 += 629326429) * -804342311;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray1[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 13) * 1697736921;
				} else {
					this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 6) * 1697736921;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 << 2) * 1697736921;
			} else {
				this.anInt47 = (this.anInt47 * 1518638953 ^ this.anInt47 * 1518638953 >>> 16) * 1697736921;
			}
			this.anInt47 += this.anIntArray1[local15 + 128 & 0xFF] * 1697736921;
			@Pc(138) int local138;
			this.anIntArray1[local15] = local138 = this.anInt43 * -1880576131 + this.anIntArray1[local23 >> 2 & 0xFF] + this.anInt47 * 1518638953;
			this.anIntArray2[local15] = (this.anInt43 = (local23 + this.anIntArray1[local138 >> 8 >> 2 & 0xFF]) * 1884848597) * -1880576131;
		}
	}

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "(B)V", line = 70)
	final void method275() {
		@Pc(1) int local1 = -1640531527;
		@Pc(3) int local3 = -1640531527;
		@Pc(5) int local5 = -1640531527;
		@Pc(7) int local7 = -1640531527;
		@Pc(9) int local9 = -1640531527;
		@Pc(11) int local11 = -1640531527;
		@Pc(13) int local13 = -1640531527;
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray2[local17];
			local13 += this.anIntArray2[local17 + 1];
			local11 += this.anIntArray2[local17 + 2];
			local9 += this.anIntArray2[local17 + 3];
			local7 += this.anIntArray2[local17 + 4];
			local5 += this.anIntArray2[local17 + 5];
			local3 += this.anIntArray2[local17 + 6];
			local1 += this.anIntArray2[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray1[local17] = local15;
			this.anIntArray1[local17 + 1] = local13;
			this.anIntArray1[local17 + 2] = local11;
			this.anIntArray1[local17 + 3] = local9;
			this.anIntArray1[local17 + 4] = local7;
			this.anIntArray1[local17 + 5] = local5;
			this.anIntArray1[local17 + 6] = local3;
			this.anIntArray1[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray1[local17];
			local13 += this.anIntArray1[local17 + 1];
			local11 += this.anIntArray1[local17 + 2];
			local9 += this.anIntArray1[local17 + 3];
			local7 += this.anIntArray1[local17 + 4];
			local5 += this.anIntArray1[local17 + 5];
			local3 += this.anIntArray1[local17 + 6];
			local1 += this.anIntArray1[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray1[local17] = local15;
			this.anIntArray1[local17 + 1] = local13;
			this.anIntArray1[local17 + 2] = local11;
			this.anIntArray1[local17 + 3] = local9;
			this.anIntArray1[local17 + 4] = local7;
			this.anIntArray1[local17 + 5] = local5;
			this.anIntArray1[local17 + 6] = local3;
			this.anIntArray1[local17 + 7] = local1;
		}
		this.method272();
		this.anInt45 = -1409970432;
	}

	@OriginalMember(owner = "client!aaq", name = "s", descriptor = "()V", line = 70)
	final void method276() {
		@Pc(1) int local1 = -1640531527;
		@Pc(3) int local3 = -1640531527;
		@Pc(5) int local5 = -1640531527;
		@Pc(7) int local7 = -1640531527;
		@Pc(9) int local9 = -1640531527;
		@Pc(11) int local11 = -1640531527;
		@Pc(13) int local13 = -1640531527;
		@Pc(15) int local15 = -1640531527;
		@Pc(17) int local17;
		for (local17 = 0; local17 < 4; local17++) {
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray2[local17];
			local13 += this.anIntArray2[local17 + 1];
			local11 += this.anIntArray2[local17 + 2];
			local9 += this.anIntArray2[local17 + 3];
			local7 += this.anIntArray2[local17 + 4];
			local5 += this.anIntArray2[local17 + 5];
			local3 += this.anIntArray2[local17 + 6];
			local1 += this.anIntArray2[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray1[local17] = local15;
			this.anIntArray1[local17 + 1] = local13;
			this.anIntArray1[local17 + 2] = local11;
			this.anIntArray1[local17 + 3] = local9;
			this.anIntArray1[local17 + 4] = local7;
			this.anIntArray1[local17 + 5] = local5;
			this.anIntArray1[local17 + 6] = local3;
			this.anIntArray1[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray1[local17];
			local13 += this.anIntArray1[local17 + 1];
			local11 += this.anIntArray1[local17 + 2];
			local9 += this.anIntArray1[local17 + 3];
			local7 += this.anIntArray1[local17 + 4];
			local5 += this.anIntArray1[local17 + 5];
			local3 += this.anIntArray1[local17 + 6];
			local1 += this.anIntArray1[local17 + 7];
			local15 ^= local13 << 11;
			local9 += local15;
			local13 += local11;
			local13 ^= local11 >>> 2;
			local7 += local13;
			local11 += local9;
			local11 ^= local9 << 8;
			local5 += local11;
			local9 += local7;
			local9 ^= local7 >>> 16;
			local3 += local9;
			local7 += local5;
			local7 ^= local5 << 10;
			local1 += local7;
			local5 += local3;
			local5 ^= local3 >>> 4;
			local15 += local5;
			local3 += local1;
			local3 ^= local1 << 8;
			local13 += local3;
			local1 += local15;
			local1 ^= local15 >>> 9;
			local11 += local1;
			local15 += local13;
			this.anIntArray1[local17] = local15;
			this.anIntArray1[local17 + 1] = local13;
			this.anIntArray1[local17 + 2] = local11;
			this.anIntArray1[local17 + 3] = local9;
			this.anIntArray1[local17 + 4] = local7;
			this.anIntArray1[local17 + 5] = local5;
			this.anIntArray1[local17 + 6] = local3;
			this.anIntArray1[local17 + 7] = local1;
		}
		this.method272();
		this.anInt45 = -1409970432;
	}

	@OriginalMember(owner = "client!aaq", name = "y", descriptor = "([J[IIII)V", line = 78)
	static void method277(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < (long) (local48 & local46) + local14) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) int local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method277(arg0, arg1, arg2, local10 - 1);
		method277(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!aaq", name = "mu", descriptor = "(II)V", line = 12052)
	public static final void method278(@OriginalArg(0) int arg0) {
		if (Class574.aClass77_Sub25_2 == null || (arg0 < 0 || arg0 >= Class574.aClass77_Sub25_2.anInt1550 * -1406046755)) {
			return;
		}
		@Pc(17) Class358 local17 = Class574.aClass77_Sub25_2.aClass358Array1[arg0];
		if (local17.aByte149 != -1) {
			return;
		}
		@Pc(25) Class82 local25 = Class230.method25826();
		@Pc(31) Class77_Sub20 local31 = Class365.method28132(Class414.aClass414_10, local25.aClass16_1);
		local31.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(local17.aString209) + 2);
		local31.aClass77_Sub39_Sub1_2.method22408(arg0);
		local31.aClass77_Sub39_Sub1_2.method22440(local17.aString209);
		local25.method2004(local31);
	}
}
