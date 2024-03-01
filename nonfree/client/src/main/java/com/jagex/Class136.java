package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public class Class136 {

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	public int anInt3400;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "I")
	public int anInt3401;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	public int anInt3402;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	public int anInt3403;

	@OriginalMember(owner = "client!du", name = "x", descriptor = "I")
	public int anInt3404;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "Z")
	public boolean aBoolean621 = false;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "(II)Z", line = 18)
	public boolean method22927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean621) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3403 - this.anInt3401;
		@Pc(16) int local16 = this.anInt3402 - this.anInt3400;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3401 * local10 + this.anInt3400 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3401 - arg0;
			local54 = this.anInt3400 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3404 * this.anInt3404;
		} else if (local42 > local24) {
			local49 = this.anInt3403 - arg0;
			local54 = this.anInt3402 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3404 * this.anInt3404;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3401 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3400 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3404 * this.anInt3404;
		}
	}

	@OriginalMember(owner = "client!du", name = "g", descriptor = "(II)Z", line = 18)
	public boolean method22930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean621) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3403 - this.anInt3401;
		@Pc(16) int local16 = this.anInt3402 - this.anInt3400;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3401 * local10 + this.anInt3400 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3401 - arg0;
			local54 = this.anInt3400 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3404 * this.anInt3404;
		} else if (local42 > local24) {
			local49 = this.anInt3403 - arg0;
			local54 = this.anInt3402 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3404 * this.anInt3404;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3401 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3400 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3404 * this.anInt3404;
		}
	}

	@OriginalMember(owner = "client!du", name = "p", descriptor = "(II)Z", line = 18)
	public boolean method22931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean621) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3403 - this.anInt3401;
		@Pc(16) int local16 = this.anInt3402 - this.anInt3400;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3401 * local10 + this.anInt3400 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3401 - arg0;
			local54 = this.anInt3400 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3404 * this.anInt3404;
		} else if (local42 > local24) {
			local49 = this.anInt3403 - arg0;
			local54 = this.anInt3402 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3404 * this.anInt3404;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3401 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3400 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3404 * this.anInt3404;
		}
	}

	@OriginalMember(owner = "client!du", name = "l", descriptor = "(II)Z", line = 18)
	public boolean method22932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean621) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3403 - this.anInt3401;
		@Pc(16) int local16 = this.anInt3402 - this.anInt3400;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3401 * local10 + this.anInt3400 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3401 - arg0;
			local54 = this.anInt3400 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3404 * this.anInt3404;
		} else if (local42 > local24) {
			local49 = this.anInt3403 - arg0;
			local54 = this.anInt3402 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3404 * this.anInt3404;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3401 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3400 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3404 * this.anInt3404;
		}
	}

	@OriginalMember(owner = "client!du", name = "u", descriptor = "(Lclient!mk;Lclient!mq;Lclient!mq;FFFF)V", line = 49)
	public void method22928(@OriginalArg(0) Class323 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean621 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat267 + arg0.aFloat265) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat268 + arg0.aFloat263) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat264;
		@Pc(59) float local59 = arg2.aFloatArray106[0] * (float) local13 + arg2.aFloatArray106[4] * (float) local28 + arg2.aFloatArray106[8] * (float) local22 + arg2.aFloatArray106[12];
		@Pc(88) float local88 = arg2.aFloatArray106[1] * (float) local13 + arg2.aFloatArray106[5] * (float) local28 + arg2.aFloatArray106[9] * (float) local22 + arg2.aFloatArray106[13];
		@Pc(117) float local117 = arg2.aFloatArray106[2] * (float) local13 + arg2.aFloatArray106[6] * (float) local28 + arg2.aFloatArray106[10] * (float) local22 + arg2.aFloatArray106[14];
		@Pc(146) float local146 = arg2.aFloatArray106[3] * (float) local13 + arg2.aFloatArray106[7] * (float) local28 + arg2.aFloatArray106[11] * (float) local22 + arg2.aFloatArray106[15];
		if (local117 >= -local146) {
			this.anInt3401 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3400 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat266;
		@Pc(211) float local211 = arg2.aFloatArray106[0] * (float) local13 + arg2.aFloatArray106[4] * (float) local28 + arg2.aFloatArray106[8] * (float) local22 + arg2.aFloatArray106[12];
		@Pc(240) float local240 = arg2.aFloatArray106[1] * (float) local13 + arg2.aFloatArray106[5] * (float) local28 + arg2.aFloatArray106[9] * (float) local22 + arg2.aFloatArray106[13];
		@Pc(269) float local269 = arg2.aFloatArray106[2] * (float) local13 + arg2.aFloatArray106[6] * (float) local28 + arg2.aFloatArray106[10] * (float) local22 + arg2.aFloatArray106[14];
		@Pc(298) float local298 = arg2.aFloatArray106[3] * (float) local13 + arg2.aFloatArray106[7] * (float) local28 + arg2.aFloatArray106[11] * (float) local22 + arg2.aFloatArray106[15];
		if (local269 >= -local298) {
			this.anInt3403 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3402 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean621 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3401 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3400 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3403 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3402 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean621) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat265 - arg0.aFloat267), 2.0D) + Math.pow((double) (arg0.aFloat263 - arg0.aFloat268), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray106[0] * local357 + arg1.aFloatArray106[12];
			local373 = local146 + arg1.aFloatArray106[3] * local357 + arg1.aFloatArray106[15];
			this.anInt3404 = (int) (arg3 - (float) this.anInt3401 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray106[0] * local357 + arg1.aFloatArray106[12];
			local373 = local298 + arg1.aFloatArray106[3] * local357 + arg1.aFloatArray106[15];
			this.anInt3404 = (int) (arg3 - (float) this.anInt3403 + arg5 * local365 / local373);
		}
		this.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!mk;Lclient!mq;Lclient!mq;FFFF)V", line = 49)
	public void method22929(@OriginalArg(0) Class323 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean621 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat267 + arg0.aFloat265) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat268 + arg0.aFloat263) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat264;
		@Pc(59) float local59 = arg2.aFloatArray106[0] * (float) local13 + arg2.aFloatArray106[4] * (float) local28 + arg2.aFloatArray106[8] * (float) local22 + arg2.aFloatArray106[12];
		@Pc(88) float local88 = arg2.aFloatArray106[1] * (float) local13 + arg2.aFloatArray106[5] * (float) local28 + arg2.aFloatArray106[9] * (float) local22 + arg2.aFloatArray106[13];
		@Pc(117) float local117 = arg2.aFloatArray106[2] * (float) local13 + arg2.aFloatArray106[6] * (float) local28 + arg2.aFloatArray106[10] * (float) local22 + arg2.aFloatArray106[14];
		@Pc(146) float local146 = arg2.aFloatArray106[3] * (float) local13 + arg2.aFloatArray106[7] * (float) local28 + arg2.aFloatArray106[11] * (float) local22 + arg2.aFloatArray106[15];
		if (local117 >= -local146) {
			this.anInt3401 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3400 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat266;
		@Pc(211) float local211 = arg2.aFloatArray106[0] * (float) local13 + arg2.aFloatArray106[4] * (float) local28 + arg2.aFloatArray106[8] * (float) local22 + arg2.aFloatArray106[12];
		@Pc(240) float local240 = arg2.aFloatArray106[1] * (float) local13 + arg2.aFloatArray106[5] * (float) local28 + arg2.aFloatArray106[9] * (float) local22 + arg2.aFloatArray106[13];
		@Pc(269) float local269 = arg2.aFloatArray106[2] * (float) local13 + arg2.aFloatArray106[6] * (float) local28 + arg2.aFloatArray106[10] * (float) local22 + arg2.aFloatArray106[14];
		@Pc(298) float local298 = arg2.aFloatArray106[3] * (float) local13 + arg2.aFloatArray106[7] * (float) local28 + arg2.aFloatArray106[11] * (float) local22 + arg2.aFloatArray106[15];
		if (local269 >= -local298) {
			this.anInt3403 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3402 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean621 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3401 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3400 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3403 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3402 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean621) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat265 - arg0.aFloat267), 2.0D) + Math.pow((double) (arg0.aFloat263 - arg0.aFloat268), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray106[0] * local357 + arg1.aFloatArray106[12];
			local373 = local146 + arg1.aFloatArray106[3] * local357 + arg1.aFloatArray106[15];
			this.anInt3404 = (int) (arg3 - (float) this.anInt3401 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray106[0] * local357 + arg1.aFloatArray106[12];
			local373 = local298 + arg1.aFloatArray106[3] * local357 + arg1.aFloatArray106[15];
			this.anInt3404 = (int) (arg3 - (float) this.anInt3403 + arg5 * local365 / local373);
		}
		this.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!du", name = "x", descriptor = "(Lclient!mk;Lclient!mq;Lclient!mq;FFFF)V", line = 49)
	public void method22933(@OriginalArg(0) Class323 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean621 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat267 + arg0.aFloat265) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat268 + arg0.aFloat263) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat264;
		@Pc(59) float local59 = arg2.aFloatArray106[0] * (float) local13 + arg2.aFloatArray106[4] * (float) local28 + arg2.aFloatArray106[8] * (float) local22 + arg2.aFloatArray106[12];
		@Pc(88) float local88 = arg2.aFloatArray106[1] * (float) local13 + arg2.aFloatArray106[5] * (float) local28 + arg2.aFloatArray106[9] * (float) local22 + arg2.aFloatArray106[13];
		@Pc(117) float local117 = arg2.aFloatArray106[2] * (float) local13 + arg2.aFloatArray106[6] * (float) local28 + arg2.aFloatArray106[10] * (float) local22 + arg2.aFloatArray106[14];
		@Pc(146) float local146 = arg2.aFloatArray106[3] * (float) local13 + arg2.aFloatArray106[7] * (float) local28 + arg2.aFloatArray106[11] * (float) local22 + arg2.aFloatArray106[15];
		if (local117 >= -local146) {
			this.anInt3401 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3400 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat266;
		@Pc(211) float local211 = arg2.aFloatArray106[0] * (float) local13 + arg2.aFloatArray106[4] * (float) local28 + arg2.aFloatArray106[8] * (float) local22 + arg2.aFloatArray106[12];
		@Pc(240) float local240 = arg2.aFloatArray106[1] * (float) local13 + arg2.aFloatArray106[5] * (float) local28 + arg2.aFloatArray106[9] * (float) local22 + arg2.aFloatArray106[13];
		@Pc(269) float local269 = arg2.aFloatArray106[2] * (float) local13 + arg2.aFloatArray106[6] * (float) local28 + arg2.aFloatArray106[10] * (float) local22 + arg2.aFloatArray106[14];
		@Pc(298) float local298 = arg2.aFloatArray106[3] * (float) local13 + arg2.aFloatArray106[7] * (float) local28 + arg2.aFloatArray106[11] * (float) local22 + arg2.aFloatArray106[15];
		if (local269 >= -local298) {
			this.anInt3403 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3402 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean621 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3401 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3400 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3403 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3402 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean621) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat265 - arg0.aFloat267), 2.0D) + Math.pow((double) (arg0.aFloat263 - arg0.aFloat268), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray106[0] * local357 + arg1.aFloatArray106[12];
			local373 = local146 + arg1.aFloatArray106[3] * local357 + arg1.aFloatArray106[15];
			this.anInt3404 = (int) (arg3 - (float) this.anInt3401 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray106[0] * local357 + arg1.aFloatArray106[12];
			local373 = local298 + arg1.aFloatArray106[3] * local357 + arg1.aFloatArray106[15];
			this.anInt3404 = (int) (arg3 - (float) this.anInt3403 + arg5 * local365 / local373);
		}
		this.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!du", name = "s", descriptor = "(Lclient!mk;Lclient!mq;Lclient!mq;FFFF)V", line = 49)
	public void method22934(@OriginalArg(0) Class323 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class328 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean621 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat267 + arg0.aFloat265) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat268 + arg0.aFloat263) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat264;
		@Pc(59) float local59 = arg2.aFloatArray106[0] * (float) local13 + arg2.aFloatArray106[4] * (float) local28 + arg2.aFloatArray106[8] * (float) local22 + arg2.aFloatArray106[12];
		@Pc(88) float local88 = arg2.aFloatArray106[1] * (float) local13 + arg2.aFloatArray106[5] * (float) local28 + arg2.aFloatArray106[9] * (float) local22 + arg2.aFloatArray106[13];
		@Pc(117) float local117 = arg2.aFloatArray106[2] * (float) local13 + arg2.aFloatArray106[6] * (float) local28 + arg2.aFloatArray106[10] * (float) local22 + arg2.aFloatArray106[14];
		@Pc(146) float local146 = arg2.aFloatArray106[3] * (float) local13 + arg2.aFloatArray106[7] * (float) local28 + arg2.aFloatArray106[11] * (float) local22 + arg2.aFloatArray106[15];
		if (local117 >= -local146) {
			this.anInt3401 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3400 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat266;
		@Pc(211) float local211 = arg2.aFloatArray106[0] * (float) local13 + arg2.aFloatArray106[4] * (float) local28 + arg2.aFloatArray106[8] * (float) local22 + arg2.aFloatArray106[12];
		@Pc(240) float local240 = arg2.aFloatArray106[1] * (float) local13 + arg2.aFloatArray106[5] * (float) local28 + arg2.aFloatArray106[9] * (float) local22 + arg2.aFloatArray106[13];
		@Pc(269) float local269 = arg2.aFloatArray106[2] * (float) local13 + arg2.aFloatArray106[6] * (float) local28 + arg2.aFloatArray106[10] * (float) local22 + arg2.aFloatArray106[14];
		@Pc(298) float local298 = arg2.aFloatArray106[3] * (float) local13 + arg2.aFloatArray106[7] * (float) local28 + arg2.aFloatArray106[11] * (float) local22 + arg2.aFloatArray106[15];
		if (local269 >= -local298) {
			this.anInt3403 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3402 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean621 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3401 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3400 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3403 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3402 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean621) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat265 - arg0.aFloat267), 2.0D) + Math.pow((double) (arg0.aFloat263 - arg0.aFloat268), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray106[0] * local357 + arg1.aFloatArray106[12];
			local373 = local146 + arg1.aFloatArray106[3] * local357 + arg1.aFloatArray106[15];
			this.anInt3404 = (int) (arg3 - (float) this.anInt3401 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray106[0] * local357 + arg1.aFloatArray106[12];
			local373 = local298 + arg1.aFloatArray106[3] * local357 + arg1.aFloatArray106[15];
			this.anInt3404 = (int) (arg3 - (float) this.anInt3403 + arg5 * local365 / local373);
		}
		this.aBoolean621 = true;
	}
}
