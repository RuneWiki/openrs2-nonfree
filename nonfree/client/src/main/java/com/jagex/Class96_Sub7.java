package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afg")
public class Class96_Sub7 extends Class96 {

	@OriginalMember(owner = "client!afg", name = "ts", descriptor = "I")
	public static int anInt829;

	@OriginalMember(owner = "client!afg", name = "c", descriptor = "I")
	final int anInt828;

	@OriginalMember(owner = "client!afg", name = "<init>", descriptor = "(Lclient!akv;)V", line = 9)
	Class96_Sub7(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt828 = arg0.method22483() * -985512421;
	}

	@OriginalMember(owner = "client!afg", name = "y", descriptor = "()V", line = 14)
	@Override
	public void method19912() {
		Class128_Sub1.aClass225Array1[this.anInt828 * -969202669].method25779();
	}

	@OriginalMember(owner = "client!afg", name = "c", descriptor = "(I)V", line = 14)
	@Override
	public void method19911() {
		Class128_Sub1.aClass225Array1[this.anInt828 * -969202669].method25779();
	}

	@OriginalMember(owner = "client!afg", name = "w", descriptor = "()V", line = 14)
	@Override
	public void method19913() {
		Class128_Sub1.aClass225Array1[this.anInt828 * -969202669].method25779();
	}

	@OriginalMember(owner = "client!afg", name = "d", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", line = 176)
	public static void method7179(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (arg0.length() > 320 || !Class539.method30909()) {
			return;
		}
		client.aClass82_1.method2014();
		Class331.method27603();
		Class589.aString234 = arg0;
		Class589.aString233 = arg1;
		Class589.aString235 = arg2;
		Class589.aBoolean813 = arg3;
		Class668.method33179(13);
	}

	@OriginalMember(owner = "client!afg", name = "ae", descriptor = "(ZZI)V", line = 514)
	public static void method7180(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		Class574.aBoolean806 = arg0;
		Class574.aBoolean809 = arg1;
	}

	@OriginalMember(owner = "client!afg", name = "ig", descriptor = "(Lclient!yf;S)V", line = 6018)
	static final void method7181(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class658.method33060(local16, local22, arg0);
	}
}
