package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public class Class441 {

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "[F")
	static final float[] aFloatArray106 = new float[8];

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "[F")
	static final float[] aFloatArray107 = new float[8];

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "[F")
	static final float[] aFloatArray108 = new float[8];

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "F")
	public float aFloat269;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "F")
	public float aFloat270;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "F")
	public float aFloat271;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "F")
	public float aFloat272;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "F")
	public float aFloat273;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "F")
	public float aFloat274;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "(IIIILclient!oi;FFFF)Z", line = 17)
	public boolean method28950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class442 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(1) boolean local1 = false;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) float local5 = -3.4028235E38F;
		@Pc(7) float local7 = Float.MAX_VALUE;
		@Pc(9) float local9 = -3.4028235E38F;
		aFloatArray106[0] = this.aFloat271;
		aFloatArray107[0] = this.aFloat270;
		aFloatArray108[0] = this.aFloat269;
		aFloatArray106[1] = this.aFloat272;
		aFloatArray107[1] = this.aFloat270;
		aFloatArray108[1] = this.aFloat269;
		aFloatArray106[2] = this.aFloat271;
		aFloatArray107[2] = this.aFloat274;
		aFloatArray108[2] = this.aFloat269;
		aFloatArray106[3] = this.aFloat272;
		aFloatArray107[3] = this.aFloat274;
		aFloatArray108[3] = this.aFloat269;
		aFloatArray106[4] = this.aFloat271;
		aFloatArray107[4] = this.aFloat270;
		aFloatArray108[4] = this.aFloat273;
		aFloatArray106[5] = this.aFloat272;
		aFloatArray107[5] = this.aFloat270;
		aFloatArray108[5] = this.aFloat273;
		aFloatArray106[6] = this.aFloat271;
		aFloatArray107[6] = this.aFloat274;
		aFloatArray108[6] = this.aFloat273;
		aFloatArray106[7] = this.aFloat272;
		aFloatArray107[7] = this.aFloat274;
		aFloatArray108[7] = this.aFloat273;
		@Pc(131) int local131;
		for (local131 = 0; local131 < 8; local131++) {
			@Pc(138) float local138 = aFloatArray106[local131];
			@Pc(142) float local142 = aFloatArray107[local131];
			@Pc(146) float local146 = aFloatArray108[local131];
			@Pc(172) float local172 = arg4.aFloatArray109[2] * local138 + arg4.aFloatArray109[6] * local142 + arg4.aFloatArray109[10] * local146 + arg4.aFloatArray109[14];
			@Pc(198) float local198 = arg4.aFloatArray109[3] * local138 + arg4.aFloatArray109[7] * local142 + arg4.aFloatArray109[11] * local146 + arg4.aFloatArray109[15];
			if (local172 >= -local198) {
				@Pc(229) float local229 = arg4.aFloatArray109[0] * local138 + arg4.aFloatArray109[4] * local142 + arg4.aFloatArray109[8] * local146 + arg4.aFloatArray109[12];
				@Pc(255) float local255 = arg4.aFloatArray109[1] * local138 + arg4.aFloatArray109[5] * local142 + arg4.aFloatArray109[9] * local146 + arg4.aFloatArray109[13];
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
