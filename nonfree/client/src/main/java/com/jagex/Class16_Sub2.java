package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abg")
public class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!abg", name = "p", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_3;

	@OriginalMember(owner = "client!abg", name = "a", descriptor = "Lclient!jl;")
	Interface28 anInterface28_1;

	@OriginalMember(owner = "client!abg", name = "<init>", descriptor = "(Lclient!abv;[I)V", line = 10)
	Class16_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass21_Sub3_3 = arg0;
		if (this.aClass21_Sub3_3.aBoolean438) {
			@Pc(12) byte[] local12 = this.method1681(arg1);
			this.anInterface28_1 = this.aClass21_Sub3_3.method17509(Class121.aClass121_17, 16, 16, 16, false, local12);
		} else {
			this.anInterface28_1 = this.aClass21_Sub3_3.method17501(256, 16, false, arg1);
		}
	}

	@OriginalMember(owner = "client!abg", name = "p", descriptor = "()Lclient!jl;", line = 20)
	public Interface28 method1680() {
		return this.anInterface28_1;
	}

	@OriginalMember(owner = "client!abg", name = "a", descriptor = "([I)[B", line = 24)
	byte[] method1681(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass21_Sub3_3.anInt2502 == 0) {
						local2[local41] = (byte) (local29 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 3] = -1;
					} else {
						local2[local41] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 & 0xFF);
						local2[local41 + 3] = -1;
					}
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!abg", name = "l", descriptor = "([I)[B", line = 24)
	byte[] method1682(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass21_Sub3_3.anInt2502 == 0) {
						local2[local41] = (byte) (local29 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 3] = -1;
					} else {
						local2[local41] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 & 0xFF);
						local2[local41 + 3] = -1;
					}
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!abg", name = "g", descriptor = "([I)[B", line = 24)
	byte[] method1683(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass21_Sub3_3.anInt2502 == 0) {
						local2[local41] = (byte) (local29 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 3] = -1;
					} else {
						local2[local41] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 & 0xFF);
						local2[local41 + 3] = -1;
					}
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!abg", name = "h", descriptor = "([I)[B", line = 24)
	byte[] method1684(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass21_Sub3_3.anInt2502 == 0) {
						local2[local41] = (byte) (local29 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 3] = -1;
					} else {
						local2[local41] = (byte) (local29 >> 16 & 0xFF);
						local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
						local2[local41 + 2] = (byte) (local29 & 0xFF);
						local2[local41 + 3] = -1;
					}
				}
			}
		}
		return local2;
	}
}
