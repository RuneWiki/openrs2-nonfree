package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public class Class528 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	static final int anInt5304 = 4096;

	@OriginalMember(owner = "client!vi", name = "mq", descriptor = "[Lclient!xe;")
	static Class573[] aClass573Array1;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!xn;")
	static Class581 aClass581_39 = new Class581(4);

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!ve;")
	static final Class524 aClass524_1 = new Class524();

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 25)
	Class528() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIZ)V", line = 30)
	public static void method32431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (aClass581_39.method33217((long) arg0) != null) {
			return;
		}
		if (Class314.aClient1.aBoolean564) {
			@Pc(25) Class3_Sub44 local25 = new Class3_Sub44(arg0, new Class57_Sub1(4096, Class343.aClass359_63, arg0), arg1, arg2);
			local25.aClass57_Sub1_1.method12236(Class469.aClass530_2.method32468());
			aClass581_39.method33241(local25, (long) arg0);
		} else {
			Class149.method23128(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 41)
	public static void method32432(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			local5.aBoolean327 = !local5.aBoolean327;
			local5.aClass57_Sub1_1.method12238(local5.aBoolean327);
		}
	}

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "(I)[Lclient!qn;", line = 47)
	static Class412[] method32451() {
		return new Class412[] { Class412.aClass412_3, Class412.aClass412_2 };
	}

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "(I)V", line = 49)
	public static void method32433(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			local5.aClass57_Sub1_1.method12231();
			Class149.method23128(local5.anInt1497 * -352602287, local5.aBoolean328);
			local5.method33656();
		}
	}

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "(I)V", line = 49)
	public static void method32434(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			local5.aClass57_Sub1_1.method12231();
			Class149.method23128(local5.anInt1497 * -352602287, local5.aBoolean328);
			local5.method33656();
		}
	}

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "(I)V", line = 49)
	public static void method32435(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			local5.aClass57_Sub1_1.method12231();
			Class149.method23128(local5.anInt1497 * -352602287, local5.aBoolean328);
			local5.method33656();
		}
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V", line = 49)
	public static void method32436(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			local5.aClass57_Sub1_1.method12231();
			Class149.method23128(local5.anInt1497 * -352602287, local5.aBoolean328);
			local5.method33656();
		}
	}

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "(IZ)V", line = 58)
	static void method32437(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			@Pc(7) Class3_Sub23 local7 = Class269.method25284(Class311.aClass311_15, client.aClass82_2.aClass577_2);
			local7.aClass3_Sub41_Sub1_1.method20251(arg0);
			client.aClass82_2.method21601(local7);
		} else {
			Class291.method25543(Class634.aClass634_2, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)Ljava/lang/String;", line = 69)
	public static String method32438(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			@Pc(13) Class3_Sub18_Sub2 local13 = local5.aClass57_Sub1_1.method12226();
			if (local13 != null) {
				@Pc(21) double local21 = local5.aClass57_Sub1_1.method12237();
				if ((double) local13.method18826() <= local21 && (double) local13.method18815() >= local21) {
					return local13.method18811();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "(I)Ljava/lang/String;", line = 69)
	public static String method32447(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			@Pc(13) Class3_Sub18_Sub2 local13 = local5.aClass57_Sub1_1.method12226();
			if (local13 != null) {
				@Pc(21) double local21 = local5.aClass57_Sub1_1.method12237();
				if ((double) local13.method18826() <= local21 && (double) local13.method18815() >= local21) {
					return local13.method18811();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "(Lclient!de;I)Lclient!co;", line = 83)
	public static Class6 method32439(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg1);
		if (local5 != null) {
			@Pc(13) Class3_Sub18_Sub3 local13 = local5.aClass57_Sub1_1.method12234();
			local5.aBoolean330 = true;
			if (local13 != null) {
				aClass524_1.aClass21_12 = arg0;
				return (Class6) local13.method19393(aClass524_1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "(Lclient!de;I)Lclient!co;", line = 83)
	public static Class6 method32440(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) aClass581_39.method33217((long) arg1);
		if (local5 != null) {
			@Pc(13) Class3_Sub18_Sub3 local13 = local5.aClass57_Sub1_1.method12234();
			local5.aBoolean330 = true;
			if (local13 != null) {
				aClass524_1.aClass21_12 = arg0;
				return (Class6) local13.method19393(aClass524_1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "(I)I", line = 87)
	public static int method32450() {
		return Class482.anInt5158 * 1631733361;
	}

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "()V", line = 96)
	public static void method32441() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) aClass581_39.method33231()) {
			if (local4.aClass57_Sub1_1.method12235()) {
				Class10.method717(local4.anInt1497 * -352602287);
			} else {
				local4.aClass57_Sub1_1.method12279();
				try {
					local4.aClass57_Sub1_1.method12229();
				} catch (@Pc(29) Exception local29) {
					Class27_Sub1.method7214("" + local4.anInt1497 * -352602287, local29);
					Class10.method717(local4.anInt1497 * -352602287);
				}
				if (!local4.aBoolean329 && !local4.aBoolean327) {
					@Pc(60) Class3_Sub18_Sub4 local60 = local4.aClass57_Sub1_1.method12233();
					if (local60 != null) {
						@Pc(67) Class3_Sub35_Sub1 local67 = local60.method19508();
						if (local67 != null) {
							local67.method18842(local4.anInt1498 * 464952047);
							local4.aBoolean329 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "()V", line = 96)
	public static void method32442() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) aClass581_39.method33231()) {
			if (local4.aClass57_Sub1_1.method12235()) {
				Class10.method717(local4.anInt1497 * -352602287);
			} else {
				local4.aClass57_Sub1_1.method12279();
				try {
					local4.aClass57_Sub1_1.method12229();
				} catch (@Pc(29) Exception local29) {
					Class27_Sub1.method7214("" + local4.anInt1497 * -352602287, local29);
					Class10.method717(local4.anInt1497 * -352602287);
				}
				if (!local4.aBoolean329 && !local4.aBoolean327) {
					@Pc(60) Class3_Sub18_Sub4 local60 = local4.aClass57_Sub1_1.method12233();
					if (local60 != null) {
						@Pc(67) Class3_Sub35_Sub1 local67 = local60.method19508();
						if (local67 != null) {
							local67.method18842(local4.anInt1498 * 464952047);
							local4.aBoolean329 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IZIZI)V", line = 117)
	public static void method32449(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class467.method28738(0, Class570.aClass63_Sub1Array2.length - 1, arg0, arg1, arg2, arg3);
		Class570.anInt5385 = 0;
		Class570.aClass507_2 = null;
	}

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "()V", line = 124)
	public static void method32430() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) aClass581_39.method33231()) {
			if (local4.aBoolean330) {
				local4.aBoolean330 = false;
			} else {
				Class10.method717(local4.anInt1497 * -352602287);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "()V", line = 124)
	public static void method32443() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) aClass581_39.method33231()) {
			if (local4.aBoolean330) {
				local4.aBoolean330 = false;
			} else {
				Class10.method717(local4.anInt1497 * -352602287);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "()V", line = 124)
	public static void method32444() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) aClass581_39.method33231()) {
			if (local4.aBoolean330) {
				local4.aBoolean330 = false;
			} else {
				Class10.method717(local4.anInt1497 * -352602287);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "at", descriptor = "()V", line = 124)
	public static void method32445() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) aClass581_39.method33231()) {
			if (local4.aBoolean330) {
				local4.aBoolean330 = false;
			} else {
				Class10.method717(local4.anInt1497 * -352602287);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "()V", line = 124)
	public static void method32446() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) aClass581_39.method33231()) {
			if (local4.aBoolean330) {
				local4.aBoolean330 = false;
			} else {
				Class10.method717(local4.anInt1497 * -352602287);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "af", descriptor = "()V", line = 124)
	public static void method32448() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) aClass581_39.method33231()) {
			if (local4.aBoolean330) {
				local4.aBoolean330 = false;
			} else {
				Class10.method717(local4.anInt1497 * -352602287);
			}
		}
	}
}
