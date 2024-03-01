package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public class Class599 implements Interface63 {

	@OriginalMember(owner = "client!uo", name = "dt", descriptor = "Lclient!ni;")
	public static Class438 aClass438_1;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "Lclient!acx;")
	final Class73 aClass73_15;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)V", line = 67)
	static void method31836() {
		Class172.anInt3177 = 0;
		Class172.anInt3175 = -1899481709;
		Class172.anInt3179 = -2004084007;
		Class172.anInt3174 = 246739717;
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!acx;)V", line = 70)
	Class599(@OriginalArg(0) Class73 arg0) {
		this.aClass73_15 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V", line = 75)
	@Override
	public void method31895() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2);
		local5.aClass93_Sub41_Sub2_1.method22446(this.aClass73_15.method36920());
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "()V", line = 75)
	@Override
	public void method31894() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2);
		local5.aClass93_Sub41_Sub2_1.method22446(this.aClass73_15.method36920());
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "()V", line = 75)
	@Override
	public void method31896() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2);
		local5.aClass93_Sub41_Sub2_1.method22446(this.aClass73_15.method36920());
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "()V", line = 75)
	@Override
	public void method31897() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2);
		local5.aClass93_Sub41_Sub2_1.method22446(this.aClass73_15.method36920());
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "()V", line = 75)
	@Override
	public void method31898() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_55, client.aClass175_2.aClass24_2);
		local5.aClass93_Sub41_Sub2_1.method22446(this.aClass73_15.method36920());
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!uo", name = "ec", descriptor = "(Lclient!yf;I)V", line = 5761)
	static final void method31835(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class318.method27212(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!uo", name = "lt", descriptor = "(Lclient!yf;B)V", line = 7114)
	static final void method31837(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class247.method25916(local16, local22, arg0);
	}
}
