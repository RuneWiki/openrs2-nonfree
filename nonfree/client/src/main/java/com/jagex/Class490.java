package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
class Class490 implements Interface55 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qk", name = "this$0", descriptor = "Lclient!qs;")
	final Class496 this$0;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)V", line = 46)
	static void method30022(@OriginalArg(0) int arg0) {
		Class552.anInt5222 = arg0 * 928182963;
		Class73.aClass232_5.method25850();
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!qs;)V", line = 177)
	Class490(@OriginalArg(0) Class496 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "(II)[B", line = 179)
	@Override
	public byte[] method30021(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface69_1.method32151(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method30020(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface69_1.method32151(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "(I)[B", line = 179)
	@Override
	public byte[] method30019(@OriginalArg(0) int arg0) {
		return this.this$0.anInterface69_1.method32151(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "ug", descriptor = "(Lclient!yf;B)V", line = 8242)
	static final void method30023(@OriginalArg(0) Class665 arg0) {
		Class94_Sub4.aClass261_1.method26363();
	}

	@OriginalMember(owner = "client!qk", name = "aau", descriptor = "(Lclient!yf;I)V", line = 9269)
	static final void method30024(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.aBooleanArray28[local12] ? 1 : 0;
	}

	@OriginalMember(owner = "client!qk", name = "lr", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 11989)
	public static final void method30025(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(2) Class82 local2 = Class230.method25826();
		@Pc(8) Class77_Sub20 local8 = Class365.method28132(Class414.aClass414_39, local2.aClass16_1);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		local8.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0) + Class664.method33107(arg1));
		local8.aClass77_Sub39_Sub1_2.method22440(arg1);
		local8.aClass77_Sub39_Sub1_2.method22440(arg0);
		local2.method2004(local8);
	}

	@OriginalMember(owner = "client!qk", name = "aqk", descriptor = "(Lclient!yf;B)V", line = 12415)
	static final void method30026(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2.method15926();
	}

	@OriginalMember(owner = "client!qk", name = "asd", descriptor = "(Lclient!yf;I)V", line = 12539)
	static final void method30027(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!qk", name = "axw", descriptor = "(Lclient!yf;I)V", line = 13351)
	static final void method30028(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
