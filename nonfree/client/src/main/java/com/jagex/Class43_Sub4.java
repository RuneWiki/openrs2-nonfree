package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aet")
final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!aet", name = "<init>", descriptor = "(Lclient!fv;IZZ)V", line = 19)
	Class43_Sub4(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class43_Sub5) null);
	}

	@OriginalMember(owner = "client!aet", name = "y", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 21)
	@Override
	Object method9494(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3 == Class339.aClass339_5 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aet", name = "u", descriptor = "(Lclient!cy;B)Ljava/lang/Object;", line = 21)
	@Override
	Object method9490(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3 == Class339.aClass339_5 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aet", name = "b", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 21)
	@Override
	Object method9495(@OriginalArg(0) Class11 arg0) {
		return arg0.aClass339_3 == Class339.aClass339_5 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aet", name = "gd", descriptor = "(I)V", line = 2618)
	public static void method9306() {
		@Pc(6) Class592 local6 = Class348.method26559("2", client.aClass543_2.aString236, true);
		Class302.aClass10_Sub1_1.method726(local6);
	}

	@OriginalMember(owner = "client!aet", name = "he", descriptor = "(J)V", line = 4291)
	static final void method9307(@OriginalArg(0) long arg0) {
		if (client.aClass370_1.method26950() != null) {
			if (Class72.anInt2086 * 81180077 == 5 || Class72.anInt2086 * 81180077 == 6) {
				Class189.method23984(arg0);
			} else if (Class72.anInt2086 * 81180077 == 4) {
				Class369.method26936(arg0);
			}
		}
		Class290.method25535(Class613.aClass21_13, (long) client.anInt3034);
		if (client.anInt3125 * -1579500007 != -1) {
			Class469.method28757(client.anInt3125 * -1579500007);
		}
		@Pc(39) int local39;
		for (local39 = 0; local39 < client.anInt3166 * 1457104959; local39++) {
			client.aBooleanArray21[local39] = client.aBooleanArray19[local39];
			client.aBooleanArray19[local39] = false;
		}
		client.anInt3155 = client.anInt3034 * -607009797;
		Class339.method26434(-1, -1);
		if (-1579500007 * client.anInt3125 != -1) {
			client.anInt3166 = 0;
			Class597.method33477();
		}
		Class613.aClass21_13.method17056();
		Class602.method33525(Class613.aClass21_13);
		local39 = Class417.method27819();
		if (local39 == -1) {
			local39 = client.anInt3159 * -651417687;
		}
		if (local39 == -1) {
			local39 = client.anInt3120 * -592303601;
		}
		Class532.method32502(local39);
		@Pc(104) int local104 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16630() << 8;
		@Pc(108) Class320 local108 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
		Class616.method33694(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, local104 + (int) local108.aFloat259, (int) local108.aFloat261 + local104, client.anInt3124 * -1814914105);
		client.anInt3124 = 0;
	}
}
