package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public abstract class Class17 {

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
	public final int anInt339;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public final int anInt337;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public final int anInt338;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public final int anInt336;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "[[I")
	public final int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(III[[I)V", line = 10)
	Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt339 = arg0 * 676865173;
		this.anInt337 = arg1 * -1299960349;
		@Pc(13) int local13 = 0;
		while (arg2 > 1) {
			local13++;
			arg2 >>= 0x1;
		}
		this.anInt338 = (0x1 << local13) * 169293989;
		this.anInt336 = local13 * -193427223;
		this.anIntArrayArray7 = arg3;
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)Z", line = 26)
	public static boolean method3595() {
		return Class369.anInterface42_1 != null;
	}

	@OriginalMember(owner = "client!ci", name = "au", descriptor = "(II)I", line = 31)
	public final int method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt336 * 1371852633;
		@Pc(13) int local13 = arg1 >> this.anInt336 * 1371852633;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt339 * -1007974723 - 1 || local13 > this.anInt337 * -207323189 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt338 * 76934957 - 1;
		@Pc(53) int local53 = arg1 & this.anInt338 * 76934957 - 1;
		@Pc(83) int local83 = this.anIntArrayArray7[local6 + 1][local13] * local44 + (this.anInt338 * 76934957 - local44) * this.anIntArrayArray7[local6][local13] >> this.anInt336 * 1371852633;
		@Pc(117) int local117 = (this.anInt338 * 76934957 - local44) * this.anIntArrayArray7[local6][local13 + 1] + this.anIntArrayArray7[local6 + 1][local13 + 1] * local44 >> this.anInt336 * 1371852633;
		return local117 * local53 + (this.anInt338 * 76934957 - local53) * local83 >> this.anInt336 * 1371852633;
	}

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "(II)I", line = 31)
	public final int method3581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt336 * 1371852633;
		@Pc(13) int local13 = arg1 >> this.anInt336 * 1371852633;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt339 * -1007974723 - 1 || local13 > this.anInt337 * -207323189 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt338 * 76934957 - 1;
		@Pc(53) int local53 = arg1 & this.anInt338 * 76934957 - 1;
		@Pc(83) int local83 = this.anIntArrayArray7[local6 + 1][local13] * local44 + (this.anInt338 * 76934957 - local44) * this.anIntArrayArray7[local6][local13] >> this.anInt336 * 1371852633;
		@Pc(117) int local117 = (this.anInt338 * 76934957 - local44) * this.anIntArrayArray7[local6][local13 + 1] + this.anIntArrayArray7[local6 + 1][local13 + 1] * local44 >> this.anInt336 * 1371852633;
		return local117 * local53 + (this.anInt338 * 76934957 - local53) * local83 >> this.anInt336 * 1371852633;
	}

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "(IIB)I", line = 31)
	public final int method3583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt336 * 1371852633;
		@Pc(13) int local13 = arg1 >> this.anInt336 * 1371852633;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt339 * -1007974723 - 1 || local13 > this.anInt337 * -207323189 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt338 * 76934957 - 1;
		@Pc(53) int local53 = arg1 & this.anInt338 * 76934957 - 1;
		@Pc(83) int local83 = this.anIntArrayArray7[local6 + 1][local13] * local44 + (this.anInt338 * 76934957 - local44) * this.anIntArrayArray7[local6][local13] >> this.anInt336 * 1371852633;
		@Pc(117) int local117 = (this.anInt338 * 76934957 - local44) * this.anIntArrayArray7[local6][local13 + 1] + this.anIntArrayArray7[local6 + 1][local13 + 1] * local44 >> this.anInt336 * 1371852633;
		return local117 * local53 + (this.anInt338 * 76934957 - local53) * local83 >> this.anInt336 * 1371852633;
	}

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "(III)I", line = 42)
	public final int method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt336 * 1371852633;
		@Pc(13) int local13 = arg1 >> this.anInt336 * 1371852633;
		@Pc(24) int local24 = Math.min(this.anInt339 * -1007974723 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt337 * -207323189 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt339 * -1007974723 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt337 * -207323189 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt338 * 76934957 - 1;
		@Pc(75) int local75 = arg1 & this.anInt338 * 76934957 - 1;
		@Pc(103) int local103 = this.anIntArrayArray7[local24][local35] * (this.anInt338 * 76934957 - local66) + local66 * this.anIntArrayArray7[local46][local35] >> this.anInt336 * 1371852633;
		@Pc(131) int local131 = this.anIntArrayArray7[local24][local57] * (this.anInt338 * 76934957 - local66) + local66 * this.anIntArrayArray7[local46][local57] >> this.anInt336 * 1371852633;
		return (this.anInt338 * 76934957 - local75) * local103 + local131 * local75 >> this.anInt336 * 1371852633;
	}

	@OriginalMember(owner = "client!ci", name = "ay", descriptor = "(II)I", line = 42)
	public final int method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt336 * 1371852633;
		@Pc(13) int local13 = arg1 >> this.anInt336 * 1371852633;
		@Pc(24) int local24 = Math.min(this.anInt339 * -1007974723 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt337 * -207323189 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt339 * -1007974723 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt337 * -207323189 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt338 * 76934957 - 1;
		@Pc(75) int local75 = arg1 & this.anInt338 * 76934957 - 1;
		@Pc(103) int local103 = this.anIntArrayArray7[local24][local35] * (this.anInt338 * 76934957 - local66) + local66 * this.anIntArrayArray7[local46][local35] >> this.anInt336 * 1371852633;
		@Pc(131) int local131 = this.anIntArrayArray7[local24][local57] * (this.anInt338 * 76934957 - local66) + local66 * this.anIntArrayArray7[local46][local57] >> this.anInt336 * 1371852633;
		return (this.anInt338 * 76934957 - local75) * local103 + local131 * local75 >> this.anInt336 * 1371852633;
	}

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "(IIB)I", line = 56)
	public final int method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!ci", name = "ar", descriptor = "(II)I", line = 56)
	public final int method3557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!ci", name = "ag", descriptor = "(II)I", line = 56)
	public final int method3584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!ci", name = "am", descriptor = "(II)I", line = 56)
	public final int method3585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[arg0][arg1];
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IIB)I", line = 60)
	public final int method3586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[Math.min(this.anInt339 * -1007974723 - 1, Math.max(0, arg0))][Math.min(this.anInt337 * -207323189 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!ci", name = "ae", descriptor = "(II)I", line = 60)
	public final int method3587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[Math.min(this.anInt339 * -1007974723 - 1, Math.max(0, arg0))][Math.min(this.anInt337 * -207323189 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!ci", name = "ad", descriptor = "(II)I", line = 60)
	public final int method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray7[Math.min(this.anInt339 * -1007974723 - 1, Math.max(0, arg0))][Math.min(this.anInt337 * -207323189 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "(Lclient!vs;B)V", line = 3960)
	static final void method3589(@OriginalArg(0) Class536 arg0) {
		@Pc(9) Class11 local9 = (Class11) arg0.aClass3_Sub1_Sub6_2.anObjectArray4[arg0.anInt5318 * -2140198955];
		@Pc(31) Interface6 local31 = (Interface6) (arg0.anIntArray497[arg0.anInt5318 * -2140198955] == 0 ? arg0.aMap15.get(local9.aClass43_3) : arg0.aMap16.get(local9.aClass43_3));
		@Pc(36) Class342 local36 = local9.aClass339_3.method26428();
		if (local36 == Class342.aClass342_5) {
			if (local9.aClass43_3 == Class43.aClass43_60) {
				Class85.method21640(local9);
			}
			local31.method32389(local9, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		} else if (local36 == Class342.aClass342_2) {
			local31.method32401(local9, arg0.aLongArray18[(arg0.anInt5316 -= 2125691367) * 196643287]);
		} else if (local36 == Class342.aClass342_3) {
			if (Class43.aClass43_60 == local9.aClass43_3) {
				Class44_Sub2.method15144(local9);
			}
			local31.method32391(local9, arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575]);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ci", name = "nh", descriptor = "(Lclient!vs;I)V", line = 6476)
	static final void method3590(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class51_Sub1.method9865(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ci", name = "yv", descriptor = "(Lclient!vs;B)V", line = 8549)
	static final void method3593(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = arg0.aClass245_4.aString193;
	}

	@OriginalMember(owner = "client!ci", name = "aaz", descriptor = "(Lclient!vs;I)V", line = 8725)
	static final void method3591(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass367Array1[local12].anInt4654 * 1472352243;
	}

	@OriginalMember(owner = "client!ci", name = "agk", descriptor = "(Lclient!vs;I)V", line = 10160)
	static final void method3594(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(28) boolean local28 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		if (Class58_Sub1.aClass581_14 == null) {
			return;
		}
		@Pc(35) Class3 local35 = Class58_Sub1.aClass581_14.method33217((long) local13);
		if (local35 != null && !local28) {
			local35.method33656();
		} else if (local35 == null && local28) {
			local35 = new Class3();
			Class58_Sub1.aClass581_14.method33241(local35, (long) local13);
		}
	}

	@OriginalMember(owner = "client!ci", name = "aql", descriptor = "(Lclient!vs;I)V", line = 11907)
	static final void method3592(@OriginalArg(0) Class536 arg0) {
		@Pc(3) int local3 = client.aClass581_22.method33220();
		if (-1579500007 * client.anInt3125 != -1) {
			local3++;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local3;
	}

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "(III)V")
	public abstract void method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "(Lclient!amd;IIIIZ)V")
	public abstract void method3540(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V")
	public abstract void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V")
	public abstract void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!ci", name = "ak", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "(III[[ZZI)V")
	public abstract void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "()V")
	public abstract void method3546();

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V")
	public abstract void method3549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(IILclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2);

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "(Lclient!amd;IIIIZ)V")
	public abstract void method3551(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V")
	public abstract void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "(Lclient!amd;IIIIZ)Z")
	public abstract boolean method3553(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(Lclient!afz;[I)V")
	public abstract void method3554(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(III)V")
	public abstract void method3555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "(III)V")
	public abstract void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ci", name = "az", descriptor = "(Lclient!afz;[I)V")
	public abstract void method3558(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V")
	public abstract void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V")
	public abstract void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V")
	public abstract void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!ci", name = "at", descriptor = "(III[[ZZI)V")
	public abstract void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "()V")
	public abstract void method3563();

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "(III[[ZZI)V")
	public abstract void method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "(III)V")
	public abstract void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ci", name = "af", descriptor = "(III[[ZZI)V")
	public abstract void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V")
	public abstract void method3567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!ci", name = "an", descriptor = "(IILclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2);

	@OriginalMember(owner = "client!ci", name = "ah", descriptor = "(IILclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2);

	@OriginalMember(owner = "client!ci", name = "aj", descriptor = "(IILclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method3571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2);

	@OriginalMember(owner = "client!ci", name = "as", descriptor = "(Lclient!amd;IIIIZ)V")
	public abstract void method3572(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ci", name = "ai", descriptor = "(Lclient!amd;IIIIZ)V")
	public abstract void method3573(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ci", name = "aq", descriptor = "(Lclient!amd;IIIIZ)Z")
	public abstract boolean method3574(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ci", name = "av", descriptor = "(Lclient!amd;IIIIZ)V")
	public abstract void method3575(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ci", name = "ax", descriptor = "(Lclient!amd;IIIIZ)V")
	public abstract void method3576(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ci", name = "al", descriptor = "(Lclient!afz;[I)V")
	public abstract void method3578(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ci", name = "ao", descriptor = "(Lclient!afz;[I)V")
	public abstract void method3579(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ci", name = "ap", descriptor = "(Lclient!afz;[I)V")
	public abstract void method3580(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ci", name = "aa", descriptor = "(IILclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method3582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2);
}
