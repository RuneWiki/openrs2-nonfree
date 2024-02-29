package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public class Class307 {

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Lclient!io;")
	public static Class327 aClass327_1;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "Ljava/lang/String;")
	public String aString195;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "[Lclient!hp;")
	public Class306[] aClass306Array1;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Ljava/lang/String;")
	public String aString196;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "[Lclient!hp;")
	public Class306[] aClass306Array2;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "Ljava/lang/String;")
	public String aString197;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "(Ljava/lang/String;I)V", line = 60)
	public static void method27251(@OriginalArg(0) String arg0) {
		if (client.anInt3390 * -1850530127 != 18) {
			return;
		}
		@Pc(11) Class77_Sub20 local11 = Class365.method28132(Class414.aClass414_4, client.aClass82_1.aClass16_1);
		local11.aClass77_Sub39_Sub1_2.method22408(0);
		@Pc(22) int local22 = local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local11.aClass77_Sub39_Sub1_2.method22440(arg0);
		local11.aClass77_Sub39_Sub1_2.anInt3089 += -1122347939;
		local11.aClass77_Sub39_Sub1_2.method22567(Class314.anIntArray432, local22, local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619);
		local11.aClass77_Sub39_Sub1_2.method22462(local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local22);
		client.aClass82_1.method2004(local11);
		Class293.aClass698_1 = Class698.aClass698_3;
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V", line = 99)
	Class307() {
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(Lclient!hc;)V", line = 102)
	void method27252(@OriginalArg(0) Class294 arg0) {
		this.aString195 = arg0.method27025();
		this.aString197 = arg0.method27025();
		this.aString196 = arg0.method27025();
		@Pc(18) int local18 = arg0.method27023();
		@Pc(22) int local22 = arg0.method27023();
		this.aClass306Array2 = local18 == 0 ? null : new Class306[local18];
		this.aClass306Array1 = local22 == 0 ? null : new Class306[local22];
		@Pc(41) int local41;
		for (local41 = 0; local41 < local18; local41++) {
			this.aClass306Array2[local41] = new Class306();
			this.aClass306Array2[local41].method27245(arg0);
		}
		for (local41 = 0; local41 < local22; local41++) {
			this.aClass306Array1[local41] = new Class306();
			this.aClass306Array1[local41].method27245(arg0);
		}
	}

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "(Lclient!hc;I)V", line = 102)
	void method27253(@OriginalArg(0) Class294 arg0) {
		this.aString195 = arg0.method27025();
		this.aString197 = arg0.method27025();
		this.aString196 = arg0.method27025();
		@Pc(18) int local18 = arg0.method27023();
		@Pc(22) int local22 = arg0.method27023();
		this.aClass306Array2 = local18 == 0 ? null : new Class306[local18];
		this.aClass306Array1 = local22 == 0 ? null : new Class306[local22];
		@Pc(41) int local41;
		for (local41 = 0; local41 < local18; local41++) {
			this.aClass306Array2[local41] = new Class306();
			this.aClass306Array2[local41].method27245(arg0);
		}
		for (local41 = 0; local41 < local22; local41++) {
			this.aClass306Array1[local41] = new Class306();
			this.aClass306Array1[local41].method27245(arg0);
		}
	}

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "(IS)V", line = 115)
	public static void method27254(@OriginalArg(0) int arg0) {
		if (client.anInt3390 * -1850530127 == 18) {
			@Pc(11) Class77_Sub20 local11 = Class365.method28132(Class414.aClass414_26, client.aClass82_1.aClass16_1);
			local11.aClass77_Sub39_Sub1_2.method22403(arg0);
			client.aClass82_1.method2004(local11);
		}
	}

	@OriginalMember(owner = "client!hq", name = "fi", descriptor = "(ILjava/lang/String;ZB)V", line = 1995)
	static void method27255(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		Class603.method32059();
		Class331.method27604();
		Class295.method27034();
		Class75.method1148(arg0, arg1, arg2);
		Class367.aClass415_1.method28627();
		Class367.aClass415_1.method28624(client.anInterface51_1);
		Class367.aClass415_1.method28648();
		Class55.method830(Class284.aClass86_9);
		Class600.method32037(Class284.aClass86_9, Class470.aClass478_125);
		Class296.method27050();
		Class430.method28815();
		Class632.method32649();
		if (client.anInt3390 * -1850530127 == 15) {
			Class668.method33179(10);
		} else if (client.anInt3390 * -1850530127 == 9) {
			Class668.method33179(17);
		} else if (client.anInt3390 * -1850530127 == 7) {
			Class668.method33179(6);
		} else if (client.anInt3390 * -1850530127 == 16) {
			Class668.method33179(3);
		} else if (client.anInt3390 * -1850530127 == 11 || client.anInt3390 * -1850530127 == 4) {
			Class555.method31075();
		} else if (client.anInt3390 * -1850530127 == 18) {
			Class668.method33179(0);
		} else if (client.anInt3390 * -1850530127 == 3) {
			Class105.method9579(false);
		}
	}

	@OriginalMember(owner = "client!hq", name = "pn", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7335)
	static final void method27256(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray15 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!hq", name = "arn", descriptor = "(Lclient!yf;B)V", line = 12471)
	static final void method27257(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean595 ? 1 : 0;
	}
}
