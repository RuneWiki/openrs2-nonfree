package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vy")
public class Class609 {

	@OriginalMember(owner = "client!vy", name = "k", descriptor = "Lclient!cy;")
	static Class83 aClass83_38;

	@OriginalMember(owner = "client!vy", name = "p", descriptor = "Lclient!vy;")
	public static final Class609 aClass609_1 = new Class609(0);

	@OriginalMember(owner = "client!vy", name = "c", descriptor = "Lclient!vy;")
	public static final Class609 aClass609_2 = new Class609(1);

	@OriginalMember(owner = "client!vy", name = "v", descriptor = "Lclient!vy;")
	public static final Class609 aClass609_3 = new Class609(2);

	@OriginalMember(owner = "client!vy", name = "<init>", descriptor = "(I)V", line = 8)
	Class609(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vy", name = "pl", descriptor = "(Lclient!yf;I)V", line = 7422)
	static final void method32143(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.aBoolean666 ? 1 : 0;
	}

	@OriginalMember(owner = "client!vy", name = "sf", descriptor = "(Lclient!yf;I)V", line = 7820)
	static final void method32144(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.method25381(local16) ? 1 : 0;
	}

	@OriginalMember(owner = "client!vy", name = "yz", descriptor = "(Lclient!yf;I)V", line = 9007)
	static final void method32145(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 0 || local12 >= client.anInt3532 * 2103713403) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aClass217Array1[local12].aString170;
		}
	}

	@OriginalMember(owner = "client!vy", name = "ma", descriptor = "(ZII)V", line = 12037)
	public static final void method32146(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class77_Sub25 local5 = arg0 ? Class574.aClass77_Sub25_2 : Class494.aClass77_Sub25_1;
		if (local5 == null || arg1 < 0 || arg1 >= local5.anInt1550 * -1406046755) {
			return;
		}
		@Pc(21) Class358 local21 = local5.aClass358Array1[arg1];
		if (local21.aByte149 != -1) {
			return;
		}
		@Pc(29) String local29 = local21.aString209;
		@Pc(32) Class82 local32 = Class230.method25826();
		@Pc(38) Class77_Sub20 local38 = Class365.method28132(Class414.aClass414_41, local32.aClass16_1);
		local38.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(local29) + 3);
		local38.aClass77_Sub39_Sub1_2.method22403(arg0 ? 1 : 0);
		local38.aClass77_Sub39_Sub1_2.method22408(arg1);
		local38.aClass77_Sub39_Sub1_2.method22440(local29);
		local32.method2004(local38);
	}
}
