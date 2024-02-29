package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aft")
public class Class94_Sub5 extends Class94 {

	@OriginalMember(owner = "client!aft", name = "j", descriptor = "Lclient!aeh;")
	Class86_Sub2 aClass86_Sub2_7;

	@OriginalMember(owner = "client!aft", name = "k", descriptor = "[I")
	int[] anIntArray95;

	@OriginalMember(owner = "client!aft", name = "u", descriptor = "[I")
	int[] anIntArray97;

	@OriginalMember(owner = "client!aft", name = "i", descriptor = "[[B")
	byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!aft", name = "e", descriptor = "[I")
	int[] anIntArray96;

	@OriginalMember(owner = "client!aft", name = "f", descriptor = "[I")
	int[] anIntArray94;

	@OriginalMember(owner = "client!aft", name = "<init>", descriptor = "(Lclient!aeh;Lclient!aar;[Lclient!aew;[I[I)V", line = 17)
	Class94_Sub5(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class89_Sub2[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass86_Sub2_7 = arg0;
		this.aClass86_Sub2_7 = arg0;
		this.anIntArray95 = arg3;
		this.anIntArray97 = arg4;
		this.aByteArrayArray9 = new byte[arg2.length][];
		this.anIntArray96 = new int[arg2.length];
		this.anIntArray94 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			@Pc(40) Class89_Sub2 local40 = arg2[local32];
			if (local40.aByteArray15 == null) {
				@Pc(53) byte[] local53 = local40.aByteArray16;
				@Pc(62) byte[] local62 = this.aByteArrayArray9[local32] = new byte[local53.length];
				for (@Pc(64) int local64 = 0; local64 < local53.length; local64++) {
					local62[local64] = (byte) (local53[local64] == 0 ? 0 : -1);
				}
			} else {
				this.aByteArrayArray9[local32] = local40.aByteArray15;
			}
			this.anIntArray96[local32] = local40.anInt764;
			this.anIntArray94[local32] = local40.anInt763;
		}
	}

	@OriginalMember(owner = "client!aft", name = "<init>", descriptor = "(Lclient!aeh;Lclient!aar;[Lclient!aej;[I[I)V", line = 40)
	Class94_Sub5(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class89_Sub1[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass86_Sub2_7 = arg0;
		this.aClass86_Sub2_7 = arg0;
		this.anIntArray95 = arg3;
		this.anIntArray97 = arg4;
		this.aByteArrayArray9 = new byte[arg2.length][];
		this.anIntArray96 = new int[arg2.length];
		this.anIntArray94 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			@Pc(40) Class89_Sub1 local40 = arg2[local32];
			@Pc(44) int[] local44 = local40.method6686(false);
			@Pc(53) byte[] local53 = this.aByteArrayArray9[local32] = new byte[local44.length];
			for (@Pc(55) int local55 = 0; local55 < local44.length; local55++) {
				local53[local55] = (byte) (local44[local55] >> 24 & 0xFF);
			}
			this.anIntArray96[local32] = local40.method6701();
			this.anIntArray94[local32] = local40.method6684();
		}
	}

	@OriginalMember(owner = "client!aft", name = "u", descriptor = "(CIIIZ)V", line = 59)
	@Override
	void method7656(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_7.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray94[arg0];
		arg2 += this.anIntArray96[arg0];
		@Pc(24) int local24 = this.anIntArray95[arg0];
		@Pc(29) int local29 = this.anIntArray97[arg0];
		@Pc(35) int local35 = this.aClass86_Sub2_7.anInt547 * 356365251;
		@Pc(41) int local41 = arg1 + arg2 * local35;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass86_Sub2_7.anInt541 * 9823353) {
			local64 = this.aClass86_Sub2_7.anInt541 * 9823353 - arg2;
			local29 -= local64;
			arg2 = this.aClass86_Sub2_7.anInt541 * 9823353;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass86_Sub2_7.anInt542 * 639238427) {
			local29 -= local29 + arg2 - this.aClass86_Sub2_7.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_7.anInt553 * 1709859847) {
			local64 = this.aClass86_Sub2_7.anInt553 * 1709859847 - arg1;
			local24 -= local64;
			arg1 = this.aClass86_Sub2_7.anInt553 * 1709859847;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (arg1 + local24 > this.aClass86_Sub2_7.anInt540 * -1807368365) {
			local64 = arg1 + local24 - this.aClass86_Sub2_7.anInt540 * -1807368365;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 > 0 && local29 > 0) {
			this.method7594(this.aByteArrayArray9[arg0], this.aClass86_Sub2_7.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!aft", name = "i", descriptor = "(CIIIZ)V", line = 59)
	@Override
	void method7660(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_7.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray94[arg0];
		arg2 += this.anIntArray96[arg0];
		@Pc(24) int local24 = this.anIntArray95[arg0];
		@Pc(29) int local29 = this.anIntArray97[arg0];
		@Pc(35) int local35 = this.aClass86_Sub2_7.anInt547 * 356365251;
		@Pc(41) int local41 = arg1 + arg2 * local35;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass86_Sub2_7.anInt541 * 9823353) {
			local64 = this.aClass86_Sub2_7.anInt541 * 9823353 - arg2;
			local29 -= local64;
			arg2 = this.aClass86_Sub2_7.anInt541 * 9823353;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass86_Sub2_7.anInt542 * 639238427) {
			local29 -= local29 + arg2 - this.aClass86_Sub2_7.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_7.anInt553 * 1709859847) {
			local64 = this.aClass86_Sub2_7.anInt553 * 1709859847 - arg1;
			local24 -= local64;
			arg1 = this.aClass86_Sub2_7.anInt553 * 1709859847;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (arg1 + local24 > this.aClass86_Sub2_7.anInt540 * -1807368365) {
			local64 = arg1 + local24 - this.aClass86_Sub2_7.anInt540 * -1807368365;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 > 0 && local29 > 0) {
			this.method7594(this.aByteArrayArray9[arg0], this.aClass86_Sub2_7.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!aft", name = "e", descriptor = "(CIIIZ)V", line = 59)
	@Override
	void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_7.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray94[arg0];
		arg2 += this.anIntArray96[arg0];
		@Pc(24) int local24 = this.anIntArray95[arg0];
		@Pc(29) int local29 = this.anIntArray97[arg0];
		@Pc(35) int local35 = this.aClass86_Sub2_7.anInt547 * 356365251;
		@Pc(41) int local41 = arg1 + arg2 * local35;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass86_Sub2_7.anInt541 * 9823353) {
			local64 = this.aClass86_Sub2_7.anInt541 * 9823353 - arg2;
			local29 -= local64;
			arg2 = this.aClass86_Sub2_7.anInt541 * 9823353;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass86_Sub2_7.anInt542 * 639238427) {
			local29 -= local29 + arg2 - this.aClass86_Sub2_7.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_7.anInt553 * 1709859847) {
			local64 = this.aClass86_Sub2_7.anInt553 * 1709859847 - arg1;
			local24 -= local64;
			arg1 = this.aClass86_Sub2_7.anInt553 * 1709859847;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (arg1 + local24 > this.aClass86_Sub2_7.anInt540 * -1807368365) {
			local64 = arg1 + local24 - this.aClass86_Sub2_7.anInt540 * -1807368365;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 > 0 && local29 > 0) {
			this.method7594(this.aByteArrayArray9[arg0], this.aClass86_Sub2_7.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!aft", name = "bj", descriptor = "([B[IIIIIIII)V", line = 97)
	void method7594(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(37) int local37 = (local16 * (arg2 & 0xFF00) & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(45) int local45 = arg1[arg4];
					arg1[arg4++] = local37 + ((local16 * (local45 & 0xFF00) & 0xFF0000) + (local16 * (local45 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!aft", name = "ba", descriptor = "([B[IIIIIIII)V", line = 97)
	void method7595(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(37) int local37 = (local16 * (arg2 & 0xFF00) & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(45) int local45 = arg1[arg4];
					arg1[arg4++] = local37 + ((local16 * (local45 & 0xFF00) & 0xFF0000) + (local16 * (local45 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!aft", name = "bl", descriptor = "([B[IIIIIIII)V", line = 97)
	void method7596(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(37) int local37 = (local16 * (arg2 & 0xFF00) & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(45) int local45 = arg1[arg4];
					arg1[arg4++] = local37 + ((local16 * (local45 & 0xFF00) & 0xFF0000) + (local16 * (local45 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!aft", name = "k", descriptor = "(CIIIZLclient!cd;II)V", line = 114)
	@Override
	void method7661(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_7.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray94[arg0];
		arg2 += this.anIntArray96[arg0];
		@Pc(34) int local34 = this.anIntArray95[arg0];
		@Pc(39) int local39 = this.anIntArray97[arg0];
		@Pc(45) int local45 = this.aClass86_Sub2_7.anInt547 * 356365251;
		@Pc(51) int local51 = arg1 + arg2 * local45;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass86_Sub2_7.anInt541 * 9823353) {
			local74 = this.aClass86_Sub2_7.anInt541 * 9823353 - arg2;
			local39 -= local74;
			arg2 = this.aClass86_Sub2_7.anInt541 * 9823353;
			local59 += local74 * local34;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass86_Sub2_7.anInt542 * 639238427) {
			local39 -= local39 + arg2 - this.aClass86_Sub2_7.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_7.anInt553 * 1709859847) {
			local74 = this.aClass86_Sub2_7.anInt553 * 1709859847 - arg1;
			local34 -= local74;
			arg1 = this.aClass86_Sub2_7.anInt553 * 1709859847;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass86_Sub2_7.anInt540 * -1807368365) {
			local74 = arg1 + local34 - this.aClass86_Sub2_7.anInt540 * -1807368365;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 > 0 && local39 > 0) {
			this.method7597(this.aByteArrayArray9[arg0], this.aClass86_Sub2_7.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray95[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!aft", name = "f", descriptor = "(CIIIZLclient!cd;II)V", line = 114)
	@Override
	void method7658(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_7.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray94[arg0];
		arg2 += this.anIntArray96[arg0];
		@Pc(34) int local34 = this.anIntArray95[arg0];
		@Pc(39) int local39 = this.anIntArray97[arg0];
		@Pc(45) int local45 = this.aClass86_Sub2_7.anInt547 * 356365251;
		@Pc(51) int local51 = arg1 + arg2 * local45;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass86_Sub2_7.anInt541 * 9823353) {
			local74 = this.aClass86_Sub2_7.anInt541 * 9823353 - arg2;
			local39 -= local74;
			arg2 = this.aClass86_Sub2_7.anInt541 * 9823353;
			local59 += local74 * local34;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass86_Sub2_7.anInt542 * 639238427) {
			local39 -= local39 + arg2 - this.aClass86_Sub2_7.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_7.anInt553 * 1709859847) {
			local74 = this.aClass86_Sub2_7.anInt553 * 1709859847 - arg1;
			local34 -= local74;
			arg1 = this.aClass86_Sub2_7.anInt553 * 1709859847;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass86_Sub2_7.anInt540 * -1807368365) {
			local74 = arg1 + local34 - this.aClass86_Sub2_7.anInt540 * -1807368365;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 > 0 && local39 > 0) {
			this.method7597(this.aByteArrayArray9[arg0], this.aClass86_Sub2_7.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray95[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!aft", name = "o", descriptor = "(CIIIZLclient!cd;II)V", line = 114)
	@Override
	void method7659(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_7.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray94[arg0];
		arg2 += this.anIntArray96[arg0];
		@Pc(34) int local34 = this.anIntArray95[arg0];
		@Pc(39) int local39 = this.anIntArray97[arg0];
		@Pc(45) int local45 = this.aClass86_Sub2_7.anInt547 * 356365251;
		@Pc(51) int local51 = arg1 + arg2 * local45;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass86_Sub2_7.anInt541 * 9823353) {
			local74 = this.aClass86_Sub2_7.anInt541 * 9823353 - arg2;
			local39 -= local74;
			arg2 = this.aClass86_Sub2_7.anInt541 * 9823353;
			local59 += local74 * local34;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass86_Sub2_7.anInt542 * 639238427) {
			local39 -= local39 + arg2 - this.aClass86_Sub2_7.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_7.anInt553 * 1709859847) {
			local74 = this.aClass86_Sub2_7.anInt553 * 1709859847 - arg1;
			local34 -= local74;
			arg1 = this.aClass86_Sub2_7.anInt553 * 1709859847;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass86_Sub2_7.anInt540 * -1807368365) {
			local74 = arg1 + local34 - this.aClass86_Sub2_7.anInt540 * -1807368365;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 > 0 && local39 > 0) {
			this.method7597(this.aByteArrayArray9[arg0], this.aClass86_Sub2_7.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray95[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!aft", name = "bv", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 156)
	void method7597(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_7.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass86_Sub2_7.anInt547 * 356365251 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = arg14 + local5.length < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(185) int local185 = (local165 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8;
					local165 = 256 - local165;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00) * local165 & 0xFF0000) + ((local193 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8) + local185;
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!aft", name = "bb", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 156)
	void method7598(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_7.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass86_Sub2_7.anInt547 * 356365251 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = arg14 + local5.length < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(185) int local185 = (local165 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8;
					local165 = 256 - local165;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00) * local165 & 0xFF0000) + ((local193 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8) + local185;
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!aft", name = "bd", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 156)
	void method7599(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_7.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass86_Sub2_7.anInt547 * 356365251 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = arg14 + local5.length < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(185) int local185 = (local165 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8;
					local165 = 256 - local165;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00) * local165 & 0xFF0000) + ((local193 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8) + local185;
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!aft", name = "by", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 156)
	void method7600(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_7.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += this.aClass86_Sub2_7.anInt547 * 356365251 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = arg14 + local5.length < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
		for (@Pc(62) int local62 = local18; local62 < local60; local62++) {
			@Pc(73) int local73 = arg13 + local5[local62 - arg14];
			@Pc(79) int local79 = local8[local62 - arg14];
			@Pc(81) int local81 = arg5;
			@Pc(88) int local88;
			if (local16 > local73) {
				local88 = local16 - local73;
				if (local88 >= local79) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
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
				@Pc(165) int local165 = arg0[arg3++] & 0xFF;
				if (local165 == 0) {
					arg4++;
				} else {
					@Pc(185) int local185 = (local165 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8;
					local165 = 256 - local165;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00) * local165 & 0xFF0000) + ((local193 & 0xFF00FF) * local165 & 0xFF00FF00) >> 8) + local185;
				}
			}
			arg3 += local88 + arg8;
			arg4 += local88 + arg7;
		}
	}

	@OriginalMember(owner = "client!aft", name = "acy", descriptor = "(Lclient!yf;I)V", line = 9509)
	static final void method7601(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(14) long local14 = (long) arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(25) long local25 = (long) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (local14 + local25 * local14 / 100L);
	}
}
