package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acz")
public class Class13_Sub23 extends Class13 {

	@OriginalMember(owner = "client!acz", name = "he", descriptor = "Lclient!nf;")
	public static Class343 aClass343_1;

	@OriginalMember(owner = "client!acz", name = "a", descriptor = "I")
	final int anInt758;

	@OriginalMember(owner = "client!acz", name = "g", descriptor = "I")
	final int anInt759;

	@OriginalMember(owner = "client!acz", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 11)
	Class13_Sub23(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt758 = arg0.method20271() * 1862359845;
		this.anInt759 = arg0.method20275() * 16616551;
	}

	@OriginalMember(owner = "client!acz", name = "h", descriptor = "()V", line = 17)
	@Override
	public void method16896() {
		client.anInt3069 = client.anInt3034 * 405219109;
		client.anInt3151 = (client.anInt3034 + -1212725075 * this.anInt758) * -667522189;
		Class519.anInt5285 = client.anInt3070 * 1316167351;
		Class467.anInt5114 = client.anInt3071 * -1956771899;
		Class126.anInt3313 = client.anInt3072 * -2081707651;
		Class226.anInt3733 = client.anInt3172 * 424254499;
		client.anInt3070 = (this.anInt759 * 1065537367 >>> 24) * 1174413383;
		client.anInt3071 = (this.anInt759 * 1065537367 >>> 16 & 0xFF) * 1211280751;
		client.anInt3072 = (this.anInt759 * 1065537367 >>> 8 & 0xFF) * 130682933;
		client.anInt3172 = (this.anInt759 * 1065537367 & 0xFF) * 421643357;
	}

	@OriginalMember(owner = "client!acz", name = "a", descriptor = "(I)V", line = 17)
	@Override
	public void method16888() {
		client.anInt3069 = client.anInt3034 * 405219109;
		client.anInt3151 = (client.anInt3034 + -1212725075 * this.anInt758) * -667522189;
		Class519.anInt5285 = client.anInt3070 * 1316167351;
		Class467.anInt5114 = client.anInt3071 * -1956771899;
		Class126.anInt3313 = client.anInt3072 * -2081707651;
		Class226.anInt3733 = client.anInt3172 * 424254499;
		client.anInt3070 = (this.anInt759 * 1065537367 >>> 24) * 1174413383;
		client.anInt3071 = (this.anInt759 * 1065537367 >>> 16 & 0xFF) * 1211280751;
		client.anInt3072 = (this.anInt759 * 1065537367 >>> 8 & 0xFF) * 130682933;
		client.anInt3172 = (this.anInt759 * 1065537367 & 0xFF) * 421643357;
	}

	@OriginalMember(owner = "client!acz", name = "lt", descriptor = "(Ljava/lang/String;I)V", line = 11385)
	public static final void method7269(@OriginalArg(0) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(7) Class82 local7 = Class406.method27657();
		@Pc(13) Class3_Sub23 local13 = Class269.method25284(Class311.aClass311_61, local7.aClass577_2);
		local13.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0));
		local13.aClass3_Sub41_Sub1_1.method20260(arg0);
		local7.method21601(local13);
	}

	@OriginalMember(owner = "client!acz", name = "arz", descriptor = "(Lclient!vs;I)V", line = 12144)
	static final void method7270(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class13_Sub7.anInt608 * 1028473469;
	}
}
