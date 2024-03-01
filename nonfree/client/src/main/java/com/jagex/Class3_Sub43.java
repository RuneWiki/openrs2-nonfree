package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahq")
public class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!ahq", name = "x", descriptor = "[I")
	int[] anIntArray199;

	@OriginalMember(owner = "client!ahq", name = "s", descriptor = "[I")
	int[] anIntArray200;

	@OriginalMember(owner = "client!ahq", name = "c", descriptor = "[[[B")
	byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ahq", name = "u", descriptor = "[Ljava/lang/reflect/Field;")
	Field[] aFieldArray1;

	@OriginalMember(owner = "client!ahq", name = "l", descriptor = "I")
	int anInt1489;

	@OriginalMember(owner = "client!ahq", name = "y", descriptor = "[I")
	int[] anIntArray201;

	@OriginalMember(owner = "client!ahq", name = "b", descriptor = "[Ljava/lang/reflect/Method;")
	Method[] aMethodArray1;

	@OriginalMember(owner = "client!ahq", name = "h", descriptor = "I")
	int anInt1490;

	@OriginalMember(owner = "client!ahq", name = "<init>", descriptor = "()V", line = 16)
	Class3_Sub43() {
	}

	@OriginalMember(owner = "client!ahq", name = "g", descriptor = "(Lclient!vs;B)V", line = 21)
	static void method12940(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5250 * -2015745853;
	}

	@OriginalMember(owner = "client!ahq", name = "apu", descriptor = "(Lclient!vs;B)V", line = 11647)
	static final void method12942(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub30_1.method13950();
	}

	@OriginalMember(owner = "client!ahq", name = "apx", descriptor = "(Lclient!vs;B)V", line = 11759)
	static final void method12941(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(14) boolean local14 = true;
		if (local12 < 0) {
			local14 = (local12 + 1) % 4 == 0;
		} else if (local12 < 1582) {
			local14 = local12 % 4 == 0;
		} else if (local12 % 4 != 0) {
			local14 = false;
		} else if (local12 % 100 != 0) {
			local14 = true;
		} else if (local12 % 400 != 0) {
			local14 = false;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local14 ? 1 : 0;
	}
}
