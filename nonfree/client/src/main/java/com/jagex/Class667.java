package com.jagex;

import java.awt.Container;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.util.Locale;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yi")
public class Class667 implements Interface75 {

	@OriginalMember(owner = "client!yi", name = "x", descriptor = "I")
	public static final int anInt5788 = 7;

	@OriginalMember(owner = "client!yi", name = "p", descriptor = "Lclient!yi;")
	public static final Class667 aClass667_6 = new Class667("EN", "en", "English", Class661.aClass661_5, 0, "GB");

	@OriginalMember(owner = "client!yi", name = "c", descriptor = "Lclient!yi;")
	public static final Class667 aClass667_10 = new Class667("DE", "de", "German", Class661.aClass661_5, 1, "DE");

	@OriginalMember(owner = "client!yi", name = "v", descriptor = "Lclient!yi;")
	public static final Class667 aClass667_11 = new Class667("FR", "fr", "French", Class661.aClass661_5, 2, "FR");

	@OriginalMember(owner = "client!yi", name = "l", descriptor = "Lclient!yi;")
	public static final Class667 aClass667_5 = new Class667("PT", "pt", "Portuguese", Class661.aClass661_5, 3, "BR");

	@OriginalMember(owner = "client!yi", name = "y", descriptor = "Lclient!yi;")
	static final Class667 aClass667_7 = new Class667("NL", "nl", "Dutch", Class661.aClass661_13, 4, "NL");

	@OriginalMember(owner = "client!yi", name = "w", descriptor = "Lclient!yi;")
	public static final Class667 aClass667_8 = new Class667("ES", "es", "Spanish", Class661.aClass661_13, 5, "ES");

	@OriginalMember(owner = "client!yi", name = "t", descriptor = "Lclient!yi;")
	public static final Class667 aClass667_9 = new Class667("ES_MX", "es-mx", "Spanish (Latin American)", Class661.aClass661_5, 6, "MX");

	@OriginalMember(owner = "client!yi", name = "g", descriptor = "[Lclient!yi;")
	static final Class667[] aClass667Array1;

	@OriginalMember(owner = "client!yi", name = "q", descriptor = "Ljava/lang/String;")
	final String aString244;

	@OriginalMember(owner = "client!yi", name = "d", descriptor = "Ljava/lang/String;")
	final String aString243;

	@OriginalMember(owner = "client!yi", name = "s", descriptor = "I")
	public final int anInt5789;

	@OriginalMember(owner = "client!yi", name = "r", descriptor = "Ljava/util/Locale;")
	final Locale aLocale1;

	static {
		@Pc(72) Class667[] local72 = method33145();
		aClass667Array1 = new Class667[local72.length];
		@Pc(78) Class667[] local78 = local72;
		for (@Pc(80) int local80 = 0; local80 < local78.length; local80++) {
			@Pc(88) Class667 local88 = local78[local80];
			if (aClass667Array1[local88.anInt5789 * -473969159] != null) {
				throw new IllegalStateException();
			}
			aClass667Array1[local88.anInt5789 * -473969159] = local88;
		}
	}

	@OriginalMember(owner = "client!yi", name = "p", descriptor = "(B)[Lclient!yi;", line = 42)
	public static Class667[] method33145() {
		return new Class667[] { aClass667_10, aClass667_9, aClass667_11, aClass667_6, aClass667_8, aClass667_7, aClass667_5 };
	}

	@OriginalMember(owner = "client!yi", name = "q", descriptor = "()[Lclient!yi;", line = 42)
	public static Class667[] method33146() {
		return new Class667[] { aClass667_10, aClass667_9, aClass667_11, aClass667_6, aClass667_8, aClass667_7, aClass667_5 };
	}

	@OriginalMember(owner = "client!yi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!yb;ILjava/lang/String;)V", line = 45)
	Class667(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class661 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		this.aString244 = arg0;
		this.aString243 = arg1;
		this.anInt5789 = arg4 * 1793156169;
		if (arg5 == null) {
			this.aLocale1 = new Locale(arg1.substring(0, 2));
		} else {
			this.aLocale1 = new Locale(arg1.substring(0, 2), arg5);
		}
	}

	@OriginalMember(owner = "client!yi", name = "v", descriptor = "(B)Ljava/lang/String;", line = 58)
	String method33147() {
		return this.aString243;
	}

	@OriginalMember(owner = "client!yi", name = "d", descriptor = "()Ljava/lang/String;", line = 58)
	String method33148() {
		return this.aString243;
	}

	@OriginalMember(owner = "client!yi", name = "x", descriptor = "()Ljava/lang/String;", line = 58)
	String method33149() {
		return this.aString243;
	}

