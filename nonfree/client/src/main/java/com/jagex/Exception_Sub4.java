package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajn")
public class Exception_Sub4 extends Exception {

	@OriginalMember(owner = "client!ajn", name = "<init>", descriptor = "()V", line = 4)
	Exception_Sub4() {
	}

	@OriginalMember(owner = "client!ajn", name = "xk", descriptor = "(Lclient!vs;I)V", line = 8313)
	static final void method14576(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 < client.anInt3042 * -1645830611) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = client.aClass313Array1[local12].aString201;
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		}
	}
}
