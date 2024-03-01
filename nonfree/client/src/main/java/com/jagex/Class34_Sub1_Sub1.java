package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akn")
public class Class34_Sub1_Sub1 extends Class34_Sub1 {

	@OriginalMember(owner = "client!akn", name = "<init>", descriptor = "(Lclient!ny;Lclient!ny;Lclient!ake;)V", line = 9)
	Class34_Sub1_Sub1(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class44_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!akn", name = "m", descriptor = "(IIII)V", line = 13)
	@Override
	void method16501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass6_14.method16772();
		@Pc(17) int local17 = ((Class44_Sub2_Sub1) this.aClass44_5).anInt2209 * 682647937 * Class472.method28774() / 10 % local3;
		this.aClass6_14.method16789(local17 + (arg0 - local3), arg1, local3 + arg2 - local17, arg3);
	}

	@OriginalMember(owner = "client!akn", name = "q", descriptor = "(IIIIB)V", line = 13)
	@Override
	void method16500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass6_14.method16772();
		@Pc(17) int local17 = ((Class44_Sub2_Sub1) this.aClass44_5).anInt2209 * 682647937 * Class472.method28774() / 10 % local3;
		this.aClass6_14.method16789(local17 + (arg0 - local3), arg1, local3 + arg2 - local17, arg3);
	}

	@OriginalMember(owner = "client!akn", name = "p", descriptor = "(S)[Lclient!vn;", line = 20)
	public static Class532[] method16504() {
		return new Class532[] { Class532.aClass532_4, Class532.aClass532_1, Class532.aClass532_8, Class532.aClass532_2, Class532.aClass532_5, Class532.aClass532_7, Class532.aClass532_6, Class532.aClass532_3 };
	}
}
