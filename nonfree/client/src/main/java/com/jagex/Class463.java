package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public class Class463 implements Interface56 {

	@OriginalMember(owner = "client!sq", name = "cm", descriptor = "I")
	public static int anInt5070;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "Lclient!sq;")
	static final Class463 aClass463_3 = new Class463(0);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "Lclient!sq;")
	static final Class463 aClass463_2 = new Class463(1);

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "Lclient!sq;")
	static final Class463 aClass463_1 = new Class463(2);

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	final int anInt5069;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "()[Lclient!sq;", line = 14)
	public static Class463[] method28608() {
		return new Class463[] { aClass463_3, aClass463_2, aClass463_1 };
	}

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "()[Lclient!sq;", line = 14)
	public static Class463[] method28609() {
		return new Class463[] { aClass463_3, aClass463_2, aClass463_1 };
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V", line = 17)
	Class463(@OriginalArg(0) int arg0) {
		this.anInt5069 = arg0 * -978761203;
	}

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "()I", line = 22)
	@Override
	public int method33766() {
		return this.anInt5069 * 1601508549;
	}

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method33767() {
		return this.anInt5069 * 1601508549;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I", line = 22)
	@Override
	public int method33765() {
		return this.anInt5069 * 1601508549;
	}

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "()I", line = 22)
	@Override
	public int method33764() {
		return this.anInt5069 * 1601508549;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILjava/lang/String;B)Z", line = 53)
	public static boolean method28613(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		FileFilter_Sub1.aClass585_1 = new Class585();
		FileFilter_Sub1.aClass585_1.anInt5458 = arg0 * 664190749;
		FileFilter_Sub1.aClass585_1.aString242 = arg1;
		if (Class527.aClass527_10 != Class1.aClass527_1) {
			FileFilter_Sub1.aClass585_1.anInt5459 = FileFilter_Sub1.aClass585_1.anInt5458 * -1027819553 + 117580992;
			FileFilter_Sub1.aClass585_1.anInt5457 = FileFilter_Sub1.aClass585_1.anInt5458 * 550241065 + -147881328;
		}
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "af", descriptor = "(I)V", line = 890)
	static void method28610() {
		for (@Pc(4) Class3_Sub1_Sub9 local4 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32623(); local4 != null; local4 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32645()) {
			if (local4.anInt2669 * 2127103997 > 1) {
				local4.anInt2669 = 0;
				Class250.aClass161_29.method23222(local4, ((Class3_Sub1_Sub7) local4.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66).aLong155 * 4089614541957148765L);
				local4.aClass546_9.method32620();
			}
		}
		Class250.anInt3812 = 0;
		Class250.anInt3811 = 0;
		Class250.aClass553_52.method32701();
		Class250.aClass581_30.method33222();
		Class250.aClass546_15.method32620();
		Class372.method27205(Class325.aClass3_Sub1_Sub7_4);
	}

	@OriginalMember(owner = "client!sq", name = "afu", descriptor = "(Lclient!vs;I)V", line = 9934)
	static final void method28611(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class485.anInt5182 * 826696483 + Class58.anInt1429;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class58.anInt1406 + Class161.anInt3445 * 2105263663;
	}

	@OriginalMember(owner = "client!sq", name = "aou", descriptor = "(Lclient!vs;B)V", line = 11603)
	static final void method28612(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13345() == 1 ? 1 : 0;
	}
}
