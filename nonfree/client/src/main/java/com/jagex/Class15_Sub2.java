package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abp")
public class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!abp", name = "x", descriptor = "I")
	int anInt322;

	@OriginalMember(owner = "client!abp", name = "g", descriptor = "I")
	int anInt324;

	@OriginalMember(owner = "client!abp", name = "l", descriptor = "I")
	int anInt325;

	@OriginalMember(owner = "client!abp", name = "h", descriptor = "I")
	int anInt326;

	@OriginalMember(owner = "client!abp", name = "u", descriptor = "Z")
	boolean aBoolean58;

	@OriginalMember(owner = "client!abp", name = "p", descriptor = "I")
	int anInt323;

	@OriginalMember(owner = "client!abp", name = "a", descriptor = "I")
	int anInt327;

	@OriginalMember(owner = "client!abp", name = "s", descriptor = "[I")
	int[] anIntArray45;

	@OriginalMember(owner = "client!abp", name = "<init>", descriptor = "(II[I)V", line = 15)
	Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt323 = arg0;
		this.anInt327 = arg1;
		this.anIntArray45 = arg2;
	}

	@OriginalMember(owner = "client!abp", name = "p", descriptor = "()Z", line = 22)
	@Override
	public boolean method3465() {
		return false;
	}

	@OriginalMember(owner = "client!abp", name = "t", descriptor = "()Z", line = 22)
	@Override
	public boolean method3479() {
		return false;
	}

	@OriginalMember(owner = "client!abp", name = "a", descriptor = "()Z", line = 26)
	@Override
	public boolean method3432() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!abp", name = "w", descriptor = "()Z", line = 26)
	@Override
	public boolean method3452() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!abp", name = "g", descriptor = "()I", line = 30)
	@Override
	public int method3433() {
		return this.anInt323;
	}

	@OriginalMember(owner = "client!abp", name = "o", descriptor = "()I", line = 30)
	@Override
	public int method3435() {
		return this.anInt323;
	}

	@OriginalMember(owner = "client!abp", name = "i", descriptor = "()I", line = 30)
	@Override
	public int method3430() {
		return this.anInt323;
	}

	@OriginalMember(owner = "client!abp", name = "f", descriptor = "()I", line = 30)
	@Override
	public int method3455() {
		return this.anInt323;
	}

	@OriginalMember(owner = "client!abp", name = "l", descriptor = "()I", line = 34)
	@Override
	public int method3440() {
		return this.anInt327;
	}

	@OriginalMember(owner = "client!abp", name = "k", descriptor = "()I", line = 34)
	@Override
	public int method3456() {
		return this.anInt327;
	}

	@OriginalMember(owner = "client!abp", name = "b", descriptor = "()I", line = 38)
	@Override
	public int method3446() {
		return this.anInt323 + this.anInt324 + this.anInt325;
	}

	@OriginalMember(owner = "client!abp", name = "af", descriptor = "()I", line = 38)
	@Override
	public int method3458() {
		return this.anInt323 + this.anInt324 + this.anInt325;
	}

	@OriginalMember(owner = "client!abp", name = "at", descriptor = "()I", line = 38)
	@Override
	public int method3457() {
		return this.anInt323 + this.anInt324 + this.anInt325;
	}

	@OriginalMember(owner = "client!abp", name = "aa", descriptor = "()I", line = 38)
	@Override
	public int method3460() {
		return this.anInt323 + this.anInt324 + this.anInt325;
	}

	@OriginalMember(owner = "client!abp", name = "ak", descriptor = "()I", line = 38)
	@Override
	public int method3459() {
		return this.anInt323 + this.anInt324 + this.anInt325;
	}

	@OriginalMember(owner = "client!abp", name = "c", descriptor = "()I", line = 42)
	@Override
	public int method3441() {
		return this.anInt327 + this.anInt326 + this.anInt322;
	}

	@OriginalMember(owner = "client!abp", name = "ah", descriptor = "()I", line = 42)
	@Override
	public int method3461() {
		return this.anInt327 + this.anInt326 + this.anInt322;
	}

	@OriginalMember(owner = "client!abp", name = "h", descriptor = "()I", line = 46)
	@Override
	public int method3453() {
		return this.anInt324;
	}

	@OriginalMember(owner = "client!abp", name = "bt", descriptor = "()I", line = 46)
	@Override
	public int method3488() {
		return this.anInt324;
	}

	@OriginalMember(owner = "client!abp", name = "bf", descriptor = "()I", line = 46)
	@Override
	public int method3487() {
		return this.anInt324;
	}

	@OriginalMember(owner = "client!abp", name = "x", descriptor = "()I", line = 50)
	@Override
	public int method3436() {
		return this.anInt325;
	}

	@OriginalMember(owner = "client!abp", name = "an", descriptor = "()I", line = 50)
	@Override
	public int method3476() {
		return this.anInt325;
	}

	@OriginalMember(owner = "client!abp", name = "aj", descriptor = "()I", line = 50)
	@Override
	public int method3463() {
		return this.anInt325;
	}

	@OriginalMember(owner = "client!abp", name = "s", descriptor = "()I", line = 54)
	@Override
	public int method3431() {
		return this.anInt326;
	}

	@OriginalMember(owner = "client!abp", name = "as", descriptor = "()I", line = 54)
	@Override
	public int method3464() {
		return this.anInt326;
	}

	@OriginalMember(owner = "client!abp", name = "ai", descriptor = "()I", line = 54)
	@Override
	public int method3451() {
		return this.anInt326;
	}

	@OriginalMember(owner = "client!abp", name = "aq", descriptor = "()I", line = 58)
	@Override
	public int method3466() {
		return this.anInt322;
	}

	@OriginalMember(owner = "client!abp", name = "u", descriptor = "()I", line = 58)
	@Override
	public int method3437() {
		return this.anInt322;
	}

	@OriginalMember(owner = "client!abp", name = "y", descriptor = "()V", line = 62)
	@Override
	public void method3439() {
		this.anInt322 = 0;
		this.anInt326 = 0;
		this.anInt325 = 0;
		this.anInt324 = 0;
	}

	@OriginalMember(owner = "client!abp", name = "av", descriptor = "()V", line = 62)
	@Override
	public void method3467() {
		this.anInt322 = 0;
		this.anInt326 = 0;
		this.anInt325 = 0;
		this.anInt324 = 0;
	}

	@OriginalMember(owner = "client!abp", name = "ax", descriptor = "()V", line = 62)
	@Override
	public void method3468() {
		this.anInt322 = 0;
		this.anInt326 = 0;
		this.anInt325 = 0;
		this.anInt324 = 0;
	}

	@OriginalMember(owner = "client!abp", name = "z", descriptor = "(I)V", line = 69)
	@Override
	public void method3438(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method3446();
		@Pc(5) int local5 = this.method3441();
		if (this.anInt323 == local2 && this.anInt327 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt324) {
			local16 = this.anInt324;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt324 + this.anInt323 > local2) {
			local25 = local2 - this.anInt324 - this.anInt323;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt326) {
			local44 = this.anInt326;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt326 + this.anInt327 > local5) {
			local53 = local5 - this.anInt326 - this.anInt327;
		}
		@Pc(77) int local77 = this.anInt323 + local16 + local25;
		@Pc(84) int local84 = this.anInt327 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		for (@Pc(91) int local91 = 0; local91 < this.anInt327; local91++) {
			@Pc(100) int local100 = local91 * this.anInt323;
			@Pc(108) int local108 = (local91 + local44) * local77 + local16;
			for (@Pc(110) int local110 = 0; local110 < this.anInt323; local110++) {
				local89[local108++] = this.anIntArray45[local100++];
			}
		}
		this.anInt324 -= local16;
		this.anInt326 -= local44;
		this.anInt325 -= local25;
		this.anInt322 -= local53;
		this.anInt323 = local77;
		this.anInt327 = local84;
		this.anIntArray45 = local89;
	}

	@OriginalMember(owner = "client!abp", name = "az", descriptor = "(I)V", line = 69)
	@Override
	public void method3449(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method3446();
		@Pc(5) int local5 = this.method3441();
		if (this.anInt323 == local2 && this.anInt327 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt324) {
			local16 = this.anInt324;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt324 + this.anInt323 > local2) {
			local25 = local2 - this.anInt324 - this.anInt323;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt326) {
			local44 = this.anInt326;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt326 + this.anInt327 > local5) {
			local53 = local5 - this.anInt326 - this.anInt327;
		}
		@Pc(77) int local77 = this.anInt323 + local16 + local25;
		@Pc(84) int local84 = this.anInt327 + local44 + local53;
		@Pc(89) int[] local89 = new int[local77 * local84];
		for (@Pc(91) int local91 = 0; local91 < this.anInt327; local91++) {
			@Pc(100) int local100 = local91 * this.anInt323;
			@Pc(108) int local108 = (local91 + local44) * local77 + local16;
			for (@Pc(110) int local110 = 0; local110 < this.anInt323; local110++) {
				local89[local108++] = this.anIntArray45[local100++];
			}
		}
		this.anInt324 -= local16;
		this.anInt326 -= local44;
		this.anInt325 -= local25;
		this.anInt322 -= local53;
		this.anInt323 = local77;
		this.anInt327 = local84;
		this.anIntArray45 = local89;
	}

	@OriginalMember(owner = "client!abp", name = "j", descriptor = "(I)V", line = 100)
	@Override
	public void method3443(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(8) int[] local8 = new int[this.anInt323 * this.anInt327];
		for (@Pc(10) int local10 = 0; local10 < this.anInt327; local10++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt323; local16++) {
				@Pc(25) int local25 = this.anIntArray45[local1];
				if ((local25 & 0xFF000000) == 0) {
					if (local16 > 0 && (this.anIntArray45[local1 - 1] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local10 > 0 && (this.anIntArray45[local1 - this.anInt323] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local16 < this.anInt323 - 1 && (this.anIntArray45[local1 + 1] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local10 < this.anInt327 - 1 && (this.anIntArray45[local1 + this.anInt323] & 0xFF000000) != 0) {
						local25 = arg0;
					}
				}
				local8[local1++] = local25;
			}
		}
		this.anIntArray45 = local8;
	}

	@OriginalMember(owner = "client!abp", name = "al", descriptor = "(I)V", line = 100)
	@Override
	public void method3470(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(8) int[] local8 = new int[this.anInt323 * this.anInt327];
		for (@Pc(10) int local10 = 0; local10 < this.anInt327; local10++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt323; local16++) {
				@Pc(25) int local25 = this.anIntArray45[local1];
				if ((local25 & 0xFF000000) == 0) {
					if (local16 > 0 && (this.anIntArray45[local1 - 1] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local10 > 0 && (this.anIntArray45[local1 - this.anInt323] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local16 < this.anInt323 - 1 && (this.anIntArray45[local1 + 1] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local10 < this.anInt327 - 1 && (this.anIntArray45[local1 + this.anInt323] & 0xFF000000) != 0) {
						local25 = arg0;
					}
				}
				local8[local1++] = local25;
			}
		}
		this.anIntArray45 = local8;
	}

	@OriginalMember(owner = "client!abp", name = "ao", descriptor = "(I)V", line = 100)
	@Override
	public void method3434(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(8) int[] local8 = new int[this.anInt323 * this.anInt327];
		for (@Pc(10) int local10 = 0; local10 < this.anInt327; local10++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt323; local16++) {
				@Pc(25) int local25 = this.anIntArray45[local1];
				if ((local25 & 0xFF000000) == 0) {
					if (local16 > 0 && (this.anIntArray45[local1 - 1] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local10 > 0 && (this.anIntArray45[local1 - this.anInt323] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local16 < this.anInt323 - 1 && (this.anIntArray45[local1 + 1] & 0xFF000000) != 0) {
						local25 = arg0;
					} else if (local10 < this.anInt327 - 1 && (this.anIntArray45[local1 + this.anInt323] & 0xFF000000) != 0) {
						local25 = arg0;
					}
				}
				local8[local1++] = local25;
			}
		}
		this.anIntArray45 = local8;
	}

	@OriginalMember(owner = "client!abp", name = "ab", descriptor = "(I)V", line = 118)
	@Override
	public void method3472(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt327 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt323;
			for (@Pc(16) int local16 = this.anInt323 - 1; local16 > 0; local16--) {
				if ((this.anIntArray45[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray45[local16 + local11 - 1 - this.anInt323] & 0xFF000000) != 0) {
					this.anIntArray45[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!abp", name = "n", descriptor = "(I)V", line = 118)
	@Override
	public void method3462(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt327 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt323;
			for (@Pc(16) int local16 = this.anInt323 - 1; local16 > 0; local16--) {
				if ((this.anIntArray45[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray45[local16 + local11 - 1 - this.anInt323] & 0xFF000000) != 0) {
					this.anIntArray45[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!abp", name = "ap", descriptor = "(I)V", line = 118)
	@Override
	public void method3480(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt327 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt323;
			for (@Pc(16) int local16 = this.anInt323 - 1; local16 > 0; local16--) {
				if ((this.anIntArray45[local16 + local11] & 0xFF000000) == 0 && (this.anIntArray45[local16 + local11 - 1 - this.anInt323] & 0xFF000000) != 0) {
					this.anIntArray45[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!abp", name = "e", descriptor = "()V", line = 128)
	@Override
	public void method3445() {
		@Pc(2) int[] local2 = this.anIntArray45;
		@Pc(7) int local7;
		for (local7 = this.anInt327 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt323;
			@Pc(21) int local21 = (local7 + 1) * this.anInt323;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt324;
		this.anInt324 = this.anInt325;
		this.anInt325 = local7;
	}

	@OriginalMember(owner = "client!abp", name = "au", descriptor = "()V", line = 128)
	@Override
	public void method3473() {
		@Pc(2) int[] local2 = this.anIntArray45;
		@Pc(7) int local7;
		for (local7 = this.anInt327 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt323;
			@Pc(21) int local21 = (local7 + 1) * this.anInt323;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt324;
		this.anInt324 = this.anInt325;
		this.anInt325 = local7;
	}

	@OriginalMember(owner = "client!abp", name = "ag", descriptor = "()V", line = 128)
	@Override
	public void method3475() {
		@Pc(2) int[] local2 = this.anIntArray45;
		@Pc(7) int local7;
		for (local7 = this.anInt327 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt323;
			@Pc(21) int local21 = (local7 + 1) * this.anInt323;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt324;
		this.anInt324 = this.anInt325;
		this.anInt325 = local7;
	}

	@OriginalMember(owner = "client!abp", name = "ay", descriptor = "()V", line = 128)
	@Override
	public void method3454() {
		@Pc(2) int[] local2 = this.anIntArray45;
		@Pc(7) int local7;
		for (local7 = this.anInt327 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt323;
			@Pc(21) int local21 = (local7 + 1) * this.anInt323;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		local7 = this.anInt324;
		this.anInt324 = this.anInt325;
		this.anInt325 = local7;
	}

	@OriginalMember(owner = "client!abp", name = "r", descriptor = "()V", line = 147)
	@Override
	public void method3450() {
		@Pc(2) int[] local2 = this.anIntArray45;
		@Pc(9) int local9;
		for (local9 = (this.anInt327 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt323;
			@Pc(26) int local26 = (this.anInt327 - local9 - 1) * this.anInt323;
			for (@Pc(30) int local30 = -this.anInt323; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt326;
		this.anInt326 = this.anInt322;
		this.anInt322 = local9;
	}

	@OriginalMember(owner = "client!abp", name = "am", descriptor = "()V", line = 147)
	@Override
	public void method3444() {
		@Pc(2) int[] local2 = this.anIntArray45;
		@Pc(9) int local9;
		for (local9 = (this.anInt327 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt323;
			@Pc(26) int local26 = (this.anInt327 - local9 - 1) * this.anInt323;
			for (@Pc(30) int local30 = -this.anInt323; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt326;
		this.anInt326 = this.anInt322;
		this.anInt322 = local9;
	}

	@OriginalMember(owner = "client!abp", name = "ar", descriptor = "()V", line = 147)
	@Override
	public void method3477() {
		@Pc(2) int[] local2 = this.anIntArray45;
		@Pc(9) int local9;
		for (local9 = (this.anInt327 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt323;
			@Pc(26) int local26 = (this.anInt327 - local9 - 1) * this.anInt323;
			for (@Pc(30) int local30 = -this.anInt323; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		local9 = this.anInt326;
		this.anInt326 = this.anInt322;
		this.anInt322 = local9;
	}

	@OriginalMember(owner = "client!abp", name = "d", descriptor = "()V", line = 165)
	@Override
	public void method3447() {
		@Pc(6) int[] local6 = new int[this.anInt323 * this.anInt327];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt323; local10++) {
			for (@Pc(19) int local19 = this.anInt327 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray45[local10 + local19 * this.anInt323];
			}
		}
		this.anIntArray45 = local6;
		local10 = this.anInt326;
		this.anInt326 = this.anInt324;
		this.anInt324 = this.anInt322;
		this.anInt322 = this.anInt325;
		this.anInt325 = local10;
		local10 = this.anInt327;
		this.anInt327 = this.anInt323;
		this.anInt323 = local10;
	}

	@OriginalMember(owner = "client!abp", name = "ae", descriptor = "()V", line = 165)
	@Override
	public void method3478() {
		@Pc(6) int[] local6 = new int[this.anInt323 * this.anInt327];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt323; local10++) {
			for (@Pc(19) int local19 = this.anInt327 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray45[local10 + local19 * this.anInt323];
			}
		}
		this.anIntArray45 = local6;
		local10 = this.anInt326;
		this.anInt326 = this.anInt324;
		this.anInt324 = this.anInt322;
		this.anInt322 = this.anInt325;
		this.anInt325 = local10;
		local10 = this.anInt327;
		this.anInt327 = this.anInt323;
		this.anInt323 = local10;
	}

	@OriginalMember(owner = "client!abp", name = "ad", descriptor = "()V", line = 165)
	@Override
	public void method3474() {
		@Pc(6) int[] local6 = new int[this.anInt323 * this.anInt327];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt323; local10++) {
			for (@Pc(19) int local19 = this.anInt327 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.anIntArray45[local10 + local19 * this.anInt323];
			}
		}
		this.anIntArray45 = local6;
		local10 = this.anInt326;
		this.anInt326 = this.anInt324;
		this.anInt324 = this.anInt322;
		this.anInt322 = this.anInt325;
		this.anInt325 = local10;
		local10 = this.anInt327;
		this.anInt327 = this.anInt323;
		this.anInt323 = local10;
	}

	@OriginalMember(owner = "client!abp", name = "q", descriptor = "(Z)[I", line = 182)
	@Override
	public int[] method3448(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method3446() == this.anInt323 && this.method3441() == this.anInt327) {
			return this.anIntArray45;
		}
		@Pc(14) int local14 = this.method3446();
		@Pc(20) int[] local20 = new int[local14 * this.method3441()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt327; local22++) {
			@Pc(31) int local31 = local22 * this.anInt323;
			@Pc(41) int local41 = this.anInt324 + (local22 + this.anInt326) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt323; local43++) {
				local20[local41++] = this.anIntArray45[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!abp", name = "ac", descriptor = "(Z)[I", line = 182)
	@Override
	public int[] method3481(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method3446() == this.anInt323 && this.method3441() == this.anInt327) {
			return this.anIntArray45;
		}
		@Pc(14) int local14 = this.method3446();
		@Pc(20) int[] local20 = new int[local14 * this.method3441()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt327; local22++) {
			@Pc(31) int local31 = local22 * this.anInt323;
			@Pc(41) int local41 = this.anInt324 + (local22 + this.anInt326) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt323; local43++) {
				local20[local41++] = this.anIntArray45[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!abp", name = "aw", descriptor = "(Z)[I", line = 182)
	@Override
	public int[] method3442(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method3446() == this.anInt323 && this.method3441() == this.anInt327) {
			return this.anIntArray45;
		}
		@Pc(14) int local14 = this.method3446();
		@Pc(20) int[] local20 = new int[local14 * this.method3441()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt327; local22++) {
			@Pc(31) int local31 = local22 * this.anInt323;
			@Pc(41) int local41 = this.anInt324 + (local22 + this.anInt326) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt323; local43++) {
				local20[local41++] = this.anIntArray45[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!abp", name = "bw", descriptor = "(Z)[I", line = 182)
	@Override
	public int[] method3469(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method3446() == this.anInt323 && this.method3441() == this.anInt327) {
			return this.anIntArray45;
		}
		@Pc(14) int local14 = this.method3446();
		@Pc(20) int[] local20 = new int[local14 * this.method3441()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt327; local22++) {
			@Pc(31) int local31 = local22 * this.anInt323;
			@Pc(41) int local41 = this.anInt324 + (local22 + this.anInt326) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt323; local43++) {
				local20[local41++] = this.anIntArray45[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!abp", name = "bp", descriptor = "(Z)[I", line = 182)
	@Override
	public int[] method3483(@OriginalArg(0) boolean arg0) {
		if (!arg0 || this.method3446() == this.anInt323 && this.method3441() == this.anInt327) {
			return this.anIntArray45;
		}
		@Pc(14) int local14 = this.method3446();
		@Pc(20) int[] local20 = new int[local14 * this.method3441()];
		for (@Pc(22) int local22 = 0; local22 < this.anInt327; local22++) {
			@Pc(31) int local31 = local22 * this.anInt323;
			@Pc(41) int local41 = this.anInt324 + (local22 + this.anInt326) * local14;
			for (@Pc(43) int local43 = 0; local43 < this.anInt323; local43++) {
				local20[local41++] = this.anIntArray45[local31];
				local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!abp", name = "m", descriptor = "(III)V", line = 199)
	@Override
	public void method3482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray45.length; local1++) {
			@Pc(15) int local15 = this.anIntArray45[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray45[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray45[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray45[local1] = this.anIntArray45[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!abp", name = "bd", descriptor = "(III)V", line = 199)
	@Override
	public void method3484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray45.length; local1++) {
			@Pc(15) int local15 = this.anIntArray45[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray45[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray45[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray45[local1] = this.anIntArray45[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!abp", name = "bs", descriptor = "(III)V", line = 199)
	@Override
	public void method3485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray45.length; local1++) {
			@Pc(15) int local15 = this.anIntArray45[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray45[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(61) int local61 = this.anIntArray45[local1] >> 0 & 0xFF;
			local61 += arg2;
			if (local61 < 0) {
				local61 = 0;
			} else if (local61 > 255) {
				local61 = 255;
			}
			this.anIntArray45[local1] = this.anIntArray45[local1] & 0xFF000000 | local15 << 16 | local38 << 8 | local61;
		}
	}

	@OriginalMember(owner = "client!abp", name = "v", descriptor = "(II)I", line = 217)
	@Override
	public int method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray45[arg0 + arg1 * this.anInt323];
	}

	@OriginalMember(owner = "client!abp", name = "bm", descriptor = "(II)I", line = 217)
	@Override
	public int method3486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArray45[arg0 + arg1 * this.anInt323];
	}
}
