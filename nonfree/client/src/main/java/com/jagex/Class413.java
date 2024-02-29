package com.jagex;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public class Class413 {

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!na;")
	public static final Class413 aClass413_2 = new Class413(3);

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!na;")
	public static final Class413 aClass413_1 = new Class413(9);

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!na;")
	public static final Class413 aClass413_3 = new Class413(1);

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!na;")
	public static final Class413 aClass413_4 = new Class413(5);

	@OriginalMember(owner = "client!na", name = "y", descriptor = "Lclient!na;")
	public static final Class413 aClass413_5 = new Class413(13);

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Lclient!na;")
	public static final Class413 aClass413_6 = new Class413(2);

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!na;")
	public static final Class413 aClass413_7 = new Class413(4);

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!na;")
	public static final Class413 aClass413_10 = new Class413(7);

	@OriginalMember(owner = "client!na", name = "x", descriptor = "Lclient!na;")
	public static final Class413 aClass413_9 = new Class413(8);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!na;")
	public static final Class413 aClass413_11 = new Class413(6);

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Lclient!na;")
	public static final Class413 aClass413_8 = new Class413(12);

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!na;")
	static final Class413 aClass413_12 = new Class413(11);

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!na;")
	static final Class413 aClass413_13 = new Class413(10);

	@OriginalMember(owner = "client!na", name = "z", descriptor = "I")
	final int anInt4716;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V", line = 32)
	public static void method28592(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Class460.method29520(arg0, 3);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (Class524.aString226.startsWith("win") && !arg3) {
			Class460.method29520(arg0, 0);
			return;
		}
		if (Class524.aString226.startsWith("mac")) {
			Class244.method26113(arg0, 1, arg2);
			return;
		}
		Class460.method29520(arg0, 2);
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V", line = 36)
	Class413(@OriginalArg(0) int arg0) {
		this.anInt4716 = arg0 * 602898393;
	}

	@OriginalMember(owner = "client!na", name = "p", descriptor = "(I)Ljava/lang/String;", line = 41)
	public String method28593() {
		return "_" + this.anInt4716 * 463409257;
	}

	@OriginalMember(owner = "client!na", name = "w", descriptor = "()Ljava/lang/String;", line = 41)
	public String method28594() {
		return "_" + this.anInt4716 * 463409257;
	}

	@OriginalMember(owner = "client!na", name = "q", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;", line = 45)
	public Object method28595(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class31.method522(Class331.anApplet2, this.method28593(), arg0);
	}

	@OriginalMember(owner = "client!na", name = "t", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;", line = 45)
	public Object method28596(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class31.method522(Class331.anApplet2, this.method28593(), arg0);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "([Ljava/lang/Object;I)Ljava/lang/Object;", line = 45)
	public Object method28597(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class31.method522(Class331.anApplet2, this.method28593(), arg0);
	}

	@OriginalMember(owner = "client!na", name = "x", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;", line = 45)
	public Object method28598(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class31.method522(Class331.anApplet2, this.method28593(), arg0);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()Ljava/lang/Object;", line = 49)
	public Object method28599() throws Throwable {
		return Class31.method519(Class331.anApplet2, this.method28593());
	}

	@OriginalMember(owner = "client!na", name = "v", descriptor = "(B)Ljava/lang/Object;", line = 49)
	public Object method28600() throws Throwable {
		return Class31.method519(Class331.anApplet2, this.method28593());
	}

	@OriginalMember(owner = "client!na", name = "s", descriptor = "()Ljava/lang/Object;", line = 49)
	public Object method28601() throws Throwable {
		return Class31.method519(Class331.anApplet2, this.method28593());
	}

	@OriginalMember(owner = "client!na", name = "r", descriptor = "()Ljava/lang/Object;", line = 49)
	public Object method28602() throws Throwable {
		return Class31.method519(Class331.anApplet2, this.method28593());
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "()Ljava/lang/Object;", line = 49)
	public Object method28603() throws Throwable {
		return Class31.method519(Class331.anApplet2, this.method28593());
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "([Ljava/lang/Object;B)V", line = 54)
	public void method28604(@OriginalArg(0) Object[] arg0) {
		try {
			this.method28597(arg0);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!na", name = "z", descriptor = "([Ljava/lang/Object;)V", line = 54)
	public void method28605(@OriginalArg(0) Object[] arg0) {
		try {
			this.method28597(arg0);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!na", name = "r", descriptor = "(Lclient!yf;I)V", line = 60)
	static void method28606(@OriginalArg(0) Class665 arg0) {
		@Pc(16) Class303 local16 = (Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anIntArrayArray50 == null ? 0 : local16.anIntArrayArray50.length;
	}

	@OriginalMember(owner = "client!na", name = "y", descriptor = "(I)V", line = 61)
	public void method28607() {
		try {
			this.method28600();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "()V", line = 61)
	public void method28608() {
		try {
			this.method28600();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!na", name = "w", descriptor = "(Lclient!ajc;ZI)V", line = 139)
	static final void method28609(@OriginalArg(0) Class77_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean324) {
			if (arg0.anInt1450 * 311151295 < 0 || Class143_Sub30.method15972(client.aClass517_1.method30444(), arg0.anInt1450 * 311151295, arg0.anInt1455 * 665019215)) {
				if (arg1) {
					Class102_Sub1.method7920(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, null);
				} else {
					Class566.method31368(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.anInt1450 * 311151295, arg0.anInt1451 * 352976243, arg0.anInt1455 * 665019215, -1, 0);
				}
				arg0.method24063();
			}
		} else if (arg0.aBoolean323 && arg0.anInt1452 * -1522052283 >= 1 && arg0.anInt1454 * -1246362377 >= 1 && arg0.anInt1452 * -1522052283 <= client.aClass517_1.method30411() - 2 && arg0.anInt1454 * -1246362377 <= client.aClass517_1.method30417() - 2 && (arg0.anInt1453 * -1375582077 < 0 || Class143_Sub30.method15972(client.aClass517_1.method30444(), arg0.anInt1453 * -1375582077, arg0.anInt1458 * -1945323711))) {
			if (arg1) {
				Class102_Sub1.method7920(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.aClass594_1);
			} else {
				Class566.method31368(arg0.anInt1456 * -511427777, arg0.anInt1459 * -1831835741, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, arg0.anInt1453 * -1375582077, arg0.anInt1457 * 220446523, arg0.anInt1458 * -1945323711, -1, 0);
			}
			arg0.aBoolean323 = false;
			if (!arg1 && arg0.anInt1450 * 311151295 == arg0.anInt1453 * -1375582077 && arg0.anInt1450 * 311151295 == -1) {
				arg0.method24063();
			} else if (!arg1 && arg0.anInt1453 * -1375582077 == arg0.anInt1450 * 311151295 && arg0.anInt1457 * 220446523 == arg0.anInt1451 * 352976243 && arg0.anInt1458 * -1945323711 == arg0.anInt1455 * 665019215) {
				arg0.method24063();
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Ljava/lang/CharSequence;I)I", line = 140)
	public static int method28610(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class544.method30950(arg0.charAt(local6));
		}
		return local4;
	}

	@OriginalMember(owner = "client!na", name = "hz", descriptor = "(Lclient!yf;S)V", line = 5817)
	static final void method28611(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class77_Sub19.method13488(local11, local14, true, 0, arg0);
	}

	@OriginalMember(owner = "client!na", name = "wn", descriptor = "(Lclient!yf;B)V", line = 8538)
	static final void method28612(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class434.method28882(local13, local23, false, false);
	}

	@OriginalMember(owner = "client!na", name = "aaq", descriptor = "(Lclient!yf;I)V", line = 9243)
	static final void method28613(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.aByte152;
	}

	@OriginalMember(owner = "client!na", name = "ati", descriptor = "(Lclient!yf;I)V", line = 12804)
	static final void method28614(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class35_Sub11.aClass273Array1[local12] == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub11.aClass273Array1[local12].aClass277Array2.length;
		}
	}

	@OriginalMember(owner = "client!na", name = "atp", descriptor = "(Lclient!yf;B)V", line = 12947)
	static final void method28615(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class674.anInt5801 * -1006492633;
	}
}
