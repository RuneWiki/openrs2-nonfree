package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public class Class270 {

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	int anInt3836;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[I")
	int[] anIntArray384;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
	int anInt3837;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!gx;")
	Class288 aClass288_1;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
	int anInt3838;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	int anInt3839;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	int anInt3840;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
	int[] anIntArray385;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
	int anInt3841;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[[I")
	int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 20)
	Class270() {
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(Lclient!gx;)V", line = 23)
	void method26490(@OriginalArg(0) Class288 arg0) {
		this.aClass288_1 = arg0;
		this.anInt3841 = this.aClass288_1.method26923(16);
		this.anInt3836 = this.aClass288_1.method26923(24);
		this.anInt3837 = this.aClass288_1.method26923(24);
		this.anInt3840 = this.aClass288_1.method26923(24) + 1;
		this.anInt3838 = this.aClass288_1.method26923(6) + 1;
		this.anInt3839 = this.aClass288_1.method26923(8);
		if (this.anIntArray385 == null || this.anIntArray385.length != this.anInt3838) {
			this.anIntArray385 = new int[this.anInt3838];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3838; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass288_1.method26923(3);
			@Pc(77) boolean local77 = this.aClass288_1.method26919() != 0;
			if (local77) {
				local64 = this.aClass288_1.method26923(5);
			}
			this.anIntArray385[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray384 == null || this.anIntArray384.length != this.anInt3838 * 8) {
			this.anIntArray384 = new int[this.anInt3838 * 8];
		}
		for (local58 = 0; local58 < this.anInt3838 * 8; local58++) {
			this.anIntArray384[local58] = (this.anIntArray385[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass288_1.method26923(8);
		}
	}

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "(Lclient!gx;)V", line = 23)
	void method26491(@OriginalArg(0) Class288 arg0) {
		this.aClass288_1 = arg0;
		this.anInt3841 = this.aClass288_1.method26923(16);
		this.anInt3836 = this.aClass288_1.method26923(24);
		this.anInt3837 = this.aClass288_1.method26923(24);
		this.anInt3840 = this.aClass288_1.method26923(24) + 1;
		this.anInt3838 = this.aClass288_1.method26923(6) + 1;
		this.anInt3839 = this.aClass288_1.method26923(8);
		if (this.anIntArray385 == null || this.anIntArray385.length != this.anInt3838) {
			this.anIntArray385 = new int[this.anInt3838];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3838; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass288_1.method26923(3);
			@Pc(77) boolean local77 = this.aClass288_1.method26919() != 0;
			if (local77) {
				local64 = this.aClass288_1.method26923(5);
			}
			this.anIntArray385[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray384 == null || this.anIntArray384.length != this.anInt3838 * 8) {
			this.anIntArray384 = new int[this.anInt3838 * 8];
		}
		for (local58 = 0; local58 < this.anInt3838 * 8; local58++) {
			this.anIntArray384[local58] = (this.anIntArray385[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass288_1.method26923(8);
		}
	}

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "(Lclient!gx;)V", line = 23)
	void method26492(@OriginalArg(0) Class288 arg0) {
		this.aClass288_1 = arg0;
		this.anInt3841 = this.aClass288_1.method26923(16);
		this.anInt3836 = this.aClass288_1.method26923(24);
		this.anInt3837 = this.aClass288_1.method26923(24);
		this.anInt3840 = this.aClass288_1.method26923(24) + 1;
		this.anInt3838 = this.aClass288_1.method26923(6) + 1;
		this.anInt3839 = this.aClass288_1.method26923(8);
		if (this.anIntArray385 == null || this.anIntArray385.length != this.anInt3838) {
			this.anIntArray385 = new int[this.anInt3838];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3838; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass288_1.method26923(3);
			@Pc(77) boolean local77 = this.aClass288_1.method26919() != 0;
			if (local77) {
				local64 = this.aClass288_1.method26923(5);
			}
			this.anIntArray385[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray384 == null || this.anIntArray384.length != this.anInt3838 * 8) {
			this.anIntArray384 = new int[this.anInt3838 * 8];
		}
		for (local58 = 0; local58 < this.anInt3838 * 8; local58++) {
			this.anIntArray384[local58] = (this.anIntArray385[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass288_1.method26923(8);
		}
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(Lclient!gx;)V", line = 23)
	void method26493(@OriginalArg(0) Class288 arg0) {
		this.aClass288_1 = arg0;
		this.anInt3841 = this.aClass288_1.method26923(16);
		this.anInt3836 = this.aClass288_1.method26923(24);
		this.anInt3837 = this.aClass288_1.method26923(24);
		this.anInt3840 = this.aClass288_1.method26923(24) + 1;
		this.anInt3838 = this.aClass288_1.method26923(6) + 1;
		this.anInt3839 = this.aClass288_1.method26923(8);
		if (this.anIntArray385 == null || this.anIntArray385.length != this.anInt3838) {
			this.anIntArray385 = new int[this.anInt3838];
		}
		@Pc(58) int local58;
		for (local58 = 0; local58 < this.anInt3838; local58++) {
			@Pc(64) int local64 = 0;
			@Pc(69) int local69 = this.aClass288_1.method26923(3);
			@Pc(77) boolean local77 = this.aClass288_1.method26919() != 0;
			if (local77) {
				local64 = this.aClass288_1.method26923(5);
			}
			this.anIntArray385[local58] = local64 << 3 | local69;
		}
		if (this.anIntArray384 == null || this.anIntArray384.length != this.anInt3838 * 8) {
			this.anIntArray384 = new int[this.anInt3838 * 8];
		}
		for (local58 = 0; local58 < this.anInt3838 * 8; local58++) {
			this.anIntArray384[local58] = (this.anIntArray385[local58 >> 3] & 0x1 << (local58 & 0x7)) == 0 ? -1 : this.aClass288_1.method26923(8);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "([I)V", line = 49)
	void method26494(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "([I)V", line = 49)
	void method26495(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "([Lclient!gd;I[Z)[Lclient!gd;", line = 56)
	Class269[] method26496(@OriginalArg(0) Class269[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2) {
		@Pc(2) int local2 = arg0.length;
		@Pc(4) int local4;
		@Pc(13) int local13;
		for (local4 = 0; local4 < local2; local4++) {
			if (!arg2[local4]) {
				for (local13 = 0; local13 < arg1; local13++) {
					arg0[local4].aFloatArray99[local13] = 0.0F;
				}
			}
		}
		local4 = this.aClass288_1.aClass286Array2[this.anInt3839].anInt3970;
		local13 = this.anInt3837 - this.anInt3836;
		@Pc(46) int local46 = local13 / this.anInt3840;
		@Pc(69) int local69;
		if (this.anIntArrayArray45 != null && this.anIntArrayArray45.length == local2 && this.anIntArrayArray45[0].length == local46) {
			for (local69 = 0; local69 < local2; local69++) {
				this.method26494(this.anIntArrayArray45[local69]);
			}
		} else {
			this.anIntArrayArray45 = new int[local2][local46];
		}
		for (local69 = 0; local69 < 8; local69++) {
			@Pc(87) int local87 = 0;
			while (local87 < local46) {
				@Pc(94) int local94;
				@Pc(111) int local111;
				@Pc(115) int local115;
				if (local69 == 0) {
					for (local94 = 0; local94 < local2; local94++) {
						if (!arg2[local94]) {
							local111 = this.aClass288_1.aClass286Array2[this.anInt3839].method26739(this.aClass288_1);
							for (local115 = local4 - 1; local115 >= 0; local115--) {
								if (local87 + local115 < local46) {
									this.anIntArrayArray45[local94][local87 + local115] = local111 % this.anInt3838;
								}
								local111 /= this.anInt3838;
							}
						}
					}
				}
				for (local94 = 0; local94 < local4; local94++) {
					for (local111 = 0; local111 < local2; local111++) {
						if (!arg2[local111]) {
							local115 = this.anIntArrayArray45[local111][local87];
							@Pc(173) int local173 = this.anIntArray384[local115 * 8 + local69];
							if (local173 >= 0) {
								@Pc(183) int local183 = this.anInt3836 + local87 * this.anInt3840;
								@Pc(189) Class286 local189 = this.aClass288_1.aClass286Array2[local173];
								@Pc(198) int local198;
								if (this.anInt3841 == 0) {
									local198 = this.anInt3840 / local189.anInt3970;
									for (@Pc(200) int local200 = 0; local200 < local198; local200++) {
										@Pc(208) float[] local208 = local189.method26743(this.aClass288_1);
										for (@Pc(210) int local210 = 0; local210 < local189.anInt3970; local210++) {
											arg0[local111].aFloatArray99[local183 + local200 + local210 * local198] += local208[local210];
										}
									}
								} else if (this.anInt3841 == 1 || this.anInt3841 == 2) {
									local198 = 0;
									while (local198 < this.anInt3840) {
										@Pc(256) float[] local256 = local189.method26743(this.aClass288_1);
										for (@Pc(258) int local258 = 0; local258 < local189.anInt3970; local258++) {
											arg0[local111].aFloatArray99[local183 + local198] += local256[local258];
											local198++;
										}
									}
								}
							}
						}
					}
					local87++;
					if (local87 >= local46) {
						break;
					}
				}
			}
		}
		return arg0;
	}
}
