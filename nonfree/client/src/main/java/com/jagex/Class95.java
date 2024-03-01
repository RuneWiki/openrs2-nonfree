package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public class Class95 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
	static final int anInt2947 = 128;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
	static final int anInt2950 = 7;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "Z")
	boolean aBoolean536 = true;

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
	int anInt2945 = -1;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_39;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "Lclient!bv;")
	final Class102 aClass102_2;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
	final int anInt2946;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	final int anInt2948;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
	final int anInt2949;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!cq;")
	Interface7 anInterface7_4;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "Lclient!aau;")
	Class9_Sub2 aClass9_Sub2_2;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "Lclient!aab;")
	Class4_Sub1 aClass4_Sub1_5;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!abt;Lclient!bv;Lclient!abh;IIIII)V", line = 21)
	Class95(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class17_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass21_Sub2_39 = arg0;
		this.aClass102_2 = arg1;
		this.anInt2946 = arg6;
		this.anInt2948 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local49 = (local33 + local35) * arg2.anInt339 * -1007974723 + local29;
			for (local51 = 0; local51 < local23; local51++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray1[local49++];
				if (local60 != null) {
					local25 += local60.length;
				}
			}
		}
		this.anInt2949 = local25;
		if (local25 > 0) {
			@Pc(83) Class3_Sub41 local83 = new Class3_Sub41(local25 * 2);
			@Pc(114) short[] local114;
			@Pc(118) int local118;
			@Pc(105) int local105;
			if (this.aClass21_Sub2_39.aBoolean63) {
				for (local49 = 0; local49 < local23; local49++) {
					local51 = (local33 + local49) * arg2.anInt339 * -1007974723 + local29;
					for (local105 = 0; local105 < local23; local105++) {
						local114 = arg2.aShortArrayArray1[local51++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local83.method20251(local114[local118] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local49 = 0; local49 < local23; local49++) {
					local51 = (local33 + local49) * arg2.anInt339 * -1007974723 + local29;
					for (local105 = 0; local105 < local23; local105++) {
						local114 = arg2.aShortArrayArray1[local51++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local83.method20442(local114[local118] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface7_4 = this.aClass21_Sub2_39.method4060(5123, local83.aByteArray51, local83.anInt2803 * 62066237, false);
			this.aClass9_Sub2_2 = new Class9_Sub2(this.aClass21_Sub2_39, 5123, null, 1);
		} else {
			this.aClass4_Sub1_5 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "()V", line = 69)
	void method21791() {
		this.method21793(this.anInterface7_4, this.anInt2949);
	}

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "()V", line = 69)
	void method21795() {
		this.method21793(this.anInterface7_4, this.anInt2949);
	}

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "()V", line = 69)
	void method21796() {
		this.method21793(this.anInterface7_4, this.anInt2949);
	}

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "()V", line = 69)
	void method21799() {
		this.method21793(this.anInterface7_4, this.anInt2949);
	}

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "([BI)V", line = 73)
	void method21790(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass9_Sub2_2.method1122(arg0, arg1 * 2);
		this.method21793(this.aClass9_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([BI)V", line = 73)
	void method21792(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass9_Sub2_2.method1122(arg0, arg1 * 2);
		this.method21793(this.aClass9_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "([BI)V", line = 73)
	void method21797(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass9_Sub2_2.method1122(arg0, arg1 * 2);
		this.method21793(this.aClass9_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "(Lclient!cq;I)V", line = 78)
	void method21793(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method21794();
			this.aClass21_Sub2_39.method4074(this.aClass4_Sub1_5);
			this.aClass21_Sub2_39.method4066(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lclient!cq;I)V", line = 78)
	void method21798(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method21794();
			this.aClass21_Sub2_39.method4074(this.aClass4_Sub1_5);
			this.aClass21_Sub2_39.method4066(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(Lclient!cq;I)V", line = 78)
	void method21800(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method21794();
			this.aClass21_Sub2_39.method4074(this.aClass4_Sub1_5);
			this.aClass21_Sub2_39.method4066(arg0, 4, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "()V", line = 85)
	void method21794() {
		if (!this.aBoolean536) {
			return;
		}
		this.aBoolean536 = false;
		@Pc(10) byte[] local10 = this.aClass102_2.aByteArray56;
		@Pc(14) byte[] local14 = this.aClass21_Sub2_39.aByteArray6;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass102_2.anInt2968;
		@Pc(30) int local30 = this.anInt2946 + this.anInt2948 * this.aClass102_2.anInt2968;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass4_Sub1_5 != null && this.anInt2945 == local16) {
			this.aBoolean536 = false;
			return;
		}
		this.anInt2945 = local16;
		local32 = 0;
		local30 = this.anInt2946 + this.anInt2948 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass102_2.anInt2968 - 128;
		}
		if (this.aClass4_Sub1_5 == null) {
			this.aClass4_Sub1_5 = new Class4_Sub1(this.aClass21_Sub2_39, 3553, Class121.aClass121_23, Class127.aClass127_23, 128, 128, false, this.aClass21_Sub2_39.aByteArray6, Class121.aClass121_23, false);
			this.aClass4_Sub1_5.method14074(false, false);
			this.aClass4_Sub1_5.method33712(true);
		} else {
			this.aClass4_Sub1_5.method14072(0, 0, 128, 128, this.aClass21_Sub2_39.aByteArray6, Class121.aClass121_23, 0, 0, false);
		}
	}

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "()V", line = 85)
	void method21801() {
		if (!this.aBoolean536) {
			return;
		}
		this.aBoolean536 = false;
		@Pc(10) byte[] local10 = this.aClass102_2.aByteArray56;
		@Pc(14) byte[] local14 = this.aClass21_Sub2_39.aByteArray6;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = this.aClass102_2.anInt2968;
		@Pc(30) int local30 = this.anInt2946 + this.anInt2948 * this.aClass102_2.anInt2968;
		@Pc(32) int local32;
		@Pc(42) int local42;
		for (local32 = -128; local32 < 0; local32++) {
			local16 = (local16 << 8) - local16;
			for (local42 = -128; local42 < 0; local42++) {
				if (local10[local30++] != 0) {
					local16++;
				}
			}
			local30 += local20 - 128;
		}
		if (this.aClass4_Sub1_5 != null && this.anInt2945 == local16) {
			this.aBoolean536 = false;
			return;
		}
		this.anInt2945 = local16;
		local32 = 0;
		local30 = this.anInt2946 + this.anInt2948 * local20;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(90) int local90 = -128; local90 < 0; local90++) {
				if (local10[local30] == 0) {
					@Pc(104) int local104 = 0;
					if (local10[local30 - 1] != 0) {
						local104++;
					}
					if (local10[local30 + 1] != 0) {
						local104++;
					}
					if (local10[local30 - local20] != 0) {
						local104++;
					}
					if (local10[local30 + local20] != 0) {
						local104++;
					}
					local14[local32++] = (byte) (local104 * 17);
				} else {
					local14[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass102_2.anInt2968 - 128;
		}
		if (this.aClass4_Sub1_5 == null) {
			this.aClass4_Sub1_5 = new Class4_Sub1(this.aClass21_Sub2_39, 3553, Class121.aClass121_23, Class127.aClass127_23, 128, 128, false, this.aClass21_Sub2_39.aByteArray6, Class121.aClass121_23, false);
			this.aClass4_Sub1_5.method14074(false, false);
			this.aClass4_Sub1_5.method33712(true);
		} else {
			this.aClass4_Sub1_5.method14072(0, 0, 128, 128, this.aClass21_Sub2_39.aByteArray6, Class121.aClass121_23, 0, 0, false);
		}
	}
}