	@OriginalMember(owner = "client!yi", name = "c", descriptor = "(B)V", line = 60)
	public static void method33150() {
		@Pc(1) Class28 local1 = null;
		try {
			local1 = Class145.method15079("", client.aClass670_4.aString245, true);
			@Pc(12) Class77_Sub39 local12 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local1.method475(local12.aByteArray53, 0, local12.anInt3089 * 31645619);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method476();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!yi", name = "c", descriptor = "()I", line = 62)
	@Override
	public int method36479() {
		return this.anInt5789 * -473969159;
	}

	@OriginalMember(owner = "client!yi", name = "y", descriptor = "()I", line = 62)
	@Override
	public int method36477() {
		return this.anInt5789 * -473969159;
	}

	@OriginalMember(owner = "client!yi", name = "l", descriptor = "()I", line = 62)
	@Override
	public int method36478() {
		return this.anInt5789 * -473969159;
	}

	@OriginalMember(owner = "client!yi", name = "w", descriptor = "(B)Ljava/util/Locale;", line = 66)
	public Locale method33151() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!yi", name = "r", descriptor = "()Ljava/util/Locale;", line = 66)
	public Locale method33152() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!yi", name = "s", descriptor = "()Ljava/util/Locale;", line = 66)
	public Locale method33153() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!yi", name = "t", descriptor = "(IB)Lclient!yi;", line = 70)
	public static Class667 method33154(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass667Array1.length ? aClass667Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!yi", name = "g", descriptor = "(I)Lclient!yi;", line = 70)
	public static Class667 method33155(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass667Array1.length ? aClass667Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!yi", name = "z", descriptor = "(I)Lclient!yi;", line = 70)
	public static Class667 method33156(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass667Array1.length ? aClass667Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!yi", name = "j", descriptor = "(I)Lclient!yi;", line = 70)
	public static Class667 method33157(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass667Array1.length ? aClass667Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!yi", name = "toString", descriptor = "()Ljava/lang/String;", line = 75)
	@Override
	public String toString() {
		return this.method33147().toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!yi", name = "rs", descriptor = "()Ljava/lang/String;", line = 75)
	public String method33158() {
		return this.method33147().toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!yi", name = "ro", descriptor = "()Ljava/lang/String;", line = 75)
	public String method33159() {
		return this.method33147().toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!yi", name = "y", descriptor = "([BI)Lclient!cy;", line = 111)
	static Class83 method33160(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(10) Image local10 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(13) Container local13 = Class94.method7650();
				@Pc(18) MediaTracker local18 = new MediaTracker(local13);
				local18.addImage(local10, 0);
				local18.waitForAll();
				@Pc(28) int local28 = local10.getWidth(local13);
				@Pc(32) int local32 = local10.getHeight(local13);
				if (!local18.isErrorAny() && local28 >= 0 && local32 >= 0) {
					@Pc(49) int[] local49 = new int[local32 * local28];
					@Pc(61) PixelGrabber local61 = new PixelGrabber(local10, 0, 0, local28, local32, local49, 0, local28);
					local61.grabPixels();
					return Class284.aClass86_9.method20010(local49, 0, local28, local28, local32);
				}
				throw new RuntimeException("");
			} catch (@Pc(74) InterruptedException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!yi", name = "ag", descriptor = "(Lclient!yf;I)V", line = 228)
	static void method33161(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		if (Class677.aBoolean859) {
			Class350.method27881(arg0.anIntArray536[arg0.anInt5784 * 2088438307] != 0);
			Class282.method26694(arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] != 0);
			Class205.method25564(arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2] != 0);
		}
	}

	@OriginalMember(owner = "client!yi", name = "aq", descriptor = "(IIIII)V", line = 529)
	public static void method33162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class574.aLinkedList6.addLast(new Class585(arg0, arg1, arg2 - arg0, arg3 - arg1));
	}

	@OriginalMember(owner = "client!yi", name = "yf", descriptor = "(Lclient!yf;I)V", line = 8919)
	static final void method33163(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		Class392.method28387(local14, local25);
	}

	@OriginalMember(owner = "client!yi", name = "aey", descriptor = "(Lclient!yf;I)V", line = 9956)
	static final void method33164(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class67 local29 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local23);
		if (local29.method968()) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local13)).method383(local23, local29.aString13);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local13)).method379(local23, local29.anInt198 * 263946597);
		}
	}

	@OriginalMember(owner = "client!yi", name = "la", descriptor = "(I[II)V", line = 11803)
	static final void method33165(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (!Class211.method25607(arg0, arg1)) {
			return;
		}
		@Pc(10) Class277[] local10 = Class35_Sub11.aClass273Array1[arg0].aClass277Array2;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) Class277 local20 = local10[local12];
			if (local20 != null && local20.aClass151_6 != null) {
				local20.aClass151_6.method23457();
			}
		}
	}

	@OriginalMember(owner = "client!yi", name = "aqe", descriptor = "(Lclient!yf;I)V", line = 12419)
	static final void method33166(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1.method15764();
	}
}
