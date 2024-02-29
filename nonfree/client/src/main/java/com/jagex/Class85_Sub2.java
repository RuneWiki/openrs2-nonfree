package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aei")
public class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!aei", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_25;

	@OriginalMember(owner = "client!aei", name = "c", descriptor = "Lclient!bx;")
	Class78 aClass78_1;

	@OriginalMember(owner = "client!aei", name = "<init>", descriptor = "(Lclient!aeq;[I)V", line = 10)
	Class85_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass86_Sub3_25 = arg0;
		if (this.aClass86_Sub3_25.aBoolean139) {
			@Pc(12) byte[] local12 = this.method4916(arg1);
			this.aClass78_1 = new Class78_Sub4(this.aClass86_Sub3_25, Class212.aClass212_18, Class206.aClass206_23, 16, 16, 16, local12, Class212.aClass212_18);
		} else {
			this.aClass78_1 = new Class78_Sub2(this.aClass86_Sub3_25, 3553, 256, 16, false, arg1, 256, 0, false);
		}
	}

	@OriginalMember(owner = "client!aei", name = "p", descriptor = "()Lclient!bx;", line = 20)
	Class78 method4910() {
		return this.aClass78_1;
	}

	@OriginalMember(owner = "client!aei", name = "w", descriptor = "()Lclient!bx;", line = 20)
	Class78 method4911() {
		return this.aClass78_1;
	}

	@OriginalMember(owner = "client!aei", name = "l", descriptor = "()Lclient!bx;", line = 20)
	Class78 method4912() {
		return this.aClass78_1;
	}

	@OriginalMember(owner = "client!aei", name = "y", descriptor = "()Lclient!bx;", line = 20)
	Class78 method4913() {
		return this.aClass78_1;
	}

	@OriginalMember(owner = "client!aei", name = "v", descriptor = "()Lclient!bx;", line = 20)
	Class78 method4914() {
		return this.aClass78_1;
	}

	@OriginalMember(owner = "client!aei", name = "x", descriptor = "([I)[B", line = 24)
	byte[] method4915(@OriginalArg(0) int[] arg0) {
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

	@OriginalMember(owner = "client!aei", name = "c", descriptor = "([I)[B", line = 24)
	byte[] method4916(@OriginalArg(0) int[] arg0) {
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

	@OriginalMember(owner = "client!aei", name = "t", descriptor = "([I)[B", line = 24)
	byte[] method4917(@OriginalArg(0) int[] arg0) {
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

	@OriginalMember(owner = "client!aei", name = "q", descriptor = "([I)[B", line = 24)
	byte[] method4918(@OriginalArg(0) int[] arg0) {
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

	@OriginalMember(owner = "client!aei", name = "d", descriptor = "([I)[B", line = 24)
	byte[] method4919(@OriginalArg(0) int[] arg0) {
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
