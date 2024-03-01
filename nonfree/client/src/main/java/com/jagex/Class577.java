package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xj")
public final class Class577 {

	@OriginalMember(owner = "client!xj", name = "a", descriptor = "I")
	static final int anInt5430 = 256;

	@OriginalMember(owner = "client!xj", name = "g", descriptor = "I")
	static final int anInt5431 = 1020;

	@OriginalMember(owner = "client!xj", name = "p", descriptor = "I")
	static final int anInt5432 = 8;

	@OriginalMember(owner = "client!xj", name = "l", descriptor = "I")
	int anInt5429;

	@OriginalMember(owner = "client!xj", name = "s", descriptor = "I")
	int anInt5433;

	@OriginalMember(owner = "client!xj", name = "u", descriptor = "I")
	int anInt5434;

	@OriginalMember(owner = "client!xj", name = "y", descriptor = "I")
	int anInt5435;

	@OriginalMember(owner = "client!xj", name = "x", descriptor = "[I")
	int[] anIntArray511 = new int[256];

	@OriginalMember(owner = "client!xj", name = "h", descriptor = "[I")
	int[] anIntArray510 = new int[256];

	@OriginalMember(owner = "client!xj", name = "<init>", descriptor = "([I)V", line = 14)
	public Class577(@OriginalArg(0) int[] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			this.anIntArray510[local11] = arg0[local11];
		}
		this.method33162();
	}

	@OriginalMember(owner = "client!xj", name = "p", descriptor = "(B)I", line = 24)
	public final int method33159() {
		if (this.anInt5429 * 241385271 == 0) {
			this.method33161();
			this.anInt5429 = -1264154880;
		}
		return this.anIntArray510[(this.anInt5429 -= 1152689799) * 241385271];
	}

	@OriginalMember(owner = "client!xj", name = "x", descriptor = "()I", line = 24)
	public final int method33164() {
		if (this.anInt5429 * 241385271 == 0) {
			this.method33161();
			this.anInt5429 = -1264154880;
		}
		return this.anIntArray510[(this.anInt5429 -= 1152689799) * 241385271];
	}

	@OriginalMember(owner = "client!xj", name = "h", descriptor = "()I", line = 24)
	public final int method33168() {
		if (this.anInt5429 * 241385271 == 0) {
			this.method33161();
			this.anInt5429 = -1264154880;
		}
		return this.anIntArray510[(this.anInt5429 -= 1152689799) * 241385271];
	}

	@OriginalMember(owner = "client!xj", name = "s", descriptor = "()I", line = 32)
	public final int method33158() {
		if (this.anInt5429 * 241385271 == 0) {
			this.method33161();
			this.anInt5429 = -1264154880;
		}
		return this.anIntArray510[this.anInt5429 * 241385271 - 1];
	}

	@OriginalMember(owner = "client!xj", name = "a", descriptor = "(I)I", line = 32)
	public final int method33160() {
		if (this.anInt5429 * 241385271 == 0) {
			this.method33161();
			this.anInt5429 = -1264154880;
		}
		return this.anIntArray510[this.anInt5429 * 241385271 - 1];
	}

	@OriginalMember(owner = "client!xj", name = "g", descriptor = "(I)V", line = 43)
	final void method33161() {
		this.anInt5434 += (this.anInt5435 += -561882533) * -1859495087;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray511[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt5433 = (this.anInt5433 * 2029091631 ^ this.anInt5433 * 2029091631 << 13) * 1318824911;
				} else {
					this.anInt5433 = (this.anInt5433 * 2029091631 ^ this.anInt5433 * 2029091631 >>> 6) * 1318824911;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt5433 = (this.anInt5433 * 2029091631 ^ this.anInt5433 * 2029091631 << 2) * 1318824911;
			} else {
				this.anInt5433 = (this.anInt5433 * 2029091631 ^ this.anInt5433 * 2029091631 >>> 16) * 1318824911;
			}
			this.anInt5433 += this.anIntArray511[local15 + 128 & 0xFF] * 1318824911;
			@Pc(137) int local137;
			this.anIntArray511[local15] = local137 = this.anInt5434 * 1392393699 + this.anInt5433 * 2029091631 + this.anIntArray511[local23 >> 2 & 0xFF];
			this.anIntArray510[local15] = (this.anInt5434 = (this.anIntArray511[local137 >> 8 >> 2 & 0xFF] + local23) * 457895883) * 1392393699;
		}
	}

	@OriginalMember(owner = "client!xj", name = "u", descriptor = "()V", line = 43)
	final void method33166() {
		this.anInt5434 += (this.anInt5435 += -561882533) * -1859495087;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(23) int local23 = this.anIntArray511[local15];
			if ((local15 & 0x2) == 0) {
				if ((local15 & 0x1) == 0) {
					this.anInt5433 = (this.anInt5433 * 2029091631 ^ this.anInt5433 * 2029091631 << 13) * 1318824911;
				} else {
					this.anInt5433 = (this.anInt5433 * 2029091631 ^ this.anInt5433 * 2029091631 >>> 6) * 1318824911;
				}
			} else if ((local15 & 0x1) == 0) {
				this.anInt5433 = (this.anInt5433 * 2029091631 ^ this.anInt5433 * 2029091631 << 2) * 1318824911;
			} else {
				this.anInt5433 = (this.anInt5433 * 2029091631 ^ this.anInt5433 * 2029091631 >>> 16) * 1318824911;
			}
			this.anInt5433 += this.anIntArray511[local15 + 128 & 0xFF] * 1318824911;
			@Pc(137) int local137;
			this.anIntArray511[local15] = local137 = this.anInt5434 * 1392393699 + this.anInt5433 * 2029091631 + this.anIntArray511[local23 >> 2 & 0xFF];
			this.anIntArray510[local15] = (this.anInt5434 = (this.anIntArray511[local137 >> 8 >> 2 & 0xFF] + local23) * 457895883) * 1392393699;
		}
	}

	@OriginalMember(owner = "client!xj", name = "l", descriptor = "(I)V", line = 70)
	final void method33162() {
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
			local15 += this.anIntArray510[local17];
			local13 += this.anIntArray510[local17 + 1];
			local11 += this.anIntArray510[local17 + 2];
			local9 += this.anIntArray510[local17 + 3];
			local7 += this.anIntArray510[local17 + 4];
			local5 += this.anIntArray510[local17 + 5];
			local3 += this.anIntArray510[local17 + 6];
			local1 += this.anIntArray510[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray511[local17];
			local13 += this.anIntArray511[local17 + 1];
			local11 += this.anIntArray511[local17 + 2];
			local9 += this.anIntArray511[local17 + 3];
			local7 += this.anIntArray511[local17 + 4];
			local5 += this.anIntArray511[local17 + 5];
			local3 += this.anIntArray511[local17 + 6];
			local1 += this.anIntArray511[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		this.method33161();
		this.anInt5429 = -1264154880;
	}

	@OriginalMember(owner = "client!xj", name = "b", descriptor = "()V", line = 70)
	final void method33163() {
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
			local15 += this.anIntArray510[local17];
			local13 += this.anIntArray510[local17 + 1];
			local11 += this.anIntArray510[local17 + 2];
			local9 += this.anIntArray510[local17 + 3];
			local7 += this.anIntArray510[local17 + 4];
			local5 += this.anIntArray510[local17 + 5];
			local3 += this.anIntArray510[local17 + 6];
			local1 += this.anIntArray510[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray511[local17];
			local13 += this.anIntArray511[local17 + 1];
			local11 += this.anIntArray511[local17 + 2];
			local9 += this.anIntArray511[local17 + 3];
			local7 += this.anIntArray511[local17 + 4];
			local5 += this.anIntArray511[local17 + 5];
			local3 += this.anIntArray511[local17 + 6];
			local1 += this.anIntArray511[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		this.method33161();
		this.anInt5429 = -1264154880;
	}

	@OriginalMember(owner = "client!xj", name = "c", descriptor = "()V", line = 70)
	final void method33165() {
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
			local15 += this.anIntArray510[local17];
			local13 += this.anIntArray510[local17 + 1];
			local11 += this.anIntArray510[local17 + 2];
			local9 += this.anIntArray510[local17 + 3];
			local7 += this.anIntArray510[local17 + 4];
			local5 += this.anIntArray510[local17 + 5];
			local3 += this.anIntArray510[local17 + 6];
			local1 += this.anIntArray510[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray511[local17];
			local13 += this.anIntArray511[local17 + 1];
			local11 += this.anIntArray511[local17 + 2];
			local9 += this.anIntArray511[local17 + 3];
			local7 += this.anIntArray511[local17 + 4];
			local5 += this.anIntArray511[local17 + 5];
			local3 += this.anIntArray511[local17 + 6];
			local1 += this.anIntArray511[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		this.method33161();
		this.anInt5429 = -1264154880;
	}

	@OriginalMember(owner = "client!xj", name = "y", descriptor = "()V", line = 70)
	final void method33167() {
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
			local15 += this.anIntArray510[local17];
			local13 += this.anIntArray510[local17 + 1];
			local11 += this.anIntArray510[local17 + 2];
			local9 += this.anIntArray510[local17 + 3];
			local7 += this.anIntArray510[local17 + 4];
			local5 += this.anIntArray510[local17 + 5];
			local3 += this.anIntArray510[local17 + 6];
			local1 += this.anIntArray510[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray511[local17];
			local13 += this.anIntArray511[local17 + 1];
			local11 += this.anIntArray511[local17 + 2];
			local9 += this.anIntArray511[local17 + 3];
			local7 += this.anIntArray511[local17 + 4];
			local5 += this.anIntArray511[local17 + 5];
			local3 += this.anIntArray511[local17 + 6];
			local1 += this.anIntArray511[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		this.method33161();
		this.anInt5429 = -1264154880;
	}

	@OriginalMember(owner = "client!xj", name = "z", descriptor = "()V", line = 70)
	final void method33169() {
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
			local15 += this.anIntArray510[local17];
			local13 += this.anIntArray510[local17 + 1];
			local11 += this.anIntArray510[local17 + 2];
			local9 += this.anIntArray510[local17 + 3];
			local7 += this.anIntArray510[local17 + 4];
			local5 += this.anIntArray510[local17 + 5];
			local3 += this.anIntArray510[local17 + 6];
			local1 += this.anIntArray510[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		for (local17 = 0; local17 < 256; local17 += 8) {
			local15 += this.anIntArray511[local17];
			local13 += this.anIntArray511[local17 + 1];
			local11 += this.anIntArray511[local17 + 2];
			local9 += this.anIntArray511[local17 + 3];
			local7 += this.anIntArray511[local17 + 4];
			local5 += this.anIntArray511[local17 + 5];
			local3 += this.anIntArray511[local17 + 6];
			local1 += this.anIntArray511[local17 + 7];
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
			this.anIntArray511[local17] = local15;
			this.anIntArray511[local17 + 1] = local13;
			this.anIntArray511[local17 + 2] = local11;
			this.anIntArray511[local17 + 3] = local9;
			this.anIntArray511[local17 + 4] = local7;
			this.anIntArray511[local17 + 5] = local5;
			this.anIntArray511[local17 + 6] = local3;
			this.anIntArray511[local17 + 7] = local1;
		}
		this.method33161();
		this.anInt5429 = -1264154880;
	}
}
