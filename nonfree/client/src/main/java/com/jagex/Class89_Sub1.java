package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aej")
public class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!aej", name = "v", descriptor = "I")
	int anInt559;

	@OriginalMember(owner = "client!aej", name = "y", descriptor = "I")
	int anInt560;

	@OriginalMember(owner = "client!aej", name = "w", descriptor = "I")
	int anInt561;

	@OriginalMember(owner = "client!aej", name = "l", descriptor = "I")
	int anInt562;

	@OriginalMember(owner = "client!aej", name = "q", descriptor = "Z")
	boolean aBoolean98 = false;

	@OriginalMember(owner = "client!aej", name = "p", descriptor = "I")
	int anInt557;

	@OriginalMember(owner = "client!aej", name = "c", descriptor = "I")
	int anInt558;

	@OriginalMember(owner = "client!aej", name = "t", descriptor = "[I")
	int[] anIntArray40;

	@OriginalMember(owner = "client!aej", name = "<init>", descriptor = "(II[I)V", line = 15)
	Class89_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt557 = arg0;
		this.anInt558 = arg1;
		this.anIntArray40 = arg2;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray40.length; local15++) {
			if ((this.anIntArray40[local15] & -16777216) != -16777216) {
				this.aBoolean98 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!aej", name = "p", descriptor = "()Z", line = 28)
	@Override
	public boolean method6680() {
		return false;
	}

	@OriginalMember(owner = "client!aej", name = "bd", descriptor = "()Z", line = 28)
	@Override
	public boolean method6737() {
		return false;
	}

	@OriginalMember(owner = "client!aej", name = "by", descriptor = "()Z", line = 28)
	@Override
	public boolean method6738() {
		return false;
	}

	@OriginalMember(owner = "client!aej", name = "c", descriptor = "()Z", line = 32)
	@Override
	public boolean method6693() {
		return this.aBoolean98;
	}

	@OriginalMember(owner = "client!aej", name = "o", descriptor = "()Z", line = 32)
	@Override
	public boolean method6700() {
		return this.aBoolean98;
	}

	@OriginalMember(owner = "client!aej", name = "n", descriptor = "()I", line = 36)
	@Override
	public int method6702() {
		return this.anInt557;
	}

	@OriginalMember(owner = "client!aej", name = "b", descriptor = "()I", line = 36)
	@Override
	public int method6679() {
		return this.anInt557;
	}

	@OriginalMember(owner = "client!aej", name = "v", descriptor = "()I", line = 36)
	@Override
	public int method6682() {
		return this.anInt557;
	}

	@OriginalMember(owner = "client!aej", name = "m", descriptor = "()I", line = 40)
	@Override
	public int method6704() {
		return this.anInt558;
	}

	@OriginalMember(owner = "client!aej", name = "a", descriptor = "()I", line = 40)
	@Override
	public int method6703() {
		return this.anInt558;
	}

	@OriginalMember(owner = "client!aej", name = "l", descriptor = "()I", line = 40)
	@Override
	public int method6683() {
		return this.anInt558;
	}

	@OriginalMember(owner = "client!aej", name = "d", descriptor = "()I", line = 44)
	@Override
	public int method6724() {
		return this.anInt557 + this.anInt559 + this.anInt562;
	}

	@OriginalMember(owner = "client!aej", name = "aj", descriptor = "()I", line = 44)
	@Override
	public int method6706() {
		return this.anInt557 + this.anInt559 + this.anInt562;
	}

	@OriginalMember(owner = "client!aej", name = "ai", descriptor = "()I", line = 44)
	@Override
	public int method6734() {
		return this.anInt557 + this.anInt559 + this.anInt562;
	}

	@OriginalMember(owner = "client!aej", name = "h", descriptor = "()I", line = 44)
	@Override
	public int method6711() {
		return this.anInt557 + this.anInt559 + this.anInt562;
	}

	@OriginalMember(owner = "client!aej", name = "ag", descriptor = "()I", line = 48)
	@Override
	public int method6707() {
		return this.anInt558 + this.anInt560 + this.anInt561;
	}

	@OriginalMember(owner = "client!aej", name = "s", descriptor = "()I", line = 48)
	@Override
	public int method6690() {
		return this.anInt558 + this.anInt560 + this.anInt561;
	}

	@OriginalMember(owner = "client!aej", name = "y", descriptor = "()I", line = 52)
	@Override
	public int method6684() {
		return this.anInt559;
	}

	@OriginalMember(owner = "client!aej", name = "al", descriptor = "()I", line = 52)
	@Override
	public int method6709() {
		return this.anInt559;
	}

	@OriginalMember(owner = "client!aej", name = "ao", descriptor = "()I", line = 56)
	@Override
	public int method6710() {
		return this.anInt562;
	}

	@OriginalMember(owner = "client!aej", name = "w", descriptor = "()I", line = 56)
	@Override
	public int method6685() {
		return this.anInt562;
	}

	@OriginalMember(owner = "client!aej", name = "t", descriptor = "()I", line = 60)
	@Override
	public int method6701() {
		return this.anInt560;
	}

	@OriginalMember(owner = "client!aej", name = "ak", descriptor = "()I", line = 60)
	@Override
	public int method6730() {
		return this.anInt560;
	}

	@OriginalMember(owner = "client!aej", name = "au", descriptor = "()I", line = 60)
	@Override
	public int method6694() {
		return this.anInt560;
	}

	@OriginalMember(owner = "client!aej", name = "ax", descriptor = "()I", line = 64)
	@Override
	public int method6713() {
		return this.anInt561;
	}

	@OriginalMember(owner = "client!aej", name = "ar", descriptor = "()I", line = 64)
	@Override
	public int method6714() {
		return this.anInt561;
	}

	@OriginalMember(owner = "client!aej", name = "q", descriptor = "()I", line = 64)
	@Override
	public int method6687() {
		return this.anInt561;
	}

	@OriginalMember(owner = "client!aej", name = "bx", descriptor = "()V", line = 68)
	@Override
	public void method6739() {
		this.anInt561 = 0;
		this.anInt560 = 0;
		this.anInt562 = 0;
		this.anInt559 = 0;
	}

	@OriginalMember(owner = "client!aej", name = "x", descriptor = "()V", line = 68)
	@Override
	public void method6688() {
		this.anInt561 = 0;
		this.anInt560 = 0;
		this.anInt562 = 0;
		this.anInt559 = 0;
	}

	@OriginalMember(owner = "client!aej", name = "av", descriptor = "(I)V", line = 75)
	@Override
	public void method6692(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method6724();
		@Pc(5) int local5 = this.method6690();
		if (this.anInt557 == local2 && this.anInt558 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt559) {
			local16 = this.anInt559;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt559 + this.anInt557 > local2) {
			local25 = local2 - this.anInt559 - this.anInt557;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt560) {
			local44 = this.anInt560;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt560 + this.anInt558 > local5) {
			local53 = local5 - this.anInt560 - this.anInt558;
		}
		@Pc(77) int local77 = this.anInt557 + local16 + local25;
		@Pc(84) int local84 = this.anInt558 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean98 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt558; local94++) {
			@Pc(103) int local103 = local94 * this.anInt557;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt557; local113++) {
				if ((this.anIntArray40[local103] & -16777216) != -16777216) {
					this.aBoolean98 = true;
				}
				local89[local111++] = this.anIntArray40[local103++];
			}
		}
		this.anInt559 -= local16;
		this.anInt560 -= local44;
		this.anInt562 -= local25;
		this.anInt561 -= local53;
		this.anInt557 = local77;
		this.anInt558 = local84;
		this.anIntArray40 = local89;
	}

	@OriginalMember(owner = "client!aej", name = "ac", descriptor = "(I)V", line = 75)
	@Override
	public void method6716(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method6724();
		@Pc(5) int local5 = this.method6690();
		if (this.anInt557 == local2 && this.anInt558 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt559) {
			local16 = this.anInt559;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt559 + this.anInt557 > local2) {
			local25 = local2 - this.anInt559 - this.anInt557;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt560) {
			local44 = this.anInt560;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt560 + this.anInt558 > local5) {
			local53 = local5 - this.anInt560 - this.anInt558;
		}
		@Pc(77) int local77 = this.anInt557 + local16 + local25;
		@Pc(84) int local84 = this.anInt558 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean98 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt558; local94++) {
			@Pc(103) int local103 = local94 * this.anInt557;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt557; local113++) {
				if ((this.anIntArray40[local103] & -16777216) != -16777216) {
					this.aBoolean98 = true;
				}
				local89[local111++] = this.anIntArray40[local103++];
			}
		}
		this.anInt559 -= local16;
		this.anInt560 -= local44;
		this.anInt562 -= local25;
		this.anInt561 -= local53;
		this.anInt557 = local77;
		this.anInt558 = local84;
		this.anIntArray40 = local89;
	}

	@OriginalMember(owner = "client!aej", name = "r", descriptor = "(I)V", line = 75)
	@Override
	public void method6689(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method6724();
		@Pc(5) int local5 = this.method6690();
		if (this.anInt557 == local2 && this.anInt558 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt559) {
			local16 = this.anInt559;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt559 + this.anInt557 > local2) {
			local25 = local2 - this.anInt559 - this.anInt557;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt560) {
			local44 = this.anInt560;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt560 + this.anInt558 > local5) {
			local53 = local5 - this.anInt560 - this.anInt558;
		}
		@Pc(77) int local77 = this.anInt557 + local16 + local25;
		@Pc(84) int local84 = this.anInt558 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean98 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt558; local94++) {
			@Pc(103) int local103 = local94 * this.anInt557;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt557; local113++) {
				if ((this.anIntArray40[local103] & -16777216) != -16777216) {
					this.aBoolean98 = true;
				}
				local89[local111++] = this.anIntArray40[local103++];
			}
		}
		this.anInt559 -= local16;
		this.anInt560 -= local44;
		this.anInt562 -= local25;
		this.anInt561 -= local53;
		this.anInt557 = local77;
		this.anInt558 = local84;
		this.anIntArray40 = local89;
	}

	@OriginalMember(owner = "client!aej", name = "ad", descriptor = "(I)V", line = 75)
	@Override
	public void method6715(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method6724();
		@Pc(5) int local5 = this.method6690();
		if (this.anInt557 == local2 && this.anInt558 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt559) {
			local16 = this.anInt559;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt559 + this.anInt557 > local2) {
			local25 = local2 - this.anInt559 - this.anInt557;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt560) {
			local44 = this.anInt560;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt560 + this.anInt558 > local5) {
			local53 = local5 - this.anInt560 - this.anInt558;
		}
		@Pc(77) int local77 = this.anInt557 + local16 + local25;
		@Pc(84) int local84 = this.anInt558 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		this.aBoolean98 = false;
		for (@Pc(94) int local94 = 0; local94 < this.anInt558; local94++) {
			@Pc(103) int local103 = local94 * this.anInt557;
			@Pc(111) int local111 = (local94 + local44) * local77 + local16;
			for (@Pc(113) int local113 = 0; local113 < this.anInt557; local113++) {
				if ((this.anIntArray40[local103] & -16777216) != -16777216) {
					this.aBoolean98 = true;
				}
				local89[local111++] = this.anIntArray40[local103++];
			}
		}
		this.anInt559 -= local16;
		this.anInt560 -= local44;
		this.anInt562 -= local25;
		this.anInt561 -= local53;
		this.anInt557 = local77;
		this.anInt558 = local84;
		this.anIntArray40 = local89;
	}

	@OriginalMember(owner = "client!aej", name = "g", descriptor = "(I)V", line = 110)
	@Override
	public void method6695(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		this.aBoolean98 = false;
		@Pc(11) int[] local11 = new int[this.anInt557 * this.anInt558];
		for (@Pc(13) int local13 = 0; local13 < this.anInt558; local13++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt557; local19++) {
				@Pc(28) int local28 = this.anIntArray40[local1];
				if ((local28 & 0xFF000000) == 0) {
					if (local19 > 0 && (this.anIntArray40[local1 - 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 > 0 && (this.anIntArray40[local1 - this.anInt557] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local19 < this.anInt557 - 1 && (this.anIntArray40[local1 + 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 < this.anInt558 - 1 && (this.anIntArray40[local1 + this.anInt557] & 0xFF000000) != 0) {
						local28 = arg0;
					}
				}
				if ((local28 & -16777216) != -16777216) {
					this.aBoolean98 = true;
				}
				local11[local1++] = local28;
			}
		}
		this.anIntArray40 = local11;
	}

	@OriginalMember(owner = "client!aej", name = "at", descriptor = "(I)V", line = 110)
	@Override
	public void method6718(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		this.aBoolean98 = false;
		@Pc(11) int[] local11 = new int[this.anInt557 * this.anInt558];
		for (@Pc(13) int local13 = 0; local13 < this.anInt558; local13++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt557; local19++) {
				@Pc(28) int local28 = this.anIntArray40[local1];
				if ((local28 & 0xFF000000) == 0) {
					if (local19 > 0 && (this.anIntArray40[local1 - 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 > 0 && (this.anIntArray40[local1 - this.anInt557] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local19 < this.anInt557 - 1 && (this.anIntArray40[local1 + 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 < this.anInt558 - 1 && (this.anIntArray40[local1 + this.anInt557] & 0xFF000000) != 0) {
						local28 = arg0;
					}
				}
				if ((local28 & -16777216) != -16777216) {
					this.aBoolean98 = true;
				}
				local11[local1++] = local28;
			}
		}
		this.anIntArray40 = local11;
	}

	@OriginalMember(owner = "client!aej", name = "ae", descriptor = "(I)V", line = 110)
	@Override
	public void method6719(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		this.aBoolean98 = false;
		@Pc(11) int[] local11 = new int[this.anInt557 * this.anInt558];
		for (@Pc(13) int local13 = 0; local13 < this.anInt558; local13++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt557; local19++) {
				@Pc(28) int local28 = this.anIntArray40[local1];
				if ((local28 & 0xFF000000) == 0) {
					if (local19 > 0 && (this.anIntArray40[local1 - 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 > 0 && (this.anIntArray40[local1 - this.anInt557] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local19 < this.anInt557 - 1 && (this.anIntArray40[local1 + 1] & 0xFF000000) != 0) {
						local28 = arg0;
					} else if (local13 < this.anInt558 - 1 && (this.anIntArray40[local1 + this.anInt557] & 0xFF000000) != 0) {
						local28 = arg0;
					}
				}
				if ((local28 & -16777216) != -16777216) {
					this.aBoolean98 = true;
				}
				local11[local1++] = local28;
			}
		}
		this.anIntArray40 = local11;
	}

	@OriginalMember(owner = "client!aej", name = "z", descriptor = "(I)V", line = 132)
	@Override
	public void method6712(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt558 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt557;
			for (@Pc(16) int local16 = this.anInt557 - 1; local16 > 0; local16--) {
				if ((this.anIntArray40[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray40[local16 + local11 - 1 - this.anInt557] & 0xFF000000) != 0) {
					this.anIntArray40[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aej", name = "bw", descriptor = "(I)V", line = 132)
	@Override
	public void method6740(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt558 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt557;
			for (@Pc(16) int local16 = this.anInt557 - 1; local16 > 0; local16--) {
				if ((this.anIntArray40[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray40[local16 + local11 - 1 - this.anInt557] & 0xFF000000) != 0) {
					this.anIntArray40[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aej", name = "bi", descriptor = "(I)V", line = 132)
	@Override
	public void method6741(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt558 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt557;
			for (@Pc(16) int local16 = this.anInt557 - 1; local16 > 0; local16--) {
				if ((this.anIntArray40[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray40[local16 + local11 - 1 - this.anInt557] & 0xFF000000) != 0) {
					this.anIntArray40[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aej", name = "ah", descriptor = "()V", line = 144)
	@Override
	public void method6720() {
		@Pc(2) int[] local2 = this.anIntArray40;
		@Pc(7) int local7;
		for (local7 = this.anInt558 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt557;
			@Pc(21) int local21 = (local7 + 1) * this.anInt557;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt559;
		this.anInt559 = this.anInt562;
		this.anInt562 = local7;
	}

	@OriginalMember(owner = "client!aej", name = "as", descriptor = "()V", line = 144)
	@Override
	public void method6681() {
		@Pc(2) int[] local2 = this.anIntArray40;
		@Pc(7) int local7;
		for (local7 = this.anInt558 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt557;
			@Pc(21) int local21 = (local7 + 1) * this.anInt557;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt559;
		this.anInt559 = this.anInt562;
		this.anInt562 = local7;
	}

	@OriginalMember(owner = "client!aej", name = "aq", descriptor = "()V", line = 144)
	@Override
	public void method6722() {
		@Pc(2) int[] local2 = this.anIntArray40;
		@Pc(7) int local7;
		for (local7 = this.anInt558 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt557;
			@Pc(21) int local21 = (local7 + 1) * this.anInt557;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt559;
		this.anInt559 = this.anInt562;
		this.anInt562 = local7;
	}

	@OriginalMember(owner = "client!aej", name = "j", descriptor = "()V", line = 144)
	@Override
	public void method6726() {
		@Pc(2) int[] local2 = this.anIntArray40;
		@Pc(7) int local7;
		for (local7 = this.anInt558 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt557;
			@Pc(21) int local21 = (local7 + 1) * this.anInt557;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt559;
		this.anInt559 = this.anInt562;
		this.anInt562 = local7;
	}

	@OriginalMember(owner = "client!aej", name = "am", descriptor = "()V", line = 163)
	@Override
	public void method6723() {
		@Pc(2) int[] local2 = this.anIntArray40;
		@Pc(9) int local9;
		for (local9 = (this.anInt558 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt557;
			@Pc(26) int local26 = (this.anInt558 - local9 - 1) * this.anInt557;
			for (@Pc(30) int local30 = -this.anInt557; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt560;
		this.anInt560 = this.anInt561;
		this.anInt561 = local9;
	}

	@OriginalMember(owner = "client!aej", name = "ay", descriptor = "()V", line = 163)
	@Override
	public void method6728() {
		@Pc(2) int[] local2 = this.anIntArray40;
		@Pc(9) int local9;
		for (local9 = (this.anInt558 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt557;
			@Pc(26) int local26 = (this.anInt558 - local9 - 1) * this.anInt557;
			for (@Pc(30) int local30 = -this.anInt557; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt560;
		this.anInt560 = this.anInt561;
		this.anInt561 = local9;
	}

	@OriginalMember(owner = "client!aej", name = "i", descriptor = "()V", line = 163)
	@Override
	public void method6699() {
		@Pc(2) int[] local2 = this.anIntArray40;
		@Pc(9) int local9;
		for (local9 = (this.anInt558 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt557;
			@Pc(26) int local26 = (this.anInt558 - local9 - 1) * this.anInt557;
			for (@Pc(30) int local30 = -this.anInt557; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt560;
		this.anInt560 = this.anInt561;
		this.anInt561 = local9;
	}

	@OriginalMember(owner = "client!aej", name = "k", descriptor = "()V", line = 181)
	@Override
	public void method6691() {
		@Pc(6) int[] local6 = new int[this.anInt557 * this.anInt558];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt557; local10++) {
			for (@Pc(19) int local19 = this.anInt558 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray40[local10 + local19 * this.anInt557];
			}
		}
		this.anIntArray40 = local6;
		local10 = this.anInt560;
		this.anInt560 = this.anInt559;
		this.anInt559 = this.anInt561;
		this.anInt561 = this.anInt562;
		this.anInt562 = local10;
		local10 = this.anInt558;
		this.anInt558 = this.anInt557;
		this.anInt557 = local10;
	}

	@OriginalMember(owner = "client!aej", name = "an", descriptor = "()V", line = 181)
	@Override
	public void method6721() {
		@Pc(6) int[] local6 = new int[this.anInt557 * this.anInt558];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt557; local10++) {
			for (@Pc(19) int local19 = this.anInt558 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray40[local10 + local19 * this.anInt557];
			}
		}
		this.anIntArray40 = local6;
		local10 = this.anInt560;
		this.anInt560 = this.anInt559;
		this.anInt559 = this.anInt561;
		this.anInt561 = this.anInt562;
		this.anInt562 = local10;
		local10 = this.anInt558;
		this.anInt558 = this.anInt557;
		this.anInt557 = local10;
	}

	@OriginalMember(owner = "client!aej", name = "af", descriptor = "()V", line = 181)
	@Override
	public void method6725() {
		@Pc(6) int[] local6 = new int[this.anInt557 * this.anInt558];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt557; local10++) {
			for (@Pc(19) int local19 = this.anInt558 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray40[local10 + local19 * this.anInt557];
			}
		}
		this.anIntArray40 = local6;
		local10 = this.anInt560;
		this.anInt560 = this.anInt559;
		this.anInt559 = this.anInt561;
		this.anInt561 = this.anInt562;
		this.anInt562 = local10;
		local10 = this.anInt558;
		this.anInt558 = this.anInt557;
		this.anInt557 = local10;
	}

	@OriginalMember(owner = "client!aej", name = "u", descriptor = "(Z)[I", line = 198)
	@Override
	public int[] method6686(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method6724() == this.anInt557 && this.method6690() == this.anInt558) {
			return this.anIntArray40;
		}
		@Pc(14) int local14 = this.method6724();
		@Pc(20) int[] local20 = new int[local14 * this.method6690()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt558; local22++) {
			@Pc(31) int local31 = local22 * this.anInt557;
			@Pc(41) int local41 = this.anInt559 + (local22 + this.anInt560) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt557; local43++) {
				local20[local41++] = this.anIntArray40[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!aej", name = "ab", descriptor = "(Z)[I", line = 198)
	@Override
	public int[] method6727(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method6724() == this.anInt557 && this.method6690() == this.anInt558) {
			return this.anIntArray40;
		}
		@Pc(14) int local14 = this.method6724();
		@Pc(20) int[] local20 = new int[local14 * this.method6690()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt558; local22++) {
			@Pc(31) int local31 = local22 * this.anInt557;
			@Pc(41) int local41 = this.anInt559 + (local22 + this.anInt560) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt557; local43++) {
				local20[local41++] = this.anIntArray40[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!aej", name = "aa", descriptor = "(Z)[I", line = 198)
	@Override
	public int[] method6717(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method6724() == this.anInt557 && this.method6690() == this.anInt558) {
			return this.anIntArray40;
		}
		@Pc(14) int local14 = this.method6724();
		@Pc(20) int[] local20 = new int[local14 * this.method6690()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt558; local22++) {
			@Pc(31) int local31 = local22 * this.anInt557;
			@Pc(41) int local41 = this.anInt559 + (local22 + this.anInt560) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt557; local43++) {
				local20[local41++] = this.anIntArray40[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!aej", name = "ap", descriptor = "(Z)[I", line = 198)
	@Override
	public int[] method6729(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method6724() == this.anInt557 && this.method6690() == this.anInt558) {
			return this.anIntArray40;
		}
		@Pc(14) int local14 = this.method6724();
		@Pc(20) int[] local20 = new int[local14 * this.method6690()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt558; local22++) {
			@Pc(31) int local31 = local22 * this.anInt557;
			@Pc(41) int local41 = this.anInt559 + (local22 + this.anInt560) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt557; local43++) {
				local20[local41++] = this.anIntArray40[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!aej", name = "az", descriptor = "(III)V", line = 215)
	@Override
	public void method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray40.length; local1++) {
			@Pc(15) int local15 = this.anIntArray40[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray40[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray40[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray40[local1] = this.anIntArray40[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!aej", name = "e", descriptor = "(III)V", line = 215)
	@Override
	public void method6698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray40.length; local1++) {
			@Pc(15) int local15 = this.anIntArray40[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray40[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray40[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray40[local1] = this.anIntArray40[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!aej", name = "aw", descriptor = "(III)V", line = 215)
	@Override
	public void method6696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray40.length; local1++) {
			@Pc(15) int local15 = this.anIntArray40[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray40[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray40[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray40[local1] = this.anIntArray40[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!aej", name = "bc", descriptor = "(III)V", line = 215)
	@Override
	public void method6732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray40.length; local1++) {
			@Pc(15) int local15 = this.anIntArray40[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray40[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray40[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray40[local1] = this.anIntArray40[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!aej", name = "bj", descriptor = "(III)V", line = 215)
	@Override
	public void method6733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray40.length; local1++) {
			@Pc(15) int local15 = this.anIntArray40[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray40[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray40[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray40[local1] = this.anIntArray40[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!aej", name = "bb", descriptor = "(II)I", line = 233)
	@Override
	public int method6736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray40[arg0 + arg1 * this.anInt557];
	}

	@OriginalMember(owner = "client!aej", name = "bl", descriptor = "(II)I", line = 233)
	@Override
	public int method6735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray40[arg0 + arg1 * this.anInt557];
	}

	@OriginalMember(owner = "client!aej", name = "f", descriptor = "(II)I", line = 233)
	@Override
	public int method6697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray40[arg0 + arg1 * this.anInt557];
	}

	@OriginalMember(owner = "client!aej", name = "bv", descriptor = "(II)I", line = 233)
	@Override
	public int method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray40[arg0 + arg1 * this.anInt557];
	}

	@OriginalMember(owner = "client!aej", name = "ba", descriptor = "(II)I", line = 233)
	@Override
	public int method6708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray40[arg0 + arg1 * this.anInt557];
	}
}
