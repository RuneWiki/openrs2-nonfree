package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uy")
public class Class587 implements Interface75, Interface65 {

	@OriginalMember(owner = "client!uy", name = "p", descriptor = "Lclient!uy;")
	public static final Class587 aClass587_2 = new Class587(0, "", new Class498[] { Class498.aClass498_113, Class498.aClass498_158 });

	@OriginalMember(owner = "client!uy", name = "c", descriptor = "Lclient!uy;")
	public static final Class587 aClass587_1 = new Class587(1, "", new Class498[] { Class498.aClass498_113, Class498.aClass498_113 });

	@OriginalMember(owner = "client!uy", name = "v", descriptor = "Lclient!uy;")
	public static final Class587 aClass587_4 = new Class587(2, "", new Class498[] { Class498.aClass498_158, Class498.aClass498_158 });

	@OriginalMember(owner = "client!uy", name = "l", descriptor = "Lclient!uy;")
	static final Class587 aClass587_3 = new Class587(3, "", new Class498[] { Class498.aClass498_113, Class498.aClass498_113, Class498.aClass498_158 });

	@OriginalMember(owner = "client!uy", name = "y", descriptor = "I")
	final int anInt5454;

	@OriginalMember(owner = "client!uy", name = "w", descriptor = "[Lclient!qu;")
	final Class498[] aClass498Array2;

	@OriginalMember(owner = "client!uy", name = "<init>", descriptor = "(ILjava/lang/String;[Lclient!qu;)V", line = 15)
	Class587(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class498[] arg2) {
		this.anInt5454 = arg0 * 1915749;
		this.aClass498Array2 = arg2;
		@Pc(12) Class498[] local12 = this.aClass498Array2;
		@Pc(14) int local14 = 0;
		while (local14 < local12.length) {
			@Pc(22) Class498 local22 = local12[local14];
			switch(local22.aClass489_7.anInt5048 * 973874463) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				default:
					local14++;
			}
		}
	}

	@OriginalMember(owner = "client!uy", name = "c", descriptor = "()I", line = 39)
	@Override
	public int method36479() {
		return this.anInt5454 * -823493011;
	}

	@OriginalMember(owner = "client!uy", name = "y", descriptor = "()I", line = 39)
	@Override
	public int method36477() {
		return this.anInt5454 * -823493011;
	}

	@OriginalMember(owner = "client!uy", name = "l", descriptor = "()I", line = 39)
	@Override
	public int method36478() {
		return this.anInt5454 * -823493011;
	}

	@OriginalMember(owner = "client!uy", name = "w", descriptor = "(II)V", line = 94)
	public static void method31737(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Class622.anInt5637 = arg0 * -256866481;
		OutputStream_Sub1.aClass626Array1 = new Class626[Class214.anIntArray351[Class622.anInt5637 * -1429983313] + 1];
		Class622.anInt5638 = 0;
		Class622.anInt5632 = 0;
	}

	@OriginalMember(owner = "client!uy", name = "r", descriptor = "(Ljava/lang/String;ZI)V", line = 198)
	public static void method31738(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (9 == client.anInt3390 * -1850530127 && (!Class231.method25828() && !Class323.method27471())) {
			Class589.aString235 = arg0;
			Class589.aBoolean813 = arg1;
			Class668.method33179(7);
		}
	}

	@OriginalMember(owner = "client!uy", name = "jr", descriptor = "(IIIII)V", line = 6202)
	static final void method31739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = client.anInt3420 * -679255007;
		@Pc(7) int local7 = client.anInt3451 * -416274775;
		@Pc(20) Class83 local20;
		if (client.anInt3500 * -1370432497 == 1) {
			local20 = Class58.aClass83Array2[client.anInt3461 * 2143149601 / 100];
			local20.method18123(local3 - 8, local7 - 8);
		}
		if (client.anInt3500 * -1370432497 == 2) {
			local20 = Class58.aClass83Array2[client.anInt3461 * 2143149601 / 100 + 4];
			local20.method18123(local3 - 8, local7 - 8);
		}
	}

	@OriginalMember(owner = "client!uy", name = "mp", descriptor = "(Lclient!yf;I)V", line = 6884)
	static final void method31740(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class298.method27065(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!uy", name = "ajr", descriptor = "(Lclient!yf;I)V", line = 11144)
	static final void method31741(@OriginalArg(0) Class665 arg0) {
		if (Class706.aBoolean868 && Class184.aFrame1 != null) {
			Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
		}
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(45) boolean local45 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		@Pc(55) String local55 = Class313.method27315() + local27;
		Class474.method29663(local55, local45, client.aBoolean591);
	}
}
