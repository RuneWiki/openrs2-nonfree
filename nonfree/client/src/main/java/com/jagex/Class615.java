package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public class Class615 implements Interface75 {

	@OriginalMember(owner = "client!wd", name = "iw", descriptor = "Lclient!pi;")
	public static Class465 aClass465_1;

	@OriginalMember(owner = "client!wd", name = "ox", descriptor = "I")
	public static int anInt5589;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!wd;")
	public static final Class615 aClass615_4 = new Class615(0);

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!wd;")
	static final Class615 aClass615_3 = new Class615(1);

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!wd;")
	static final Class615 aClass615_2 = new Class615(2);

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	final int anInt5588;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "()[Lclient!wd;", line = 20)
	public static Class615[] method32343() {
		return new Class615[] { aClass615_3, aClass615_4, aClass615_2 };
	}

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "()[Lclient!wd;", line = 20)
	public static Class615[] method32344() {
		return new Class615[] { aClass615_3, aClass615_4, aClass615_2 };
	}

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "(I)[Lclient!wd;", line = 20)
	public static Class615[] method32345() {
		return new Class615[] { aClass615_3, aClass615_4, aClass615_2 };
	}

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "()[Lclient!wd;", line = 20)
	public static Class615[] method32346() {
		return new Class615[] { aClass615_3, aClass615_4, aClass615_2 };
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V", line = 23)
	Class615(@OriginalArg(0) int arg0) {
		this.anInt5588 = arg0 * 1215998067;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "()I", line = 28)
	@Override
	public int method36479() {
		return this.anInt5588 * -161203013;
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "()I", line = 28)
	@Override
	public int method36478() {
		return this.anInt5588 * -161203013;
	}

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "()I", line = 28)
	@Override
	public int method36477() {
		return this.anInt5588 * -161203013;
	}

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "(B)Z", line = 32)
	public boolean method32347() {
		return aClass615_3 == this;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "()Z", line = 32)
	public boolean method32348() {
		return aClass615_3 == this;
	}

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "()Z", line = 36)
	public boolean method32349() {
		return aClass615_4 != this;
	}

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "(B)Z", line = 36)
	public boolean method32350() {
		return aClass615_4 != this;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(Lclient!yf;B)V", line = 62)
	static void method32351(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class80_Sub1.method1955();
	}

	@OriginalMember(owner = "client!wd", name = "to", descriptor = "(Lclient!yf;I)V", line = 8063)
	static final void method32352(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(19) Class77_Sub20 local19 = Class365.method28132(Class414.aClass414_61, client.aClass82_2.aClass16_1);
		local19.aClass77_Sub39_Sub1_2.method22403(local13.length() + 1);
		local19.aClass77_Sub39_Sub1_2.method22440(local13);
		client.aClass82_2.method2004(local19);
	}

	@OriginalMember(owner = "client!wd", name = "vf", descriptor = "(Lclient!yf;I)V", line = 8453)
	static final void method32353(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 100;
	}

	@OriginalMember(owner = "client!wd", name = "ajp", descriptor = "(Lclient!yf;I)V", line = 11241)
	static final void method32354(@OriginalArg(0) Class665 arg0) {
		Class683.anInt5829 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] * 1095883131;
	}

	@OriginalMember(owner = "client!wd", name = "awu", descriptor = "(Lclient!yf;I)V", line = 13271)
	static final void method32355(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub13_1.method16264(local12);
	}
}
