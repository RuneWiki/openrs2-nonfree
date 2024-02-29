package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gy")
public class Class289 implements Interface27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gy", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!gy", name = "p", descriptor = "I")
	final int anInt4002;

	@OriginalMember(owner = "client!gy", name = "c", descriptor = "I")
	final int anInt4003;

	@OriginalMember(owner = "client!gy", name = "e", descriptor = "(Ljava/lang/String;I)V", line = 168)
	static void method26980(@OriginalArg(0) String arg0) {
		Class98.aClass697_2 = Class697.aClass697_7;
		Class77_Sub3_Sub2.aString96 = arg0;
	}

	@OriginalMember(owner = "client!gy", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 247)
	Class289(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		this.anInt4002 = arg1.method22483() * -1027277431;
		this.anInt4003 = arg1.method22478() * 2050403695;
	}

	@OriginalMember(owner = "client!gy", name = "p", descriptor = "(Lclient!fd;I)V", line = 253)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26087(this.anInt4002 * 676628665, this.anInt4003 * -365211249);
		arg0.method26054(this.anInt4002 * 676628665).method25991();
	}

	@OriginalMember(owner = "client!gy", name = "c", descriptor = "(Lclient!fd;)V", line = 253)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26087(this.anInt4002 * 676628665, this.anInt4003 * -365211249);
		arg0.method26054(this.anInt4002 * 676628665).method25991();
	}

	@OriginalMember(owner = "client!gy", name = "v", descriptor = "(Lclient!fd;)V", line = 253)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26087(this.anInt4002 * 676628665, this.anInt4003 * -365211249);
		arg0.method26054(this.anInt4002 * 676628665).method25991();
	}

	@OriginalMember(owner = "client!gy", name = "ga", descriptor = "(I)V", line = 2570)
	static final void method26981() {
		Class555.aClass35_Sub17_3.method18333(5);
		Class65.aClass35_Sub13_1.method18333(5);
		Class333.aClass35_Sub14_1.method18333(5);
		client.aClass517_1.method30444().method18333(5);
		Class578.aClass35_Sub3_1.method18333(5);
		Class537.aClass35_Sub7_1.method18333(5);
		Class96_Sub11.aClass35_Sub2_3.method18333(5);
		Class482.aClass35_Sub4_1.method18333(5);
		Class61.aClass35_Sub11_1.method18333(5);
		Class562.aClass80_Sub1_Sub1_2.method1654(5);
		Class539.aClass80_Sub1_Sub2_6.method1964(5);
		Class55.aClass80_Sub1_Sub2_1.method1964(5);
		Class308.aClass80_Sub1_Sub2_3.method1964(5);
		Class528.aClass80_Sub1_Sub2_5.method1964(5);
		Class77_Sub23.aClass80_Sub1_Sub2_2.method1964(5);
		Class96_Sub23.aClass35_Sub15_1.method18333(5);
		Class251.aClass35_Sub10_3.method18333(5);
		Class118_Sub1.aClass35_Sub18_4.method18333(5);
		Class77_Sub13_Sub12.aClass35_Sub22_1.method18333(5);
		Class214.aClass35_Sub6_1.method18333(5);
		Class497.aClass35_Sub9_1.method18333(5);
		Class96_Sub10.aClass35_Sub20_1.method18333(5);
		Class648.aClass35_Sub5_1.method18333(5);
		Class629.aClass35_Sub1_1.method18333(5);
		Class476.aClass35_Sub16_1.method18333(5);
		Class329.method27587(5);
		Class466.method29560(50);
		Class367.aClass415_1.method28652(50);
		Class489.method30005(5);
		Class399.method28476(5);
		client.aClass232_63.method25847(5);
		client.aClass232_64.method25847(5);
		Class674.aClass232_92.method25847(5);
		client.aClass232_66.method25847(5);
		Class75_Sub1.aClass35_1.method18333(5);
		Class149.aClass35_10.method18333(5);
		client.aClass232_65.method25847(5);
	}

	@OriginalMember(owner = "client!gy", name = "ei", descriptor = "(Lclient!yf;I)V", line = 5265)
	static final void method26982(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class127.method13155(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gy", name = "nx", descriptor = "(Lclient!yf;B)V", line = 6919)
	static final void method26983(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class352.method27914(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!gy", name = "sq", descriptor = "(Lclient!yf;B)V", line = 7840)
	static final void method26984(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3883 * 290091559;
	}

	@OriginalMember(owner = "client!gy", name = "agy", descriptor = "(Lclient!yf;B)V", line = 10478)
	static final void method26985(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class82 local15 = Class230.method25826();
		@Pc(21) Class77_Sub20 local21 = Class365.method28132(Class414.aClass414_16, local15.aClass16_1);
		local21.aClass77_Sub39_Sub1_2.method22403(0);
		@Pc(32) int local32 = local21.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local21.aClass77_Sub39_Sub1_2.method22403(local12);
		local21.aClass77_Sub39_Sub1_2.method22408(arg0.aClass404_1.anInt4703 * -1791556207);
		arg0.aClass404_1.aClass77_Sub1_Sub13_1.method22304(local21.aClass77_Sub39_Sub1_2, arg0.aClass404_1.anIntArray460);
		local21.aClass77_Sub39_Sub1_2.method22463(local21.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local32);
		local15.method2004(local21);
	}

	@OriginalMember(owner = "client!gy", name = "axe", descriptor = "(Lclient!yf;B)V", line = 13359)
	static final void method26986(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!gy", name = "azb", descriptor = "(Lclient!yf;B)V", line = 13893)
	static final void method26987(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		Class367.method28151(arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]);
	}
}
