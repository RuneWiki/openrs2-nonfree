package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abf")
public class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!abf", name = "e", descriptor = "Lclient!abl;")
	Class21_Sub1 aClass21_Sub1_4;

	@OriginalMember(owner = "client!abf", name = "d", descriptor = "[I")
	int[] anIntArray28;

	@OriginalMember(owner = "client!abf", name = "q", descriptor = "[I")
	int[] anIntArray29;

	@OriginalMember(owner = "client!abf", name = "r", descriptor = "[[B")
	byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!abf", name = "m", descriptor = "[I")
	int[] anIntArray30;

	@OriginalMember(owner = "client!abf", name = "v", descriptor = "[I")
	int[] anIntArray27;

	@OriginalMember(owner = "client!abf", name = "<init>", descriptor = "(Lclient!abl;Lclient!yx;[Lclient!abc;[I[I)V", line = 17)
	Class14_Sub3(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) Class15_Sub1[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass21_Sub1_4 = arg0;
		this.aClass21_Sub1_4 = arg0;
		this.anIntArray28 = arg3;
		this.anIntArray29 = arg4;
		this.aByteArrayArray2 = new byte[arg2.length][];
		this.anIntArray30 = new int[arg2.length];
		this.anIntArray27 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			@Pc(40) Class15_Sub1 local40 = arg2[local32];
			if (local40.aByteArray2 == null) {
				@Pc(53) byte[] local53 = local40.aByteArray1;
				@Pc(62) byte[] local62 = this.aByteArrayArray2[local32] = new byte[local53.length];
				for (@Pc(64) int local64 = 0; local64 < local53.length; local64++) {
					local62[local64] = (byte) (local53[local64] == 0 ? 0 : -1);
				}
			} else {
				this.aByteArrayArray2[local32] = local40.aByteArray2;
			}
			this.anIntArray30[local32] = local40.anInt167;
			this.anIntArray27[local32] = local40.anInt166;
		}
	}

	@OriginalMember(owner = "client!abf", name = "r", descriptor = "(CIIIZ)V", line = 39)
	@Override
	void method3295(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_4.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray27[arg0];
		arg2 += this.anIntArray30[arg0];
		@Pc(23) int local23 = this.anIntArray28[arg0];
		@Pc(28) int local28 = this.anIntArray29[arg0];
		@Pc(34) int local34 = this.aClass21_Sub1_4.anInt287 * -355627019;
		@Pc(40) int local40 = local34 * arg2 + arg1;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass21_Sub1_4.anInt273 * 1850088287) {
			local63 = this.aClass21_Sub1_4.anInt273 * 1850088287 - arg2;
			local28 -= local63;
			arg2 = this.aClass21_Sub1_4.anInt273 * 1850088287;
			local48 += local63 * local23;
			local40 += local63 * local34;
		}
		if (arg2 + local28 > this.aClass21_Sub1_4.anInt274 * 2066290591) {
			local28 -= local28 + arg2 - this.aClass21_Sub1_4.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_4.anInt272 * 45613833) {
			local63 = this.aClass21_Sub1_4.anInt272 * 45613833 - arg1;
			local23 -= local63;
			arg1 = this.aClass21_Sub1_4.anInt272 * 45613833;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (arg1 + local23 > this.aClass21_Sub1_4.anInt278 * -886740031) {
			local63 = local23 + arg1 - this.aClass21_Sub1_4.anInt278 * -886740031;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 > 0 && local28 > 0) {
			this.method1670(this.aByteArrayArray2[arg0], this.aClass21_Sub1_4.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!abf", name = "q", descriptor = "(CIIIZ)V", line = 39)
	@Override
	void method3306(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_4.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray27[arg0];
		arg2 += this.anIntArray30[arg0];
		@Pc(23) int local23 = this.anIntArray28[arg0];
		@Pc(28) int local28 = this.anIntArray29[arg0];
		@Pc(34) int local34 = this.aClass21_Sub1_4.anInt287 * -355627019;
		@Pc(40) int local40 = local34 * arg2 + arg1;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass21_Sub1_4.anInt273 * 1850088287) {
			local63 = this.aClass21_Sub1_4.anInt273 * 1850088287 - arg2;
			local28 -= local63;
			arg2 = this.aClass21_Sub1_4.anInt273 * 1850088287;
			local48 += local63 * local23;
			local40 += local63 * local34;
		}
		if (arg2 + local28 > this.aClass21_Sub1_4.anInt274 * 2066290591) {
			local28 -= local28 + arg2 - this.aClass21_Sub1_4.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_4.anInt272 * 45613833) {
			local63 = this.aClass21_Sub1_4.anInt272 * 45613833 - arg1;
			local23 -= local63;
			arg1 = this.aClass21_Sub1_4.anInt272 * 45613833;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (arg1 + local23 > this.aClass21_Sub1_4.anInt278 * -886740031) {
			local63 = local23 + arg1 - this.aClass21_Sub1_4.anInt278 * -886740031;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 > 0 && local28 > 0) {
			this.method1670(this.aByteArrayArray2[arg0], this.aClass21_Sub1_4.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!abf", name = "m", descriptor = "(CIIIZ)V", line = 39)
	@Override
	void method3298(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub1_4.anIntArray39 == null) {
			return;
		}
		arg1 += this.anIntArray27[arg0];
		arg2 += this.anIntArray30[arg0];
		@Pc(23) int local23 = this.anIntArray28[arg0];
		@Pc(28) int local28 = this.anIntArray29[arg0];
		@Pc(34) int local34 = this.aClass21_Sub1_4.anInt287 * -355627019;
		@Pc(40) int local40 = local34 * arg2 + arg1;
		@Pc(44) int local44 = local34 - local23;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(63) int local63;
		if (arg2 < this.aClass21_Sub1_4.anInt273 * 1850088287) {
			local63 = this.aClass21_Sub1_4.anInt273 * 1850088287 - arg2;
			local28 -= local63;
			arg2 = this.aClass21_Sub1_4.anInt273 * 1850088287;
			local48 += local63 * local23;
			local40 += local63 * local34;
		}
		if (arg2 + local28 > this.aClass21_Sub1_4.anInt274 * 2066290591) {
			local28 -= local28 + arg2 - this.aClass21_Sub1_4.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_4.anInt272 * 45613833) {
			local63 = this.aClass21_Sub1_4.anInt272 * 45613833 - arg1;
			local23 -= local63;
			arg1 = this.aClass21_Sub1_4.anInt272 * 45613833;
			local48 += local63;
			local40 += local63;
			local46 += local63;
			local44 += local63;
		}
		if (arg1 + local23 > this.aClass21_Sub1_4.anInt278 * -886740031) {
			local63 = local23 + arg1 - this.aClass21_Sub1_4.anInt278 * -886740031;
			local23 -= local63;
			local46 += local63;
			local44 += local63;
		}
		if (local23 > 0 && local28 > 0) {
			this.method1670(this.aByteArrayArray2[arg0], this.aClass21_Sub1_4.anIntArray39, arg3, local48, local40, local23, local28, local44, local46);
		}
	}

	@OriginalMember(owner = "client!abf", name = "bg", descriptor = "([B[IIIIIIII)V", line = 77)
	void method1669(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(36) int local36 = ((arg2 & 0xFF00) * local16 & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local36 + ((local16 * (local44 & 0xFF00FF) & 0xFF00FF00) + (local16 * (local44 & 0xFF00) & 0xFF0000) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abf", name = "bt", descriptor = "([B[IIIIIIII)V", line = 77)
	void method1670(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(36) int local36 = ((arg2 & 0xFF00) * local16 & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local36 + ((local16 * (local44 & 0xFF00FF) & 0xFF00FF00) + (local16 * (local44 & 0xFF00) & 0xFF0000) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abf", name = "br", descriptor = "([B[IIIIIIII)V", line = 77)
	void method1674(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg0[arg3++] & 0xFF;
				if (local16 == 0) {
					arg4++;
				} else {
					@Pc(36) int local36 = ((arg2 & 0xFF00) * local16 & 0xFF0000) + (local16 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local16 = 256 - local16;
					@Pc(44) int local44 = arg1[arg4];
					arg1[arg4++] = local36 + ((local16 * (local44 & 0xFF00FF) & 0xFF00FF00) + (local16 * (local44 & 0xFF00) & 0xFF0000) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!abf", name = "d", descriptor = "(CIIIZLclient!ch;II)V", line = 94)
	@Override
	void method3328(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_4.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray27[arg0];
		arg2 += this.anIntArray30[arg0];
		@Pc(34) int local34 = this.anIntArray28[arg0];
		@Pc(39) int local39 = this.anIntArray29[arg0];
		@Pc(45) int local45 = this.aClass21_Sub1_4.anInt287 * -355627019;
		@Pc(51) int local51 = local45 * arg2 + arg1;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass21_Sub1_4.anInt273 * 1850088287) {
			local74 = this.aClass21_Sub1_4.anInt273 * 1850088287 - arg2;
			local39 -= local74;
			arg2 = this.aClass21_Sub1_4.anInt273 * 1850088287;
			local59 += local74 * local34;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass21_Sub1_4.anInt274 * 2066290591) {
			local39 -= arg2 + local39 - this.aClass21_Sub1_4.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_4.anInt272 * 45613833) {
			local74 = this.aClass21_Sub1_4.anInt272 * 45613833 - arg1;
			local34 -= local74;
			arg1 = this.aClass21_Sub1_4.anInt272 * 45613833;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass21_Sub1_4.anInt278 * -886740031) {
			local74 = arg1 + local34 - this.aClass21_Sub1_4.anInt278 * -886740031;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 > 0 && local39 > 0) {
			this.method1672(this.aByteArrayArray2[arg0], this.aClass21_Sub1_4.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray28[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abf", name = "v", descriptor = "(CIIIZLclient!ch;II)V", line = 94)
	@Override
	void method3299(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_4.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray27[arg0];
		arg2 += this.anIntArray30[arg0];
		@Pc(34) int local34 = this.anIntArray28[arg0];
		@Pc(39) int local39 = this.anIntArray29[arg0];
		@Pc(45) int local45 = this.aClass21_Sub1_4.anInt287 * -355627019;
		@Pc(51) int local51 = local45 * arg2 + arg1;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass21_Sub1_4.anInt273 * 1850088287) {
			local74 = this.aClass21_Sub1_4.anInt273 * 1850088287 - arg2;
			local39 -= local74;
			arg2 = this.aClass21_Sub1_4.anInt273 * 1850088287;
			local59 += local74 * local34;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass21_Sub1_4.anInt274 * 2066290591) {
			local39 -= arg2 + local39 - this.aClass21_Sub1_4.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_4.anInt272 * 45613833) {
			local74 = this.aClass21_Sub1_4.anInt272 * 45613833 - arg1;
			local34 -= local74;
			arg1 = this.aClass21_Sub1_4.anInt272 * 45613833;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass21_Sub1_4.anInt278 * -886740031) {
			local74 = arg1 + local34 - this.aClass21_Sub1_4.anInt278 * -886740031;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 > 0 && local39 > 0) {
			this.method1672(this.aByteArrayArray2[arg0], this.aClass21_Sub1_4.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray28[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abf", name = "t", descriptor = "(CIIIZLclient!ch;II)V", line = 94)
	@Override
	void method3300(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_4.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray27[arg0];
		arg2 += this.anIntArray30[arg0];
		@Pc(34) int local34 = this.anIntArray28[arg0];
		@Pc(39) int local39 = this.anIntArray29[arg0];
		@Pc(45) int local45 = this.aClass21_Sub1_4.anInt287 * -355627019;
		@Pc(51) int local51 = local45 * arg2 + arg1;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass21_Sub1_4.anInt273 * 1850088287) {
			local74 = this.aClass21_Sub1_4.anInt273 * 1850088287 - arg2;
			local39 -= local74;
			arg2 = this.aClass21_Sub1_4.anInt273 * 1850088287;
			local59 += local74 * local34;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass21_Sub1_4.anInt274 * 2066290591) {
			local39 -= arg2 + local39 - this.aClass21_Sub1_4.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_4.anInt272 * 45613833) {
			local74 = this.aClass21_Sub1_4.anInt272 * 45613833 - arg1;
			local34 -= local74;
			arg1 = this.aClass21_Sub1_4.anInt272 * 45613833;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass21_Sub1_4.anInt278 * -886740031) {
			local74 = arg1 + local34 - this.aClass21_Sub1_4.anInt278 * -886740031;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 > 0 && local39 > 0) {
			this.method1672(this.aByteArrayArray2[arg0], this.aClass21_Sub1_4.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray28[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abf", name = "w", descriptor = "(CIIIZLclient!ch;II)V", line = 94)
	@Override
	void method3289(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_4.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray27[arg0];
		arg2 += this.anIntArray30[arg0];
		@Pc(34) int local34 = this.anIntArray28[arg0];
		@Pc(39) int local39 = this.anIntArray29[arg0];
		@Pc(45) int local45 = this.aClass21_Sub1_4.anInt287 * -355627019;
		@Pc(51) int local51 = local45 * arg2 + arg1;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass21_Sub1_4.anInt273 * 1850088287) {
			local74 = this.aClass21_Sub1_4.anInt273 * 1850088287 - arg2;
			local39 -= local74;
			arg2 = this.aClass21_Sub1_4.anInt273 * 1850088287;
			local59 += local74 * local34;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass21_Sub1_4.anInt274 * 2066290591) {
			local39 -= arg2 + local39 - this.aClass21_Sub1_4.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_4.anInt272 * 45613833) {
			local74 = this.aClass21_Sub1_4.anInt272 * 45613833 - arg1;
			local34 -= local74;
			arg1 = this.aClass21_Sub1_4.anInt272 * 45613833;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass21_Sub1_4.anInt278 * -886740031) {
			local74 = arg1 + local34 - this.aClass21_Sub1_4.anInt278 * -886740031;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 > 0 && local39 > 0) {
			this.method1672(this.aByteArrayArray2[arg0], this.aClass21_Sub1_4.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray28[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abf", name = "o", descriptor = "(CIIIZLclient!ch;II)V", line = 94)
	@Override
	void method3302(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub1_4.anIntArray39 == null) {
			return;
		}
		if (arg5 == null) {
			this.method3295(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray27[arg0];
		arg2 += this.anIntArray30[arg0];
		@Pc(34) int local34 = this.anIntArray28[arg0];
		@Pc(39) int local39 = this.anIntArray29[arg0];
		@Pc(45) int local45 = this.aClass21_Sub1_4.anInt287 * -355627019;
		@Pc(51) int local51 = local45 * arg2 + arg1;
		@Pc(55) int local55 = local45 - local34;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(74) int local74;
		if (arg2 < this.aClass21_Sub1_4.anInt273 * 1850088287) {
			local74 = this.aClass21_Sub1_4.anInt273 * 1850088287 - arg2;
			local39 -= local74;
			arg2 = this.aClass21_Sub1_4.anInt273 * 1850088287;
			local59 += local74 * local34;
			local51 += local45 * local74;
		}
		if (local39 + arg2 > this.aClass21_Sub1_4.anInt274 * 2066290591) {
			local39 -= arg2 + local39 - this.aClass21_Sub1_4.anInt274 * 2066290591;
		}
		if (arg1 < this.aClass21_Sub1_4.anInt272 * 45613833) {
			local74 = this.aClass21_Sub1_4.anInt272 * 45613833 - arg1;
			local34 -= local74;
			arg1 = this.aClass21_Sub1_4.anInt272 * 45613833;
			local59 += local74;
			local51 += local74;
			local57 += local74;
			local55 += local74;
		}
		if (arg1 + local34 > this.aClass21_Sub1_4.anInt278 * -886740031) {
			local74 = arg1 + local34 - this.aClass21_Sub1_4.anInt278 * -886740031;
			local34 -= local74;
			local57 += local74;
			local55 += local74;
		}
		if (local34 > 0 && local39 > 0) {
			this.method1672(this.aByteArrayArray2[arg0], this.aClass21_Sub1_4.anIntArray39, arg3, local59, local51, local34, local39, local55, local57, arg1, arg2, this.anIntArray28[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!abf", name = "bb", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 136)
	void method1671(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_4.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass21_Sub1_4.anInt287 * -355627019;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
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
					arg3 += arg5 + arg8;
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
					@Pc(186) int local186 = ((arg2 & 0xFF00) * local165 & 0xFF0000) + (local165 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local165 = 256 - local165;
					@Pc(194) int local194 = arg1[arg4];
					arg1[arg4++] = (((local194 & 0xFF00) * local165 & 0xFF0000) + (local165 * (local194 & 0xFF00FF) & 0xFF00FF00) >> 8) + local186;
				}
			}
			arg3 += local88 + arg8;
			arg4 += arg7 + local88;
		}
	}

	@OriginalMember(owner = "client!abf", name = "bk", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 136)
	void method1672(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_4.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass21_Sub1_4.anInt287 * -355627019;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
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
					arg3 += arg5 + arg8;
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
					@Pc(186) int local186 = ((arg2 & 0xFF00) * local165 & 0xFF0000) + (local165 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local165 = 256 - local165;
					@Pc(194) int local194 = arg1[arg4];
					arg1[arg4++] = (((local194 & 0xFF00) * local165 & 0xFF0000) + (local165 * (local194 & 0xFF00FF) & 0xFF00FF00) >> 8) + local186;
				}
			}
			arg3 += local88 + arg8;
			arg4 += arg7 + local88;
		}
	}

	@OriginalMember(owner = "client!abf", name = "by", descriptor = "([B[IIIIIIIIIIILclient!ch;II)V", line = 136)
	void method1673(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class5_Sub3 local2 = (Class5_Sub3) arg12;
		@Pc(5) int[] local5 = local2.anIntArray11;
		@Pc(8) int[] local8 = local2.anIntArray12;
		@Pc(16) int local16 = arg9 - this.aClass21_Sub1_4.anInt272 * 45613833;
		@Pc(18) int local18 = arg10;
		if (arg14 > arg10) {
			local18 = arg14;
			arg4 += (arg14 - arg10) * this.aClass21_Sub1_4.anInt287 * -355627019;
			arg3 += arg11 * (arg14 - arg10);
		}
		@Pc(60) int local60 = arg14 + local5.length < arg10 + arg6 ? local5.length + arg14 : arg6 + arg10;
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
					arg3 += arg5 + arg8;
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
					@Pc(186) int local186 = ((arg2 & 0xFF00) * local165 & 0xFF0000) + (local165 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
					local165 = 256 - local165;
					@Pc(194) int local194 = arg1[arg4];
					arg1[arg4++] = (((local194 & 0xFF00) * local165 & 0xFF0000) + (local165 * (local194 & 0xFF00FF) & 0xFF00FF00) >> 8) + local186;
				}
			}
			arg3 += local88 + arg8;
			arg4 += arg7 + local88;
		}
	}
}
