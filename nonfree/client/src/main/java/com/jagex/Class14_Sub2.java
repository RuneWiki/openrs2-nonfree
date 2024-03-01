package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abd")
public class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!abd", name = "q", descriptor = "[B")
	byte[] aByteArray3 = new byte[512];

	@OriginalMember(owner = "client!abd", name = "e", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_2;

	@OriginalMember(owner = "client!abd", name = "v", descriptor = "I")
	int anInt182;

	@OriginalMember(owner = "client!abd", name = "m", descriptor = "I")
	int anInt181;

	@OriginalMember(owner = "client!abd", name = "r", descriptor = "Lclient!ic;")
	final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!abd", name = "d", descriptor = "Lclient!if;")
	final Interface21 anInterface21_1;

	@OriginalMember(owner = "client!abd", name = "<init>", descriptor = "(Lclient!abv;Lclient!yx;[Lclient!abc;Z)V", line = 21)
	Class14_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) Class15_Sub1[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass21_Sub3_2 = arg0;
		this.anInt182 = 0;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) Class15_Sub1 local22 = arg2[local15];
			if (local22.anInt165 > this.anInt182) {
				this.anInt182 = local22.anInt165;
			}
			if (local22.anInt169 > this.anInt182) {
				this.anInt182 = local22.anInt169;
			}
		}
		this.anInt181 = this.anInt182 * 16;
		@Pc(66) Class15_Sub1 local66;
		@Pc(69) int local69;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(93) int local93;
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(108) int local108;
		@Pc(59) int local59;
		if (arg3) {
			@Pc(57) byte[] local57 = new byte[this.anInt181 * this.anInt181];
			for (local59 = 0; local59 < 256; local59++) {
				local66 = arg2[local59];
				local69 = local66.anInt165;
				@Pc(72) int local72 = local66.anInt169;
				local79 = local59 % 16 * this.anInt182;
				local86 = local59 / 16 * this.anInt182;
				local93 = local86 * this.anInt181 + local79;
				local95 = 0;
				@Pc(101) byte[] local101;
				if (local66.aByteArray2 == null) {
					local101 = local66.aByteArray1;
					for (local103 = 0; local103 < local69; local103++) {
						for (local108 = 0; local108 < local72; local108++) {
							local57[local93++] = (byte) (local101[local95++] == 0 ? 0 : -1);
						}
						local93 += this.anInt181 - local72;
					}
				} else {
					local101 = local66.aByteArray2;
					for (local103 = 0; local103 < local69; local103++) {
						for (local108 = 0; local108 < local72; local108++) {
							local57[local93++] = local101[local95++];
						}
						local93 += this.anInt181 - local72;
					}
				}
			}
			@Pc(174) int[] local174 = new int[local57.length];
			for (@Pc(176) int local176 = 0; local176 < local57.length; local176++) {
				local174[local176] = local57[local176] << 24 | 0xFFFFFF;
			}
			this.anInterface20_3 = arg0.method17501(this.anInt181, this.anInt181, false, local174);
		} else {
			@Pc(210) int[] local210 = new int[this.anInt181 * this.anInt181];
			for (local59 = 0; local59 < 256; local59++) {
				local66 = arg2[local59];
				@Pc(222) int[] local222 = local66.anIntArray26;
				@Pc(225) byte[] local225 = local66.aByteArray2;
				@Pc(228) byte[] local228 = local66.aByteArray1;
				local86 = local66.anInt165;
				local93 = local66.anInt169;
				local95 = local59 % 16 * this.anInt182;
				@Pc(248) int local248 = local59 / 16 * this.anInt182;
				local103 = local248 * this.anInt181 + local95;
				local108 = 0;
				@Pc(261) int local261;
				@Pc(266) int local266;
				if (local225 == null) {
					for (local261 = 0; local261 < local86; local261++) {
						for (local266 = 0; local266 < local93; local266++) {
							@Pc(315) byte local315;
							if ((local315 = local228[local108++]) == 0) {
								local103++;
							} else {
								local210[local103++] = local222[local315 & 0xFF] | 0xFF000000;
							}
						}
						local103 += this.anInt181 - local93;
					}
				} else {
					for (local261 = 0; local261 < local86; local261++) {
						for (local266 = 0; local266 < local93; local266++) {
							local210[local103++] = local225[local108] << 24 | local222[local228[local108] & 0xFF];
							local108++;
						}
						local103 += this.anInt181 - local93;
					}
				}
			}
			this.anInterface20_3 = arg0.method17501(this.anInt181, this.anInt181, false, local210);
		}
		this.anInterface20_3.method9867(Class259.aClass259_6);
		this.anInterface21_1 = arg0.method17542(false);
		this.anInterface21_1.method25687(20480, 20);
		@Pc(371) ByteBuffer local371 = this.aClass21_Sub3_2.aByteBuffer4;
		local371.clear();
		@Pc(385) float local385 = this.anInterface20_3.method8932((float) this.anInt181) / (float) this.anInt181;
		@Pc(396) float local396 = this.anInterface20_3.method8933((float) this.anInt181) / (float) this.anInt181;
		@Pc(405) Class15_Sub1 local405;
		for (local69 = 0; local69 < 256; local69++) {
			local405 = arg2[local69];
			local79 = local405.anInt165;
			local86 = local405.anInt169;
			local93 = local405.anInt167;
			local95 = local405.anInt166;
			@Pc(425) float local425 = (float) (local69 % 16 * this.anInt182);
			@Pc(433) float local433 = (float) (local69 / 16 * this.anInt182);
			@Pc(437) float local437 = local425 * local385;
			@Pc(441) float local441 = local433 * local396;
			@Pc(448) float local448 = (local425 + (float) local86) * local385;
			@Pc(455) float local455 = (local433 + (float) local79) * local396;
			local371.putFloat((float) local95);
			local371.putFloat((float) local93);
			local371.putFloat(0.0F);
			local371.putFloat(local437);
			local371.putFloat(local441);
			local371.putFloat((float) local95);
			local371.putFloat((float) (local93 + local79));
			local371.putFloat(0.0F);
			local371.putFloat(local437);
			local371.putFloat(local455);
			local371.putFloat((float) (local95 + local86));
			local371.putFloat((float) (local93 + local79));
			local371.putFloat(0.0F);
			local371.putFloat(local448);
			local371.putFloat(local455);
			local371.putFloat((float) (local95 + local86));
			local371.putFloat((float) local93);
			local371.putFloat(0.0F);
			local371.putFloat(local448);
			local371.putFloat(local441);
		}
		this.anInterface21_1.method25705(0, local371.position(), this.aClass21_Sub3_2.aLong101);
		for (local69 = 0; local69 < 256; local69++) {
			local405 = arg2[local69];
			this.aByteArray3[local69 * 2] = (byte) local405.anInt166;
			this.aByteArray3[local69 * 2 + 1] = (byte) local405.anInt167;
		}
	}

	@OriginalMember(owner = "client!abd", name = "m", descriptor = "(CIIIZ)V", line = 147)
	@Override
	void method3298(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub3_2.method17453() != Class248.aClass248_2) {
			@Pc(13) int local13 = arg1 + this.aByteArray3[arg0 * 2];
			@Pc(24) int local24 = arg2 + this.aByteArray3[arg0 * 2 + 1];
			this.aClass21_Sub3_2.aClass266_3.method25238((float) local13, (float) local24, (float) (local13 + this.anInt182), (float) (local24 + this.anInt182), (float) (arg0 % 16) / 16.0F * this.anInterface20_3.method8938(), (float) (arg0 / 16) / 16.0F * this.anInterface20_3.method8939(), (float) (arg0 % 16 + 1) / 16.0F * this.anInterface20_3.method8938(), (float) (arg0 / 16 + 1) / 16.0F * this.anInterface20_3.method8939(), this.anInterface20_3, arg3);
			return;
		}
		this.aClass21_Sub3_2.method17549();
		this.aClass21_Sub3_2.method17469(1);
		@Pc(101) Class31 local101 = this.aClass21_Sub3_2.aClass31_3;
		local101.anInterface20_18 = this.anInterface20_3;
		local101.method8274(0, arg3);
		@Pc(116) float local116 = (float) this.aClass21_Sub3_2.method17037().method21390();
		@Pc(123) float local123 = (float) this.aClass21_Sub3_2.method17037().method21391();
		local101.aClass328_51.method26050(2.0F / local116, 2.0F / local123, 1.0F, 1.0F);
		local101.aClass328_51.aFloatArray106[12] = ((float) arg1 + this.aClass21_Sub3_2.method17577()) * 2.0F / local116 - 1.0F;
		local101.aClass328_51.aFloatArray106[13] = ((float) arg2 + this.aClass21_Sub3_2.method17577()) * 2.0F / local123 - 1.0F;
		local101.aClass328_51.aFloatArray106[14] = -1.0F;
		local101.aClass328_53.method26042();
		local101.anInterface21_9 = this.anInterface21_1;
		local101.anInt884 = arg0 * 4;
		local101.aClass37_10 = this.aClass21_Sub3_2.aClass37_21;
		local101.method8270();
	}

	@OriginalMember(owner = "client!abd", name = "q", descriptor = "(CIIIZ)V", line = 147)
	@Override
	void method3306(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub3_2.method17453() != Class248.aClass248_2) {
			@Pc(13) int local13 = arg1 + this.aByteArray3[arg0 * 2];
			@Pc(24) int local24 = arg2 + this.aByteArray3[arg0 * 2 + 1];
			this.aClass21_Sub3_2.aClass266_3.method25238((float) local13, (float) local24, (float) (local13 + this.anInt182), (float) (local24 + this.anInt182), (float) (arg0 % 16) / 16.0F * this.anInterface20_3.method8938(), (float) (arg0 / 16) / 16.0F * this.anInterface20_3.method8939(), (float) (arg0 % 16 + 1) / 16.0F * this.anInterface20_3.method8938(), (float) (arg0 / 16 + 1) / 16.0F * this.anInterface20_3.method8939(), this.anInterface20_3, arg3);
			return;
		}
		this.aClass21_Sub3_2.method17549();
		this.aClass21_Sub3_2.method17469(1);
		@Pc(101) Class31 local101 = this.aClass21_Sub3_2.aClass31_3;
		local101.anInterface20_18 = this.anInterface20_3;
		local101.method8274(0, arg3);
		@Pc(116) float local116 = (float) this.aClass21_Sub3_2.method17037().method21390();
		@Pc(123) float local123 = (float) this.aClass21_Sub3_2.method17037().method21391();
		local101.aClass328_51.method26050(2.0F / local116, 2.0F / local123, 1.0F, 1.0F);
		local101.aClass328_51.aFloatArray106[12] = ((float) arg1 + this.aClass21_Sub3_2.method17577()) * 2.0F / local116 - 1.0F;
		local101.aClass328_51.aFloatArray106[13] = ((float) arg2 + this.aClass21_Sub3_2.method17577()) * 2.0F / local123 - 1.0F;
		local101.aClass328_51.aFloatArray106[14] = -1.0F;
		local101.aClass328_53.method26042();
		local101.anInterface21_9 = this.anInterface21_1;
		local101.anInt884 = arg0 * 4;
		local101.aClass37_10 = this.aClass21_Sub3_2.aClass37_21;
		local101.method8270();
	}

	@OriginalMember(owner = "client!abd", name = "r", descriptor = "(CIIIZ)V", line = 147)
	@Override
	void method3295(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass21_Sub3_2.method17453() != Class248.aClass248_2) {
			@Pc(13) int local13 = arg1 + this.aByteArray3[arg0 * 2];
			@Pc(24) int local24 = arg2 + this.aByteArray3[arg0 * 2 + 1];
			this.aClass21_Sub3_2.aClass266_3.method25238((float) local13, (float) local24, (float) (local13 + this.anInt182), (float) (local24 + this.anInt182), (float) (arg0 % 16) / 16.0F * this.anInterface20_3.method8938(), (float) (arg0 / 16) / 16.0F * this.anInterface20_3.method8939(), (float) (arg0 % 16 + 1) / 16.0F * this.anInterface20_3.method8938(), (float) (arg0 / 16 + 1) / 16.0F * this.anInterface20_3.method8939(), this.anInterface20_3, arg3);
			return;
		}
		this.aClass21_Sub3_2.method17549();
		this.aClass21_Sub3_2.method17469(1);
		@Pc(101) Class31 local101 = this.aClass21_Sub3_2.aClass31_3;
		local101.anInterface20_18 = this.anInterface20_3;
		local101.method8274(0, arg3);
		@Pc(116) float local116 = (float) this.aClass21_Sub3_2.method17037().method21390();
		@Pc(123) float local123 = (float) this.aClass21_Sub3_2.method17037().method21391();
		local101.aClass328_51.method26050(2.0F / local116, 2.0F / local123, 1.0F, 1.0F);
		local101.aClass328_51.aFloatArray106[12] = ((float) arg1 + this.aClass21_Sub3_2.method17577()) * 2.0F / local116 - 1.0F;
		local101.aClass328_51.aFloatArray106[13] = ((float) arg2 + this.aClass21_Sub3_2.method17577()) * 2.0F / local123 - 1.0F;
		local101.aClass328_51.aFloatArray106[14] = -1.0F;
		local101.aClass328_53.method26042();
		local101.anInterface21_9 = this.anInterface21_1;
		local101.anInt884 = arg0 * 4;
		local101.aClass37_10 = this.aClass21_Sub3_2.aClass37_21;
		local101.method8270();
	}

	@OriginalMember(owner = "client!abd", name = "o", descriptor = "(CIIIZLclient!ch;II)V", line = 172)
	@Override
	void method3302(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!abd", name = "d", descriptor = "(CIIIZLclient!ch;II)V", line = 172)
	@Override
	void method3328(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!abd", name = "v", descriptor = "(CIIIZLclient!ch;II)V", line = 172)
	@Override
	void method3299(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!abd", name = "t", descriptor = "(CIIIZLclient!ch;II)V", line = 172)
	@Override
	void method3300(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!abd", name = "w", descriptor = "(CIIIZLclient!ch;II)V", line = 172)
	@Override
	void method3289(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}
}
