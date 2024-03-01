package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public class Class92 {

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/Object;")
	static Object anObject8;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	static final int anInt2938 = 128;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	static final int anInt2939 = 128;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
	static final int anInt2940 = 16;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	static final int anInt2941 = 4000;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "Ljava/lang/Object;")
	static Object anObject9;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "Ljava/lang/Object;")
	static Object anObject10;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "[Lclient!aab;")
	Class4_Sub1[] aClass4_Sub1Array2 = null;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!zg;")
	Class4_Sub4 aClass4_Sub4_1 = null;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "[Lclient!aab;")
	Class4_Sub1[] aClass4_Sub1Array3 = null;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "Lclient!zg;")
	Class4_Sub4 aClass4_Sub4_3 = null;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Lclient!zg;")
	Class4_Sub4 aClass4_Sub4_2 = null;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "Z")
	boolean aBoolean535;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "(Lclient!abt;)V", line = 25)
	static void method21676(@OriginalArg(0) Class21_Sub2 arg0) {
		@Pc(11) byte[] local11;
		if (anObject8 == null) {
			@Pc(5) Class45_Sub1_Sub2 local5 = new Class45_Sub1_Sub2();
			local11 = local5.method18278(128, 128, 16);
			anObject8 = Class602.method33519(local11, false);
		}
		if (anObject9 == null) {
			@Pc(22) Class45_Sub2_Sub1 local22 = new Class45_Sub2_Sub1();
			local11 = local22.method15031(128, 128, 16);
			anObject9 = Class602.method33519(local11, false);
		}
		@Pc(36) Class115 local36 = arg0.aClass115_1;
		if (local36.method22803() && anObject10 == null) {
			local11 = Class397.method27515(128, 128, 16, 8, new Class59_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject10 = Class602.method33519(local11, false);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!abt;)V", line = 25)
	static void method21677(@OriginalArg(0) Class21_Sub2 arg0) {
		@Pc(11) byte[] local11;
		if (anObject8 == null) {
			@Pc(5) Class45_Sub1_Sub2 local5 = new Class45_Sub1_Sub2();
			local11 = local5.method18278(128, 128, 16);
			anObject8 = Class602.method33519(local11, false);
		}
		if (anObject9 == null) {
			@Pc(22) Class45_Sub2_Sub1 local22 = new Class45_Sub2_Sub1();
			local11 = local22.method15031(128, 128, 16);
			anObject9 = Class602.method33519(local11, false);
		}
		@Pc(36) Class115 local36 = arg0.aClass115_1;
		if (local36.method22803() && anObject10 == null) {
			local11 = Class397.method27515(128, 128, 16, 8, new Class59_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject10 = Class602.method33519(local11, false);
		}
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!abt;)V", line = 42)
	Class92(@OriginalArg(0) Class21_Sub2 arg0) {
		this.aBoolean535 = arg0.aBoolean83;
		method21676(arg0);
		if (this.aBoolean535) {
			@Pc(103) byte[] local103 = Class3_Sub1_Sub19.method33681(anObject8, false);
			this.aClass4_Sub4_1 = new Class4_Sub4(arg0, Class121.aClass121_20, Class127.aClass127_23, 128, 128, 16, local103, Class121.aClass121_20);
			@Pc(121) byte[] local121 = Class3_Sub1_Sub19.method33681(anObject9, false);
			this.aClass4_Sub4_3 = new Class4_Sub4(arg0, Class121.aClass121_20, Class127.aClass127_23, 128, 128, 16, local121, Class121.aClass121_20);
			@Pc(137) Class115 local137 = arg0.aClass115_1;
			if (local137.method22803()) {
				local103 = Class3_Sub1_Sub19.method33681(anObject10, false);
				this.aClass4_Sub4_2 = new Class4_Sub4(arg0, Class121.aClass121_17, Class127.aClass127_23, 128, 128, 16);
				@Pc(168) Class4_Sub4 local168 = new Class4_Sub4(arg0, Class121.aClass121_19, Class127.aClass127_23, 128, 128, 16, local103, Class121.aClass121_19);
				if (local137.method22805(this.aClass4_Sub4_2, local168, 2.0F)) {
					this.aClass4_Sub4_2.method33714();
				} else {
					this.aClass4_Sub4_2.method33717();
					this.aClass4_Sub4_2 = null;
				}
				local168.method33717();
			}
		} else {
			this.aClass4_Sub1Array2 = new Class4_Sub1[16];
			@Pc(31) int local31;
			@Pc(42) byte[] local42;
			for (local31 = 0; local31 < 16; local31++) {
				local42 = Class445.method28338(anObject8, local31 * 32768, 32768);
				this.aClass4_Sub1Array2[local31] = new Class4_Sub1(arg0, 3553, Class121.aClass121_20, Class127.aClass127_23, 128, 128, true, local42, Class121.aClass121_20, false);
			}
			this.aClass4_Sub1Array3 = new Class4_Sub1[16];
			for (local31 = 0; local31 < 16; local31++) {
				local42 = Class445.method28338(anObject9, local31 * 32768, 32768);
				this.aClass4_Sub1Array3[local31] = new Class4_Sub1(arg0, 3553, Class121.aClass121_20, Class127.aClass127_23, 128, 128, true, local42, Class121.aClass121_20, false);
			}
		}
	}
}
