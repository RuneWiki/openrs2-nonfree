package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abb")
public class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!abb", name = "e", descriptor = "Lclient!abl;")
	Class21_Sub1 aClass21_Sub1_3;

	@OriginalMember(owner = "client!abb", name = "d", descriptor = "[I")
	int[] anIntArray22;

	@OriginalMember(owner = "client!abb", name = "q", descriptor = "[I")
	int[] anIntArray23;

	@OriginalMember(owner = "client!abb", name = "r", descriptor = "[[B")
	byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!abb", name = "m", descriptor = "[I")
	int[] anIntArray24;

	@OriginalMember(owner = "client!abb", name = "v", descriptor = "[I")
	int[] anIntArray25;

	@OriginalMember(owner = "client!abb", name = "<init>", descriptor = "(Lclient!abl;Lclient!yx;[Lclient!abc;[I[I)V", line = 17)
	Class14_Sub1(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) Class15_Sub1[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass21_Sub1_3 = arg0;
		this.anIntArray22 = arg3;
		this.anIntArray23 = arg4;
		this.aByteArrayArray1 = new byte[arg2.length][];
		this.anIntArray24 = new int[arg2.length];
		this.anIntArray25 = new int[arg2.length];
		for (@Pc(29) int local29 = 0; local29 < arg2.length; local29++) {
			this.aByteArrayArray1[local29] = arg2[local29].aByteArray1;
			this.anIntArray24[local29] = arg2[local29].anInt167;
			this.anIntArray25[local29] = arg2[local29].anInt166;
		}
	}

	@OriginalMember(owner = "client!abb", name = "h", descriptor = "(Lclient!ahb;I)Lclient!kv;", line = 24)
	public static Class44 method1411(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class44 local3 = Class269.method25286(arg0);
		@Pc(7) int local7 = arg0.method20375();
		@Pc(11) int local11 = arg0.method20375();
		@Pc(15) int local15 = arg0.method20375();
		@Pc(19) int local19 = arg0.method20375();
		@Pc(23) int local23 = arg0.method20375();
		@Pc(27) int local27 = arg0.method20375();
		return new Class44_Sub2(local3.aClass277_8, local3.aClass276_7, local3.anInt2200 * 55371565, local3.anInt2195 * 2009354057, local3.anInt2198 * 338285097, local3.anInt2199 * -1628722519, local3.anInt2196 * -1540009787, local3.anInt2197 * 1924731995, local3.anInt2201 * 328557495, local7, local11, local15, local19, local23, local27);
	}

	@OriginalMember(owner = "client!abb", name = "r", descriptor = "(CIIIZ)V", line = 32)
	@Override
	void method3295(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_3.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray25[arg0];
		arg2 += this.anIntArray24[arg0];
		@Pc(24) int local24 = this.anIntArray22[arg0];
		@Pc(29) int local29 = this.anIntArray23[arg0];
		@Pc(35) int local35 = this.aClass21_Sub1_3.anInt287 * -355627019;
		@Pc(41) int local41 = local35 * arg2 + arg1;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass21_Sub1_3.anInt273 * 1850088287) {
			local64 = this.aClass21_Sub1_3.anInt273 * 1850088287 - arg2;
			local29 -= local64;
			arg2 = this.aClass21_Sub1_3.anInt273 * 1850088287;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass21_Sub1_3.anInt274 * 2066290591) {
			local29 -= local29 + arg2 - this.aClass21_Sub1_3.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_3.anInt272 * 45613833) {
			local64 = this.aClass21_Sub1_3.anInt272 * 45613833 - arg1;
			local24 -= local64;
			arg1 = this.aClass21_Sub1_3.anInt272 * 45613833;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 + arg1 > this.aClass21_Sub1_3.anInt278 * -886740031) {
			local64 = local24 + arg1 - this.aClass21_Sub1_3.anInt278 * -886740031;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 <= 0 || local29 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method1401(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method1404(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!abb", name = "q", descriptor = "(CIIIZ)V", line = 32)
	@Override
	void method3306(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_3.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray25[arg0];
		arg2 += this.anIntArray24[arg0];
		@Pc(24) int local24 = this.anIntArray22[arg0];
		@Pc(29) int local29 = this.anIntArray23[arg0];
		@Pc(35) int local35 = this.aClass21_Sub1_3.anInt287 * -355627019;
		@Pc(41) int local41 = local35 * arg2 + arg1;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass21_Sub1_3.anInt273 * 1850088287) {
			local64 = this.aClass21_Sub1_3.anInt273 * 1850088287 - arg2;
			local29 -= local64;
			arg2 = this.aClass21_Sub1_3.anInt273 * 1850088287;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass21_Sub1_3.anInt274 * 2066290591) {
			local29 -= local29 + arg2 - this.aClass21_Sub1_3.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_3.anInt272 * 45613833) {
			local64 = this.aClass21_Sub1_3.anInt272 * 45613833 - arg1;
			local24 -= local64;
			arg1 = this.aClass21_Sub1_3.anInt272 * 45613833;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 + arg1 > this.aClass21_Sub1_3.anInt278 * -886740031) {
			local64 = local24 + arg1 - this.aClass21_Sub1_3.anInt278 * -886740031;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 <= 0 || local29 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method1401(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method1404(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!abb", name = "m", descriptor = "(CIIIZ)V", line = 32)
	@Override
	void method3298(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_3.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray25[arg0];
		arg2 += this.anIntArray24[arg0];
		@Pc(24) int local24 = this.anIntArray22[arg0];
		@Pc(29) int local29 = this.anIntArray23[arg0];
		@Pc(35) int local35 = this.aClass21_Sub1_3.anInt287 * -355627019;
		@Pc(41) int local41 = local35 * arg2 + arg1;
		@Pc(45) int local45 = local35 - local24;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(64) int local64;
		if (arg2 < this.aClass21_Sub1_3.anInt273 * 1850088287) {
			local64 = this.aClass21_Sub1_3.anInt273 * 1850088287 - arg2;
			local29 -= local64;
			arg2 = this.aClass21_Sub1_3.anInt273 * 1850088287;
			local49 += local64 * local24;
			local41 += local35 * local64;
		}
		if (local29 + arg2 > this.aClass21_Sub1_3.anInt274 * 2066290591) {
			local29 -= local29 + arg2 - this.aClass21_Sub1_3.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_3.anInt272 * 45613833) {
			local64 = this.aClass21_Sub1_3.anInt272 * 45613833 - arg1;
			local24 -= local64;
			arg1 = this.aClass21_Sub1_3.anInt272 * 45613833;
			local49 += local64;
			local41 += local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 + arg1 > this.aClass21_Sub1_3.anInt278 * -886740031) {
			local64 = local24 + arg1 - this.aClass21_Sub1_3.anInt278 * -886740031;
			local24 -= local64;
			local47 += local64;
			local45 += local64;
		}
		if (local24 <= 0 || local29 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method1401(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method1404(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local49, local41, local24, local29, local45, local47);
		}
	}

	@OriginalMember(owner = "client!abb", name = "bb", descriptor = "([B[IIIIIIII)V", line = 71)
	void method1399(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!abb", name = "bl", descriptor = "([B[IIIIIIII)V", line = 71)
	void method1400(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!abb", name = "bt", descriptor = "([B[IIIIIIII)V", line = 71)
	void method1401(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!abb", name = "by", descriptor = "([B[IIIIIIII)V", line = 71)
	void method1405(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!abb", name = "q", descriptor = "(Lclient!vs;I)V", line = 90)
	static void method1410(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29475(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!abb", name = "bk", descriptor = "([B[IIIIIIII)V", line = 94)
	void method1404(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = ((arg2 & 0xFF00) * local3 & 0xFF0000) + ((arg2 & 0xFF00FF) * local3 & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00) * local7 & 0xFF0000) + (local7 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abb", name = "bi", descriptor = "([B[IIIIIIII)V", line = 94)
	void method1407(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = ((arg2 & 0xFF00) * local3 & 0xFF0000) + ((arg2 & 0xFF00FF) * local3 & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00) * local7 & 0xFF0000) + (local7 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abb", name = "bu", descriptor = "([B[IIIIIIII)V", line = 94)
	void method1408(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		for (@Pc(10) int local10 = -arg6; local10 < 0; local10++) {
			for (@Pc(15) int local15 = -arg5; local15 < 0; local15++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(40) int local40 = ((arg2 & 0xFF00) * local3 & 0xFF0000) + ((arg2 & 0xFF00FF) * local3 & 0xFF00FF00) >> 8;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = (((local44 & 0xFF00) * local7 & 0xFF0000) + (local7 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8) + local40;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abb", name = "d", descriptor = "(CIIIZLclient!ch;II)V", line = 111)
	@Override
	void method3328(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_3.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray25[arg0];
		arg2 += this.anIntArray24[arg0];
		@Pc(33) int local33 = this.anIntArray22[arg0];
		@Pc(38) int local38 = this.anIntArray23[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_3.anInt287 * -355627019;
		@Pc(50) int local50 = arg1 + local44 * arg2;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_3.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_3.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_3.anInt273 * 1850088287;
			local58 += local73 * local33;
			local50 += local73 * local44;
		}
		if (arg2 + local38 > this.aClass21_Sub1_3.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_3.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_3.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_3.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_3.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_3.anInt278 * -886740031) {
			local73 = local33 + arg1 - this.aClass21_Sub1_3.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method1402(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		} else {
			this.method1403(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abb", name = "v", descriptor = "(CIIIZLclient!ch;II)V", line = 111)
	@Override
	void method3299(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_3.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray25[arg0];
		arg2 += this.anIntArray24[arg0];
		@Pc(33) int local33 = this.anIntArray22[arg0];
		@Pc(38) int local38 = this.anIntArray23[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_3.anInt287 * -355627019;
		@Pc(50) int local50 = arg1 + local44 * arg2;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_3.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_3.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_3.anInt273 * 1850088287;
			local58 += local73 * local33;
			local50 += local73 * local44;
		}
		if (arg2 + local38 > this.aClass21_Sub1_3.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_3.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_3.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_3.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_3.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_3.anInt278 * -886740031) {
			local73 = local33 + arg1 - this.aClass21_Sub1_3.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method1402(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		} else {
			this.method1403(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abb", name = "w", descriptor = "(CIIIZLclient!ch;II)V", line = 111)
	@Override
	void method3289(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_3.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray25[arg0];
		arg2 += this.anIntArray24[arg0];
		@Pc(33) int local33 = this.anIntArray22[arg0];
		@Pc(38) int local38 = this.anIntArray23[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_3.anInt287 * -355627019;
		@Pc(50) int local50 = arg1 + local44 * arg2;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_3.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_3.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_3.anInt273 * 1850088287;
			local58 += local73 * local33;
			local50 += local73 * local44;
		}
		if (arg2 + local38 > this.aClass21_Sub1_3.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_3.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_3.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_3.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_3.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_3.anInt278 * -886740031) {
			local73 = local33 + arg1 - this.aClass21_Sub1_3.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method1402(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		} else {
			this.method1403(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abb", name = "o", descriptor = "(CIIIZLclient!ch;II)V", line = 111)
	@Override
	void method3302(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_3.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray25[arg0];
		arg2 += this.anIntArray24[arg0];
		@Pc(33) int local33 = this.anIntArray22[arg0];
		@Pc(38) int local38 = this.anIntArray23[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_3.anInt287 * -355627019;
		@Pc(50) int local50 = arg1 + local44 * arg2;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_3.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_3.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_3.anInt273 * 1850088287;
			local58 += local73 * local33;
			local50 += local73 * local44;
		}
		if (arg2 + local38 > this.aClass21_Sub1_3.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_3.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_3.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_3.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_3.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_3.anInt278 * -886740031) {
			local73 = local33 + arg1 - this.aClass21_Sub1_3.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method1402(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		} else {
			this.method1403(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abb", name = "t", descriptor = "(CIIIZLclient!ch;II)V", line = 111)
	@Override
	void method3300(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_3.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray25[arg0];
		arg2 += this.anIntArray24[arg0];
		@Pc(33) int local33 = this.anIntArray22[arg0];
		@Pc(38) int local38 = this.anIntArray23[arg0];
		@Pc(44) int local44 = this.aClass21_Sub1_3.anInt287 * -355627019;
		@Pc(50) int local50 = arg1 + local44 * arg2;
		@Pc(54) int local54 = local44 - local33;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(73) int local73;
		if (arg2 < this.aClass21_Sub1_3.anInt273 * 1850088287) {
			local73 = this.aClass21_Sub1_3.anInt273 * 1850088287 - arg2;
			local38 -= local73;
			arg2 = this.aClass21_Sub1_3.anInt273 * 1850088287;
			local58 += local73 * local33;
			local50 += local73 * local44;
		}
		if (arg2 + local38 > this.aClass21_Sub1_3.anInt274 * 2066290591) {
			local38 -= arg2 + local38 - this.aClass21_Sub1_3.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_3.anInt272 * 45613833) {
			local73 = this.aClass21_Sub1_3.anInt272 * 45613833 - arg1;
			local33 -= local73;
			arg1 = this.aClass21_Sub1_3.anInt272 * 45613833;
			local58 += local73;
			local50 += local73;
			local56 += local73;
			local54 += local73;
		}
		if (arg1 + local33 > this.aClass21_Sub1_3.anInt278 * -886740031) {
			local73 = local33 + arg1 - this.aClass21_Sub1_3.anInt278 * -886740031;
			local33 -= local73;
			local56 += local73;
			local54 += local73;
		}
		if (local33 <= 0 || local38 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method1402(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		} else {
			this.method1403(this.aByteArrayArray1[arg0], this.aClass21_Sub1_3.anIntArray39, arg3, local58, local50, local33, local38, local54, local56, arg1, arg2, this.anIntArray22[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abb", name = "bg", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 154)
	void method1402(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(10) int local10 = arg10;
		if (arg14 > arg10) {
			local10 = arg14;
			arg4 += (arg14 - arg10) * -355627019 * this.aClass21_Sub1_3.anInt287;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(52) int local52 = local5.length + arg14 < arg6 + arg10 ? arg14 + local5.length : arg10 + arg6;
		for (@Pc(54) int local54 = local10; local54 < local52; local54++) {
			@Pc(65) int local65 = arg13 + local5[local54 - arg14];
			@Pc(71) int local71 = local8[local54 - arg14];
			@Pc(73) int local73 = arg5;
			@Pc(80) int local80;
			if (arg9 > local65) {
				local80 = arg9 - local65;
				if (local80 >= local71) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
					continue;
				}
				local71 -= local80;
			} else {
				local80 = local65 - arg9;
				if (local80 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
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
			arg3 += local80 + arg8;
			arg4 += local80 + arg7;
		}
	}

	@OriginalMember(owner = "client!abb", name = "br", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 201)
	void method1403(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_3.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass21_Sub1_3.anInt287 * -355627019;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
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
					arg4 += arg5 + arg7;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
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
					@Pc(189) int local189 = ((arg2 & 0xFF00) * local64 & 0xFF0000) + ((arg2 & 0xFF00FF) * local64 & 0xFF00FF00) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00FF) * local68 & 0xFF00FF00) + (local68 * (local193 & 0xFF00) & 0xFF0000) >> 8) + local189;
				}
			}
			arg3 += arg8 + local96;
			arg4 += local96 + arg7;
		}
	}

	@OriginalMember(owner = "client!abb", name = "ba", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 201)
	void method1406(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_3.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass21_Sub1_3.anInt287 * -355627019;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
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
					arg4 += arg5 + arg7;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
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
					@Pc(189) int local189 = ((arg2 & 0xFF00) * local64 & 0xFF0000) + ((arg2 & 0xFF00FF) * local64 & 0xFF00FF00) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00FF) * local68 & 0xFF00FF00) + (local68 * (local193 & 0xFF00) & 0xFF0000) >> 8) + local189;
				}
			}
			arg3 += arg8 + local96;
			arg4 += local96 + arg7;
		}
	}

	@OriginalMember(owner = "client!abb", name = "bo", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 201)
	void method1409(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_3.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass21_Sub1_3.anInt287 * -355627019;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(60) int local60 = local5.length + arg14 < arg6 + arg10 ? local5.length + arg14 : arg10 + arg6;
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
					arg4 += arg5 + arg7;
					continue;
				}
				local87 -= local96;
			} else {
				local96 = local81 - local16;
				if (local96 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
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
					@Pc(189) int local189 = ((arg2 & 0xFF00) * local64 & 0xFF0000) + ((arg2 & 0xFF00FF) * local64 & 0xFF00FF00) >> 8;
					@Pc(193) int local193 = arg1[arg4];
					arg1[arg4++] = (((local193 & 0xFF00FF) * local68 & 0xFF00FF00) + (local68 * (local193 & 0xFF00) & 0xFF0000) >> 8) + local189;
				}
			}
			arg3 += arg8 + local96;
			arg4 += local96 + arg7;
		}
	}

	@OriginalMember(owner = "client!abb", name = "hp", descriptor = "(Lclient!act;I)V", line = 4148)
	static final void method1412(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class71_Sub1 local2 = arg0.aClass71_Sub1_3;
		if (local2.method20021() && local2.method20042(1) && local2.method20039()) {
			if (local2.aBoolean351) {
				local2.method20029(arg0.method16690().method28322(), false, true);
				local2.aBoolean351 = local2.method20021();
			}
			local2.method20041();
		}
		for (@Pc(38) int local38 = 0; local38 < arg0.aClass384Array3.length; local38++) {
			if (arg0.aClass384Array3[local38].anInt4716 * 1164757693 != -1) {
				@Pc(58) Class71 local58 = arg0.aClass384Array3[local38].aClass71_7;
				if (local58.method20032()) {
					@Pc(73) Class520 local73 = Class19.aClass523_14.method29823(arg0.aClass384Array3[local38].anInt4716 * 1164757693);
					@Pc(77) Class440 local77 = local58.method20069();
					if (local73.aBoolean820) {
						if (local77.anInt4935 * 394312291 == 3) {
							if (arg0.anInt2385 * -1943098143 > 0 && arg0.anInt2372 * 1696493467 <= client.anInt3034 && arg0.anInt2386 * -557111183 < client.anInt3034) {
								local58.method20038(-1);
								arg0.aClass384Array3[local38].anInt4716 = -1212547221;
								continue;
							}
						} else if (local77.anInt4935 * 394312291 == 1 && arg0.anInt2385 * -1943098143 > 0 && arg0.anInt2372 * 1696493467 <= client.anInt3034 && arg0.anInt2386 * -557111183 < client.anInt3034) {
							continue;
						}
					}
				}
				if (local58.method20042(1) && local58.method20039()) {
					local58.method20038(-1);
					arg0.aClass384Array3[local38].anInt4716 = -1212547221;
				}
			}
		}
		@Pc(162) Class71 local162 = arg0.aClass71_3;
		if (local162.method20021()) {
			label84: {
				@Pc(170) Class440 local170 = local162.method20069();
				if (local170.anInt4935 * 394312291 == 3) {
					if (arg0.anInt2385 * -1943098143 > 0 && arg0.anInt2372 * 1696493467 <= client.anInt3034 && arg0.anInt2386 * -557111183 < client.anInt3034) {
						arg0.anIntArray234 = null;
						local162.method20038(-1);
						break label84;
					}
				} else if (local170.anInt4935 * 394312291 == 1) {
					if (arg0.anInt2385 * -1943098143 > 0 && arg0.anInt2372 * 1696493467 <= client.anInt3034 && arg0.anInt2386 * -557111183 < client.anInt3034) {
						local162.method20025(1);
						break label84;
					}
					local162.method20025(0);
				}
				if (local162.method20042(1) && local162.method20039()) {
					arg0.anIntArray234 = null;
					local162.method20038(-1);
				}
			}
		}
		for (@Pc(251) int local251 = 0; local251 < arg0.aClass71_Sub3_Sub1Array3.length; local251++) {
			@Pc(261) Class71_Sub3_Sub1 local261 = arg0.aClass71_Sub3_Sub1Array3[local251];
			if (local261 != null) {
				if (local261.anInt2772 * -1175960209 > 0) {
					local261.anInt2772 -= -2110998129;
				} else if (local261.method20042(1) && local261.method20039()) {
					arg0.aClass71_Sub3_Sub1Array3[local251] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!abb", name = "atg", descriptor = "(Lclient!vs;I)V", line = 12430)
	static final void method1413(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method14599(local12);
	}
}
