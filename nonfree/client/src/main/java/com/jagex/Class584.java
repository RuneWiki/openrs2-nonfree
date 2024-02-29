package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public class Class584 implements Interface67 {

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
	final int anInt5448;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(I)V", line = 56)
	Class584(@OriginalArg(0) int arg0) {
		this.anInt5448 = arg0 * 1469484139;
	}

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "(I)V", line = 61)
	@Override
	public void method31719() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_17, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22610(this.anInt5448 * -786710461);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "()V", line = 61)
	@Override
	public void method31718() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_17, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22610(this.anInt5448 * -786710461);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "()V", line = 61)
	@Override
	public void method31717() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_17, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22610(this.anInt5448 * -786710461);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "()V", line = 61)
	@Override
	public void method31716() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_17, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22610(this.anInt5448 * -786710461);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uu", name = "y", descriptor = "()V", line = 61)
	@Override
	public void method31720() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_17, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22610(this.anInt5448 * -786710461);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!uu", name = "aq", descriptor = "(Lclient!oi;B)V", line = 1115)
	static void method31721(@OriginalArg(0) Class442 arg0) {
		Class683.aClass442_99.method28954(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "abg", descriptor = "(Lclient!yf;B)V", line = 9375)
	static final void method31722(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass77_Sub25_3.method13631((String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147]);
	}

	@OriginalMember(owner = "client!uu", name = "ahb", descriptor = "(Lclient!yf;B)V", line = 10629)
	static final void method31723(@OriginalArg(0) Class665 arg0) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!uu", name = "ahf", descriptor = "(Lclient!yf;I)V", line = 10728)
	static final void method31724(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class77_Sub30 local2 = Class125_Sub2.method12706();
		if (local2 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt1635 * 1592054281;
			@Pc(76) int local76 = local2.anInt1633 * 197477433 << 28 | Class136.anInt1674 + local2.anInt1638 * 1412374331 << 14 | local2.anInt1636 * -958626707 + Class136.anInt1675;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local76;
		}
	}

	@OriginalMember(owner = "client!uu", name = "aod", descriptor = "(Lclient!yf;B)V", line = 12098)
	static final void method31725(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1 ? 1 : 0);
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!uu", name = "aqt", descriptor = "(Lclient!yf;I)V", line = 12387)
	static final void method31726(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1.method15333() == 1 ? 1 : 0;
	}
}
