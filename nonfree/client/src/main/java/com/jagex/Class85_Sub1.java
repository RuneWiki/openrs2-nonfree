package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aec")
public class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!aec", name = "p", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_1;

	@OriginalMember(owner = "client!aec", name = "c", descriptor = "Lclient!ls;")
	Interface42 anInterface42_1;

	@OriginalMember(owner = "client!aec", name = "<init>", descriptor = "(Lclient!aed;[I)V", line = 10)
	Class85_Sub1(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass86_Sub1_1 = arg0;
		if (this.aClass86_Sub1_1.aBoolean458) {
			@Pc(12) byte[] local12 = this.method2745(arg1);
			this.anInterface42_1 = this.aClass86_Sub1_1.method20766(Class212.aClass212_18, 16, 16, 16, false, local12);
		} else {
			this.anInterface42_1 = this.aClass86_Sub1_1.method20530(256, 16, false, arg1);
		}
	}

	@OriginalMember(owner = "client!aec", name = "p", descriptor = "()Lclient!ls;", line = 20)
	public Interface42 method2738() {
		return this.anInterface42_1;
	}

	@OriginalMember(owner = "client!aec", name = "v", descriptor = "()Lclient!ls;", line = 20)
	public Interface42 method2739() {
		return this.anInterface42_1;
	}

	@OriginalMember(owner = "client!aec", name = "l", descriptor = "()Lclient!ls;", line = 20)
	public Interface42 method2740() {
		return this.anInterface42_1;
	}

	@OriginalMember(owner = "client!aec", name = "y", descriptor = "()Lclient!ls;", line = 20)
	public Interface42 method2741() {
		return this.anInterface42_1;
	}

	@OriginalMember(owner = "client!aec", name = "t", descriptor = "()Lclient!ls;", line = 20)
	public Interface42 method2742() {
		return this.anInterface42_1;
	}

	@OriginalMember(owner = "client!aec", name = "w", descriptor = "()Lclient!ls;", line = 20)
	public Interface42 method2743() {
		return this.anInterface42_1;
	}

	@OriginalMember(owner = "client!aec", name = "x", descriptor = "([I)[B", line = 24)
	byte[] method2744(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass86_Sub1_1.anInt2847 == 0) {
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

	@OriginalMember(owner = "client!aec", name = "c", descriptor = "([I)[B", line = 24)
	byte[] method2745(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass86_Sub1_1.anInt2847 == 0) {
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

	@OriginalMember(owner = "client!aec", name = "q", descriptor = "([I)[B", line = 24)
	byte[] method2746(@OriginalArg(0) int[] arg0) {
		@Pc(2) byte[] local2 = new byte[16384];
		for (@Pc(4) int local4 = 0; local4 < 16; local4++) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
					@Pc(29) int local29 = arg0[local9 * 256 + local14 * 16 + local4];
					@Pc(41) int local41 = (local14 * 256 + local9 * 16 + local4) * 4;
					if (this.aClass86_Sub1_1.anInt2847 == 0) {
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
