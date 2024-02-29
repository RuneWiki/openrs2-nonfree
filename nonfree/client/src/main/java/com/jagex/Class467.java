package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public class Class467 {

	@OriginalMember(owner = "client!pl", name = "bx", descriptor = "Ljava/lang/String;")
	public static String aString216;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "Lclient!pl;")
	public static final Class467 aClass467_1 = new Class467(1);

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!pl;")
	static final Class467 aClass467_2 = new Class467(0);

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
	final int anInt4982;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V", line = 9)
	Class467(@OriginalArg(0) int arg0) {
		this.anInt4982 = arg0 * -330993749;
	}

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "(Lclient!yf;I)V", line = 194)
	static void method29563(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(18) boolean local18 = arg0.anIntArray536[arg0.anInt5784 * 2088438307] != 0;
		@Pc(33) boolean local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] != 0;
		Class96_Sub7.method7180(local18, local33);
	}

	@OriginalMember(owner = "client!pl", name = "aeh", descriptor = "(Lclient!yf;I)V", line = 9984)
	static final void method29564(@OriginalArg(0) Class665 arg0) {
		Class368.anInt4556 = 0;
	}
}
