package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajm")
public class Class77_Sub14 extends Class77 {

	@OriginalMember(owner = "client!ajm", name = "x", descriptor = "[I")
	static int[] anIntArray196;

	@OriginalMember(owner = "client!ajm", name = "w", descriptor = "I")
	int anInt1480;

	@OriginalMember(owner = "client!ajm", name = "t", descriptor = "Z")
	boolean aBoolean327;

	@OriginalMember(owner = "client!ajm", name = "l", descriptor = "I")
	final int anInt1478;

	@OriginalMember(owner = "client!ajm", name = "y", descriptor = "I")
	final int anInt1479;

	@OriginalMember(owner = "client!ajm", name = "q", descriptor = "[I")
	int[] anIntArray195;

	@OriginalMember(owner = "client!ajm", name = "<init>", descriptor = "(II[IZ)V", line = 15)
	Class77_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1478 = arg0;
		this.anInt1479 = arg1;
		this.anIntArray195 = arg2;
		if (arg3) {
			@Pc(16) int[] local16 = new int[this.anInt1479];
			@Pc(20) int[] local20 = new int[this.anInt1479];
			@Pc(24) int[] local24 = new int[this.anInt1479];
			@Pc(28) int[] local28 = new int[this.anInt1479];
			if (anIntArray196 == null || anIntArray196.length != this.anIntArray195.length) {
				anIntArray196 = new int[this.anIntArray195.length];
			}
			@Pc(44) int local44 = this.anInt1479;
			@Pc(47) int local47 = this.anInt1479;
			@Pc(51) int local51 = local44 - 1;
			@Pc(55) int local55 = local47 - 1;
			@Pc(59) int local59 = local44 * local47;
			@Pc(64) int local64;
			@Pc(65) int local65 = local64 = local44;
			@Pc(71) int local71;
			@Pc(67) int local67;
			for (local67 = 2; local67 >= 0; local67--) {
				for (local71 = local51; local71 >= 0; local71--) {
					local64--;
					@Pc(79) int local79 = this.anIntArray195[local64];
					local16[local71] += local79 >> 24 & 0xFF;
					local20[local71] += local79 >> 16 & 0xFF;
					local24[local71] += local79 >> 8 & 0xFF;
					local28[local71] += local79 & 0xFF;
				}
				if (local64 == 0) {
					local64 = local59;
				}
			}
			@Pc(131) int local131 = local59;
			for (@Pc(133) int local133 = local55; local133 >= 0; local133--) {
				@Pc(137) int local137 = 1;
				@Pc(139) int local139 = 1;
				@Pc(141) int local141 = 0;
				@Pc(143) int local143 = 0;
				@Pc(145) int local145 = 0;
				@Pc(147) int local147 = 0;
				for (local71 = 2; local71 >= 0; local71--) {
					local139--;
					local147 += local16[local139];
					local145 += local20[local139];
					local141 += local24[local139];
					local143 += local28[local139];
					if (local139 == 0) {
						local139 = local44;
					}
				}
				for (local71 = local51; local71 >= 0; local71--) {
					local139--;
					local137--;
					local67 = local147 / 9;
					@Pc(196) int local196 = local145 / 9;
					@Pc(200) int local200 = local141 / 9;
					@Pc(204) int local204 = local143 / 9;
					local131--;
					anIntArray196[local131] = local67 << 24 | local196 << 16 | local200 << 8 | local204;
					local147 += local16[local139] - local16[local137];
					local145 += local20[local139] - local20[local137];
					local143 += local28[local139] - local28[local137];
					local141 += local24[local139] - local24[local137];
					if (local139 == 0) {
						local139 = local44;
					}
					if (local137 == 0) {
						local137 = local44;
					}
				}
				for (local71 = local51; local71 >= 0; local71--) {
					local64--;
					@Pc(281) int local281 = this.anIntArray195[local64];
					local65--;
					@Pc(287) int local287 = this.anIntArray195[local65];
					local16[local71] += (local281 >> 24 & 0xFF) - (local287 >> 24 & 0xFF);
					local20[local71] += (local281 >> 16 & 0xFF) - (local287 >> 16 & 0xFF);
					local24[local71] += (local281 >> 8 & 0xFF) - (local287 >> 8 & 0xFF);
					local28[local71] += (local281 & 0xFF) - (local287 & 0xFF);
				}
				if (local64 == 0) {
					local64 = local59;
				}
				if (local65 == 0) {
					local65 = local59;
				}
			}
			@Pc(366) int[] local366 = this.anIntArray195;
			this.anIntArray195 = anIntArray196;
			anIntArray196 = local366;
		}
	}

	@OriginalMember(owner = "client!ajm", name = "p", descriptor = "()[I", line = 111)
	int[] method13400() {
		return this.anIntArray195;
	}

	@OriginalMember(owner = "client!ajm", name = "l", descriptor = "()[I", line = 111)
	int[] method13401() {
		return this.anIntArray195;
	}

	@OriginalMember(owner = "client!ajm", name = "v", descriptor = "()[I", line = 111)
	int[] method13402() {
		return this.anIntArray195;
	}

	@OriginalMember(owner = "client!ajm", name = "y", descriptor = "()[I", line = 111)
	int[] method13403() {
		return this.anIntArray195;
	}

	@OriginalMember(owner = "client!ajm", name = "w", descriptor = "(II)V", line = 115)
	void method13404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (anIntArray196 == null || anIntArray196.length != this.anIntArray195.length) {
			anIntArray196 = new int[this.anIntArray195.length];
		}
		@Pc(21) int local21 = this.anIntArray195.length;
		@Pc(23) int local23 = arg0;
		@Pc(28) int local28 = this.anInt1479 - 1;
		@Pc(33) int local33 = this.anInt1479 * arg1;
		@Pc(37) int local37 = local21 - 1;
		for (@Pc(39) int local39 = 0; local39 < local21; local39 += this.anInt1479) {
			@Pc(48) int local48 = local39 + local33 & local37;
			for (@Pc(50) int local50 = 0; local50 < this.anInt1479; local50++) {
				@Pc(58) int local58 = local39 + local50;
				@Pc(66) int local66 = local48 + (local50 + local23 & local28);
				anIntArray196[local58] = this.anIntArray195[local66];
			}
		}
		@Pc(84) int[] local84 = this.anIntArray195;
		this.anIntArray195 = anIntArray196;
		anIntArray196 = local84;
	}

	@OriginalMember(owner = "client!ajm", name = "c", descriptor = "(II)V", line = 115)
	void method13405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (anIntArray196 == null || anIntArray196.length != this.anIntArray195.length) {
			anIntArray196 = new int[this.anIntArray195.length];
		}
		@Pc(21) int local21 = this.anIntArray195.length;
		@Pc(23) int local23 = arg0;
		@Pc(28) int local28 = this.anInt1479 - 1;
		@Pc(33) int local33 = this.anInt1479 * arg1;
		@Pc(37) int local37 = local21 - 1;
		for (@Pc(39) int local39 = 0; local39 < local21; local39 += this.anInt1479) {
			@Pc(48) int local48 = local39 + local33 & local37;
			for (@Pc(50) int local50 = 0; local50 < this.anInt1479; local50++) {
				@Pc(58) int local58 = local39 + local50;
				@Pc(66) int local66 = local48 + (local50 + local23 & local28);
				anIntArray196[local58] = this.anIntArray195[local66];
			}
		}
		@Pc(84) int[] local84 = this.anIntArray195;
		this.anIntArray195 = anIntArray196;
		anIntArray196 = local84;
	}
}
