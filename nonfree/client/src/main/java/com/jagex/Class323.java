package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public class Class323 {

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "[F")
	static final float[] aFloatArray103 = new float[8];

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "[F")
	static final float[] aFloatArray104 = new float[8];

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "[F")
	static final float[] aFloatArray102 = new float[8];

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "F")
	public float aFloat263;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "F")
	public float aFloat264;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "F")
	public float aFloat265;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "F")
	public float aFloat266;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "F")
	public float aFloat267;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "F")
	public float aFloat268;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "(IIIILclient!mq;FFFF)Z", line = 17)
	public boolean method25988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class328 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(1) boolean local1 = false;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) float local5 = -3.4028235E38F;
		@Pc(7) float local7 = Float.MAX_VALUE;
		@Pc(9) float local9 = -3.4028235E38F;
		aFloatArray103[0] = this.aFloat267;
		aFloatArray104[0] = this.aFloat264;
		aFloatArray102[0] = this.aFloat268;
		aFloatArray103[1] = this.aFloat265;
		aFloatArray104[1] = this.aFloat264;
		aFloatArray102[1] = this.aFloat268;
		aFloatArray103[2] = this.aFloat267;
		aFloatArray104[2] = this.aFloat266;
		aFloatArray102[2] = this.aFloat268;
		aFloatArray103[3] = this.aFloat265;
		aFloatArray104[3] = this.aFloat266;
		aFloatArray102[3] = this.aFloat268;
		aFloatArray103[4] = this.aFloat267;
		aFloatArray104[4] = this.aFloat264;
		aFloatArray102[4] = this.aFloat263;
		aFloatArray103[5] = this.aFloat265;
		aFloatArray104[5] = this.aFloat264;
		aFloatArray102[5] = this.aFloat263;
		aFloatArray103[6] = this.aFloat267;
		aFloatArray104[6] = this.aFloat266;
		aFloatArray102[6] = this.aFloat263;
		aFloatArray103[7] = this.aFloat265;
		aFloatArray104[7] = this.aFloat266;
		aFloatArray102[7] = this.aFloat263;
		@Pc(131) int local131;
		for (local131 = 0; local131 < 8; local131++) {
			@Pc(138) float local138 = aFloatArray103[local131];
			@Pc(142) float local142 = aFloatArray104[local131];
			@Pc(146) float local146 = aFloatArray102[local131];
			@Pc(172) float local172 = arg4.aFloatArray106[2] * local138 + arg4.aFloatArray106[6] * local142 + arg4.aFloatArray106[10] * local146 + arg4.aFloatArray106[14];
			@Pc(198) float local198 = arg4.aFloatArray106[3] * local138 + arg4.aFloatArray106[7] * local142 + arg4.aFloatArray106[11] * local146 + arg4.aFloatArray106[15];
			if (local172 >= -local198) {
				@Pc(229) float local229 = arg4.aFloatArray106[0] * local138 + arg4.aFloatArray106[4] * local142 + arg4.aFloatArray106[8] * local146 + arg4.aFloatArray106[12];
				@Pc(255) float local255 = arg4.aFloatArray106[1] * local138 + arg4.aFloatArray106[5] * local142 + arg4.aFloatArray106[9] * local146 + arg4.aFloatArray106[13];
				@Pc(263) float local263 = arg5 + arg7 * local229 / local198;
				@Pc(271) float local271 = arg6 + arg8 * local255 / local198;
				if (local263 < local3) {
					local3 = local263;
				}
				if (local263 > local5) {
					local5 = local263;
				}
				if (local271 < local7) {
					local7 = local271;
				}
				if (local271 > local9) {
					local9 = local271;
				}
				local1 = true;
			}
		}
		local131 = arg0 + arg2;
		@Pc(307) int local307 = arg1 + arg3;
		if (local1 && (float) local131 > local3 && (float) arg0 < local5 && (float) local307 > local7 && (float) arg1 < local9) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "(IIIILclient!mq;FFFF)Z", line = 17)
	public boolean method25989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class328 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(1) boolean local1 = false;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) float local5 = -3.4028235E38F;
		@Pc(7) float local7 = Float.MAX_VALUE;
		@Pc(9) float local9 = -3.4028235E38F;
		aFloatArray103[0] = this.aFloat267;
		aFloatArray104[0] = this.aFloat264;
		aFloatArray102[0] = this.aFloat268;
		aFloatArray103[1] = this.aFloat265;
		aFloatArray104[1] = this.aFloat264;
		aFloatArray102[1] = this.aFloat268;
		aFloatArray103[2] = this.aFloat267;
		aFloatArray104[2] = this.aFloat266;
		aFloatArray102[2] = this.aFloat268;
		aFloatArray103[3] = this.aFloat265;
		aFloatArray104[3] = this.aFloat266;
		aFloatArray102[3] = this.aFloat268;
		aFloatArray103[4] = this.aFloat267;
		aFloatArray104[4] = this.aFloat264;
		aFloatArray102[4] = this.aFloat263;
		aFloatArray103[5] = this.aFloat265;
		aFloatArray104[5] = this.aFloat264;
		aFloatArray102[5] = this.aFloat263;
		aFloatArray103[6] = this.aFloat267;
		aFloatArray104[6] = this.aFloat266;
		aFloatArray102[6] = this.aFloat263;
		aFloatArray103[7] = this.aFloat265;
		aFloatArray104[7] = this.aFloat266;
		aFloatArray102[7] = this.aFloat263;
		@Pc(131) int local131;
		for (local131 = 0; local131 < 8; local131++) {
			@Pc(138) float local138 = aFloatArray103[local131];
			@Pc(142) float local142 = aFloatArray104[local131];
			@Pc(146) float local146 = aFloatArray102[local131];
			@Pc(172) float local172 = arg4.aFloatArray106[2] * local138 + arg4.aFloatArray106[6] * local142 + arg4.aFloatArray106[10] * local146 + arg4.aFloatArray106[14];
			@Pc(198) float local198 = arg4.aFloatArray106[3] * local138 + arg4.aFloatArray106[7] * local142 + arg4.aFloatArray106[11] * local146 + arg4.aFloatArray106[15];
			if (local172 >= -local198) {
				@Pc(229) float local229 = arg4.aFloatArray106[0] * local138 + arg4.aFloatArray106[4] * local142 + arg4.aFloatArray106[8] * local146 + arg4.aFloatArray106[12];
				@Pc(255) float local255 = arg4.aFloatArray106[1] * local138 + arg4.aFloatArray106[5] * local142 + arg4.aFloatArray106[9] * local146 + arg4.aFloatArray106[13];
				@Pc(263) float local263 = arg5 + arg7 * local229 / local198;
				@Pc(271) float local271 = arg6 + arg8 * local255 / local198;
				if (local263 < local3) {
					local3 = local263;
				}
				if (local263 > local5) {
					local5 = local263;
				}
				if (local271 < local7) {
					local7 = local271;
				}
				if (local271 > local9) {
					local9 = local271;
				}
				local1 = true;
			}
		}
		local131 = arg0 + arg2;
		@Pc(307) int local307 = arg1 + arg3;
		if (local1 && (float) local131 > local3 && (float) arg0 < local5 && (float) local307 > local7 && (float) arg1 < local9) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIILclient!mq;FFFF)Z", line = 17)
	public boolean method25990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class328 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(1) boolean local1 = false;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) float local5 = -3.4028235E38F;
		@Pc(7) float local7 = Float.MAX_VALUE;
		@Pc(9) float local9 = -3.4028235E38F;
		aFloatArray103[0] = this.aFloat267;
		aFloatArray104[0] = this.aFloat264;
		aFloatArray102[0] = this.aFloat268;
		aFloatArray103[1] = this.aFloat265;
		aFloatArray104[1] = this.aFloat264;
		aFloatArray102[1] = this.aFloat268;
		aFloatArray103[2] = this.aFloat267;
		aFloatArray104[2] = this.aFloat266;
		aFloatArray102[2] = this.aFloat268;
		aFloatArray103[3] = this.aFloat265;
		aFloatArray104[3] = this.aFloat266;
		aFloatArray102[3] = this.aFloat268;
		aFloatArray103[4] = this.aFloat267;
		aFloatArray104[4] = this.aFloat264;
		aFloatArray102[4] = this.aFloat263;
		aFloatArray103[5] = this.aFloat265;
		aFloatArray104[5] = this.aFloat264;
		aFloatArray102[5] = this.aFloat263;
		aFloatArray103[6] = this.aFloat267;
		aFloatArray104[6] = this.aFloat266;
		aFloatArray102[6] = this.aFloat263;
		aFloatArray103[7] = this.aFloat265;
		aFloatArray104[7] = this.aFloat266;
		aFloatArray102[7] = this.aFloat263;
		@Pc(131) int local131;
		for (local131 = 0; local131 < 8; local131++) {
			@Pc(138) float local138 = aFloatArray103[local131];
			@Pc(142) float local142 = aFloatArray104[local131];
			@Pc(146) float local146 = aFloatArray102[local131];
			@Pc(172) float local172 = arg4.aFloatArray106[2] * local138 + arg4.aFloatArray106[6] * local142 + arg4.aFloatArray106[10] * local146 + arg4.aFloatArray106[14];
			@Pc(198) float local198 = arg4.aFloatArray106[3] * local138 + arg4.aFloatArray106[7] * local142 + arg4.aFloatArray106[11] * local146 + arg4.aFloatArray106[15];
			if (local172 >= -local198) {
				@Pc(229) float local229 = arg4.aFloatArray106[0] * local138 + arg4.aFloatArray106[4] * local142 + arg4.aFloatArray106[8] * local146 + arg4.aFloatArray106[12];
				@Pc(255) float local255 = arg4.aFloatArray106[1] * local138 + arg4.aFloatArray106[5] * local142 + arg4.aFloatArray106[9] * local146 + arg4.aFloatArray106[13];
				@Pc(263) float local263 = arg5 + arg7 * local229 / local198;
				@Pc(271) float local271 = arg6 + arg8 * local255 / local198;
				if (local263 < local3) {
					local3 = local263;
				}
				if (local263 > local5) {
					local5 = local263;
				}
				if (local271 < local7) {
					local7 = local271;
				}
				if (local271 > local9) {
					local9 = local271;
				}
				local1 = true;
			}
		}
		local131 = arg0 + arg2;
		@Pc(307) int local307 = arg1 + arg3;
		if (local1 && (float) local131 > local3 && (float) arg0 < local5 && (float) local307 > local7 && (float) arg1 < local9) {
			return true;
		} else {
			return false;
		}
	}
}
