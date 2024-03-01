package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abn")
public class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!abn", name = "sa", descriptor = "Lclient!ago;")
	public static Class3_Sub30 aClass3_Sub30_1;

	@OriginalMember(owner = "client!abn", name = "e", descriptor = "Lclient!abl;")
	Class21_Sub1 aClass21_Sub1_5;

	@OriginalMember(owner = "client!abn", name = "q", descriptor = "[I")
	int[] anIntArray42;

	@OriginalMember(owner = "client!abn", name = "m", descriptor = "[I")
	int[] anIntArray40;

	@OriginalMember(owner = "client!abn", name = "r", descriptor = "[[B")
	byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!abn", name = "v", descriptor = "[I")
	int[] anIntArray43;

	@OriginalMember(owner = "client!abn", name = "t", descriptor = "[I")
	int[] anIntArray44;

	@OriginalMember(owner = "client!abn", name = "d", descriptor = "[I")
	int[] anIntArray41;

	@OriginalMember(owner = "client!abn", name = "<init>", descriptor = "(Lclient!abl;Lclient!yx;[Lclient!abc;[I[I)V", line = 18)
	Class14_Sub5(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) Class15_Sub1[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass21_Sub1_5 = arg0;
		this.aClass21_Sub1_5 = arg0;
		this.anIntArray42 = arg3;
		this.anIntArray40 = arg4;
		this.aByteArrayArray5 = new byte[arg2.length][];
		this.anIntArray43 = new int[arg2.length];
		this.anIntArray44 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			this.aByteArrayArray5[local32] = arg2[local32].aByteArray1;
			this.anIntArray43[local32] = arg2[local32].anInt167;
			this.anIntArray44[local32] = arg2[local32].anInt166;
		}
		this.anIntArray41 = arg2[0].anIntArray26;
	}

	@OriginalMember(owner = "client!abn", name = "m", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method3298(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_5.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray44[arg0];
		arg2 += this.anIntArray43[arg0];
		@Pc(24) int local24 = this.anIntArray42[arg0];
		@Pc(29) int local29 = this.anIntArray40[arg0];
		@Pc(35) int local35 = this.aClass21_Sub1_5.anInt287 * -355627019;
		@Pc(41) int local41 = arg1 + arg2 * local35;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass21_Sub1_5.anInt273 * 1850088287) {
			local64 = this.aClass21_Sub1_5.anInt273 * 1850088287 - arg2;
			local29 -= local64;
			arg2 = this.aClass21_Sub1_5.anInt273 * 1850088287;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass21_Sub1_5.anInt274 * 2066290591) {
			local29 -= arg2 + local29 - this.aClass21_Sub1_5.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_5.anInt272 * 45613833) {
			local64 = this.aClass21_Sub1_5.anInt272 * 45613833 - arg1;
			local24 -= local64;
			arg1 = this.aClass21_Sub1_5.anInt272 * 45613833;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 + arg1 > this.aClass21_Sub1_5.anInt278 * -886740031) {
			local64 = arg1 + local24 - this.aClass21_Sub1_5.anInt278 * -886740031;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 <= 0 || local29 <= 0) {
			return;
		}
		if (arg4) {
			this.method3347(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		} else {
			this.method3341(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, this.anIntArray41, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!abn", name = "q", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method3306(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_5.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray44[arg0];
		arg2 += this.anIntArray43[arg0];
		@Pc(24) int local24 = this.anIntArray42[arg0];
		@Pc(29) int local29 = this.anIntArray40[arg0];
		@Pc(35) int local35 = this.aClass21_Sub1_5.anInt287 * -355627019;
		@Pc(41) int local41 = arg1 + arg2 * local35;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass21_Sub1_5.anInt273 * 1850088287) {
			local64 = this.aClass21_Sub1_5.anInt273 * 1850088287 - arg2;
			local29 -= local64;
			arg2 = this.aClass21_Sub1_5.anInt273 * 1850088287;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass21_Sub1_5.anInt274 * 2066290591) {
			local29 -= arg2 + local29 - this.aClass21_Sub1_5.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_5.anInt272 * 45613833) {
			local64 = this.aClass21_Sub1_5.anInt272 * 45613833 - arg1;
			local24 -= local64;
			arg1 = this.aClass21_Sub1_5.anInt272 * 45613833;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 + arg1 > this.aClass21_Sub1_5.anInt278 * -886740031) {
			local64 = arg1 + local24 - this.aClass21_Sub1_5.anInt278 * -886740031;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 <= 0 || local29 <= 0) {
			return;
		}
		if (arg4) {
			this.method3347(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		} else {
			this.method3341(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, this.anIntArray41, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!abn", name = "r", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method3295(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_5.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray44[arg0];
		arg2 += this.anIntArray43[arg0];
		@Pc(24) int local24 = this.anIntArray42[arg0];
		@Pc(29) int local29 = this.anIntArray40[arg0];
		@Pc(35) int local35 = this.aClass21_Sub1_5.anInt287 * -355627019;
		@Pc(41) int local41 = arg1 + arg2 * local35;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass21_Sub1_5.anInt273 * 1850088287) {
			local64 = this.aClass21_Sub1_5.anInt273 * 1850088287 - arg2;
			local29 -= local64;
			arg2 = this.aClass21_Sub1_5.anInt273 * 1850088287;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass21_Sub1_5.anInt274 * 2066290591) {
			local29 -= arg2 + local29 - this.aClass21_Sub1_5.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_5.anInt272 * 45613833) {
			local64 = this.aClass21_Sub1_5.anInt272 * 45613833 - arg1;
			local24 -= local64;
			arg1 = this.aClass21_Sub1_5.anInt272 * 45613833;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 + arg1 > this.aClass21_Sub1_5.anInt278 * -886740031) {
			local64 = arg1 + local24 - this.aClass21_Sub1_5.anInt278 * -886740031;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 <= 0 || local29 <= 0) {
			return;
		}
		if (arg4) {
			this.method3347(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		} else {
			this.method3341(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, this.anIntArray41, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!abn", name = "l", descriptor = "(II)Z", line = 70)
	public static boolean method3350(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!abn", name = "by", descriptor = "([B[I[IIIIIII)V", line = 74)
	void method3340(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			@Pc(18) int local18;
			for (local18 = local4; local18 < 0; local18++) {
				@Pc(26) byte local26;
				if ((local26 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local26 & 0xFF];
				}
				@Pc(44) byte local44;
				if ((local44 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local44 & 0xFF];
				}
				@Pc(62) byte local62;
				if ((local62 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local62 & 0xFF];
				}
				@Pc(80) byte local80;
				if ((local80 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local80 & 0xFF];
				}
			}
			for (local18 = local9; local18 < 0; local18++) {
				@Pc(104) byte local104;
				if ((local104 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local104 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abn", name = "bt", descriptor = "([B[I[IIIIIII)V", line = 74)
	void method3341(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			@Pc(18) int local18;
			for (local18 = local4; local18 < 0; local18++) {
				@Pc(26) byte local26;
				if ((local26 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local26 & 0xFF];
				}
				@Pc(44) byte local44;
				if ((local44 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local44 & 0xFF];
				}
				@Pc(62) byte local62;
				if ((local62 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local62 & 0xFF];
				}
				@Pc(80) byte local80;
				if ((local80 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local80 & 0xFF];
				}
			}
			for (local18 = local9; local18 < 0; local18++) {
				@Pc(104) byte local104;
				if ((local104 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local104 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abn", name = "bb", descriptor = "([B[I[IIIIIII)V", line = 74)
	void method3346(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			@Pc(18) int local18;
			for (local18 = local4; local18 < 0; local18++) {
				@Pc(26) byte local26;
				if ((local26 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local26 & 0xFF];
				}
				@Pc(44) byte local44;
				if ((local44 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local44 & 0xFF];
				}
				@Pc(62) byte local62;
				if ((local62 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local62 & 0xFF];
				}
				@Pc(80) byte local80;
				if ((local80 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local80 & 0xFF];
				}
			}
			for (local18 = local9; local18 < 0; local18++) {
				@Pc(104) byte local104;
				if ((local104 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local104 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abn", name = "bk", descriptor = "([B[IIIIIIII)V", line = 98)
	void method3347(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abn", name = "d", descriptor = "(CIIIZLclient!ch;II)V", line = 121)
	@Override
	void method3328(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_5.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray44[arg0];
		arg2 += this.anIntArray43[arg0];
		@Pc(33) int local33 = this.anIntArray42[arg0];
		@Pc(38) int local38 = this.anIntArray40[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_5.anInt287 * -355627019;
		@Pc(50) int local50 = arg2 * local44 + arg1;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_5.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_5.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_5.anInt273 * 1850088287;
			local58 += local33 * local73;
			local50 += local44 * local73;
		}
		if (local38 + arg2 > this.aClass21_Sub1_5.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_5.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_5.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_5.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_5.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_5.anInt278 * -886740031) {
			local73 = arg1 + local33 - this.aClass21_Sub1_5.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if (arg4) {
			this.method3344(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		} else {
			this.method3343(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, this.anIntArray41, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abn", name = "w", descriptor = "(CIIIZLclient!ch;II)V", line = 121)
	@Override
	void method3289(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_5.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray44[arg0];
		arg2 += this.anIntArray43[arg0];
		@Pc(33) int local33 = this.anIntArray42[arg0];
		@Pc(38) int local38 = this.anIntArray40[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_5.anInt287 * -355627019;
		@Pc(50) int local50 = arg2 * local44 + arg1;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_5.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_5.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_5.anInt273 * 1850088287;
			local58 += local33 * local73;
			local50 += local44 * local73;
		}
		if (local38 + arg2 > this.aClass21_Sub1_5.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_5.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_5.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_5.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_5.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_5.anInt278 * -886740031) {
			local73 = arg1 + local33 - this.aClass21_Sub1_5.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if (arg4) {
			this.method3344(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		} else {
			this.method3343(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, this.anIntArray41, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abn", name = "v", descriptor = "(CIIIZLclient!ch;II)V", line = 121)
	@Override
	void method3299(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_5.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray44[arg0];
		arg2 += this.anIntArray43[arg0];
		@Pc(33) int local33 = this.anIntArray42[arg0];
		@Pc(38) int local38 = this.anIntArray40[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_5.anInt287 * -355627019;
		@Pc(50) int local50 = arg2 * local44 + arg1;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_5.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_5.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_5.anInt273 * 1850088287;
			local58 += local33 * local73;
			local50 += local44 * local73;
		}
		if (local38 + arg2 > this.aClass21_Sub1_5.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_5.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_5.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_5.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_5.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_5.anInt278 * -886740031) {
			local73 = arg1 + local33 - this.aClass21_Sub1_5.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if (arg4) {
			this.method3344(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		} else {
			this.method3343(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, this.anIntArray41, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abn", name = "t", descriptor = "(CIIIZLclient!ch;II)V", line = 121)
	@Override
	void method3300(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_5.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray44[arg0];
		arg2 += this.anIntArray43[arg0];
		@Pc(33) int local33 = this.anIntArray42[arg0];
		@Pc(38) int local38 = this.anIntArray40[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_5.anInt287 * -355627019;
		@Pc(50) int local50 = arg2 * local44 + arg1;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_5.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_5.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_5.anInt273 * 1850088287;
			local58 += local33 * local73;
			local50 += local44 * local73;
		}
		if (local38 + arg2 > this.aClass21_Sub1_5.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_5.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_5.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_5.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_5.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_5.anInt278 * -886740031) {
			local73 = arg1 + local33 - this.aClass21_Sub1_5.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if (arg4) {
			this.method3344(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		} else {
			this.method3343(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, this.anIntArray41, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abn", name = "o", descriptor = "(CIIIZLclient!ch;II)V", line = 121)
	@Override
	void method3302(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_5.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray44[arg0];
		arg2 += this.anIntArray43[arg0];
		@Pc(33) int local33 = this.anIntArray42[arg0];
		@Pc(38) int local38 = this.anIntArray40[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_5.anInt287 * -355627019;
		@Pc(50) int local50 = arg2 * local44 + arg1;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_5.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_5.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_5.anInt273 * 1850088287;
			local58 += local33 * local73;
			local50 += local44 * local73;
		}
		if (local38 + arg2 > this.aClass21_Sub1_5.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_5.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_5.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_5.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_5.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_5.anInt278 * -886740031) {
			local73 = arg1 + local33 - this.aClass21_Sub1_5.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if (arg4) {
			this.method3344(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		} else {
			this.method3343(this.aByteArrayArray5[arg0], this.aClass21_Sub1_5.anIntArray39, this.anIntArray41, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray42[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abn", name = "bg", descriptor = "([B[I[IIIIIIIIIIILclient!ch;II)V", line = 164)
	void method3343(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class5 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg13;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg10 - this.aClass21_Sub1_5.anInt272 * 45613833;
		@Pc(18) int local18 = arg11;
		if (arg15 > arg11) {
			local18 = arg15;
			arg5 += (arg15 - arg11) * this.aClass21_Sub1_5.anInt287 * -355627019;
			arg4 += (arg15 - arg11) * arg12;
		}
		@Pc(60) int local60 = arg15 + local5.length < arg7 + arg11 ? local5.length + arg15 : arg11 + arg7;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = arg14 + local5[local64 - arg15];
			@Pc(81) int local81 = local8[local64 - arg15];
			@Pc(83) int local83 = arg6;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg4 += arg9 + arg6;
					arg5 += arg6 + arg8;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local16;
				if (local90 >= arg6) {
					arg4 += arg6 + arg9;
					arg5 += arg6 + arg8;
					continue;
				}
				arg4 += local90;
				local83 = arg6 - local90;
				arg5 += local90;
			}
			local90 = 0;
			if (local83 < local81) {
				local81 = local83;
			} else {
				local90 = local83 - local81;
			}
			for (@Pc(158) int local158 = -local81; local158 < 0; local158++) {
				@Pc(166) byte local166;
				if ((local166 = arg0[arg4++]) == 0) {
					arg5++;
				} else {
					arg1[arg5++] = arg2[local166 & 0xFF];
				}
			}
			arg4 += local90 + arg9;
			arg5 += arg8 + local90;
		}
	}

	@OriginalMember(owner = "client!abn", name = "bl", descriptor = "([B[I[IIIIIIIIIIILclient!ch;II)V", line = 164)
	void method3345(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class5 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_5.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass21_Sub1_5.anInt287 * -355627019;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = arg14 + local5.length < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = arg13 + local5[local64 - arg14];
			@Pc(81) int local81 = local8[local64 - arg14];
			@Pc(83) int local83 = arg5;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local16;
				if (local90 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local90;
				local83 = arg5 - local90;
				arg4 += local90;
			}
			local90 = 0;
			if (local83 < local81) {
				local81 = local83;
			} else {
				local90 = local83 - local81;
			}
			for (@Pc(158) int local158 = -local81; local158 < 0; local158++) {
				@Pc(166) byte local166;
				if ((local166 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[local166 & 0xFF];
				}
			}
			arg3 += local90 + arg8;
			arg4 += arg7 + local90;
		}
	}

	@OriginalMember(owner = "client!abn", name = "bu", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 213)
	void method3342(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_5.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * -355627019 * this.aClass21_Sub1_5.anInt287;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? arg14 + local5.length : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local88;
				local81 = arg5 - local88;
				arg4 += local88;
			}
			local88 = 0;
			if (local81 < local79) {
				local79 = local81;
			} else {
				local88 = local81 - local79;
			}
			for (@Pc(156) int local156 = -local79; local156 < 0; local156++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += local88 + arg3;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!abn", name = "br", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 213)
	void method3344(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_5.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * -355627019 * this.aClass21_Sub1_5.anInt287;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? arg14 + local5.length : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local88;
				local81 = arg5 - local88;
				arg4 += local88;
			}
			local88 = 0;
			if (local81 < local79) {
				local79 = local81;
			} else {
				local88 = local81 - local79;
			}
			for (@Pc(156) int local156 = -local79; local156 < 0; local156++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += local88 + arg3;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!abn", name = "bi", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 213)
	void method3348(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_5.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * -355627019 * this.aClass21_Sub1_5.anInt287;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? arg14 + local5.length : arg6 + arg10;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
					continue;
				}
				local79 -= local88;
			} else {
				local88 = local73 - local16;
				if (local88 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local88;
				local81 = arg5 - local88;
				arg4 += local88;
			}
			local88 = 0;
			if (local81 < local79) {
				local79 = local81;
			} else {
				local88 = local81 - local79;
			}
			for (@Pc(156) int local156 = -local79; local156 < 0; local156++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += local88 + arg3;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!abn", name = "mo", descriptor = "(Lclient!vs;B)V", line = 6411)
	static final void method3349(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class460.method28580(local16, local22, arg0);
	}
}
