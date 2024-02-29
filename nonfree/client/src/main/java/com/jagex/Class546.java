package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sx")
public class Class546 {

	@OriginalMember(owner = "client!sx", name = "c", descriptor = "I")
	static final int anInt5216 = 4096;

	@OriginalMember(owner = "client!sx", name = "p", descriptor = "[B")
	static byte[] aByteArray92 = new byte[2048];

	@OriginalMember(owner = "client!sx", name = "v", descriptor = "[Lclient!sq;")
	Class540[] aClass540Array1;

	@OriginalMember(owner = "client!sx", name = "l", descriptor = "[Lclient!jx;")
	Class352[] aClass352Array5;

	static {
		@Pc(4) byte local4 = 22;
		@Pc(6) int local6 = 2;
		aByteArray92[0] = 0;
		aByteArray92[1] = 1;
		for (@Pc(16) int local16 = 2; local16 < local4; local16++) {
			@Pc(27) int local27 = 0x1 << (local16 >> 1) - 1;
			@Pc(29) int local29 = 0;
			while (local29 < local27) {
				aByteArray92[local6] = (byte) local16;
				local29++;
				local6++;
			}
		}
	}

	@OriginalMember(owner = "client!sx", name = "<init>", descriptor = "()V", line = 48)
	Class546() {
		Class305.method27239();
		this.aClass540Array1 = new Class540[4096];
		new Class347();
		this.aClass352Array5 = new Class352[4];
		new Class352(4);
		new Class128_Sub1(this);
		new Class128_Sub1(this);
		new Class527(this);
		@Pc(38) int local38;
		for (local38 = 0; local38 < 4096; local38++) {
			this.aClass540Array1[local38] = new Class540(this);
		}
		for (local38 = 0; local38 < 4; local38++) {
			this.aClass352Array5[local38] = new Class352(6);
		}
	}

	@OriginalMember(owner = "client!sx", name = "ie", descriptor = "(IIIIIII)V", line = 5586)
	static final void method30970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(4) Class131_Sub5 local4 = (Class131_Sub5) client.aClass703_7.method36536(); local4 != null; local4 = (Class131_Sub5) client.aClass703_7.method36537()) {
			if (client.anInt3414 >= local4.anInt1444 * 1004685289) {
				local4.method23056();
			} else {
				Class196.method25466(local4.anInt1443 * -1138498011, (local4.anInt1442 * 767377511 << 9) + 256, (local4.anInt1446 * 81079743 << 9) + 256, 0, local4.anInt1445 * -1833865366, false, false);
				Class260.aClass94_8.method7612(local4.aString46, (int) ((float) arg0 + client.aFloatArray96[0]), (int) ((float) arg1 + client.aFloatArray96[1]), local4.anInt1447 * 1294543369 | 0xFF000000, 0);
			}
		}
	}
}
