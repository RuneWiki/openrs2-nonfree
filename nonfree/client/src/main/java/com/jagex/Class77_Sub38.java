package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aku")
public class Class77_Sub38 extends Class77 {

	@OriginalMember(owner = "client!aku", name = "l", descriptor = "I")
	public final int anInt3113;

	@OriginalMember(owner = "client!aku", name = "y", descriptor = "I")
	public final int anInt3114;

	@OriginalMember(owner = "client!aku", name = "<init>", descriptor = "(II)V", line = 9)
	public Class77_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3113 = arg0 * -1269674451;
		this.anInt3114 = arg1 * -202574929;
	}

	@OriginalMember(owner = "client!aku", name = "p", descriptor = "(B)Z", line = 15)
	public boolean method22851() {
		return true;
	}

	@OriginalMember(owner = "client!aku", name = "c", descriptor = "()Z", line = 15)
	public boolean method22852() {
		return true;
	}

	@OriginalMember(owner = "client!aku", name = "aff", descriptor = "(Lclient!yf;I)V", line = 10089)
	static final void method22853(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		client.anInt3518 = arg0.anIntArray536[arg0.anInt5784 * 2088438307] * -905836865;
		Class118_Sub3.aClass687_1 = Class35_Sub22.method18345(arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]);
		if (Class118_Sub3.aClass687_1 == null) {
			Class118_Sub3.aClass687_1 = Class687.aClass687_3;
		}
		client.anInt3403 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2] * -81702317;
		@Pc(46) Class82 local46 = Class230.method25826();
		@Pc(52) Class77_Sub20 local52 = Class365.method28132(Class414.aClass414_57, local46.aClass16_1);
		local52.aClass77_Sub39_Sub1_2.method22403(client.anInt3518 * -700159681);
		local52.aClass77_Sub39_Sub1_2.method22403(Class118_Sub3.aClass687_1.anInt5871 * 1457930057);
		local52.aClass77_Sub39_Sub1_2.method22403(client.anInt3403 * -1256537637);
		local46.method2004(local52);
	}
}
