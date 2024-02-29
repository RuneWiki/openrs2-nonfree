package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public class Class631 {

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "F")
	float aFloat321;

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "F")
	float aFloat322;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "F")
	float aFloat323;

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
	int anInt5704;

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "Lclient!oo;")
	Class447 aClass447_64;

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "Lclient!da;")
	Class91 aClass91_2;

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "F")
	float aFloat324;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "F")
	float aFloat325;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	int anInt5705;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "Lclient!ri;")
	Class510 aClass510_3;

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
	int anInt5706;

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "F")
	float aFloat330;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "F")
	float aFloat326 = 1.0F;

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "F")
	float aFloat320 = 0.0F;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "F")
	float aFloat327 = 1.0F;

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "F")
	float aFloat328 = 0.0F;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "F")
	float aFloat329 = 1.0F;

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "[I")
	int[] anIntArray528 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "[F")
	float[] aFloatArray116 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V", line = 38)
	public Class631() {
		this.method32607();
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!akv;Lclient!wb;)V", line = 42)
	public Class631(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class613 arg1) {
		this.method32615(arg0, arg1);
	}

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "(B)V", line = 47)
	void method32607() {
		this.anInt5705 = -1879224663;
		this.aClass447_64 = Class447.method29120(-50.0F, -60.0F, -50.0F);
		this.aFloat321 = 1.1523438F;
		this.aFloat322 = 0.69921875F;
		this.aFloat323 = 1.2F;
		this.anInt5704 = -969139112;
		this.anInt5706 = 0;
		this.aClass91_2 = Class613.aClass91_1;
		this.aFloat324 = 1.0F;
		this.aFloat325 = 0.25F;
		this.aFloat330 = 1.0F;
		this.aClass510_3 = Class613.aClass510_2;
		this.aFloat326 = 1.0F;
		this.aFloat320 = 0.0F;
		this.aFloat327 = 1.0F;
		this.aFloat328 = 0.0F;
		this.aFloat329 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray528;
		@Pc(59) int[] local59 = this.anIntArray528;
		this.anIntArray528[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray116;
		@Pc(78) float[] local78 = this.aFloatArray116;
		this.aFloatArray116[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "()V", line = 47)
	void method32608() {
		this.anInt5705 = -1879224663;
		this.aClass447_64 = Class447.method29120(-50.0F, -60.0F, -50.0F);
		this.aFloat321 = 1.1523438F;
		this.aFloat322 = 0.69921875F;
		this.aFloat323 = 1.2F;
		this.anInt5704 = -969139112;
		this.anInt5706 = 0;
		this.aClass91_2 = Class613.aClass91_1;
		this.aFloat324 = 1.0F;
		this.aFloat325 = 0.25F;
		this.aFloat330 = 1.0F;
		this.aClass510_3 = Class613.aClass510_2;
		this.aFloat326 = 1.0F;
		this.aFloat320 = 0.0F;
		this.aFloat327 = 1.0F;
		this.aFloat328 = 0.0F;
		this.aFloat329 = 1.0F;
		@Pc(56) int[] local56 = this.anIntArray528;
		@Pc(59) int[] local59 = this.anIntArray528;
		this.anIntArray528[2] = -1;
		local59[1] = -1;
		local56[0] = -1;
		@Pc(75) float[] local75 = this.aFloatArray116;
		@Pc(78) float[] local78 = this.aFloatArray116;
		this.aFloatArray116[2] = 0.0F;
		local78[1] = 0.0F;
		local75[0] = 0.0F;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(Lclient!wu;B)V", line = 77)
	void method32609(@OriginalArg(0) Class631 arg0) {
		this.anInt5705 = arg0.anInt5705;
		this.aFloat321 = arg0.aFloat321;
		this.aFloat322 = arg0.aFloat322;
		this.aFloat323 = arg0.aFloat323;
		this.aClass447_64.method29136(arg0.aClass447_64);
		this.anInt5704 = arg0.anInt5704;
		this.anInt5706 = arg0.anInt5706;
		this.aClass91_2 = arg0.aClass91_2;
		this.aFloat324 = arg0.aFloat324;
		this.aFloat325 = arg0.aFloat325;
		this.aFloat330 = arg0.aFloat330;
		this.aClass510_3 = arg0.aClass510_3;
		this.aFloat326 = arg0.aFloat326;
		this.aFloat320 = arg0.aFloat320;
		this.aFloat327 = arg0.aFloat327;
		this.aFloat328 = arg0.aFloat328;
		this.aFloat329 = arg0.aFloat329;
		this.anIntArray528[0] = arg0.anIntArray528[0];
		this.anIntArray528[1] = arg0.anIntArray528[1];
		this.anIntArray528[2] = arg0.anIntArray528[2];
		this.aFloatArray116[0] = arg0.aFloatArray116[0];
		this.aFloatArray116[1] = arg0.aFloatArray116[1];
		this.aFloatArray116[2] = arg0.aFloatArray116[2];
	}

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "(Lclient!wu;)V", line = 77)
	void method32610(@OriginalArg(0) Class631 arg0) {
		this.anInt5705 = arg0.anInt5705;
		this.aFloat321 = arg0.aFloat321;
		this.aFloat322 = arg0.aFloat322;
		this.aFloat323 = arg0.aFloat323;
		this.aClass447_64.method29136(arg0.aClass447_64);
		this.anInt5704 = arg0.anInt5704;
		this.anInt5706 = arg0.anInt5706;
		this.aClass91_2 = arg0.aClass91_2;
		this.aFloat324 = arg0.aFloat324;
		this.aFloat325 = arg0.aFloat325;
		this.aFloat330 = arg0.aFloat330;
		this.aClass510_3 = arg0.aClass510_3;
		this.aFloat326 = arg0.aFloat326;
		this.aFloat320 = arg0.aFloat320;
		this.aFloat327 = arg0.aFloat327;
		this.aFloat328 = arg0.aFloat328;
		this.aFloat329 = arg0.aFloat329;
		this.anIntArray528[0] = arg0.anIntArray528[0];
		this.anIntArray528[1] = arg0.anIntArray528[1];
		this.anIntArray528[2] = arg0.anIntArray528[2];
		this.aFloatArray116[0] = arg0.aFloatArray116[0];
		this.aFloatArray116[1] = arg0.aFloatArray116[1];
		this.aFloatArray116[2] = arg0.aFloatArray116[2];
	}

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "(Lclient!dx;Lclient!wu;Lclient!wu;FI)V", line = 103)
	void method32611(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class631 arg1, @OriginalArg(2) Class631 arg2, @OriginalArg(3) float arg3) {
		this.anInt5705 = Class636.method32688(arg1.anInt5705 * -1201354137, arg2.anInt5705 * -1201354137, arg3 * 255.0F) * -956124841;
		this.aFloat322 = (arg2.aFloat322 - arg1.aFloat322) * arg3 + arg1.aFloat322;
		this.aFloat323 = (arg2.aFloat323 - arg1.aFloat323) * arg3 + arg1.aFloat323;
		this.aFloat321 = arg1.aFloat321 + (arg2.aFloat321 - arg1.aFloat321) * arg3;
		this.aFloat330 = arg1.aFloat330 + (arg2.aFloat330 - arg1.aFloat330) * arg3;
		this.aFloat324 = arg1.aFloat324 + (arg2.aFloat324 - arg1.aFloat324) * arg3;
		this.aFloat325 = arg1.aFloat325 + arg3 * (arg2.aFloat325 - arg1.aFloat325);
		this.anInt5704 = Class636.method32688(arg1.anInt5704 * 1102104287, arg2.anInt5704 * 1102104287, arg3 * 255.0F) * 432829727;
		this.anInt5706 = (int) ((float) (arg2.anInt5706 * -563441071 - arg1.anInt5706 * -563441071) * arg3 + (float) (arg1.anInt5706 * -563441071)) * 2005399217;
		if (arg2.aClass91_2 != arg1.aClass91_2) {
			this.aClass91_2 = arg0.method20220(arg1.aClass91_2, arg2.aClass91_2, arg3, this.aClass91_2);
		}
		if (arg1.aClass510_3 != arg2.aClass510_3) {
			if (arg1.aClass510_3 == null) {
				this.aClass510_3 = arg2.aClass510_3;
				if (this.aClass510_3 != null) {
					this.aClass510_3.method30290((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass510_3 = arg1.aClass510_3;
				if (this.aClass510_3 != null) {
					this.aClass510_3.method30290((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat326 = arg1.aFloat326 + arg3 * (arg2.aFloat326 - arg1.aFloat326);
		this.aFloat320 = (arg2.aFloat320 - arg1.aFloat320) * arg3 + arg1.aFloat320;
		this.aFloat327 = (arg2.aFloat327 - arg1.aFloat327) * arg3 + arg1.aFloat327;
		this.aFloat328 = (arg2.aFloat328 - arg1.aFloat328) * arg3 + arg1.aFloat328;
		this.aFloat329 = (arg2.aFloat329 - arg1.aFloat329) * arg3 + arg1.aFloat329;
		@Pc(261) float local261 = arg1.aFloatArray116[0] + arg1.aFloatArray116[1] + arg1.aFloatArray116[2];
		@Pc(276) float local276 = arg2.aFloatArray116[2] + arg2.aFloatArray116[1] + arg2.aFloatArray116[0];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray528;
			@Pc(294) int[] local294 = this.anIntArray528;
			this.anIntArray528[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray116;
			local313 = this.aFloatArray116;
			this.aFloatArray116[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray528[0] == -1 && arg1.anIntArray528[1] == -1 && arg1.anIntArray528[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray528[local347] = arg2.anIntArray528[local347];
				if (this.anIntArray528[local347] == -1) {
					this.aFloatArray116[local347] = 0.0F;
				} else {
					this.aFloatArray116[local347] = arg2.aFloatArray116[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray528[0] == -1 && arg2.anIntArray528[1] == -1 && arg2.anIntArray528[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray528[local347] = arg1.anIntArray528[local347];
				if (this.anIntArray528[local347] == -1) {
					this.aFloatArray116[local347] = 0.0F;
				} else {
					this.aFloatArray116[local347] = arg1.aFloatArray116[local347] * (1.0F - arg3);
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray528[local503] > -1) {
					local474[local447] = arg1.anIntArray528[local503];
					local313[local447++] = arg1.aFloatArray116[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray528[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray116[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (local474[local553] == arg2.anIntArray528[local535]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray528[local535];
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
				Class590.method31811(local313, local474, 0, local447 - 1);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray528[local535] = local474[local535];
				this.aFloatArray116[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(Lclient!dx;Lclient!wu;Lclient!wu;F)V", line = 103)
	void method32612(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class631 arg1, @OriginalArg(2) Class631 arg2, @OriginalArg(3) float arg3) {
		this.anInt5705 = Class636.method32688(arg1.anInt5705 * -1201354137, arg2.anInt5705 * -1201354137, arg3 * 255.0F) * -956124841;
		this.aFloat322 = (arg2.aFloat322 - arg1.aFloat322) * arg3 + arg1.aFloat322;
		this.aFloat323 = (arg2.aFloat323 - arg1.aFloat323) * arg3 + arg1.aFloat323;
		this.aFloat321 = arg1.aFloat321 + (arg2.aFloat321 - arg1.aFloat321) * arg3;
		this.aFloat330 = arg1.aFloat330 + (arg2.aFloat330 - arg1.aFloat330) * arg3;
		this.aFloat324 = arg1.aFloat324 + (arg2.aFloat324 - arg1.aFloat324) * arg3;
		this.aFloat325 = arg1.aFloat325 + arg3 * (arg2.aFloat325 - arg1.aFloat325);
		this.anInt5704 = Class636.method32688(arg1.anInt5704 * 1102104287, arg2.anInt5704 * 1102104287, arg3 * 255.0F) * 432829727;
		this.anInt5706 = (int) ((float) (arg2.anInt5706 * -563441071 - arg1.anInt5706 * -563441071) * arg3 + (float) (arg1.anInt5706 * -563441071)) * 2005399217;
		if (arg2.aClass91_2 != arg1.aClass91_2) {
			this.aClass91_2 = arg0.method20220(arg1.aClass91_2, arg2.aClass91_2, arg3, this.aClass91_2);
		}
		if (arg1.aClass510_3 != arg2.aClass510_3) {
			if (arg1.aClass510_3 == null) {
				this.aClass510_3 = arg2.aClass510_3;
				if (this.aClass510_3 != null) {
					this.aClass510_3.method30290((int) (arg3 * 255.0F), 0);
				}
			} else {
				this.aClass510_3 = arg1.aClass510_3;
				if (this.aClass510_3 != null) {
					this.aClass510_3.method30290((int) (arg3 * 255.0F), 255);
				}
			}
		}
		this.aFloat326 = arg1.aFloat326 + arg3 * (arg2.aFloat326 - arg1.aFloat326);
		this.aFloat320 = (arg2.aFloat320 - arg1.aFloat320) * arg3 + arg1.aFloat320;
		this.aFloat327 = (arg2.aFloat327 - arg1.aFloat327) * arg3 + arg1.aFloat327;
		this.aFloat328 = (arg2.aFloat328 - arg1.aFloat328) * arg3 + arg1.aFloat328;
		this.aFloat329 = (arg2.aFloat329 - arg1.aFloat329) * arg3 + arg1.aFloat329;
		@Pc(261) float local261 = arg1.aFloatArray116[0] + arg1.aFloatArray116[1] + arg1.aFloatArray116[2];
		@Pc(276) float local276 = arg2.aFloatArray116[2] + arg2.aFloatArray116[1] + arg2.aFloatArray116[0];
		@Pc(284) float local284 = (local276 - local261) * arg3 + local261;
		@Pc(313) float[] local313;
		if (local284 == 0.0F) {
			@Pc(291) int[] local291 = this.anIntArray528;
			@Pc(294) int[] local294 = this.anIntArray528;
			this.anIntArray528[2] = -1;
			local294[1] = -1;
			local291[0] = -1;
			@Pc(310) float[] local310 = this.aFloatArray116;
			local313 = this.aFloatArray116;
			this.aFloatArray116[2] = 0.0F;
			local313[1] = 0.0F;
			local310[0] = 0.0F;
			return;
		}
		@Pc(347) int local347;
		if (arg1.anIntArray528[0] == -1 && arg1.anIntArray528[1] == -1 && arg1.anIntArray528[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray528[local347] = arg2.anIntArray528[local347];
				if (this.anIntArray528[local347] == -1) {
					this.aFloatArray116[local347] = 0.0F;
				} else {
					this.aFloatArray116[local347] = arg2.aFloatArray116[local347] * arg3;
				}
			}
		} else if (arg2.anIntArray528[0] == -1 && arg2.anIntArray528[1] == -1 && arg2.anIntArray528[2] == -1) {
			for (local347 = 0; local347 < 3; local347++) {
				this.anIntArray528[local347] = arg1.anIntArray528[local347];
				if (this.anIntArray528[local347] == -1) {
					this.aFloatArray116[local347] = 0.0F;
				} else {
					this.aFloatArray116[local347] = arg1.aFloatArray116[local347] * (1.0F - arg3);
				}
			}
		} else {
			@Pc(445) float local445 = 1.0F - arg3;
			@Pc(447) int local447 = 0;
			@Pc(474) int[] local474 = new int[] { -1, -1, -1, -1, -1, -1 };
			local313 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			@Pc(503) int local503;
			for (local503 = 0; local503 < 3; local503++) {
				if (arg1.anIntArray528[local503] > -1) {
					local474[local447] = arg1.anIntArray528[local503];
					local313[local447++] = arg1.aFloatArray116[local503] * local445;
				}
			}
			local503 = local447;
			@Pc(535) int local535;
			for (local535 = 0; local535 < 3; local535++) {
				if (arg2.anIntArray528[local535] > -1) {
					@Pc(551) float local551 = arg2.aFloatArray116[local535] * arg3;
					for (@Pc(553) int local553 = 0; local553 < local503; local553++) {
						if (local474[local553] == arg2.anIntArray528[local535]) {
							local313[local553] += local551;
							break;
						}
						if (local553 == local503 - 1) {
							local474[local447] = arg2.anIntArray528[local535];
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
				Class590.method31811(local313, local474, 0, local447 - 1);
				for (local602 = 0; local602 < 3; local602++) {
					local600 += local313[local602];
				}
				@Pc(638) float local638 = local598 / local600;
				for (@Pc(640) int local640 = 0; local640 < 3; local640++) {
					local313[local640] *= local638;
				}
			}
			for (local535 = 0; local535 < 3; local535++) {
				this.anIntArray528[local535] = local474[local535];
				this.aFloatArray116[local535] = local313[local535];
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "([Ljava/lang/String;B)V", line = 107)
	static void method32613(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Class157.aString126 = Class157.aString126 + arg0[0];
			Class157.anInt3244 += arg0[0].length() * 399107939;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class51.method764("Pausing for " + local17 + " seconds...");
				Class157.aStringArray23 = arg0;
				Class157.anInt3242 = (local5 + 1) * -556419873;
				Class330.aLong258 = (Class280.method26667() + (long) (local17 * 1000)) * 6271713210732061629L;
				return;
			}
			Class157.aString126 = arg0[local5];
			Class647.method32851(false);
		}
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "(Lclient!akv;Lclient!wb;)V", line = 204)
	public void method32614(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class613 arg1) {
		@Pc(3) int local3 = arg0.method22478();
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1.method15306() == 1 && Class284.aClass86_9.method20129() > 0) {
			if ((local3 & Class642.aClass642_6.anInt5722 * 522594405) == 0) {
				this.anInt5705 = -1879224663;
			} else {
				this.anInt5705 = arg0.method22500() * -956124841;
			}
			if ((local3 & Class642.aClass642_2.anInt5722 * 522594405) == 0) {
				this.aFloat321 = 1.1523438F;
			} else {
				this.aFloat321 = (float) arg0.method22483() / 256.0F;
			}
			if ((local3 & Class642.aClass642_3.anInt5722 * 522594405) == 0) {
				this.aFloat322 = 0.69921875F;
			} else {
				this.aFloat322 = (float) arg0.method22483() / 256.0F;
			}
			if ((local3 & Class642.aClass642_4.anInt5722 * 522594405) == 0) {
				this.aFloat323 = 1.2F;
			} else {
				this.aFloat323 = (float) arg0.method22483() / 256.0F;
			}
		} else {
			if ((local3 & Class642.aClass642_6.anInt5722 * 522594405) != 0) {
				arg0.method22500();
			}
			if ((local3 & Class642.aClass642_2.anInt5722 * 522594405) != 0) {
				arg0.method22483();
			}
			if ((local3 & Class642.aClass642_3.anInt5722 * 522594405) != 0) {
				arg0.method22483();
			}
			if ((local3 & Class642.aClass642_4.anInt5722 * 522594405) != 0) {
				arg0.method22483();
			}
			this.anInt5705 = -1879224663;
			this.aFloat323 = 1.2F;
			this.aFloat322 = 0.69921875F;
			this.aFloat321 = 1.1523438F;
		}
		if ((local3 & Class642.aClass642_5.anInt5722 * 522594405) == 0) {
			this.aClass447_64 = Class447.method29120(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass447_64 = Class447.method29120((float) arg0.method22487(), (float) arg0.method22487(), (float) arg0.method22487());
		}
		if ((local3 & Class642.aClass642_12.anInt5722 * 522594405) == 0) {
			this.anInt5704 = -969139112;
		} else {
			this.anInt5704 = arg0.method22500() * 432829727;
		}
		if ((local3 & Class642.aClass642_11.anInt5722 * 522594405) == 0) {
			this.anInt5706 = 0;
		} else {
			this.anInt5706 = arg0.method22483() * 2005399217;
		}
		if ((local3 & Class642.aClass642_7.anInt5722 * 522594405) == 0) {
			this.aClass91_2 = Class613.aClass91_1;
		} else {
			@Pc(228) int local228 = arg0.method22483();
			this.aClass91_2 = arg1.method32265(local228);
		}
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(Lclient!akv;Lclient!wb;I)V", line = 204)
	public void method32615(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class613 arg1) {
		@Pc(3) int local3 = arg0.method22478();
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1.method15306() == 1 && Class284.aClass86_9.method20129() > 0) {
			if ((local3 & Class642.aClass642_6.anInt5722 * 522594405) == 0) {
				this.anInt5705 = -1879224663;
			} else {
				this.anInt5705 = arg0.method22500() * -956124841;
			}
			if ((local3 & Class642.aClass642_2.anInt5722 * 522594405) == 0) {
				this.aFloat321 = 1.1523438F;
			} else {
				this.aFloat321 = (float) arg0.method22483() / 256.0F;
			}
			if ((local3 & Class642.aClass642_3.anInt5722 * 522594405) == 0) {
				this.aFloat322 = 0.69921875F;
			} else {
				this.aFloat322 = (float) arg0.method22483() / 256.0F;
			}
			if ((local3 & Class642.aClass642_4.anInt5722 * 522594405) == 0) {
				this.aFloat323 = 1.2F;
			} else {
				this.aFloat323 = (float) arg0.method22483() / 256.0F;
			}
		} else {
			if ((local3 & Class642.aClass642_6.anInt5722 * 522594405) != 0) {
				arg0.method22500();
			}
			if ((local3 & Class642.aClass642_2.anInt5722 * 522594405) != 0) {
				arg0.method22483();
			}
			if ((local3 & Class642.aClass642_3.anInt5722 * 522594405) != 0) {
				arg0.method22483();
			}
			if ((local3 & Class642.aClass642_4.anInt5722 * 522594405) != 0) {
				arg0.method22483();
			}
			this.anInt5705 = -1879224663;
			this.aFloat323 = 1.2F;
			this.aFloat322 = 0.69921875F;
			this.aFloat321 = 1.1523438F;
		}
		if ((local3 & Class642.aClass642_5.anInt5722 * 522594405) == 0) {
			this.aClass447_64 = Class447.method29120(-50.0F, -60.0F, -50.0F);
		} else {
			this.aClass447_64 = Class447.method29120((float) arg0.method22487(), (float) arg0.method22487(), (float) arg0.method22487());
		}
		if ((local3 & Class642.aClass642_12.anInt5722 * 522594405) == 0) {
			this.anInt5704 = -969139112;
		} else {
			this.anInt5704 = arg0.method22500() * 432829727;
		}
		if ((local3 & Class642.aClass642_11.anInt5722 * 522594405) == 0) {
			this.anInt5706 = 0;
		} else {
			this.anInt5706 = arg0.method22483() * 2005399217;
		}
		if ((local3 & Class642.aClass642_7.anInt5722 * 522594405) == 0) {
			this.aClass91_2 = Class613.aClass91_1;
		} else {
			@Pc(228) int local228 = arg0.method22483();
			this.aClass91_2 = arg1.method32265(local228);
		}
	}

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "(Lclient!akv;I)V", line = 239)
	public void method32616(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat324 = arg0.method22517();
		this.aFloat325 = arg0.method22517();
		this.aFloat330 = arg0.method22517();
	}

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "(Lclient!akv;I)V", line = 245)
	public void method32617(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method32621(arg0, 0);
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "(Lclient!akv;)V", line = 245)
	public void method32618(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method32621(arg0, 0);
	}

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "(Lclient!akv;)V", line = 245)
	public void method32619(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method32621(arg0, 0);
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(Lclient!akv;I)V", line = 249)
	void method32620(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray528[arg1] = arg0.method22483();
		this.aFloatArray116[arg1] = arg0.method22517();
	}

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "(Lclient!akv;II)V", line = 249)
	void method32621(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.anIntArray528[arg1] = arg0.method22483();
		this.aFloatArray116[arg1] = arg0.method22517();
	}

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "(Lclient!akv;Lclient!wb;B)V", line = 254)
	public void method32622(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class613 arg1) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(7) int local7 = arg0.method22487();
		@Pc(11) int local11 = arg0.method22487();
		@Pc(15) int local15 = arg0.method22487();
		@Pc(19) int local19 = arg0.method22483();
		Class14.anInt2381 = local19 * -1037919377;
		this.aClass510_3 = arg1.method32268(local3, local7, local11, local15);
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(Lclient!akv;Lclient!wb;)V", line = 254)
	public void method32623(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class613 arg1) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(7) int local7 = arg0.method22487();
		@Pc(11) int local11 = arg0.method22487();
		@Pc(15) int local15 = arg0.method22487();
		@Pc(19) int local19 = arg0.method22483();
		Class14.anInt2381 = local19 * -1037919377;
		this.aClass510_3 = arg1.method32268(local3, local7, local11, local15);
	}

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "(Lclient!akv;Lclient!wb;)V", line = 254)
	public void method32624(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class613 arg1) {
		@Pc(3) int local3 = arg0.method22483();
		@Pc(7) int local7 = arg0.method22487();
		@Pc(11) int local11 = arg0.method22487();
		@Pc(15) int local15 = arg0.method22487();
		@Pc(19) int local19 = arg0.method22483();
		Class14.anInt2381 = local19 * -1037919377;
		this.aClass510_3 = arg1.method32268(local3, local7, local11, local15);
	}

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "(Lclient!wu;B)Z", line = 264)
	boolean method32625(@OriginalArg(0) Class631 arg0) {
		return arg0.anInt5705 * -1201354137 == this.anInt5705 * -1201354137 && this.aFloat321 == arg0.aFloat321 && this.aFloat322 == arg0.aFloat322 && arg0.aFloat323 == this.aFloat323 && arg0.aFloat325 == this.aFloat325 && arg0.aFloat324 == this.aFloat324 && this.aFloat330 == arg0.aFloat330 && arg0.anInt5704 * 1102104287 == this.anInt5704 * 1102104287 && arg0.anInt5706 * -563441071 == this.anInt5706 * -563441071 && this.aClass91_2 == arg0.aClass91_2 && arg0.aClass510_3 == this.aClass510_3 && this.aFloat326 == arg0.aFloat326 && arg0.aFloat320 == this.aFloat320 && arg0.aFloat327 == this.aFloat327 && arg0.aFloat328 == this.aFloat328 && arg0.aFloat329 == this.aFloat329 && arg0.anIntArray528[0] == this.anIntArray528[0] && this.anIntArray528[1] == arg0.anIntArray528[1] && arg0.anIntArray528[2] == this.anIntArray528[2] && this.aFloatArray116[0] == arg0.aFloatArray116[0] && this.aFloatArray116[1] == arg0.aFloatArray116[1] && this.aFloatArray116[2] == arg0.aFloatArray116[2];
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!wu;)Z", line = 264)
	boolean method32626(@OriginalArg(0) Class631 arg0) {
		return arg0.anInt5705 * -1201354137 == this.anInt5705 * -1201354137 && this.aFloat321 == arg0.aFloat321 && this.aFloat322 == arg0.aFloat322 && arg0.aFloat323 == this.aFloat323 && arg0.aFloat325 == this.aFloat325 && arg0.aFloat324 == this.aFloat324 && this.aFloat330 == arg0.aFloat330 && arg0.anInt5704 * 1102104287 == this.anInt5704 * 1102104287 && arg0.anInt5706 * -563441071 == this.anInt5706 * -563441071 && this.aClass91_2 == arg0.aClass91_2 && arg0.aClass510_3 == this.aClass510_3 && this.aFloat326 == arg0.aFloat326 && arg0.aFloat320 == this.aFloat320 && arg0.aFloat327 == this.aFloat327 && arg0.aFloat328 == this.aFloat328 && arg0.aFloat329 == this.aFloat329 && arg0.anIntArray528[0] == this.anIntArray528[0] && this.anIntArray528[1] == arg0.anIntArray528[1] && arg0.anIntArray528[2] == this.anIntArray528[2] && this.aFloatArray116[0] == arg0.aFloatArray116[0] && this.aFloatArray116[1] == arg0.aFloatArray116[1] && this.aFloatArray116[2] == arg0.aFloatArray116[2];
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Lclient!wu;)Z", line = 264)
	boolean method32627(@OriginalArg(0) Class631 arg0) {
		return arg0.anInt5705 * -1201354137 == this.anInt5705 * -1201354137 && this.aFloat321 == arg0.aFloat321 && this.aFloat322 == arg0.aFloat322 && arg0.aFloat323 == this.aFloat323 && arg0.aFloat325 == this.aFloat325 && arg0.aFloat324 == this.aFloat324 && this.aFloat330 == arg0.aFloat330 && arg0.anInt5704 * 1102104287 == this.anInt5704 * 1102104287 && arg0.anInt5706 * -563441071 == this.anInt5706 * -563441071 && this.aClass91_2 == arg0.aClass91_2 && arg0.aClass510_3 == this.aClass510_3 && this.aFloat326 == arg0.aFloat326 && arg0.aFloat320 == this.aFloat320 && arg0.aFloat327 == this.aFloat327 && arg0.aFloat328 == this.aFloat328 && arg0.aFloat329 == this.aFloat329 && arg0.anIntArray528[0] == this.anIntArray528[0] && this.anIntArray528[1] == arg0.anIntArray528[1] && arg0.anIntArray528[2] == this.anIntArray528[2] && this.aFloatArray116[0] == arg0.aFloatArray116[0] && this.aFloatArray116[1] == arg0.aFloatArray116[1] && this.aFloatArray116[2] == arg0.aFloatArray116[2];
	}

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "(Lclient!wu;)Z", line = 264)
	boolean method32628(@OriginalArg(0) Class631 arg0) {
		return arg0.anInt5705 * -1201354137 == this.anInt5705 * -1201354137 && this.aFloat321 == arg0.aFloat321 && this.aFloat322 == arg0.aFloat322 && arg0.aFloat323 == this.aFloat323 && arg0.aFloat325 == this.aFloat325 && arg0.aFloat324 == this.aFloat324 && this.aFloat330 == arg0.aFloat330 && arg0.anInt5704 * 1102104287 == this.anInt5704 * 1102104287 && arg0.anInt5706 * -563441071 == this.anInt5706 * -563441071 && this.aClass91_2 == arg0.aClass91_2 && arg0.aClass510_3 == this.aClass510_3 && this.aFloat326 == arg0.aFloat326 && arg0.aFloat320 == this.aFloat320 && arg0.aFloat327 == this.aFloat327 && arg0.aFloat328 == this.aFloat328 && arg0.aFloat329 == this.aFloat329 && arg0.anIntArray528[0] == this.anIntArray528[0] && this.anIntArray528[1] == arg0.anIntArray528[1] && arg0.anIntArray528[2] == this.anIntArray528[2] && this.aFloatArray116[0] == arg0.aFloatArray116[0] && this.aFloatArray116[1] == arg0.aFloatArray116[1] && this.aFloatArray116[2] == arg0.aFloatArray116[2];
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(Lclient!wb;Lclient!xp;)V", line = 268)
	void method32629(@OriginalArg(0) Class613 arg0, @OriginalArg(1) Class651 arg1) {
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1.method15306() == 1 && Class284.aClass86_9.method20129() > 0) {
			if (arg1.method32900() != -1) {
				this.anInt5705 = arg1.method32900() * -956124841;
			}
			if (arg1.method32908() != -1.0F) {
				this.aFloat321 = arg1.method32908();
			}
			if (arg1.method32909() != -1.0F) {
				this.aFloat322 = arg1.method32909();
			}
			if (arg1.method32912() != -1.0F) {
				this.aFloat323 = arg1.method32912();
			}
		}
		if (arg1.method32913() != null) {
			this.aClass447_64.method29136(arg1.method32913());
		}
		if (arg1.method32915() != -1) {
			this.anInt5704 = arg1.method32915() * 432829727;
		}
		if (arg1.method32919() != -1) {
			this.anInt5706 = arg1.method32919() * 2005399217;
		}
		if (arg1.method32923() != -1.0F) {
			this.aFloat325 = arg1.method32923();
		}
		if (arg1.method32924() != -1.0F) {
			this.aFloat330 = arg1.method32924();
		}
		if (arg1.method32928() != -1.0F) {
			this.aFloat324 = arg1.method32928();
		}
		if (arg1.method32930() != -1) {
			this.aClass91_2 = arg0.method32265(arg1.method32930());
		}
		if (arg1.method32933() != -1) {
			@Pc(142) int local142 = arg1.method32933();
			@Pc(146) int local146 = arg1.method32935();
			@Pc(150) int local150 = arg1.method32937();
			@Pc(154) int local154 = arg1.method32941();
			@Pc(158) int local158 = arg1.method32944();
			Class14.anInt2381 = local158 * -1037919377;
			this.aClass510_3 = arg0.method32268(local142, local146, local150, local154);
		}
		if (arg1.method32945(0) != -1) {
			this.anIntArray528[0] = arg1.method32945(0);
			this.aFloatArray116[0] = arg1.method32947(0);
		}
		if (arg1.method32945(1) != -1) {
			this.anIntArray528[1] = arg1.method32945(1);
			this.aFloatArray116[1] = arg1.method32947(1);
		}
		if (arg1.method32945(2) != -1) {
			this.anIntArray528[2] = arg1.method32945(2);
			this.aFloatArray116[2] = arg1.method32947(2);
		}
	}

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "(Lclient!wb;Lclient!xp;)V", line = 268)
	void method32630(@OriginalArg(0) Class613 arg0, @OriginalArg(1) Class651 arg1) {
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1.method15306() == 1 && Class284.aClass86_9.method20129() > 0) {
			if (arg1.method32900() != -1) {
				this.anInt5705 = arg1.method32900() * -956124841;
			}
			if (arg1.method32908() != -1.0F) {
				this.aFloat321 = arg1.method32908();
			}
			if (arg1.method32909() != -1.0F) {
				this.aFloat322 = arg1.method32909();
			}
			if (arg1.method32912() != -1.0F) {
				this.aFloat323 = arg1.method32912();
			}
		}
		if (arg1.method32913() != null) {
			this.aClass447_64.method29136(arg1.method32913());
		}
		if (arg1.method32915() != -1) {
			this.anInt5704 = arg1.method32915() * 432829727;
		}
		if (arg1.method32919() != -1) {
			this.anInt5706 = arg1.method32919() * 2005399217;
		}
		if (arg1.method32923() != -1.0F) {
			this.aFloat325 = arg1.method32923();
		}
		if (arg1.method32924() != -1.0F) {
			this.aFloat330 = arg1.method32924();
		}
		if (arg1.method32928() != -1.0F) {
			this.aFloat324 = arg1.method32928();
		}
		if (arg1.method32930() != -1) {
			this.aClass91_2 = arg0.method32265(arg1.method32930());
		}
		if (arg1.method32933() != -1) {
			@Pc(142) int local142 = arg1.method32933();
			@Pc(146) int local146 = arg1.method32935();
			@Pc(150) int local150 = arg1.method32937();
			@Pc(154) int local154 = arg1.method32941();
			@Pc(158) int local158 = arg1.method32944();
			Class14.anInt2381 = local158 * -1037919377;
			this.aClass510_3 = arg0.method32268(local142, local146, local150, local154);
		}
		if (arg1.method32945(0) != -1) {
			this.anIntArray528[0] = arg1.method32945(0);
			this.aFloatArray116[0] = arg1.method32947(0);
		}
		if (arg1.method32945(1) != -1) {
			this.anIntArray528[1] = arg1.method32945(1);
			this.aFloatArray116[1] = arg1.method32947(1);
		}
		if (arg1.method32945(2) != -1) {
			this.anIntArray528[2] = arg1.method32945(2);
			this.aFloatArray116[2] = arg1.method32947(2);
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(Lclient!wb;Lclient!xp;I)V", line = 268)
	void method32631(@OriginalArg(0) Class613 arg0, @OriginalArg(1) Class651 arg1) {
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1.method15306() == 1 && Class284.aClass86_9.method20129() > 0) {
			if (arg1.method32900() != -1) {
				this.anInt5705 = arg1.method32900() * -956124841;
			}
			if (arg1.method32908() != -1.0F) {
				this.aFloat321 = arg1.method32908();
			}
			if (arg1.method32909() != -1.0F) {
				this.aFloat322 = arg1.method32909();
			}
			if (arg1.method32912() != -1.0F) {
				this.aFloat323 = arg1.method32912();
			}
		}
		if (arg1.method32913() != null) {
			this.aClass447_64.method29136(arg1.method32913());
		}
		if (arg1.method32915() != -1) {
			this.anInt5704 = arg1.method32915() * 432829727;
		}
		if (arg1.method32919() != -1) {
			this.anInt5706 = arg1.method32919() * 2005399217;
		}
		if (arg1.method32923() != -1.0F) {
			this.aFloat325 = arg1.method32923();
		}
		if (arg1.method32924() != -1.0F) {
			this.aFloat330 = arg1.method32924();
		}
		if (arg1.method32928() != -1.0F) {
			this.aFloat324 = arg1.method32928();
		}
		if (arg1.method32930() != -1) {
			this.aClass91_2 = arg0.method32265(arg1.method32930());
		}
		if (arg1.method32933() != -1) {
			@Pc(142) int local142 = arg1.method32933();
			@Pc(146) int local146 = arg1.method32935();
			@Pc(150) int local150 = arg1.method32937();
			@Pc(154) int local154 = arg1.method32941();
			@Pc(158) int local158 = arg1.method32944();
			Class14.anInt2381 = local158 * -1037919377;
			this.aClass510_3 = arg0.method32268(local142, local146, local150, local154);
		}
		if (arg1.method32945(0) != -1) {
			this.anIntArray528[0] = arg1.method32945(0);
			this.aFloatArray116[0] = arg1.method32947(0);
		}
		if (arg1.method32945(1) != -1) {
			this.anIntArray528[1] = arg1.method32945(1);
			this.aFloatArray116[1] = arg1.method32947(1);
		}
		if (arg1.method32945(2) != -1) {
			this.anIntArray528[2] = arg1.method32945(2);
			this.aFloatArray116[2] = arg1.method32947(2);
		}
	}

	@OriginalMember(owner = "client!wu", name = "aj", descriptor = "()I", line = 305)
	public int method32632() {
		return this.anInt5704 * 1102104287;
	}

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "(I)I", line = 305)
	public int method32633() {
		return this.anInt5704 * 1102104287;
	}

	@OriginalMember(owner = "client!wu", name = "ai", descriptor = "()I", line = 305)
	public int method32634() {
		return this.anInt5704 * 1102104287;
	}

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "(I)Lclient!ri;", line = 309)
	public Class510 method32635() {
		return this.aClass510_3;
	}

	@OriginalMember(owner = "client!wu", name = "ag", descriptor = "()Lclient!ri;", line = 309)
	public Class510 method32636() {
		return this.aClass510_3;
	}

	@OriginalMember(owner = "client!wu", name = "kw", descriptor = "(Lclient!gm;[B[BLclient!yf;B)V", line = 6351)
	static final void method32637(@OriginalArg(0) Class277 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class665 arg3) {
		@Pc(14) int local14 = arg3.anIntArray536[(arg3.anInt5784 -= 308999563) * 2088438307] - 1;
		if (local14 < 0 || local14 > 9) {
			throw new RuntimeException();
		}
		Class358.method27972(arg0, local14, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wu", name = "ahg", descriptor = "(Lclient!yf;S)V", line = 10611)
	static final void method32638(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!wu", name = "axu", descriptor = "(Lclient!yf;B)V", line = 13454)
	static final void method32639(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class104_Sub1_Sub1_Sub1_Sub1) arg0.aClass104_Sub1_Sub1_Sub1_4).aClass333_1.anInt4100 * -4020817;
	}
}
