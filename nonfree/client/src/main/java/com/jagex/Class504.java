package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
final class Class504 implements Runnable {

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "Lclient!ny;")
	static Class359 aClass359_93;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "()V", line = 29)
	public void method29509() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "()V", line = 29)
	public void method29510() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!uj", name = "run", descriptor = "()V", line = 29)
	@Override
	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!uj", name = "aer", descriptor = "(Lclient!vs;I)V", line = 9686)
	static final void method29512(@OriginalArg(0) Class536 arg0) {
		arg0.aClass283_1 = new Class283();
		arg0.aClass283_1.anInt4351 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] * -1424853715;
		arg0.aClass283_1.aClass3_Sub1_Sub13_1 = Class622.aClass580_2.method33211(arg0.aClass283_1.anInt4351 * 189047461);
		arg0.aClass283_1.anIntArray410 = new int[arg0.aClass283_1.aClass3_Sub1_Sub13_1.method19279()];
	}

	@OriginalMember(owner = "client!uj", name = "alz", descriptor = "(Lclient!vs;B)V", line = 11155)
	static final void method29511(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class547 local2 = Class548.method32662();
		@Pc(5) String local5 = Class156.method23184();
		if (local5 == null) {
			local5 = "";
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2.method33765();
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local5;
	}
}
