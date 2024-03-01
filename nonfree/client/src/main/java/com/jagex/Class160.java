package com.jagex;

import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public class Class160 {

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!ev", name = "oa", descriptor = "I")
	public static int anInt3442;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "Lclient!ev;")
	static final Class160 aClass160_8 = new Class160();

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "Lclient!ev;")
	static final Class160 aClass160_2 = new Class160();

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "Lclient!ev;")
	static final Class160 aClass160_3 = new Class160();

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "Lclient!ev;")
	static final Class160 aClass160_4 = new Class160();

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!ev;")
	static final Class160 aClass160_5 = new Class160();

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "Lclient!ev;")
	static final Class160 aClass160_6 = new Class160();

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "Lclient!ev;")
	static final Class160 aClass160_7 = new Class160();

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "Lclient!ev;")
	static final Class160 aClass160_1 = new Class160();

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "Lclient!ev;")
	public static final Class160 aClass160_9 = new Class160();

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Lclient!ev;")
	public static final Class160 aClass160_10 = new Class160();

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Lclient!ev;")
	static final Class160 aClass160_11 = new Class160();

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "Lclient!ev;")
	static final Class160 aClass160_12 = new Class160();

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "Lclient!ev;")
	static final Class160 aClass160_13 = new Class160();

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "(I)V", line = 16)
	public static void method23214() {
		Class610.aClass553_57 = new Class553();
	}

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V", line = 18)
	Class160() {
	}

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "(Lclient!rn;S)V", line = 26)
	public static void method23213(@OriginalArg(0) Class436 arg0) {
		Class350.aClass436_2 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "(IB)V", line = 93)
	public static void method23216(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(3, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!ev", name = "fj", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5085)
	static final void method23209(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg2.anIntArray496[arg2.anInt5319 * 960738381];
		@Pc(23) int local23 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local13);
		if (local23 == local28.anInt5585 * 100041865) {
			arg0.method23445(local13);
		} else {
			arg0.method23443(local13, local23);
		}
	}

	@OriginalMember(owner = "client!ev", name = "pb", descriptor = "(Lclient!vs;B)V", line = 6880)
	static final void method23210(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3573 * 598019781;
	}

	@OriginalMember(owner = "client!ev", name = "vw", descriptor = "(Lclient!vs;S)V", line = 7934)
	static final void method23211(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = FileFilter_Sub1.aClass585_1.anInt5458 * 146668341;
	}

	@OriginalMember(owner = "client!ev", name = "ajo", descriptor = "(Lclient!vs;I)V", line = 10677)
	static final void method23212(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class80.aClass23_Sub1_1.method5802(Class608.method33569(local12), true);
		client.aBoolean586 = true;
	}

	@OriginalMember(owner = "client!ev", name = "akz", descriptor = "(Lclient!vs;I)V", line = 10892)
	static final void method23215(@OriginalArg(0) Class536 arg0) {
		Class80.aClass23_Sub1_1.method5803();
	}
}
