package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afu")
public class Class94_Sub6 extends Class94 {

	@OriginalMember(owner = "client!afu", name = "j", descriptor = "Lclient!aeh;")
	Class86_Sub2 aClass86_Sub2_8;

	@OriginalMember(owner = "client!afu", name = "u", descriptor = "[I")
	int[] anIntArray101;

	@OriginalMember(owner = "client!afu", name = "e", descriptor = "[I")
	int[] anIntArray102;

	@OriginalMember(owner = "client!afu", name = "i", descriptor = "[[B")
	byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!afu", name = "f", descriptor = "[I")
	int[] anIntArray100;

	@OriginalMember(owner = "client!afu", name = "o", descriptor = "[I")
	int[] anIntArray99;

	@OriginalMember(owner = "client!afu", name = "k", descriptor = "[I")
	int[] anIntArray98;

	@OriginalMember(owner = "client!afu", name = "<init>", descriptor = "(Lclient!aeh;Lclient!aar;[Lclient!aew;[I[I)V", line = 18)
	Class94_Sub6(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class89_Sub2[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass86_Sub2_8 = arg0;
		this.aClass86_Sub2_8 = arg0;
		this.anIntArray101 = arg3;
		this.anIntArray102 = arg4;
		this.aByteArrayArray10 = new byte[arg2.length][];
		this.anIntArray100 = new int[arg2.length];
		this.anIntArray99 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			this.aByteArrayArray10[local32] = arg2[local32].aByteArray16;
			this.anIntArray100[local32] = arg2[local32].anInt764;
			this.anIntArray99[local32] = arg2[local32].anInt763;
		}
		this.anIntArray98 = arg2[0].anIntArray69;
	}

	@OriginalMember(owner = "client!afu", name = "i", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method7660(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_8.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray99[arg0];
		arg2 += this.anIntArray100[arg0];
		@Pc(23) int local23 = this.anIntArray101[arg0];
		@Pc(28) int local28 = this.anIntArray102[arg0];
		@Pc(34) int local34 = this.aClass86_Sub2_8.anInt547 * 356365251;
		@Pc(40) int local40 = arg1 + arg2 * local34;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass86_Sub2_8.anInt541 * 9823353) {
			local63 = this.aClass86_Sub2_8.anInt541 * 9823353 - arg2;
			local28 -= local63;
			arg2 = this.aClass86_Sub2_8.anInt541 * 9823353;
			local48 += local23 * local63;
			local40 += local63 * local34;
		}
		if (local28 + arg2 > this.aClass86_Sub2_8.anInt542 * 639238427) {
			local28 -= local28 + arg2 - this.aClass86_Sub2_8.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_8.anInt553 * 1709859847) {
			local63 = this.aClass86_Sub2_8.anInt553 * 1709859847 - arg1;
			local23 -= local63;
			arg1 = this.aClass86_Sub2_8.anInt553 * 1709859847;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 + arg1 > this.aClass86_Sub2_8.anInt540 * -1807368365) {
			local63 = local23 + arg1 - this.aClass86_Sub2_8.anInt540 * -1807368365;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 <= 0 || local28 <= 0) {
			return;
		}
		if (arg4) {
			this.method7666(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		} else {
			this.method7662(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, this.anIntArray98, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!afu", name = "u", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method7656(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_8.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray99[arg0];
		arg2 += this.anIntArray100[arg0];
		@Pc(23) int local23 = this.anIntArray101[arg0];
		@Pc(28) int local28 = this.anIntArray102[arg0];
		@Pc(34) int local34 = this.aClass86_Sub2_8.anInt547 * 356365251;
		@Pc(40) int local40 = arg1 + arg2 * local34;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass86_Sub2_8.anInt541 * 9823353) {
			local63 = this.aClass86_Sub2_8.anInt541 * 9823353 - arg2;
			local28 -= local63;
			arg2 = this.aClass86_Sub2_8.anInt541 * 9823353;
			local48 += local23 * local63;
			local40 += local63 * local34;
		}
		if (local28 + arg2 > this.aClass86_Sub2_8.anInt542 * 639238427) {
			local28 -= local28 + arg2 - this.aClass86_Sub2_8.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_8.anInt553 * 1709859847) {
			local63 = this.aClass86_Sub2_8.anInt553 * 1709859847 - arg1;
			local23 -= local63;
			arg1 = this.aClass86_Sub2_8.anInt553 * 1709859847;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 + arg1 > this.aClass86_Sub2_8.anInt540 * -1807368365) {
			local63 = local23 + arg1 - this.aClass86_Sub2_8.anInt540 * -1807368365;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 <= 0 || local28 <= 0) {
			return;
		}
		if (arg4) {
			this.method7666(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		} else {
			this.method7662(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, this.anIntArray98, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!afu", name = "e", descriptor = "(CIIIZ)V", line = 35)
	@Override
	void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_8.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray99[arg0];
		arg2 += this.anIntArray100[arg0];
		@Pc(23) int local23 = this.anIntArray101[arg0];
		@Pc(28) int local28 = this.anIntArray102[arg0];
		@Pc(34) int local34 = this.aClass86_Sub2_8.anInt547 * 356365251;
		@Pc(40) int local40 = arg1 + arg2 * local34;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass86_Sub2_8.anInt541 * 9823353) {
			local63 = this.aClass86_Sub2_8.anInt541 * 9823353 - arg2;
			local28 -= local63;
			arg2 = this.aClass86_Sub2_8.anInt541 * 9823353;
			local48 += local23 * local63;
			local40 += local63 * local34;
		}
		if (local28 + arg2 > this.aClass86_Sub2_8.anInt542 * 639238427) {
			local28 -= local28 + arg2 - this.aClass86_Sub2_8.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_8.anInt553 * 1709859847) {
			local63 = this.aClass86_Sub2_8.anInt553 * 1709859847 - arg1;
			local23 -= local63;
			arg1 = this.aClass86_Sub2_8.anInt553 * 1709859847;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 + arg1 > this.aClass86_Sub2_8.anInt540 * -1807368365) {
			local63 = local23 + arg1 - this.aClass86_Sub2_8.anInt540 * -1807368365;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 <= 0 || local28 <= 0) {
			return;
		}
		if (arg4) {
			this.method7666(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		} else {
			this.method7662(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, this.anIntArray98, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!afu", name = "bj", descriptor = "([B[I[IIIIIII)V", line = 74)
	void method7662(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		@Pc(11) boolean local11 = false;
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

	@OriginalMember(owner = "client!afu", name = "by", descriptor = "([B[I[IIIIIII)V", line = 74)
	void method7663(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		@Pc(11) boolean local11 = false;
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

	@OriginalMember(owner = "client!afu", name = "bd", descriptor = "([B[I[IIIIIII)V", line = 74)
	void method7664(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		@Pc(11) boolean local11 = false;
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

	@OriginalMember(owner = "client!afu", name = "bb", descriptor = "([B[I[IIIIIII)V", line = 74)
	void method7665(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		@Pc(11) boolean local11 = false;
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

	@OriginalMember(owner = "client!afu", name = "bv", descriptor = "([B[IIIIIIII)V", line = 98)
	void method7666(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afu", name = "bx", descriptor = "([B[IIIIIIII)V", line = 98)
	void method7667(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afu", name = "bw", descriptor = "([B[IIIIIIII)V", line = 98)
	void method7668(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afu", name = "bi", descriptor = "([B[IIIIIIII)V", line = 98)
	void method7669(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afu", name = "f", descriptor = "(CIIIZLclient!cd;II)V", line = 121)
	@Override
	void method7658(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_8.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray99[arg0];
		arg2 += this.anIntArray100[arg0];
		@Pc(35) int local35 = this.anIntArray101[arg0];
		@Pc(40) int local40 = this.anIntArray102[arg0];
		@Pc(46) int local46 = this.aClass86_Sub2_8.anInt547 * 356365251;
		@Pc(52) int local52 = arg1 + local46 * arg2;
		@Pc(56) int local56 = local46 - local35;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(75) int local75;
		if (arg2 < this.aClass86_Sub2_8.anInt541 * 9823353) {
			local75 = this.aClass86_Sub2_8.anInt541 * 9823353 - arg2;
			local40 -= local75;
			arg2 = this.aClass86_Sub2_8.anInt541 * 9823353;
			local60 += local35 * local75;
			local52 += local75 * local46;
		}
		if (arg2 + local40 > this.aClass86_Sub2_8.anInt542 * 639238427) {
			local40 -= local40 + arg2 - this.aClass86_Sub2_8.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_8.anInt553 * 1709859847) {
			local75 = this.aClass86_Sub2_8.anInt553 * 1709859847 - arg1;
			local35 -= local75;
			arg1 = this.aClass86_Sub2_8.anInt553 * 1709859847;
			local60 += local75;
			local52 += local75;
			local58 += local75;
			local56 += local75;
		}
		if (local35 + arg1 > this.aClass86_Sub2_8.anInt540 * -1807368365) {
			local75 = local35 + arg1 - this.aClass86_Sub2_8.anInt540 * -1807368365;
			local35 -= local75;
			local58 += local75;
			local56 += local75;
		}
		if (local35 <= 0 || local40 <= 0) {
			return;
		}
		if (arg4) {
			this.method7672(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, arg3, local60, local52, local35, local40, local56, local58, arg1, arg2, this.anIntArray101[arg0], arg5, arg6, arg7);
		} else {
			this.method7670(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, this.anIntArray98, arg3, local60, local52, local35, local40, local56, local58, arg1, arg2, this.anIntArray101[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afu", name = "k", descriptor = "(CIIIZLclient!cd;II)V", line = 121)
	@Override
	void method7661(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_8.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray99[arg0];
		arg2 += this.anIntArray100[arg0];
		@Pc(35) int local35 = this.anIntArray101[arg0];
		@Pc(40) int local40 = this.anIntArray102[arg0];
		@Pc(46) int local46 = this.aClass86_Sub2_8.anInt547 * 356365251;
		@Pc(52) int local52 = arg1 + local46 * arg2;
		@Pc(56) int local56 = local46 - local35;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(75) int local75;
		if (arg2 < this.aClass86_Sub2_8.anInt541 * 9823353) {
			local75 = this.aClass86_Sub2_8.anInt541 * 9823353 - arg2;
			local40 -= local75;
			arg2 = this.aClass86_Sub2_8.anInt541 * 9823353;
			local60 += local35 * local75;
			local52 += local75 * local46;
		}
		if (arg2 + local40 > this.aClass86_Sub2_8.anInt542 * 639238427) {
			local40 -= local40 + arg2 - this.aClass86_Sub2_8.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_8.anInt553 * 1709859847) {
			local75 = this.aClass86_Sub2_8.anInt553 * 1709859847 - arg1;
			local35 -= local75;
			arg1 = this.aClass86_Sub2_8.anInt553 * 1709859847;
			local60 += local75;
			local52 += local75;
			local58 += local75;
			local56 += local75;
		}
		if (local35 + arg1 > this.aClass86_Sub2_8.anInt540 * -1807368365) {
			local75 = local35 + arg1 - this.aClass86_Sub2_8.anInt540 * -1807368365;
			local35 -= local75;
			local58 += local75;
			local56 += local75;
		}
		if (local35 <= 0 || local40 <= 0) {
			return;
		}
		if (arg4) {
			this.method7672(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, arg3, local60, local52, local35, local40, local56, local58, arg1, arg2, this.anIntArray101[arg0], arg5, arg6, arg7);
		} else {
			this.method7670(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, this.anIntArray98, arg3, local60, local52, local35, local40, local56, local58, arg1, arg2, this.anIntArray101[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afu", name = "o", descriptor = "(CIIIZLclient!cd;II)V", line = 121)
	@Override
	void method7659(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_8.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray99[arg0];
		arg2 += this.anIntArray100[arg0];
		@Pc(35) int local35 = this.anIntArray101[arg0];
		@Pc(40) int local40 = this.anIntArray102[arg0];
		@Pc(46) int local46 = this.aClass86_Sub2_8.anInt547 * 356365251;
		@Pc(52) int local52 = arg1 + local46 * arg2;
		@Pc(56) int local56 = local46 - local35;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(75) int local75;
		if (arg2 < this.aClass86_Sub2_8.anInt541 * 9823353) {
			local75 = this.aClass86_Sub2_8.anInt541 * 9823353 - arg2;
			local40 -= local75;
			arg2 = this.aClass86_Sub2_8.anInt541 * 9823353;
			local60 += local35 * local75;
			local52 += local75 * local46;
		}
		if (arg2 + local40 > this.aClass86_Sub2_8.anInt542 * 639238427) {
			local40 -= local40 + arg2 - this.aClass86_Sub2_8.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_8.anInt553 * 1709859847) {
			local75 = this.aClass86_Sub2_8.anInt553 * 1709859847 - arg1;
			local35 -= local75;
			arg1 = this.aClass86_Sub2_8.anInt553 * 1709859847;
			local60 += local75;
			local52 += local75;
			local58 += local75;
			local56 += local75;
		}
		if (local35 + arg1 > this.aClass86_Sub2_8.anInt540 * -1807368365) {
			local75 = local35 + arg1 - this.aClass86_Sub2_8.anInt540 * -1807368365;
			local35 -= local75;
			local58 += local75;
			local56 += local75;
		}
		if (local35 <= 0 || local40 <= 0) {
			return;
		}
		if (arg4) {
			this.method7672(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, arg3, local60, local52, local35, local40, local56, local58, arg1, arg2, this.anIntArray101[arg0], arg5, arg6, arg7);
		} else {
			this.method7670(this.aByteArrayArray10[arg0], this.aClass86_Sub2_8.anIntArray39, this.anIntArray98, arg3, local60, local52, local35, local40, local56, local58, arg1, arg2, this.anIntArray101[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afu", name = "ba", descriptor = "([B[I[IIIIIIIIIIILclient!cd;II)V", line = 164)
	void method7670(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class90 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg13;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg10 - this.aClass86_Sub2_8.anInt553 * 1709859847;
		@Pc(18) int local18 = arg11;
		if (arg15 > arg11) {
			local18 = arg15;
			arg5 += (arg15 - arg11) * 356365251 * this.aClass86_Sub2_8.anInt547;
			arg4 += (arg15 - arg11) * arg12;
		}
		@Pc(60) int local60 = local5.length + arg15 < arg7 + arg11 ? local5.length + arg15 : arg11 + arg7;
		@Pc(62) boolean local62 = false;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = local5[local64 - arg15] + arg14;
			@Pc(81) int local81 = local8[local64 - arg15];
			@Pc(83) int local83 = arg6;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg4 += arg6 + arg9;
					arg5 += arg6 + arg8;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local16;
				if (local90 >= arg6) {
					arg4 += arg6 + arg9;
					arg5 += arg8 + arg6;
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

	@OriginalMember(owner = "client!afu", name = "bg", descriptor = "([B[I[IIIIIIIIIIILclient!cd;II)V", line = 164)
	void method7671(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class90 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_8.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 356365251 * this.aClass86_Sub2_8.anInt547;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		@Pc(62) boolean local62 = false;
		for (@Pc(64) int local64 = local18; local64 < local60; local64++) {
			@Pc(75) int local75 = local5[local64 - arg14] + arg13;
			@Pc(81) int local81 = local8[local64 - arg14];
			@Pc(83) int local83 = arg5;
			@Pc(90) int local90;
			if (local16 > local75) {
				local90 = local16 - local75;
				if (local90 >= local81) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local81 -= local90;
			} else {
				local90 = local75 - local16;
				if (local90 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
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

	@OriginalMember(owner = "client!afu", name = "bl", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 213)
	void method7672(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_8.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass86_Sub2_8.anInt547 * 356365251;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
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
					arg4 += arg5 + arg7;
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

	@OriginalMember(owner = "client!afu", name = "bs", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 213)
	void method7673(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_8.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass86_Sub2_8.anInt547 * 356365251;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg10 + arg6;
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
					arg4 += arg5 + arg7;
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

	@OriginalMember(owner = "client!afu", name = "ot", descriptor = "(Lclient!yf;I)V", line = 7156)
	static final void method7674(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class341.method27764(local11, local14, arg0);
	}
}
