package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xv")
public class Class672 {

	@OriginalMember(owner = "client!xv", name = "el", descriptor = "Z")
	static boolean aBoolean869;

	@OriginalMember(owner = "client!xv", name = "be", descriptor = "Ljava/lang/String;")
	public static String aString238;

	@OriginalMember(owner = "client!xv", name = "m", descriptor = "F")
	float aFloat344;

	@OriginalMember(owner = "client!xv", name = "z", descriptor = "F")
	float aFloat345;

	@OriginalMember(owner = "client!xv", name = "c", descriptor = "Lclient!sv;")
	Class562 aClass562_3;

	@OriginalMember(owner = "client!xv", name = "k", descriptor = "F")
	float aFloat346;

	@OriginalMember(owner = "client!xv", name = "f", descriptor = "Lclient!ox;")
	Class472 aClass472_65;

	@OriginalMember(owner = "client!xv", name = "w", descriptor = "I")
	int anInt5860;

	@OriginalMember(owner = "client!xv", name = "l", descriptor = "I")
	int anInt5861;

	@OriginalMember(owner = "client!xv", name = "u", descriptor = "Lclient!dz;")
	Class107 aClass107_2;

	@OriginalMember(owner = "client!xv", name = "p", descriptor = "F")
	float aFloat348;

	@OriginalMember(owner = "client!xv", name = "n", descriptor = "F")
	float aFloat349;

	@OriginalMember(owner = "client!xv", name = "d", descriptor = "F")
	float aFloat352;

	@OriginalMember(owner = "client!xv", name = "e", descriptor = "I")
	int anInt5862;

	@OriginalMember(owner = "client!xv", name = "r", descriptor = "F")
	float aFloat351 = 1.0F;

	@OriginalMember(owner = "client!xv", name = "v", descriptor = "F")
	float aFloat347 = 0.0F;

	@OriginalMember(owner = "client!xv", name = "o", descriptor = "F")
	float aFloat353 = 1.0F;

	@OriginalMember(owner = "client!xv", name = "s", descriptor = "F")
	float aFloat354 = 0.0F;

	@OriginalMember(owner = "client!xv", name = "y", descriptor = "F")
	float aFloat350 = 1.0F;

