package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public abstract class Class45 {

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	static final int anInt2591 = 12;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
	static final int anInt2593 = 4095;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	static final int anInt2597 = 4096;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
	public static final int[] anIntArray257 = new int[4096];

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "[S")
	short[] aShortArray47;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "[S")
	short[] aShortArray48 = new short[512];

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
	int anInt2590 = 0;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
	int anInt2594 = 4;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
	int anInt2595 = 4;

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
	int anInt2596 = 4;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	int anInt2592 = 4;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray257[local4] = method18253(local4);
		}
	}

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIII)V", line = 26)
	Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2590 = arg0;
		this.anInt2594 = arg2;
		this.anInt2595 = arg3;
		this.anInt2596 = arg4;
		this.anInt2592 = arg1;
		this.method18250();
		this.method18252();
	}

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "(III)V", line = 71)
	void method18246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(5) int[] local5 = new int[arg1];
		@Pc(8) int[] local8 = new int[arg2];
		@Pc(10) int local10;
		for (local10 = 0; local10 < arg0; local10++) {
			local2[local10] = (local10 << 12) / arg0;
		}
		for (local10 = 0; local10 < arg1; local10++) {
			local5[local10] = (local10 << 12) / arg1;
		}
		for (local10 = 0; local10 < arg2; local10++) {
			local8[local10] = (local10 << 12) / arg2;
		}
		this.method18247();
		for (@Pc(57) int local57 = 0; local57 < arg2; local57++) {
			for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
				for (@Pc(67) int local67 = 0; local67 < arg0; local67++) {
					for (@Pc(72) int local72 = 0; local72 < this.anInt2592; local72++) {
						local10 = this.aShortArray47[local72] << 12;
						@Pc(90) int local90 = this.anInt2594 * local10 >> 12;
						@Pc(97) int local97 = this.anInt2595 * local10 >> 12;
						@Pc(104) int local104 = this.anInt2596 * local10 >> 12;
						@Pc(112) int local112 = local2[local67] * local10 >> 12;
						@Pc(120) int local120 = local5[local62] * local10 >> 12;
						@Pc(128) int local128 = local8[local57] * local10 >> 12;
						@Pc(133) int local133 = local112 * this.anInt2594;
						@Pc(138) int local138 = local120 * this.anInt2595;
						@Pc(143) int local143 = local128 * this.anInt2596;
						@Pc(147) int local147 = local133 >> 12;
						@Pc(151) int local151 = local147 + 1;
						@Pc(155) int local155 = local147 & 0xFF;
						@Pc(159) int local159 = local138 >> 12;
						@Pc(163) int local163 = local159 + 1;
						@Pc(167) int local167 = local159 & 0xFF;
						@Pc(171) int local171 = local143 >> 12;
						@Pc(175) int local175 = local171 + 1;
						@Pc(179) int local179 = local171 & 0xFF;
						if (local151 >= local90) {
							local151 = 0;
						} else {
							local151 &= 0xFF;
						}
						if (local163 >= local97) {
							local163 = 0;
						} else {
							local163 &= 0xFF;
						}
						if (local175 >= local104) {
							local175 = 0;
						} else {
							local175 &= 0xFF;
						}
						local112 = local133 & 0xFFF;
						local120 = local138 & 0xFFF;
						local128 = local143 & 0xFFF;
						@Pc(225) int local225 = anIntArray257[local112];
						@Pc(229) int local229 = anIntArray257[local120];
						@Pc(233) int local233 = anIntArray257[local128];
						@Pc(237) int local237 = local112 - 4096;
						@Pc(241) int local241 = local120 - 4096;
						@Pc(245) int local245 = local128 - 4096;
						@Pc(250) short local250 = this.aShortArray48[local179];
						@Pc(255) short local255 = this.aShortArray48[local175];
						@Pc(262) short local262 = this.aShortArray48[local167 + local250];
						@Pc(269) short local269 = this.aShortArray48[local163 + local250];
						@Pc(276) short local276 = this.aShortArray48[local167 + local255];
						@Pc(283) short local283 = this.aShortArray48[local163 + local255];
						@Pc(294) int local294 = method18251(this.aShortArray48[local155 + local262], local112, local120, local128);
						@Pc(305) int local305 = method18251(this.aShortArray48[local151 + local262], local237, local120, local128);
						@Pc(315) int local315 = local294 + (local225 * (local305 - local294) >> 12);
						@Pc(326) int local326 = method18251(this.aShortArray48[local155 + local269], local112, local241, local128);
						@Pc(337) int local337 = method18251(this.aShortArray48[local151 + local269], local237, local241, local128);
						@Pc(347) int local347 = local326 + (local225 * (local337 - local326) >> 12);
						@Pc(357) int local357 = local315 + (local229 * (local347 - local315) >> 12);
						@Pc(368) int local368 = method18251(this.aShortArray48[local155 + local276], local112, local120, local245);
						@Pc(379) int local379 = method18251(this.aShortArray48[local151 + local276], local237, local120, local245);
						@Pc(389) int local389 = local368 + (local225 * (local379 - local368) >> 12);
						@Pc(400) int local400 = method18251(this.aShortArray48[local155 + local283], local112, local241, local245);
						@Pc(411) int local411 = method18251(this.aShortArray48[local151 + local283], local237, local241, local245);
						@Pc(421) int local421 = local400 + (local225 * (local411 - local400) >> 12);
						@Pc(431) int local431 = local389 + (local229 * (local421 - local389) >> 12);
						this.method18249(local72, local357 + (local233 * (local431 - local357) >> 12));
					}
					this.method18274();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "(III)V", line = 71)
	void method18255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(5) int[] local5 = new int[arg1];
		@Pc(8) int[] local8 = new int[arg2];
		@Pc(10) int local10;
		for (local10 = 0; local10 < arg0; local10++) {
			local2[local10] = (local10 << 12) / arg0;
		}
		for (local10 = 0; local10 < arg1; local10++) {
			local5[local10] = (local10 << 12) / arg1;
		}
		for (local10 = 0; local10 < arg2; local10++) {
			local8[local10] = (local10 << 12) / arg2;
		}
		this.method18247();
		for (@Pc(57) int local57 = 0; local57 < arg2; local57++) {
			for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
				for (@Pc(67) int local67 = 0; local67 < arg0; local67++) {
					for (@Pc(72) int local72 = 0; local72 < this.anInt2592; local72++) {
						local10 = this.aShortArray47[local72] << 12;
						@Pc(90) int local90 = this.anInt2594 * local10 >> 12;
						@Pc(97) int local97 = this.anInt2595 * local10 >> 12;
						@Pc(104) int local104 = this.anInt2596 * local10 >> 12;
						@Pc(112) int local112 = local2[local67] * local10 >> 12;
						@Pc(120) int local120 = local5[local62] * local10 >> 12;
						@Pc(128) int local128 = local8[local57] * local10 >> 12;
						@Pc(133) int local133 = local112 * this.anInt2594;
						@Pc(138) int local138 = local120 * this.anInt2595;
						@Pc(143) int local143 = local128 * this.anInt2596;
						@Pc(147) int local147 = local133 >> 12;
						@Pc(151) int local151 = local147 + 1;
						@Pc(155) int local155 = local147 & 0xFF;
						@Pc(159) int local159 = local138 >> 12;
						@Pc(163) int local163 = local159 + 1;
						@Pc(167) int local167 = local159 & 0xFF;
						@Pc(171) int local171 = local143 >> 12;
						@Pc(175) int local175 = local171 + 1;
						@Pc(179) int local179 = local171 & 0xFF;
						if (local151 >= local90) {
							local151 = 0;
						} else {
							local151 &= 0xFF;
						}
						if (local163 >= local97) {
							local163 = 0;
						} else {
							local163 &= 0xFF;
						}
						if (local175 >= local104) {
							local175 = 0;
						} else {
							local175 &= 0xFF;
						}
						local112 = local133 & 0xFFF;
						local120 = local138 & 0xFFF;
						local128 = local143 & 0xFFF;
						@Pc(225) int local225 = anIntArray257[local112];
						@Pc(229) int local229 = anIntArray257[local120];
						@Pc(233) int local233 = anIntArray257[local128];
						@Pc(237) int local237 = local112 - 4096;
						@Pc(241) int local241 = local120 - 4096;
						@Pc(245) int local245 = local128 - 4096;
						@Pc(250) short local250 = this.aShortArray48[local179];
						@Pc(255) short local255 = this.aShortArray48[local175];
						@Pc(262) short local262 = this.aShortArray48[local167 + local250];
						@Pc(269) short local269 = this.aShortArray48[local163 + local250];
						@Pc(276) short local276 = this.aShortArray48[local167 + local255];
						@Pc(283) short local283 = this.aShortArray48[local163 + local255];
						@Pc(294) int local294 = method18251(this.aShortArray48[local155 + local262], local112, local120, local128);
						@Pc(305) int local305 = method18251(this.aShortArray48[local151 + local262], local237, local120, local128);
						@Pc(315) int local315 = local294 + (local225 * (local305 - local294) >> 12);
						@Pc(326) int local326 = method18251(this.aShortArray48[local155 + local269], local112, local241, local128);
						@Pc(337) int local337 = method18251(this.aShortArray48[local151 + local269], local237, local241, local128);
						@Pc(347) int local347 = local326 + (local225 * (local337 - local326) >> 12);
						@Pc(357) int local357 = local315 + (local229 * (local347 - local315) >> 12);
						@Pc(368) int local368 = method18251(this.aShortArray48[local155 + local276], local112, local120, local245);
						@Pc(379) int local379 = method18251(this.aShortArray48[local151 + local276], local237, local120, local245);
						@Pc(389) int local389 = local368 + (local225 * (local379 - local368) >> 12);
						@Pc(400) int local400 = method18251(this.aShortArray48[local155 + local283], local112, local241, local245);
						@Pc(411) int local411 = method18251(this.aShortArray48[local151 + local283], local237, local241, local245);
						@Pc(421) int local421 = local400 + (local225 * (local411 - local400) >> 12);
						@Pc(431) int local431 = local389 + (local229 * (local421 - local389) >> 12);
						this.method18249(local72, local357 + (local233 * (local431 - local357) >> 12));
					}
					this.method18274();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(III)V", line = 71)
	void method18257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(5) int[] local5 = new int[arg1];
		@Pc(8) int[] local8 = new int[arg2];
		@Pc(10) int local10;
		for (local10 = 0; local10 < arg0; local10++) {
			local2[local10] = (local10 << 12) / arg0;
		}
		for (local10 = 0; local10 < arg1; local10++) {
			local5[local10] = (local10 << 12) / arg1;
		}
		for (local10 = 0; local10 < arg2; local10++) {
			local8[local10] = (local10 << 12) / arg2;
		}
		this.method18247();
		for (@Pc(57) int local57 = 0; local57 < arg2; local57++) {
			for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
				for (@Pc(67) int local67 = 0; local67 < arg0; local67++) {
					for (@Pc(72) int local72 = 0; local72 < this.anInt2592; local72++) {
						local10 = this.aShortArray47[local72] << 12;
						@Pc(90) int local90 = this.anInt2594 * local10 >> 12;
						@Pc(97) int local97 = this.anInt2595 * local10 >> 12;
						@Pc(104) int local104 = this.anInt2596 * local10 >> 12;
						@Pc(112) int local112 = local2[local67] * local10 >> 12;
						@Pc(120) int local120 = local5[local62] * local10 >> 12;
						@Pc(128) int local128 = local8[local57] * local10 >> 12;
						@Pc(133) int local133 = local112 * this.anInt2594;
						@Pc(138) int local138 = local120 * this.anInt2595;
						@Pc(143) int local143 = local128 * this.anInt2596;
						@Pc(147) int local147 = local133 >> 12;
						@Pc(151) int local151 = local147 + 1;
						@Pc(155) int local155 = local147 & 0xFF;
						@Pc(159) int local159 = local138 >> 12;
						@Pc(163) int local163 = local159 + 1;
						@Pc(167) int local167 = local159 & 0xFF;
						@Pc(171) int local171 = local143 >> 12;
						@Pc(175) int local175 = local171 + 1;
						@Pc(179) int local179 = local171 & 0xFF;
						if (local151 >= local90) {
							local151 = 0;
						} else {
							local151 &= 0xFF;
						}
						if (local163 >= local97) {
							local163 = 0;
						} else {
							local163 &= 0xFF;
						}
						if (local175 >= local104) {
							local175 = 0;
						} else {
							local175 &= 0xFF;
						}
						local112 = local133 & 0xFFF;
						local120 = local138 & 0xFFF;
						local128 = local143 & 0xFFF;
						@Pc(225) int local225 = anIntArray257[local112];
						@Pc(229) int local229 = anIntArray257[local120];
						@Pc(233) int local233 = anIntArray257[local128];
						@Pc(237) int local237 = local112 - 4096;
						@Pc(241) int local241 = local120 - 4096;
						@Pc(245) int local245 = local128 - 4096;
						@Pc(250) short local250 = this.aShortArray48[local179];
						@Pc(255) short local255 = this.aShortArray48[local175];
						@Pc(262) short local262 = this.aShortArray48[local167 + local250];
						@Pc(269) short local269 = this.aShortArray48[local163 + local250];
						@Pc(276) short local276 = this.aShortArray48[local167 + local255];
						@Pc(283) short local283 = this.aShortArray48[local163 + local255];
						@Pc(294) int local294 = method18251(this.aShortArray48[local155 + local262], local112, local120, local128);
						@Pc(305) int local305 = method18251(this.aShortArray48[local151 + local262], local237, local120, local128);
						@Pc(315) int local315 = local294 + (local225 * (local305 - local294) >> 12);
						@Pc(326) int local326 = method18251(this.aShortArray48[local155 + local269], local112, local241, local128);
						@Pc(337) int local337 = method18251(this.aShortArray48[local151 + local269], local237, local241, local128);
						@Pc(347) int local347 = local326 + (local225 * (local337 - local326) >> 12);
						@Pc(357) int local357 = local315 + (local229 * (local347 - local315) >> 12);
						@Pc(368) int local368 = method18251(this.aShortArray48[local155 + local276], local112, local120, local245);
						@Pc(379) int local379 = method18251(this.aShortArray48[local151 + local276], local237, local120, local245);
						@Pc(389) int local389 = local368 + (local225 * (local379 - local368) >> 12);
						@Pc(400) int local400 = method18251(this.aShortArray48[local155 + local283], local112, local241, local245);
						@Pc(411) int local411 = method18251(this.aShortArray48[local151 + local283], local237, local241, local245);
						@Pc(421) int local421 = local400 + (local225 * (local411 - local400) >> 12);
						@Pc(431) int local431 = local389 + (local229 * (local421 - local389) >> 12);
						this.method18249(local72, local357 + (local233 * (local431 - local357) >> 12));
					}
					this.method18274();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)V", line = 71)
	void method18259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(5) int[] local5 = new int[arg1];
		@Pc(8) int[] local8 = new int[arg2];
		@Pc(10) int local10;
		for (local10 = 0; local10 < arg0; local10++) {
			local2[local10] = (local10 << 12) / arg0;
		}
		for (local10 = 0; local10 < arg1; local10++) {
			local5[local10] = (local10 << 12) / arg1;
		}
		for (local10 = 0; local10 < arg2; local10++) {
			local8[local10] = (local10 << 12) / arg2;
		}
		this.method18247();
		for (@Pc(57) int local57 = 0; local57 < arg2; local57++) {
			for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
				for (@Pc(67) int local67 = 0; local67 < arg0; local67++) {
					for (@Pc(72) int local72 = 0; local72 < this.anInt2592; local72++) {
						local10 = this.aShortArray47[local72] << 12;
						@Pc(90) int local90 = this.anInt2594 * local10 >> 12;
						@Pc(97) int local97 = this.anInt2595 * local10 >> 12;
						@Pc(104) int local104 = this.anInt2596 * local10 >> 12;
						@Pc(112) int local112 = local2[local67] * local10 >> 12;
						@Pc(120) int local120 = local5[local62] * local10 >> 12;
						@Pc(128) int local128 = local8[local57] * local10 >> 12;
						@Pc(133) int local133 = local112 * this.anInt2594;
						@Pc(138) int local138 = local120 * this.anInt2595;
						@Pc(143) int local143 = local128 * this.anInt2596;
						@Pc(147) int local147 = local133 >> 12;
						@Pc(151) int local151 = local147 + 1;
						@Pc(155) int local155 = local147 & 0xFF;
						@Pc(159) int local159 = local138 >> 12;
						@Pc(163) int local163 = local159 + 1;
						@Pc(167) int local167 = local159 & 0xFF;
						@Pc(171) int local171 = local143 >> 12;
						@Pc(175) int local175 = local171 + 1;
						@Pc(179) int local179 = local171 & 0xFF;
						if (local151 >= local90) {
							local151 = 0;
						} else {
							local151 &= 0xFF;
						}
						if (local163 >= local97) {
							local163 = 0;
						} else {
							local163 &= 0xFF;
						}
						if (local175 >= local104) {
							local175 = 0;
						} else {
							local175 &= 0xFF;
						}
						local112 = local133 & 0xFFF;
						local120 = local138 & 0xFFF;
						local128 = local143 & 0xFFF;
						@Pc(225) int local225 = anIntArray257[local112];
						@Pc(229) int local229 = anIntArray257[local120];
						@Pc(233) int local233 = anIntArray257[local128];
						@Pc(237) int local237 = local112 - 4096;
						@Pc(241) int local241 = local120 - 4096;
						@Pc(245) int local245 = local128 - 4096;
						@Pc(250) short local250 = this.aShortArray48[local179];
						@Pc(255) short local255 = this.aShortArray48[local175];
						@Pc(262) short local262 = this.aShortArray48[local167 + local250];
						@Pc(269) short local269 = this.aShortArray48[local163 + local250];
						@Pc(276) short local276 = this.aShortArray48[local167 + local255];
						@Pc(283) short local283 = this.aShortArray48[local163 + local255];
						@Pc(294) int local294 = method18251(this.aShortArray48[local155 + local262], local112, local120, local128);
						@Pc(305) int local305 = method18251(this.aShortArray48[local151 + local262], local237, local120, local128);
						@Pc(315) int local315 = local294 + (local225 * (local305 - local294) >> 12);
						@Pc(326) int local326 = method18251(this.aShortArray48[local155 + local269], local112, local241, local128);
						@Pc(337) int local337 = method18251(this.aShortArray48[local151 + local269], local237, local241, local128);
						@Pc(347) int local347 = local326 + (local225 * (local337 - local326) >> 12);
						@Pc(357) int local357 = local315 + (local229 * (local347 - local315) >> 12);
						@Pc(368) int local368 = method18251(this.aShortArray48[local155 + local276], local112, local120, local245);
						@Pc(379) int local379 = method18251(this.aShortArray48[local151 + local276], local237, local120, local245);
						@Pc(389) int local389 = local368 + (local225 * (local379 - local368) >> 12);
						@Pc(400) int local400 = method18251(this.aShortArray48[local155 + local283], local112, local241, local245);
						@Pc(411) int local411 = method18251(this.aShortArray48[local151 + local283], local237, local241, local245);
						@Pc(421) int local421 = local400 + (local225 * (local411 - local400) >> 12);
						@Pc(431) int local431 = local389 + (local229 * (local421 - local389) >> 12);
						this.method18249(local72, local357 + (local233 * (local431 - local357) >> 12));
					}
					this.method18274();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "()V", line = 149)
	void method18248() {
		this.aShortArray47 = new short[this.anInt2592];
		for (@Pc(6) int local6 = 0; local6 < this.anInt2592; local6++) {
			this.aShortArray47[local6] = (short) Math.pow(2.0D, (double) local6);
		}
	}

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "()V", line = 149)
	void method18250() {
		this.aShortArray47 = new short[this.anInt2592];
		for (@Pc(6) int local6 = 0; local6 < this.anInt2592; local6++) {
			this.aShortArray47[local6] = (short) Math.pow(2.0D, (double) local6);
		}
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "()V", line = 149)
	void method18263() {
		this.aShortArray47 = new short[this.anInt2592];
		for (@Pc(6) int local6 = 0; local6 < this.anInt2592; local6++) {
			this.aShortArray47[local6] = (short) Math.pow(2.0D, (double) local6);
		}
	}

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "()V", line = 149)
	void method18265() {
		this.aShortArray47 = new short[this.anInt2592];
		for (@Pc(6) int local6 = 0; local6 < this.anInt2592; local6++) {
			this.aShortArray47[local6] = (short) Math.pow(2.0D, (double) local6);
		}
	}

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "(IIII)I", line = 156)
	static int method18251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "(IIII)I", line = 156)
	static int method18254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "(IIII)I", line = 156)
	static int method18264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "(IIII)I", line = 156)
	static int method18266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "(IIII)I", line = 156)
	static int method18272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 & 0xF;
		@Pc(10) int local10 = local3 < 8 ? arg1 : arg2;
		@Pc(25) int local25 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg1 : arg3;
		return ((local3 & 0x1) == 0 ? local10 : -local10) + ((local3 & 0x2) == 0 ? local25 : -local25);
	}

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "()V", line = 163)
	void method18252() {
		@Pc(6) Random local6 = new Random((long) this.anInt2590);
		@Pc(8) int local8;
		for (local8 = 0; local8 < 255; local8++) {
			this.aShortArray48[local8] = (short) local8;
		}
		for (local8 = 0; local8 < 255; local8++) {
			@Pc(28) int local28 = 255 - local8;
			@Pc(33) int local33 = Class301.method25665(local6, local28);
			@Pc(38) short local38 = this.aShortArray48[local33];
			this.aShortArray48[local33] = this.aShortArray48[local28];
			this.aShortArray48[local28] = this.aShortArray48[local28 + 256] = local38;
		}
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "()V", line = 163)
	void method18256() {
		@Pc(6) Random local6 = new Random((long) this.anInt2590);
		@Pc(8) int local8;
		for (local8 = 0; local8 < 255; local8++) {
			this.aShortArray48[local8] = (short) local8;
		}
		for (local8 = 0; local8 < 255; local8++) {
			@Pc(28) int local28 = 255 - local8;
			@Pc(33) int local33 = Class301.method25665(local6, local28);
			@Pc(38) short local38 = this.aShortArray48[local33];
			this.aShortArray48[local33] = this.aShortArray48[local28];
			this.aShortArray48[local28] = this.aShortArray48[local28 + 256] = local38;
		}
	}

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "()V", line = 163)
	void method18269() {
		@Pc(6) Random local6 = new Random((long) this.anInt2590);
		@Pc(8) int local8;
		for (local8 = 0; local8 < 255; local8++) {
			this.aShortArray48[local8] = (short) local8;
		}
		for (local8 = 0; local8 < 255; local8++) {
			@Pc(28) int local28 = 255 - local8;
			@Pc(33) int local33 = Class301.method25665(local6, local28);
			@Pc(38) short local38 = this.aShortArray48[local33];
			this.aShortArray48[local33] = this.aShortArray48[local28];
			this.aShortArray48[local28] = this.aShortArray48[local28 + 256] = local38;
		}
	}

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "(I)I", line = 177)
	static final int method18253(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (local15 * arg0 >> 12) + 40960;
		return local23 * local9 >> 12;
	}

	@OriginalMember(owner = "client!lp", name = "ak", descriptor = "(I)I", line = 177)
	static final int method18267(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (local15 * arg0 >> 12) + 40960;
		return local23 * local9 >> 12;
	}

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "(I)I", line = 177)
	static final int method18268(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (local15 * arg0 >> 12) + 40960;
		return local23 * local9 >> 12;
	}

	@OriginalMember(owner = "client!lp", name = "af", descriptor = "(I)I", line = 177)
	static final int method18271(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (local15 * arg0 >> 12) + 40960;
		return local23 * local9 >> 12;
	}

	@OriginalMember(owner = "client!lp", name = "at", descriptor = "(I)I", line = 177)
	static final int method18273(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(15) int local15 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (local15 * arg0 >> 12) + 40960;
		return local23 * local9 >> 12;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "()V")
	abstract void method18247();

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "(II)V")
	abstract void method18249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "()V")
	abstract void method18258();

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "()V")
	abstract void method18260();

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "(II)V")
	abstract void method18261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "(II)V")
	abstract void method18262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "()V")
	abstract void method18270();

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "()V")
	abstract void method18274();
}
