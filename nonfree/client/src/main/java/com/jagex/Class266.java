package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!jx")
public class Class266 {

	@OriginalMember(owner = "client!jx", name = "g", descriptor = "Lclient!ix;")
	Class248 aClass248_4;

	@OriginalMember(owner = "client!jx", name = "a", descriptor = "Lclient!ix;")
	Class248 aClass248_5 = Class248.aClass248_1;

	@OriginalMember(owner = "client!jx", name = "l", descriptor = "I")
	int anInt4209 = 128;

	@OriginalMember(owner = "client!jx", name = "h", descriptor = "I")
	int anInt4210 = 0;

	@OriginalMember(owner = "client!jx", name = "x", descriptor = "[F")
	float[] aFloatArray100 = new float[this.anInt4209 * 16];

	@OriginalMember(owner = "client!jx", name = "s", descriptor = "[Lclient!ic;")
	Interface20[] anInterface20Array3 = new Interface20[this.anInt4209];

	@OriginalMember(owner = "client!jx", name = "u", descriptor = "[I")
	int[] anIntArray405 = new int[this.anInt4209];

	@OriginalMember(owner = "client!jx", name = "j", descriptor = "[I")
	int[] anIntArray404 = new int[4];

	@OriginalMember(owner = "client!jx", name = "p", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_40;

	@OriginalMember(owner = "client!jx", name = "b", descriptor = "Lclient!if;")
	Interface21 anInterface21_21;

	@OriginalMember(owner = "client!jx", name = "c", descriptor = "Lclient!iy;")
	Class37 aClass37_25;

	@OriginalMember(owner = "client!jx", name = "z", descriptor = "Lclient!jw;")
	Interface30 anInterface30_9;

	@OriginalMember(owner = "client!jx", name = "y", descriptor = "I")
	int anInt4211;

	@OriginalMember(owner = "client!jx", name = "<init>", descriptor = "(Lclient!abv;I)V", line = 26)
	Class266(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub3_40 = arg0;
		this.anInterface21_21 = this.aClass21_Sub3_40.method17542(true);
		this.anInterface21_21.method25687(arg1 * 96, 24);
		this.aClass37_25 = this.aClass21_Sub3_40.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_5 }) });
		this.anInterface30_9 = this.aClass21_Sub3_40.method17648(false);
		@Pc(85) int local85 = arg1 * 6;
		this.anInterface30_9.method25720(local85);
		@Pc(93) ByteBuffer local93 = this.aClass21_Sub3_40.aByteBuffer4;
		local93.clear();
		for (@Pc(98) int local98 = 0; local98 < arg1; local98++) {
			local93.putShort((short) (local98 * 4));
			local93.putShort((short) (local98 * 4 + 2));
			local93.putShort((short) (local98 * 4 + 1));
			local93.putShort((short) (local98 * 4 + 2));
			local93.putShort((short) (local98 * 4 + 3));
			local93.putShort((short) (local98 * 4 + 1));
		}
		this.anInterface30_9.method25705(0, local85 * this.anInterface30_9.method25721().anInt3315 * -1246993659, this.aClass21_Sub3_40.aLong101);
		this.anInt4211 = arg1;
		this.anInt4210 = 0;
	}

	@OriginalMember(owner = "client!jx", name = "c", descriptor = "()V", line = 50)
	void method25246() {
		this.anInterface21_21.method27209();
		this.anInterface30_9.method27209();
		this.anInterface21_21 = null;
		this.anInterface30_9 = null;
		this.aClass37_25 = null;
		this.anInt4210 = 0;
	}

	@OriginalMember(owner = "client!jx", name = "p", descriptor = "()V", line = 50)
	void method25248() {
		this.anInterface21_21.method27209();
		this.anInterface30_9.method27209();
		this.anInterface21_21 = null;
		this.anInterface30_9 = null;
		this.aClass37_25 = null;
		this.anInt4210 = 0;
	}

	@OriginalMember(owner = "client!jx", name = "z", descriptor = "()V", line = 50)
	void method25251() {
		this.anInterface21_21.method27209();
		this.anInterface30_9.method27209();
		this.anInterface21_21 = null;
		this.anInterface30_9 = null;
		this.aClass37_25 = null;
		this.anInt4210 = 0;
	}

	@OriginalMember(owner = "client!jx", name = "a", descriptor = "()V", line = 59)
	void method25237() {
		if (this.anInt4210 == 0) {
			return;
		}
		this.aClass21_Sub3_40.method17556();
		this.aClass21_Sub3_40.method17469(1);
		this.aClass21_Sub3_40.method17545(this.anInterface30_9);
		this.aClass21_Sub3_40.method17544(0, this.anInterface21_21);
		this.aClass21_Sub3_40.method17738(this.aClass37_25);
		@Pc(30) Class36 local30 = this.aClass21_Sub3_40.aClass36_3;
		@Pc(34) Unsafe local34 = this.aClass21_Sub3_40.anUnsafe3;
		@Pc(38) ByteBuffer local38 = this.aClass21_Sub3_40.aByteBuffer4;
		local38.clear();
		this.aClass21_Sub3_40.method17814().method26104(Class328.aClass328_99);
		this.aClass21_Sub3_40.method17520(Class268.aClass268_3);
		@Pc(61) int local61 = (this.anInt4210 + this.anInt4211 - 1) / this.anInt4211;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4211, this.anInt4210 - local63);
			@Pc(86) long local86 = this.anInterface21_21.method25710(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4211 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray100[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray100[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray100[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray100[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray405[local95]);
					local86 += 4L;
				}
			}
			this.anInterface21_21.method25707();
			@Pc(182) Interface20 local182 = this.anInterface20Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface20Array3[local190]) {
					local100++;
				} else {
					local30.anInterface20_20 = local182;
					local30.method8314();
					this.aClass21_Sub3_40.method17817(this.anInterface30_9, Class263.aClass263_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface20Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface20_20 = local182;
			local30.method8314();
			this.aClass21_Sub3_40.method17817(this.anInterface30_9, Class263.aClass263_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4211;
		}
		this.anInt4210 = 0;
	}

	@OriginalMember(owner = "client!jx", name = "j", descriptor = "()V", line = 59)
	void method25261() {
		if (this.anInt4210 == 0) {
			return;
		}
		this.aClass21_Sub3_40.method17556();
		this.aClass21_Sub3_40.method17469(1);
		this.aClass21_Sub3_40.method17545(this.anInterface30_9);
		this.aClass21_Sub3_40.method17544(0, this.anInterface21_21);
		this.aClass21_Sub3_40.method17738(this.aClass37_25);
		@Pc(30) Class36 local30 = this.aClass21_Sub3_40.aClass36_3;
		@Pc(34) Unsafe local34 = this.aClass21_Sub3_40.anUnsafe3;
		@Pc(38) ByteBuffer local38 = this.aClass21_Sub3_40.aByteBuffer4;
		local38.clear();
		this.aClass21_Sub3_40.method17814().method26104(Class328.aClass328_99);
		this.aClass21_Sub3_40.method17520(Class268.aClass268_3);
		@Pc(61) int local61 = (this.anInt4210 + this.anInt4211 - 1) / this.anInt4211;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4211, this.anInt4210 - local63);
			@Pc(86) long local86 = this.anInterface21_21.method25710(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4211 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray100[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray100[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray100[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray100[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray405[local95]);
					local86 += 4L;
				}
			}
			this.anInterface21_21.method25707();
			@Pc(182) Interface20 local182 = this.anInterface20Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface20Array3[local190]) {
					local100++;
				} else {
					local30.anInterface20_20 = local182;
					local30.method8314();
					this.aClass21_Sub3_40.method17817(this.anInterface30_9, Class263.aClass263_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface20Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface20_20 = local182;
			local30.method8314();
			this.aClass21_Sub3_40.method17817(this.anInterface30_9, Class263.aClass263_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4211;
		}
		this.anInt4210 = 0;
	}

	@OriginalMember(owner = "client!jx", name = "g", descriptor = "(FFFFFFFFLclient!ic;I)V", line = 120)
	void method25238(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface20 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass21_Sub3_40.method17060(this.anIntArray404);
		@Pc(14) int local14 = this.anIntArray404[0];
		@Pc(19) int local19 = this.anIntArray404[1];
		@Pc(24) int local24 = this.anIntArray404[2];
		@Pc(29) int local29 = this.anIntArray404[3];
		if (arg0 > (float) local24 || (arg1 > (float) local29 || (arg2 < (float) local14 || arg3 < (float) local19))) {
			return;
		}
		@Pc(57) float local57 = arg2 - arg0;
		@Pc(61) float local61 = arg3 - arg1;
		@Pc(65) float local65 = arg6 - arg4;
		@Pc(69) float local69 = arg7 - arg5;
		if (arg0 < (float) local14) {
			arg4 += ((float) local14 - arg0) / local57 * local65;
			arg0 = local14;
		}
		if (arg1 < (float) local19) {
			arg5 += ((float) local19 - arg1) / local61 * local69;
			arg1 = local19;
		}
		if (arg2 > (float) local24) {
			arg6 -= (arg2 - (float) local24) / local57 * local65;
			arg2 = local24;
		}
		if (arg3 > (float) local29) {
			arg7 -= (arg3 - (float) local29) / local61 * local69;
			arg3 = local29;
		}
		this.method25240();
		arg0 = this.method25259(arg0);
		arg1 = this.method25242(arg1);
		arg2 = this.method25259(arg2);
		arg3 = this.method25242(arg3);
		this.aFloatArray100[this.anInt4210 * 16] = arg0;
		this.aFloatArray100[this.anInt4210 * 16 + 1] = arg1;
		this.aFloatArray100[this.anInt4210 * 16 + 2] = arg4;
		this.aFloatArray100[this.anInt4210 * 16 + 3] = arg5;
		this.aFloatArray100[this.anInt4210 * 16 + 4] = arg2;
		this.aFloatArray100[this.anInt4210 * 16 + 5] = arg1;
		this.aFloatArray100[this.anInt4210 * 16 + 6] = arg6;
		this.aFloatArray100[this.anInt4210 * 16 + 7] = arg5;
		this.aFloatArray100[this.anInt4210 * 16 + 8] = arg0;
		this.aFloatArray100[this.anInt4210 * 16 + 9] = arg3;
		this.aFloatArray100[this.anInt4210 * 16 + 10] = arg4;
		this.aFloatArray100[this.anInt4210 * 16 + 11] = arg7;
		this.aFloatArray100[this.anInt4210 * 16 + 12] = arg2;
		this.aFloatArray100[this.anInt4210 * 16 + 13] = arg3;
		this.aFloatArray100[this.anInt4210 * 16 + 14] = arg6;
		this.aFloatArray100[this.anInt4210 * 16 + 15] = arg7;
		this.anInterface20Array3[this.anInt4210] = arg8;
		if (this.aClass21_Sub3_40.anInt2502 == 1) {
			this.anIntArray405[this.anInt4210] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray405[this.anInt4210] = arg9;
		}
		this.anInt4210++;
		if (this.aClass248_5 == Class248.aClass248_3) {
			this.method25237();
		}
	}

	@OriginalMember(owner = "client!jx", name = "n", descriptor = "(FFFFFFFFLclient!ic;I)V", line = 120)
	void method25249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface20 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass21_Sub3_40.method17060(this.anIntArray404);
		@Pc(14) int local14 = this.anIntArray404[0];
		@Pc(19) int local19 = this.anIntArray404[1];
		@Pc(24) int local24 = this.anIntArray404[2];
		@Pc(29) int local29 = this.anIntArray404[3];
		if (arg0 > (float) local24 || (arg1 > (float) local29 || (arg2 < (float) local14 || arg3 < (float) local19))) {
			return;
		}
		@Pc(57) float local57 = arg2 - arg0;
		@Pc(61) float local61 = arg3 - arg1;
		@Pc(65) float local65 = arg6 - arg4;
		@Pc(69) float local69 = arg7 - arg5;
		if (arg0 < (float) local14) {
			arg4 += ((float) local14 - arg0) / local57 * local65;
			arg0 = local14;
		}
		if (arg1 < (float) local19) {
			arg5 += ((float) local19 - arg1) / local61 * local69;
			arg1 = local19;
		}
		if (arg2 > (float) local24) {
			arg6 -= (arg2 - (float) local24) / local57 * local65;
			arg2 = local24;
		}
		if (arg3 > (float) local29) {
			arg7 -= (arg3 - (float) local29) / local61 * local69;
			arg3 = local29;
		}
		this.method25240();
		arg0 = this.method25259(arg0);
		arg1 = this.method25242(arg1);
		arg2 = this.method25259(arg2);
		arg3 = this.method25242(arg3);
		this.aFloatArray100[this.anInt4210 * 16] = arg0;
		this.aFloatArray100[this.anInt4210 * 16 + 1] = arg1;
		this.aFloatArray100[this.anInt4210 * 16 + 2] = arg4;
		this.aFloatArray100[this.anInt4210 * 16 + 3] = arg5;
		this.aFloatArray100[this.anInt4210 * 16 + 4] = arg2;
		this.aFloatArray100[this.anInt4210 * 16 + 5] = arg1;
		this.aFloatArray100[this.anInt4210 * 16 + 6] = arg6;
		this.aFloatArray100[this.anInt4210 * 16 + 7] = arg5;
		this.aFloatArray100[this.anInt4210 * 16 + 8] = arg0;
		this.aFloatArray100[this.anInt4210 * 16 + 9] = arg3;
		this.aFloatArray100[this.anInt4210 * 16 + 10] = arg4;
		this.aFloatArray100[this.anInt4210 * 16 + 11] = arg7;
		this.aFloatArray100[this.anInt4210 * 16 + 12] = arg2;
		this.aFloatArray100[this.anInt4210 * 16 + 13] = arg3;
		this.aFloatArray100[this.anInt4210 * 16 + 14] = arg6;
		this.aFloatArray100[this.anInt4210 * 16 + 15] = arg7;
		this.anInterface20Array3[this.anInt4210] = arg8;
		if (this.aClass21_Sub3_40.anInt2502 == 1) {
			this.anIntArray405[this.anInt4210] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray405[this.anInt4210] = arg9;
		}
		this.anInt4210++;
		if (this.aClass248_5 == Class248.aClass248_3) {
			this.method25237();
		}
	}

	@OriginalMember(owner = "client!jx", name = "e", descriptor = "(FFFFFFFFLclient!ic;I)V", line = 120)
	void method25250(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface20 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass21_Sub3_40.method17060(this.anIntArray404);
		@Pc(14) int local14 = this.anIntArray404[0];
		@Pc(19) int local19 = this.anIntArray404[1];
		@Pc(24) int local24 = this.anIntArray404[2];
		@Pc(29) int local29 = this.anIntArray404[3];
		if (arg0 > (float) local24 || (arg1 > (float) local29 || (arg2 < (float) local14 || arg3 < (float) local19))) {
			return;
		}
		@Pc(57) float local57 = arg2 - arg0;
		@Pc(61) float local61 = arg3 - arg1;
		@Pc(65) float local65 = arg6 - arg4;
		@Pc(69) float local69 = arg7 - arg5;
		if (arg0 < (float) local14) {
			arg4 += ((float) local14 - arg0) / local57 * local65;
			arg0 = local14;
		}
		if (arg1 < (float) local19) {
			arg5 += ((float) local19 - arg1) / local61 * local69;
			arg1 = local19;
		}
		if (arg2 > (float) local24) {
			arg6 -= (arg2 - (float) local24) / local57 * local65;
			arg2 = local24;
		}
		if (arg3 > (float) local29) {
			arg7 -= (arg3 - (float) local29) / local61 * local69;
			arg3 = local29;
		}
		this.method25240();
		arg0 = this.method25259(arg0);
		arg1 = this.method25242(arg1);
		arg2 = this.method25259(arg2);
		arg3 = this.method25242(arg3);
		this.aFloatArray100[this.anInt4210 * 16] = arg0;
		this.aFloatArray100[this.anInt4210 * 16 + 1] = arg1;
		this.aFloatArray100[this.anInt4210 * 16 + 2] = arg4;
		this.aFloatArray100[this.anInt4210 * 16 + 3] = arg5;
		this.aFloatArray100[this.anInt4210 * 16 + 4] = arg2;
		this.aFloatArray100[this.anInt4210 * 16 + 5] = arg1;
		this.aFloatArray100[this.anInt4210 * 16 + 6] = arg6;
		this.aFloatArray100[this.anInt4210 * 16 + 7] = arg5;
		this.aFloatArray100[this.anInt4210 * 16 + 8] = arg0;
		this.aFloatArray100[this.anInt4210 * 16 + 9] = arg3;
		this.aFloatArray100[this.anInt4210 * 16 + 10] = arg4;
		this.aFloatArray100[this.anInt4210 * 16 + 11] = arg7;
		this.aFloatArray100[this.anInt4210 * 16 + 12] = arg2;
		this.aFloatArray100[this.anInt4210 * 16 + 13] = arg3;
		this.aFloatArray100[this.anInt4210 * 16 + 14] = arg6;
		this.aFloatArray100[this.anInt4210 * 16 + 15] = arg7;
		this.anInterface20Array3[this.anInt4210] = arg8;
		if (this.aClass21_Sub3_40.anInt2502 == 1) {
			this.anIntArray405[this.anInt4210] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray405[this.anInt4210] = arg9;
		}
		this.anInt4210++;
		if (this.aClass248_5 == Class248.aClass248_3) {
			this.method25237();
		}
	}

	@OriginalMember(owner = "client!jx", name = "r", descriptor = "(FFFFFFFFFFFFFFFFLclient!ic;I)V", line = 181)
	void method25235(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface20 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass21_Sub3_40.method17060(this.anIntArray404);
		@Pc(14) int local14 = this.anIntArray404[0];
		@Pc(19) int local19 = this.anIntArray404[1];
		@Pc(24) int local24 = this.anIntArray404[2];
		@Pc(29) int local29 = this.anIntArray404[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method25237();
			this.aClass21_Sub3_40.method17059(true);
			this.aClass21_Sub3_40.method17079(local14, local19, local24, local29);
		}
		this.method25240();
		@Pc(228) float local228 = this.method25259(arg0);
		@Pc(232) float local232 = this.method25242(arg1);
		@Pc(236) float local236 = this.method25259(arg2);
		@Pc(240) float local240 = this.method25242(arg3);
		@Pc(244) float local244 = this.method25259(arg4);
		@Pc(248) float local248 = this.method25242(arg5);
		@Pc(252) float local252 = this.method25259(arg6);
		@Pc(256) float local256 = this.method25242(arg7);
		this.aFloatArray100[this.anInt4210 * 16] = local228;
		this.aFloatArray100[this.anInt4210 * 16 + 1] = local232;
		this.aFloatArray100[this.anInt4210 * 16 + 2] = arg8;
		this.aFloatArray100[this.anInt4210 * 16 + 3] = arg9;
		this.aFloatArray100[this.anInt4210 * 16 + 4] = local236;
		this.aFloatArray100[this.anInt4210 * 16 + 5] = local240;
		this.aFloatArray100[this.anInt4210 * 16 + 6] = arg10;
		this.aFloatArray100[this.anInt4210 * 16 + 7] = arg11;
		this.aFloatArray100[this.anInt4210 * 16 + 8] = local244;
		this.aFloatArray100[this.anInt4210 * 16 + 9] = local248;
		this.aFloatArray100[this.anInt4210 * 16 + 10] = arg12;
		this.aFloatArray100[this.anInt4210 * 16 + 11] = arg13;
		this.aFloatArray100[this.anInt4210 * 16 + 12] = local252;
		this.aFloatArray100[this.anInt4210 * 16 + 13] = local256;
		this.aFloatArray100[this.anInt4210 * 16 + 14] = arg14;
		this.aFloatArray100[this.anInt4210 * 16 + 15] = arg15;
		this.anInterface20Array3[this.anInt4210] = arg16;
		if (this.aClass21_Sub3_40.anInt2502 == 1) {
			this.anIntArray405[this.anInt4210] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray405[this.anInt4210] = arg17;
		}
		this.anInt4210++;
		if (this.aClass248_5 == Class248.aClass248_3 || local75 > 0) {
			this.method25237();
		}
		if (local75 != 0) {
			this.aClass21_Sub3_40.method17059(false);
			this.aClass21_Sub3_40.method17056();
			this.aClass21_Sub3_40.method17079(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!jx", name = "l", descriptor = "(FFFFFFFFFFFFFFFFLclient!ic;I)V", line = 181)
	void method25239(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface20 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass21_Sub3_40.method17060(this.anIntArray404);
		@Pc(14) int local14 = this.anIntArray404[0];
		@Pc(19) int local19 = this.anIntArray404[1];
		@Pc(24) int local24 = this.anIntArray404[2];
		@Pc(29) int local29 = this.anIntArray404[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method25237();
			this.aClass21_Sub3_40.method17059(true);
			this.aClass21_Sub3_40.method17079(local14, local19, local24, local29);
		}
		this.method25240();
		@Pc(228) float local228 = this.method25259(arg0);
		@Pc(232) float local232 = this.method25242(arg1);
		@Pc(236) float local236 = this.method25259(arg2);
		@Pc(240) float local240 = this.method25242(arg3);
		@Pc(244) float local244 = this.method25259(arg4);
		@Pc(248) float local248 = this.method25242(arg5);
		@Pc(252) float local252 = this.method25259(arg6);
		@Pc(256) float local256 = this.method25242(arg7);
		this.aFloatArray100[this.anInt4210 * 16] = local228;
		this.aFloatArray100[this.anInt4210 * 16 + 1] = local232;
		this.aFloatArray100[this.anInt4210 * 16 + 2] = arg8;
		this.aFloatArray100[this.anInt4210 * 16 + 3] = arg9;
		this.aFloatArray100[this.anInt4210 * 16 + 4] = local236;
		this.aFloatArray100[this.anInt4210 * 16 + 5] = local240;
		this.aFloatArray100[this.anInt4210 * 16 + 6] = arg10;
		this.aFloatArray100[this.anInt4210 * 16 + 7] = arg11;
		this.aFloatArray100[this.anInt4210 * 16 + 8] = local244;
		this.aFloatArray100[this.anInt4210 * 16 + 9] = local248;
		this.aFloatArray100[this.anInt4210 * 16 + 10] = arg12;
		this.aFloatArray100[this.anInt4210 * 16 + 11] = arg13;
		this.aFloatArray100[this.anInt4210 * 16 + 12] = local252;
		this.aFloatArray100[this.anInt4210 * 16 + 13] = local256;
		this.aFloatArray100[this.anInt4210 * 16 + 14] = arg14;
		this.aFloatArray100[this.anInt4210 * 16 + 15] = arg15;
		this.anInterface20Array3[this.anInt4210] = arg16;
		if (this.aClass21_Sub3_40.anInt2502 == 1) {
			this.anIntArray405[this.anInt4210] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray405[this.anInt4210] = arg17;
		}
		this.anInt4210++;
		if (this.aClass248_5 == Class248.aClass248_3 || local75 > 0) {
			this.method25237();
		}
		if (local75 != 0) {
			this.aClass21_Sub3_40.method17059(false);
			this.aClass21_Sub3_40.method17056();
			this.aClass21_Sub3_40.method17079(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!jx", name = "d", descriptor = "(FFFFFFFFFFFFFFFFLclient!ic;I)V", line = 181)
	void method25252(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface20 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass21_Sub3_40.method17060(this.anIntArray404);
		@Pc(14) int local14 = this.anIntArray404[0];
		@Pc(19) int local19 = this.anIntArray404[1];
		@Pc(24) int local24 = this.anIntArray404[2];
		@Pc(29) int local29 = this.anIntArray404[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method25237();
			this.aClass21_Sub3_40.method17059(true);
			this.aClass21_Sub3_40.method17079(local14, local19, local24, local29);
		}
		this.method25240();
		@Pc(228) float local228 = this.method25259(arg0);
		@Pc(232) float local232 = this.method25242(arg1);
		@Pc(236) float local236 = this.method25259(arg2);
		@Pc(240) float local240 = this.method25242(arg3);
		@Pc(244) float local244 = this.method25259(arg4);
		@Pc(248) float local248 = this.method25242(arg5);
		@Pc(252) float local252 = this.method25259(arg6);
		@Pc(256) float local256 = this.method25242(arg7);
		this.aFloatArray100[this.anInt4210 * 16] = local228;
		this.aFloatArray100[this.anInt4210 * 16 + 1] = local232;
		this.aFloatArray100[this.anInt4210 * 16 + 2] = arg8;
		this.aFloatArray100[this.anInt4210 * 16 + 3] = arg9;
		this.aFloatArray100[this.anInt4210 * 16 + 4] = local236;
		this.aFloatArray100[this.anInt4210 * 16 + 5] = local240;
		this.aFloatArray100[this.anInt4210 * 16 + 6] = arg10;
		this.aFloatArray100[this.anInt4210 * 16 + 7] = arg11;
		this.aFloatArray100[this.anInt4210 * 16 + 8] = local244;
		this.aFloatArray100[this.anInt4210 * 16 + 9] = local248;
		this.aFloatArray100[this.anInt4210 * 16 + 10] = arg12;
		this.aFloatArray100[this.anInt4210 * 16 + 11] = arg13;
		this.aFloatArray100[this.anInt4210 * 16 + 12] = local252;
		this.aFloatArray100[this.anInt4210 * 16 + 13] = local256;
		this.aFloatArray100[this.anInt4210 * 16 + 14] = arg14;
		this.aFloatArray100[this.anInt4210 * 16 + 15] = arg15;
		this.anInterface20Array3[this.anInt4210] = arg16;
		if (this.aClass21_Sub3_40.anInt2502 == 1) {
			this.anIntArray405[this.anInt4210] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray405[this.anInt4210] = arg17;
		}
		this.anInt4210++;
		if (this.aClass248_5 == Class248.aClass248_3 || local75 > 0) {
			this.method25237();
		}
		if (local75 != 0) {
			this.aClass21_Sub3_40.method17059(false);
			this.aClass21_Sub3_40.method17056();
			this.aClass21_Sub3_40.method17079(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!jx", name = "h", descriptor = "()V", line = 246)
	void method25240() {
		if (this.anInt4210 != this.anInt4209) {
			return;
		}
		this.anInt4209 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4209 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4210 * 16; local18++) {
			local16[local18] = this.aFloatArray100[local18];
		}
		this.aFloatArray100 = local16;
		@Pc(40) Interface20[] local40 = new Interface20[this.anInt4209];
		@Pc(44) int[] local44 = new int[this.anInt4209];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4210; local46++) {
			local40[local46] = this.anInterface20Array3[local46];
			local44[local46] = this.anIntArray405[local46];
		}
		this.anInterface20Array3 = local40;
		this.anIntArray405 = local44;
	}

	@OriginalMember(owner = "client!jx", name = "q", descriptor = "()V", line = 246)
	void method25253() {
		if (this.anInt4210 != this.anInt4209) {
			return;
		}
		this.anInt4209 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4209 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4210 * 16; local18++) {
			local16[local18] = this.aFloatArray100[local18];
		}
		this.aFloatArray100 = local16;
		@Pc(40) Interface20[] local40 = new Interface20[this.anInt4209];
		@Pc(44) int[] local44 = new int[this.anInt4209];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4210; local46++) {
			local40[local46] = this.anInterface20Array3[local46];
			local44[local46] = this.anIntArray405[local46];
		}
		this.anInterface20Array3 = local40;
		this.anIntArray405 = local44;
	}

	@OriginalMember(owner = "client!jx", name = "m", descriptor = "()V", line = 246)
	void method25254() {
		if (this.anInt4210 != this.anInt4209) {
			return;
		}
		this.anInt4209 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4209 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4210 * 16; local18++) {
			local16[local18] = this.aFloatArray100[local18];
		}
		this.aFloatArray100 = local16;
		@Pc(40) Interface20[] local40 = new Interface20[this.anInt4209];
		@Pc(44) int[] local44 = new int[this.anInt4209];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4210; local46++) {
			local40[local46] = this.anInterface20Array3[local46];
			local44[local46] = this.anIntArray405[local46];
		}
		this.anInterface20Array3 = local40;
		this.anIntArray405 = local44;
	}

	@OriginalMember(owner = "client!jx", name = "v", descriptor = "(F)F", line = 265)
	float method25255(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass21_Sub3_40.method17037().method21390();
		return (arg0 + this.aClass21_Sub3_40.method17577()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!jx", name = "x", descriptor = "(F)F", line = 265)
	float method25259(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass21_Sub3_40.method17037().method21390();
		return (arg0 + this.aClass21_Sub3_40.method17577()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!jx", name = "s", descriptor = "(F)F", line = 271)
	float method25242(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass21_Sub3_40.method17037().method21391();
		return (1.0F - (arg0 + this.aClass21_Sub3_40.method17577()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!jx", name = "t", descriptor = "(F)F", line = 271)
	float method25256(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass21_Sub3_40.method17037().method21391();
		return (1.0F - (arg0 + this.aClass21_Sub3_40.method17577()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!jx", name = "w", descriptor = "(F)F", line = 271)
	float method25257(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass21_Sub3_40.method17037().method21391();
		return (1.0F - (arg0 + this.aClass21_Sub3_40.method17577()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!jx", name = "o", descriptor = "()V", line = 277)
	void method25241() {
		this.aClass248_4 = this.aClass248_5;
		this.aClass248_5 = Class248.aClass248_2;
	}

	@OriginalMember(owner = "client!jx", name = "u", descriptor = "()V", line = 277)
	void method25243() {
		this.aClass248_4 = this.aClass248_5;
		this.aClass248_5 = Class248.aClass248_2;
	}

	@OriginalMember(owner = "client!jx", name = "i", descriptor = "()V", line = 277)
	void method25247() {
		this.aClass248_4 = this.aClass248_5;
		this.aClass248_5 = Class248.aClass248_2;
	}

	@OriginalMember(owner = "client!jx", name = "y", descriptor = "()V", line = 282)
	void method25244() {
		if (this.aClass248_4 != null) {
			this.aClass248_5 = this.aClass248_4;
			this.aClass248_4 = null;
		}
	}

	@OriginalMember(owner = "client!jx", name = "k", descriptor = "()V", line = 282)
	void method25260() {
		if (this.aClass248_4 != null) {
			this.aClass248_5 = this.aClass248_4;
			this.aClass248_4 = null;
		}
	}

	@OriginalMember(owner = "client!jx", name = "f", descriptor = "()V", line = 282)
	void method25262() {
		if (this.aClass248_4 != null) {
			this.aClass248_5 = this.aClass248_4;
			this.aClass248_4 = null;
		}
	}

	@OriginalMember(owner = "client!jx", name = "af", descriptor = "()Lclient!ix;", line = 289)
	Class248 method25236() {
		return this.aClass248_5;
	}

	@OriginalMember(owner = "client!jx", name = "b", descriptor = "()Lclient!ix;", line = 289)
	Class248 method25245() {
		return this.aClass248_5;
	}

	@OriginalMember(owner = "client!jx", name = "at", descriptor = "()Lclient!ix;", line = 289)
	Class248 method25258() {
		return this.aClass248_5;
	}
}
