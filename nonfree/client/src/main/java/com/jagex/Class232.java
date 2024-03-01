package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public class Class232 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!dw;")
	static Class14 aClass14_9;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!de;")
	static Class21 aClass21_8;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Lclient!wk;")
	static Class553 aClass553_49 = new Class553();

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 15)
	Class232() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(Lclient!de;Lclient!fo;)V", line = 20)
	static void method24580(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class178 arg1) {
		@Pc(37) boolean local37 = Class44_Sub3.aClass596_1.method33436(arg0, arg1.anInt3559 * 1976441867, arg1.anInt3563 * -1429853457, arg1.anInt3532 * 1688841995, -846603747 * arg1.anInt3511 | 0xFF000000, arg1.anInt3501 * -58397333, arg1.aBoolean642 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null) == null;
		if (local37) {
			aClass553_49.method32702(new Class3_Sub3(arg1.anInt3559 * 1976441867, arg1.anInt3563 * -1429853457, arg1.anInt3532 * 1688841995, arg1.anInt3511 * -846603747 | 0xFF000000, arg1.anInt3501 * -58397333, arg1.aBoolean642));
			Class223.method24442(arg1);
		}
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(Lclient!de;)V", line = 28)
	static void method24581(@OriginalArg(0) Class21 arg0) {
		if (aClass553_49.method32725() == 0) {
			return;
		}
		@Pc(14) Class3_Sub3 local14;
		if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
			for (local14 = (Class3_Sub3) aClass553_49.method32768(); local14 != null; local14 = (Class3_Sub3) aClass553_49.method32709()) {
				Class44_Sub3.aClass596_1.method33434(arg0, arg0, local14.anInt1157 * 645746539, local14.anInt1158 * 110971549, local14.anInt1156 * 196976511, local14.anInt1159 * -1553546849, false, false, local14.anInt1160 * -822406223, Class418.aClass14_11, local14.aBoolean253 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null, Class630.aClass493_1);
				local14.method33656();
			}
			Class401.method27608();
			return;
		}
		if (aClass21_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			aClass21_8 = Class544.method32605(0, local72, Class43_Sub5.aClass134_5, Class325.anInterface11_9, Class127.aClass359_33, 0);
			aClass14_9 = aClass21_8.method17096(Class457.method28517(Class475.aClass359_86, Class568.anInt5378 * 1732591297, 0), (Class15_Sub1[]) Class137.method22942(Class294.aClass359_54, Class568.anInt5378 * 1732591297, 0), true);
		}
		for (local14 = (Class3_Sub3) aClass553_49.method32768(); local14 != null; local14 = (Class3_Sub3) aClass553_49.method32709()) {
			Class44_Sub3.aClass596_1.method33434(aClass21_8, arg0, local14.anInt1157 * 645746539, local14.anInt1158 * 110971549, local14.anInt1156 * 196976511, local14.anInt1159 * -1553546849, false, false, local14.anInt1160 * -822406223, aClass14_9, local14.aBoolean253 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null, Class630.aClass493_1);
			local14.method33656();
		}
	}

	@OriginalMember(owner = "client!i", name = "s", descriptor = "()V", line = 51)
	static void method24579() {
		if (aClass21_8 != null) {
			aClass21_8.method17020();
			aClass21_8 = null;
			aClass14_9 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "x", descriptor = "()V", line = 51)
	static void method24582() {
		if (aClass21_8 != null) {
			aClass21_8.method17020();
			aClass21_8 = null;
			aClass14_9 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "m", descriptor = "(I)V", line = 703)
	public static void method24583() {
		Class178.aClass161_17.method23224();
		Class178.aClass161_19.method23224();
		Class178.aClass161_20.method23224();
		Class178.aClass161_18.method23224();
	}

	@OriginalMember(owner = "client!i", name = "aif", descriptor = "(Lclient!vs;I)V", line = 10465)
	static final void method24584(@OriginalArg(0) Class536 arg0) {
		Class300.aClass300_3.method25643();
	}
}
