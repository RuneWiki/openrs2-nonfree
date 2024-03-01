package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abe")
public class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!abe", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_23;

	@OriginalMember(owner = "client!abe", name = "a", descriptor = "Lclient!bf;")
	Class4 aClass4_1;

	@OriginalMember(owner = "client!abe", name = "<init>", descriptor = "(Lclient!abt;[I)V", line = 10)
	Class16_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass21_Sub2_23 = arg0;
		if (this.aClass21_Sub2_23.aBoolean83) {
			@Pc(12) byte[] local12 = this.method1606(arg1);
			this.aClass4_1 = new Class4_Sub4(this.aClass21_Sub2_23, Class121.aClass121_17, Class127.aClass127_23, 16, 16, 16, local12, Class121.aClass121_17);
		} else {
			this.aClass4_1 = new Class4_Sub1(this.aClass21_Sub2_23, 3553, 256, 16, false, arg1, 256, 0, false);
		}
	}

	@OriginalMember(owner = "client!abe", name = "g", descriptor = "()Lclient!bf;", line = 20)
	Class4 method1603() {
		return this.aClass4_1;
	}

	@OriginalMember(owner = "client!abe", name = "p", descriptor = "()Lclient!bf;", line = 20)
	Class4 method1604() {
		return this.aClass4_1;
	}

	@OriginalMember(owner = "client!abe", name = "h", descriptor = "([I)[B", line = 24)
	byte[] method1605(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					local2[local41] = (byte) (local29 >> 16 & 0xFF);
					local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
					local2[local41 + 2] = (byte) (local29 & 0xFF);
					local2[local41 + 3] = -1;
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!abe", name = "a", descriptor = "([I)[B", line = 24)
	byte[] method1606(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					local2[local41] = (byte) (local29 >> 16 & 0xFF);
					local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
					local2[local41 + 2] = (byte) (local29 & 0xFF);
					local2[local41 + 3] = -1;
				}
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!abe", name = "l", descriptor = "([I)[B", line = 24)
	byte[] method1607(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					local2[local41] = (byte) (local29 >> 16 & 0xFF);
					local2[local41 + 1] = (byte) (local29 >> 8 & 0xFF);
					local2[local41 + 2] = (byte) (local29 & 0xFF);
					local2[local41 + 3] = -1;
				}
			}
		}
		return local2;
	}
}
