package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afb")
public class Class96_Sub2 extends Class96 {

	@OriginalMember(owner = "client!afb", name = "c", descriptor = "I")
	final int anInt804;

	@OriginalMember(owner = "client!afb", name = "v", descriptor = "I")
	final int anInt803;

	@OriginalMember(owner = "client!afb", name = "l", descriptor = "I")
	final int anInt802;

	@OriginalMember(owner = "client!afb", name = "y", descriptor = "I")
	final int anInt800;

	@OriginalMember(owner = "client!afb", name = "w", descriptor = "I")
	final int anInt801;

	@OriginalMember(owner = "client!afb", name = "<init>", descriptor = "(Lclient!akv;)V", line = 14)
	Class96_Sub2(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt804 = arg0.method22483() * -735127011;
		this.anInt803 = arg0.method22483() * 1506818875;
		this.anInt802 = arg0.method22483() * 1063879437;
		this.anInt800 = arg0.method22483() * -34085905;
		this.anInt801 = arg0.method22483() * 1751867433;
	}

	@OriginalMember(owner = "client!afb", name = "c", descriptor = "(I)V", line = 23)
	@Override
	public void method19911() {
		Class87.method4253(this.anInt804 * -987187147, this.anInt802 * 387515333, this.anInt803 * 1901389299, 100, 100, false);
		Class115_Sub3.method21239(this.anInt800 * 492284687, this.anInt801 * -2106967015, 0);
		client.aBoolean607 = true;
	}

	@OriginalMember(owner = "client!afb", name = "y", descriptor = "()V", line = 23)
	@Override
	public void method19912() {
		Class87.method4253(this.anInt804 * -987187147, this.anInt802 * 387515333, this.anInt803 * 1901389299, 100, 100, false);
		Class115_Sub3.method21239(this.anInt800 * 492284687, this.anInt801 * -2106967015, 0);
		client.aBoolean607 = true;
	}

	@OriginalMember(owner = "client!afb", name = "w", descriptor = "()V", line = 23)
	@Override
	public void method19913() {
		Class87.method4253(this.anInt804 * -987187147, this.anInt802 * 387515333, this.anInt803 * 1901389299, 100, 100, false);
		Class115_Sub3.method21239(this.anInt800 * 492284687, this.anInt801 * -2106967015, 0);
		client.aBoolean607 = true;
	}

	@OriginalMember(owner = "client!afb", name = "f", descriptor = "(Lclient!yf;S)V", line = 126)
	static void method7090(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) TwitchWebcamDevice local16 = Class562.method31323(local12);
		if (local16 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.v();
		}
	}

	@OriginalMember(owner = "client!afb", name = "y", descriptor = "(IIIIIFZI)[I", line = 203)
	public static int[] method7091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(6) Class77_Sub27_Sub1 local6 = new Class77_Sub27_Sub1();
		local6.anInt3034 = arg1 * -334914933;
		local6.aBoolean496 = arg6;
		local6.anInt3039 = arg2 * -855596815;
		local6.anInt3035 = arg3 * 477403563;
		local6.anInt3037 = arg4 * 1909898403;
		local6.anInt3038 = (int) (arg5 * 4096.0F) * -1869573391;
		local6.method22256();
		Class32.method526(arg0, 1);
		local6.method22245(0, local2);
		return local2;
	}
}
