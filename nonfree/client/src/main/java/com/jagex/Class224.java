package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public class Class224 {

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
	public int anInt3744;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public int anInt3745;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
	public int anInt3746;

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
	public int anInt3747;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public int anInt3748;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "Z")
	public boolean aBoolean644 = false;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "(II)Z", line = 18)
	public boolean method25773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean644) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3748 - this.anInt3745;
		@Pc(16) int local16 = this.anInt3747 - this.anInt3746;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3745 * local10 + this.anInt3746 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3745 - arg0;
			local54 = this.anInt3746 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3744 * this.anInt3744;
		} else if (local42 > local24) {
			local49 = this.anInt3748 - arg0;
			local54 = this.anInt3747 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3744 * this.anInt3744;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3745 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3746 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3744 * this.anInt3744;
		}
	}

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "(II)Z", line = 18)
	public boolean method25774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean644) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3748 - this.anInt3745;
		@Pc(16) int local16 = this.anInt3747 - this.anInt3746;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - (this.anInt3745 * local10 + this.anInt3746 * local16);
		@Pc(54) int local54;
		@Pc(49) int local49;
		if (local42 <= 0) {
			local49 = this.anInt3745 - arg0;
			local54 = this.anInt3746 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3744 * this.anInt3744;
		} else if (local42 > local24) {
			local49 = this.anInt3748 - arg0;
			local54 = this.anInt3747 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3744 * this.anInt3744;
		} else {
			@Pc(103) byte local103 = 10;
			if (local42 != (local42 & 0x1FFFFF)) {
				local103 = 5;
			}
			local42 = (local42 << local103) / local24;
			local54 = this.anInt3745 + (local10 * local42 >> local103) - arg0;
			@Pc(138) int local138 = this.anInt3746 + (local16 * local42 >> local103) - arg1;
			return local54 * local54 + local138 * local138 < this.anInt3744 * this.anInt3744;
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(Lclient!oh;Lclient!oi;Lclient!oi;FFFF)V", line = 49)
	public void method25775(@OriginalArg(0) Class441 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) Class442 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean644 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat271 + arg0.aFloat272) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat269 + arg0.aFloat273) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat270;
		@Pc(59) float local59 = arg2.aFloatArray109[0] * (float) local13 + arg2.aFloatArray109[4] * (float) local28 + arg2.aFloatArray109[8] * (float) local22 + arg2.aFloatArray109[12];
		@Pc(88) float local88 = arg2.aFloatArray109[1] * (float) local13 + arg2.aFloatArray109[5] * (float) local28 + arg2.aFloatArray109[9] * (float) local22 + arg2.aFloatArray109[13];
		@Pc(117) float local117 = arg2.aFloatArray109[2] * (float) local13 + arg2.aFloatArray109[6] * (float) local28 + arg2.aFloatArray109[10] * (float) local22 + arg2.aFloatArray109[14];
		@Pc(146) float local146 = arg2.aFloatArray109[3] * (float) local13 + arg2.aFloatArray109[7] * (float) local28 + arg2.aFloatArray109[11] * (float) local22 + arg2.aFloatArray109[15];
		if (local117 >= -local146) {
			this.anInt3745 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3746 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat274;
		@Pc(211) float local211 = arg2.aFloatArray109[0] * (float) local13 + arg2.aFloatArray109[4] * (float) local28 + arg2.aFloatArray109[8] * (float) local22 + arg2.aFloatArray109[12];
		@Pc(240) float local240 = arg2.aFloatArray109[1] * (float) local13 + arg2.aFloatArray109[5] * (float) local28 + arg2.aFloatArray109[9] * (float) local22 + arg2.aFloatArray109[13];
		@Pc(269) float local269 = arg2.aFloatArray109[2] * (float) local13 + arg2.aFloatArray109[6] * (float) local28 + arg2.aFloatArray109[10] * (float) local22 + arg2.aFloatArray109[14];
		@Pc(298) float local298 = arg2.aFloatArray109[3] * (float) local13 + arg2.aFloatArray109[7] * (float) local28 + arg2.aFloatArray109[11] * (float) local22 + arg2.aFloatArray109[15];
		if (local269 >= -local298) {
			this.anInt3748 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3747 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean644 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3745 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3746 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3748 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3747 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean644) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat272 - arg0.aFloat271), 2.0D) + Math.pow((double) (arg0.aFloat273 - arg0.aFloat269), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray109[0] * local357 + arg1.aFloatArray109[12];
			local373 = local146 + arg1.aFloatArray109[3] * local357 + arg1.aFloatArray109[15];
			this.anInt3744 = (int) (arg3 - (float) this.anInt3745 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray109[0] * local357 + arg1.aFloatArray109[12];
			local373 = local298 + arg1.aFloatArray109[3] * local357 + arg1.aFloatArray109[15];
			this.anInt3744 = (int) (arg3 - (float) this.anInt3748 + arg5 * local365 / local373);
		}
		this.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "(Lclient!oh;Lclient!oi;Lclient!oi;FFFF)V", line = 49)
	public void method25776(@OriginalArg(0) Class441 arg0, @OriginalArg(1) Class442 arg1, @OriginalArg(2) Class442 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(1) boolean local1 = false;
		this.aBoolean644 = true;
		@Pc(13) int local13 = (int) (arg0.aFloat271 + arg0.aFloat272) >> 1;
		@Pc(22) int local22 = (int) (arg0.aFloat269 + arg0.aFloat273) >> 1;
		@Pc(28) int local28 = (int) arg0.aFloat270;
		@Pc(59) float local59 = arg2.aFloatArray109[0] * (float) local13 + arg2.aFloatArray109[4] * (float) local28 + arg2.aFloatArray109[8] * (float) local22 + arg2.aFloatArray109[12];
		@Pc(88) float local88 = arg2.aFloatArray109[1] * (float) local13 + arg2.aFloatArray109[5] * (float) local28 + arg2.aFloatArray109[9] * (float) local22 + arg2.aFloatArray109[13];
		@Pc(117) float local117 = arg2.aFloatArray109[2] * (float) local13 + arg2.aFloatArray109[6] * (float) local28 + arg2.aFloatArray109[10] * (float) local22 + arg2.aFloatArray109[14];
		@Pc(146) float local146 = arg2.aFloatArray109[3] * (float) local13 + arg2.aFloatArray109[7] * (float) local28 + arg2.aFloatArray109[11] * (float) local22 + arg2.aFloatArray109[15];
		if (local117 >= -local146) {
			this.anInt3745 = (int) (arg3 + arg5 * local59 / local146);
			this.anInt3746 = (int) (arg4 + arg6 * local88 / local146);
		} else {
			local1 = true;
		}
		local28 = (int) arg0.aFloat274;
		@Pc(211) float local211 = arg2.aFloatArray109[0] * (float) local13 + arg2.aFloatArray109[4] * (float) local28 + arg2.aFloatArray109[8] * (float) local22 + arg2.aFloatArray109[12];
		@Pc(240) float local240 = arg2.aFloatArray109[1] * (float) local13 + arg2.aFloatArray109[5] * (float) local28 + arg2.aFloatArray109[9] * (float) local22 + arg2.aFloatArray109[13];
		@Pc(269) float local269 = arg2.aFloatArray109[2] * (float) local13 + arg2.aFloatArray109[6] * (float) local28 + arg2.aFloatArray109[10] * (float) local22 + arg2.aFloatArray109[14];
		@Pc(298) float local298 = arg2.aFloatArray109[3] * (float) local13 + arg2.aFloatArray109[7] * (float) local28 + arg2.aFloatArray109[11] * (float) local22 + arg2.aFloatArray109[15];
		if (local269 >= -local298) {
			this.anInt3748 = (int) (arg3 + arg5 * local211 / local298);
			this.anInt3747 = (int) (arg4 + arg6 * local240 / local298);
		} else {
			local1 = true;
		}
		@Pc(357) float local357;
		@Pc(365) float local365;
		@Pc(373) float local373;
		if (local1) {
			if (local117 < -local146 && local269 < -local298) {
				this.aBoolean644 = false;
			} else {
				@Pc(381) float local381;
				if (local117 < -local146) {
					local357 = (local117 + local146) / (local269 + local298) - 1.0F;
					local365 = local59 + local357 * (local211 - local59);
					local373 = local88 + local357 * (local240 - local88);
					local381 = local146 + local357 * (local298 - local146);
					this.anInt3745 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3746 = (int) (arg4 + arg6 * local373 / local381);
				} else if (local269 < -local298) {
					local357 = (local269 + local298) / (local117 + local146) - 1.0F;
					local365 = local211 + local357 * (local59 - local211);
					local373 = local240 + local357 * (local88 - local240);
					local381 = local298 + local357 * (local146 - local298);
					this.anInt3748 = (int) (arg3 + arg5 * local365 / local381);
					this.anInt3747 = (int) (arg4 + arg6 * local373 / local381);
				}
			}
		}
		if (!this.aBoolean644) {
			return;
		}
		local357 = (float) Math.sqrt(Math.pow((double) (arg0.aFloat272 - arg0.aFloat271), 2.0D) + Math.pow((double) (arg0.aFloat273 - arg0.aFloat269), 2.0D)) / 2.0F;
		if (local117 / local146 > local269 / local298) {
			local365 = local59 + arg1.aFloatArray109[0] * local357 + arg1.aFloatArray109[12];
			local373 = local146 + arg1.aFloatArray109[3] * local357 + arg1.aFloatArray109[15];
			this.anInt3744 = (int) (arg3 - (float) this.anInt3745 + arg5 * local365 / local373);
		} else {
			local365 = local211 + arg1.aFloatArray109[0] * local357 + arg1.aFloatArray109[12];
			local373 = local298 + arg1.aFloatArray109[3] * local357 + arg1.aFloatArray109[15];
			this.anInt3744 = (int) (arg3 - (float) this.anInt3748 + arg5 * local365 / local373);
		}
		this.aBoolean644 = true;
	}
}
