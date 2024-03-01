package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajs")
public final class Exception_Sub5 extends Exception {

	@OriginalMember(owner = "client!ajs", name = "<init>", descriptor = "(Ljava/lang/String;II)V", line = 5)
	Exception_Sub5(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super("");
	}

	@OriginalMember(owner = "client!ajs", name = "p", descriptor = "(B)[Lclient!wy;", line = 11)
	static Class566[] method14671() {
		return new Class566[] { Class566.aClass566_4, Class566.aClass566_2, Class566.aClass566_3 };
	}

	@OriginalMember(owner = "client!ajs", name = "r", descriptor = "(CI)Z", line = 190)
	public static boolean method14670(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ajs", name = "aqt", descriptor = "(Lclient!vs;I)V", line = 11798)
	static final void method14669(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class63_Sub1 local2 = Class381.method27301();
		if (local2 != null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2.anInt1518 * 107676547;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2.anInt1515 * -1021417267;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local2.aString51;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2.method13057();
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local2.method13053();
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2.anInt1512 * -191487467;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2.anInt1520 * -39887861;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local2.aString52;
			return;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
	}
}
