package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public class Class235 {

	@OriginalMember(owner = "client!ev", name = "oz", descriptor = "I")
	public static int anInt3777;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "Lclient!ev;")
	public static final Class235 aClass235_3 = new Class235();

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Lclient!ev;")
	static final Class235 aClass235_1 = new Class235();

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "Lclient!ev;")
	static final Class235 aClass235_5 = new Class235();

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "Lclient!ev;")
	static final Class235 aClass235_4 = new Class235();

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "Lclient!ev;")
	public static final Class235 aClass235_2 = new Class235();

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V", line = 10)
	Class235() {
	}

	@OriginalMember(owner = "client!ev", name = "adr", descriptor = "(Lclient!yf;I)V", line = 9822)
	static final void method25895(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		@Pc(38) int local38 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local14.indexOf(local25, local38);
	}

	@OriginalMember(owner = "client!ev", name = "avz", descriptor = "(Lclient!yf;B)V", line = 13176)
	static final void method25896(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2.method15923() && Class284.aClass86_9.method20055() ? 1 : 0;
	}
}
