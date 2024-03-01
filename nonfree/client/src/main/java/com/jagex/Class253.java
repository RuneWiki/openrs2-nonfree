package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public class Class253 {

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "F")
	static float aFloat253;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	final int anInt4184 = 64;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	final int anInt4185 = 768;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
	final int anInt4183 = 1600;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	final int anInt4186 = Class356.method26652(1600);

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
	final int anInt4188 = 64;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
	int[] anIntArray403 = new int[8191];

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
	int[] anIntArray401 = new int[1600];

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "[I")
	int[] anIntArray402 = new int[64];

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[[Lclient!alj;")
	Class53_Sub1_Sub1[][] aClass53_Sub1_Sub1ArrayArray4 = new Class53_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "[[Lclient!alj;")
	Class53_Sub1_Sub1[][] aClass53_Sub1_Sub1ArrayArray3 = new Class53_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	int anInt4187 = 0;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!iy;")
	Class37 aClass37_24;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!if;")
	Interface21 anInterface21_20;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!if;")
	Interface21 anInterface21_19;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!jw;")
	Interface30 anInterface30_8;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!abv;)V", line = 30)
	Class253(@OriginalArg(0) Class21_Sub3 arg0) {
		this.aClass37_24 = arg0.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_5, Class240.aClass240_7 }), new Class252(Class240.aClass240_2) });
		this.anInterface21_20 = arg0.method17542(true);
		this.anInterface21_19 = arg0.method17542(false);
		this.anInterface21_19.method25687(393168, 12);
		this.anInterface30_8 = arg0.method17648(false);
		this.anInterface30_8.method25720(49146);
		@Pc(104) ByteBuffer local104 = arg0.aByteBuffer4;
		local104.clear();
		@Pc(109) int local109;
		for (local109 = 0; local109 < 8191; local109++) {
			@Pc(116) int local116 = local109 * 4;
			local104.putShort((short) local116);
			local104.putShort((short) (local116 + 1));
			local104.putShort((short) (local116 + 2));
			local104.putShort((short) (local116 + 2));
			local104.putShort((short) (local116 + 3));
			local104.putShort((short) local116);
		}
		this.anInterface30_8.method25705(0, local104.position(), arg0.aLong101);
		local104.clear();
		for (local109 = 0; local109 < 8191; local109++) {
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
		}
		this.anInterface21_19.method25705(0, local104.position(), arg0.aLong101);
	}

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "(Lclient!abv;)V", line = 68)
	void method25212(@OriginalArg(0) Class21_Sub3 arg0) {
		this.anInterface21_20.method25687(786336, 24);
	}

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "(Lclient!abv;)V", line = 68)
	void method25224(@OriginalArg(0) Class21_Sub3 arg0) {
		this.anInterface21_20.method25687(786336, 24);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()V", line = 72)
	void method25214() {
		this.anInterface21_20.method27209();
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(Lclient!abv;Lclient!dk;)V", line = 76)
	void method25216(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class128 arg1) {
		arg0.method17108(false);
		aFloat253 = arg0.aFloat197;
		@Pc(11) float local11 = arg0.aClass328_78.aFloatArray106[2];
		@Pc(17) float local17 = arg0.aClass328_78.aFloatArray106[6];
		@Pc(23) float local23 = arg0.aClass328_78.aFloatArray106[10];
		@Pc(29) float local29 = arg0.aClass328_78.aFloatArray106[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class53_Sub1 local39 = arg1.aClass551_1.aClass53_Sub1_8;
		@Pc(75) int local75;
		for (@Pc(42) Class53_Sub1 local42 = local39.aClass53_Sub1_6; local42 != local39; local42 = local42.aClass53_Sub1_6) {
			@Pc(48) Class53_Sub1_Sub1 local48 = (Class53_Sub1_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt2819 >> 12) + local17 * (float) (local48.anInt2814 >> 12) + local23 * (float) (local48.anInt2816 >> 12) + local29);
			if (local75 > local35) {
				local35 = local75;
			}
			if (local75 < local33) {
				local33 = local75;
			}
			this.anIntArray403[local31++] = local75;
		}
		@Pc(99) int local99 = local35 - local33;
		if (local99 + 2 > 1600) {
			local75 = Class356.method26652(local99) + 1 - this.anInt4186;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method17545(this.anInterface30_8);
		@Pc(130) Class39 local130 = arg0.aClass39_3;
		local130.method8254(Class328.aClass328_99);
		local130.aClass328_49.method26042();
		local130.anInt883 = -1;
		@Pc(146) boolean local146 = arg0.anInt2520 > 0;
		if (local146) {
			local130.aClass333_11.method26251(0.0F, 0.0F, 1.0F, -arg0.aFloat198);
			local130.aClass320_44.method25863((float) (arg0.anInt2519 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2519 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2519 >> 0 & 0xFF) / 255.0F);
			local130.aClass333_11.method26257(arg0.aClass328_79);
			local130.aClass333_11.method26256(1.0F / (arg0.aFloat199 - arg0.aFloat198));
		} else {
			local130.aClass333_11.method26251(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass320_44.method25863(0.0F, 0.0F, 0.0F);
		}
		this.method25215(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat197 != aFloat253) {
			arg0.method17111(aFloat253);
		}
		arg0.method17108(true);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lclient!abv;Lclient!afa;IIILclient!hw;Z)V", line = 126)
	void method25213(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class53_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class53_Sub1 local2 = arg1.aClass53_Sub1_6;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4187 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray401[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray402[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class53_Sub1_Sub1 local46 = (Class53_Sub1_Sub1) local2;
				if (local10) {
					local6 = local46.anInt2818;
					local8 = local46.aBoolean497;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt2818 || local8 != local46.aBoolean497)) {
					local10 = true;
					break;
				}
				this.method25220(this.anIntArray403[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass53_Sub1_6;
			}
			arg5.anInterface20_17 = null;
			if (local6 >= 0) {
				@Pc(96) Class133 local96 = arg0.aClass134_7.method22906(local6);
				if (local96.anInt3351 * -1410868471 != -1) {
					arg5.anInterface20_17 = arg0.aClass247_3.method24907(local96);
				}
			}
			if (local8 && arg0.aFloat197 != aFloat253) {
				arg0.method17111(aFloat253);
			} else if (arg0.aFloat197 != 1.0F) {
				arg0.method17111(1.0F);
			}
			this.method25217(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(Lclient!abv;Lclient!afa;IIILclient!hw;Z)V", line = 126)
	void method25215(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class53_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class53_Sub1 local2 = arg1.aClass53_Sub1_6;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4187 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray401[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray402[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class53_Sub1_Sub1 local46 = (Class53_Sub1_Sub1) local2;
				if (local10) {
					local6 = local46.anInt2818;
					local8 = local46.aBoolean497;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt2818 || local8 != local46.aBoolean497)) {
					local10 = true;
					break;
				}
				this.method25220(this.anIntArray403[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass53_Sub1_6;
			}
			arg5.anInterface20_17 = null;
			if (local6 >= 0) {
				@Pc(96) Class133 local96 = arg0.aClass134_7.method22906(local6);
				if (local96.anInt3351 * -1410868471 != -1) {
					arg5.anInterface20_17 = arg0.aClass247_3.method24907(local96);
				}
			}
			if (local8 && arg0.aFloat197 != aFloat253) {
				arg0.method17111(aFloat253);
			} else if (arg0.aFloat197 != 1.0F) {
				arg0.method17111(1.0F);
			}
			this.method25217(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "(Lclient!abv;Lclient!afa;IIILclient!hw;Z)V", line = 126)
	void method25218(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class53_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class53_Sub1 local2 = arg1.aClass53_Sub1_6;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4187 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray401[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray402[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class53_Sub1_Sub1 local46 = (Class53_Sub1_Sub1) local2;
				if (local10) {
					local6 = local46.anInt2818;
					local8 = local46.aBoolean497;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt2818 || local8 != local46.aBoolean497)) {
					local10 = true;
					break;
				}
				this.method25220(this.anIntArray403[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass53_Sub1_6;
			}
			arg5.anInterface20_17 = null;
			if (local6 >= 0) {
				@Pc(96) Class133 local96 = arg0.aClass134_7.method22906(local6);
				if (local96.anInt3351 * -1410868471 != -1) {
					arg5.anInterface20_17 = arg0.aClass247_3.method24907(local96);
				}
			}
			if (local8 && arg0.aFloat197 != aFloat253) {
				arg0.method17111(aFloat253);
			} else if (arg0.aFloat197 != 1.0F) {
				arg0.method17111(1.0F);
			}
			this.method25217(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "(Lclient!abv;Lclient!afa;IIILclient!hw;Z)V", line = 126)
	void method25219(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class53_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class53_Sub1 local2 = arg1.aClass53_Sub1_6;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4187 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray401[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray402[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class53_Sub1_Sub1 local46 = (Class53_Sub1_Sub1) local2;
				if (local10) {
					local6 = local46.anInt2818;
					local8 = local46.aBoolean497;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt2818 || local8 != local46.aBoolean497)) {
					local10 = true;
					break;
				}
				this.method25220(this.anIntArray403[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass53_Sub1_6;
			}
			arg5.anInterface20_17 = null;
			if (local6 >= 0) {
				@Pc(96) Class133 local96 = arg0.aClass134_7.method22906(local6);
				if (local96.anInt3351 * -1410868471 != -1) {
					arg5.anInterface20_17 = arg0.aClass247_3.method24907(local96);
				}
			}
			if (local8 && arg0.aFloat197 != aFloat253) {
				arg0.method17111(aFloat253);
			} else if (arg0.aFloat197 != 1.0F) {
				arg0.method17111(1.0F);
			}
			this.method25217(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(ILclient!alj;)V", line = 160)
	void method25220(@OriginalArg(0) int arg0, @OriginalArg(1) Class53_Sub1_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray401[arg0] < 64) {
			this.aClass53_Sub1_Sub1ArrayArray4[arg0][this.anIntArray401[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray401[arg0] == 64) {
			if (this.anInt4187 == 64) {
				return;
			}
			this.anIntArray401[arg0] += this.anInt4187++ + 1;
		}
		this.aClass53_Sub1_Sub1ArrayArray3[this.anIntArray401[arg0] - 64 - 1][this.anIntArray402[this.anIntArray401[arg0] - 64 - 1]++] = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(ILclient!alj;)V", line = 160)
	void method25221(@OriginalArg(0) int arg0, @OriginalArg(1) Class53_Sub1_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray401[arg0] < 64) {
			this.aClass53_Sub1_Sub1ArrayArray4[arg0][this.anIntArray401[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray401[arg0] == 64) {
			if (this.anInt4187 == 64) {
				return;
			}
			this.anIntArray401[arg0] += this.anInt4187++ + 1;
		}
		this.aClass53_Sub1_Sub1ArrayArray3[this.anIntArray401[arg0] - 64 - 1][this.anIntArray402[this.anIntArray401[arg0] - 64 - 1]++] = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "(Lclient!abv;IZ)V", line = 175)
	void method25211(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) Class328 local4 = arg0.aClass328_78;
		@Pc(9) float local9 = local4.aFloatArray106[0];
		@Pc(14) float local14 = local4.aFloatArray106[4];
		@Pc(19) float local19 = local4.aFloatArray106[8];
		@Pc(24) float local24 = local4.aFloatArray106[1];
		@Pc(29) float local29 = local4.aFloatArray106[5];
		@Pc(34) float local34 = local4.aFloatArray106[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass328_86.method26044(arg0.aClass328_92);
		@Pc(84) ByteBuffer local84 = arg0.aByteBuffer4;
		local84.clear();
		for (@Pc(91) int local91 = arg1 - 1; local91 >= 0; local91--) {
			@Pc(106) int local106 = this.anIntArray401[local91] > 64 ? 64 : this.anIntArray401[local91];
			if (local106 > 0) {
				@Pc(112) int local112;
				@Pc(134) byte local134;
				@Pc(137) byte local137;
				@Pc(142) byte local142;
				@Pc(147) byte local147;
				@Pc(163) float local163;
				@Pc(169) float local169;
				for (local112 = local106 - 1; local112 >= 0; local112--) {
					@Pc(121) Class53_Sub1_Sub1 local121 = this.aClass53_Sub1_Sub1ArrayArray4[local91][local112];
					@Pc(124) int local124 = local121.anInt2815;
					@Pc(129) byte local129 = (byte) (local124 >> 16);
					local134 = (byte) (local124 >> 8);
					local137 = (byte) local124;
					local142 = (byte) (local124 >>> 24);
					if (arg0.anInt2502 == 0) {
						local147 = local129;
						local129 = local137;
						local137 = local147;
					}
					@Pc(157) float local157 = (float) (local121.anInt2819 >> 12);
					local163 = local121.anInt2814 >> 12;
					local169 = local121.anInt2816 >> 12;
					@Pc(174) int local174 = local121.anInt2817 >> 12;
					if (local121.aShort79 == 0) {
						local84.putFloat(local157 + local38 * (float) -local174);
						local84.putFloat(local163 + local42 * (float) -local174);
						local84.putFloat(local169 + local46 * (float) -local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 + local62 * (float) local174);
						local84.putFloat(local163 + local66 * (float) local174);
						local84.putFloat(local169 + local70 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local38 * (float) local174);
						local84.putFloat(local163 + local42 * (float) local174);
						local84.putFloat(local169 + local46 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local50 * (float) local174);
						local84.putFloat(local163 + local54 * (float) local174);
						local84.putFloat(local169 + local58 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					} else {
						arg0.aClass328_88.method26075(local121.aShort79, local174, local174, 0.0F, 0.0F, 0.0F);
						arg0.aClass328_88.method26046(arg0.aClass328_86);
						arg0.aClass328_88.method26052(1.0F, 0.0F, 0.0F, local73);
						arg0.aClass328_88.method26052(0.0F, 1.0F, 0.0F, local76);
						local84.putFloat(local157 - local73[0] - local76[0]);
						local84.putFloat(local163 - local73[1] - local76[1]);
						local84.putFloat(local169 - local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 - local73[0] + local76[0]);
						local84.putFloat(local163 - local73[1] + local76[1]);
						local84.putFloat(local169 - local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] + local76[0]);
						local84.putFloat(local163 + local73[1] + local76[1]);
						local84.putFloat(local169 + local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] - local76[0]);
						local84.putFloat(local163 + local73[1] - local76[1]);
						local84.putFloat(local169 + local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					}
					local1++;
				}
				if (this.anIntArray401[local91] > 64) {
					local112 = this.anIntArray401[local91] - 64 - 1;
					for (@Pc(679) int local679 = this.anIntArray402[local112] - 1; local679 >= 0; local679--) {
						@Pc(688) Class53_Sub1_Sub1 local688 = this.aClass53_Sub1_Sub1ArrayArray3[local112][local679];
						@Pc(691) int local691 = local688.anInt2815;
						local134 = (byte) (local691 >> 16);
						local137 = (byte) (local691 >> 8);
						local142 = (byte) local691;
						local147 = (byte) (local691 >>> 24);
						local163 = local688.anInt2819 >> 12;
						local169 = local688.anInt2814 >> 12;
						@Pc(727) float local727 = (float) (local688.anInt2816 >> 12);
						@Pc(732) int local732 = local688.anInt2817 >> 12;
						if (arg0.anInt2502 == 0) {
							@Pc(737) byte local737 = local134;
							local134 = local142;
							local142 = local737;
						}
						if (local688.aShort79 == 0) {
							local84.putFloat(local163 + local38 * (float) -local732);
							local84.putFloat(local169 + local42 * (float) -local732);
							local84.putFloat(local727 + local46 * (float) -local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 + local62 * (float) local732);
							local84.putFloat(local169 + local66 * (float) local732);
							local84.putFloat(local727 + local70 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local38 * (float) local732);
							local84.putFloat(local169 + local42 * (float) local732);
							local84.putFloat(local727 + local46 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local50 * (float) local732);
							local84.putFloat(local169 + local54 * (float) local732);
							local84.putFloat(local727 + local58 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						} else {
							arg0.aClass328_88.method26075(local688.aShort79, local732, local732, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_88.method26046(arg0.aClass328_86);
							arg0.aClass328_88.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_88.method26052(0.0F, 1.0F, 0.0F, local76);
							local84.putFloat(local163 - local73[0] - local76[0]);
							local84.putFloat(local169 - local73[1] - local76[1]);
							local84.putFloat(local727 - local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 - local73[0] + local76[0]);
							local84.putFloat(local169 - local73[1] + local76[1]);
							local84.putFloat(local727 - local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] + local76[0]);
							local84.putFloat(local169 + local73[1] + local76[1]);
							local84.putFloat(local727 + local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] - local76[0]);
							local84.putFloat(local169 + local73[1] - local76[1]);
							local84.putFloat(local727 + local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						}
						local1++;
					}
				}
			}
		}
		this.anInterface21_20.method25705(0, local84.position(), arg0.aLong101);
		arg0.method17544(0, this.anInterface21_20);
		arg0.method17544(1, this.anInterface21_19);
		arg0.method17738(this.aClass37_24);
		@Pc(1252) Class39 local1252 = arg0.aClass39_3;
		local1252.method8259(local1, arg2);
	}

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "(Lclient!abv;IZ)V", line = 175)
	void method25217(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) Class328 local4 = arg0.aClass328_78;
		@Pc(9) float local9 = local4.aFloatArray106[0];
		@Pc(14) float local14 = local4.aFloatArray106[4];
		@Pc(19) float local19 = local4.aFloatArray106[8];
		@Pc(24) float local24 = local4.aFloatArray106[1];
		@Pc(29) float local29 = local4.aFloatArray106[5];
		@Pc(34) float local34 = local4.aFloatArray106[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass328_86.method26044(arg0.aClass328_92);
		@Pc(84) ByteBuffer local84 = arg0.aByteBuffer4;
		local84.clear();
		for (@Pc(91) int local91 = arg1 - 1; local91 >= 0; local91--) {
			@Pc(106) int local106 = this.anIntArray401[local91] > 64 ? 64 : this.anIntArray401[local91];
			if (local106 > 0) {
				@Pc(112) int local112;
				@Pc(134) byte local134;
				@Pc(137) byte local137;
				@Pc(142) byte local142;
				@Pc(147) byte local147;
				@Pc(163) float local163;
				@Pc(169) float local169;
				for (local112 = local106 - 1; local112 >= 0; local112--) {
					@Pc(121) Class53_Sub1_Sub1 local121 = this.aClass53_Sub1_Sub1ArrayArray4[local91][local112];
					@Pc(124) int local124 = local121.anInt2815;
					@Pc(129) byte local129 = (byte) (local124 >> 16);
					local134 = (byte) (local124 >> 8);
					local137 = (byte) local124;
					local142 = (byte) (local124 >>> 24);
					if (arg0.anInt2502 == 0) {
						local147 = local129;
						local129 = local137;
						local137 = local147;
					}
					@Pc(157) float local157 = (float) (local121.anInt2819 >> 12);
					local163 = local121.anInt2814 >> 12;
					local169 = local121.anInt2816 >> 12;
					@Pc(174) int local174 = local121.anInt2817 >> 12;
					if (local121.aShort79 == 0) {
						local84.putFloat(local157 + local38 * (float) -local174);
						local84.putFloat(local163 + local42 * (float) -local174);
						local84.putFloat(local169 + local46 * (float) -local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 + local62 * (float) local174);
						local84.putFloat(local163 + local66 * (float) local174);
						local84.putFloat(local169 + local70 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local38 * (float) local174);
						local84.putFloat(local163 + local42 * (float) local174);
						local84.putFloat(local169 + local46 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local50 * (float) local174);
						local84.putFloat(local163 + local54 * (float) local174);
						local84.putFloat(local169 + local58 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					} else {
						arg0.aClass328_88.method26075(local121.aShort79, local174, local174, 0.0F, 0.0F, 0.0F);
						arg0.aClass328_88.method26046(arg0.aClass328_86);
						arg0.aClass328_88.method26052(1.0F, 0.0F, 0.0F, local73);
						arg0.aClass328_88.method26052(0.0F, 1.0F, 0.0F, local76);
						local84.putFloat(local157 - local73[0] - local76[0]);
						local84.putFloat(local163 - local73[1] - local76[1]);
						local84.putFloat(local169 - local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 - local73[0] + local76[0]);
						local84.putFloat(local163 - local73[1] + local76[1]);
						local84.putFloat(local169 - local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] + local76[0]);
						local84.putFloat(local163 + local73[1] + local76[1]);
						local84.putFloat(local169 + local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] - local76[0]);
						local84.putFloat(local163 + local73[1] - local76[1]);
						local84.putFloat(local169 + local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					}
					local1++;
				}
				if (this.anIntArray401[local91] > 64) {
					local112 = this.anIntArray401[local91] - 64 - 1;
					for (@Pc(679) int local679 = this.anIntArray402[local112] - 1; local679 >= 0; local679--) {
						@Pc(688) Class53_Sub1_Sub1 local688 = this.aClass53_Sub1_Sub1ArrayArray3[local112][local679];
						@Pc(691) int local691 = local688.anInt2815;
						local134 = (byte) (local691 >> 16);
						local137 = (byte) (local691 >> 8);
						local142 = (byte) local691;
						local147 = (byte) (local691 >>> 24);
						local163 = local688.anInt2819 >> 12;
						local169 = local688.anInt2814 >> 12;
						@Pc(727) float local727 = (float) (local688.anInt2816 >> 12);
						@Pc(732) int local732 = local688.anInt2817 >> 12;
						if (arg0.anInt2502 == 0) {
							@Pc(737) byte local737 = local134;
							local134 = local142;
							local142 = local737;
						}
						if (local688.aShort79 == 0) {
							local84.putFloat(local163 + local38 * (float) -local732);
							local84.putFloat(local169 + local42 * (float) -local732);
							local84.putFloat(local727 + local46 * (float) -local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 + local62 * (float) local732);
							local84.putFloat(local169 + local66 * (float) local732);
							local84.putFloat(local727 + local70 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local38 * (float) local732);
							local84.putFloat(local169 + local42 * (float) local732);
							local84.putFloat(local727 + local46 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local50 * (float) local732);
							local84.putFloat(local169 + local54 * (float) local732);
							local84.putFloat(local727 + local58 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						} else {
							arg0.aClass328_88.method26075(local688.aShort79, local732, local732, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_88.method26046(arg0.aClass328_86);
							arg0.aClass328_88.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_88.method26052(0.0F, 1.0F, 0.0F, local76);
							local84.putFloat(local163 - local73[0] - local76[0]);
							local84.putFloat(local169 - local73[1] - local76[1]);
							local84.putFloat(local727 - local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 - local73[0] + local76[0]);
							local84.putFloat(local169 - local73[1] + local76[1]);
							local84.putFloat(local727 - local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] + local76[0]);
							local84.putFloat(local169 + local73[1] + local76[1]);
							local84.putFloat(local727 + local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] - local76[0]);
							local84.putFloat(local169 + local73[1] - local76[1]);
							local84.putFloat(local727 + local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						}
						local1++;
					}
				}
			}
		}
		this.anInterface21_20.method25705(0, local84.position(), arg0.aLong101);
		arg0.method17544(0, this.anInterface21_20);
		arg0.method17544(1, this.anInterface21_19);
		arg0.method17738(this.aClass37_24);
		@Pc(1252) Class39 local1252 = arg0.aClass39_3;
		local1252.method8259(local1, arg2);
	}

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "(Lclient!abv;IZ)V", line = 175)
	void method25222(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) Class328 local4 = arg0.aClass328_78;
		@Pc(9) float local9 = local4.aFloatArray106[0];
		@Pc(14) float local14 = local4.aFloatArray106[4];
		@Pc(19) float local19 = local4.aFloatArray106[8];
		@Pc(24) float local24 = local4.aFloatArray106[1];
		@Pc(29) float local29 = local4.aFloatArray106[5];
		@Pc(34) float local34 = local4.aFloatArray106[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass328_86.method26044(arg0.aClass328_92);
		@Pc(84) ByteBuffer local84 = arg0.aByteBuffer4;
		local84.clear();
		for (@Pc(91) int local91 = arg1 - 1; local91 >= 0; local91--) {
			@Pc(106) int local106 = this.anIntArray401[local91] > 64 ? 64 : this.anIntArray401[local91];
			if (local106 > 0) {
				@Pc(112) int local112;
				@Pc(134) byte local134;
				@Pc(137) byte local137;
				@Pc(142) byte local142;
				@Pc(147) byte local147;
				@Pc(163) float local163;
				@Pc(169) float local169;
				for (local112 = local106 - 1; local112 >= 0; local112--) {
					@Pc(121) Class53_Sub1_Sub1 local121 = this.aClass53_Sub1_Sub1ArrayArray4[local91][local112];
					@Pc(124) int local124 = local121.anInt2815;
					@Pc(129) byte local129 = (byte) (local124 >> 16);
					local134 = (byte) (local124 >> 8);
					local137 = (byte) local124;
					local142 = (byte) (local124 >>> 24);
					if (arg0.anInt2502 == 0) {
						local147 = local129;
						local129 = local137;
						local137 = local147;
					}
					@Pc(157) float local157 = (float) (local121.anInt2819 >> 12);
					local163 = local121.anInt2814 >> 12;
					local169 = local121.anInt2816 >> 12;
					@Pc(174) int local174 = local121.anInt2817 >> 12;
					if (local121.aShort79 == 0) {
						local84.putFloat(local157 + local38 * (float) -local174);
						local84.putFloat(local163 + local42 * (float) -local174);
						local84.putFloat(local169 + local46 * (float) -local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 + local62 * (float) local174);
						local84.putFloat(local163 + local66 * (float) local174);
						local84.putFloat(local169 + local70 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local38 * (float) local174);
						local84.putFloat(local163 + local42 * (float) local174);
						local84.putFloat(local169 + local46 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local50 * (float) local174);
						local84.putFloat(local163 + local54 * (float) local174);
						local84.putFloat(local169 + local58 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					} else {
						arg0.aClass328_88.method26075(local121.aShort79, local174, local174, 0.0F, 0.0F, 0.0F);
						arg0.aClass328_88.method26046(arg0.aClass328_86);
						arg0.aClass328_88.method26052(1.0F, 0.0F, 0.0F, local73);
						arg0.aClass328_88.method26052(0.0F, 1.0F, 0.0F, local76);
						local84.putFloat(local157 - local73[0] - local76[0]);
						local84.putFloat(local163 - local73[1] - local76[1]);
						local84.putFloat(local169 - local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 - local73[0] + local76[0]);
						local84.putFloat(local163 - local73[1] + local76[1]);
						local84.putFloat(local169 - local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] + local76[0]);
						local84.putFloat(local163 + local73[1] + local76[1]);
						local84.putFloat(local169 + local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] - local76[0]);
						local84.putFloat(local163 + local73[1] - local76[1]);
						local84.putFloat(local169 + local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					}
					local1++;
				}
				if (this.anIntArray401[local91] > 64) {
					local112 = this.anIntArray401[local91] - 64 - 1;
					for (@Pc(679) int local679 = this.anIntArray402[local112] - 1; local679 >= 0; local679--) {
						@Pc(688) Class53_Sub1_Sub1 local688 = this.aClass53_Sub1_Sub1ArrayArray3[local112][local679];
						@Pc(691) int local691 = local688.anInt2815;
						local134 = (byte) (local691 >> 16);
						local137 = (byte) (local691 >> 8);
						local142 = (byte) local691;
						local147 = (byte) (local691 >>> 24);
						local163 = local688.anInt2819 >> 12;
						local169 = local688.anInt2814 >> 12;
						@Pc(727) float local727 = (float) (local688.anInt2816 >> 12);
						@Pc(732) int local732 = local688.anInt2817 >> 12;
						if (arg0.anInt2502 == 0) {
							@Pc(737) byte local737 = local134;
							local134 = local142;
							local142 = local737;
						}
						if (local688.aShort79 == 0) {
							local84.putFloat(local163 + local38 * (float) -local732);
							local84.putFloat(local169 + local42 * (float) -local732);
							local84.putFloat(local727 + local46 * (float) -local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 + local62 * (float) local732);
							local84.putFloat(local169 + local66 * (float) local732);
							local84.putFloat(local727 + local70 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local38 * (float) local732);
							local84.putFloat(local169 + local42 * (float) local732);
							local84.putFloat(local727 + local46 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local50 * (float) local732);
							local84.putFloat(local169 + local54 * (float) local732);
							local84.putFloat(local727 + local58 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						} else {
							arg0.aClass328_88.method26075(local688.aShort79, local732, local732, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_88.method26046(arg0.aClass328_86);
							arg0.aClass328_88.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_88.method26052(0.0F, 1.0F, 0.0F, local76);
							local84.putFloat(local163 - local73[0] - local76[0]);
							local84.putFloat(local169 - local73[1] - local76[1]);
							local84.putFloat(local727 - local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 - local73[0] + local76[0]);
							local84.putFloat(local169 - local73[1] + local76[1]);
							local84.putFloat(local727 - local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] + local76[0]);
							local84.putFloat(local169 + local73[1] + local76[1]);
							local84.putFloat(local727 + local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] - local76[0]);
							local84.putFloat(local169 + local73[1] - local76[1]);
							local84.putFloat(local727 + local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						}
						local1++;
					}
				}
			}
		}
		this.anInterface21_20.method25705(0, local84.position(), arg0.aLong101);
		arg0.method17544(0, this.anInterface21_20);
		arg0.method17544(1, this.anInterface21_19);
		arg0.method17738(this.aClass37_24);
		@Pc(1252) Class39 local1252 = arg0.aClass39_3;
		local1252.method8259(local1, arg2);
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(Lclient!abv;IZ)V", line = 175)
	void method25223(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) Class328 local4 = arg0.aClass328_78;
		@Pc(9) float local9 = local4.aFloatArray106[0];
		@Pc(14) float local14 = local4.aFloatArray106[4];
		@Pc(19) float local19 = local4.aFloatArray106[8];
		@Pc(24) float local24 = local4.aFloatArray106[1];
		@Pc(29) float local29 = local4.aFloatArray106[5];
		@Pc(34) float local34 = local4.aFloatArray106[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass328_86.method26044(arg0.aClass328_92);
		@Pc(84) ByteBuffer local84 = arg0.aByteBuffer4;
		local84.clear();
		for (@Pc(91) int local91 = arg1 - 1; local91 >= 0; local91--) {
			@Pc(106) int local106 = this.anIntArray401[local91] > 64 ? 64 : this.anIntArray401[local91];
			if (local106 > 0) {
				@Pc(112) int local112;
				@Pc(134) byte local134;
				@Pc(137) byte local137;
				@Pc(142) byte local142;
				@Pc(147) byte local147;
				@Pc(163) float local163;
				@Pc(169) float local169;
				for (local112 = local106 - 1; local112 >= 0; local112--) {
					@Pc(121) Class53_Sub1_Sub1 local121 = this.aClass53_Sub1_Sub1ArrayArray4[local91][local112];
					@Pc(124) int local124 = local121.anInt2815;
					@Pc(129) byte local129 = (byte) (local124 >> 16);
					local134 = (byte) (local124 >> 8);
					local137 = (byte) local124;
					local142 = (byte) (local124 >>> 24);
					if (arg0.anInt2502 == 0) {
						local147 = local129;
						local129 = local137;
						local137 = local147;
					}
					@Pc(157) float local157 = (float) (local121.anInt2819 >> 12);
					local163 = local121.anInt2814 >> 12;
					local169 = local121.anInt2816 >> 12;
					@Pc(174) int local174 = local121.anInt2817 >> 12;
					if (local121.aShort79 == 0) {
						local84.putFloat(local157 + local38 * (float) -local174);
						local84.putFloat(local163 + local42 * (float) -local174);
						local84.putFloat(local169 + local46 * (float) -local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 + local62 * (float) local174);
						local84.putFloat(local163 + local66 * (float) local174);
						local84.putFloat(local169 + local70 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local38 * (float) local174);
						local84.putFloat(local163 + local42 * (float) local174);
						local84.putFloat(local169 + local46 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local50 * (float) local174);
						local84.putFloat(local163 + local54 * (float) local174);
						local84.putFloat(local169 + local58 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					} else {
						arg0.aClass328_88.method26075(local121.aShort79, local174, local174, 0.0F, 0.0F, 0.0F);
						arg0.aClass328_88.method26046(arg0.aClass328_86);
						arg0.aClass328_88.method26052(1.0F, 0.0F, 0.0F, local73);
						arg0.aClass328_88.method26052(0.0F, 1.0F, 0.0F, local76);
						local84.putFloat(local157 - local73[0] - local76[0]);
						local84.putFloat(local163 - local73[1] - local76[1]);
						local84.putFloat(local169 - local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 - local73[0] + local76[0]);
						local84.putFloat(local163 - local73[1] + local76[1]);
						local84.putFloat(local169 - local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] + local76[0]);
						local84.putFloat(local163 + local73[1] + local76[1]);
						local84.putFloat(local169 + local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] - local76[0]);
						local84.putFloat(local163 + local73[1] - local76[1]);
						local84.putFloat(local169 + local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					}
					local1++;
				}
				if (this.anIntArray401[local91] > 64) {
					local112 = this.anIntArray401[local91] - 64 - 1;
					for (@Pc(679) int local679 = this.anIntArray402[local112] - 1; local679 >= 0; local679--) {
						@Pc(688) Class53_Sub1_Sub1 local688 = this.aClass53_Sub1_Sub1ArrayArray3[local112][local679];
						@Pc(691) int local691 = local688.anInt2815;
						local134 = (byte) (local691 >> 16);
						local137 = (byte) (local691 >> 8);
						local142 = (byte) local691;
						local147 = (byte) (local691 >>> 24);
						local163 = local688.anInt2819 >> 12;
						local169 = local688.anInt2814 >> 12;
						@Pc(727) float local727 = (float) (local688.anInt2816 >> 12);
						@Pc(732) int local732 = local688.anInt2817 >> 12;
						if (arg0.anInt2502 == 0) {
							@Pc(737) byte local737 = local134;
							local134 = local142;
							local142 = local737;
						}
						if (local688.aShort79 == 0) {
							local84.putFloat(local163 + local38 * (float) -local732);
							local84.putFloat(local169 + local42 * (float) -local732);
							local84.putFloat(local727 + local46 * (float) -local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 + local62 * (float) local732);
							local84.putFloat(local169 + local66 * (float) local732);
							local84.putFloat(local727 + local70 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local38 * (float) local732);
							local84.putFloat(local169 + local42 * (float) local732);
							local84.putFloat(local727 + local46 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local50 * (float) local732);
							local84.putFloat(local169 + local54 * (float) local732);
							local84.putFloat(local727 + local58 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						} else {
							arg0.aClass328_88.method26075(local688.aShort79, local732, local732, 0.0F, 0.0F, 0.0F);
							arg0.aClass328_88.method26046(arg0.aClass328_86);
							arg0.aClass328_88.method26052(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass328_88.method26052(0.0F, 1.0F, 0.0F, local76);
							local84.putFloat(local163 - local73[0] - local76[0]);
							local84.putFloat(local169 - local73[1] - local76[1]);
							local84.putFloat(local727 - local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 - local73[0] + local76[0]);
							local84.putFloat(local169 - local73[1] + local76[1]);
							local84.putFloat(local727 - local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] + local76[0]);
							local84.putFloat(local169 + local73[1] + local76[1]);
							local84.putFloat(local727 + local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] - local76[0]);
							local84.putFloat(local169 + local73[1] - local76[1]);
							local84.putFloat(local727 + local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						}
						local1++;
					}
				}
			}
		}
		this.anInterface21_20.method25705(0, local84.position(), arg0.aLong101);
		arg0.method17544(0, this.anInterface21_20);
		arg0.method17544(1, this.anInterface21_19);
		arg0.method17738(this.aClass37_24);
		@Pc(1252) Class39 local1252 = arg0.aClass39_3;
		local1252.method8259(local1, arg2);
	}
}
