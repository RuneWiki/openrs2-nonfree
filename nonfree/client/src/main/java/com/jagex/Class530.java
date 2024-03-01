package com.jagex;

import java.util.Locale;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public class Class530 implements Interface56 {

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
	public static final int anInt5307 = 7;

	@OriginalMember(owner = "client!vk", name = "jb", descriptor = "I")
	static int anInt5308;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "Lclient!vk;")
	public static final Class530 aClass530_9 = new Class530("EN", "en", "English", Class527.aClass527_10, 0, "GB");

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!vk;")
	public static final Class530 aClass530_8 = new Class530("DE", "de", "German", Class527.aClass527_10, 1, "DE");

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!vk;")
	public static final Class530 aClass530_3 = new Class530("FR", "fr", "French", Class527.aClass527_10, 2, "FR");

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "Lclient!vk;")
	public static final Class530 aClass530_4 = new Class530("PT", "pt", "Portuguese", Class527.aClass527_10, 3, "BR");

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Lclient!vk;")
	static final Class530 aClass530_5 = new Class530("NL", "nl", "Dutch", Class527.aClass527_11, 4, "NL");

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "Lclient!vk;")
	public static final Class530 aClass530_6 = new Class530("ES", "es", "Spanish", Class527.aClass527_11, 5, "ES");

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "Lclient!vk;")
	public static final Class530 aClass530_7 = new Class530("ES_MX", "es-mx", "Spanish (Latin American)", Class527.aClass527_11, 6, "MX");

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "[Lclient!vk;")
	static final Class530[] aClass530Array1;

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "Ljava/lang/String;")
	final String aString234;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/lang/String;")
	final String aString235;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public final int anInt5306;

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "Ljava/util/Locale;")
	final Locale aLocale1;

	static {
		@Pc(72) Class530[] local72 = method32466();
		aClass530Array1 = new Class530[local72.length];
		@Pc(78) Class530[] local78 = local72;
		for (@Pc(80) int local80 = 0; local80 < local78.length; local80++) {
			@Pc(88) Class530 local88 = local78[local80];
			if (aClass530Array1[local88.anInt5306 * 1515113627] != null) {
				throw new IllegalStateException();
			}
			aClass530Array1[local88.anInt5306 * 1515113627] = local88;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lclient!ks;", line = 27)
	public static Class287 method32482(@OriginalArg(0) int arg0) {
		@Pc(5) Class287 local5 = (Class287) Class287.aClass161_33.method23219((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = Class287.aClass359_53.method26713(0, arg0);
		local5 = new Class287();
		if (local15 != null) {
			local5.method25486(new Class3_Sub41(local15), arg0);
		}
		Class287.aClass161_33.method23222(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "(I)[Lclient!vk;", line = 42)
	public static Class530[] method32466() {
		return new Class530[] { aClass530_4, aClass530_7, aClass530_9, aClass530_3, aClass530_8, aClass530_6, aClass530_5 };
	}

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "()[Lclient!vk;", line = 42)
	public static Class530[] method32473() {
		return new Class530[] { aClass530_4, aClass530_7, aClass530_9, aClass530_3, aClass530_8, aClass530_6, aClass530_5 };
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "()[Lclient!vk;", line = 42)
	public static Class530[] method32474() {
		return new Class530[] { aClass530_4, aClass530_7, aClass530_9, aClass530_3, aClass530_8, aClass530_6, aClass530_5 };
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lclient!vh;ILjava/lang/String;)V", line = 45)
	Class530(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class527 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		this.aString234 = arg0;
		this.aString235 = arg1;
		this.anInt5306 = arg4 * 431372691;
		if (arg5 == null) {
			this.aLocale1 = new Locale(arg1.substring(0, 2));
		} else {
			this.aLocale1 = new Locale(arg1.substring(0, 2), arg5);
		}
	}

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)Ljava/lang/String;", line = 58)
	public String method32468() {
		return this.aString235;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "()Ljava/lang/String;", line = 58)
	public String method32475() {
		return this.aString235;
	}

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "()I", line = 62)
	@Override
	public int method33767() {
		return this.anInt5306 * 1515113627;
	}

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "()I", line = 62)
	@Override
	public int method33766() {
		return this.anInt5306 * 1515113627;
	}

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "()I", line = 62)
	@Override
	public int method33764() {
		return this.anInt5306 * 1515113627;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I", line = 62)
	@Override
	public int method33765() {
		return this.anInt5306 * 1515113627;
	}

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "(I)Ljava/util/Locale;", line = 66)
	public Locale method32469() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "()Ljava/util/Locale;", line = 66)
	public Locale method32472() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "()Ljava/util/Locale;", line = 66)
	public Locale method32476() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "()Ljava/util/Locale;", line = 66)
	public Locale method32478() {
		return this.aLocale1;
	}

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "(II)Lclient!vk;", line = 70)
	public static Class530 method32470(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass530Array1.length ? aClass530Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)Lclient!vk;", line = 70)
	public static Class530 method32477(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < aClass530Array1.length ? aClass530Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!vk", name = "ou", descriptor = "()Ljava/lang/String;", line = 75)
	public String method32467() {
		return this.method32468().toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!vk", name = "toString", descriptor = "()Ljava/lang/String;", line = 75)
	@Override
	public String toString() {
		return this.method32468().toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!vk", name = "ox", descriptor = "()Ljava/lang/String;", line = 75)
	public String method32471() {
		return this.method32468().toLowerCase(Locale.ENGLISH);
	}

	@OriginalMember(owner = "client!vk", name = "be", descriptor = "(II)Z", line = 1926)
	static boolean method32480(@OriginalArg(0) int arg0) {
		return arg0 == 59 || arg0 == 2 || arg0 == 8 || arg0 == 17 || arg0 == 15 || arg0 == 16 || arg0 == 58;
	}

	@OriginalMember(owner = "client!vk", name = "ic", descriptor = "(Lclient!vs;B)V", line = 5683)
	static final void method32479(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class245.method24870(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!vk", name = "oz", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6746)
	static final void method32481(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray11 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!vk", name = "qe", descriptor = "(Lclient!vs;I)V", line = 7011)
	static final void method32483(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		if (local11.anInt3559 * 1976441867 == -1) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3563 * -1429853457;
		}
	}
}