	@OriginalMember(owner = "client!xv", name = "q", descriptor = "[I")
	int[] anIntArray515 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!xv", name = "x", descriptor = "[F")
	float[] aFloatArray121 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!xv", name = "<init>", descriptor = "()V", line = 38)
	public Class672() {
		this.method33061();
	}

	@OriginalMember(owner = "client!xv", name = "<init>", descriptor = "(Lclient!alw;Lclient!xu;)V", line = 42)
	public Class672(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		this.method33049(arg0, arg1);
	}

	@OriginalMember(owner = "client!xv", name = "r", descriptor = "()V", line = 47)
	void method33059() {
		this.anInt5862 = -322603459;
		this.aClass472_65 = Class472.method29529(-50.0F, -60.0F, -50.0F);
		this.aFloat349 = 1.1523438F;
		this.aFloat344 = 0.69921875F;
		this.aFloat346 = 1.2F;
		this.anInt5860 = -137394200;
		this.anInt5861 = 0;
		this.aClass107_2 = Class671.aClass107_1;
		this.aFloat345 = 1.0F;
		this.aFloat348 = 0.25F;
		this.aFloat352 = 1.0F;
		this.aClass562_3 = Class671.aClass562_2;
		this.aFloat351 = 1.0F;
		this.aFloat347 = 0.0F;
		this.aFloat353 = 1.0F;
		this.aFloat354 = 0.0F;
		this.aFloat350 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray515;
		@Pc(59) int[] local59 = this.anIntArray515;
		this.anIntArray515[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray121;
		@Pc(78) float[] local78 = this.aFloatArray121;
		this.aFloatArray121[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xv", name = "e", descriptor = "(B)V", line = 47)
	void method33061() {
		this.anInt5862 = -322603459;
		this.aClass472_65 = Class472.method29529(-50.0F, -60.0F, -50.0F);
		this.aFloat349 = 1.1523438F;
		this.aFloat344 = 0.69921875F;
		this.aFloat346 = 1.2F;
		this.anInt5860 = -137394200;
		this.anInt5861 = 0;
		this.aClass107_2 = Class671.aClass107_1;
		this.aFloat345 = 1.0F;
		this.aFloat348 = 0.25F;
		this.aFloat352 = 1.0F;
		this.aClass562_3 = Class671.aClass562_2;
		this.aFloat351 = 1.0F;
		this.aFloat347 = 0.0F;
		this.aFloat353 = 1.0F;
		this.aFloat354 = 0.0F;
		this.aFloat350 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray515;
		@Pc(59) int[] local59 = this.anIntArray515;
		this.anIntArray515[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray121;
		@Pc(78) float[] local78 = this.aFloatArray121;
		this.aFloatArray121[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xv", name = "q", descriptor = "(Lclient!xv;)V", line = 77)
	void method33046(@OriginalArg(0) Class672 arg0) {
		this.anInt5862 = arg0.anInt5862;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat346 = arg0.aFloat346;
		this.aClass472_65.method29538(arg0.aClass472_65);
		this.anInt5860 = arg0.anInt5860;
		this.anInt5861 = arg0.anInt5861;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat348 = arg0.aFloat348;
		this.aFloat352 = arg0.aFloat352;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat351 = arg0.aFloat351;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat354 = arg0.aFloat354;
		this.aFloat350 = arg0.aFloat350;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "s", descriptor = "(Lclient!xv;)V", line = 77)
	void method33062(@OriginalArg(0) Class672 arg0) {
		this.anInt5862 = arg0.anInt5862;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat346 = arg0.aFloat346;
		this.aClass472_65.method29538(arg0.aClass472_65);
		this.anInt5860 = arg0.anInt5860;
		this.anInt5861 = arg0.anInt5861;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat348 = arg0.aFloat348;
		this.aFloat352 = arg0.aFloat352;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat351 = arg0.aFloat351;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat354 = arg0.aFloat354;
		this.aFloat350 = arg0.aFloat350;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "y", descriptor = "(Lclient!xv;)V", line = 77)
	void method33063(@OriginalArg(0) Class672 arg0) {
		this.anInt5862 = arg0.anInt5862;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat346 = arg0.aFloat346;
		this.aClass472_65.method29538(arg0.aClass472_65);
		this.anInt5860 = arg0.anInt5860;
		this.anInt5861 = arg0.anInt5861;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat348 = arg0.aFloat348;
		this.aFloat352 = arg0.aFloat352;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat351 = arg0.aFloat351;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat354 = arg0.aFloat354;
		this.aFloat350 = arg0.aFloat350;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "n", descriptor = "(Lclient!xv;B)V", line = 77)
	void method33067(@OriginalArg(0) Class672 arg0) {
		this.anInt5862 = arg0.anInt5862;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat346 = arg0.aFloat346;
		this.aClass472_65.method29538(arg0.aClass472_65);
		this.anInt5860 = arg0.anInt5860;
		this.anInt5861 = arg0.anInt5861;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat348 = arg0.aFloat348;
		this.aFloat352 = arg0.aFloat352;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat351 = arg0.aFloat351;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat354 = arg0.aFloat354;
		this.aFloat350 = arg0.aFloat350;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "v", descriptor = "(Lclient!xv;)V", line = 77)
	void method33073(@OriginalArg(0) Class672 arg0) {
		this.anInt5862 = arg0.anInt5862;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat346 = arg0.aFloat346;
		this.aClass472_65.method29538(arg0.aClass472_65);
		this.anInt5860 = arg0.anInt5860;
		this.anInt5861 = arg0.anInt5861;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat348 = arg0.aFloat348;
		this.aFloat352 = arg0.aFloat352;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat351 = arg0.aFloat351;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat354 = arg0.aFloat354;
		this.aFloat350 = arg0.aFloat350;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "o", descriptor = "(Lclient!xv;)V", line = 77)
	void method33074(@OriginalArg(0) Class672 arg0) {
		this.anInt5862 = arg0.anInt5862;
		this.aFloat349 = arg0.aFloat349;
		this.aFloat344 = arg0.aFloat344;
		this.aFloat346 = arg0.aFloat346;
		this.aClass472_65.method29538(arg0.aClass472_65);
		this.anInt5860 = arg0.anInt5860;
		this.anInt5861 = arg0.anInt5861;
		this.aClass107_2 = arg0.aClass107_2;
		this.aFloat345 = arg0.aFloat345;
		this.aFloat348 = arg0.aFloat348;
		this.aFloat352 = arg0.aFloat352;
		this.aClass562_3 = arg0.aClass562_3;
		this.aFloat351 = arg0.aFloat351;
		this.aFloat347 = arg0.aFloat347;
		this.aFloat353 = arg0.aFloat353;
		this.aFloat354 = arg0.aFloat354;
		this.aFloat350 = arg0.aFloat350;
		this.anIntArray515[0] = arg0.anIntArray515[0];
		this.anIntArray515[1] = arg0.anIntArray515[1];
		this.anIntArray515[2] = arg0.anIntArray515[2];
		this.aFloatArray121[0] = arg0.aFloatArray121[0];
		this.aFloatArray121[1] = arg0.aFloatArray121[1];
		this.aFloatArray121[2] = arg0.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "h", descriptor = "(Lclient!dh;Lclient!xv;Lclient!xv;F)V", line = 103)
	void method33050(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class672 arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) float arg3) {
		this.anInt5862 = Class125_Sub2_Sub1.method21469(arg1.anInt5862 * 1540075243, arg2.anInt5862 * 1540075243, arg3 * 255.0F) * -700806717;
		this.aFloat344 = arg1.aFloat344 + (arg2.aFloat344 - arg1.aFloat344) * arg3;
		this.aFloat346 = arg3 * (arg2.aFloat346 - arg1.aFloat346) + arg1.aFloat346;
		this.aFloat349 = arg1.aFloat349 + arg3 * (arg2.aFloat349 - arg1.aFloat349);
		this.aFloat352 = arg3 * (arg2.aFloat352 - arg1.aFloat352) + arg1.aFloat352;
		this.aFloat345 = (arg2.aFloat345 - arg1.aFloat345) * arg3 + arg1.aFloat345;
		this.aFloat348 = arg1.aFloat348 + arg3 * (arg2.aFloat348 - arg1.aFloat348);
		this.anInt5860 = Class125_Sub2_Sub1.method21469(arg1.anInt5860 * -2016142599, arg2.anInt5860 * -2016142599, arg3 * 255.0F) * -597457079;
		this.anInt5861 = (int) ((float) (arg2.anInt5861 * -2139322713 - arg1.anInt5861 * -2139322713) * arg3 + (float) (arg1.anInt5861 * -2139322713)) * -2016100073;
		if (arg2.aClass107_2 != arg1.aClass107_2) {
			this.aClass107_2 = arg0.method20734(arg1.aClass107_2, arg2.aClass107_2, arg3, this.aClass107_2);
		}
		if (arg1.aClass562_3 != arg2.aClass562_3) {
			if (arg1.aClass562_3 == null) {
				this.aClass562_3 = arg2.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31157((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass562_3 = arg1.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31157((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat351 = arg1.aFloat351 + (arg2.aFloat351 - arg1.aFloat351) * arg3;
		this.aFloat347 = arg1.aFloat347 + arg3 * (arg2.aFloat347 - arg1.aFloat347);
		this.aFloat353 = arg1.aFloat353 + arg3 * (arg2.aFloat353 - arg1.aFloat353);
		this.aFloat354 = arg3 * (arg2.aFloat354 - arg1.aFloat354) + arg1.aFloat354;
		this.aFloat350 = arg1.aFloat350 + (arg2.aFloat350 - arg1.aFloat350) * arg3;
		@Pc(261) float local261 = arg1.aFloatArray121[2] + arg1.aFloatArray121[1] + arg1.aFloatArray121[0];
		@Pc(276) float local276 = arg2.aFloatArray121[2] + arg2.aFloatArray121[0] + arg2.aFloatArray121[1];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray515;
			@Pc(294) int[] local294 = this.anIntArray515;
			this.anIntArray515[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray121;
			local313 = this.aFloatArray121;
			this.aFloatArray121[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray515[0] == -1 && arg1.anIntArray515[1] == -1 && arg1.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg2.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = arg2.aFloatArray121[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray515[0] == -1 && arg2.anIntArray515[1] == -1 && arg2.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg1.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = (1.0F - arg3) * arg1.aFloatArray121[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray515[local503] > -1) {
					local474[local447] = arg1.anIntArray515[local503];
					local313[local447++] = arg1.aFloatArray121[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray515[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray121[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (arg2.anIntArray515[local535] == local474[local553]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray515[local535];
							local313[local447++] = local551;
						}
					}
				}
			}
			if (local447 > 3) {
				@Pc(598) float local598 = 0.0F;
				@Pc(600) float local600 = 0.0F;
				@Pc(602) int local602;
				for (local602 = 0; local602 < local447; local602++) {
					local598 += local313[local602];
				}
				Class630.method32271(local313, local474, 0, local447 - 1);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray515[local535] = local474[local535];
				this.aFloatArray121[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "x", descriptor = "(Lclient!dh;Lclient!xv;Lclient!xv;F)V", line = 103)
	void method33065(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class672 arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) float arg3) {
		this.anInt5862 = Class125_Sub2_Sub1.method21469(arg1.anInt5862 * 1540075243, arg2.anInt5862 * 1540075243, arg3 * 255.0F) * -700806717;
		this.aFloat344 = arg1.aFloat344 + (arg2.aFloat344 - arg1.aFloat344) * arg3;
		this.aFloat346 = arg3 * (arg2.aFloat346 - arg1.aFloat346) + arg1.aFloat346;
		this.aFloat349 = arg1.aFloat349 + arg3 * (arg2.aFloat349 - arg1.aFloat349);
		this.aFloat352 = arg3 * (arg2.aFloat352 - arg1.aFloat352) + arg1.aFloat352;
		this.aFloat345 = (arg2.aFloat345 - arg1.aFloat345) * arg3 + arg1.aFloat345;
		this.aFloat348 = arg1.aFloat348 + arg3 * (arg2.aFloat348 - arg1.aFloat348);
		this.anInt5860 = Class125_Sub2_Sub1.method21469(arg1.anInt5860 * -2016142599, arg2.anInt5860 * -2016142599, arg3 * 255.0F) * -597457079;
		this.anInt5861 = (int) ((float) (arg2.anInt5861 * -2139322713 - arg1.anInt5861 * -2139322713) * arg3 + (float) (arg1.anInt5861 * -2139322713)) * -2016100073;
		if (arg2.aClass107_2 != arg1.aClass107_2) {
			this.aClass107_2 = arg0.method20734(arg1.aClass107_2, arg2.aClass107_2, arg3, this.aClass107_2);
		}
		if (arg1.aClass562_3 != arg2.aClass562_3) {
			if (arg1.aClass562_3 == null) {
				this.aClass562_3 = arg2.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31157((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass562_3 = arg1.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31157((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat351 = arg1.aFloat351 + (arg2.aFloat351 - arg1.aFloat351) * arg3;
		this.aFloat347 = arg1.aFloat347 + arg3 * (arg2.aFloat347 - arg1.aFloat347);
		this.aFloat353 = arg1.aFloat353 + arg3 * (arg2.aFloat353 - arg1.aFloat353);
		this.aFloat354 = arg3 * (arg2.aFloat354 - arg1.aFloat354) + arg1.aFloat354;
		this.aFloat350 = arg1.aFloat350 + (arg2.aFloat350 - arg1.aFloat350) * arg3;
		@Pc(261) float local261 = arg1.aFloatArray121[2] + arg1.aFloatArray121[1] + arg1.aFloatArray121[0];
		@Pc(276) float local276 = arg2.aFloatArray121[2] + arg2.aFloatArray121[0] + arg2.aFloatArray121[1];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray515;
			@Pc(294) int[] local294 = this.anIntArray515;
			this.anIntArray515[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray121;
			local313 = this.aFloatArray121;
			this.aFloatArray121[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray515[0] == -1 && arg1.anIntArray515[1] == -1 && arg1.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg2.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = arg2.aFloatArray121[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray515[0] == -1 && arg2.anIntArray515[1] == -1 && arg2.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg1.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = (1.0F - arg3) * arg1.aFloatArray121[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray515[local503] > -1) {
					local474[local447] = arg1.anIntArray515[local503];
					local313[local447++] = arg1.aFloatArray121[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray515[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray121[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (arg2.anIntArray515[local535] == local474[local553]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray515[local535];
							local313[local447++] = local551;
						}
					}
				}
			}
			if (local447 > 3) {
				@Pc(598) float local598 = 0.0F;
				@Pc(600) float local600 = 0.0F;
				@Pc(602) int local602;
				for (local602 = 0; local602 < local447; local602++) {
					local598 += local313[local602];
				}
				Class630.method32271(local313, local474, 0, local447 - 1);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray515[local535] = local474[local535];
				this.aFloatArray121[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "b", descriptor = "(Lclient!dh;Lclient!xv;Lclient!xv;F)V", line = 103)
	void method33066(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class672 arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) float arg3) {
		this.anInt5862 = Class125_Sub2_Sub1.method21469(arg1.anInt5862 * 1540075243, arg2.anInt5862 * 1540075243, arg3 * 255.0F) * -700806717;
		this.aFloat344 = arg1.aFloat344 + (arg2.aFloat344 - arg1.aFloat344) * arg3;
		this.aFloat346 = arg3 * (arg2.aFloat346 - arg1.aFloat346) + arg1.aFloat346;
		this.aFloat349 = arg1.aFloat349 + arg3 * (arg2.aFloat349 - arg1.aFloat349);
		this.aFloat352 = arg3 * (arg2.aFloat352 - arg1.aFloat352) + arg1.aFloat352;
		this.aFloat345 = (arg2.aFloat345 - arg1.aFloat345) * arg3 + arg1.aFloat345;
		this.aFloat348 = arg1.aFloat348 + arg3 * (arg2.aFloat348 - arg1.aFloat348);
		this.anInt5860 = Class125_Sub2_Sub1.method21469(arg1.anInt5860 * -2016142599, arg2.anInt5860 * -2016142599, arg3 * 255.0F) * -597457079;
		this.anInt5861 = (int) ((float) (arg2.anInt5861 * -2139322713 - arg1.anInt5861 * -2139322713) * arg3 + (float) (arg1.anInt5861 * -2139322713)) * -2016100073;
		if (arg2.aClass107_2 != arg1.aClass107_2) {
			this.aClass107_2 = arg0.method20734(arg1.aClass107_2, arg2.aClass107_2, arg3, this.aClass107_2);
		}
		if (arg1.aClass562_3 != arg2.aClass562_3) {
			if (arg1.aClass562_3 == null) {
				this.aClass562_3 = arg2.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31157((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass562_3 = arg1.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31157((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat351 = arg1.aFloat351 + (arg2.aFloat351 - arg1.aFloat351) * arg3;
		this.aFloat347 = arg1.aFloat347 + arg3 * (arg2.aFloat347 - arg1.aFloat347);
		this.aFloat353 = arg1.aFloat353 + arg3 * (arg2.aFloat353 - arg1.aFloat353);
		this.aFloat354 = arg3 * (arg2.aFloat354 - arg1.aFloat354) + arg1.aFloat354;
		this.aFloat350 = arg1.aFloat350 + (arg2.aFloat350 - arg1.aFloat350) * arg3;
		@Pc(261) float local261 = arg1.aFloatArray121[2] + arg1.aFloatArray121[1] + arg1.aFloatArray121[0];
		@Pc(276) float local276 = arg2.aFloatArray121[2] + arg2.aFloatArray121[0] + arg2.aFloatArray121[1];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray515;
			@Pc(294) int[] local294 = this.anIntArray515;
			this.anIntArray515[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray121;
			local313 = this.aFloatArray121;
			this.aFloatArray121[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray515[0] == -1 && arg1.anIntArray515[1] == -1 && arg1.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg2.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = arg2.aFloatArray121[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray515[0] == -1 && arg2.anIntArray515[1] == -1 && arg2.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg1.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = (1.0F - arg3) * arg1.aFloatArray121[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray515[local503] > -1) {
					local474[local447] = arg1.anIntArray515[local503];
					local313[local447++] = arg1.aFloatArray121[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray515[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray121[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (arg2.anIntArray515[local535] == local474[local553]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray515[local535];
							local313[local447++] = local551;
						}
					}
				}
			}
			if (local447 > 3) {
				@Pc(598) float local598 = 0.0F;
				@Pc(600) float local600 = 0.0F;
				@Pc(602) int local602;
				for (local602 = 0; local602 < local447; local602++) {
					local598 += local313[local602];
				}
				Class630.method32271(local313, local474, 0, local447 - 1);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray515[local535] = local474[local535];
				this.aFloatArray121[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "m", descriptor = "(Lclient!dh;Lclient!xv;Lclient!xv;FI)V", line = 103)
	void method33078(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class672 arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) float arg3) {
		this.anInt5862 = Class125_Sub2_Sub1.method21469(arg1.anInt5862 * 1540075243, arg2.anInt5862 * 1540075243, arg3 * 255.0F) * -700806717;
		this.aFloat344 = arg1.aFloat344 + (arg2.aFloat344 - arg1.aFloat344) * arg3;
		this.aFloat346 = arg3 * (arg2.aFloat346 - arg1.aFloat346) + arg1.aFloat346;
		this.aFloat349 = arg1.aFloat349 + arg3 * (arg2.aFloat349 - arg1.aFloat349);
		this.aFloat352 = arg3 * (arg2.aFloat352 - arg1.aFloat352) + arg1.aFloat352;
		this.aFloat345 = (arg2.aFloat345 - arg1.aFloat345) * arg3 + arg1.aFloat345;
		this.aFloat348 = arg1.aFloat348 + arg3 * (arg2.aFloat348 - arg1.aFloat348);
		this.anInt5860 = Class125_Sub2_Sub1.method21469(arg1.anInt5860 * -2016142599, arg2.anInt5860 * -2016142599, arg3 * 255.0F) * -597457079;
		this.anInt5861 = (int) ((float) (arg2.anInt5861 * -2139322713 - arg1.anInt5861 * -2139322713) * arg3 + (float) (arg1.anInt5861 * -2139322713)) * -2016100073;
		if (arg2.aClass107_2 != arg1.aClass107_2) {
			this.aClass107_2 = arg0.method20734(arg1.aClass107_2, arg2.aClass107_2, arg3, this.aClass107_2);
		}
		if (arg1.aClass562_3 != arg2.aClass562_3) {
			if (arg1.aClass562_3 == null) {
				this.aClass562_3 = arg2.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31157((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass562_3 = arg1.aClass562_3;
				if (this.aClass562_3 != null) {
					this.aClass562_3.method31157((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat351 = arg1.aFloat351 + (arg2.aFloat351 - arg1.aFloat351) * arg3;
		this.aFloat347 = arg1.aFloat347 + arg3 * (arg2.aFloat347 - arg1.aFloat347);
		this.aFloat353 = arg1.aFloat353 + arg3 * (arg2.aFloat353 - arg1.aFloat353);
		this.aFloat354 = arg3 * (arg2.aFloat354 - arg1.aFloat354) + arg1.aFloat354;
		this.aFloat350 = arg1.aFloat350 + (arg2.aFloat350 - arg1.aFloat350) * arg3;
		@Pc(261) float local261 = arg1.aFloatArray121[2] + arg1.aFloatArray121[1] + arg1.aFloatArray121[0];
		@Pc(276) float local276 = arg2.aFloatArray121[2] + arg2.aFloatArray121[0] + arg2.aFloatArray121[1];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray515;
			@Pc(294) int[] local294 = this.anIntArray515;
			this.anIntArray515[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray121;
			local313 = this.aFloatArray121;
			this.aFloatArray121[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray515[0] == -1 && arg1.anIntArray515[1] == -1 && arg1.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg2.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = arg2.aFloatArray121[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray515[0] == -1 && arg2.anIntArray515[1] == -1 && arg2.anIntArray515[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray515[local347] = arg1.anIntArray515[local347];
				if (this.anIntArray515[local347] == -1) {
					this.aFloatArray121[local347] = 0.0F;
				} else {
					this.aFloatArray121[local347] = (1.0F - arg3) * arg1.aFloatArray121[local347];
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray515[local503] > -1) {
					local474[local447] = arg1.anIntArray515[local503];
					local313[local447++] = arg1.aFloatArray121[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray515[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray121[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (arg2.anIntArray515[local535] == local474[local553]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray515[local535];
							local313[local447++] = local551;
						}
					}
				}
			}
			if (local447 > 3) {
				@Pc(598) float local598 = 0.0F;
				@Pc(600) float local600 = 0.0F;
				@Pc(602) int local602;
				for (local602 = 0; local602 < local447; local602++) {
					local598 += local313[local602];
				}
				Class630.method32271(local313, local474, 0, local447 - 1);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray515[local535] = local474[local535];
				this.aFloatArray121[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "k", descriptor = "(Lclient!alw;Lclient!xu;B)V", line = 204)
	public void method33049(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		@Pc(3) int local3 = arg0.method22413();
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1 && Class694.aClass104_14.method20413() > 0) {
			if ((local3 & Class692.aClass692_8.anInt5935 * -457319509) == 0) {
				this.anInt5862 = -322603459;
			} else {
				this.anInt5862 = arg0.method22419() * -700806717;
			}
			if ((local3 & Class692.aClass692_4.anInt5935 * -457319509) == 0) {
				this.aFloat349 = 1.1523438F;
			} else {
				this.aFloat349 = (float) arg0.method22415() / 256.0F;
			}
			if ((local3 & Class692.aClass692_3.anInt5935 * -457319509) == 0) {
				this.aFloat344 = 0.69921875F;
			} else {
				this.aFloat344 = (float) arg0.method22415() / 256.0F;
			}
			if ((local3 & Class692.aClass692_2.anInt5935 * -457319509) == 0) {
				this.aFloat346 = 1.2F;
			} else {
				this.aFloat346 = (float) arg0.method22415() / 256.0F;
			}
		} else {
			if ((local3 & Class692.aClass692_8.anInt5935 * -457319509) != 0) {
				arg0.method22419();
			}
			if ((local3 & Class692.aClass692_4.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			if ((local3 & Class692.aClass692_3.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			if ((local3 & Class692.aClass692_2.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			this.anInt5862 = -322603459;
			this.aFloat346 = 1.2F;
			this.aFloat344 = 0.69921875F;
			this.aFloat349 = 1.1523438F;
		}
		if ((local3 & Class692.aClass692_5.anInt5935 * -457319509) == 0) {
			this.aClass472_65 = Class472.method29529(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass472_65 = Class472.method29529((float) arg0.method22482(), (float) arg0.method22482(), (float) arg0.method22482());
		}
		if ((local3 & Class692.aClass692_6.anInt5935 * -457319509) == 0) {
			this.anInt5860 = -137394200;
		} else {
			this.anInt5860 = arg0.method22419() * -597457079;
		}
		if ((local3 & Class692.aClass692_7.anInt5935 * -457319509) == 0) {
			this.anInt5861 = 0;
		} else {
			this.anInt5861 = arg0.method22415() * -2016100073;
		}
		if ((local3 & Class692.aClass692_1.anInt5935 * -457319509) == 0) {
			this.aClass107_2 = Class671.aClass107_1;
		} else {
			@Pc(225) int local225 = arg0.method22415();
			this.aClass107_2 = arg1.method32969(local225);
		}
	}

	@OriginalMember(owner = "client!xv", name = "a", descriptor = "(Lclient!alw;Lclient!xu;)V", line = 204)
	public void method33068(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		@Pc(3) int local3 = arg0.method22413();
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1 && Class694.aClass104_14.method20413() > 0) {
			if ((local3 & Class692.aClass692_8.anInt5935 * -457319509) == 0) {
				this.anInt5862 = -322603459;
			} else {
				this.anInt5862 = arg0.method22419() * -700806717;
			}
			if ((local3 & Class692.aClass692_4.anInt5935 * -457319509) == 0) {
				this.aFloat349 = 1.1523438F;
			} else {
				this.aFloat349 = (float) arg0.method22415() / 256.0F;
			}
			if ((local3 & Class692.aClass692_3.anInt5935 * -457319509) == 0) {
				this.aFloat344 = 0.69921875F;
			} else {
				this.aFloat344 = (float) arg0.method22415() / 256.0F;
			}
			if ((local3 & Class692.aClass692_2.anInt5935 * -457319509) == 0) {
				this.aFloat346 = 1.2F;
			} else {
				this.aFloat346 = (float) arg0.method22415() / 256.0F;
			}
		} else {
			if ((local3 & Class692.aClass692_8.anInt5935 * -457319509) != 0) {
				arg0.method22419();
			}
			if ((local3 & Class692.aClass692_4.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			if ((local3 & Class692.aClass692_3.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			if ((local3 & Class692.aClass692_2.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			this.anInt5862 = -322603459;
			this.aFloat346 = 1.2F;
			this.aFloat344 = 0.69921875F;
			this.aFloat349 = 1.1523438F;
		}
		if ((local3 & Class692.aClass692_5.anInt5935 * -457319509) == 0) {
			this.aClass472_65 = Class472.method29529(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass472_65 = Class472.method29529((float) arg0.method22482(), (float) arg0.method22482(), (float) arg0.method22482());
		}
		if ((local3 & Class692.aClass692_6.anInt5935 * -457319509) == 0) {
			this.anInt5860 = -137394200;
		} else {
			this.anInt5860 = arg0.method22419() * -597457079;
		}
		if ((local3 & Class692.aClass692_7.anInt5935 * -457319509) == 0) {
			this.anInt5861 = 0;
		} else {
			this.anInt5861 = arg0.method22415() * -2016100073;
		}
		if ((local3 & Class692.aClass692_1.anInt5935 * -457319509) == 0) {
			this.aClass107_2 = Class671.aClass107_1;
		} else {
			@Pc(225) int local225 = arg0.method22415();
			this.aClass107_2 = arg1.method32969(local225);
		}
	}

	@OriginalMember(owner = "client!xv", name = "g", descriptor = "(Lclient!alw;Lclient!xu;)V", line = 204)
	public void method33069(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		@Pc(3) int local3 = arg0.method22413();
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1 && Class694.aClass104_14.method20413() > 0) {
			if ((local3 & Class692.aClass692_8.anInt5935 * -457319509) == 0) {
				this.anInt5862 = -322603459;
			} else {
				this.anInt5862 = arg0.method22419() * -700806717;
			}
			if ((local3 & Class692.aClass692_4.anInt5935 * -457319509) == 0) {
				this.aFloat349 = 1.1523438F;
			} else {
				this.aFloat349 = (float) arg0.method22415() / 256.0F;
			}
			if ((local3 & Class692.aClass692_3.anInt5935 * -457319509) == 0) {
				this.aFloat344 = 0.69921875F;
			} else {
				this.aFloat344 = (float) arg0.method22415() / 256.0F;
			}
			if ((local3 & Class692.aClass692_2.anInt5935 * -457319509) == 0) {
				this.aFloat346 = 1.2F;
			} else {
				this.aFloat346 = (float) arg0.method22415() / 256.0F;
			}
		} else {
			if ((local3 & Class692.aClass692_8.anInt5935 * -457319509) != 0) {
				arg0.method22419();
			}
			if ((local3 & Class692.aClass692_4.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			if ((local3 & Class692.aClass692_3.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			if ((local3 & Class692.aClass692_2.anInt5935 * -457319509) != 0) {
				arg0.method22415();
			}
			this.anInt5862 = -322603459;
			this.aFloat346 = 1.2F;
			this.aFloat344 = 0.69921875F;
			this.aFloat349 = 1.1523438F;
		}
		if ((local3 & Class692.aClass692_5.anInt5935 * -457319509) == 0) {
			this.aClass472_65 = Class472.method29529(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass472_65 = Class472.method29529((float) arg0.method22482(), (float) arg0.method22482(), (float) arg0.method22482());
		}
		if ((local3 & Class692.aClass692_6.anInt5935 * -457319509) == 0) {
			this.anInt5860 = -137394200;
		} else {
			this.anInt5860 = arg0.method22419() * -597457079;
		}
		if ((local3 & Class692.aClass692_7.anInt5935 * -457319509) == 0) {
			this.anInt5861 = 0;
		} else {
			this.anInt5861 = arg0.method22415() * -2016100073;
		}
		if ((local3 & Class692.aClass692_1.anInt5935 * -457319509) == 0) {
			this.aClass107_2 = Class671.aClass107_1;
		} else {
			@Pc(225) int local225 = arg0.method22415();
			this.aClass107_2 = arg1.method32969(local225);
		}
	}

	@OriginalMember(owner = "client!xv", name = "i", descriptor = "(Lclient!alw;)V", line = 239)
	public void method33048(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat345 = arg0.method22425();
		this.aFloat348 = arg0.method22425();
		this.aFloat352 = arg0.method22425();
	}

	@OriginalMember(owner = "client!xv", name = "f", descriptor = "(Lclient!alw;I)V", line = 239)
	public void method33051(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat345 = arg0.method22425();
		this.aFloat348 = arg0.method22425();
		this.aFloat352 = arg0.method22425();
	}

	@OriginalMember(owner = "client!xv", name = "w", descriptor = "(Lclient!alw;I)V", line = 245)
	public void method33052(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method33053(arg0, 0);
	}

	@OriginalMember(owner = "client!xv", name = "j", descriptor = "(Lclient!alw;)V", line = 245)
	public void method33070(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method33053(arg0, 0);
	}

	@OriginalMember(owner = "client!xv", name = "l", descriptor = "(Lclient!alw;II)V", line = 249)
	void method33053(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray515[arg1] = arg0.method22415();
		this.aFloatArray121[arg1] = arg0.method22425();
	}

	@OriginalMember(owner = "client!xv", name = "t", descriptor = "(Lclient!alw;I)V", line = 249)
	void method33071(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray515[arg1] = arg0.method22415();
		this.aFloatArray121[arg1] = arg0.method22425();
	}

	@OriginalMember(owner = "client!xv", name = "u", descriptor = "(Lclient!alw;Lclient!xu;I)V", line = 254)
	public void method33054(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		@Pc(3) int local3 = arg0.method22415();
		@Pc(7) int local7 = arg0.method22482();
		@Pc(11) int local11 = arg0.method22482();
		@Pc(15) int local15 = arg0.method22482();
		@Pc(19) int local19 = arg0.method22415();
		Class121.anInt1003 = local19 * -1237225441;
		this.aClass562_3 = arg1.method32970(local3, local7, local11, local15);
	}

	@OriginalMember(owner = "client!xv", name = "ae", descriptor = "(Lclient!alw;Lclient!xu;)V", line = 254)
	public void method33072(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class671 arg1) {
		@Pc(3) int local3 = arg0.method22415();
		@Pc(7) int local7 = arg0.method22482();
		@Pc(11) int local11 = arg0.method22482();
		@Pc(15) int local15 = arg0.method22482();
		@Pc(19) int local19 = arg0.method22415();
		Class121.anInt1003 = local19 * -1237225441;
		this.aClass562_3 = arg1.method32970(local3, local7, local11, local15);
	}

	@OriginalMember(owner = "client!xv", name = "z", descriptor = "(Lclient!xv;I)Z", line = 264)
	boolean method33055(@OriginalArg(0) Class672 arg0) {
		return arg0.anInt5862 * 1540075243 == this.anInt5862 * 1540075243 && this.aFloat349 == arg0.aFloat349 && this.aFloat344 == arg0.aFloat344 && arg0.aFloat346 == this.aFloat346 && arg0.aFloat348 == this.aFloat348 && this.aFloat345 == arg0.aFloat345 && arg0.aFloat352 == this.aFloat352 && arg0.anInt5860 * -2016142599 == this.anInt5860 * -2016142599 && this.anInt5861 * -2139322713 == arg0.anInt5861 * -2139322713 && arg0.aClass107_2 == this.aClass107_2 && this.aClass562_3 == arg0.aClass562_3 && arg0.aFloat351 == this.aFloat351 && arg0.aFloat347 == this.aFloat347 && arg0.aFloat353 == this.aFloat353 && arg0.aFloat354 == this.aFloat354 && this.aFloat350 == arg0.aFloat350 && arg0.anIntArray515[0] == this.anIntArray515[0] && this.anIntArray515[1] == arg0.anIntArray515[1] && this.anIntArray515[2] == arg0.anIntArray515[2] && this.aFloatArray121[0] == arg0.aFloatArray121[0] && this.aFloatArray121[1] == arg0.aFloatArray121[1] && arg0.aFloatArray121[2] == this.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "ah", descriptor = "(Lclient!xv;)Z", line = 264)
	boolean method33060(@OriginalArg(0) Class672 arg0) {
		return arg0.anInt5862 * 1540075243 == this.anInt5862 * 1540075243 && this.aFloat349 == arg0.aFloat349 && this.aFloat344 == arg0.aFloat344 && arg0.aFloat346 == this.aFloat346 && arg0.aFloat348 == this.aFloat348 && this.aFloat345 == arg0.aFloat345 && arg0.aFloat352 == this.aFloat352 && arg0.anInt5860 * -2016142599 == this.anInt5860 * -2016142599 && this.anInt5861 * -2139322713 == arg0.anInt5861 * -2139322713 && arg0.aClass107_2 == this.aClass107_2 && this.aClass562_3 == arg0.aClass562_3 && arg0.aFloat351 == this.aFloat351 && arg0.aFloat347 == this.aFloat347 && arg0.aFloat353 == this.aFloat353 && arg0.aFloat354 == this.aFloat354 && this.aFloat350 == arg0.aFloat350 && arg0.anIntArray515[0] == this.anIntArray515[0] && this.anIntArray515[1] == arg0.anIntArray515[1] && this.anIntArray515[2] == arg0.anIntArray515[2] && this.aFloatArray121[0] == arg0.aFloatArray121[0] && this.aFloatArray121[1] == arg0.aFloatArray121[1] && arg0.aFloatArray121[2] == this.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "ag", descriptor = "(Lclient!xv;)Z", line = 264)
	boolean method33064(@OriginalArg(0) Class672 arg0) {
		return arg0.anInt5862 * 1540075243 == this.anInt5862 * 1540075243 && this.aFloat349 == arg0.aFloat349 && this.aFloat344 == arg0.aFloat344 && arg0.aFloat346 == this.aFloat346 && arg0.aFloat348 == this.aFloat348 && this.aFloat345 == arg0.aFloat345 && arg0.aFloat352 == this.aFloat352 && arg0.anInt5860 * -2016142599 == this.anInt5860 * -2016142599 && this.anInt5861 * -2139322713 == arg0.anInt5861 * -2139322713 && arg0.aClass107_2 == this.aClass107_2 && this.aClass562_3 == arg0.aClass562_3 && arg0.aFloat351 == this.aFloat351 && arg0.aFloat347 == this.aFloat347 && arg0.aFloat353 == this.aFloat353 && arg0.aFloat354 == this.aFloat354 && this.aFloat350 == arg0.aFloat350 && arg0.anIntArray515[0] == this.anIntArray515[0] && this.anIntArray515[1] == arg0.anIntArray515[1] && this.anIntArray515[2] == arg0.anIntArray515[2] && this.aFloatArray121[0] == arg0.aFloatArray121[0] && this.aFloatArray121[1] == arg0.aFloatArray121[1] && arg0.aFloatArray121[2] == this.aFloatArray121[2];
	}

	@OriginalMember(owner = "client!xv", name = "p", descriptor = "(Lclient!xu;Lclient!yj;I)V", line = 268)
	void method33047(@OriginalArg(0) Class671 arg0, @OriginalArg(1) Class684 arg1) {
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1 && Class694.aClass104_14.method20413() > 0) {
			if (arg1.method33408() != -1) {
				this.anInt5862 = arg1.method33408() * -700806717;
			}
			if (arg1.method33360() != -1.0F) {
				this.aFloat349 = arg1.method33360();
			}
			if (arg1.method33371() != -1.0F) {
				this.aFloat344 = arg1.method33371();
			}
			if (arg1.method33374() != -1.0F) {
				this.aFloat346 = arg1.method33374();
			}
		}
		if (arg1.method33362() != null) {
			this.aClass472_65.method29538(arg1.method33362());
		}
		if (arg1.method33401() != -1) {
			this.anInt5860 = arg1.method33401() * -597457079;
		}
		if (arg1.method33364() != -1) {
			this.anInt5861 = arg1.method33364() * -2016100073;
		}
		if (arg1.method33365() != -1.0F) {
			this.aFloat348 = arg1.method33365();
		}
		if (arg1.method33366() != -1.0F) {
			this.aFloat352 = arg1.method33366();
		}
		if (arg1.method33367() != -1.0F) {
			this.aFloat345 = arg1.method33367();
		}
		if (arg1.method33393() != -1) {
			this.aClass107_2 = arg0.method32969(arg1.method33393());
		}
		if (arg1.method33369() != -1) {
			@Pc(142) int local142 = arg1.method33369();
			@Pc(146) int local146 = arg1.method33370();
			@Pc(150) int local150 = arg1.method33409();
			@Pc(154) int local154 = arg1.method33372();
			@Pc(158) int local158 = arg1.method33373();
			Class121.anInt1003 = local158 * -1237225441;
			this.aClass562_3 = arg0.method32970(local142, local146, local150, local154);
		}
		if (arg1.method33399(0) != -1) {
			this.anIntArray515[0] = arg1.method33399(0);
			this.aFloatArray121[0] = arg1.method33357(0);
		}
		if (arg1.method33399(1) != -1) {
			this.anIntArray515[1] = arg1.method33399(1);
			this.aFloatArray121[1] = arg1.method33357(1);
		}
		if (arg1.method33399(2) != -1) {
			this.anIntArray515[2] = arg1.method33399(2);
			this.aFloatArray121[2] = arg1.method33357(2);
		}
	}

	@OriginalMember(owner = "client!xv", name = "al", descriptor = "(Lclient!xu;Lclient!yj;)V", line = 268)
	void method33075(@OriginalArg(0) Class671 arg0, @OriginalArg(1) Class684 arg1) {
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1 && Class694.aClass104_14.method20413() > 0) {
			if (arg1.method33408() != -1) {
				this.anInt5862 = arg1.method33408() * -700806717;
			}
			if (arg1.method33360() != -1.0F) {
				this.aFloat349 = arg1.method33360();
			}
			if (arg1.method33371() != -1.0F) {
				this.aFloat344 = arg1.method33371();
			}
			if (arg1.method33374() != -1.0F) {
				this.aFloat346 = arg1.method33374();
			}
		}
		if (arg1.method33362() != null) {
			this.aClass472_65.method29538(arg1.method33362());
		}
		if (arg1.method33401() != -1) {
			this.anInt5860 = arg1.method33401() * -597457079;
		}
		if (arg1.method33364() != -1) {
			this.anInt5861 = arg1.method33364() * -2016100073;
		}
		if (arg1.method33365() != -1.0F) {
			this.aFloat348 = arg1.method33365();
		}
		if (arg1.method33366() != -1.0F) {
			this.aFloat352 = arg1.method33366();
		}
		if (arg1.method33367() != -1.0F) {
			this.aFloat345 = arg1.method33367();
		}
		if (arg1.method33393() != -1) {
			this.aClass107_2 = arg0.method32969(arg1.method33393());
		}
		if (arg1.method33369() != -1) {
			@Pc(142) int local142 = arg1.method33369();
			@Pc(146) int local146 = arg1.method33370();
			@Pc(150) int local150 = arg1.method33409();
			@Pc(154) int local154 = arg1.method33372();
			@Pc(158) int local158 = arg1.method33373();
			Class121.anInt1003 = local158 * -1237225441;
			this.aClass562_3 = arg0.method32970(local142, local146, local150, local154);
		}
		if (arg1.method33399(0) != -1) {
			this.anIntArray515[0] = arg1.method33399(0);
			this.aFloatArray121[0] = arg1.method33357(0);
		}
		if (arg1.method33399(1) != -1) {
			this.anIntArray515[1] = arg1.method33399(1);
			this.aFloatArray121[1] = arg1.method33357(1);
		}
		if (arg1.method33399(2) != -1) {
			this.anIntArray515[2] = arg1.method33399(2);
			this.aFloatArray121[2] = arg1.method33357(2);
		}
	}

	@OriginalMember(owner = "client!xv", name = "ac", descriptor = "(Lclient!xu;Lclient!yj;)V", line = 268)
	void method33076(@OriginalArg(0) Class671 arg0, @OriginalArg(1) Class684 arg1) {
		if (Class51.aClass93_Sub36_1.aClass166_Sub19_1.method15758() == 1 && Class694.aClass104_14.method20413() > 0) {
			if (arg1.method33408() != -1) {
				this.anInt5862 = arg1.method33408() * -700806717;
			}
			if (arg1.method33360() != -1.0F) {
				this.aFloat349 = arg1.method33360();
			}
			if (arg1.method33371() != -1.0F) {
				this.aFloat344 = arg1.method33371();
			}
			if (arg1.method33374() != -1.0F) {
				this.aFloat346 = arg1.method33374();
			}
		}
		if (arg1.method33362() != null) {
			this.aClass472_65.method29538(arg1.method33362());
		}
		if (arg1.method33401() != -1) {
			this.anInt5860 = arg1.method33401() * -597457079;
		}
		if (arg1.method33364() != -1) {
			this.anInt5861 = arg1.method33364() * -2016100073;
		}
		if (arg1.method33365() != -1.0F) {
			this.aFloat348 = arg1.method33365();
		}
		if (arg1.method33366() != -1.0F) {
			this.aFloat352 = arg1.method33366();
		}
		if (arg1.method33367() != -1.0F) {
			this.aFloat345 = arg1.method33367();
		}
		if (arg1.method33393() != -1) {
			this.aClass107_2 = arg0.method32969(arg1.method33393());
		}
		if (arg1.method33369() != -1) {
			@Pc(142) int local142 = arg1.method33369();
			@Pc(146) int local146 = arg1.method33370();
			@Pc(150) int local150 = arg1.method33409();
			@Pc(154) int local154 = arg1.method33372();
			@Pc(158) int local158 = arg1.method33373();
			Class121.anInt1003 = local158 * -1237225441;
			this.aClass562_3 = arg0.method32970(local142, local146, local150, local154);
		}
		if (arg1.method33399(0) != -1) {
			this.anIntArray515[0] = arg1.method33399(0);
			this.aFloatArray121[0] = arg1.method33357(0);
		}
		if (arg1.method33399(1) != -1) {
			this.anIntArray515[1] = arg1.method33399(1);
			this.aFloatArray121[1] = arg1.method33357(1);
		}
		if (arg1.method33399(2) != -1) {
			this.anIntArray515[2] = arg1.method33399(2);
			this.aFloatArray121[2] = arg1.method33357(2);
		}
	}

	@OriginalMember(owner = "client!xv", name = "aw", descriptor = "()I", line = 305)
	public int method33056() {
		return this.anInt5860 * -2016142599;
	}

	@OriginalMember(owner = "client!xv", name = "d", descriptor = "(S)I", line = 305)
	public int method33057() {
		return this.anInt5860 * -2016142599;
	}

	@OriginalMember(owner = "client!xv", name = "ai", descriptor = "()I", line = 305)
	public int method33077() {
		return this.anInt5860 * -2016142599;
	}

	@OriginalMember(owner = "client!xv", name = "c", descriptor = "(I)Lclient!sv;", line = 309)
	public Class562 method33058() {
		return this.aClass562_3;
	}

	@OriginalMember(owner = "client!xv", name = "as", descriptor = "()Lclient!sv;", line = 309)
	public Class562 method33079() {
		return this.aClass562_3;
	}

	@OriginalMember(owner = "client!xv", name = "di", descriptor = "(Lclient!yf;B)V", line = 5547)
	static final void method33083(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class393.method28318(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!xv", name = "df", descriptor = "(Lclient!yf;I)V", line = 5576)
	static final void method33080(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class547.method31009(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!xv", name = "sw", descriptor = "(Lclient!yf;I)V", line = 8176)
	static final void method33081(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4043 * -1927602083;
	}

	@OriginalMember(owner = "client!xv", name = "awa", descriptor = "(Lclient!yf;I)V", line = 13723)
	static final void method33084(@OriginalArg(0) Class681 arg0) {
		Class667.method32915();
	}

	@OriginalMember(owner = "client!xv", name = "azo", descriptor = "(Lclient!yf;I)V", line = 14229)
	static final void method33082(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
