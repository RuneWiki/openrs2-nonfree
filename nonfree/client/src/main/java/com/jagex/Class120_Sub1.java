package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahk")
public class Class120_Sub1 extends Class120 {

	@OriginalMember(owner = "client!ahk", name = "v", descriptor = "I")
	static final int anInt1197 = 256;

	@OriginalMember(owner = "client!ahk", name = "l", descriptor = "F")
	public static float aFloat132 = 0.25F;

	@OriginalMember(owner = "client!ahk", name = "y", descriptor = "F")
	public static float aFloat130 = 1.0F;

	@OriginalMember(owner = "client!ahk", name = "w", descriptor = "F")
	public static float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!ahk", name = "t", descriptor = "F")
	public static float aFloat133 = 1.0F;

	@OriginalMember(owner = "client!ahk", name = "d", descriptor = "Lclient!hr;")
	Class105 aClass105_5;

	@OriginalMember(owner = "client!ahk", name = "q", descriptor = "Lclient!hi;")
	Class112 aClass112_5;

	@OriginalMember(owner = "client!ahk", name = "x", descriptor = "Lclient!hr;")
	Class105 aClass105_6;

	@OriginalMember(owner = "client!ahk", name = "j", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_9;

	@OriginalMember(owner = "client!ahk", name = "s", descriptor = "Lclient!hr;")
	Class105 aClass105_7;

	@OriginalMember(owner = "client!ahk", name = "f", descriptor = "Z")
	boolean aBoolean213;

	@OriginalMember(owner = "client!ahk", name = "e", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_10;

	@OriginalMember(owner = "client!ahk", name = "z", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_11;

	@OriginalMember(owner = "client!ahk", name = "g", descriptor = "Lclient!hr;")
	Class105 aClass105_8;

	@OriginalMember(owner = "client!ahk", name = "i", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_12;

	@OriginalMember(owner = "client!ahk", name = "k", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_13;

	@OriginalMember(owner = "client!ahk", name = "u", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_14;

	@OriginalMember(owner = "client!ahk", name = "r", descriptor = "Lclient!hr;")
	Class105 aClass105_9;

	@OriginalMember(owner = "client!ahk", name = "<init>", descriptor = "(Lclient!aed;)V", line = 29)
	public Class120_Sub1(@OriginalArg(0) Class86_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahk", name = "p", descriptor = "()Z", line = 33)
	@Override
	boolean method10798() {
		return this.aClass86_Sub1_23.aBoolean454 && this.aClass86_Sub1_23.method20681() && this.aClass86_Sub1_23.method20612(true);
	}

	@OriginalMember(owner = "client!ahk", name = "j", descriptor = "()Z", line = 33)
	@Override
	boolean method10815() {
		return this.aClass86_Sub1_23.aBoolean454 && this.aClass86_Sub1_23.method20681() && this.aClass86_Sub1_23.method20612(true);
	}

	@OriginalMember(owner = "client!ahk", name = "c", descriptor = "()Z", line = 37)
	@Override
	boolean method10805() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!ahk", name = "ae", descriptor = "()Z", line = 37)
	@Override
	boolean method10814() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!ahk", name = "at", descriptor = "()Z", line = 37)
	@Override
	boolean method10791() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!ahk", name = "v", descriptor = "()Z", line = 41)
	@Override
	boolean method10790() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_5 = this.aClass86_Sub1_23.method20613("FilterBloom");
		if (this.aClass112_5 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_11 = this.aClass112_5.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_9 = this.aClass112_5.method9524("bloomTex1");
			this.aClass77_Sub12_Sub1_12 = this.aClass112_5.method9524("params");
			this.aClass77_Sub12_Sub1_13 = this.aClass112_5.method9524("sampleSize");
			this.aClass77_Sub12_Sub1_14 = this.aClass112_5.method9524("pixelOffsetAndBloomScale");
			this.aClass77_Sub12_Sub1_10 = this.aClass112_5.method9524("PosAndTexCoords");
			this.aClass112_5.method9458("test");
			this.aClass105_6 = this.aClass112_5.method9458("techFullscreenTri");
			this.aClass105_5 = this.aClass112_5.method9458("brightpass");
			this.aClass105_7 = this.aClass112_5.method9458("blur");
			this.aClass105_9 = this.aClass112_5.method9458("composite");
			this.aClass105_8 = this.aClass112_5.method9458("techDefault");
		} catch (@Pc(98) Exception_Sub3_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub3_Sub2 local101) {
			return false;
		}
		if (!this.aClass105_6.method9595()) {
			return false;
		} else if (!this.aClass105_5.method9595()) {
			return false;
		} else if (!this.aClass105_7.method9595()) {
			return false;
		} else if (!this.aClass105_9.method9595()) {
			return false;
		} else if (this.aClass105_8.method9595()) {
			this.aBoolean213 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahk", name = "i", descriptor = "()Z", line = 41)
	@Override
	boolean method10813() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_5 = this.aClass86_Sub1_23.method20613("FilterBloom");
		if (this.aClass112_5 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_11 = this.aClass112_5.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_9 = this.aClass112_5.method9524("bloomTex1");
			this.aClass77_Sub12_Sub1_12 = this.aClass112_5.method9524("params");
			this.aClass77_Sub12_Sub1_13 = this.aClass112_5.method9524("sampleSize");
			this.aClass77_Sub12_Sub1_14 = this.aClass112_5.method9524("pixelOffsetAndBloomScale");
			this.aClass77_Sub12_Sub1_10 = this.aClass112_5.method9524("PosAndTexCoords");
			this.aClass112_5.method9458("test");
			this.aClass105_6 = this.aClass112_5.method9458("techFullscreenTri");
			this.aClass105_5 = this.aClass112_5.method9458("brightpass");
			this.aClass105_7 = this.aClass112_5.method9458("blur");
			this.aClass105_9 = this.aClass112_5.method9458("composite");
			this.aClass105_8 = this.aClass112_5.method9458("techDefault");
		} catch (@Pc(98) Exception_Sub3_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub3_Sub2 local101) {
			return false;
		}
		if (!this.aClass105_6.method9595()) {
			return false;
		} else if (!this.aClass105_5.method9595()) {
			return false;
		} else if (!this.aClass105_7.method9595()) {
			return false;
		} else if (!this.aClass105_9.method9595()) {
			return false;
		} else if (this.aClass105_8.method9595()) {
			this.aBoolean213 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahk", name = "u", descriptor = "()Z", line = 41)
	@Override
	boolean method10800() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_5 = this.aClass86_Sub1_23.method20613("FilterBloom");
		if (this.aClass112_5 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_11 = this.aClass112_5.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_9 = this.aClass112_5.method9524("bloomTex1");
			this.aClass77_Sub12_Sub1_12 = this.aClass112_5.method9524("params");
			this.aClass77_Sub12_Sub1_13 = this.aClass112_5.method9524("sampleSize");
			this.aClass77_Sub12_Sub1_14 = this.aClass112_5.method9524("pixelOffsetAndBloomScale");
			this.aClass77_Sub12_Sub1_10 = this.aClass112_5.method9524("PosAndTexCoords");
			this.aClass112_5.method9458("test");
			this.aClass105_6 = this.aClass112_5.method9458("techFullscreenTri");
			this.aClass105_5 = this.aClass112_5.method9458("brightpass");
			this.aClass105_7 = this.aClass112_5.method9458("blur");
			this.aClass105_9 = this.aClass112_5.method9458("composite");
			this.aClass105_8 = this.aClass112_5.method9458("techDefault");
		} catch (@Pc(98) Exception_Sub3_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub3_Sub2 local101) {
			return false;
		}
		if (!this.aClass105_6.method9595()) {
			return false;
		} else if (!this.aClass105_5.method9595()) {
			return false;
		} else if (!this.aClass105_7.method9595()) {
			return false;
		} else if (!this.aClass105_9.method9595()) {
			return false;
		} else if (this.aClass105_8.method9595()) {
			this.aBoolean213 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahk", name = "e", descriptor = "()Z", line = 41)
	@Override
	boolean method10801() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_5 = this.aClass86_Sub1_23.method20613("FilterBloom");
		if (this.aClass112_5 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_11 = this.aClass112_5.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_9 = this.aClass112_5.method9524("bloomTex1");
			this.aClass77_Sub12_Sub1_12 = this.aClass112_5.method9524("params");
			this.aClass77_Sub12_Sub1_13 = this.aClass112_5.method9524("sampleSize");
			this.aClass77_Sub12_Sub1_14 = this.aClass112_5.method9524("pixelOffsetAndBloomScale");
			this.aClass77_Sub12_Sub1_10 = this.aClass112_5.method9524("PosAndTexCoords");
			this.aClass112_5.method9458("test");
			this.aClass105_6 = this.aClass112_5.method9458("techFullscreenTri");
			this.aClass105_5 = this.aClass112_5.method9458("brightpass");
			this.aClass105_7 = this.aClass112_5.method9458("blur");
			this.aClass105_9 = this.aClass112_5.method9458("composite");
			this.aClass105_8 = this.aClass112_5.method9458("techDefault");
		} catch (@Pc(98) Exception_Sub3_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub3_Sub2 local101) {
			return false;
		}
		if (!this.aClass105_6.method9595()) {
			return false;
		} else if (!this.aClass105_5.method9595()) {
			return false;
		} else if (!this.aClass105_7.method9595()) {
			return false;
		} else if (!this.aClass105_9.method9595()) {
			return false;
		} else if (this.aClass105_8.method9595()) {
			this.aBoolean213 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahk", name = "k", descriptor = "()Z", line = 41)
	@Override
	boolean method10809() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_5 = this.aClass86_Sub1_23.method20613("FilterBloom");
		if (this.aClass112_5 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_11 = this.aClass112_5.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_9 = this.aClass112_5.method9524("bloomTex1");
			this.aClass77_Sub12_Sub1_12 = this.aClass112_5.method9524("params");
			this.aClass77_Sub12_Sub1_13 = this.aClass112_5.method9524("sampleSize");
			this.aClass77_Sub12_Sub1_14 = this.aClass112_5.method9524("pixelOffsetAndBloomScale");
			this.aClass77_Sub12_Sub1_10 = this.aClass112_5.method9524("PosAndTexCoords");
			this.aClass112_5.method9458("test");
			this.aClass105_6 = this.aClass112_5.method9458("techFullscreenTri");
			this.aClass105_5 = this.aClass112_5.method9458("brightpass");
			this.aClass105_7 = this.aClass112_5.method9458("blur");
			this.aClass105_9 = this.aClass112_5.method9458("composite");
			this.aClass105_8 = this.aClass112_5.method9458("techDefault");
		} catch (@Pc(98) Exception_Sub3_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub3_Sub2 local101) {
			return false;
		}
		if (!this.aClass105_6.method9595()) {
			return false;
		} else if (!this.aClass105_5.method9595()) {
			return false;
		} else if (!this.aClass105_7.method9595()) {
			return false;
		} else if (!this.aClass105_9.method9595()) {
			return false;
		} else if (this.aClass105_8.method9595()) {
			this.aBoolean213 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahk", name = "as", descriptor = "(II)V", line = 77)
	@Override
	void method10816() {
	}

	@OriginalMember(owner = "client!ahk", name = "w", descriptor = "(II)V", line = 77)
	@Override
	void method10792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ahk", name = "am", descriptor = "(II)V", line = 77)
	@Override
	void method10817() {
	}

	@OriginalMember(owner = "client!ahk", name = "ah", descriptor = "(II)V", line = 77)
	@Override
	void method10795() {
	}

	@OriginalMember(owner = "client!ahk", name = "aq", descriptor = "(II)V", line = 77)
	@Override
	void method10799() {
	}

	@OriginalMember(owner = "client!ahk", name = "y", descriptor = "()V", line = 78)
	@Override
	void method10821() {
	}

	@OriginalMember(owner = "client!ahk", name = "af", descriptor = "()V", line = 78)
	@Override
	void method10819() {
	}

	@OriginalMember(owner = "client!ahk", name = "ay", descriptor = "()V", line = 78)
	@Override
	void method10818() {
	}

	@OriginalMember(owner = "client!ahk", name = "an", descriptor = "()V", line = 78)
	@Override
	void method10820() {
	}

	@OriginalMember(owner = "client!ahk", name = "x", descriptor = "()I", line = 81)
	@Override
	int method10777() {
		return 4;
	}

	@OriginalMember(owner = "client!ahk", name = "a", descriptor = "()I", line = 81)
	@Override
	int method10776() {
		return 4;
	}

	@OriginalMember(owner = "client!ahk", name = "m", descriptor = "()I", line = 81)
	@Override
	int method10778() {
		return 4;
	}

	@OriginalMember(owner = "client!ahk", name = "h", descriptor = "()I", line = 81)
	@Override
	int method10775() {
		return 4;
	}

	@OriginalMember(owner = "client!ahk", name = "aj", descriptor = "()I", line = 81)
	@Override
	int method10779() {
		return 4;
	}

	@OriginalMember(owner = "client!ahk", name = "o", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 85)
	@Override
	void method10802(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(13) Interface37 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass112_5.method9547(this.aClass105_5);
			this.aClass112_5.method9545();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass112_5.method9547(this.aClass105_7);
			this.aClass112_5.method9545();
			this.aClass112_5.method9478(this.aClass77_Sub12_Sub1_13, aFloat133 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass112_5.method9547(this.aClass105_7);
			this.aClass112_5.method9545();
			this.aClass112_5.method9478(this.aClass77_Sub12_Sub1_13, 0.0F, aFloat133 / local11);
		} else if (arg0 == 3) {
			this.aClass112_5.method9547(this.aClass105_9);
			local13 = arg4;
			this.aClass112_5.method9503(this.aClass77_Sub12_Sub1_9, 1, arg2);
			this.aClass112_5.method9545();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass112_5.method9490(this.aClass77_Sub12_Sub1_10, local89);
		this.aClass112_5.method9503(this.aClass77_Sub12_Sub1_11, 0, local13);
		this.aClass112_5.method9483(this.aClass77_Sub12_Sub1_12, aFloat131, aFloat132, aFloat130, 0.0F);
		this.aClass112_5.method9483(this.aClass77_Sub12_Sub1_14, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass86_Sub1_23.method20104(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ahk", name = "n", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 85)
	@Override
	void method10804(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(13) Interface37 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass112_5.method9547(this.aClass105_5);
			this.aClass112_5.method9545();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass112_5.method9547(this.aClass105_7);
			this.aClass112_5.method9545();
			this.aClass112_5.method9478(this.aClass77_Sub12_Sub1_13, aFloat133 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass112_5.method9547(this.aClass105_7);
			this.aClass112_5.method9545();
			this.aClass112_5.method9478(this.aClass77_Sub12_Sub1_13, 0.0F, aFloat133 / local11);
		} else if (arg0 == 3) {
			this.aClass112_5.method9547(this.aClass105_9);
			local13 = arg4;
			this.aClass112_5.method9503(this.aClass77_Sub12_Sub1_9, 1, arg2);
			this.aClass112_5.method9545();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass112_5.method9490(this.aClass77_Sub12_Sub1_10, local89);
		this.aClass112_5.method9503(this.aClass77_Sub12_Sub1_11, 0, local13);
		this.aClass112_5.method9483(this.aClass77_Sub12_Sub1_12, aFloat131, aFloat132, aFloat130, 0.0F);
		this.aClass112_5.method9483(this.aClass77_Sub12_Sub1_14, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass86_Sub1_23.method20104(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ahk", name = "t", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 85)
	@Override
	void method10793(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(13) Interface37 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass112_5.method9547(this.aClass105_5);
			this.aClass112_5.method9545();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass112_5.method9547(this.aClass105_7);
			this.aClass112_5.method9545();
			this.aClass112_5.method9478(this.aClass77_Sub12_Sub1_13, aFloat133 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass112_5.method9547(this.aClass105_7);
			this.aClass112_5.method9545();
			this.aClass112_5.method9478(this.aClass77_Sub12_Sub1_13, 0.0F, aFloat133 / local11);
		} else if (arg0 == 3) {
			this.aClass112_5.method9547(this.aClass105_9);
			local13 = arg4;
			this.aClass112_5.method9503(this.aClass77_Sub12_Sub1_9, 1, arg2);
			this.aClass112_5.method9545();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass112_5.method9490(this.aClass77_Sub12_Sub1_10, local89);
		this.aClass112_5.method9503(this.aClass77_Sub12_Sub1_11, 0, local13);
		this.aClass112_5.method9483(this.aClass77_Sub12_Sub1_12, aFloat131, aFloat132, aFloat130, 0.0F);
		this.aClass112_5.method9483(this.aClass77_Sub12_Sub1_14, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass86_Sub1_23.method20104(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ahk", name = "b", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 85)
	@Override
	void method10803(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(13) Interface37 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass112_5.method9547(this.aClass105_5);
			this.aClass112_5.method9545();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass112_5.method9547(this.aClass105_7);
			this.aClass112_5.method9545();
			this.aClass112_5.method9478(this.aClass77_Sub12_Sub1_13, aFloat133 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass112_5.method9547(this.aClass105_7);
			this.aClass112_5.method9545();
			this.aClass112_5.method9478(this.aClass77_Sub12_Sub1_13, 0.0F, aFloat133 / local11);
		} else if (arg0 == 3) {
			this.aClass112_5.method9547(this.aClass105_9);
			local13 = arg4;
			this.aClass112_5.method9503(this.aClass77_Sub12_Sub1_9, 1, arg2);
			this.aClass112_5.method9545();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass112_5.method9490(this.aClass77_Sub12_Sub1_10, local89);
		this.aClass112_5.method9503(this.aClass77_Sub12_Sub1_11, 0, local13);
		this.aClass112_5.method9483(this.aClass77_Sub12_Sub1_12, aFloat131, aFloat132, aFloat130, 0.0F);
		this.aClass112_5.method9483(this.aClass77_Sub12_Sub1_14, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass86_Sub1_23.method20104(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ahk", name = "q", descriptor = "(I)V", line = 142)
	@Override
	void method10794(@OriginalArg(0) int arg0) {
		this.aClass112_5.method9543();
	}

	@OriginalMember(owner = "client!ahk", name = "ap", descriptor = "(I)V", line = 142)
	@Override
	void method10822() {
		this.aClass112_5.method9543();
	}

	@OriginalMember(owner = "client!ahk", name = "aw", descriptor = "(I)V", line = 142)
	@Override
	void method10823() {
		this.aClass112_5.method9543();
	}

	@OriginalMember(owner = "client!ahk", name = "aa", descriptor = "(I)V", line = 142)
	@Override
	void method10807() {
		this.aClass112_5.method9543();
	}

	@OriginalMember(owner = "client!ahk", name = "ab", descriptor = "(I)V", line = 142)
	@Override
	void method10808() {
		this.aClass112_5.method9543();
	}

	@OriginalMember(owner = "client!ahk", name = "s", descriptor = "()I", line = 146)
	@Override
	int method10781() {
		return 1;
	}

	@OriginalMember(owner = "client!ahk", name = "ag", descriptor = "()I", line = 146)
	@Override
	int method10780() {
		return 1;
	}

	@OriginalMember(owner = "client!ahk", name = "d", descriptor = "()I", line = 150)
	@Override
	int method10796() {
		return 0;
	}

	@OriginalMember(owner = "client!ahk", name = "ai", descriptor = "()I", line = 150)
	@Override
	int method10806() {
		return 0;
	}

	@OriginalMember(owner = "client!ahk", name = "z", descriptor = "()Z", line = 154)
	@Override
	boolean method10797() {
		return false;
	}

	@OriginalMember(owner = "client!ahk", name = "ad", descriptor = "()Z", line = 154)
	@Override
	boolean method10810() {
		return false;
	}

	@OriginalMember(owner = "client!ahk", name = "ac", descriptor = "()Z", line = 154)
	@Override
	boolean method10811() {
		return false;
	}

	@OriginalMember(owner = "client!ahk", name = "av", descriptor = "()Z", line = 154)
	@Override
	boolean method10812() {
		return false;
	}

	@OriginalMember(owner = "client!ahk", name = "ar", descriptor = "()Z", line = 154)
	@Override
	boolean method10789() {
		return false;
	}
}
