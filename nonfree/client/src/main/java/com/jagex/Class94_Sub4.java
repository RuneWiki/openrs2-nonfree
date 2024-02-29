package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afo")
public class Class94_Sub4 extends Class94 {

	@OriginalMember(owner = "client!afo", name = "wj", descriptor = "Lclient!fw;")
	public static Class261 aClass261_1;

	@OriginalMember(owner = "client!afo", name = "j", descriptor = "Lclient!aeh;")
	Class86_Sub2 aClass86_Sub2_6;

	@OriginalMember(owner = "client!afo", name = "k", descriptor = "[I")
	int[] anIntArray92;

	@OriginalMember(owner = "client!afo", name = "u", descriptor = "[I")
	int[] anIntArray90;

	@OriginalMember(owner = "client!afo", name = "i", descriptor = "[[B")
	byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!afo", name = "e", descriptor = "[I")
	int[] anIntArray91;

	@OriginalMember(owner = "client!afo", name = "f", descriptor = "[I")
	int[] anIntArray89;

	@OriginalMember(owner = "client!afo", name = "<init>", descriptor = "(Lclient!aeh;Lclient!aar;[Lclient!aew;[I[I)V", line = 17)
	Class94_Sub4(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class89_Sub2[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass86_Sub2_6 = arg0;
		this.anIntArray92 = arg3;
		this.anIntArray90 = arg4;
		this.aByteArrayArray8 = new byte[arg2.length][];
		this.anIntArray91 = new int[arg2.length];
		this.anIntArray89 = new int[arg2.length];
		for (@Pc(29) int local29 = 0; local29 < arg2.length; local29++) {
			this.aByteArrayArray8[local29] = arg2[local29].aByteArray16;
			this.anIntArray91[local29] = arg2[local29].anInt764;
			this.anIntArray89[local29] = arg2[local29].anInt763;
		}
	}

	@OriginalMember(owner = "client!afo", name = "<init>", descriptor = "(Lclient!aeh;Lclient!aar;[Lclient!aej;[I[I)V", line = 33)
	Class94_Sub4(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) Class89_Sub1[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass86_Sub2_6 = arg0;
		this.anIntArray92 = arg3;
		this.anIntArray90 = arg4;
		this.aByteArrayArray8 = new byte[arg2.length][];
		this.anIntArray91 = new int[arg2.length];
		this.anIntArray89 = new int[arg2.length];
		for (@Pc(29) int local29 = 0; local29 < arg2.length; local29++) {
			@Pc(39) int[] local39 = arg2[local29].method6686(false);
			@Pc(48) byte[] local48 = this.aByteArrayArray8[local29] = new byte[local39.length];
			for (@Pc(50) int local50 = 0; local50 < local39.length; local50++) {
				@Pc(58) int local58 = local39[local50];
				@Pc(81) byte local81 = (byte) ((local58 >> 8 & 0xFF) * 4 + (local58 >> 16 & 0xFF) * 3 + (local58 & 0xFF) >> 3);
				local48[local50] = local81;
			}
			this.anIntArray91[local29] = arg2[local29].method6701();
			this.anIntArray89[local29] = arg2[local29].method6684();
		}
	}

	@OriginalMember(owner = "client!afo", name = "i", descriptor = "(CIIIZ)V", line = 54)
	@Override
	void method7660(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_6.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray89[arg0];
		arg2 += this.anIntArray91[arg0];
		@Pc(23) int local23 = this.anIntArray92[arg0];
		@Pc(28) int local28 = this.anIntArray90[arg0];
		@Pc(34) int local34 = this.aClass86_Sub2_6.anInt547 * 356365251;
		@Pc(40) int local40 = local34 * arg2 + arg1;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass86_Sub2_6.anInt541 * 9823353) {
			local63 = this.aClass86_Sub2_6.anInt541 * 9823353 - arg2;
			local28 -= local63;
			arg2 = this.aClass86_Sub2_6.anInt541 * 9823353;
			local48 += local63 * local23;
			local40 += local63 * local34;
		}
		if (arg2 + local28 > this.aClass86_Sub2_6.anInt542 * 639238427) {
			local28 -= local28 + arg2 - this.aClass86_Sub2_6.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_6.anInt553 * 1709859847) {
			local63 = this.aClass86_Sub2_6.anInt553 * 1709859847 - arg1;
			local23 -= local63;
			arg1 = this.aClass86_Sub2_6.anInt553 * 1709859847;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 + arg1 > this.aClass86_Sub2_6.anInt540 * -1807368365) {
			local63 = arg1 + local23 - this.aClass86_Sub2_6.anInt540 * -1807368365;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 <= 0 || local28 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method7450(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method7455(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!afo", name = "e", descriptor = "(CIIIZ)V", line = 54)
	@Override
	void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_6.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray89[arg0];
		arg2 += this.anIntArray91[arg0];
		@Pc(23) int local23 = this.anIntArray92[arg0];
		@Pc(28) int local28 = this.anIntArray90[arg0];
		@Pc(34) int local34 = this.aClass86_Sub2_6.anInt547 * 356365251;
		@Pc(40) int local40 = local34 * arg2 + arg1;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass86_Sub2_6.anInt541 * 9823353) {
			local63 = this.aClass86_Sub2_6.anInt541 * 9823353 - arg2;
			local28 -= local63;
			arg2 = this.aClass86_Sub2_6.anInt541 * 9823353;
			local48 += local63 * local23;
			local40 += local63 * local34;
		}
		if (arg2 + local28 > this.aClass86_Sub2_6.anInt542 * 639238427) {
			local28 -= local28 + arg2 - this.aClass86_Sub2_6.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_6.anInt553 * 1709859847) {
			local63 = this.aClass86_Sub2_6.anInt553 * 1709859847 - arg1;
			local23 -= local63;
			arg1 = this.aClass86_Sub2_6.anInt553 * 1709859847;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 + arg1 > this.aClass86_Sub2_6.anInt540 * -1807368365) {
			local63 = arg1 + local23 - this.aClass86_Sub2_6.anInt540 * -1807368365;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 <= 0 || local28 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method7450(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method7455(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!afo", name = "u", descriptor = "(CIIIZ)V", line = 54)
	@Override
	void method7656(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass86_Sub2_6.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray89[arg0];
		arg2 += this.anIntArray91[arg0];
		@Pc(23) int local23 = this.anIntArray92[arg0];
		@Pc(28) int local28 = this.anIntArray90[arg0];
		@Pc(34) int local34 = this.aClass86_Sub2_6.anInt547 * 356365251;
		@Pc(40) int local40 = local34 * arg2 + arg1;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass86_Sub2_6.anInt541 * 9823353) {
			local63 = this.aClass86_Sub2_6.anInt541 * 9823353 - arg2;
			local28 -= local63;
			arg2 = this.aClass86_Sub2_6.anInt541 * 9823353;
			local48 += local63 * local23;
			local40 += local63 * local34;
		}
		if (arg2 + local28 > this.aClass86_Sub2_6.anInt542 * 639238427) {
			local28 -= local28 + arg2 - this.aClass86_Sub2_6.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_6.anInt553 * 1709859847) {
			local63 = this.aClass86_Sub2_6.anInt553 * 1709859847 - arg1;
			local23 -= local63;
			arg1 = this.aClass86_Sub2_6.anInt553 * 1709859847;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 + arg1 > this.aClass86_Sub2_6.anInt540 * -1807368365) {
			local63 = arg1 + local23 - this.aClass86_Sub2_6.anInt540 * -1807368365;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 <= 0 || local28 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method7450(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method7455(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!afo", name = "bj", descriptor = "([B[IIIIIIII)V", line = 93)
	void method7450(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afo", name = "bb", descriptor = "([B[IIIIIIII)V", line = 93)
	void method7451(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!afo", name = "y", descriptor = "(Ljava/lang/CharSequence;II[BII)I", line = 110)
	public static int method7452(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(arg1 + local5);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == '€') {
				arg3[arg4 + local5] = -128;
			} else if (local14 == '‚') {
				arg3[local5 + arg4] = -126;
			} else if (local14 == 'ƒ') {
				arg3[arg4 + local5] = -125;
			} else if (local14 == '„') {
				arg3[local5 + arg4] = -124;
			} else if (local14 == '…') {
				arg3[local5 + arg4] = -123;
			} else if (local14 == '†') {
				arg3[arg4 + local5] = -122;
			} else if (local14 == '‡') {
				arg3[arg4 + local5] = -121;
			} else if (local14 == 'ˆ') {
				arg3[local5 + arg4] = -120;
			} else if (local14 == '‰') {
				arg3[local5 + arg4] = -119;
			} else if (local14 == 'Š') {
				arg3[arg4 + local5] = -118;
			} else if (local14 == '‹') {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 'Œ') {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 'Ž') {
				arg3[arg4 + local5] = -114;
			} else if (local14 == '‘') {
				arg3[local5 + arg4] = -111;
			} else if (local14 == '’') {
				arg3[local5 + arg4] = -110;
			} else if (local14 == '“') {
				arg3[local5 + arg4] = -109;
			} else if (local14 == '”') {
				arg3[local5 + arg4] = -108;
			} else if (local14 == '•') {
				arg3[arg4 + local5] = -107;
			} else if (local14 == '–') {
				arg3[arg4 + local5] = -106;
			} else if (local14 == '—') {
				arg3[local5 + arg4] = -105;
			} else if (local14 == '˜') {
				arg3[arg4 + local5] = -104;
			} else if (local14 == '™') {
				arg3[local5 + arg4] = -103;
			} else if (local14 == 'š') {
				arg3[arg4 + local5] = -102;
			} else if (local14 == '›') {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 'œ') {
				arg3[arg4 + local5] = -100;
			} else if (local14 == 'ž') {
				arg3[local5 + arg4] = -98;
			} else if (local14 == 'Ÿ') {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[arg4 + local5] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!afo", name = "bd", descriptor = "([B[IIIIIIII)V", line = 116)
	void method7453(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local3 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00FF) * local7 & 0xFF00FF00) + ((local44 & 0xFF00) * local7 & 0xFF0000) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afo", name = "by", descriptor = "([B[IIIIIIII)V", line = 116)
	void method7454(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local3 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00FF) * local7 & 0xFF00FF00) + ((local44 & 0xFF00) * local7 & 0xFF0000) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afo", name = "bv", descriptor = "([B[IIIIIIII)V", line = 116)
	void method7455(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = (local3 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local3 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00FF) * local7 & 0xFF00FF00) + ((local44 & 0xFF00) * local7 & 0xFF0000) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!afo", name = "k", descriptor = "(CIIIZLclient!cd;II)V", line = 133)
	@Override
	void method7661(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_6.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray89[arg0];
		arg2 += this.anIntArray91[arg0];
		@Pc(34) int local34 = this.anIntArray92[arg0];
		@Pc(39) int local39 = this.anIntArray90[arg0];
		@Pc(45) int local45 = this.aClass86_Sub2_6.anInt547 * 356365251;
		@Pc(51) int local51 = arg2 * local45 + arg1;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass86_Sub2_6.anInt541 * 9823353) {
			local74 = this.aClass86_Sub2_6.anInt541 * 9823353 - arg2;
			local39 -= local74;
			arg2 = this.aClass86_Sub2_6.anInt541 * 9823353;
			local59 += local34 * local74;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass86_Sub2_6.anInt542 * 639238427) {
			local39 -= arg2 + local39 - this.aClass86_Sub2_6.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_6.anInt553 * 1709859847) {
			local74 = this.aClass86_Sub2_6.anInt553 * 1709859847 - arg1;
			local34 -= local74;
			arg1 = this.aClass86_Sub2_6.anInt553 * 1709859847;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass86_Sub2_6.anInt540 * -1807368365) {
			local74 = arg1 + local34 - this.aClass86_Sub2_6.anInt540 * -1807368365;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 <= 0 || local39 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method7457(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray92[arg0], arg5, arg6, arg7);
		} else {
			this.method7460(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray92[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afo", name = "f", descriptor = "(CIIIZLclient!cd;II)V", line = 133)
	@Override
	void method7658(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_6.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray89[arg0];
		arg2 += this.anIntArray91[arg0];
		@Pc(34) int local34 = this.anIntArray92[arg0];
		@Pc(39) int local39 = this.anIntArray90[arg0];
		@Pc(45) int local45 = this.aClass86_Sub2_6.anInt547 * 356365251;
		@Pc(51) int local51 = arg2 * local45 + arg1;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass86_Sub2_6.anInt541 * 9823353) {
			local74 = this.aClass86_Sub2_6.anInt541 * 9823353 - arg2;
			local39 -= local74;
			arg2 = this.aClass86_Sub2_6.anInt541 * 9823353;
			local59 += local34 * local74;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass86_Sub2_6.anInt542 * 639238427) {
			local39 -= arg2 + local39 - this.aClass86_Sub2_6.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_6.anInt553 * 1709859847) {
			local74 = this.aClass86_Sub2_6.anInt553 * 1709859847 - arg1;
			local34 -= local74;
			arg1 = this.aClass86_Sub2_6.anInt553 * 1709859847;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass86_Sub2_6.anInt540 * -1807368365) {
			local74 = arg1 + local34 - this.aClass86_Sub2_6.anInt540 * -1807368365;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 <= 0 || local39 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method7457(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray92[arg0], arg5, arg6, arg7);
		} else {
			this.method7460(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray92[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afo", name = "o", descriptor = "(CIIIZLclient!cd;II)V", line = 133)
	@Override
	void method7659(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class90 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub2_6.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method7660(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray89[arg0];
		arg2 += this.anIntArray91[arg0];
		@Pc(34) int local34 = this.anIntArray92[arg0];
		@Pc(39) int local39 = this.anIntArray90[arg0];
		@Pc(45) int local45 = this.aClass86_Sub2_6.anInt547 * 356365251;
		@Pc(51) int local51 = arg2 * local45 + arg1;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass86_Sub2_6.anInt541 * 9823353) {
			local74 = this.aClass86_Sub2_6.anInt541 * 9823353 - arg2;
			local39 -= local74;
			arg2 = this.aClass86_Sub2_6.anInt541 * 9823353;
			local59 += local34 * local74;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass86_Sub2_6.anInt542 * 639238427) {
			local39 -= arg2 + local39 - this.aClass86_Sub2_6.anInt542 * 639238427;
		}
		if (arg1 < this.aClass86_Sub2_6.anInt553 * 1709859847) {
			local74 = this.aClass86_Sub2_6.anInt553 * 1709859847 - arg1;
			local34 -= local74;
			arg1 = this.aClass86_Sub2_6.anInt553 * 1709859847;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass86_Sub2_6.anInt540 * -1807368365) {
			local74 = arg1 + local34 - this.aClass86_Sub2_6.anInt540 * -1807368365;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 <= 0 || local39 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method7457(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray92[arg0], arg5, arg6, arg7);
		} else {
			this.method7460(this.aByteArrayArray8[arg0], this.aClass86_Sub2_6.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray92[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!afo", name = "bw", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 176)
	void method7456(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += this.aClass86_Sub2_6.anInt547 * 356365251 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(52) int local52 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				local71 -= local80;
			} else {
				local80 = local65 - arg9;
				if (local80 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local80;
				local73 = arg5 - local80;
				arg4 += local80;
			}
			local80 = 0;
			if (local73 < local71) {
				local71 = local73;
			} else {
				local80 = local73 - local71;
			}
			for (@Pc(147) int local147 = 0; local147 < local71; local147++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg8 + local80;
			arg4 += arg7 + local80;
		}
	}

	@OriginalMember(owner = "client!afo", name = "ba", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 176)
	void method7457(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += this.aClass86_Sub2_6.anInt547 * 356365251 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(52) int local52 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				local71 -= local80;
			} else {
				local80 = local65 - arg9;
				if (local80 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local80;
				local73 = arg5 - local80;
				arg4 += local80;
			}
			local80 = 0;
			if (local73 < local71) {
				local71 = local73;
			} else {
				local80 = local73 - local71;
			}
			for (@Pc(147) int local147 = 0; local147 < local71; local147++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg8 + local80;
			arg4 += arg7 + local80;
		}
	}

	@OriginalMember(owner = "client!afo", name = "bx", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 176)
	void method7458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += this.aClass86_Sub2_6.anInt547 * 356365251 * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(52) int local52 = local5.length + arg14 < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				local71 -= local80;
			} else {
				local80 = local65 - arg9;
				if (local80 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local80;
				local73 = arg5 - local80;
				arg4 += local80;
			}
			local80 = 0;
			if (local73 < local71) {
				local71 = local73;
			} else {
				local80 = local73 - local71;
			}
			for (@Pc(147) int local147 = 0; local147 < local71; local147++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg8 + local80;
			arg4 += arg7 + local80;
		}
	}

	@OriginalMember(owner = "client!afo", name = "bs", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 223)
	void method7459(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_6.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 356365251 * this.aClass86_Sub2_6.anInt547;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? arg14 + local5.length : arg10 + arg6;
		@Pc(64) int local64 = arg2 >>> 24;
		@Pc(68) int local68 = 255 - local64;
		for (@Pc(70) int local70 = local18; local70 < local60; local70++) {
			@Pc(81) int local81 = arg13 + local5[local70 - arg14];
			@Pc(87) int local87 = local8[local70 - arg14];
			@Pc(89) int local89 = arg5;
			@Pc(96) int local96;
			if (local16 > local81) {
				local96 = local16 - local81;
				if (local96 >= local87) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local96;
				local89 = arg5 - local96;
				arg4 += local96;
			}
			local96 = 0;
			if (local89 < local87) {
				local87 = local89;
			} else {
				local96 = local89 - local87;
			}
			for (@Pc(164) int local164 = -local87; local164 < 0; local164++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(189) int local189 = ((arg2 & 0xFF00) * local64 & 0xFF0000) + (local64 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = ((local68 * (local193 & 0xFF00FF) & 0xFF00FF00) + (local68 * (local193 & 0xFF00) & 0xFF0000) >> 8) + local189;
				}
			}
			arg3 += local96 + arg8;
			arg4 += arg7 + local96;
		}
	}

	@OriginalMember(owner = "client!afo", name = "bl", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 223)
	void method7460(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_6.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 356365251 * this.aClass86_Sub2_6.anInt547;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? arg14 + local5.length : arg10 + arg6;
		@Pc(64) int local64 = arg2 >>> 24;
		@Pc(68) int local68 = 255 - local64;
		for (@Pc(70) int local70 = local18; local70 < local60; local70++) {
			@Pc(81) int local81 = arg13 + local5[local70 - arg14];
			@Pc(87) int local87 = local8[local70 - arg14];
			@Pc(89) int local89 = arg5;
			@Pc(96) int local96;
			if (local16 > local81) {
				local96 = local16 - local81;
				if (local96 >= local87) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local96;
				local89 = arg5 - local96;
				arg4 += local96;
			}
			local96 = 0;
			if (local89 < local87) {
				local87 = local89;
			} else {
				local96 = local89 - local87;
			}
			for (@Pc(164) int local164 = -local87; local164 < 0; local164++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(189) int local189 = ((arg2 & 0xFF00) * local64 & 0xFF0000) + (local64 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = ((local68 * (local193 & 0xFF00FF) & 0xFF00FF00) + (local68 * (local193 & 0xFF00) & 0xFF0000) >> 8) + local189;
				}
			}
			arg3 += local96 + arg8;
			arg4 += arg7 + local96;
		}
	}

	@OriginalMember(owner = "client!afo", name = "bi", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 223)
	void method7461(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_6.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 356365251 * this.aClass86_Sub2_6.anInt547;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? arg14 + local5.length : arg10 + arg6;
		@Pc(64) int local64 = arg2 >>> 24;
		@Pc(68) int local68 = 255 - local64;
		for (@Pc(70) int local70 = local18; local70 < local60; local70++) {
			@Pc(81) int local81 = arg13 + local5[local70 - arg14];
			@Pc(87) int local87 = local8[local70 - arg14];
			@Pc(89) int local89 = arg5;
			@Pc(96) int local96;
			if (local16 > local81) {
				local96 = local16 - local81;
				if (local96 >= local87) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local96;
				local89 = arg5 - local96;
				arg4 += local96;
			}
			local96 = 0;
			if (local89 < local87) {
				local87 = local89;
			} else {
				local96 = local89 - local87;
			}
			for (@Pc(164) int local164 = -local87; local164 < 0; local164++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(189) int local189 = ((arg2 & 0xFF00) * local64 & 0xFF0000) + (local64 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = ((local68 * (local193 & 0xFF00FF) & 0xFF00FF00) + (local68 * (local193 & 0xFF00) & 0xFF0000) >> 8) + local189;
				}
			}
			arg3 += local96 + arg8;
			arg4 += arg7 + local96;
		}
	}

	@OriginalMember(owner = "client!afo", name = "bg", descriptor = "([B[IIIIIIIIIIILclient!cd;II)V", line = 223)
	void method7462(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class90 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class90_Sub2 local2 = (Class90_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray67;
		@Pc(8) int[] local8 = local2.anIntArray68;
		@Pc(16) int local16 = arg9 - this.aClass86_Sub2_6.anInt553 * 1709859847;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * 356365251 * this.aClass86_Sub2_6.anInt547;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? arg14 + local5.length : arg10 + arg6;
		@Pc(64) int local64 = arg2 >>> 24;
		@Pc(68) int local68 = 255 - local64;
		for (@Pc(70) int local70 = local18; local70 < local60; local70++) {
			@Pc(81) int local81 = arg13 + local5[local70 - arg14];
			@Pc(87) int local87 = local8[local70 - arg14];
			@Pc(89) int local89 = arg5;
			@Pc(96) int local96;
			if (local16 > local81) {
				local96 = local16 - local81;
				if (local96 >= local87) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += local96;
				local89 = arg5 - local96;
				arg4 += local96;
			}
			local96 = 0;
			if (local89 < local87) {
				local87 = local89;
			} else {
				local96 = local89 - local87;
			}
			for (@Pc(164) int local164 = -local87; local164 < 0; local164++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(189) int local189 = ((arg2 & 0xFF00) * local64 & 0xFF0000) + (local64 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = ((local68 * (local193 & 0xFF00FF) & 0xFF00FF00) + (local68 * (local193 & 0xFF00) & 0xFF0000) >> 8) + local189;
				}
			}
			arg3 += local96 + arg8;
			arg4 += arg7 + local96;
		}
	}

	@OriginalMember(owner = "client!afo", name = "gc", descriptor = "(B)V", line = 2610)
	static final void method7463() {
		Class555.aClass35_Sub17_3.method18336();
		Class65.aClass35_Sub13_1.method18336();
		Class333.aClass35_Sub14_1.method18336();
		client.aClass517_1.method30444().method18336();
		Class578.aClass35_Sub3_1.method18336();
		Class537.aClass35_Sub7_1.method18336();
		Class96_Sub11.aClass35_Sub2_3.method18336();
		Class482.aClass35_Sub4_1.method18336();
		Class61.aClass35_Sub11_1.method18336();
		Class562.aClass80_Sub1_Sub1_2.method1657();
		Class539.aClass80_Sub1_Sub2_6.method1965();
		Class55.aClass80_Sub1_Sub2_1.method1965();
		Class308.aClass80_Sub1_Sub2_3.method1965();
		Class528.aClass80_Sub1_Sub2_5.method1965();
		Class77_Sub23.aClass80_Sub1_Sub2_2.method1965();
		Class96_Sub23.aClass35_Sub15_1.method18336();
		Class118_Sub1.aClass35_Sub18_4.method18336();
		Class251.aClass35_Sub10_3.method18336();
		Class77_Sub13_Sub12.aClass35_Sub22_1.method18336();
		Class214.aClass35_Sub6_1.method18336();
		Class497.aClass35_Sub9_1.method18336();
		Class96_Sub10.aClass35_Sub20_1.method18336();
		Class648.aClass35_Sub5_1.method18336();
		Class629.aClass35_Sub1_1.method18336();
		Class476.aClass35_Sub16_1.method18336();
		Class137.method14113();
		Class146_Sub1.method15287();
		Class367.aClass415_1.method28658();
		Class127_Sub3.method12943();
		Class249.method26163();
		client.aClass232_63.method25857();
		client.aClass232_64.method25857();
		Class674.aClass232_92.method25857();
		client.aClass232_66.method25857();
		Class75_Sub1.aClass35_1.method18336();
		Class149.aClass35_10.method18336();
		client.aClass232_65.method25857();
	}

	@OriginalMember(owner = "client!afo", name = "nw", descriptor = "(Lclient!yf;I)V", line = 6989)
	static final void method7464(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class131.method23062(local16, local22, arg0);
	}
}
