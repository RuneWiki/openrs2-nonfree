package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public class Class480 {

	@OriginalMember(owner = "client!th", name = "b", descriptor = "F")
	float aFloat308;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "F")
	float aFloat310;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "F")
	float aFloat311;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	int anInt5147;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "I")
	int anInt5148;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "Lclient!db;")
	Class18 aClass18_2;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "F")
	float aFloat312;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!mh;")
	Class320 aClass320_64;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "F")
	float aFloat313;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "Lclient!po;")
	Class395 aClass395_3;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "I")
	int anInt5149;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "F")
	float aFloat318;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "F")
	float aFloat314 = 1.0F;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "F")
	float aFloat315 = 0.0F;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "F")
	float aFloat316 = 1.0F;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "F")
	float aFloat309 = 0.0F;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "F")
	float aFloat317 = 1.0F;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "[I")
	int[] anIntArray471 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[F")
	float[] aFloatArray113 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 38)
	public Class480() {
		this.method28930();
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!ahb;Lclient!tg;)V", line = 42)
	public Class480(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class479 arg1) {
		this.method28933(arg0, arg1);
	}

	@OriginalMember(owner = "client!th", name = "p", descriptor = "(B)V", line = 47)
	void method28930() {
		this.anInt5147 = 950555757;
		this.aClass320_64 = Class320.method25891(-50.0F, -60.0F, -50.0F);
		this.aFloat318 = 1.1523438F;
		this.aFloat310 = 0.69921875F;
		this.aFloat311 = 1.2F;
		this.anInt5148 = 1038658776;
		this.anInt5149 = 0;
		this.aClass18_2 = Class479.aClass18_1;
		this.aFloat312 = 1.0F;
		this.aFloat308 = 0.25F;
		this.aFloat313 = 1.0F;
		this.aClass395_3 = Class180.aClass395_1;
		this.aFloat314 = 1.0F;
		this.aFloat315 = 0.0F;
		this.aFloat316 = 1.0F;
		this.aFloat309 = 0.0F;
		this.aFloat317 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray471;
		@Pc(59) int[] local59 = this.anIntArray471;
		this.anIntArray471[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray113;
		@Pc(78) float[] local78 = this.aFloatArray113;
		this.aFloatArray113[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!th", name = "j", descriptor = "()V", line = 47)
	void method28942() {
		this.anInt5147 = 950555757;
		this.aClass320_64 = Class320.method25891(-50.0F, -60.0F, -50.0F);
		this.aFloat318 = 1.1523438F;
		this.aFloat310 = 0.69921875F;
		this.aFloat311 = 1.2F;
		this.anInt5148 = 1038658776;
		this.anInt5149 = 0;
		this.aClass18_2 = Class479.aClass18_1;
		this.aFloat312 = 1.0F;
		this.aFloat308 = 0.25F;
		this.aFloat313 = 1.0F;
		this.aClass395_3 = Class180.aClass395_1;
		this.aFloat314 = 1.0F;
		this.aFloat315 = 0.0F;
		this.aFloat316 = 1.0F;
		this.aFloat309 = 0.0F;
		this.aFloat317 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray471;
		@Pc(59) int[] local59 = this.anIntArray471;
		this.anIntArray471[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray113;
		@Pc(78) float[] local78 = this.aFloatArray113;
		this.aFloatArray113[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!th", name = "n", descriptor = "()V", line = 47)
	void method28943() {
		this.anInt5147 = 950555757;
		this.aClass320_64 = Class320.method25891(-50.0F, -60.0F, -50.0F);
		this.aFloat318 = 1.1523438F;
		this.aFloat310 = 0.69921875F;
		this.aFloat311 = 1.2F;
		this.anInt5148 = 1038658776;
		this.anInt5149 = 0;
		this.aClass18_2 = Class479.aClass18_1;
		this.aFloat312 = 1.0F;
		this.aFloat308 = 0.25F;
		this.aFloat313 = 1.0F;
		this.aClass395_3 = Class180.aClass395_1;
		this.aFloat314 = 1.0F;
		this.aFloat315 = 0.0F;
		this.aFloat316 = 1.0F;
		this.aFloat309 = 0.0F;
		this.aFloat317 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray471;
		@Pc(59) int[] local59 = this.anIntArray471;
		this.anIntArray471[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray113;
		@Pc(78) float[] local78 = this.aFloatArray113;
		this.aFloatArray113[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(Lclient!th;)V", line = 77)
	void method28944(@OriginalArg(0) Class480 arg0) {
		this.anInt5147 = arg0.anInt5147;
		this.aFloat318 = arg0.aFloat318;
		this.aFloat310 = arg0.aFloat310;
		this.aFloat311 = arg0.aFloat311;
		this.aClass320_64.method25893(arg0.aClass320_64);
		this.anInt5148 = arg0.anInt5148;
		this.anInt5149 = arg0.anInt5149;
		this.aClass18_2 = arg0.aClass18_2;
		this.aFloat312 = arg0.aFloat312;
		this.aFloat308 = arg0.aFloat308;
		this.aFloat313 = arg0.aFloat313;
		this.aClass395_3 = arg0.aClass395_3;
		this.aFloat314 = arg0.aFloat314;
		this.aFloat315 = arg0.aFloat315;
		this.aFloat316 = arg0.aFloat316;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat317 = arg0.aFloat317;
		this.anIntArray471[0] = arg0.anIntArray471[0];
		this.anIntArray471[1] = arg0.anIntArray471[1];
		this.anIntArray471[2] = arg0.anIntArray471[2];
		this.aFloatArray113[0] = arg0.aFloatArray113[0];
		this.aFloatArray113[1] = arg0.aFloatArray113[1];
		this.aFloatArray113[2] = arg0.aFloatArray113[2];
	}

	@OriginalMember(owner = "client!th", name = "r", descriptor = "(Lclient!th;)V", line = 77)
	void method28945(@OriginalArg(0) Class480 arg0) {
		this.anInt5147 = arg0.anInt5147;
		this.aFloat318 = arg0.aFloat318;
		this.aFloat310 = arg0.aFloat310;
		this.aFloat311 = arg0.aFloat311;
		this.aClass320_64.method25893(arg0.aClass320_64);
		this.anInt5148 = arg0.anInt5148;
		this.anInt5149 = arg0.anInt5149;
		this.aClass18_2 = arg0.aClass18_2;
		this.aFloat312 = arg0.aFloat312;
		this.aFloat308 = arg0.aFloat308;
		this.aFloat313 = arg0.aFloat313;
		this.aClass395_3 = arg0.aClass395_3;
		this.aFloat314 = arg0.aFloat314;
		this.aFloat315 = arg0.aFloat315;
		this.aFloat316 = arg0.aFloat316;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat317 = arg0.aFloat317;
		this.anIntArray471[0] = arg0.anIntArray471[0];
		this.anIntArray471[1] = arg0.anIntArray471[1];
		this.anIntArray471[2] = arg0.anIntArray471[2];
		this.aFloatArray113[0] = arg0.aFloatArray113[0];
		this.aFloatArray113[1] = arg0.aFloatArray113[1];
		this.aFloatArray113[2] = arg0.aFloatArray113[2];
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(Lclient!th;)V", line = 77)
	void method28958(@OriginalArg(0) Class480 arg0) {
		this.anInt5147 = arg0.anInt5147;
		this.aFloat318 = arg0.aFloat318;
		this.aFloat310 = arg0.aFloat310;
		this.aFloat311 = arg0.aFloat311;
		this.aClass320_64.method25893(arg0.aClass320_64);
		this.anInt5148 = arg0.anInt5148;
		this.anInt5149 = arg0.anInt5149;
		this.aClass18_2 = arg0.aClass18_2;
		this.aFloat312 = arg0.aFloat312;
		this.aFloat308 = arg0.aFloat308;
		this.aFloat313 = arg0.aFloat313;
		this.aClass395_3 = arg0.aClass395_3;
		this.aFloat314 = arg0.aFloat314;
		this.aFloat315 = arg0.aFloat315;
		this.aFloat316 = arg0.aFloat316;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat317 = arg0.aFloat317;
		this.anIntArray471[0] = arg0.anIntArray471[0];
		this.anIntArray471[1] = arg0.anIntArray471[1];
		this.anIntArray471[2] = arg0.anIntArray471[2];
		this.aFloatArray113[0] = arg0.aFloatArray113[0];
		this.aFloatArray113[1] = arg0.aFloatArray113[1];
		this.aFloatArray113[2] = arg0.aFloatArray113[2];
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!th;I)V", line = 77)
	void method28959(@OriginalArg(0) Class480 arg0) {
		this.anInt5147 = arg0.anInt5147;
		this.aFloat318 = arg0.aFloat318;
		this.aFloat310 = arg0.aFloat310;
		this.aFloat311 = arg0.aFloat311;
		this.aClass320_64.method25893(arg0.aClass320_64);
		this.anInt5148 = arg0.anInt5148;
		this.anInt5149 = arg0.anInt5149;
		this.aClass18_2 = arg0.aClass18_2;
		this.aFloat312 = arg0.aFloat312;
		this.aFloat308 = arg0.aFloat308;
		this.aFloat313 = arg0.aFloat313;
		this.aClass395_3 = arg0.aClass395_3;
		this.aFloat314 = arg0.aFloat314;
		this.aFloat315 = arg0.aFloat315;
		this.aFloat316 = arg0.aFloat316;
		this.aFloat309 = arg0.aFloat309;
		this.aFloat317 = arg0.aFloat317;
		this.anIntArray471[0] = arg0.anIntArray471[0];
		this.anIntArray471[1] = arg0.anIntArray471[1];
		this.anIntArray471[2] = arg0.anIntArray471[2];
		this.aFloatArray113[0] = arg0.aFloatArray113[0];
		this.aFloatArray113[1] = arg0.aFloatArray113[1];
		this.aFloatArray113[2] = arg0.aFloatArray113[2];
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(Lclient!de;Lclient!th;Lclient!th;FI)V", line = 103)
	void method28932(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) float arg3) {
		this.anInt5147 = Class575.method33150(arg1.anInt5147 * 2001152667, arg2.anInt5147 * 2001152667, arg3 * 255.0F) * 1515694995;
		this.aFloat310 = (arg2.aFloat310 - arg1.aFloat310) * arg3 + arg1.aFloat310;
		this.aFloat311 = (arg2.aFloat311 - arg1.aFloat311) * arg3 + arg1.aFloat311;
		this.aFloat318 = arg3 * (arg2.aFloat318 - arg1.aFloat318) + arg1.aFloat318;
		this.aFloat313 = arg1.aFloat313 + arg3 * (arg2.aFloat313 - arg1.aFloat313);
		this.aFloat312 = arg3 * (arg2.aFloat312 - arg1.aFloat312) + arg1.aFloat312;
		this.aFloat308 = arg3 * (arg2.aFloat308 - arg1.aFloat308) + arg1.aFloat308;
		this.anInt5148 = Class575.method33150(arg1.anInt5148 * 1583725583, arg2.anInt5148 * 1583725583, arg3 * 255.0F) * -1836207377;
		this.anInt5149 = (int) ((float) (arg1.anInt5149 * 864549783) + arg3 * (float) (arg2.anInt5149 * 864549783 - arg1.anInt5149 * 864549783)) * -268291033;
		if (arg2.aClass18_2 != arg1.aClass18_2) {
			this.aClass18_2 = arg0.method17074(arg1.aClass18_2, arg2.aClass18_2, arg3, this.aClass18_2);
		}
		if (arg1.aClass395_3 != arg2.aClass395_3) {
			if (arg1.aClass395_3 == null) {
				this.aClass395_3 = arg2.aClass395_3;
				if (this.aClass395_3 != null) {
					this.aClass395_3.method27449((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass395_3 = arg1.aClass395_3;
				if (this.aClass395_3 != null) {
					this.aClass395_3.method27449((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat314 = arg1.aFloat314 + (arg2.aFloat314 - arg1.aFloat314) * arg3;
		this.aFloat315 = arg1.aFloat315 + (arg2.aFloat315 - arg1.aFloat315) * arg3;
		this.aFloat316 = arg3 * (arg2.aFloat316 - arg1.aFloat316) + arg1.aFloat316;
		this.aFloat309 = (arg2.aFloat309 - arg1.aFloat309) * arg3 + arg1.aFloat309;
		this.aFloat317 = arg3 * (arg2.aFloat317 - arg1.aFloat317) + arg1.aFloat317;
		@Pc(262) float local262 = arg1.aFloatArray113[2] + arg1.aFloatArray113[0] + arg1.aFloatArray113[1];
		@Pc(277) float local277 = arg2.aFloatArray113[1] + arg2.aFloatArray113[0] + arg2.aFloatArray113[2];
		@Pc(285) float local285 = local262 + arg3 * (local277 - local262);
		@Pc(314) float[] local314;
		if (local285 == 0.0F) {
			@Pc(292) int[] local292 = this.anIntArray471;
			@Pc(295) int[] local295 = this.anIntArray471;
			this.anIntArray471[2] = -1;
			local295[1] = -1;
			local292[0] = -1;
			@Pc(311) float[] local311 = this.aFloatArray113;
			local314 = this.aFloatArray113;
			this.aFloatArray113[2] = 0.0F;
			local314[1] = 0.0F;
			local311[0] = 0.0F;
			return;
		}
		@Pc(348) int local348;
		if (arg1.anIntArray471[0] == -1 && arg1.anIntArray471[1] == -1 && arg1.anIntArray471[2] == -1) {
			for (local348 = 0; local348 < 3; local348++) {
				this.anIntArray471[local348] = arg2.anIntArray471[local348];
				if (this.anIntArray471[local348] == -1) {
					this.aFloatArray113[local348] = 0.0F;
				} else {
					this.aFloatArray113[local348] = arg3 * arg2.aFloatArray113[local348];
				}
			}
		} else if (arg2.anIntArray471[0] == -1 && arg2.anIntArray471[1] == -1 && arg2.anIntArray471[2] == -1) {
			for (local348 = 0; local348 < 3; local348++) {
				this.anIntArray471[local348] = arg1.anIntArray471[local348];
				if (this.anIntArray471[local348] == -1) {
					this.aFloatArray113[local348] = 0.0F;
				} else {
					this.aFloatArray113[local348] = arg1.aFloatArray113[local348] * (1.0F - arg3);
				}
			}
		} else {
			@Pc(446) float local446 = 1.0F - arg3;
			@Pc(448) int local448 = 0;
			@Pc(475) int[] local475 = new int[] { -1, -1, -1, -1, -1, -1 };
			local314 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(504) int local504;
			for (local504 = 0; local504 < 3; local504++) {
				if (arg1.anIntArray471[local504] > -1) {
					local475[local448] = arg1.anIntArray471[local504];
					local314[local448++] = arg1.aFloatArray113[local504] * local446;
				}
			}
			local504 = local448;
			@Pc(536) int local536;
			for (local536 = 0; local536 < 3; local536++) {
				if (arg2.anIntArray471[local536] > -1) {
					@Pc(552) float local552 = arg3 * arg2.aFloatArray113[local536];
					for (@Pc(554) int local554 = 0; local554 < local504; local554++) {
						if (local475[local554] == arg2.anIntArray471[local536]) {
							local314[local554] += local552;
							break;
						}
						if (local554 == local504 - 1) {
							local475[local448] = arg2.anIntArray471[local536];
							local314[local448++] = local552;
						}
					}
				}
			}
			if (local448 > 3) {
				@Pc(599) float local599 = 0.0F;
				@Pc(601) float local601 = 0.0F;
				@Pc(603) int local603;
				for (local603 = 0; local603 < local448; local603++) {
					local599 += local314[local603];
				}
				Class514.method29618(local314, local475, 0, local448 - 1);
				for (local603 = 0; local603 < 3; local603++) {
					local601 += local314[local603];
				}
				@Pc(639) float local639 = local599 / local601;
				for (@Pc(641) int local641 = 0; local641 < 3; local641++) {
					local314[local641] *= local639;
				}
			}
			for (local536 = 0; local536 < 3; local536++) {
				this.anIntArray471[local536] = local475[local536];
				this.aFloatArray113[local536] = local314[local536];
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "q", descriptor = "(Lclient!de;Lclient!th;Lclient!th;F)V", line = 103)
	void method28947(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) float arg3) {
		this.anInt5147 = Class575.method33150(arg1.anInt5147 * 2001152667, arg2.anInt5147 * 2001152667, arg3 * 255.0F) * 1515694995;
		this.aFloat310 = (arg2.aFloat310 - arg1.aFloat310) * arg3 + arg1.aFloat310;
		this.aFloat311 = (arg2.aFloat311 - arg1.aFloat311) * arg3 + arg1.aFloat311;
		this.aFloat318 = arg3 * (arg2.aFloat318 - arg1.aFloat318) + arg1.aFloat318;
		this.aFloat313 = arg1.aFloat313 + arg3 * (arg2.aFloat313 - arg1.aFloat313);
		this.aFloat312 = arg3 * (arg2.aFloat312 - arg1.aFloat312) + arg1.aFloat312;
		this.aFloat308 = arg3 * (arg2.aFloat308 - arg1.aFloat308) + arg1.aFloat308;
		this.anInt5148 = Class575.method33150(arg1.anInt5148 * 1583725583, arg2.anInt5148 * 1583725583, arg3 * 255.0F) * -1836207377;
		this.anInt5149 = (int) ((float) (arg1.anInt5149 * 864549783) + arg3 * (float) (arg2.anInt5149 * 864549783 - arg1.anInt5149 * 864549783)) * -268291033;
		if (arg2.aClass18_2 != arg1.aClass18_2) {
			this.aClass18_2 = arg0.method17074(arg1.aClass18_2, arg2.aClass18_2, arg3, this.aClass18_2);
		}
		if (arg1.aClass395_3 != arg2.aClass395_3) {
			if (arg1.aClass395_3 == null) {
				this.aClass395_3 = arg2.aClass395_3;
				if (this.aClass395_3 != null) {
					this.aClass395_3.method27449((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass395_3 = arg1.aClass395_3;
				if (this.aClass395_3 != null) {
					this.aClass395_3.method27449((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat314 = arg1.aFloat314 + (arg2.aFloat314 - arg1.aFloat314) * arg3;
		this.aFloat315 = arg1.aFloat315 + (arg2.aFloat315 - arg1.aFloat315) * arg3;
		this.aFloat316 = arg3 * (arg2.aFloat316 - arg1.aFloat316) + arg1.aFloat316;
		this.aFloat309 = (arg2.aFloat309 - arg1.aFloat309) * arg3 + arg1.aFloat309;
		this.aFloat317 = arg3 * (arg2.aFloat317 - arg1.aFloat317) + arg1.aFloat317;
		@Pc(262) float local262 = arg1.aFloatArray113[2] + arg1.aFloatArray113[0] + arg1.aFloatArray113[1];
		@Pc(277) float local277 = arg2.aFloatArray113[1] + arg2.aFloatArray113[0] + arg2.aFloatArray113[2];
		@Pc(285) float local285 = local262 + arg3 * (local277 - local262);
		@Pc(314) float[] local314;
		if (local285 == 0.0F) {
			@Pc(292) int[] local292 = this.anIntArray471;
			@Pc(295) int[] local295 = this.anIntArray471;
			this.anIntArray471[2] = -1;
			local295[1] = -1;
			local292[0] = -1;
			@Pc(311) float[] local311 = this.aFloatArray113;
			local314 = this.aFloatArray113;
			this.aFloatArray113[2] = 0.0F;
			local314[1] = 0.0F;
			local311[0] = 0.0F;
			return;
		}
		@Pc(348) int local348;
		if (arg1.anIntArray471[0] == -1 && arg1.anIntArray471[1] == -1 && arg1.anIntArray471[2] == -1) {
			for (local348 = 0; local348 < 3; local348++) {
				this.anIntArray471[local348] = arg2.anIntArray471[local348];
				if (this.anIntArray471[local348] == -1) {
					this.aFloatArray113[local348] = 0.0F;
				} else {
					this.aFloatArray113[local348] = arg3 * arg2.aFloatArray113[local348];
				}
			}
		} else if (arg2.anIntArray471[0] == -1 && arg2.anIntArray471[1] == -1 && arg2.anIntArray471[2] == -1) {
			for (local348 = 0; local348 < 3; local348++) {
				this.anIntArray471[local348] = arg1.anIntArray471[local348];
				if (this.anIntArray471[local348] == -1) {
					this.aFloatArray113[local348] = 0.0F;
				} else {
					this.aFloatArray113[local348] = arg1.aFloatArray113[local348] * (1.0F - arg3);
				}
			}
		} else {
			@Pc(446) float local446 = 1.0F - arg3;
			@Pc(448) int local448 = 0;
			@Pc(475) int[] local475 = new int[] { -1, -1, -1, -1, -1, -1 };
			local314 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(504) int local504;
			for (local504 = 0; local504 < 3; local504++) {
				if (arg1.anIntArray471[local504] > -1) {
					local475[local448] = arg1.anIntArray471[local504];
					local314[local448++] = arg1.aFloatArray113[local504] * local446;
				}
			}
			local504 = local448;
			@Pc(536) int local536;
			for (local536 = 0; local536 < 3; local536++) {
				if (arg2.anIntArray471[local536] > -1) {
					@Pc(552) float local552 = arg3 * arg2.aFloatArray113[local536];
					for (@Pc(554) int local554 = 0; local554 < local504; local554++) {
						if (local475[local554] == arg2.anIntArray471[local536]) {
							local314[local554] += local552;
							break;
						}
						if (local554 == local504 - 1) {
							local475[local448] = arg2.anIntArray471[local536];
							local314[local448++] = local552;
						}
					}
				}
			}
			if (local448 > 3) {
				@Pc(599) float local599 = 0.0F;
				@Pc(601) float local601 = 0.0F;
				@Pc(603) int local603;
				for (local603 = 0; local603 < local448; local603++) {
					local599 += local314[local603];
				}
				Class514.method29618(local314, local475, 0, local448 - 1);
				for (local603 = 0; local603 < 3; local603++) {
					local601 += local314[local603];
				}
				@Pc(639) float local639 = local599 / local601;
				for (@Pc(641) int local641 = 0; local641 < 3; local641++) {
					local314[local641] *= local639;
				}
			}
			for (local536 = 0; local536 < 3; local536++) {
				this.anIntArray471[local536] = local475[local536];
				this.aFloatArray113[local536] = local314[local536];
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "m", descriptor = "(Lclient!de;Lclient!th;Lclient!th;F)V", line = 103)
	void method28948(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) float arg3) {
		this.anInt5147 = Class575.method33150(arg1.anInt5147 * 2001152667, arg2.anInt5147 * 2001152667, arg3 * 255.0F) * 1515694995;
		this.aFloat310 = (arg2.aFloat310 - arg1.aFloat310) * arg3 + arg1.aFloat310;
		this.aFloat311 = (arg2.aFloat311 - arg1.aFloat311) * arg3 + arg1.aFloat311;
		this.aFloat318 = arg3 * (arg2.aFloat318 - arg1.aFloat318) + arg1.aFloat318;
		this.aFloat313 = arg1.aFloat313 + arg3 * (arg2.aFloat313 - arg1.aFloat313);
		this.aFloat312 = arg3 * (arg2.aFloat312 - arg1.aFloat312) + arg1.aFloat312;
		this.aFloat308 = arg3 * (arg2.aFloat308 - arg1.aFloat308) + arg1.aFloat308;
		this.anInt5148 = Class575.method33150(arg1.anInt5148 * 1583725583, arg2.anInt5148 * 1583725583, arg3 * 255.0F) * -1836207377;
		this.anInt5149 = (int) ((float) (arg1.anInt5149 * 864549783) + arg3 * (float) (arg2.anInt5149 * 864549783 - arg1.anInt5149 * 864549783)) * -268291033;
		if (arg2.aClass18_2 != arg1.aClass18_2) {
			this.aClass18_2 = arg0.method17074(arg1.aClass18_2, arg2.aClass18_2, arg3, this.aClass18_2);
		}
		if (arg1.aClass395_3 != arg2.aClass395_3) {
			if (arg1.aClass395_3 == null) {
				this.aClass395_3 = arg2.aClass395_3;
				if (this.aClass395_3 != null) {
					this.aClass395_3.method27449((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass395_3 = arg1.aClass395_3;
				if (this.aClass395_3 != null) {
					this.aClass395_3.method27449((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat314 = arg1.aFloat314 + (arg2.aFloat314 - arg1.aFloat314) * arg3;
		this.aFloat315 = arg1.aFloat315 + (arg2.aFloat315 - arg1.aFloat315) * arg3;
		this.aFloat316 = arg3 * (arg2.aFloat316 - arg1.aFloat316) + arg1.aFloat316;
		this.aFloat309 = (arg2.aFloat309 - arg1.aFloat309) * arg3 + arg1.aFloat309;
		this.aFloat317 = arg3 * (arg2.aFloat317 - arg1.aFloat317) + arg1.aFloat317;
		@Pc(262) float local262 = arg1.aFloatArray113[2] + arg1.aFloatArray113[0] + arg1.aFloatArray113[1];
		@Pc(277) float local277 = arg2.aFloatArray113[1] + arg2.aFloatArray113[0] + arg2.aFloatArray113[2];
		@Pc(285) float local285 = local262 + arg3 * (local277 - local262);
		@Pc(314) float[] local314;
		if (local285 == 0.0F) {
			@Pc(292) int[] local292 = this.anIntArray471;
			@Pc(295) int[] local295 = this.anIntArray471;
			this.anIntArray471[2] = -1;
			local295[1] = -1;
			local292[0] = -1;
			@Pc(311) float[] local311 = this.aFloatArray113;
			local314 = this.aFloatArray113;
			this.aFloatArray113[2] = 0.0F;
			local314[1] = 0.0F;
			local311[0] = 0.0F;
			return;
		}
		@Pc(348) int local348;
		if (arg1.anIntArray471[0] == -1 && arg1.anIntArray471[1] == -1 && arg1.anIntArray471[2] == -1) {
			for (local348 = 0; local348 < 3; local348++) {
				this.anIntArray471[local348] = arg2.anIntArray471[local348];
				if (this.anIntArray471[local348] == -1) {
					this.aFloatArray113[local348] = 0.0F;
				} else {
					this.aFloatArray113[local348] = arg3 * arg2.aFloatArray113[local348];
				}
			}
		} else if (arg2.anIntArray471[0] == -1 && arg2.anIntArray471[1] == -1 && arg2.anIntArray471[2] == -1) {
			for (local348 = 0; local348 < 3; local348++) {
				this.anIntArray471[local348] = arg1.anIntArray471[local348];
				if (this.anIntArray471[local348] == -1) {
					this.aFloatArray113[local348] = 0.0F;
				} else {
					this.aFloatArray113[local348] = arg1.aFloatArray113[local348] * (1.0F - arg3);
				}
			}
		} else {
			@Pc(446) float local446 = 1.0F - arg3;
			@Pc(448) int local448 = 0;
			@Pc(475) int[] local475 = new int[] { -1, -1, -1, -1, -1, -1 };
			local314 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(504) int local504;
			for (local504 = 0; local504 < 3; local504++) {
				if (arg1.anIntArray471[local504] > -1) {
					local475[local448] = arg1.anIntArray471[local504];
					local314[local448++] = arg1.aFloatArray113[local504] * local446;
				}
			}
			local504 = local448;
			@Pc(536) int local536;
			for (local536 = 0; local536 < 3; local536++) {
				if (arg2.anIntArray471[local536] > -1) {
					@Pc(552) float local552 = arg3 * arg2.aFloatArray113[local536];
					for (@Pc(554) int local554 = 0; local554 < local504; local554++) {
						if (local475[local554] == arg2.anIntArray471[local536]) {
							local314[local554] += local552;
							break;
						}
						if (local554 == local504 - 1) {
							local475[local448] = arg2.anIntArray471[local536];
							local314[local448++] = local552;
						}
					}
				}
			}
			if (local448 > 3) {
				@Pc(599) float local599 = 0.0F;
				@Pc(601) float local601 = 0.0F;
				@Pc(603) int local603;
				for (local603 = 0; local603 < local448; local603++) {
					local599 += local314[local603];
				}
				Class514.method29618(local314, local475, 0, local448 - 1);
				for (local603 = 0; local603 < 3; local603++) {
					local601 += local314[local603];
				}
				@Pc(639) float local639 = local599 / local601;
				for (@Pc(641) int local641 = 0; local641 < 3; local641++) {
					local314[local641] *= local639;
				}
			}
			for (local536 = 0; local536 < 3; local536++) {
				this.anIntArray471[local536] = local475[local536];
				this.aFloatArray113[local536] = local314[local536];
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "v", descriptor = "(Lclient!ahb;Lclient!tg;)V", line = 204)
	public void method28928(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class479 arg1) {
		@Pc(3) int local3 = arg0.method20269();
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) == 0) {
				this.anInt5147 = 950555757;
			} else {
				this.anInt5147 = arg0.method20275() * 1515694995;
			}
			if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) == 0) {
				this.aFloat318 = 1.1523438F;
			} else {
				this.aFloat318 = (float) arg0.method20271() / 256.0F;
			}
			if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) == 0) {
				this.aFloat310 = 0.69921875F;
			} else {
				this.aFloat310 = (float) arg0.method20271() / 256.0F;
			}
			if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) == 0) {
				this.aFloat311 = 1.2F;
			} else {
				this.aFloat311 = (float) arg0.method20271() / 256.0F;
			}
		} else {
			if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) != 0) {
				arg0.method20275();
			}
			if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			this.anInt5147 = 950555757;
			this.aFloat311 = 1.2F;
			this.aFloat310 = 0.69921875F;
			this.aFloat318 = 1.1523438F;
		}
		if ((local3 & Class497.aClass497_11.anInt5230 * -1678163245) == 0) {
			this.aClass320_64 = Class320.method25891(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass320_64 = Class320.method25891((float) arg0.method20272(), (float) arg0.method20272(), (float) arg0.method20272());
		}
		if ((local3 & Class497.aClass497_6.anInt5230 * -1678163245) == 0) {
			this.anInt5148 = 1038658776;
		} else {
			this.anInt5148 = arg0.method20275() * -1836207377;
		}
		if ((local3 & Class497.aClass497_7.anInt5230 * -1678163245) == 0) {
			this.anInt5149 = 0;
		} else {
			this.anInt5149 = arg0.method20271() * -268291033;
		}
		if ((local3 & Class497.aClass497_8.anInt5230 * -1678163245) == 0) {
			this.aClass18_2 = Class479.aClass18_1;
		} else {
			@Pc(229) int local229 = arg0.method20271();
			this.aClass18_2 = arg1.method28872(local229);
		}
	}

	@OriginalMember(owner = "client!th", name = "l", descriptor = "(Lclient!ahb;Lclient!tg;I)V", line = 204)
	public void method28933(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class479 arg1) {
		@Pc(3) int local3 = arg0.method20269();
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) == 0) {
				this.anInt5147 = 950555757;
			} else {
				this.anInt5147 = arg0.method20275() * 1515694995;
			}
			if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) == 0) {
				this.aFloat318 = 1.1523438F;
			} else {
				this.aFloat318 = (float) arg0.method20271() / 256.0F;
			}
			if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) == 0) {
				this.aFloat310 = 0.69921875F;
			} else {
				this.aFloat310 = (float) arg0.method20271() / 256.0F;
			}
			if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) == 0) {
				this.aFloat311 = 1.2F;
			} else {
				this.aFloat311 = (float) arg0.method20271() / 256.0F;
			}
		} else {
			if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) != 0) {
				arg0.method20275();
			}
			if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			this.anInt5147 = 950555757;
			this.aFloat311 = 1.2F;
			this.aFloat310 = 0.69921875F;
			this.aFloat318 = 1.1523438F;
		}
		if ((local3 & Class497.aClass497_11.anInt5230 * -1678163245) == 0) {
			this.aClass320_64 = Class320.method25891(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass320_64 = Class320.method25891((float) arg0.method20272(), (float) arg0.method20272(), (float) arg0.method20272());
		}
		if ((local3 & Class497.aClass497_6.anInt5230 * -1678163245) == 0) {
			this.anInt5148 = 1038658776;
		} else {
			this.anInt5148 = arg0.method20275() * -1836207377;
		}
		if ((local3 & Class497.aClass497_7.anInt5230 * -1678163245) == 0) {
			this.anInt5149 = 0;
		} else {
			this.anInt5149 = arg0.method20271() * -268291033;
		}
		if ((local3 & Class497.aClass497_8.anInt5230 * -1678163245) == 0) {
			this.aClass18_2 = Class479.aClass18_1;
		} else {
			@Pc(229) int local229 = arg0.method20271();
			this.aClass18_2 = arg1.method28872(local229);
		}
	}

	@OriginalMember(owner = "client!th", name = "t", descriptor = "(Lclient!ahb;Lclient!tg;)V", line = 204)
	public void method28966(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class479 arg1) {
		@Pc(3) int local3 = arg0.method20269();
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) == 0) {
				this.anInt5147 = 950555757;
			} else {
				this.anInt5147 = arg0.method20275() * 1515694995;
			}
			if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) == 0) {
				this.aFloat318 = 1.1523438F;
			} else {
				this.aFloat318 = (float) arg0.method20271() / 256.0F;
			}
			if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) == 0) {
				this.aFloat310 = 0.69921875F;
			} else {
				this.aFloat310 = (float) arg0.method20271() / 256.0F;
			}
			if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) == 0) {
				this.aFloat311 = 1.2F;
			} else {
				this.aFloat311 = (float) arg0.method20271() / 256.0F;
			}
		} else {
			if ((local3 & Class497.aClass497_2.anInt5230 * -1678163245) != 0) {
				arg0.method20275();
			}
			if ((local3 & Class497.aClass497_3.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			if ((local3 & Class497.aClass497_5.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			if ((local3 & Class497.aClass497_4.anInt5230 * -1678163245) != 0) {
				arg0.method20271();
			}
			this.anInt5147 = 950555757;
			this.aFloat311 = 1.2F;
			this.aFloat310 = 0.69921875F;
			this.aFloat318 = 1.1523438F;
		}
		if ((local3 & Class497.aClass497_11.anInt5230 * -1678163245) == 0) {
			this.aClass320_64 = Class320.method25891(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass320_64 = Class320.method25891((float) arg0.method20272(), (float) arg0.method20272(), (float) arg0.method20272());
		}
		if ((local3 & Class497.aClass497_6.anInt5230 * -1678163245) == 0) {
			this.anInt5148 = 1038658776;
		} else {
			this.anInt5148 = arg0.method20275() * -1836207377;
		}
		if ((local3 & Class497.aClass497_7.anInt5230 * -1678163245) == 0) {
			this.anInt5149 = 0;
		} else {
			this.anInt5149 = arg0.method20271() * -268291033;
		}
		if ((local3 & Class497.aClass497_8.anInt5230 * -1678163245) == 0) {
			this.aClass18_2 = Class479.aClass18_1;
		} else {
			@Pc(229) int local229 = arg0.method20271();
			this.aClass18_2 = arg1.method28872(local229);
		}
	}

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(Lclient!ahb;B)V", line = 239)
	public void method28934(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat312 = arg0.method20448();
		this.aFloat308 = arg0.method20448();
		this.aFloat313 = arg0.method20448();
	}

	@OriginalMember(owner = "client!th", name = "o", descriptor = "(Lclient!ahb;)V", line = 239)
	public void method28951(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat312 = arg0.method20448();
		this.aFloat308 = arg0.method20448();
		this.aFloat313 = arg0.method20448();
	}

	@OriginalMember(owner = "client!th", name = "i", descriptor = "(Lclient!ahb;)V", line = 239)
	public void method28952(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat312 = arg0.method20448();
		this.aFloat308 = arg0.method20448();
		this.aFloat313 = arg0.method20448();
	}

	@OriginalMember(owner = "client!th", name = "w", descriptor = "(Lclient!ahb;)V", line = 239)
	public void method28962(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat312 = arg0.method20448();
		this.aFloat308 = arg0.method20448();
		this.aFloat313 = arg0.method20448();
	}

	@OriginalMember(owner = "client!th", name = "x", descriptor = "(Lclient!ahb;B)V", line = 245)
	public void method28935(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method28936(arg0, 0);
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(Lclient!ahb;)V", line = 245)
	public void method28953(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method28936(arg0, 0);
	}

	@OriginalMember(owner = "client!th", name = "k", descriptor = "(Lclient!ahb;)V", line = 245)
	public void method28954(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method28936(arg0, 0);
	}

	@OriginalMember(owner = "client!th", name = "at", descriptor = "(Lclient!ahb;)V", line = 245)
	public void method28955(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method28936(arg0, 0);
	}

	@OriginalMember(owner = "client!th", name = "af", descriptor = "(Lclient!ahb;)V", line = 245)
	public void method28956(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method28936(arg0, 0);
	}

	@OriginalMember(owner = "client!th", name = "ak", descriptor = "(Lclient!ahb;)V", line = 245)
	public void method28957(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method28936(arg0, 0);
	}

	@OriginalMember(owner = "client!th", name = "aa", descriptor = "(Lclient!ahb;I)V", line = 249)
	void method28929(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray471[arg1] = arg0.method20271();
		this.aFloatArray113[arg1] = arg0.method20448();
	}

	@OriginalMember(owner = "client!th", name = "s", descriptor = "(Lclient!ahb;II)V", line = 249)
	void method28936(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray471[arg1] = arg0.method20271();
		this.aFloatArray113[arg1] = arg0.method20448();
	}

	@OriginalMember(owner = "client!th", name = "ah", descriptor = "(Lclient!ahb;I)V", line = 249)
	void method28946(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray471[arg1] = arg0.method20271();
		this.aFloatArray113[arg1] = arg0.method20448();
	}

	@OriginalMember(owner = "client!th", name = "u", descriptor = "(Lclient!ahb;Lclient!tg;I)V", line = 254)
	public void method28937(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class479 arg1) {
		@Pc(3) int local3 = arg0.method20271();
		@Pc(7) int local7 = arg0.method20272();
		@Pc(11) int local11 = arg0.method20272();
		@Pc(15) int local15 = arg0.method20272();
		@Pc(19) int local19 = arg0.method20271();
		Class135.anInt3399 = local19 * 834254959;
		this.aClass395_3 = arg1.method28873(local3, local7, local11, local15);
	}

	@OriginalMember(owner = "client!th", name = "an", descriptor = "(Lclient!ahb;Lclient!tg;)V", line = 254)
	public void method28960(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class479 arg1) {
		@Pc(3) int local3 = arg0.method20271();
		@Pc(7) int local7 = arg0.method20272();
		@Pc(11) int local11 = arg0.method20272();
		@Pc(15) int local15 = arg0.method20272();
		@Pc(19) int local19 = arg0.method20271();
		Class135.anInt3399 = local19 * 834254959;
		this.aClass395_3 = arg1.method28873(local3, local7, local11, local15);
	}

	@OriginalMember(owner = "client!th", name = "y", descriptor = "(Lclient!th;I)Z", line = 264)
	boolean method28938(@OriginalArg(0) Class480 arg0) {
		return this.anInt5147 * 2001152667 == arg0.anInt5147 * 2001152667 && arg0.aFloat318 == this.aFloat318 && this.aFloat310 == arg0.aFloat310 && arg0.aFloat311 == this.aFloat311 && this.aFloat308 == arg0.aFloat308 && this.aFloat312 == arg0.aFloat312 && this.aFloat313 == arg0.aFloat313 && arg0.anInt5148 * 1583725583 == this.anInt5148 * 1583725583 && arg0.anInt5149 * 864549783 == this.anInt5149 * 864549783 && arg0.aClass18_2 == this.aClass18_2 && this.aClass395_3 == arg0.aClass395_3 && arg0.aFloat314 == this.aFloat314 && this.aFloat315 == arg0.aFloat315 && arg0.aFloat316 == this.aFloat316 && arg0.aFloat309 == this.aFloat309 && this.aFloat317 == arg0.aFloat317 && this.anIntArray471[0] == arg0.anIntArray471[0] && this.anIntArray471[1] == arg0.anIntArray471[1] && arg0.anIntArray471[2] == this.anIntArray471[2] && this.aFloatArray113[0] == arg0.aFloatArray113[0] && this.aFloatArray113[1] == arg0.aFloatArray113[1] && arg0.aFloatArray113[2] == this.aFloatArray113[2];
	}

	@OriginalMember(owner = "client!th", name = "aj", descriptor = "(Lclient!th;)Z", line = 264)
	boolean method28950(@OriginalArg(0) Class480 arg0) {
		return this.anInt5147 * 2001152667 == arg0.anInt5147 * 2001152667 && arg0.aFloat318 == this.aFloat318 && this.aFloat310 == arg0.aFloat310 && arg0.aFloat311 == this.aFloat311 && this.aFloat308 == arg0.aFloat308 && this.aFloat312 == arg0.aFloat312 && this.aFloat313 == arg0.aFloat313 && arg0.anInt5148 * 1583725583 == this.anInt5148 * 1583725583 && arg0.anInt5149 * 864549783 == this.anInt5149 * 864549783 && arg0.aClass18_2 == this.aClass18_2 && this.aClass395_3 == arg0.aClass395_3 && arg0.aFloat314 == this.aFloat314 && this.aFloat315 == arg0.aFloat315 && arg0.aFloat316 == this.aFloat316 && arg0.aFloat309 == this.aFloat309 && this.aFloat317 == arg0.aFloat317 && this.anIntArray471[0] == arg0.anIntArray471[0] && this.anIntArray471[1] == arg0.anIntArray471[1] && arg0.anIntArray471[2] == this.anIntArray471[2] && this.aFloatArray113[0] == arg0.aFloatArray113[0] && this.aFloatArray113[1] == arg0.aFloatArray113[1] && arg0.aFloatArray113[2] == this.aFloatArray113[2];
	}

	@OriginalMember(owner = "client!th", name = "ax", descriptor = "(Lclient!tg;Lclient!uz;)V", line = 268)
	void method28931(@OriginalArg(0) Class479 arg0, @OriginalArg(1) Class518 arg1) {
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if (arg1.method29680() != -1) {
				this.anInt5147 = arg1.method29680() * 1515694995;
			}
			if (arg1.method29681() != -1.0F) {
				this.aFloat318 = arg1.method29681();
			}
			if (arg1.method29682() != -1.0F) {
				this.aFloat310 = arg1.method29682();
			}
			if (arg1.method29683() != -1.0F) {
				this.aFloat311 = arg1.method29683();
			}
		}
		if (arg1.method29684() != null) {
			this.aClass320_64.method25893(arg1.method29684());
		}
		if (arg1.method29685() != -1) {
			this.anInt5148 = arg1.method29685() * -1836207377;
		}
		if (arg1.method29708() != -1) {
			this.anInt5149 = arg1.method29708() * -268291033;
		}
		if (arg1.method29687() != -1.0F) {
			this.aFloat308 = arg1.method29687();
		}
		if (arg1.method29688() != -1.0F) {
			this.aFloat313 = arg1.method29688();
		}
		if (arg1.method29689() != -1.0F) {
			this.aFloat312 = arg1.method29689();
		}
		if (arg1.method29690() != -1) {
			this.aClass18_2 = arg0.method28872(arg1.method29690());
		}
		if (arg1.method29724() != -1) {
			@Pc(142) int local142 = arg1.method29724();
			@Pc(146) int local146 = arg1.method29722();
			@Pc(150) int local150 = arg1.method29692();
			@Pc(154) int local154 = arg1.method29727();
			@Pc(158) int local158 = arg1.method29695();
			Class135.anInt3399 = local158 * 834254959;
			this.aClass395_3 = arg0.method28873(local142, local146, local150, local154);
		}
		if (arg1.method29696(0) != -1) {
			this.anIntArray471[0] = arg1.method29696(0);
			this.aFloatArray113[0] = arg1.method29697(0);
		}
		if (arg1.method29696(1) != -1) {
			this.anIntArray471[1] = arg1.method29696(1);
			this.aFloatArray113[1] = arg1.method29697(1);
		}
		if (arg1.method29696(2) != -1) {
			this.anIntArray471[2] = arg1.method29696(2);
			this.aFloatArray113[2] = arg1.method29697(2);
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Lclient!tg;Lclient!uz;B)V", line = 268)
	void method28939(@OriginalArg(0) Class479 arg0, @OriginalArg(1) Class518 arg1) {
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if (arg1.method29680() != -1) {
				this.anInt5147 = arg1.method29680() * 1515694995;
			}
			if (arg1.method29681() != -1.0F) {
				this.aFloat318 = arg1.method29681();
			}
			if (arg1.method29682() != -1.0F) {
				this.aFloat310 = arg1.method29682();
			}
			if (arg1.method29683() != -1.0F) {
				this.aFloat311 = arg1.method29683();
			}
		}
		if (arg1.method29684() != null) {
			this.aClass320_64.method25893(arg1.method29684());
		}
		if (arg1.method29685() != -1) {
			this.anInt5148 = arg1.method29685() * -1836207377;
		}
		if (arg1.method29708() != -1) {
			this.anInt5149 = arg1.method29708() * -268291033;
		}
		if (arg1.method29687() != -1.0F) {
			this.aFloat308 = arg1.method29687();
		}
		if (arg1.method29688() != -1.0F) {
			this.aFloat313 = arg1.method29688();
		}
		if (arg1.method29689() != -1.0F) {
			this.aFloat312 = arg1.method29689();
		}
		if (arg1.method29690() != -1) {
			this.aClass18_2 = arg0.method28872(arg1.method29690());
		}
		if (arg1.method29724() != -1) {
			@Pc(142) int local142 = arg1.method29724();
			@Pc(146) int local146 = arg1.method29722();
			@Pc(150) int local150 = arg1.method29692();
			@Pc(154) int local154 = arg1.method29727();
			@Pc(158) int local158 = arg1.method29695();
			Class135.anInt3399 = local158 * 834254959;
			this.aClass395_3 = arg0.method28873(local142, local146, local150, local154);
		}
		if (arg1.method29696(0) != -1) {
			this.anIntArray471[0] = arg1.method29696(0);
			this.aFloatArray113[0] = arg1.method29697(0);
		}
		if (arg1.method29696(1) != -1) {
			this.anIntArray471[1] = arg1.method29696(1);
			this.aFloatArray113[1] = arg1.method29697(1);
		}
		if (arg1.method29696(2) != -1) {
			this.anIntArray471[2] = arg1.method29696(2);
			this.aFloatArray113[2] = arg1.method29697(2);
		}
	}

	@OriginalMember(owner = "client!th", name = "ai", descriptor = "(Lclient!tg;Lclient!uz;)V", line = 268)
	void method28961(@OriginalArg(0) Class479 arg0, @OriginalArg(1) Class518 arg1) {
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if (arg1.method29680() != -1) {
				this.anInt5147 = arg1.method29680() * 1515694995;
			}
			if (arg1.method29681() != -1.0F) {
				this.aFloat318 = arg1.method29681();
			}
			if (arg1.method29682() != -1.0F) {
				this.aFloat310 = arg1.method29682();
			}
			if (arg1.method29683() != -1.0F) {
				this.aFloat311 = arg1.method29683();
			}
		}
		if (arg1.method29684() != null) {
			this.aClass320_64.method25893(arg1.method29684());
		}
		if (arg1.method29685() != -1) {
			this.anInt5148 = arg1.method29685() * -1836207377;
		}
		if (arg1.method29708() != -1) {
			this.anInt5149 = arg1.method29708() * -268291033;
		}
		if (arg1.method29687() != -1.0F) {
			this.aFloat308 = arg1.method29687();
		}
		if (arg1.method29688() != -1.0F) {
			this.aFloat313 = arg1.method29688();
		}
		if (arg1.method29689() != -1.0F) {
			this.aFloat312 = arg1.method29689();
		}
		if (arg1.method29690() != -1) {
			this.aClass18_2 = arg0.method28872(arg1.method29690());
		}
		if (arg1.method29724() != -1) {
			@Pc(142) int local142 = arg1.method29724();
			@Pc(146) int local146 = arg1.method29722();
			@Pc(150) int local150 = arg1.method29692();
			@Pc(154) int local154 = arg1.method29727();
			@Pc(158) int local158 = arg1.method29695();
			Class135.anInt3399 = local158 * 834254959;
			this.aClass395_3 = arg0.method28873(local142, local146, local150, local154);
		}
		if (arg1.method29696(0) != -1) {
			this.anIntArray471[0] = arg1.method29696(0);
			this.aFloatArray113[0] = arg1.method29697(0);
		}
		if (arg1.method29696(1) != -1) {
			this.anIntArray471[1] = arg1.method29696(1);
			this.aFloatArray113[1] = arg1.method29697(1);
		}
		if (arg1.method29696(2) != -1) {
			this.anIntArray471[2] = arg1.method29696(2);
			this.aFloatArray113[2] = arg1.method29697(2);
		}
	}

	@OriginalMember(owner = "client!th", name = "as", descriptor = "(Lclient!tg;Lclient!uz;)V", line = 268)
	void method28963(@OriginalArg(0) Class479 arg0, @OriginalArg(1) Class518 arg1) {
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if (arg1.method29680() != -1) {
				this.anInt5147 = arg1.method29680() * 1515694995;
			}
			if (arg1.method29681() != -1.0F) {
				this.aFloat318 = arg1.method29681();
			}
			if (arg1.method29682() != -1.0F) {
				this.aFloat310 = arg1.method29682();
			}
			if (arg1.method29683() != -1.0F) {
				this.aFloat311 = arg1.method29683();
			}
		}
		if (arg1.method29684() != null) {
			this.aClass320_64.method25893(arg1.method29684());
		}
		if (arg1.method29685() != -1) {
			this.anInt5148 = arg1.method29685() * -1836207377;
		}
		if (arg1.method29708() != -1) {
			this.anInt5149 = arg1.method29708() * -268291033;
		}
		if (arg1.method29687() != -1.0F) {
			this.aFloat308 = arg1.method29687();
		}
		if (arg1.method29688() != -1.0F) {
			this.aFloat313 = arg1.method29688();
		}
		if (arg1.method29689() != -1.0F) {
			this.aFloat312 = arg1.method29689();
		}
		if (arg1.method29690() != -1) {
			this.aClass18_2 = arg0.method28872(arg1.method29690());
		}
		if (arg1.method29724() != -1) {
			@Pc(142) int local142 = arg1.method29724();
			@Pc(146) int local146 = arg1.method29722();
			@Pc(150) int local150 = arg1.method29692();
			@Pc(154) int local154 = arg1.method29727();
			@Pc(158) int local158 = arg1.method29695();
			Class135.anInt3399 = local158 * 834254959;
			this.aClass395_3 = arg0.method28873(local142, local146, local150, local154);
		}
		if (arg1.method29696(0) != -1) {
			this.anIntArray471[0] = arg1.method29696(0);
			this.aFloatArray113[0] = arg1.method29697(0);
		}
		if (arg1.method29696(1) != -1) {
			this.anIntArray471[1] = arg1.method29696(1);
			this.aFloatArray113[1] = arg1.method29697(1);
		}
		if (arg1.method29696(2) != -1) {
			this.anIntArray471[2] = arg1.method29696(2);
			this.aFloatArray113[2] = arg1.method29697(2);
		}
	}

	@OriginalMember(owner = "client!th", name = "aq", descriptor = "(Lclient!tg;Lclient!uz;)V", line = 268)
	void method28964(@OriginalArg(0) Class479 arg0, @OriginalArg(1) Class518 arg1) {
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if (arg1.method29680() != -1) {
				this.anInt5147 = arg1.method29680() * 1515694995;
			}
			if (arg1.method29681() != -1.0F) {
				this.aFloat318 = arg1.method29681();
			}
			if (arg1.method29682() != -1.0F) {
				this.aFloat310 = arg1.method29682();
			}
			if (arg1.method29683() != -1.0F) {
				this.aFloat311 = arg1.method29683();
			}
		}
		if (arg1.method29684() != null) {
			this.aClass320_64.method25893(arg1.method29684());
		}
		if (arg1.method29685() != -1) {
			this.anInt5148 = arg1.method29685() * -1836207377;
		}
		if (arg1.method29708() != -1) {
			this.anInt5149 = arg1.method29708() * -268291033;
		}
		if (arg1.method29687() != -1.0F) {
			this.aFloat308 = arg1.method29687();
		}
		if (arg1.method29688() != -1.0F) {
			this.aFloat313 = arg1.method29688();
		}
		if (arg1.method29689() != -1.0F) {
			this.aFloat312 = arg1.method29689();
		}
		if (arg1.method29690() != -1) {
			this.aClass18_2 = arg0.method28872(arg1.method29690());
		}
		if (arg1.method29724() != -1) {
			@Pc(142) int local142 = arg1.method29724();
			@Pc(146) int local146 = arg1.method29722();
			@Pc(150) int local150 = arg1.method29692();
			@Pc(154) int local154 = arg1.method29727();
			@Pc(158) int local158 = arg1.method29695();
			Class135.anInt3399 = local158 * 834254959;
			this.aClass395_3 = arg0.method28873(local142, local146, local150, local154);
		}
		if (arg1.method29696(0) != -1) {
			this.anIntArray471[0] = arg1.method29696(0);
			this.aFloatArray113[0] = arg1.method29697(0);
		}
		if (arg1.method29696(1) != -1) {
			this.anIntArray471[1] = arg1.method29696(1);
			this.aFloatArray113[1] = arg1.method29697(1);
		}
		if (arg1.method29696(2) != -1) {
			this.anIntArray471[2] = arg1.method29696(2);
			this.aFloatArray113[2] = arg1.method29697(2);
		}
	}

	@OriginalMember(owner = "client!th", name = "av", descriptor = "(Lclient!tg;Lclient!uz;)V", line = 268)
	void method28965(@OriginalArg(0) Class479 arg0, @OriginalArg(1) Class518 arg1) {
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1 && Class613.aClass21_13.method17023() > 0) {
			if (arg1.method29680() != -1) {
				this.anInt5147 = arg1.method29680() * 1515694995;
			}
			if (arg1.method29681() != -1.0F) {
				this.aFloat318 = arg1.method29681();
			}
			if (arg1.method29682() != -1.0F) {
				this.aFloat310 = arg1.method29682();
			}
			if (arg1.method29683() != -1.0F) {
				this.aFloat311 = arg1.method29683();
			}
		}
		if (arg1.method29684() != null) {
			this.aClass320_64.method25893(arg1.method29684());
		}
		if (arg1.method29685() != -1) {
			this.anInt5148 = arg1.method29685() * -1836207377;
		}
		if (arg1.method29708() != -1) {
			this.anInt5149 = arg1.method29708() * -268291033;
		}
		if (arg1.method29687() != -1.0F) {
			this.aFloat308 = arg1.method29687();
		}
		if (arg1.method29688() != -1.0F) {
			this.aFloat313 = arg1.method29688();
		}
		if (arg1.method29689() != -1.0F) {
			this.aFloat312 = arg1.method29689();
		}
		if (arg1.method29690() != -1) {
			this.aClass18_2 = arg0.method28872(arg1.method29690());
		}
		if (arg1.method29724() != -1) {
			@Pc(142) int local142 = arg1.method29724();
			@Pc(146) int local146 = arg1.method29722();
			@Pc(150) int local150 = arg1.method29692();
			@Pc(154) int local154 = arg1.method29727();
			@Pc(158) int local158 = arg1.method29695();
			Class135.anInt3399 = local158 * 834254959;
			this.aClass395_3 = arg0.method28873(local142, local146, local150, local154);
		}
		if (arg1.method29696(0) != -1) {
			this.anIntArray471[0] = arg1.method29696(0);
			this.aFloatArray113[0] = arg1.method29697(0);
		}
		if (arg1.method29696(1) != -1) {
			this.anIntArray471[1] = arg1.method29696(1);
			this.aFloatArray113[1] = arg1.method29697(1);
		}
		if (arg1.method29696(2) != -1) {
			this.anIntArray471[2] = arg1.method29696(2);
			this.aFloatArray113[2] = arg1.method29697(2);
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)I", line = 305)
	public int method28940() {
		return this.anInt5148 * 1583725583;
	}

	@OriginalMember(owner = "client!th", name = "al", descriptor = "()I", line = 305)
	public int method28949() {
		return this.anInt5148 * 1583725583;
	}

	@OriginalMember(owner = "client!th", name = "az", descriptor = "()I", line = 305)
	public int method28967() {
		return this.anInt5148 * 1583725583;
	}

	@OriginalMember(owner = "client!th", name = "z", descriptor = "(S)Lclient!po;", line = 309)
	public Class395 method28941() {
		return this.aClass395_3;
	}

	@OriginalMember(owner = "client!th", name = "ao", descriptor = "()Lclient!po;", line = 309)
	public Class395 method28968() {
		return this.aClass395_3;
	}

	@OriginalMember(owner = "client!th", name = "ap", descriptor = "()Lclient!po;", line = 309)
	public Class395 method28969() {
		return this.aClass395_3;
	}

	@OriginalMember(owner = "client!th", name = "co", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4513)
	static final void method28970(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3507 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 995375313;
		Class223.method24442(arg0);
	}
}
