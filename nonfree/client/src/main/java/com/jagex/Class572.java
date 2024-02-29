package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public class Class572 implements Interface67 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!aba;")
	final Class27 aClass27_15;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!aba;)V", line = 70)
	Class572(@OriginalArg(0) Class27 arg0) {
		this.aClass27_15 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()V", line = 75)
	@Override
	public void method31717() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_7, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22578(this.aClass27_15.method36479());
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "()V", line = 75)
	@Override
	public void method31720() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_7, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22578(this.aClass27_15.method36479());
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "()V", line = 75)
	@Override
	public void method31718() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_7, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22578(this.aClass27_15.method36479());
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "()V", line = 75)
	@Override
	public void method31716() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_7, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22578(this.aClass27_15.method36479());
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "(I)V", line = 75)
	@Override
	public void method31719() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_7, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22578(this.aClass27_15.method36479());
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uc", name = "ic", descriptor = "(Lclient!yf;I)V", line = 6025)
	static final void method31481(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class658.method33060(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "ie", descriptor = "(Lclient!yf;B)V", line = 6119)
	static final void method31482(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class473.method29654(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "abo", descriptor = "(Lclient!yf;B)V", line = 9437)
	static final void method31483(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(31) int local31 = client.aClass497ArrayArray1[local23][local13].method30169();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local31 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!uc", name = "akq", descriptor = "(Lclient!yf;I)V", line = 11327)
	static final void method31484(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloat249 >> 3;
	}

	@OriginalMember(owner = "client!uc", name = "apr", descriptor = "(Lclient!yf;B)V", line = 12199)
	static final void method31485(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
