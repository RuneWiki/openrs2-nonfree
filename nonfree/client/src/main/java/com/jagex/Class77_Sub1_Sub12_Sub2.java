package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ats")
public class Class77_Sub1_Sub12_Sub2 extends Class77_Sub1_Sub12 {

	@OriginalMember(owner = "client!ats", name = "s", descriptor = "F")
	float aFloat231;

	@OriginalMember(owner = "client!ats", name = "q", descriptor = "Lclient!hy;")
	Class312 aClass312_1;

	@OriginalMember(owner = "client!ats", name = "x", descriptor = "F")
	float aFloat232;

	@OriginalMember(owner = "client!ats", name = "d", descriptor = "F")
	float aFloat233;

	@OriginalMember(owner = "client!ats", name = "<init>", descriptor = "(ILclient!hy;FF)V", line = 15)
	public Class77_Sub1_Sub12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		super(arg0);
		this.aClass312_1 = arg1;
		this.aFloat232 = arg2;
		this.aFloat233 = arg3;
	}

	@OriginalMember(owner = "client!ats", name = "<init>", descriptor = "(ILclient!akv;)V", line = 22)
	Class77_Sub1_Sub12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		super(arg0);
		this.aClass312_1 = Class459.method29504(arg1.method22478());
		this.aFloat232 = arg1.method22517();
		this.aFloat233 = arg1.method22517();
	}

	@OriginalMember(owner = "client!ats", name = "w", descriptor = "(F)V", line = 29)
	@Override
	public void method24016(@OriginalArg(0) float arg0) {
		this.aFloat231 += arg0 * this.aFloat233;
	}

	@OriginalMember(owner = "client!ats", name = "y", descriptor = "(F)V", line = 29)
	@Override
	public void method24015(@OriginalArg(0) float arg0) {
		this.aFloat231 += arg0 * this.aFloat233;
	}

	@OriginalMember(owner = "client!ats", name = "c", descriptor = "(FB)V", line = 29)
	@Override
	public void method24012(@OriginalArg(0) float arg0) {
		this.aFloat231 += arg0 * this.aFloat233;
	}

	@OriginalMember(owner = "client!ats", name = "t", descriptor = "(Lclient!ia;Lclient!ow;Lclient!oi;)V", line = 33)
	@Override
	public void method24019(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class442 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat231);
		@Pc(10) float local10 = local5 * this.aFloat232;
		if (Class312.aClass312_2 == this.aClass312_1) {
			arg0.anInt4067 = (int) (local10 + (float) (arg0.anInt4067 * 1135682509)) * -1803517691;
			arg1.method29436(local10, 0.0F, 0.0F);
		} else if (Class312.aClass312_3 == this.aClass312_1) {
			arg0.anInt4068 = (int) (local10 + (float) (arg0.anInt4068 * -1018779427)) * -1390317707;
			arg1.method29436(0.0F, local10, 0.0F);
		} else if (Class312.aClass312_4 == this.aClass312_1) {
			arg0.anInt4066 = (int) ((float) (arg0.anInt4066 * 975339373) + local10) * 1552704101;
			arg1.method29436(0.0F, 0.0F, local10);
		} else if (Class312.aClass312_5 == this.aClass312_1) {
			arg1.method29420(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass312_1 == Class312.aClass312_6) {
			arg1.method29420(0.0F, 1.0F, 0.0F, local10);
		} else if (Class312.aClass312_7 == this.aClass312_1) {
			arg1.method29420(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!ats", name = "v", descriptor = "(Lclient!ia;Lclient!ow;Lclient!oi;I)V", line = 33)
	@Override
	public void method24013(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class442 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat231);
		@Pc(10) float local10 = local5 * this.aFloat232;
		if (Class312.aClass312_2 == this.aClass312_1) {
			arg0.anInt4067 = (int) (local10 + (float) (arg0.anInt4067 * 1135682509)) * -1803517691;
			arg1.method29436(local10, 0.0F, 0.0F);
		} else if (Class312.aClass312_3 == this.aClass312_1) {
			arg0.anInt4068 = (int) (local10 + (float) (arg0.anInt4068 * -1018779427)) * -1390317707;
			arg1.method29436(0.0F, local10, 0.0F);
		} else if (Class312.aClass312_4 == this.aClass312_1) {
			arg0.anInt4066 = (int) ((float) (arg0.anInt4066 * 975339373) + local10) * 1552704101;
			arg1.method29436(0.0F, 0.0F, local10);
		} else if (Class312.aClass312_5 == this.aClass312_1) {
			arg1.method29420(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass312_1 == Class312.aClass312_6) {
			arg1.method29420(0.0F, 1.0F, 0.0F, local10);
		} else if (Class312.aClass312_7 == this.aClass312_1) {
			arg1.method29420(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!ats", name = "x", descriptor = "(Lclient!akv;)V", line = 62)
	@Override
	public void method24017(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass312_1 = Class459.method29504(arg0.method22478());
		this.aFloat232 = arg0.method22517();
		this.aFloat233 = arg0.method22517();
	}

	@OriginalMember(owner = "client!ats", name = "l", descriptor = "(Lclient!akv;I)V", line = 62)
	@Override
	public void method24014(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass312_1 = Class459.method29504(arg0.method22478());
		this.aFloat232 = arg0.method22517();
		this.aFloat233 = arg0.method22517();
	}

	@OriginalMember(owner = "client!ats", name = "s", descriptor = "(Lclient!akv;)V", line = 62)
	@Override
	public void method24021(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass312_1 = Class459.method29504(arg0.method22478());
		this.aFloat232 = arg0.method22517();
		this.aFloat233 = arg0.method22517();
	}

	@OriginalMember(owner = "client!ats", name = "q", descriptor = "(Lclient!akv;)V", line = 62)
	@Override
	public void method24018(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass312_1 = Class459.method29504(arg0.method22478());
		this.aFloat232 = arg0.method22517();
		this.aFloat233 = arg0.method22517();
	}

	@OriginalMember(owner = "client!ats", name = "d", descriptor = "(Lclient!akv;)V", line = 62)
	@Override
	public void method24020(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass312_1 = Class459.method29504(arg0.method22478());
		this.aFloat232 = arg0.method22517();
		this.aFloat233 = arg0.method22517();
	}
}
