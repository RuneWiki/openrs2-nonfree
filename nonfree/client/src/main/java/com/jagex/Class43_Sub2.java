package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aei")
final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!aei", name = "so", descriptor = "[Lclient!as;")
	public static Class79[] aClass79Array1;

	@OriginalMember(owner = "client!aei", name = "<init>", descriptor = "(Lclient!fv;IZZ)V", line = 41)
	Class43_Sub2(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class43_Sub5) null);
	}

	@OriginalMember(owner = "client!aei", name = "y", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 43)
	@Override
	Object method9494(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aei", name = "u", descriptor = "(Lclient!cy;B)Ljava/lang/Object;", line = 43)
	@Override
	Object method9490(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aei", name = "b", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 43)
	@Override
	Object method9495(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aei", name = "n", descriptor = "(Ljava/lang/String;B)I", line = 151)
	public static int method8763(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!aei", name = "hr", descriptor = "(Lclient!act;II)V", line = 4061)
	static void method8762(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray234 == null) {
			return;
		}
		@Pc(9) Class538 local9 = (Class538) Class356.method26649(Class72.method14644(), arg1);
		@Pc(16) int local16 = arg0.anIntArray234[local9.method32557()];
		if (local16 != arg0.aClass71_3.method20103()) {
			arg0.aClass71_3.method20027(local16, arg0.aClass71_3.method20033());
			arg0.anInt2385 = arg0.anInt2362 * -1492923025;
		}
	}
}
