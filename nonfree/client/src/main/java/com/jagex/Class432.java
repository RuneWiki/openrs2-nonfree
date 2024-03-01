package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public class Class432 {

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static final int anInt4803 = 32768;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static final int anInt4804 = 15;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static final int anInt4805 = 15;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 8)
	Class432() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "([SILclient!jp;II)I", line = 35)
	public static int method28788(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class365 arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = arg2.method27905(arg0, local1 + arg1);
			local1 <<= 0x1;
			local1 += local16;
			local3 |= local16 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!nc", name = "kj", descriptor = "([Lclient!hf;II)V", line = 11847)
	static final void method28789(@OriginalArg(0) Class312[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class312 local9 = arg0[local1];
			if (local9 != null && local9.anInt3985 * 897022795 == arg1 && !client.method24971(local9)) {
				if (local9.anInt3971 * -158526639 == 0) {
					method28789(arg0, local9.anInt3953 * -1549590237);
					if (local9.aClass312Array1 != null) {
						method28789(local9.aClass312Array1, local9.anInt3953 * -1549590237);
					}
					@Pc(57) Class93_Sub40 local57 = (Class93_Sub40) client.aClass16_22.method215((long) (local9.anInt3953 * -1549590237));
					if (local57 != null) {
						Class19.method23634(local57.anInt3172 * 1220811495);
					}
				}
				if (local9.anInt3971 * -158526639 == 6 && local9.anInt4023 * -1088634495 != -1) {
					if (local9.aClass19_6 == null) {
						local9.aClass19_6 = new Class19_Sub2();
						local9.aClass19_6.method23568(local9.anInt4023 * -1088634495);
					}
					if (local9.aClass19_6.method23573(client.anInt3480 * 1820654295) && local9.aClass19_6.method23581()) {
						local9.aClass19_6.method23570();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "avd", descriptor = "(Lclient!yf;I)V", line = 13509)
	static final void method28790(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!nc", name = "avc", descriptor = "(Lclient!yf;I)V", line = 13553)
	static final void method28787(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aShort149;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aShort154;
	}
}
