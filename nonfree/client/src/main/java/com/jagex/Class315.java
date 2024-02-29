package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public class Class315 {

	@OriginalMember(owner = "client!ia", name = "bt", descriptor = "Lclient!aar;")
	static Class17 aClass17_11;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
	public int anInt4066;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
	public int anInt4067;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public int anInt4068;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "(CI)C", line = 95)
	static char method27370(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!ia", name = "xc", descriptor = "(Lclient!yf;I)V", line = 8862)
	static final void method27371(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 2 && local12 < client.anInt3529 * -1979292205) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass162Array1[local12].anInt3260 * -721928209;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "ack", descriptor = "(Lclient!yf;I)V", line = 9582)
	static final void method27372(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 > local23 ? local13 : local23;
	}

	@OriginalMember(owner = "client!ia", name = "ayg", descriptor = "(Lclient!yf;I)V", line = 13629)
	static final void method27373(@OriginalArg(0) Class665 arg0) {
		Class333.method27660(Class136_Sub1.anInt1700 * 895091827);
	}
}
